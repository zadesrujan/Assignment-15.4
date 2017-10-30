package program;
//here we are created the package as program that organizes the set of interfaces and related classes.
public class Consumer {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
      	//void : returns to no value.
		//main : is special because it will start the program.

		// TODO Auto-generated method stub
		 producer.start(); //put the data of producer 
         consumer.start();//get the data of consumer

	}


static Processdata data =new Processdata(); 
//created object of the class 

static Thread producer = new Thread (new Runnable() {
	//here creating a producer thread
                     //here now we create an object which is runnable interface which is anonymous
	
	public void run() {          
		//created the run method to execute the thread
		for (int number =0;number<11;number++){ 
			//to execute the condition of put and get method data we are using for loop
			
			data.put(number);
			//put the data of variable
	
		}
		}
});
  static Thread consumer = new Thread(new Runnable (){
	  
	  public void run(){
		  for (int number =0;number<11;number++){
			
				data.get();
				//get the data of variable 
			
		  }
	  }
  }); 
            
}	  
 
package scala.test

object Upper {
  def main(args: Array[String]): Unit = {
	  args.map(_.toUpperCase()).foreach(printf("%s",_))
	  println("")
	}
}
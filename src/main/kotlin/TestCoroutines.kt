import kotlinx.coroutines.*
suspend fun main(){
    var GitHub = GitHub()
    println("Введите число:")
    var n = readln()!!.toByte()

    GlobalScope.launch{
        for (i in 0..n)
            GitHub.Hello()
        delay(5000L)
    }
    GitHub.Hello()
    println("empty")
    delay(10000L)
    }
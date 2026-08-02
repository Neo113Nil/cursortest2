package Ta;

/* loaded from: classes3.dex */
public abstract class u {
    public static void a(Throwable th2) {
        Ra.n.k(th2);
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}

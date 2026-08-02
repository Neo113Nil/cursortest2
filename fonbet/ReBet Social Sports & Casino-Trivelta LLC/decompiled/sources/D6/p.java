package D6;

/* loaded from: classes2.dex */
public abstract class p {
    public static RuntimeException a(Throwable th2) {
        c((Throwable) k.g(th2));
        throw new RuntimeException(th2);
    }

    public static void b(Throwable th2, Class cls) {
        if (th2 != null && cls.isInstance(th2)) {
            throw ((Throwable) cls.cast(th2));
        }
    }

    public static void c(Throwable th2) {
        b(th2, Error.class);
        b(th2, RuntimeException.class);
    }
}

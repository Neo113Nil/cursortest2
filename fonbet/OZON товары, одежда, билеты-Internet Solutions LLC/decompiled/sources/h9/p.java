package h9;

/* loaded from: classes9.dex */
public abstract class p extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected static final boolean f65118a;

    /* renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f65119b;

    static {
        f65118a = System.getProperty("surefire.test.class.path") != null;
        f65119b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}

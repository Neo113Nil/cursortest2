package eg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f9235a = new ThreadLocal();

    public static w0 a() {
        ThreadLocal threadLocal = f9235a;
        w0 w0Var = (w0) threadLocal.get();
        if (w0Var != null) {
            return w0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}

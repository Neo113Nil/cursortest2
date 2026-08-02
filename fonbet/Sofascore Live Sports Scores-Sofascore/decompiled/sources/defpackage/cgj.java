package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class cgj {
    public static final ThreadLocal a = new ThreadLocal();

    public static g26 a() {
        ThreadLocal threadLocal = a;
        g26 g26Var = (g26) threadLocal.get();
        if (g26Var != null) {
            return g26Var;
        }
        ny1 ny1Var = new ny1(Thread.currentThread());
        threadLocal.set(ny1Var);
        return ny1Var;
    }
}

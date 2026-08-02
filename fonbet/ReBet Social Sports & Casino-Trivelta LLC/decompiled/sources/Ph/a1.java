package Ph;

/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f9061a = new a1();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f9062b = Sh.Q.a(new Sh.G("ThreadLocalEventLoop"));

    public final AbstractC1464m0 a() {
        return (AbstractC1464m0) f9062b.get();
    }

    public final AbstractC1464m0 b() {
        ThreadLocal threadLocal = f9062b;
        AbstractC1464m0 abstractC1464m0 = (AbstractC1464m0) threadLocal.get();
        if (abstractC1464m0 != null) {
            return abstractC1464m0;
        }
        AbstractC1464m0 a10 = AbstractC1470p0.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void c() {
        f9062b.set(null);
    }

    public final void d(AbstractC1464m0 abstractC1464m0) {
        f9062b.set(abstractC1464m0);
    }
}

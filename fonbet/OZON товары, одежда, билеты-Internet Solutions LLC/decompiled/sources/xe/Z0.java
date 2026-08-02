package xe;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ThreadLocal<AbstractC10732k0> f105423a = new ThreadLocal<>();

    public static AbstractC10732k0 a() {
        return f105423a.get();
    }

    @NotNull
    public static AbstractC10732k0 b() {
        ThreadLocal<AbstractC10732k0> threadLocal = f105423a;
        AbstractC10732k0 abstractC10732k0 = threadLocal.get();
        if (abstractC10732k0 != null) {
            return abstractC10732k0;
        }
        C10725h c10725h = new C10725h(Thread.currentThread());
        threadLocal.set(c10725h);
        return c10725h;
    }

    public static void c() {
        f105423a.set(null);
    }

    public static void d(@NotNull S s11) {
        f105423a.set(s11);
    }
}

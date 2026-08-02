package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class gsg {
    static {
        Boolean.getBoolean("rx2.scheduler.use-nanotime");
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract fsg a();

    public k55 b(Runnable runnable) {
        return c(runnable);
    }

    public k55 c(Runnable runnable) {
        fsg a = a();
        esg esgVar = new esg(runnable, a);
        a.a(esgVar, TimeUnit.NANOSECONDS);
        return esgVar;
    }
}

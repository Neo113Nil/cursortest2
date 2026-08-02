package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jba extends gsg {
    public static final bag b;
    public static final bag c;
    public static final long d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    public static final iba e;
    public static final boolean f;
    public static final gba g;
    public final AtomicReference a;

    static {
        iba ibaVar = new iba(new bag("RxCachedThreadSchedulerShutdown"));
        e = ibaVar;
        ibaVar.d();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        bag bagVar = new bag("RxCachedThreadScheduler", max, false);
        b = bagVar;
        c = new bag("RxCachedWorkerPoolEvictor", max, false);
        f = Boolean.getBoolean("rx2.io-scheduled-release");
        gba gbaVar = new gba(0L, null, bagVar);
        g = gbaVar;
        gbaVar.c.d();
        ScheduledFuture scheduledFuture = gbaVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = gbaVar.d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public jba() {
        gba gbaVar = g;
        AtomicReference atomicReference = new AtomicReference(gbaVar);
        this.a = atomicReference;
        gba gbaVar2 = new gba(d, TimeUnit.SECONDS, b);
        while (!atomicReference.compareAndSet(gbaVar, gbaVar2)) {
            if (atomicReference.get() != gbaVar) {
                gbaVar2.c.d();
                ScheduledFuture scheduledFuture = gbaVar2.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = gbaVar2.d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.gsg
    public final fsg a() {
        return new hba((gba) this.a.get());
    }
}

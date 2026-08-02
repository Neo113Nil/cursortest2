package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rih extends gsg {
    public static final bag b;
    public static final ScheduledExecutorService c;
    public final AtomicReference a;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        b = new bag("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public rih() {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        boolean z = jsg.a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, b);
        if (jsg.a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            jsg.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    @Override // defpackage.gsg
    public final fsg a() {
        return new qih((ScheduledExecutorService) this.a.get());
    }

    @Override // defpackage.gsg
    public final k55 c(Runnable runnable) {
        bsg bsgVar = new bsg(runnable);
        try {
            bsgVar.a(((ScheduledExecutorService) this.a.get()).submit(bsgVar));
            return bsgVar;
        } catch (RejectedExecutionException e) {
            hda.L(e);
            return em5.a;
        }
    }
}

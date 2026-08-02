package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gba implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final vf3 c;
    public final ScheduledExecutorService d;
    public final ScheduledFuture e;
    public final ThreadFactory f;

    public gba(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        gba gbaVar;
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture<?> scheduledFuture;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new vf3(0);
        this.f = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, jba.c);
            gbaVar = this;
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(gbaVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            gbaVar = this;
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        gbaVar.d = scheduledExecutorService;
        gbaVar.e = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long nanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            iba ibaVar = (iba) it.next();
            if (ibaVar.c > nanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(ibaVar)) {
                this.c.c(ibaVar);
            }
        }
    }
}

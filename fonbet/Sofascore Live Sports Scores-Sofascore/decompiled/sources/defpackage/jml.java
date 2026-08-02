package defpackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jml extends chc {
    public static final long g = vvd.G.toNanos();
    public final ReentrantLock e;
    public final long f;

    public jml(int i, Duration duration) {
        super(i);
        this.f = Math.max(g, duration.toNanos());
        this.e = new ReentrantLock();
    }

    public final g5d c(long j, Duration duration) {
        g5d g5dVar;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.a;
        if (((AtomicInteger) this.d).get() == 0) {
            return null;
        }
        g5d a = a(duration);
        if (a != null && !(a instanceof avb)) {
            if (j < 1) {
                j = Long.MAX_VALUE;
            }
            long d = a.d();
            g5d g5dVar2 = a;
            long j2 = 1;
            while (true) {
                if (j2 >= 1000 || (g5dVar = (g5d) linkedBlockingQueue.peek()) == null) {
                    break;
                }
                if (g5dVar instanceof avb) {
                    linkedBlockingQueue.poll();
                    if (g5dVar != avb.n) {
                        g5dVar2.l = g5dVar;
                    }
                } else {
                    long d2 = g5dVar.d() + d;
                    if (d2 > j) {
                        break;
                    }
                    linkedBlockingQueue.poll();
                    j2++;
                    g5dVar2.l = g5dVar;
                    g5dVar2 = g5dVar;
                    d = d2;
                }
            }
            ((AtomicLong) this.b).addAndGet(-j2);
            ((AtomicLong) this.c).addAndGet(-d);
        }
        return a;
    }

    public final void d() {
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.a;
        if (((AtomicInteger) this.d).get() != 0) {
            a70.r("Filter is only supported when the queue is paused");
            return;
        }
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            linkedBlockingQueue.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g5d g5dVar = (g5d) it.next();
                if (g5dVar.e()) {
                    ((AtomicLong) this.c).addAndGet(-g5dVar.d());
                    ((AtomicLong) this.b).decrementAndGet();
                } else {
                    linkedBlockingQueue.offer(g5dVar);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean e(h5d h5dVar, boolean z) {
        AtomicLong atomicLong = (AtomicLong) this.b;
        AtomicLong atomicLong2 = (AtomicLong) this.c;
        long j = this.f;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.a;
        ReentrantLock reentrantLock = this.e;
        try {
            long nanoTime = System.nanoTime();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (!reentrantLock.tryLock(j, timeUnit)) {
                throw new IllegalStateException("Output queue is busy " + linkedBlockingQueue.size());
            }
            try {
                if (linkedBlockingQueue.offer(h5dVar, Math.max(g, j - (System.nanoTime() - nanoTime)), timeUnit)) {
                    atomicLong2.getAndAdd(h5dVar.d());
                    atomicLong.incrementAndGet();
                    return true;
                }
                throw new IllegalStateException("Output queue is full " + linkedBlockingQueue.size());
            } finally {
                reentrantLock.unlock();
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
}

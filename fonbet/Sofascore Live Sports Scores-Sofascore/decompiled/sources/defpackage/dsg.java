package defpackage;

import com.ironsource.U3;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dsg implements Runnable {
    public static final AtomicLong f = new AtomicLong();
    public final String a;
    public final Runnable b;
    public final AtomicReference c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;

    public dsg(ScheduledExecutorService scheduledExecutorService, long j, long j2, TimeUnit timeUnit, Runnable runnable) {
        this.a = "st-" + f.getAndIncrement();
        this.b = runnable;
        this.d = new AtomicBoolean(true);
        this.e = new AtomicBoolean(false);
        this.c = new AtomicReference(scheduledExecutorService.scheduleAtFixedRate(this, timeUnit.toNanos(j), timeUnit.toNanos(j2), TimeUnit.NANOSECONDS));
    }

    public final void a() {
        AtomicReference atomicReference = this.c;
        try {
            this.d.set(false);
            ScheduledFuture scheduledFuture = (ScheduledFuture) atomicReference.get();
            if (scheduledFuture != null) {
                atomicReference.set(null);
                if (scheduledFuture.isDone()) {
                    return;
                }
                scheduledFuture.cancel(false);
            }
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean = this.e;
        try {
            if (this.d.get()) {
                atomicBoolean.set(true);
                this.b.run();
            }
        } finally {
            atomicBoolean.set(false);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        if (this.d.get()) {
            sb.append(" [live");
        } else {
            sb.append(" [shutdown");
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.c.get();
        sb.append((scheduledFuture == null || scheduledFuture.isDone()) ? "/done" : "/!done");
        return mz1.o(sb, this.e.get() ? "/executing" : "/!executing", U3.j.e);
    }

    public dsg(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, Runnable runnable) {
        this(scheduledThreadPoolExecutor, j, j, TimeUnit.MILLISECONDS, runnable);
    }
}

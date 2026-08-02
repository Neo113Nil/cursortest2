package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jvc extends c6o implements ScheduledFuture, ddb, Future {
    public final g4 r;
    public final ScheduledFuture s;

    public jvc(g4 g4Var, ScheduledFuture scheduledFuture) {
        super(27);
        this.r = g4Var;
        this.s = scheduledFuture;
    }

    @Override // defpackage.c6o
    public final Object G() {
        return this.r;
    }

    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        this.r.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean h0 = h0(z);
        if (h0) {
            this.s.cancel(z);
        }
        return h0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.s.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.r.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.s.getDelay(timeUnit);
    }

    public final boolean h0(boolean z) {
        return this.r.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.r.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.r.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.r.get(j, timeUnit);
    }
}

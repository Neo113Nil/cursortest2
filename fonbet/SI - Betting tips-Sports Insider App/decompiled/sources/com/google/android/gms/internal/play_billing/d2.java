package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d2 extends d3 implements ScheduledFuture, z1, Future {

    /* renamed from: b, reason: collision with root package name */
    public final o1 f5425b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledFuture f5426c;

    public d2(o1 o1Var, ScheduledFuture scheduledFuture) {
        super(4);
        this.f5425b = o1Var;
        this.f5426c = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void b(Runnable runnable, Executor executor) {
        this.f5425b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        boolean cancel = this.f5425b.cancel(z5);
        if (cancel) {
            this.f5426c.cancel(z5);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f5426c.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5425b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f5426c.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5425b.f5532a instanceof d1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5425b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f5425b.get(j, timeUnit);
    }
}

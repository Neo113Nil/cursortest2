package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f2 extends c2 implements b2 {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f5448b;

    public f2(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f5448b = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.play_billing.c2, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        com.appsflyer.internal.h.e(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        k2 k2Var = new k2(Executors.callable(runnable, null));
        return new d2(k2Var, this.f5448b.schedule(k2Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        e2 e2Var = new e2(runnable);
        return new d2(e2Var, this.f5448b.scheduleAtFixedRate(e2Var, j, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j6, TimeUnit timeUnit) {
        e2 e2Var = new e2(runnable);
        return new d2(e2Var, this.f5448b.scheduleWithFixedDelay(e2Var, j, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        k2 k2Var = new k2(callable);
        return new d2(k2Var, this.f5448b.schedule(k2Var, j, timeUnit));
    }
}

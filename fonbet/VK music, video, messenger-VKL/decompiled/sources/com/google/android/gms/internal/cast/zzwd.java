package com.google.android.gms.internal.cast;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import xsna.ugz;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class zzwd extends AbstractExecutorService implements zzwo, AutoCloseable {
    @Override // com.google.android.gms.internal.cast.zzwo, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzww.zzo(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.cast.zzwo
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ugz) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.cast.zzwo
    /* renamed from: zza */
    public final ugz submit(Runnable runnable) {
        return (ugz) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.cast.zzwo
    /* renamed from: zzb */
    public final ugz submit(Runnable runnable, Object obj) {
        return (ugz) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.cast.zzwo
    /* renamed from: zzc */
    public final ugz submit(Callable callable) {
        return (ugz) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzww(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.cast.zzwo
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ugz) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.cast.zzwo
    public final /* synthetic */ Future submit(Callable callable) {
        return (ugz) super.submit(callable);
    }
}

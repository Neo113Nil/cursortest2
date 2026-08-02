package com.google.android.gms.internal.wearable;

import defpackage.eon;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzas extends AbstractExecutorService implements zzbg, AutoCloseable {
    @Override // com.google.android.gms.internal.wearable.zzbg
    /* renamed from: b */
    public final zzbf submit(Callable callable) {
        return (zzbf) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.wearable.zzbg
    /* renamed from: c */
    public final zzbf submit(Runnable runnable) {
        return (zzbf) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.wearable.zzbg, java.lang.AutoCloseable
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

    @Override // com.google.android.gms.internal.wearable.zzbg
    /* renamed from: d */
    public final zzbf submit(Runnable runnable, Object obj) {
        return (zzbf) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new eon(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzbf) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzbf) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    public final /* synthetic */ Future submit(Callable callable) {
        return (zzbf) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new eon(callable);
    }
}

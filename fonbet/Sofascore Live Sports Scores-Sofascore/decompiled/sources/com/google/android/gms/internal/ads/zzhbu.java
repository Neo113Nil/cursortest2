package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.emo;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzhbu extends AbstractExecutorService implements zzhdi, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.zzhdi
    /* renamed from: b */
    public final ddb submit(Callable callable) {
        return (ddb) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    /* renamed from: c */
    public final ddb submit(Runnable runnable) {
        return (ddb) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzhdi, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
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

    @Override // com.google.android.gms.internal.ads.zzhdi
    /* renamed from: d */
    public final ddb submit(Runnable runnable, Object obj) {
        return (ddb) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new emo(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhdi
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ddb) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhdi
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ddb) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhdi
    public final /* synthetic */ Future submit(Callable callable) {
        return (ddb) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new emo(callable);
    }
}

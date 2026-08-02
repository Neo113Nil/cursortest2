package com.google.android.gms.internal.wearable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzbg extends ExecutorService, AutoCloseable {
    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    zzbf submit(Callable callable);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    zzbf submit(Runnable runnable);

    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
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

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    zzbf submit(Runnable runnable, Object obj);
}

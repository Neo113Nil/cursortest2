package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import xsna.zcl;

/* renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4426le extends ScheduledThreadPoolExecutor implements AutoCloseable {
    /* JADX WARN: Multi-variable type inference failed */
    public C4426le() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e) {
                C4452n4.d().a(e);
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                C4452n4.d().a(e2);
            } catch (ExecutionException e3) {
                C4452n4.d().a(e3);
            }
        }
    }

    @Override // java.lang.AutoCloseable
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

    public /* synthetic */ C4426le(int i, ThreadFactory threadFactory, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? C4444me.a : i, (i2 & 2) != 0 ? new ThreadFactoryC4315fa() : threadFactory);
    }

    public C4426le(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }
}

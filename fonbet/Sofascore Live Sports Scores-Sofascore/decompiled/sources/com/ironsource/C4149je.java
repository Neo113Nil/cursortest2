package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.je, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4149je extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public /* synthetic */ C4149je(int i, ThreadFactory threadFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C4167ke.a : i, (i2 & 2) != 0 ? new ThreadFactoryC4056ea() : threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(@Nullable Runnable runnable, @Nullable Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e) {
                C4157k4.d().a(e);
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                C4157k4.d().a(e2);
            } catch (ExecutionException e3) {
                C4157k4.d().a(e3);
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

    /* JADX WARN: Multi-variable type inference failed */
    public C4149je() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4149je(int i, @NotNull ThreadFactory threadFactory) {
        super(i, threadFactory);
        threadFactory.getClass();
    }
}

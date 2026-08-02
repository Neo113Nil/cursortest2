package io.sentry.android.replay.util;

import C.o0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.W2;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h implements ScheduledExecutorService {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ScheduledExecutorService f67682a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2 f67683b;

    public h(@NotNull ScheduledExecutorService delegate, @NotNull W2 options) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f67682a = delegate;
        this.f67683b = options;
    }

    public static void a(Runnable runnable, h hVar) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            ILogger logger = hVar.f67683b.getLogger();
            I2 i22 = I2.ERROR;
            StringBuilder sb2 = new StringBuilder("Failed to execute task ");
            sb2.append(runnable instanceof i ? ((i) runnable).a() : "");
            logger.a(i22, sb2.toString(), th2);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j11, TimeUnit timeUnit) {
        return this.f67682a.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f67682a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f67682a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f67682a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f67682a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f67682a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.f67682a.schedule(runnable, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        return this.f67682a.scheduleAtFixedRate(runnable, j11, j12, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        return this.f67682a.scheduleWithFixedDelay(runnable, j11, j12, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this) {
            if (!this.f67682a.isShutdown()) {
                this.f67682a.shutdown();
            }
            try {
                if (!this.f67682a.awaitTermination(this.f67683b.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    shutdownNow();
                }
            } catch (InterruptedException unused) {
                shutdownNow();
                Thread.currentThread().interrupt();
            }
            Unit unit = Unit.f71690a;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f67682a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t2) {
        return this.f67682a.submit(runnable, t2);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) {
        return this.f67682a.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) {
        return (T) this.f67682a.invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j11, TimeUnit timeUnit) {
        return this.f67682a.schedule(callable, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f67682a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (kotlin.text.h.e0(name, "SentryReplayIntegration", false)) {
            task.run();
            return null;
        }
        try {
            return this.f67682a.submit(new da.b(1, task, this));
        } catch (Throwable th2) {
            this.f67683b.getLogger().a(I2.ERROR, o0.c(new StringBuilder("Failed to submit task "), task instanceof i ? ((i) task).a() : "", " to executor"), th2);
            return null;
        }
    }
}

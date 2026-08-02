package io.sentry.transport;

import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.T1;
import io.sentry.U1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class l extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    private final int f68535a;

    /* renamed from: b, reason: collision with root package name */
    private T1 f68536b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f68537c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final U1 f68538d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final n f68539e;

    /* loaded from: classes10.dex */
    static final class a<T> implements Future<T> {
        a() {
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z11) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final T get(long j11, @NotNull TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public l(int i11, @NotNull ThreadFactory threadFactory, @NotNull io.sentry.transport.a aVar, @NotNull ILogger iLogger, @NotNull U1 u12) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, aVar);
        this.f68536b = null;
        this.f68539e = new n();
        this.f68535a = i11;
        this.f68537c = iLogger;
        this.f68538d = u12;
    }

    public final boolean a() {
        T1 t12 = this.f68536b;
        return t12 != null && this.f68538d.now().b(t12) < 2000000000;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(@NotNull Runnable runnable, Throwable th2) {
        n nVar = this.f68539e;
        try {
            super.afterExecute(runnable, th2);
        } finally {
            nVar.a();
        }
    }

    final void b(long j11) {
        try {
            n nVar = this.f68539e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            nVar.d(j11);
        } catch (InterruptedException e11) {
            this.f68537c.a(I2.ERROR, "Failed to wait till idle", e11);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(@NotNull Runnable runnable) {
        n nVar = this.f68539e;
        int b11 = nVar.b();
        int i11 = this.f68535a;
        ILogger iLogger = this.f68537c;
        U1 u12 = this.f68538d;
        if (b11 >= i11) {
            this.f68536b = u12.now();
            iLogger.c(I2.WARNING, "Submit cancelled", new Object[0]);
            return new a();
        }
        nVar.c();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e11) {
            nVar.a();
            this.f68536b = u12.now();
            iLogger.a(I2.WARNING, "Submit rejected by thread pool executor", e11);
            return new a();
        }
    }
}

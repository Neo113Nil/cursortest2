package io.sentry;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import v.RunnableC10106j;

/* loaded from: classes.dex */
public final class C2 implements Z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ScheduledThreadPoolExecutor f66591a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66592b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final RunnableC10106j f66593c;

    /* renamed from: d, reason: collision with root package name */
    private final W2 f66594d;

    /* loaded from: classes10.dex */
    private static final class a<T> implements Future<T> {
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

    private static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f66595a;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb2 = new StringBuilder("SentryExecutorServiceThreadFactory-");
            int i11 = this.f66595a;
            this.f66595a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    C2(@NotNull ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, W2 w22) {
        this.f66592b = new io.sentry.util.a();
        this.f66593c = new RunnableC10106j();
        this.f66591a = scheduledThreadPoolExecutor;
        this.f66594d = w22;
    }

    public static /* synthetic */ void d(C2 c22) {
        int i11 = 0;
        while (true) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c22.f66591a;
            if (i11 >= 40) {
                scheduledThreadPoolExecutor.purge();
                return;
            } else {
                try {
                    scheduledThreadPoolExecutor.schedule(c22.f66593c, 365L, TimeUnit.DAYS).cancel(true);
                    i11++;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            return;
        }
    }

    @Override // io.sentry.Z
    public final void a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f66591a;
        try {
            scheduledThreadPoolExecutor.submit(new Runnable() { // from class: io.sentry.B2
                @Override // java.lang.Runnable
                public final void run() {
                    C2.d(C2.this);
                }
            });
        } catch (RejectedExecutionException e11) {
            W2 w22 = this.f66594d;
            if (w22 != null) {
                w22.getLogger().a(I2.WARNING, "Prewarm task rejected from " + scheduledThreadPoolExecutor, e11);
            }
        }
    }

    @Override // io.sentry.Z
    @NotNull
    public final Future<?> b(@NotNull Runnable runnable, long j11) throws RejectedExecutionException {
        return this.f66591a.schedule(runnable, j11, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.Z
    public final void c(long j11) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f66591a;
        InterfaceC7097a0 a11 = this.f66592b.a();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j11, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.Z
    public final boolean isClosed() {
        InterfaceC7097a0 a11 = this.f66592b.a();
        try {
            boolean isShutdown = this.f66591a.isShutdown();
            a11.close();
            return isShutdown;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.Z
    @NotNull
    public final Future<?> submit(@NotNull Runnable runnable) throws RejectedExecutionException {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f66591a;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        W2 w22 = this.f66594d;
        if (w22 != null) {
            w22.getLogger().c(I2.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new a();
    }

    public C2(W2 w22) {
        this(new ScheduledThreadPoolExecutor(1, new b()), w22);
    }

    public C2() {
        this(new ScheduledThreadPoolExecutor(1, new b()), null);
    }
}

package io.sentry;

import io.sentry.util.C4843a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4743e3 implements InterfaceC4760i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f52024a;

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f52025b;

    /* renamed from: c, reason: collision with root package name */
    public final F3 f52026c;

    /* renamed from: io.sentry.e3$b */
    public static final class b implements Future {
        public b() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    /* renamed from: io.sentry.e3$c */
    public static final class c extends Thread {
        public c(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* renamed from: io.sentry.e3$d */
    public static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f52027a;

        public d() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i10 = this.f52027a;
            this.f52027a = i10 + 1;
            sb2.append(i10);
            c cVar = new c(runnable, sb2.toString());
            cVar.setDaemon(true);
            return cVar;
        }
    }

    public C4743e3(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, F3 f32) {
        this.f52025b = new C4843a();
        this.f52024a = scheduledThreadPoolExecutor;
        this.f52026c = f32;
    }

    public static boolean d() {
        return Thread.currentThread() instanceof c;
    }

    @Override // io.sentry.InterfaceC4760i0
    public void a(long j10) {
        InterfaceC4765j0 d10 = this.f52025b.d();
        try {
            if (!this.f52024a.isShutdown()) {
                this.f52024a.shutdown();
                try {
                    if (!this.f52024a.awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        this.f52024a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f52024a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4760i0
    public Future b(Runnable runnable, long j10) {
        return this.f52024a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        if (this.f52024a.getQueue().size() >= 271) {
            this.f52024a.purge();
        }
        return this.f52024a.getQueue().size() < 271;
    }

    @Override // io.sentry.InterfaceC4760i0
    public boolean isClosed() {
        InterfaceC4765j0 d10 = this.f52025b.d();
        try {
            boolean isShutdown = this.f52024a.isShutdown();
            if (d10 != null) {
                d10.close();
            }
            return isShutdown;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4760i0
    public Future submit(Runnable runnable) {
        if (c()) {
            return this.f52024a.submit(runnable);
        }
        F3 f32 = this.f52026c;
        if (f32 != null) {
            f32.getLogger().c(EnumC4788n3.WARNING, "Task " + runnable + " rejected from " + this.f52024a, new Object[0]);
        }
        return new b();
    }

    public C4743e3(F3 f32) {
        this(new ScheduledThreadPoolExecutor(1, new d()), f32);
    }

    public C4743e3() {
        this(new ScheduledThreadPoolExecutor(1, new d()), null);
    }
}

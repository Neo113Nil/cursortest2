package io.sentry.transport;

import io.sentry.AbstractC4779m;
import io.sentry.AbstractC4856v2;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4861w2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class v extends ThreadPoolExecutor implements AutoCloseable {

    /* renamed from: f, reason: collision with root package name */
    public static final long f52751f = AbstractC4779m.i(2000);

    /* renamed from: a, reason: collision with root package name */
    public final int f52752a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC4856v2 f52753b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f52754c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4861w2 f52755d;

    /* renamed from: e, reason: collision with root package name */
    public final A f52756e;

    public static final class a implements Future {
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

    public v(int i10, int i11, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, ILogger iLogger, InterfaceC4861w2 interfaceC4861w2) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f52753b = null;
        this.f52756e = new A();
        this.f52752a = i11;
        this.f52754c = iLogger;
        this.f52755d = interfaceC4861w2;
    }

    public void J(long j10) {
        try {
            this.f52756e.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f52754c.b(EnumC4788n3.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
        } finally {
            this.f52756e.a();
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        androidx.core.content.res.f.a(this);
    }

    public boolean d() {
        AbstractC4856v2 abstractC4856v2 = this.f52753b;
        return abstractC4856v2 != null && this.f52755d.now().b(abstractC4856v2) < f52751f;
    }

    public boolean k() {
        return this.f52756e.b() < this.f52752a;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        if (!k()) {
            this.f52753b = this.f52755d.now();
            this.f52754c.c(EnumC4788n3.WARNING, "Submit cancelled", new Object[0]);
            return new a();
        }
        this.f52756e.c();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e10) {
            this.f52756e.a();
            this.f52753b = this.f52755d.now();
            this.f52754c.b(EnumC4788n3.WARNING, "Submit rejected by thread pool executor", e10);
            return new a();
        }
    }
}

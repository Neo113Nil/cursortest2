package m3;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: m3.D, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractRunnableFutureC8051D<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: a, reason: collision with root package name */
    private final C8067i f74267a = new C8067i();

    /* renamed from: b, reason: collision with root package name */
    private final C8067i f74268b = new C8067i();

    /* renamed from: c, reason: collision with root package name */
    private final Object f74269c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private Exception f74270d;

    /* renamed from: e, reason: collision with root package name */
    private R f74271e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f74272f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f74273g;

    protected AbstractRunnableFutureC8051D() {
    }

    public final void b() {
        this.f74268b.c();
    }

    public final void c() {
        this.f74267a.c();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        synchronized (this.f74269c) {
            try {
                if (!this.f74273g && !this.f74268b.f()) {
                    this.f74273g = true;
                    d();
                    Thread thread = this.f74272f;
                    if (thread == null) {
                        this.f74267a.g();
                        this.f74268b.g();
                    } else if (z11) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    protected void d() {
    }

    protected abstract R e() throws Exception;

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.f74268b.a();
        if (this.f74273g) {
            throw new CancellationException();
        }
        if (this.f74270d == null) {
            return this.f74271e;
        }
        throw new ExecutionException(this.f74270d);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f74273g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f74268b.f();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f74269c) {
            try {
                if (this.f74273g) {
                    return;
                }
                this.f74272f = Thread.currentThread();
                this.f74267a.g();
                try {
                    try {
                        this.f74271e = e();
                        synchronized (this.f74269c) {
                            this.f74268b.g();
                            this.f74272f = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f74269c) {
                            this.f74268b.g();
                            this.f74272f = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e11) {
                    this.f74270d = e11;
                    synchronized (this.f74269c) {
                        this.f74268b.g();
                        this.f74272f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j11, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f74268b.b(TimeUnit.MILLISECONDS.convert(j11, timeUnit))) {
            if (!this.f74273g) {
                if (this.f74270d == null) {
                    return this.f74271e;
                }
                throw new ExecutionException(this.f74270d);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}

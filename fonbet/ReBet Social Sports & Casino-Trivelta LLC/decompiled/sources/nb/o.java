package nb;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import nb.p;

/* loaded from: classes3.dex */
public class o implements ScheduledExecutorService, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f57217a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f57218b;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f57217a = executorService;
        this.f57218b = scheduledExecutorService;
    }

    public static /* synthetic */ void T1(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void m1(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void w0(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public static /* synthetic */ void z0(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f57217a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        androidx.core.content.res.f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f57217a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f57217a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f57217a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f57217a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f57217a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nb.c
            @Override // nb.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture schedule;
                schedule = r0.f57218b.schedule(new Runnable() { // from class: nb.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f57217a.execute(new Runnable() { // from class: nb.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.T1(r1, r2);
                            }
                        });
                    }
                }, j10, timeUnit);
                return schedule;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nb.f
            @Override // nb.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture scheduleAtFixedRate;
                scheduleAtFixedRate = r0.f57218b.scheduleAtFixedRate(new Runnable() { // from class: nb.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f57217a.execute(new Runnable() { // from class: nb.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.z0(r1, r2);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
                return scheduleAtFixedRate;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nb.g
            @Override // nb.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture scheduleWithFixedDelay;
                scheduleWithFixedDelay = r0.f57218b.scheduleWithFixedDelay(new Runnable() { // from class: nb.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f57217a.execute(new Runnable() { // from class: nb.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.m1(r1, r2);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
                return scheduleWithFixedDelay;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f57217a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f57217a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f57217a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: nb.h
            @Override // nb.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture schedule;
                schedule = r0.f57218b.schedule(new Callable() { // from class: nb.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Future submit;
                        submit = o.this.f57217a.submit(new Runnable() { // from class: nb.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.w0(r1, r2);
                            }
                        });
                        return submit;
                    }
                }, j10, timeUnit);
                return schedule;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f57217a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f57217a.submit(runnable);
    }
}

package Ph;

import Sh.AbstractC1563a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Ph.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1479u0 extends AbstractC1477t0 implements Z {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9133c;

    public C1479u0(Executor executor) {
        this.f9133c = executor;
        AbstractC1563a.a(e2());
    }

    @Override // Ph.Z
    public InterfaceC1456i0 J(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        long j11;
        Runnable runnable2;
        CoroutineContext coroutineContext2;
        Executor e22 = e2();
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = e22 instanceof ScheduledExecutorService ? (ScheduledExecutorService) e22 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
            scheduledFuture = g2(scheduledExecutorService, runnable2, coroutineContext2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
        }
        return scheduledFuture != null ? new C1454h0(scheduledFuture) : V.f9056h.J(j11, runnable2, coroutineContext2);
    }

    @Override // Ph.L
    public void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor e22 = e2();
            AbstractC1443c.a();
            e22.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC1443c.a();
            f2(coroutineContext, e10);
            C1452g0.b().Y1(coroutineContext, runnable);
        }
    }

    @Override // Ph.AbstractC1477t0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor e22 = e2();
        ExecutorService executorService = e22 instanceof ExecutorService ? (ExecutorService) e22 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // Ph.AbstractC1477t0
    public Executor e2() {
        return this.f9133c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1479u0) && ((C1479u0) obj).e2() == e2();
    }

    public final void f2(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        F0.d(coroutineContext, AbstractC1473r0.a("The task was rejected", rejectedExecutionException));
    }

    public final ScheduledFuture g2(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f2(coroutineContext, e10);
            return null;
        }
    }

    public int hashCode() {
        return System.identityHashCode(e2());
    }

    @Override // Ph.L
    public String toString() {
        return e2().toString();
    }

    @Override // Ph.Z
    public void w0(long j10, InterfaceC1465n interfaceC1465n) {
        long j11;
        Executor e22 = e2();
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = e22 instanceof ScheduledExecutorService ? (ScheduledExecutorService) e22 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFuture = g2(scheduledExecutorService, new U0(this, interfaceC1465n), interfaceC1465n.get$context(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFuture != null) {
            r.c(interfaceC1465n, new C1461l(scheduledFuture));
        } else {
            V.f9056h.w0(j11, interfaceC1465n);
        }
    }
}

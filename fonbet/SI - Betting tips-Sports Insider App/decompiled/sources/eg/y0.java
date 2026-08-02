package eg;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y0 extends x0 implements h0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9243c;

    public y0(Executor executor) {
        Method method;
        this.f9243c = executor;
        Method method2 = jg.a.f18483a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = jg.a.f18483a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // eg.h0
    public final o0 C(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f9243c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                e1 e1Var = (e1) coroutineContext.r(x.f9237b);
                if (e1Var != null) {
                    e1Var.k(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new n0(scheduledFuture) : d0.j.C(j, runnable, coroutineContext);
    }

    @Override // eg.h0
    public final void N(long j, l lVar) {
        Executor executor = this.f9243c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            g8.a aVar = new g8.a(20, this, lVar);
            CoroutineContext coroutineContext = lVar.f9194e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(aVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                e1 e1Var = (e1) coroutineContext.r(x.f9237b);
                if (e1Var != null) {
                    e1Var.k(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            lVar.v(new h(0, scheduledFuture));
        } else {
            d0.j.N(j, lVar);
        }
    }

    @Override // eg.w
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f9243c.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e7);
            e1 e1Var = (e1) coroutineContext.r(x.f9237b);
            if (e1Var != null) {
                e1Var.k(cancellationException);
            }
            lg.e eVar = m0.f9201a;
            lg.d.f20063c.c0(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f9243c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).f9243c == this.f9243c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f9243c);
    }

    @Override // eg.x0
    public final Executor i0() {
        return this.f9243c;
    }

    @Override // eg.w
    public final String toString() {
        return this.f9243c.toString();
    }
}

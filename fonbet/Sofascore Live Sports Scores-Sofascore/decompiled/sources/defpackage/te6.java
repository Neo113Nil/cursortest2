package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class te6 extends se6 implements iv4 {
    public final Executor c;

    public te6(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = th3.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = th3.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof te6) && ((te6) obj).c == this.c;
    }

    @Override // defpackage.iv4
    public final void f(long j, lj2 lj2Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            vlo vloVar = new vlo(18, this, lj2Var);
            CoroutineContext coroutineContext = lj2Var.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(vloVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                bea.p(coroutineContext, ml4.e("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            lj2Var.w(new dj2(scheduledFuture, 0));
        } else {
            yo4.k.f(j, lj2Var);
        }
    }

    @Override // defpackage.iv4
    public final q55 g(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                bea.p(coroutineContext, ml4.e("The task was rejected", e));
            }
        }
        return scheduledFuture != null ? new p55(scheduledFuture) : yo4.k.g(j, runnable, coroutineContext);
    }

    @Override // defpackage.se6
    public final Executor g0() {
        return this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            bea.p(coroutineContext, ml4.e("The task was rejected", e));
            hs4 hs4Var = z45.a;
            hq4.c.i(coroutineContext, runnable);
        }
    }

    @Override // defpackage.au3
    public final String toString() {
        return this.c.toString();
    }
}

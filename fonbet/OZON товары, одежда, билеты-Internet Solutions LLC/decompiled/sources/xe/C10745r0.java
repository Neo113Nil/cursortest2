package xe;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10745r0 extends AbstractC10744q0 implements W {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f105497b;

    public C10745r0(@NotNull Executor executor) {
        this.f105497b = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f105497b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10745r0) && ((C10745r0) obj).f105497b == this.f105497b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f105497b);
    }

    @Override // xe.W
    @NotNull
    public final InterfaceC10724g0 k(long j11, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        Executor executor = this.f105497b;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j11, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e11) {
                E0.b(coroutineContext, C10740o0.a("The task was rejected", e11));
            }
        }
        return scheduledFuture != null ? new C10722f0(scheduledFuture) : S.f105415i.k(j11, runnable, coroutineContext);
    }

    @Override // xe.W
    public final void o(long j11, @NotNull C10737n c10737n) {
        Executor executor = this.f105497b;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            T0 t02 = new T0(this, c10737n);
            CoroutineContext context = c10737n.getContext();
            try {
                scheduledFuture = scheduledExecutorService.schedule(t02, j11, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e11) {
                E0.b(context, C10740o0.a("The task was rejected", e11));
            }
        }
        if (scheduledFuture != null) {
            c10737n.s(new C10729j(scheduledFuture));
        } else {
            S.f105415i.o(j11, c10737n);
        }
    }

    @Override // xe.I
    public final void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            this.f105497b.execute(runnable);
        } catch (RejectedExecutionException e11) {
            E0.b(coroutineContext, C10740o0.a("The task was rejected", e11));
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b.f10879b.q(coroutineContext, runnable);
        }
    }

    @Override // xe.I
    @NotNull
    public final String toString() {
        return this.f105497b.toString();
    }

    @Override // xe.AbstractC10744q0
    @NotNull
    public final Executor x() {
        return this.f105497b;
    }
}

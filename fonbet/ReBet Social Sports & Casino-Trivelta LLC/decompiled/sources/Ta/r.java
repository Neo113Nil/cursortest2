package Ta;

import Ta.a;
import Ta.g;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class r {

    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final ExecutorService f11388a;

        public a(ExecutorService executorService) {
            this.f11388a = (ExecutorService) Ra.n.k(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f11388a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f11388a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f11388a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f11388a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f11388a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return this.f11388a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f11388a + "]";
        }
    }

    public static final class b extends a implements ScheduledExecutorService, q {

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f11389b;

        public static final class a extends g.a implements p {

            /* renamed from: b, reason: collision with root package name */
            public final ScheduledFuture f11390b;

            public a(o oVar, ScheduledFuture scheduledFuture) {
                super(oVar);
                this.f11390b = scheduledFuture;
            }

            @Override // Ta.f, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean cancel = super.cancel(z10);
                if (cancel) {
                    this.f11390b.cancel(z10);
                }
                return cancel;
            }

            @Override // java.lang.Comparable
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f11390b.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f11390b.getDelay(timeUnit);
            }
        }

        /* renamed from: Ta.r$b$b, reason: collision with other inner class name */
        public static final class RunnableC0222b extends a.i implements Runnable {

            /* renamed from: h, reason: collision with root package name */
            public final Runnable f11391h;

            public RunnableC0222b(Runnable runnable) {
                this.f11391h = (Runnable) Ra.n.k(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f11391h.run();
                } catch (Throwable th2) {
                    y(th2);
                    throw th2;
                }
            }

            @Override // Ta.a
            public String u() {
                return "task=[" + this.f11391h + "]";
            }
        }

        public b(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f11389b = (ScheduledExecutorService) Ra.n.k(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public p scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            RunnableC0222b runnableC0222b = new RunnableC0222b(runnable);
            return new a(runnableC0222b, this.f11389b.scheduleWithFixedDelay(runnableC0222b, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public p schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            w A10 = w.A(runnable, null);
            return new a(A10, this.f11389b.schedule(A10, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* renamed from: w0, reason: merged with bridge method [inline-methods] */
        public p schedule(Callable callable, long j10, TimeUnit timeUnit) {
            w B10 = w.B(callable);
            return new a(B10, this.f11389b.schedule(B10, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* renamed from: z0, reason: merged with bridge method [inline-methods] */
        public p scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            RunnableC0222b runnableC0222b = new RunnableC0222b(runnable);
            return new a(runnableC0222b, this.f11389b.scheduleAtFixedRate(runnableC0222b, j10, j11, timeUnit));
        }
    }

    public static Executor a() {
        return d.INSTANCE;
    }

    public static q b(ExecutorService executorService) {
        return executorService instanceof q ? (q) executorService : executorService instanceof ScheduledExecutorService ? new b((ScheduledExecutorService) executorService) : new a(executorService);
    }
}

package B6;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class b extends AbstractExecutorService implements AutoCloseable {

    /* renamed from: h, reason: collision with root package name */
    public static final Class f800h = b.class;

    /* renamed from: a, reason: collision with root package name */
    public final String f801a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f802b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f803c;

    /* renamed from: d, reason: collision with root package name */
    public final BlockingQueue f804d;

    /* renamed from: e, reason: collision with root package name */
    public final a f805e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f806f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f807g;

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) b.this.f804d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    E6.a.y(b.f800h, "%s: Worker has nothing to run", b.this.f801a);
                }
                int decrementAndGet = b.this.f806f.decrementAndGet();
                if (b.this.f804d.isEmpty()) {
                    E6.a.z(b.f800h, "%s: worker finished; %d workers left", b.this.f801a, Integer.valueOf(decrementAndGet));
                } else {
                    b.this.A0();
                }
            } catch (Throwable th2) {
                int decrementAndGet2 = b.this.f806f.decrementAndGet();
                if (b.this.f804d.isEmpty()) {
                    E6.a.z(b.f800h, "%s: worker finished; %d workers left", b.this.f801a, Integer.valueOf(decrementAndGet2));
                } else {
                    b.this.A0();
                }
                throw th2;
            }
        }

        public a() {
        }
    }

    public b(String str, int i10, Executor executor, BlockingQueue blockingQueue) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.f801a = str;
        this.f802b = executor;
        this.f803c = i10;
        this.f804d = blockingQueue;
        this.f805e = new a();
        this.f806f = new AtomicInteger(0);
        this.f807g = new AtomicInteger(0);
    }

    public final void A0() {
        int i10 = this.f806f.get();
        while (i10 < this.f803c) {
            int i11 = i10 + 1;
            if (this.f806f.compareAndSet(i10, i11)) {
                E6.a.A(f800h, "%s: starting worker %d of %d", this.f801a, Integer.valueOf(i11), Integer.valueOf(this.f803c));
                this.f802b.execute(this.f805e);
                return;
            } else {
                E6.a.y(f800h, "%s: race in startWorkerIfNeeded; retrying", this.f801a);
                i10 = this.f806f.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        androidx.core.content.res.f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if (!this.f804d.offer(runnable)) {
            throw new RejectedExecutionException(this.f801a + " queue is full, size=" + this.f804d.size());
        }
        int size = this.f804d.size();
        int i10 = this.f807g.get();
        if (size > i10 && this.f807g.compareAndSet(i10, size)) {
            E6.a.z(f800h, "%s: max pending work in queue = %d", this.f801a, Integer.valueOf(size));
        }
        A0();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}

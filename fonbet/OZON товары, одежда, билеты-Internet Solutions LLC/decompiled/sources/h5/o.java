package h5;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class o implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f64985b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f64986c;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f64984a = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    final Object f64987d = new Object();

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final o f64988a;

        /* renamed from: b, reason: collision with root package name */
        final Runnable f64989b;

        a(@NonNull o oVar, @NonNull Runnable runnable) {
            this.f64988a = oVar;
            this.f64989b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f64989b.run();
                synchronized (this.f64988a.f64987d) {
                    this.f64988a.b();
                }
            } catch (Throwable th2) {
                synchronized (this.f64988a.f64987d) {
                    this.f64988a.b();
                    throw th2;
                }
            }
        }
    }

    public o(@NonNull ExecutorService executorService) {
        this.f64985b = executorService;
    }

    public final boolean a() {
        boolean z11;
        synchronized (this.f64987d) {
            z11 = !this.f64984a.isEmpty();
        }
        return z11;
    }

    final void b() {
        a poll = this.f64984a.poll();
        this.f64986c = poll;
        if (poll != null) {
            this.f64985b.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        synchronized (this.f64987d) {
            try {
                this.f64984a.add(new a(this, runnable));
                if (this.f64986c == null) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

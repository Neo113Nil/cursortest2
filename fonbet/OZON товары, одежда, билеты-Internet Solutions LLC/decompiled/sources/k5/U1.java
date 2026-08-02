package k5;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class U1 {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledExecutorService f70656a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f70657b;

    /* renamed from: c, reason: collision with root package name */
    private X f70658c;

    /* renamed from: d, reason: collision with root package name */
    private long f70659d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f70660e = new a();

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            U1 u12 = U1.this;
            if (u12.f70659d <= 0 || System.currentTimeMillis() <= u12.f70659d) {
                if (u12.f70657b != null) {
                    u12.f70657b.run();
                }
            } else {
                if (u12.f70658c != null) {
                    ((X) u12.f70658c).run();
                }
                u12.d();
            }
        }
    }

    private void e(@NonNull Runnable runnable, long j11, long j12, X x11) {
        d();
        this.f70657b = runnable;
        this.f70658c = x11;
        if (j12 > 0) {
            this.f70659d = System.currentTimeMillis() + j12;
        }
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f70656a = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.scheduleWithFixedDelay(this.f70660e, 0L, j11, TimeUnit.MILLISECONDS);
    }

    public final synchronized void d() {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f70656a;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f70656a = null;
            }
            this.f70657b = null;
            this.f70658c = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void f(@NonNull W w11, long j11, long j12, @NonNull X x11) {
        e(w11, j11, j12, x11);
    }

    public final void g(@NonNull Y0 y02) {
        e(y02, 3000L, 0L, null);
    }
}

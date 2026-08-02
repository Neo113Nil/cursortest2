package io.sentry.backpressure;

import io.sentry.A1;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.W2;
import io.sentry.Z;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes10.dex */
public final class a implements b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f67767a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A1 f67768b;

    /* renamed from: c, reason: collision with root package name */
    private int f67769c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile Future<?> f67770d = null;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67771e = new io.sentry.util.a();

    public a(@NotNull A1 a12, @NotNull W2 w22) {
        this.f67767a = w22;
        this.f67768b = a12;
    }

    private void b(int i11) {
        Z executorService = this.f67767a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        InterfaceC7097a0 a11 = this.f67771e.a();
        try {
            try {
                this.f67770d = executorService.b(this, i11);
            } catch (RejectedExecutionException e11) {
                this.f67767a.getLogger().a(I2.WARNING, "Backpressure monitor reschedule task rejected", e11);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.f67769c;
    }

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future<?> future = this.f67770d;
        if (future != null) {
            InterfaceC7097a0 a11 = this.f67771e.a();
            try {
                future.cancel(true);
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e11 = this.f67768b.e();
        W2 w22 = this.f67767a;
        if (e11) {
            if (this.f67769c > 0) {
                w22.getLogger().c(I2.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f67769c = 0;
        } else {
            int i11 = this.f67769c;
            if (i11 < 10) {
                this.f67769c = i11 + 1;
                w22.getLogger().c(I2.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f67769c));
            }
        }
        b(10000);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(CounterView.COUNTER_MAX_DEFAULT);
    }
}

package io.sentry.backpressure;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.e1;
import io.sentry.r;
import io.sentry.y3;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16211a;

    /* renamed from: b, reason: collision with root package name */
    public final y3 f16212b;

    /* renamed from: c, reason: collision with root package name */
    public int f16213c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Future f16214d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.util.a f16215e;

    public a(b6 b6Var) {
        y3 y3Var = y3.f17255a;
        this.f16213c = 0;
        this.f16214d = null;
        this.f16215e = new io.sentry.util.a();
        this.f16211a = b6Var;
        this.f16212b = y3Var;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.f16213c;
    }

    public final void b(int i5) {
        e1 executorService = this.f16211a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        r a7 = this.f16215e.a();
        try {
            try {
                this.f16214d = executorService.l(this, i5);
            } catch (RejectedExecutionException e7) {
                this.f16211a.getLogger().e(b5.WARNING, "Backpressure monitor reschedule task rejected", e7);
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future future = this.f16214d;
        if (future != null) {
            r a7 = this.f16215e.a();
            try {
                future.cancel(true);
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e7 = this.f16212b.e();
        b6 b6Var = this.f16211a;
        if (e7) {
            if (this.f16213c > 0) {
                b6Var.getLogger().h(b5.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f16213c = 0;
        } else {
            int i5 = this.f16213c;
            if (i5 < 10) {
                this.f16213c = i5 + 1;
                b6Var.getLogger().h(b5.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f16213c));
            }
        }
        b(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(500);
    }
}

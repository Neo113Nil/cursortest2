package io.sentry.android.core;

import io.sentry.I2;
import io.sentry.W2;
import io.sentry.android.core.F;

/* loaded from: classes.dex */
public final class r extends io.sentry.metrics.d implements F.a {

    /* loaded from: classes10.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r.this.b(5000L);
        }
    }

    @Override // io.sentry.metrics.d, io.sentry.metrics.b
    public final void a(boolean z11) {
        F.o().r(this);
        super.a(z11);
    }

    @Override // io.sentry.android.core.F.a
    public final void c() {
    }

    @Override // io.sentry.android.core.F.a
    public final void j() {
        W2 w22 = this.f68090a;
        try {
            w22.getExecutorService().submit(new a());
        } catch (Throwable th2) {
            w22.getLogger().b(I2.ERROR, th2, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }
}

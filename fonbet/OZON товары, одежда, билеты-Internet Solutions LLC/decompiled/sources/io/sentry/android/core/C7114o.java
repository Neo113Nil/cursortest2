package io.sentry.android.core;

import io.sentry.I2;
import io.sentry.R1;
import io.sentry.W2;
import io.sentry.android.core.F;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7114o extends io.sentry.logger.d implements F.a {

    /* renamed from: io.sentry.android.core.o$a */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7114o.this.b(5000L);
        }
    }

    public C7114o(@NotNull W2 w22, @NotNull R1 r12) {
        super(w22, r12);
        F.o().j(this);
    }

    @Override // io.sentry.logger.d, io.sentry.logger.b
    public final void a(boolean z11) {
        F.o().r(this);
        super.a(z11);
    }

    @Override // io.sentry.android.core.F.a
    public final void c() {
    }

    @Override // io.sentry.android.core.F.a
    public final void j() {
        W2 w22 = this.f68065a;
        try {
            w22.getExecutorService().submit(new a());
        } catch (Throwable th2) {
            w22.getLogger().b(I2.ERROR, th2, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }
}

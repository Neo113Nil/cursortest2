package io.sentry.android.core;

import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4755h0;
import io.sentry.android.core.AppState;

/* loaded from: classes3.dex */
public final class D extends io.sentry.logger.g implements AppState.a {

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.b(5000L);
        }
    }

    public D(F3 f32, InterfaceC4755h0 interfaceC4755h0) {
        super(f32, interfaceC4755h0);
        AppState.w0().B(this);
    }

    @Override // io.sentry.logger.g, io.sentry.logger.c
    public void a(boolean z10) {
        AppState.w0().D0(this);
        super.a(z10);
    }

    @Override // io.sentry.android.core.AppState.a
    public void d() {
    }

    @Override // io.sentry.android.core.AppState.a
    public void k() {
        try {
            this.f52180a.getExecutorService().submit(new a());
        } catch (Throwable th2) {
            this.f52180a.getLogger().a(EnumC4788n3.ERROR, th2, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }
}

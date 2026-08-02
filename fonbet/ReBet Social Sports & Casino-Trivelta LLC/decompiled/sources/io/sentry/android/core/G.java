package io.sentry.android.core;

import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4755h0;
import io.sentry.android.core.AppState;

/* loaded from: classes3.dex */
public final class G extends io.sentry.metrics.g implements AppState.a {

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.b(5000L);
        }
    }

    public G(F3 f32, InterfaceC4755h0 interfaceC4755h0) {
        super(f32, interfaceC4755h0);
        AppState.w0().B(this);
    }

    @Override // io.sentry.metrics.g, io.sentry.metrics.c
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
            this.f52202a.getExecutorService().submit(new a());
        } catch (Throwable th2) {
            this.f52202a.getLogger().a(EnumC4788n3.ERROR, th2, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }
}

package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.b6;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends androidx.appcompat.widget.a0 implements e0 {
    @Override // androidx.appcompat.widget.a0, io.sentry.metrics.a
    public final void a(boolean z5) {
        h0.f15617e.r(this);
        super.a(z5);
    }

    @Override // io.sentry.android.core.e0
    public final void n() {
        b6 b6Var = (b6) this.f680b;
        try {
            b6Var.getExecutorService().submit(new l(this, 1));
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.android.core.e0
    public final void k() {
    }
}

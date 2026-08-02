package io.sentry.android.core;

import io.sentry.b5;
import io.sentry.b6;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends io.sentry.logger.d implements e0 {
    @Override // io.sentry.logger.d, io.sentry.logger.b
    public final void a(boolean z5) {
        h0.f15617e.r(this);
        super.a(z5);
    }

    @Override // io.sentry.android.core.e0
    public final void n() {
        b6 b6Var = this.f16625a;
        try {
            b6Var.getExecutorService().submit(new l(this, 0));
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.android.core.e0
    public final void k() {
    }
}

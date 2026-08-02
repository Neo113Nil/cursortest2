package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0618y1 extends IAppMetricaService.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final A1 f14943a;

    public BinderC0618y1(@NotNull A1 a12) {
        this.f14943a = a12;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(@NotNull Bundle bundle) {
        ((B1) this.f14943a).pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i5, @NotNull Bundle bundle) {
        ((B1) this.f14943a).reportData(i5, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(@NotNull Bundle bundle) {
        ((B1) this.f14943a).resumeUserSession(bundle);
    }
}

package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Nn extends AbstractCallableC0609xh {

    /* renamed from: e, reason: collision with root package name */
    public final int f12666e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f12667f;

    public Nn(@NotNull C0393p0 c0393p0, @Nullable Zk zk, int i5, @NotNull Bundle bundle) {
        super(c0393p0, zk);
        this.f12666e = i5;
        this.f12667f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0609xh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f12666e, this.f12667f);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Pg extends AbstractCallableC0609xh {

    /* renamed from: e, reason: collision with root package name */
    public final C0559vh f12755e;

    public Pg(@NotNull C0393p0 c0393p0, @Nullable Zk zk, @NotNull C0559vh c0559vh) {
        super(c0393p0, zk);
        this.f12755e = c0559vh;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0609xh
    public final void a(@Nullable Throwable th2) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0609xh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        C0559vh c0559vh = this.f12755e;
        iAppMetricaService.reportData(c0559vh.f14796c, c0559vh.f14794a.d(c0559vh.f14798e.c()));
    }
}

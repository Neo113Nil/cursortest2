package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ei extends AbstractCallableC0609xh {

    /* renamed from: e, reason: collision with root package name */
    public final Bf f12203e;

    public Ei(@NotNull C0393p0 c0393p0, @Nullable Zk zk, @NotNull Bf bf2) {
        super(c0393p0, zk);
        this.f12203e = bf2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0609xh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Bf bf2 = this.f12203e;
        synchronized (bf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf2);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}

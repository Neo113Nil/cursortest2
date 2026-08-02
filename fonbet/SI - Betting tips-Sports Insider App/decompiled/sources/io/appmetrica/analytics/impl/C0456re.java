package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456re extends AbstractCallableC0609xh {

    /* renamed from: e, reason: collision with root package name */
    public final Bf f14555e;

    public C0456re(@NotNull C0393p0 c0393p0, @Nullable Zk zk, @NotNull Bf bf2) {
        super(c0393p0, zk);
        this.f14555e = bf2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0609xh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Bf bf2 = this.f14555e;
        synchronized (bf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf2);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}

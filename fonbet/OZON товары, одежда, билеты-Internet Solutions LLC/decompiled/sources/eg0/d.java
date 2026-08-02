package eg0;

import Sc.InterfaceC4008j;
import We.InterfaceC4865g;
import We.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.i;
import qj.C9067a;

/* loaded from: classes7.dex */
public final class d implements v.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9067a> f62326a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f62327b;

    public d(@NotNull InterfaceC4008j<C9067a> networkInfoProvider, @NotNull i ozonNetworkConfig) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(ozonNetworkConfig, "ozonNetworkConfig");
        this.f62326a = networkInfoProvider;
        this.f62327b = ozonNetworkConfig;
    }

    @Override // We.v.c
    @NotNull
    public final v create(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return this.f62327b.getIsPerfMetricsEnabled() ? new c(this.f62326a.getValue()) : v.NONE;
    }
}

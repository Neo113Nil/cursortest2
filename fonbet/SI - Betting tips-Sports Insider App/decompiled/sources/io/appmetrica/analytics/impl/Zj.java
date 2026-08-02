package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Zj implements ServiceComponentModuleConfig {

    /* renamed from: a, reason: collision with root package name */
    public final C0372o4 f13315a;

    public Zj(@NotNull C0372o4 c0372o4) {
        this.f13315a = c0372o4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f13315a.f14392m, Boolean.TRUE)).booleanValue();
    }
}

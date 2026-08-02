package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562vk implements ServiceModuleReporterComponentContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0030ak f14802a;

    /* renamed from: b, reason: collision with root package name */
    public final Zj f14803b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0562vk(@NotNull X4 x42, @NotNull C0372o4 c0372o4) {
        this.f14802a = new C0030ak(x42, null, 2, 0 == true ? 1 : 0);
        this.f14803b = new Zj(c0372o4);
    }

    @NotNull
    public final Zj a() {
        return this.f14803b;
    }

    @NotNull
    public final C0030ak b() {
        return this.f14802a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f14803b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f14802a;
    }
}

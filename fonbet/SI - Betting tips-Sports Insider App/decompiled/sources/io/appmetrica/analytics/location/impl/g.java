package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements LastKnownLocationExtractorProviderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final LastKnownLocationExtractorProvider f15021a;

    /* renamed from: b, reason: collision with root package name */
    public final c f15022b = new c("location-module-gpl");

    /* renamed from: c, reason: collision with root package name */
    public final v f15023c = new v("network", new f(), "location-module-network");

    /* renamed from: d, reason: collision with root package name */
    public final v f15024d = new v("gps", new e(), "location-module-gps");

    public g(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f15021a = lastKnownLocationExtractorProvider;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f15022b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f15024d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f15023c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f15021a;
    }
}

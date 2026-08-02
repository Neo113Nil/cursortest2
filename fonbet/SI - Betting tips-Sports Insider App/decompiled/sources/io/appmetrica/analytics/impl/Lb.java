package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Lb implements Kb, InterfaceC0290km, LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12525a;

    /* renamed from: b, reason: collision with root package name */
    public final Pb f12526b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationClient f12527c;

    /* renamed from: d, reason: collision with root package name */
    public final C0513tl f12528d;

    /* renamed from: e, reason: collision with root package name */
    public final C0612xk f12529e;

    /* renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f12530f;

    /* renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f12531g;

    public Lb(@NotNull Context context, @NotNull Pb pb2, @NotNull LocationClient locationClient) {
        this.f12525a = context;
        this.f12526b = pb2;
        this.f12527c = locationClient;
        Ub ub2 = new Ub();
        this.f12528d = new C0513tl(new C0247j5(ub2, C0353na.k().p().getAskForPermissionStrategy()));
        this.f12529e = C0353na.k().p();
        ((Sb) pb2).a(ub2, true);
        ((Sb) pb2).a(locationClient, true);
        this.f12530f = locationClient.getLastKnownExtractorProviderFactory();
        this.f12531g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0290km
    public final void a(@NotNull C0161fm c0161fm) {
        C0091d3 c0091d3 = c0161fm.f13774x;
        if (c0091d3 != null) {
            long j = c0091d3.f13560a;
            this.f12527c.updateCacheArguments(new CacheArguments(j, 2 * j));
        }
    }

    @NotNull
    public final C0513tl b() {
        return this.f12528d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f12530f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f12531g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f12528d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getSystemLocation() {
        return this.f12527c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getUserLocation() {
        return this.f12527c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void init() {
        this.f12527c.init(this.f12525a, this.f12528d, C0353na.I.f14324d.b(), this.f12529e.e());
        ModuleLocationSourcesServiceController f6 = this.f12529e.f();
        if (f6 != null) {
            f6.init();
        } else {
            LocationClient locationClient = this.f12527c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f12527c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Sb) this.f12526b).a(this.f12529e.g());
        C0353na.I.f14339u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
        ((Sb) this.f12526b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f12527c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f12527c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        this.f12527c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void b(@NotNull Object obj) {
        ((Sb) this.f12526b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f12527c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f12527c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(@NotNull Object obj) {
        ((Sb) this.f12526b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(boolean z5) {
        ((Sb) this.f12526b).a(z5);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(@Nullable Location location) {
        this.f12527c.updateUserLocation(location);
    }
}

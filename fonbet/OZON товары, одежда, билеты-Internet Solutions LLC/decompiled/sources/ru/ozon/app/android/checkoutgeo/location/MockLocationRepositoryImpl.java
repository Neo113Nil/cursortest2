package ru.ozon.app.android.checkoutgeo.location;

import BT.b;
import Bc.r;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.location.Location;
import cM.C5783b;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.flags.UserLocationFlag;
import ru.ozon.app.android.checkoutgeo.location.system.SystemLocationDatasource;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.version.AppVersionService;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B5\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u001b\u0010%\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutgeo/location/MockLocationRepositoryImpl;", "Lru/ozon/app/android/location/LocationRepository;", "LPc/a;", "Lru/ozon/app/android/checkoutgeo/location/LocationDataSource;", "locationProvider", "Lru/ozon/app/android/checkoutgeo/location/system/SystemLocationDatasource;", "systemLocationProvider", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "<init>", "(LPc/a;LPc/a;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/version/AppVersionService;)V", "", "disableMockLocation", "()V", "", "forceReal", "Lio/reactivex/y;", "Landroid/location/Location;", "getLastLocation", "(Z)Lio/reactivex/y;", "hasLocationPermission", "()Z", "Lio/reactivex/b;", "checkLocationSettings", "()Lio/reactivex/b;", "requestSingleLocation", "isLocationEnabled", "isNeedUseMockLocation", "LPc/a;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/version/AppVersionService;", "mockLocation$delegate", "LSc/j;", "getMockLocation", "()Landroid/location/Location;", "mockLocation", "mockDisabledByUser", "Z", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MockLocationRepositoryImpl implements LocationRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AppVersionService appVersionService;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final a<LocationDataSource> locationProvider;
    private boolean mockDisabledByUser;

    /* renamed from: mockLocation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mockLocation;

    @NotNull
    private final a<SystemLocationDatasource> systemLocationProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutgeo/location/MockLocationRepositoryImpl$Companion;", "", "<init>", "()V", "MOCK_PROVIDER", "", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MockLocationRepositoryImpl(@NotNull a<LocationDataSource> locationProvider, @NotNull a<SystemLocationDatasource> systemLocationProvider, @NotNull FeatureService featureService, @NotNull AppVersionService appVersionService) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(systemLocationProvider, "systemLocationProvider");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        this.locationProvider = locationProvider;
        this.systemLocationProvider = systemLocationProvider;
        this.featureService = featureService;
        this.appVersionService = appVersionService;
        this.mockLocation = k.b(MockLocationRepositoryImpl$mockLocation$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location getLastLocation$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Location) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Location getMockLocation() {
        return (Location) this.mockLocation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location requestSingleLocation$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Location) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.location.LocationRepository
    @NotNull
    public AbstractC7094b checkLocationSettings() {
        return this.locationProvider.get().checkLocationSettings();
    }

    @Override // ru.ozon.app.android.location.LocationRepository
    public void disableMockLocation() {
        this.mockDisabledByUser = true;
    }

    @Override // ru.ozon.app.android.location.LocationRepository
    @NotNull
    public y<Location> getLastLocation(boolean forceReal) {
        if (!isNeedUseMockLocation() || forceReal) {
            return this.locationProvider.get().getLocation();
        }
        y<Location> location = this.locationProvider.get().getLocation();
        C5783b c5783b = new C5783b(new MockLocationRepositoryImpl$getLastLocation$1(this));
        location.getClass();
        return new r(location, c5783b);
    }

    @Override // ru.ozon.app.android.location.LocationRepository
    public boolean hasLocationPermission() {
        return this.locationProvider.get().hasPermission();
    }

    @Override // ru.ozon.app.android.location.LocationRepository
    public boolean isLocationEnabled() {
        return this.locationProvider.get().isLocationEnabled();
    }

    @Override // ru.ozon.app.android.location.LocationRepository
    public boolean isNeedUseMockLocation() {
        if (AppVersionService.INSTANCE.isSelect(this.appVersionService)) {
            return false;
        }
        String stringKey = this.featureService.getStringKey(UserLocationFlag.INSTANCE);
        if (Intrinsics.d(stringKey, "fake")) {
            return true;
        }
        return Intrinsics.d(stringKey, "semi_fake") && !this.mockDisabledByUser;
    }

    @Override // ru.ozon.app.android.location.LocationRepository
    @NotNull
    public y<Location> requestSingleLocation(boolean forceReal) {
        if (!isNeedUseMockLocation() || forceReal) {
            return this.systemLocationProvider.get().requestSingleLocation();
        }
        y<Location> requestSingleLocation = this.systemLocationProvider.get().requestSingleLocation();
        b bVar = new b(new MockLocationRepositoryImpl$requestSingleLocation$1(this), 9);
        requestSingleLocation.getClass();
        return new r(requestSingleLocation, bVar);
    }
}

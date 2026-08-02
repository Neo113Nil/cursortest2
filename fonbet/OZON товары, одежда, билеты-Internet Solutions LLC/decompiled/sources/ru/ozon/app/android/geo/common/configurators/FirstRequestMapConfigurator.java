package ru.ozon.app.android.geo.common.configurators;

import A00.a;
import L00.i;
import QZ.g;
import android.content.Context;
import android.location.Location;
import i10.h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.LastLocationRepository;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/geo/common/configurators/FirstRequestMapConfigurator;", "LQZ/g;", "Lru/ozon/app/android/location/LocationRepository;", "locationRepository", "Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;", "lastLocationRepository", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/location/LocationRepository;Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;Landroid/content/Context;)V", "", "", "Ljava/io/Serializable;", "retrievePermanentParams", "()Ljava/util/Map;", "", "hasLocationPermission", "", "lat", "lng", "getPermanentParams", "(ZLjava/lang/Double;Ljava/lang/Double;)Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getOneTimeParams", "()Ljava/util/HashMap;", "Li10/h;", "state", "onInit", "(Li10/h;)Li10/h;", "Lru/ozon/app/android/location/LocationRepository;", "Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;", "Landroid/content/Context;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirstRequestMapConfigurator implements g {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final LastLocationRepository lastLocationRepository;

    @NotNull
    private final LocationRepository locationRepository;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/geo/common/configurators/FirstRequestMapConfigurator$Companion;", "", "<init>", "()V", "PARAMS_KEY_IS_GEO_LOCATION", "", "PARAMS_KEY_MAP", "PARAMS_KEY_CURRENT_LOCATION", "PARAMS_KEY_LAT", "PARAMS_KEY_LNG", "PARAMS_KEY_SCREEN_SIZE", "PARAMS_KEY_HEIGHT", "PARAMS_KEY_WIDTH", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FirstRequestMapConfigurator(@NotNull LocationRepository locationRepository, @NotNull LastLocationRepository lastLocationRepository, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(locationRepository, "locationRepository");
        Intrinsics.checkNotNullParameter(lastLocationRepository, "lastLocationRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.locationRepository = locationRepository;
        this.lastLocationRepository = lastLocationRepository;
        this.context = context;
    }

    private final HashMap<String, Serializable> getOneTimeParams() {
        return U.f(new Pair("screenSize", U.f(new Pair("width", Integer.valueOf(this.context.getResources().getDisplayMetrics().widthPixels)), new Pair("height", Integer.valueOf(this.context.getResources().getDisplayMetrics().heightPixels)))));
    }

    private final Map<String, Serializable> getPermanentParams(boolean hasLocationPermission, Double lat, Double lng) {
        HashMap f7 = U.f(new Pair("map", U.f(new Pair("isGeoLocation", Boolean.valueOf(hasLocationPermission)))));
        if (lat != null && lng != null) {
            f7.put("currentLocation", U.f(new Pair("latitude", lat), new Pair("longitude", lng)));
        }
        return f7;
    }

    static /* synthetic */ Map getPermanentParams$default(FirstRequestMapConfigurator firstRequestMapConfigurator, boolean z11, Double d11, Double d12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            d11 = null;
        }
        if ((i11 & 4) != 0) {
            d12 = null;
        }
        return firstRequestMapConfigurator.getPermanentParams(z11, d11, d12);
    }

    private final Map<String, Serializable> retrievePermanentParams() {
        Map<String, Serializable> permanentParams;
        boolean hasLocationPermission = this.locationRepository.hasLocationPermission();
        Location lastLocation = this.lastLocationRepository.getLastLocation();
        return (lastLocation == null || (permanentParams = getPermanentParams(hasLocationPermission, Double.valueOf(lastLocation.getLatitude()), Double.valueOf(lastLocation.getLongitude()))) == null) ? getPermanentParams$default(this, hasLocationPermission, null, null, 6, null) : permanentParams;
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h hVar, @NotNull L00.g gVar, @NotNull i iVar) {
        g.a.a(hVar, gVar, iVar);
        return gVar;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h hVar, @NotNull a aVar) {
        g.a.b(hVar, aVar);
        return hVar;
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        state.f().putAll(retrievePermanentParams());
        HashMap<String, Serializable> oneTimeParams = getOneTimeParams();
        i10.g gVar = i10.g.POST;
        return h.a(state, null, gVar, null, new h.a(oneTimeParams, gVar), null, 45);
    }
}

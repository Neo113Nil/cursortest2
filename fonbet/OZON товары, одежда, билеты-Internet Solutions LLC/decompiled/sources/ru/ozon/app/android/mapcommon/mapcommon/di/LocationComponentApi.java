package ru.ozon.app.android.mapcommon.mapcommon.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AddressLocalStore;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.LastLocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferences;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/location/AreaLocalStore;", "getAreaLocalStore", "()Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/location/AddressLocalStore;", "getAddressLocalStore", "()Lru/ozon/app/android/location/AddressLocalStore;", "Lru/ozon/app/android/location/ComposerLocationRepository;", "getComposerLocationRepository", "()Lru/ozon/app/android/location/ComposerLocationRepository;", "Lru/ozon/app/android/location/LocationRepository;", "getLocationRepository", "()Lru/ozon/app/android/location/LocationRepository;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "getOzonGeoProxyClient", "()Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferences;", "getMapPreferences", "()Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferences;", "Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;", "getLastLocationRepository", "()Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "getMapUpdateManager", "()Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LocationComponentApi extends InterfaceC6958a {
    @NotNull
    AddressLocalStore getAddressLocalStore();

    @NotNull
    AreaLocalStore getAreaLocalStore();

    @NotNull
    ComposerLocationRepository getComposerLocationRepository();

    @NotNull
    LastLocationRepository getLastLocationRepository();

    @NotNull
    LocationRepository getLocationRepository();

    @NotNull
    MapPreferences getMapPreferences();

    @NotNull
    MapUpdateManager getMapUpdateManager();

    @NotNull
    OzonGeoProxyClient getOzonGeoProxyClient();
}

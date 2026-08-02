package com.yandex.mapkit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.DummyLocationManager;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.OffscreenMapWindow;
import com.yandex.mapkit.offline_cache.OfflineCacheManager;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.mapkit.storage.StorageManager;
import com.yandex.mapkit.traffic.TrafficLayer;
import com.yandex.mapkit.user_location.UserLocationLayer;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes9.dex */
public interface MapKit {
    @NonNull
    DummyLocationManager createDummyLocationManager();

    @NonNull
    LocationManager createLocationManager();

    @NonNull
    LocationSimulator createLocationSimulator();

    @NonNull
    LocationSimulator createLocationSimulator(@NonNull Polyline polyline);

    @NonNull
    MapWindow createMapWindow(@NonNull PlatformView platformView);

    @NonNull
    MapWindow createMapWindow(@NonNull PlatformView platformView, float f7);

    @NonNull
    OffscreenMapWindow createOffscreenMapWindow(int i11, int i12);

    @NonNull
    OffscreenMapWindow createOffscreenMapWindow(int i11, int i12, float f7);

    @NonNull
    RoadEventsManager createRoadEventsManager();

    @NonNull
    TrafficLayer createTrafficLayer(@NonNull MapWindow mapWindow);

    @NonNull
    UserLocationLayer createUserLocationLayer(@NonNull MapWindow mapWindow);

    @NonNull
    OfflineCacheManager getOfflineCacheManager();

    @NonNull
    StorageManager getStorageManager();

    @NonNull
    String getVersion();

    boolean isValid();

    void onStart();

    void onStop();

    void onTerminate();

    void resetLocationManagerToDefault();

    void setApiKey(@NonNull String str);

    void setLocationManager(@NonNull LocationManager locationManager);

    void setUserId(@NonNull String str);
}

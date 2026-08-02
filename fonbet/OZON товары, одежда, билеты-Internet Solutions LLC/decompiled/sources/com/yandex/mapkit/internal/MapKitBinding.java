package com.yandex.mapkit.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.MapKit;
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
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes9.dex */
public class MapKitBinding implements MapKit {
    private final NativeObject nativeObject;

    protected MapKitBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native DummyLocationManager createDummyLocationManager();

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native LocationManager createLocationManager();

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native LocationSimulator createLocationSimulator();

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native LocationSimulator createLocationSimulator(@NonNull Polyline polyline);

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native MapWindow createMapWindow(@NonNull PlatformView platformView);

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native MapWindow createMapWindow(@NonNull PlatformView platformView, float f7);

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native OffscreenMapWindow createOffscreenMapWindow(int i11, int i12);

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native OffscreenMapWindow createOffscreenMapWindow(int i11, int i12, float f7);

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native RoadEventsManager createRoadEventsManager();

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native TrafficLayer createTrafficLayer(@NonNull MapWindow mapWindow);

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native UserLocationLayer createUserLocationLayer(@NonNull MapWindow mapWindow);

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native OfflineCacheManager getOfflineCacheManager();

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native StorageManager getStorageManager();

    @Override // com.yandex.mapkit.MapKit
    @NonNull
    public native String getVersion();

    @Override // com.yandex.mapkit.MapKit
    public native boolean isValid();

    @Override // com.yandex.mapkit.MapKit
    public native void onStart();

    @Override // com.yandex.mapkit.MapKit
    public native void onStop();

    @Override // com.yandex.mapkit.MapKit
    public native void onTerminate();

    @Override // com.yandex.mapkit.MapKit
    public native void resetLocationManagerToDefault();

    @Override // com.yandex.mapkit.MapKit
    public native void setApiKey(@NonNull String str);

    @Override // com.yandex.mapkit.MapKit
    public native void setLocationManager(@NonNull LocationManager locationManager);

    @Override // com.yandex.mapkit.MapKit
    public native void setUserId(@NonNull String str);
}

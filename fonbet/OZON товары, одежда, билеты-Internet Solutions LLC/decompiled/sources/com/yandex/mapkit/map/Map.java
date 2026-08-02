package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.indoor.IndoorStateListener;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import com.yandex.mapkit.layers.Layer;
import com.yandex.mapkit.layers.LayerOptions;
import com.yandex.mapkit.logo.Logo;

/* loaded from: classes9.dex */
public interface Map {

    public interface CameraCallback {
        void onMoveFinished(boolean z11);
    }

    void addCameraListener(@NonNull CameraListener cameraListener);

    void addIndoorStateListener(@NonNull IndoorStateListener indoorStateListener);

    void addInputListener(@NonNull InputListener inputListener);

    @NonNull
    RootMapObjectCollection addMapObjectLayer(@NonNull String str);

    void addTapListener(@NonNull GeoObjectTapListener geoObjectTapListener);

    @NonNull
    Layer addTileLayer(@NonNull String str, @NonNull LayerOptions layerOptions, @NonNull CreateTileDataSource createTileDataSource);

    @NonNull
    CameraPosition cameraPosition(@NonNull Geometry geometry);

    @NonNull
    CameraPosition cameraPosition(@NonNull Geometry geometry, float f7, float f11, ScreenRect screenRect);

    @NonNull
    CameraPosition cameraPosition(@NonNull Geometry geometry, @NonNull ScreenRect screenRect);

    void deselectGeoObject();

    @NonNull
    CameraBounds getCameraBounds();

    @NonNull
    CameraPosition getCameraPosition();

    @NonNull
    Logo getLogo();

    @NonNull
    RootMapObjectCollection getMapObjects();

    @NonNull
    MapType getMapType();

    @NonNull
    MapMode getMode();

    Integer getPoiLimit();

    @NonNull
    VisibleRegion getVisibleRegion();

    boolean isAwesomeModelsEnabled();

    boolean isFastTapEnabled();

    boolean isHdModeEnabled();

    boolean isIndoorEnabled();

    boolean isNightModeEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScrollGesturesEnabled();

    boolean isTiltGesturesEnabled();

    boolean isValid();

    boolean isZoomGesturesEnabled();

    void move(@NonNull CameraPosition cameraPosition);

    void move(@NonNull CameraPosition cameraPosition, @NonNull Animation animation, CameraCallback cameraCallback);

    @NonNull
    Projection projection();

    void removeCameraListener(@NonNull CameraListener cameraListener);

    void removeIndoorStateListener(@NonNull IndoorStateListener indoorStateListener);

    void removeInputListener(@NonNull InputListener inputListener);

    void removeTapListener(@NonNull GeoObjectTapListener geoObjectTapListener);

    void resetMapStyles();

    void selectGeoObject(@NonNull GeoObjectSelectionMetadata geoObjectSelectionMetadata);

    void set2DMode(boolean z11);

    void setAwesomeModelsEnabled(boolean z11);

    void setFastTapEnabled(boolean z11);

    void setHdModeEnabled(boolean z11);

    void setIndoorEnabled(boolean z11);

    void setMapLoadedListener(MapLoadedListener mapLoadedListener);

    boolean setMapStyle(int i11, @NonNull String str);

    boolean setMapStyle(@NonNull String str);

    void setMapType(@NonNull MapType mapType);

    void setMode(@NonNull MapMode mapMode);

    void setNightModeEnabled(boolean z11);

    void setPoiLimit(Integer num);

    void setRotateGesturesEnabled(boolean z11);

    void setScrollGesturesEnabled(boolean z11);

    void setTiltGesturesEnabled(boolean z11);

    void setZoomGesturesEnabled(boolean z11);

    void startTileLoadMetricsCapture();

    @NonNull
    String stopTileLoadMetricsCapture();

    @NonNull
    VisibleRegion visibleRegion(@NonNull CameraPosition cameraPosition);

    void wipe();
}

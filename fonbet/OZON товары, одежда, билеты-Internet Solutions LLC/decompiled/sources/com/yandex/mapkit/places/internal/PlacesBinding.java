package com.yandex.mapkit.places.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.places.Places;
import com.yandex.mapkit.places.mrc.MrcPhotoPlayer;
import com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer;
import com.yandex.mapkit.places.panorama.PanoramaLayer;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.mapkit.places.panorama.Player;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes9.dex */
public class PlacesBinding implements Places {
    private final NativeObject nativeObject;

    protected PlacesBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.Places
    @NonNull
    public native MrcPhotoPlayer createMrcPhotoPlayer(@NonNull PlatformView platformView);

    @Override // com.yandex.mapkit.places.Places
    @NonNull
    public native MrcPhotoTrackPlayer createMrcPhotoTrackPlayer(@NonNull PlatformView platformView);

    @Override // com.yandex.mapkit.places.Places
    @NonNull
    public native PanoramaLayer createPanoramaLayer(@NonNull MapWindow mapWindow);

    @Override // com.yandex.mapkit.places.Places
    @NonNull
    public native Player createPanoramaPlayer(@NonNull PlatformView platformView);

    @Override // com.yandex.mapkit.places.Places
    @NonNull
    public native Player createPanoramaPlayer(@NonNull PlatformView platformView, float f7);

    @Override // com.yandex.mapkit.places.Places
    @NonNull
    public native PanoramaService createPanoramaService();

    @Override // com.yandex.mapkit.places.Places
    public native boolean isValid();
}

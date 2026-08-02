package com.yandex.mapkit.places;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.places.mrc.MrcPhotoPlayer;
import com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer;
import com.yandex.mapkit.places.panorama.PanoramaLayer;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.mapkit.places.panorama.Player;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes9.dex */
public interface Places {
    @NonNull
    MrcPhotoPlayer createMrcPhotoPlayer(@NonNull PlatformView platformView);

    @NonNull
    MrcPhotoTrackPlayer createMrcPhotoTrackPlayer(@NonNull PlatformView platformView);

    @NonNull
    PanoramaLayer createPanoramaLayer(@NonNull MapWindow mapWindow);

    @NonNull
    Player createPanoramaPlayer(@NonNull PlatformView platformView);

    @NonNull
    Player createPanoramaPlayer(@NonNull PlatformView platformView, float f7);

    @NonNull
    PanoramaService createPanoramaService();

    boolean isValid();
}

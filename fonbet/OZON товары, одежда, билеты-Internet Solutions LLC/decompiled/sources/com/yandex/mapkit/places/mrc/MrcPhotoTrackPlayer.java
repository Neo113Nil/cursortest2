package com.yandex.mapkit.places.mrc;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.PolylinePosition;

/* loaded from: classes9.dex */
public interface MrcPhotoTrackPlayer {

    public enum PlaybackSpeed {
        X1,
        X2,
        X4,
        X8
    }

    void disableMove();

    void enableMove();

    String getPhotoId();

    PolylinePosition getPosition();

    boolean isIsPlaying();

    boolean isValid();

    void openPhotoAt(@NonNull PolylinePosition polylinePosition);

    void play();

    void reset();

    void stop();
}

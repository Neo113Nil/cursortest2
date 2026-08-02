package com.yandex.mapkit.places.mrc.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class MrcPhotoTrackPlayerBinding implements MrcPhotoTrackPlayer {
    private final NativeObject nativeObject;

    protected MrcPhotoTrackPlayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void disableMove();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void enableMove();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native String getPhotoId();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native PolylinePosition getPosition();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native boolean isIsPlaying();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void openPhotoAt(@NonNull PolylinePosition polylinePosition);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void play();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void reset();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void stop();
}

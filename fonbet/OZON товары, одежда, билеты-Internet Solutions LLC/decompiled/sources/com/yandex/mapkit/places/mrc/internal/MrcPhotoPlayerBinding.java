package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.places.mrc.MrcPhotoPlayer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class MrcPhotoPlayerBinding implements MrcPhotoPlayer {
    private final NativeObject nativeObject;

    protected MrcPhotoPlayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void disableMove();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void enableMove();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native String getPhotoId();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native boolean moveEnabled();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void reset();
}

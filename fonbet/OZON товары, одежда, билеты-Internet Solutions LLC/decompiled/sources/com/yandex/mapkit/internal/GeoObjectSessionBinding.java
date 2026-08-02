package com.yandex.mapkit.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.GeoObjectSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class GeoObjectSessionBinding implements GeoObjectSession {
    private final NativeObject nativeObject;

    protected GeoObjectSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.GeoObjectSession
    public native void cancel();

    @Override // com.yandex.mapkit.GeoObjectSession
    public native void retry(@NonNull GeoObjectSession.GeoObjectListener geoObjectListener);
}

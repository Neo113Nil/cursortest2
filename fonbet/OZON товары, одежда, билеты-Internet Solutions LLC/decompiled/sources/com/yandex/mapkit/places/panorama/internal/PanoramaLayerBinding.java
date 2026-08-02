package com.yandex.mapkit.places.panorama.internal;

import com.yandex.mapkit.places.panorama.PanoramaLayer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class PanoramaLayerBinding implements PanoramaLayer {
    private final NativeObject nativeObject;

    protected PanoramaLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.panorama.PanoramaLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.places.panorama.PanoramaLayer
    public native void setAirshipPanoramaVisible(boolean z11);

    @Override // com.yandex.mapkit.places.panorama.PanoramaLayer
    public native void setStreetPanoramaVisible(boolean z11);
}

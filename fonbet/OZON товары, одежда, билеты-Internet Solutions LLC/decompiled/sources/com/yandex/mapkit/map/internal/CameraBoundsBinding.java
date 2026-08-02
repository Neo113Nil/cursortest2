package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.map.CameraBounds;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class CameraBoundsBinding implements CameraBounds {
    private final NativeObject nativeObject;

    protected CameraBoundsBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.CameraBounds
    public native BoundingBox getLatLngBounds();

    @Override // com.yandex.mapkit.map.CameraBounds
    public native float getMaxZoom();

    @Override // com.yandex.mapkit.map.CameraBounds
    public native float getMinZoom();

    @Override // com.yandex.mapkit.map.CameraBounds
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.CameraBounds
    public native void resetMinMaxZoomPreference();

    @Override // com.yandex.mapkit.map.CameraBounds
    public native void setLatLngBounds(BoundingBox boundingBox);

    @Override // com.yandex.mapkit.map.CameraBounds
    public native void setMaxZoomPreference(float f7);

    @Override // com.yandex.mapkit.map.CameraBounds
    public native void setMinZoomPreference(float f7);
}

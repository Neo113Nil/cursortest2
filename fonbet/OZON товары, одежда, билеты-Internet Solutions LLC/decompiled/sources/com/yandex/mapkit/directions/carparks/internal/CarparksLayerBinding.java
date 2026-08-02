package com.yandex.mapkit.directions.carparks.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class CarparksLayerBinding implements CarparksLayer {
    private final NativeObject nativeObject;

    protected CarparksLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.carparks.CarparksLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.directions.carparks.CarparksLayer
    public native boolean isVisible();

    @Override // com.yandex.mapkit.directions.carparks.CarparksLayer
    public native void resetCarparksStyles();

    @Override // com.yandex.mapkit.directions.carparks.CarparksLayer
    public native boolean setCarparksStyle(int i11, @NonNull String str);

    @Override // com.yandex.mapkit.directions.carparks.CarparksLayer
    public native boolean setCarparksStyle(@NonNull String str);

    @Override // com.yandex.mapkit.directions.carparks.CarparksLayer
    public native void setVisible(boolean z11);
}

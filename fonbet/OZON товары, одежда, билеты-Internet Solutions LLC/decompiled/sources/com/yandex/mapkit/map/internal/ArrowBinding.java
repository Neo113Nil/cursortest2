package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.map.Arrow;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class ArrowBinding implements Arrow {
    private final NativeObject nativeObject;

    protected ArrowBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.Arrow
    public native int getFillColor();

    @Override // com.yandex.mapkit.map.Arrow
    public native float getLength();

    @Override // com.yandex.mapkit.map.Arrow
    public native int getOutlineColor();

    @Override // com.yandex.mapkit.map.Arrow
    public native float getOutlineWidth();

    @Override // com.yandex.mapkit.map.Arrow
    @NonNull
    public native PolylinePosition getPosition();

    @Override // com.yandex.mapkit.map.Arrow
    public native float getTriangleHeight();

    @Override // com.yandex.mapkit.map.Arrow
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.Arrow
    public native boolean isVisible();

    @Override // com.yandex.mapkit.map.Arrow
    public native void setFillColor(int i11);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setLength(float f7);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setOutlineColor(int i11);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setOutlineWidth(float f7);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setTriangleHeight(float f7);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setVisible(boolean z11);
}

package com.yandex.mapkit.geometry.geo.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.geo.PolylineIndex;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class PolylineIndexBinding implements PolylineIndex {
    private final NativeObject nativeObject;

    protected PolylineIndexBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.geometry.geo.PolylineIndex
    public native PolylinePosition closestPolylinePosition(@NonNull Point point, @NonNull PolylinePosition polylinePosition, @NonNull PolylinePosition polylinePosition2, double d11);

    @Override // com.yandex.mapkit.geometry.geo.PolylineIndex
    public native PolylinePosition closestPolylinePosition(@NonNull Point point, @NonNull PolylineIndex.Priority priority, double d11);
}

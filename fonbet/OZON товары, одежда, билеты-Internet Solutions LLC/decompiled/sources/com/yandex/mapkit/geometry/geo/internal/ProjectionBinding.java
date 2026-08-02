package com.yandex.mapkit.geometry.geo.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class ProjectionBinding implements Projection {
    private final NativeObject nativeObject;

    protected ProjectionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.geometry.geo.Projection
    public native boolean isValid();

    @Override // com.yandex.mapkit.geometry.geo.Projection
    @NonNull
    public native XYPoint worldToXY(@NonNull Point point, int i11);

    @Override // com.yandex.mapkit.geometry.geo.Projection
    @NonNull
    public native Point xyToWorld(@NonNull XYPoint xYPoint, int i11);
}

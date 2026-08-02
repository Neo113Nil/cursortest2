package com.yandex.mapkit.geometry.geo;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes9.dex */
public interface Projection {
    boolean isValid();

    @NonNull
    XYPoint worldToXY(@NonNull Point point, int i11);

    @NonNull
    Point xyToWorld(@NonNull XYPoint xYPoint, int i11);
}

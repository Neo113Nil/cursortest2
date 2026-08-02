package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;

/* loaded from: classes9.dex */
public class VisibleRegionUtils {
    @NonNull
    public static native BoundingBox getBounds(@NonNull VisibleRegion visibleRegion);

    @NonNull
    public static native Geometry toPolygon(@NonNull VisibleRegion visibleRegion);
}

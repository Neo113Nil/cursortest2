package com.yandex.mapkit.geometry.geo;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;

/* loaded from: classes9.dex */
public interface PolylineIndex {

    public enum Priority {
        CLOSEST_TO_RAW_POINT,
        CLOSEST_TO_START
    }

    PolylinePosition closestPolylinePosition(@NonNull Point point, @NonNull PolylinePosition polylinePosition, @NonNull PolylinePosition polylinePosition2, double d11);

    PolylinePosition closestPolylinePosition(@NonNull Point point, @NonNull Priority priority, double d11);
}

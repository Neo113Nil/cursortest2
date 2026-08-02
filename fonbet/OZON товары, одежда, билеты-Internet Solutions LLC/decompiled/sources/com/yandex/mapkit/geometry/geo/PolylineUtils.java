package com.yandex.mapkit.geometry.geo;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;

/* loaded from: classes9.dex */
public class PolylineUtils {
    @NonNull
    public static native PolylinePosition advancePolylinePosition(@NonNull Polyline polyline, @NonNull PolylinePosition polylinePosition, double d11);

    @NonNull
    public static native PolylineIndex createPolylineIndex(@NonNull Polyline polyline);

    public static native double distanceBetweenPolylinePositions(@NonNull Polyline polyline, @NonNull PolylinePosition polylinePosition, @NonNull PolylinePosition polylinePosition2);

    @NonNull
    public static native Point pointByPolylinePosition(@NonNull Polyline polyline, @NonNull PolylinePosition polylinePosition);

    @NonNull
    public static native List<PolylinePosition> positionsOfFork(@NonNull Polyline polyline, @NonNull PolylinePosition polylinePosition, @NonNull Polyline polyline2, @NonNull PolylinePosition polylinePosition2);
}

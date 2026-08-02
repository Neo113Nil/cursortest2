package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.navigation.JamStyle;

/* loaded from: classes9.dex */
public class RouteHelper {
    public static native void addJams(@NonNull PolylineMapObject polylineMapObject, @NonNull DrivingRoute drivingRoute);

    public static native void addManeuvers(@NonNull PolylineMapObject polylineMapObject, @NonNull DrivingRoute drivingRoute);

    public static native void applyJamStyle(@NonNull PolylineMapObject polylineMapObject, @NonNull JamStyle jamStyle);

    public static native void applyManeuverStyle(@NonNull PolylineMapObject polylineMapObject, @NonNull ManeuverStyle maneuverStyle);

    @NonNull
    public static native JamStyle createDefaultJamStyle();

    @NonNull
    public static native ManeuverStyle createDefaultManeuverStyle();

    @NonNull
    public static native JamStyle createDisabledJamStyle();

    public static native void updatePolyline(@NonNull PolylineMapObject polylineMapObject, @NonNull DrivingRoute drivingRoute, @NonNull JamStyle jamStyle, boolean z11);
}

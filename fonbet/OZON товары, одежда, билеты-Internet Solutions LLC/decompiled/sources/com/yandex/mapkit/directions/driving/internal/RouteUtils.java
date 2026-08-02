package com.yandex.mapkit.directions.driving.internal;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;

/* loaded from: classes9.dex */
public class RouteUtils {
    public static native DrivingRoute dropRouteViaPoints(DrivingRoute drivingRoute);

    public static native DrivingRoute filterRoutesBySharing(List<DrivingRoute> list, int i11);

    public static native List<RequestPoint> getRequestPointsAfterPosition(PolylinePosition polylinePosition, DrivingRoute drivingRoute);
}

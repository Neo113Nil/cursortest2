package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import com.yandex.mapkit.geometry.Polyline;
import java.util.List;

/* loaded from: classes9.dex */
public interface DrivingRouter {
    @NonNull
    DrivingSession matchRoute(@NonNull Polyline polyline, @NonNull DrivingOptions drivingOptions, @NonNull VehicleOptions vehicleOptions, @NonNull DrivingSession.DrivingRouteListener drivingRouteListener);

    @NonNull
    DrivingSession requestRoutes(@NonNull List<RequestPoint> list, @NonNull DrivingOptions drivingOptions, @NonNull VehicleOptions vehicleOptions, @NonNull DrivingSession.DrivingRouteListener drivingRouteListener);

    @NonNull
    DrivingSummarySession requestRoutesSummary(@NonNull List<RequestPoint> list, @NonNull DrivingOptions drivingOptions, @NonNull VehicleOptions vehicleOptions, @NonNull DrivingSummarySession.DrivingSummaryListener drivingSummaryListener);
}

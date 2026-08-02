package com.yandex.mapkit.directions.driving.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class DrivingRouterBinding implements DrivingRouter {
    private final NativeObject nativeObject;

    protected DrivingRouterBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    @NonNull
    public native DrivingSession matchRoute(@NonNull Polyline polyline, @NonNull DrivingOptions drivingOptions, @NonNull VehicleOptions vehicleOptions, @NonNull DrivingSession.DrivingRouteListener drivingRouteListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    @NonNull
    public native DrivingSession requestRoutes(@NonNull List<RequestPoint> list, @NonNull DrivingOptions drivingOptions, @NonNull VehicleOptions vehicleOptions, @NonNull DrivingSession.DrivingRouteListener drivingRouteListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRouter
    @NonNull
    public native DrivingSummarySession requestRoutesSummary(@NonNull List<RequestPoint> list, @NonNull DrivingOptions drivingOptions, @NonNull VehicleOptions vehicleOptions, @NonNull DrivingSummarySession.DrivingSummaryListener drivingSummaryListener);
}

package com.yandex.mapkit.transport.bicycle;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.bicycle.Session;
import com.yandex.mapkit.transport.bicycle.SummarySession;
import java.util.List;

@Deprecated
/* loaded from: classes9.dex */
public interface BicycleRouter {
    @NonNull
    Session requestRoutes(@NonNull List<RequestPoint> list, @NonNull VehicleType vehicleType, @NonNull Session.RouteListener routeListener);

    @NonNull
    SummarySession requestRoutesSummary(@NonNull List<RequestPoint> list, @NonNull VehicleType vehicleType, @NonNull SummarySession.SummaryListener summaryListener);

    @NonNull
    Session resolveUri(@NonNull String str, @NonNull Session.RouteListener routeListener);
}

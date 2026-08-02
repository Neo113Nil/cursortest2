package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import java.util.List;

/* loaded from: classes9.dex */
public interface MasstransitRouter {
    @NonNull
    Session requestRoutes(@NonNull List<RequestPoint> list, @NonNull TransitOptions transitOptions, @NonNull RouteOptions routeOptions, @NonNull Session.RouteListener routeListener);

    @NonNull
    SummarySession requestRoutesSummary(@NonNull List<RequestPoint> list, @NonNull TransitOptions transitOptions, @NonNull RouteOptions routeOptions, @NonNull SummarySession.SummaryListener summaryListener);

    @NonNull
    Session resolveUri(@NonNull String str, @NonNull TimeOptions timeOptions, @NonNull Session.RouteListener routeListener);

    @NonNull
    MasstransitRouteSerializer routeSerializer();
}

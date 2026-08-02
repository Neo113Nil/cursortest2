package com.yandex.mapkit.transport.masstransit.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class PedestrianRouterBinding implements PedestrianRouter {
    private final NativeObject nativeObject;

    protected PedestrianRouterBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.PedestrianRouter
    @NonNull
    public native Session requestRoutes(@NonNull List<RequestPoint> list, @NonNull TimeOptions timeOptions, @NonNull RouteOptions routeOptions, @NonNull Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.masstransit.PedestrianRouter
    @NonNull
    public native SummarySession requestRoutesSummary(@NonNull RequestPoint requestPoint, @NonNull List<RequestPoint> list, @NonNull TimeOptions timeOptions, @NonNull RouteOptions routeOptions, @NonNull SummarySession.SummaryListener summaryListener);

    @Override // com.yandex.mapkit.transport.masstransit.PedestrianRouter
    @NonNull
    public native SummarySession requestRoutesSummary(@NonNull List<RequestPoint> list, @NonNull TimeOptions timeOptions, @NonNull RouteOptions routeOptions, @NonNull SummarySession.SummaryListener summaryListener);

    @Override // com.yandex.mapkit.transport.masstransit.PedestrianRouter
    @NonNull
    public native Session resolveUri(@NonNull String str, @NonNull TimeOptions timeOptions, @NonNull Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.masstransit.PedestrianRouter
    @NonNull
    public native MasstransitRouteSerializer routeSerializer();
}

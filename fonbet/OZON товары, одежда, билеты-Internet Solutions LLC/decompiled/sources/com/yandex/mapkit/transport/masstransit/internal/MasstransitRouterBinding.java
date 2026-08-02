package com.yandex.mapkit.transport.masstransit.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.mapkit.transport.masstransit.TransitOptions;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class MasstransitRouterBinding implements MasstransitRouter {
    private final NativeObject nativeObject;

    protected MasstransitRouterBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouter
    @NonNull
    public native Session requestRoutes(@NonNull List<RequestPoint> list, @NonNull TransitOptions transitOptions, @NonNull RouteOptions routeOptions, @NonNull Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouter
    @NonNull
    public native SummarySession requestRoutesSummary(@NonNull List<RequestPoint> list, @NonNull TransitOptions transitOptions, @NonNull RouteOptions routeOptions, @NonNull SummarySession.SummaryListener summaryListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouter
    @NonNull
    public native Session resolveUri(@NonNull String str, @NonNull TimeOptions timeOptions, @NonNull Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouter
    @NonNull
    public native MasstransitRouteSerializer routeSerializer();
}

package com.yandex.mapkit.transport.bicycle.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.bicycle.BicycleRouter;
import com.yandex.mapkit.transport.bicycle.Session;
import com.yandex.mapkit.transport.bicycle.SummarySession;
import com.yandex.mapkit.transport.bicycle.VehicleType;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class BicycleRouterBinding implements BicycleRouter {
    private final NativeObject nativeObject;

    protected BicycleRouterBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.bicycle.BicycleRouter
    @NonNull
    public native Session requestRoutes(@NonNull List<RequestPoint> list, @NonNull VehicleType vehicleType, @NonNull Session.RouteListener routeListener);

    @Override // com.yandex.mapkit.transport.bicycle.BicycleRouter
    @NonNull
    public native SummarySession requestRoutesSummary(@NonNull List<RequestPoint> list, @NonNull VehicleType vehicleType, @NonNull SummarySession.SummaryListener summaryListener);

    @Override // com.yandex.mapkit.transport.bicycle.BicycleRouter
    @NonNull
    public native Session resolveUri(@NonNull String str, @NonNull Session.RouteListener routeListener);
}

package com.yandex.mapkit.transport.bicycle;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes9.dex */
public interface Session {

    public interface RouteListener {
        void onBicycleRoutes(@NonNull List<Route> list);

        void onBicycleRoutesError(@NonNull Error error);
    }

    void cancel();

    void retry(@NonNull RouteListener routeListener);
}

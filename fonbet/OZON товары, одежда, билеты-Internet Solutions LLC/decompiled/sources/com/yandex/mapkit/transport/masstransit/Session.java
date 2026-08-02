package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes9.dex */
public interface Session {

    public interface RouteListener {
        void onMasstransitRoutes(@NonNull List<Route> list);

        void onMasstransitRoutesError(@NonNull Error error);
    }

    void cancel();

    void retry(@NonNull RouteListener routeListener);
}

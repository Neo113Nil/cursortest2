package com.yandex.mapkit.directions;

import androidx.annotation.NonNull;
import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.map.MapWindow;

/* loaded from: classes9.dex */
public interface Directions {
    @NonNull
    CarparksLayer createCarparksLayer(@NonNull MapWindow mapWindow);

    @NonNull
    DrivingRouter createDrivingRouter(@NonNull DrivingRouterType drivingRouterType);

    boolean isValid();
}

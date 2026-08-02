package com.yandex.mapkit.directions.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.directions.Directions;
import com.yandex.mapkit.directions.carparks.CarparksLayer;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class DirectionsBinding implements Directions {
    private final NativeObject nativeObject;

    protected DirectionsBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.Directions
    @NonNull
    public native CarparksLayer createCarparksLayer(@NonNull MapWindow mapWindow);

    @Override // com.yandex.mapkit.directions.Directions
    @NonNull
    public native DrivingRouter createDrivingRouter(@NonNull DrivingRouterType drivingRouterType);

    @Override // com.yandex.mapkit.directions.Directions
    public native boolean isValid();
}

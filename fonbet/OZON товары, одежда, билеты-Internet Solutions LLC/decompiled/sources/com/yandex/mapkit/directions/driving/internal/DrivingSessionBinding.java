package com.yandex.mapkit.directions.driving.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class DrivingSessionBinding implements DrivingSession {
    private final NativeObject nativeObject;

    protected DrivingSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession
    public native void cancel();

    @Override // com.yandex.mapkit.directions.driving.DrivingSession
    public native void retry(@NonNull DrivingSession.DrivingRouteListener drivingRouteListener);
}

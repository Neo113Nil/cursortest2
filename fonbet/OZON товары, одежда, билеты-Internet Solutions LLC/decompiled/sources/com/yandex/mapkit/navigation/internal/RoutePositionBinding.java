package com.yandex.mapkit.navigation.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.RoutePosition;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class RoutePositionBinding implements RoutePosition {
    private final NativeObject nativeObject;

    protected RoutePositionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.RoutePosition
    @NonNull
    public native RoutePosition advance(double d11);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native Double distanceTo(@NonNull RoutePosition routePosition);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native double distanceToFinish();

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native boolean equals(@NonNull RoutePosition routePosition);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    @NonNull
    public native Point getPoint();

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native double heading();

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native boolean onRoute(@NonNull String str);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native PolylinePosition positionOnRoute(@NonNull String str);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native boolean precedes(@NonNull RoutePosition routePosition);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native boolean precedesOrEquals(@NonNull RoutePosition routePosition);

    @Override // com.yandex.mapkit.navigation.RoutePosition
    public native double timeToFinish();
}

package com.yandex.mapkit.navigation;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;

/* loaded from: classes9.dex */
public interface RoutePosition {
    @NonNull
    RoutePosition advance(double d11);

    Double distanceTo(@NonNull RoutePosition routePosition);

    double distanceToFinish();

    boolean equals(@NonNull RoutePosition routePosition);

    @NonNull
    Point getPoint();

    double heading();

    boolean onRoute(@NonNull String str);

    PolylinePosition positionOnRoute(@NonNull String str);

    boolean precedes(@NonNull RoutePosition routePosition);

    boolean precedesOrEquals(@NonNull RoutePosition routePosition);

    double timeToFinish();
}

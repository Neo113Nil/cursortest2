package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.uri.UriObjectMetadata;
import java.util.List;

/* loaded from: classes9.dex */
public interface Route {
    double distanceBetweenPolylinePositions(@NonNull PolylinePosition polylinePosition, @NonNull PolylinePosition polylinePosition2);

    @NonNull
    Polyline getGeometry();

    @NonNull
    RouteMetadata getMetadata();

    @NonNull
    List<Section> getSections();

    @NonNull
    UriObjectMetadata getUriMetadata();

    @NonNull
    List<WayPoint> getWayPoints();
}

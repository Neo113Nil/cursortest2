package com.yandex.mapkit.map;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface MapObjectVisitor {
    void onCircleVisited(@NonNull CircleMapObject circleMapObject);

    void onClusterizedCollectionVisitEnd(@NonNull ClusterizedPlacemarkCollection clusterizedPlacemarkCollection);

    boolean onClusterizedCollectionVisitStart(@NonNull ClusterizedPlacemarkCollection clusterizedPlacemarkCollection);

    void onCollectionVisitEnd(@NonNull MapObjectCollection mapObjectCollection);

    boolean onCollectionVisitStart(@NonNull MapObjectCollection mapObjectCollection);

    void onPlacemarkVisited(@NonNull PlacemarkMapObject placemarkMapObject);

    void onPolygonVisited(@NonNull PolygonMapObject polygonMapObject);

    void onPolylineVisited(@NonNull PolylineMapObject polylineMapObject);
}

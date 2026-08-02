package com.yandex.mapkit.transport.bicycle;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.uri.UriObjectMetadata;
import java.util.List;

/* loaded from: classes9.dex */
public interface Route {
    @NonNull
    List<ConstructionSegment> getConstructions();

    Flags getFlags();

    @NonNull
    Polyline getGeometry();

    @NonNull
    List<Leg> getLegs();

    @NonNull
    List<RestrictedEntry> getRestrictedEntries();

    String getRouteId();

    @NonNull
    List<Section> getSections();

    @NonNull
    List<TrafficTypeSegment> getTrafficTypes();

    @NonNull
    UriObjectMetadata getUriMetadata();

    @NonNull
    List<ViaPoint> getViaPoints();

    @NonNull
    List<WayPoint> getWayPoints();

    @NonNull
    Weight getWeight();
}

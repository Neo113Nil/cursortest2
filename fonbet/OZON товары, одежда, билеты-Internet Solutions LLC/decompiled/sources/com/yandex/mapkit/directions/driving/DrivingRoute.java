package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.mapkit.navigation.RoutePosition;
import java.util.List;

/* loaded from: classes9.dex */
public interface DrivingRoute {
    void addConditionsListener(@NonNull ConditionsListener conditionsListener);

    AnnotationLanguage getAnnotationLanguage();

    @NonNull
    List<Checkpoint> getCheckpoints();

    @NonNull
    List<DirectionSign> getDirectionSigns();

    @NonNull
    List<Event> getEvents();

    @NonNull
    List<Ferry> getFerries();

    @NonNull
    List<FordCrossing> getFordCrossings();

    @NonNull
    Polyline getGeometry();

    @NonNull
    List<Highway> getHighways();

    @NonNull
    List<JamSegment> getJamSegments();

    @NonNull
    List<LaneSign> getLaneSigns();

    int getLegIndex();

    @NonNull
    List<ManoeuvreVehicleRestriction> getManoeuvreVehicleRestrictions();

    @NonNull
    DrivingRouteMetadata getMetadata();

    @NonNull
    List<PedestrianCrossing> getPedestrianCrossings();

    @NonNull
    PolylinePosition getPosition();

    @NonNull
    List<RailwayCrossing> getRailwayCrossings();

    List<RequestPoint> getRequestPoints();

    @NonNull
    List<RestrictedEntry> getRestrictedEntries();

    @NonNull
    List<RestrictedTurn> getRestrictedTurns();

    @NonNull
    List<RoadVehicleRestriction> getRoadVehicleRestrictions();

    @NonNull
    String getRouteId();

    @NonNull
    RoutePosition getRoutePosition();

    @NonNull
    List<RuggedRoad> getRuggedRoads();

    @NonNull
    List<DrivingSection> getSections();

    @NonNull
    List<SpeedBump> getSpeedBumps();

    @NonNull
    List<Float> getSpeedLimits();

    @NonNull
    List<TollRoad> getTollRoads();

    @NonNull
    List<TrafficLight> getTrafficLights();

    @NonNull
    List<Tunnel> getTunnels();

    @NonNull
    VehicleOptions getVehicleOptions();

    @NonNull
    List<PolylinePosition> getWayPoints();

    @NonNull
    List<ZoneCrossing> getZoneCrossings();

    boolean isAreConditionsOutdated();

    @NonNull
    DrivingRouteMetadata metadataAt(@NonNull PolylinePosition polylinePosition);

    void removeConditionsListener(@NonNull ConditionsListener conditionsListener);

    void requestConditionsUpdate();

    int sectionIndex(int i11);

    void setLegIndex(int i11);

    void setPosition(@NonNull PolylinePosition polylinePosition);
}

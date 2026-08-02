package com.yandex.mapkit.directions.driving.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.mapkit.directions.driving.Checkpoint;
import com.yandex.mapkit.directions.driving.ConditionsListener;
import com.yandex.mapkit.directions.driving.DirectionSign;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingRouteMetadata;
import com.yandex.mapkit.directions.driving.DrivingSection;
import com.yandex.mapkit.directions.driving.Event;
import com.yandex.mapkit.directions.driving.Ferry;
import com.yandex.mapkit.directions.driving.FordCrossing;
import com.yandex.mapkit.directions.driving.Highway;
import com.yandex.mapkit.directions.driving.LaneSign;
import com.yandex.mapkit.directions.driving.ManoeuvreVehicleRestriction;
import com.yandex.mapkit.directions.driving.PedestrianCrossing;
import com.yandex.mapkit.directions.driving.RailwayCrossing;
import com.yandex.mapkit.directions.driving.RestrictedEntry;
import com.yandex.mapkit.directions.driving.RestrictedTurn;
import com.yandex.mapkit.directions.driving.RoadVehicleRestriction;
import com.yandex.mapkit.directions.driving.RuggedRoad;
import com.yandex.mapkit.directions.driving.SpeedBump;
import com.yandex.mapkit.directions.driving.TollRoad;
import com.yandex.mapkit.directions.driving.TrafficLight;
import com.yandex.mapkit.directions.driving.Tunnel;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.directions.driving.ZoneCrossing;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.mapkit.navigation.RoutePosition;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes9.dex */
public class DrivingRouteBinding implements DrivingRoute {
    protected Subscription<ConditionsListener> conditionsListenerSubscription = new Subscription<ConditionsListener>() { // from class: com.yandex.mapkit.directions.driving.internal.DrivingRouteBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(ConditionsListener conditionsListener) {
            return DrivingRouteBinding.createConditionsListener(conditionsListener);
        }
    };
    private final NativeObject nativeObject;

    protected DrivingRouteBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createConditionsListener(ConditionsListener conditionsListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native void addConditionsListener(@NonNull ConditionsListener conditionsListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native AnnotationLanguage getAnnotationLanguage();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<Checkpoint> getCheckpoints();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<DirectionSign> getDirectionSigns();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<Event> getEvents();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<Ferry> getFerries();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<FordCrossing> getFordCrossings();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native Polyline getGeometry();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<Highway> getHighways();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<JamSegment> getJamSegments();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<LaneSign> getLaneSigns();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native int getLegIndex();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<ManoeuvreVehicleRestriction> getManoeuvreVehicleRestrictions();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native DrivingRouteMetadata getMetadata();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<PedestrianCrossing> getPedestrianCrossings();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native PolylinePosition getPosition();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<RailwayCrossing> getRailwayCrossings();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native List<RequestPoint> getRequestPoints();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<RestrictedEntry> getRestrictedEntries();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<RestrictedTurn> getRestrictedTurns();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<RoadVehicleRestriction> getRoadVehicleRestrictions();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native String getRouteId();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native RoutePosition getRoutePosition();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<RuggedRoad> getRuggedRoads();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<DrivingSection> getSections();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<SpeedBump> getSpeedBumps();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<Float> getSpeedLimits();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<TollRoad> getTollRoads();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<TrafficLight> getTrafficLights();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<Tunnel> getTunnels();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native VehicleOptions getVehicleOptions();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<PolylinePosition> getWayPoints();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native List<ZoneCrossing> getZoneCrossings();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native boolean isAreConditionsOutdated();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    @NonNull
    public native DrivingRouteMetadata metadataAt(@NonNull PolylinePosition polylinePosition);

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native void removeConditionsListener(@NonNull ConditionsListener conditionsListener);

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native void requestConditionsUpdate();

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native int sectionIndex(int i11);

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native void setLegIndex(int i11);

    @Override // com.yandex.mapkit.directions.driving.DrivingRoute
    public native void setPosition(@NonNull PolylinePosition polylinePosition);
}

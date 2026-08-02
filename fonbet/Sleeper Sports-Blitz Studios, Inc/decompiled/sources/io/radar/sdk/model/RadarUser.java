package io.radar.sdk.model;

import android.location.Location;
import io.radar.sdk.Radar;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarUser.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b0\u0018\u0000 X2\u00020\u0001:\u0001XB\u0089\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\f\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020\u0013\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010*J\u0006\u0010W\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010(\u001a\u0004\u0018\u00010)¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u001b\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010#\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001b\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001b\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f¢\u0006\n\n\u0002\u0010H\u001a\u0004\bF\u0010GR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u001b\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bR\u00108R\u001b\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f¢\u0006\n\n\u0002\u0010H\u001a\u0004\bS\u0010GR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010,¨\u0006Y"}, d2 = {"Lio/radar/sdk/model/RadarUser;", "", "_id", "", RadarUser.FIELD_USER_ID, RadarUser.FIELD_DEVICE_ID, "description", "metadata", "Lorg/json/JSONObject;", "location", "Landroid/location/Location;", RadarUser.FIELD_GEOFENCES, "", "Lio/radar/sdk/model/RadarGeofence;", RadarUser.FIELD_PLACE, "Lio/radar/sdk/model/RadarPlace;", "beacons", "Lio/radar/sdk/model/RadarBeacon;", RadarUser.FIELD_STOPPED, "", "foreground", "country", "Lio/radar/sdk/model/RadarRegion;", "state", "dma", "postalCode", RadarUser.FIELD_NEARBY_PLACE_CHAINS, "Lio/radar/sdk/model/RadarChain;", RadarUser.FIELD_SEGMENTS, "Lio/radar/sdk/model/RadarSegment;", RadarUser.FIELD_TOP_CHAINS, "source", "Lio/radar/sdk/Radar$RadarLocationSource;", RadarUser.FIELD_TRIP, "Lio/radar/sdk/model/RadarTrip;", RadarUser.FIELD_DEBUG, RadarUser.FIELD_FRAUD, "Lio/radar/sdk/model/RadarFraud;", RadarUser.FIELD_ACTIVITY_TYPE, "Lio/radar/sdk/Radar$RadarActivityType;", "altitude", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Landroid/location/Location;[Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarPlace;[Lio/radar/sdk/model/RadarBeacon;ZZLio/radar/sdk/model/RadarRegion;Lio/radar/sdk/model/RadarRegion;Lio/radar/sdk/model/RadarRegion;Lio/radar/sdk/model/RadarRegion;[Lio/radar/sdk/model/RadarChain;[Lio/radar/sdk/model/RadarSegment;[Lio/radar/sdk/model/RadarChain;Lio/radar/sdk/Radar$RadarLocationSource;Lio/radar/sdk/model/RadarTrip;ZLio/radar/sdk/model/RadarFraud;Lio/radar/sdk/Radar$RadarActivityType;Ljava/lang/Double;)V", "get_id", "()Ljava/lang/String;", "getActivityType", "()Lio/radar/sdk/Radar$RadarActivityType;", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBeacons", "()[Lio/radar/sdk/model/RadarBeacon;", "[Lio/radar/sdk/model/RadarBeacon;", "getCountry", "()Lio/radar/sdk/model/RadarRegion;", "getDebug", "()Z", "getDescription", "getDeviceId", "getDma", "getForeground", "getFraud", "()Lio/radar/sdk/model/RadarFraud;", "getGeofences", "()[Lio/radar/sdk/model/RadarGeofence;", "[Lio/radar/sdk/model/RadarGeofence;", "getLocation", "()Landroid/location/Location;", "getMetadata", "()Lorg/json/JSONObject;", "getNearbyPlaceChains", "()[Lio/radar/sdk/model/RadarChain;", "[Lio/radar/sdk/model/RadarChain;", "getPlace", "()Lio/radar/sdk/model/RadarPlace;", "getPostalCode", "getSegments", "()[Lio/radar/sdk/model/RadarSegment;", "[Lio/radar/sdk/model/RadarSegment;", "getSource", "()Lio/radar/sdk/Radar$RadarLocationSource;", "getState", "getStopped", "getTopChains", "getTrip", "()Lio/radar/sdk/model/RadarTrip;", "getUserId", "toJson", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarUser {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_ACTIVITY_TYPE = "activityType";
    private static final String FIELD_ALTITUDE = "altitude";
    private static final String FIELD_BAROMETRIC_ALTITUDE = "barometricAltitude";
    private static final String FIELD_BEACONS = "beacons";
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_DEBUG = "debug";
    private static final String FIELD_DESCRIPTION = "description";
    private static final String FIELD_DEVICE_ID = "deviceId";
    private static final String FIELD_DMA = "dma";
    private static final String FIELD_FOREGROUND = "foreground";
    private static final String FIELD_FRAUD = "fraud";
    private static final String FIELD_GEOFENCES = "geofences";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_LOCATION = "location";
    private static final String FIELD_LOCATION_ACCURACY = "locationAccuracy";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_NEARBY_PLACE_CHAINS = "nearbyPlaceChains";
    private static final String FIELD_PLACE = "place";
    private static final String FIELD_POSTAL_CODE = "postalCode";
    private static final String FIELD_SEGMENTS = "segments";
    private static final String FIELD_SOURCE = "source";
    private static final String FIELD_STATE = "state";
    private static final String FIELD_STOPPED = "stopped";
    private static final String FIELD_TOP_CHAINS = "topChains";
    private static final String FIELD_TRIP = "trip";
    private static final String FIELD_USER_ID = "userId";
    private final String _id;
    private final Radar.RadarActivityType activityType;
    private final Double altitude;
    private final RadarBeacon[] beacons;
    private final RadarRegion country;
    private final boolean debug;
    private final String description;
    private final String deviceId;
    private final RadarRegion dma;
    private final boolean foreground;
    private final RadarFraud fraud;
    private final RadarGeofence[] geofences;
    private final Location location;
    private final JSONObject metadata;
    private final RadarChain[] nearbyPlaceChains;
    private final RadarPlace place;
    private final RadarRegion postalCode;
    private final RadarSegment[] segments;
    private final Radar.RadarLocationSource source;
    private final RadarRegion state;
    private final boolean stopped;
    private final RadarChain[] topChains;
    private final RadarTrip trip;
    private final String userId;

    @JvmStatic
    public static final RadarUser fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public RadarUser(String _id, String str, String str2, String str3, JSONObject jSONObject, Location location, RadarGeofence[] radarGeofenceArr, RadarPlace radarPlace, RadarBeacon[] radarBeaconArr, boolean z, boolean z2, RadarRegion radarRegion, RadarRegion radarRegion2, RadarRegion radarRegion3, RadarRegion radarRegion4, RadarChain[] radarChainArr, RadarSegment[] radarSegmentArr, RadarChain[] radarChainArr2, Radar.RadarLocationSource source, RadarTrip radarTrip, boolean z3, RadarFraud radarFraud, Radar.RadarActivityType radarActivityType, Double d) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(source, "source");
        this._id = _id;
        this.userId = str;
        this.deviceId = str2;
        this.description = str3;
        this.metadata = jSONObject;
        this.location = location;
        this.geofences = radarGeofenceArr;
        this.place = radarPlace;
        this.beacons = radarBeaconArr;
        this.stopped = z;
        this.foreground = z2;
        this.country = radarRegion;
        this.state = radarRegion2;
        this.dma = radarRegion3;
        this.postalCode = radarRegion4;
        this.nearbyPlaceChains = radarChainArr;
        this.segments = radarSegmentArr;
        this.topChains = radarChainArr2;
        this.source = source;
        this.trip = radarTrip;
        this.debug = z3;
        this.fraud = radarFraud;
        this.activityType = radarActivityType;
        this.altitude = d;
    }

    public /* synthetic */ RadarUser(String str, String str2, String str3, String str4, JSONObject jSONObject, Location location, RadarGeofence[] radarGeofenceArr, RadarPlace radarPlace, RadarBeacon[] radarBeaconArr, boolean z, boolean z2, RadarRegion radarRegion, RadarRegion radarRegion2, RadarRegion radarRegion3, RadarRegion radarRegion4, RadarChain[] radarChainArr, RadarSegment[] radarSegmentArr, RadarChain[] radarChainArr2, Radar.RadarLocationSource radarLocationSource, RadarTrip radarTrip, boolean z3, RadarFraud radarFraud, Radar.RadarActivityType radarActivityType, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, jSONObject, location, radarGeofenceArr, radarPlace, radarBeaconArr, z, z2, radarRegion, radarRegion2, radarRegion3, radarRegion4, radarChainArr, radarSegmentArr, radarChainArr2, radarLocationSource, radarTrip, (i & 1048576) != 0 ? false : z3, radarFraud, radarActivityType, d);
    }

    public final String get_id() {
        return this._id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final RadarGeofence[] getGeofences() {
        return this.geofences;
    }

    public final RadarPlace getPlace() {
        return this.place;
    }

    public final RadarBeacon[] getBeacons() {
        return this.beacons;
    }

    public final boolean getStopped() {
        return this.stopped;
    }

    public final boolean getForeground() {
        return this.foreground;
    }

    public final RadarRegion getCountry() {
        return this.country;
    }

    public final RadarRegion getState() {
        return this.state;
    }

    public final RadarRegion getDma() {
        return this.dma;
    }

    public final RadarRegion getPostalCode() {
        return this.postalCode;
    }

    public final RadarChain[] getNearbyPlaceChains() {
        return this.nearbyPlaceChains;
    }

    public final RadarSegment[] getSegments() {
        return this.segments;
    }

    public final RadarChain[] getTopChains() {
        return this.topChains;
    }

    public final Radar.RadarLocationSource getSource() {
        return this.source;
    }

    public final RadarTrip getTrip() {
        return this.trip;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final RadarFraud getFraud() {
        return this.fraud;
    }

    public final Radar.RadarActivityType getActivityType() {
        return this.activityType;
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    /* compiled from: RadarUser.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lio/radar/sdk/model/RadarUser$Companion;", "", "()V", "FIELD_ACTIVITY_TYPE", "", "FIELD_ALTITUDE", "FIELD_BAROMETRIC_ALTITUDE", "FIELD_BEACONS", "FIELD_COORDINATES", "FIELD_COUNTRY", "FIELD_DEBUG", "FIELD_DESCRIPTION", "FIELD_DEVICE_ID", "FIELD_DMA", "FIELD_FOREGROUND", "FIELD_FRAUD", "FIELD_GEOFENCES", "FIELD_ID", "FIELD_LOCATION", "FIELD_LOCATION_ACCURACY", "FIELD_METADATA", "FIELD_NEARBY_PLACE_CHAINS", "FIELD_PLACE", "FIELD_POSTAL_CODE", "FIELD_SEGMENTS", "FIELD_SOURCE", "FIELD_STATE", "FIELD_STOPPED", "FIELD_TOP_CHAINS", "FIELD_TRIP", "FIELD_USER_ID", "fromJson", "Lio/radar/sdk/model/RadarUser;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01ae  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarUser fromJson(JSONObject obj) {
            Radar.RadarLocationSource radarLocationSource;
            Double d;
            Double valueOf;
            if (obj == null) {
                return null;
            }
            String optString = obj.optString("_id");
            if (optString == null) {
                optString = "";
            }
            String str = optString;
            String optString2 = obj.optString(RadarUser.FIELD_USER_ID);
            String str2 = optString2 == null ? null : optString2;
            String optString3 = obj.optString(RadarUser.FIELD_DEVICE_ID);
            String str3 = optString3 == null ? null : optString3;
            String optString4 = obj.optString("description");
            String str4 = optString4 == null ? null : optString4;
            JSONObject optJSONObject = obj.optJSONObject("metadata");
            boolean optBoolean = obj.optBoolean(RadarUser.FIELD_STOPPED);
            boolean optBoolean2 = obj.optBoolean("foreground");
            JSONObject optJSONObject2 = obj.optJSONObject("location");
            JSONArray optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray(RadarUser.FIELD_COORDINATES) : null;
            Location location = new Location("RadarSDK");
            location.setLongitude(optJSONArray != null ? optJSONArray.optDouble(0) : 0.0d);
            location.setLatitude(optJSONArray != null ? optJSONArray.optDouble(1) : 0.0d);
            if (obj.has(RadarUser.FIELD_LOCATION_ACCURACY)) {
                location.setAccuracy((float) obj.optDouble(RadarUser.FIELD_LOCATION_ACCURACY));
            }
            RadarGeofence[] fromJson = RadarGeofence.INSTANCE.fromJson(obj.optJSONArray(RadarUser.FIELD_GEOFENCES));
            RadarPlace fromJson2 = RadarPlace.INSTANCE.fromJson(obj.optJSONObject(RadarUser.FIELD_PLACE));
            RadarBeacon[] fromJson3 = RadarBeacon.INSTANCE.fromJson(obj.optJSONArray("beacons"));
            RadarRegion fromJson4 = RadarRegion.INSTANCE.fromJson(obj.optJSONObject("country"));
            RadarRegion fromJson5 = RadarRegion.INSTANCE.fromJson(obj.optJSONObject("state"));
            RadarRegion fromJson6 = RadarRegion.INSTANCE.fromJson(obj.optJSONObject("dma"));
            RadarRegion fromJson7 = RadarRegion.INSTANCE.fromJson(obj.optJSONObject("postalCode"));
            RadarChain[] fromJson8 = RadarChain.INSTANCE.fromJson(obj.optJSONArray(RadarUser.FIELD_NEARBY_PLACE_CHAINS));
            RadarSegment[] fromJson9 = RadarSegment.INSTANCE.fromJson(obj.optJSONArray(RadarUser.FIELD_SEGMENTS));
            RadarChain[] fromJson10 = RadarChain.INSTANCE.fromJson(obj.optJSONArray(RadarUser.FIELD_TOP_CHAINS));
            String optString5 = obj.optString("source");
            if (optString5 != null) {
                switch (optString5.hashCode()) {
                    case -1821326322:
                        if (optString5.equals("MANUAL_LOCATION")) {
                            radarLocationSource = Radar.RadarLocationSource.MANUAL_LOCATION;
                            break;
                        }
                        break;
                    case -600791247:
                        if (optString5.equals("FOREGROUND_LOCATION")) {
                            radarLocationSource = Radar.RadarLocationSource.FOREGROUND_LOCATION;
                            break;
                        }
                        break;
                    case -397844867:
                        if (optString5.equals("GEOFENCE_EXIT")) {
                            radarLocationSource = Radar.RadarLocationSource.GEOFENCE_EXIT;
                            break;
                        }
                        break;
                    case 550753683:
                        if (optString5.equals("GEOFENCE_DWELL")) {
                            radarLocationSource = Radar.RadarLocationSource.GEOFENCE_DWELL;
                            break;
                        }
                        break;
                    case 551423289:
                        if (optString5.equals("GEOFENCE_ENTER")) {
                            radarLocationSource = Radar.RadarLocationSource.GEOFENCE_ENTER;
                            break;
                        }
                        break;
                    case 1274325706:
                        if (optString5.equals("MOCK_LOCATION")) {
                            radarLocationSource = Radar.RadarLocationSource.MOCK_LOCATION;
                            break;
                        }
                        break;
                    case 1963193254:
                        if (optString5.equals("BACKGROUND_LOCATION")) {
                            radarLocationSource = Radar.RadarLocationSource.BACKGROUND_LOCATION;
                            break;
                        }
                        break;
                }
                Radar.RadarLocationSource radarLocationSource2 = radarLocationSource;
                RadarTrip fromJson11 = RadarTrip.INSTANCE.fromJson(obj.optJSONObject(RadarUser.FIELD_TRIP));
                boolean optBoolean3 = obj.optBoolean(RadarUser.FIELD_DEBUG);
                RadarFraud fromJson12 = RadarFraud.INSTANCE.fromJson(obj.optJSONObject(RadarUser.FIELD_FRAUD));
                Radar.RadarActivityType.Companion companion = Radar.RadarActivityType.INSTANCE;
                String optString6 = obj.optString(RadarUser.FIELD_ACTIVITY_TYPE);
                Intrinsics.checkNotNullExpressionValue(optString6, "optString(...)");
                Radar.RadarActivityType fromString = companion.fromString(optString6);
                if (!obj.has(RadarUser.FIELD_BAROMETRIC_ALTITUDE)) {
                    valueOf = Double.valueOf(obj.optDouble(RadarUser.FIELD_BAROMETRIC_ALTITUDE));
                } else {
                    if (!obj.has("altitude")) {
                        d = null;
                        return new RadarUser(str, str2, str3, str4, optJSONObject, location, fromJson, fromJson2, fromJson3, optBoolean, optBoolean2, fromJson4, fromJson5, fromJson6, fromJson7, fromJson8, fromJson9, fromJson10, radarLocationSource2, fromJson11, optBoolean3, fromJson12, fromString, d);
                    }
                    valueOf = Double.valueOf(obj.optDouble("altitude"));
                }
                d = valueOf;
                return new RadarUser(str, str2, str3, str4, optJSONObject, location, fromJson, fromJson2, fromJson3, optBoolean, optBoolean2, fromJson4, fromJson5, fromJson6, fromJson7, fromJson8, fromJson9, fromJson10, radarLocationSource2, fromJson11, optBoolean3, fromJson12, fromString, d);
            }
            radarLocationSource = Radar.RadarLocationSource.UNKNOWN;
            Radar.RadarLocationSource radarLocationSource22 = radarLocationSource;
            RadarTrip fromJson112 = RadarTrip.INSTANCE.fromJson(obj.optJSONObject(RadarUser.FIELD_TRIP));
            boolean optBoolean32 = obj.optBoolean(RadarUser.FIELD_DEBUG);
            RadarFraud fromJson122 = RadarFraud.INSTANCE.fromJson(obj.optJSONObject(RadarUser.FIELD_FRAUD));
            Radar.RadarActivityType.Companion companion2 = Radar.RadarActivityType.INSTANCE;
            String optString62 = obj.optString(RadarUser.FIELD_ACTIVITY_TYPE);
            Intrinsics.checkNotNullExpressionValue(optString62, "optString(...)");
            Radar.RadarActivityType fromString2 = companion2.fromString(optString62);
            if (!obj.has(RadarUser.FIELD_BAROMETRIC_ALTITUDE)) {
            }
            d = valueOf;
            return new RadarUser(str, str2, str3, str4, optJSONObject, location, fromJson, fromJson2, fromJson3, optBoolean, optBoolean2, fromJson4, fromJson5, fromJson6, fromJson7, fromJson8, fromJson9, fromJson10, radarLocationSource22, fromJson112, optBoolean32, fromJson122, fromString2, d);
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this._id);
        jSONObject.putOpt(FIELD_USER_ID, this.userId);
        jSONObject.putOpt(FIELD_DEVICE_ID, this.deviceId);
        jSONObject.putOpt("description", this.description);
        jSONObject.putOpt("metadata", this.metadata);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("type", "Point");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.location.getLongitude());
        jSONArray.put(this.location.getLatitude());
        jSONObject2.putOpt(FIELD_COORDINATES, jSONArray);
        jSONObject.putOpt("location", jSONObject2);
        jSONObject.putOpt(FIELD_GEOFENCES, RadarGeofence.INSTANCE.toJson(this.geofences));
        RadarPlace radarPlace = this.place;
        jSONObject.putOpt(FIELD_PLACE, radarPlace != null ? radarPlace.toJson() : null);
        jSONObject.putOpt("beacons", RadarBeacon.INSTANCE.toJson(this.beacons));
        jSONObject.putOpt(FIELD_STOPPED, Boolean.valueOf(this.stopped));
        jSONObject.putOpt("foreground", Boolean.valueOf(this.foreground));
        RadarRegion radarRegion = this.country;
        jSONObject.putOpt("country", radarRegion != null ? radarRegion.toJson() : null);
        RadarRegion radarRegion2 = this.state;
        jSONObject.putOpt("state", radarRegion2 != null ? radarRegion2.toJson() : null);
        RadarRegion radarRegion3 = this.dma;
        jSONObject.putOpt("dma", radarRegion3 != null ? radarRegion3.toJson() : null);
        RadarRegion radarRegion4 = this.postalCode;
        jSONObject.putOpt("postalCode", radarRegion4 != null ? radarRegion4.toJson() : null);
        jSONObject.putOpt(FIELD_NEARBY_PLACE_CHAINS, RadarChain.INSTANCE.toJson(this.nearbyPlaceChains));
        jSONObject.putOpt(FIELD_SEGMENTS, RadarSegment.INSTANCE.toJson(this.segments));
        jSONObject.putOpt(FIELD_TOP_CHAINS, RadarChain.INSTANCE.toJson(this.topChains));
        jSONObject.putOpt("source", Radar.stringForSource(this.source));
        RadarTrip radarTrip = this.trip;
        jSONObject.putOpt(FIELD_TRIP, radarTrip != null ? radarTrip.toJson() : null);
        jSONObject.putOpt(FIELD_DEBUG, Boolean.valueOf(this.debug));
        RadarFraud radarFraud = this.fraud;
        jSONObject.putOpt(FIELD_FRAUD, radarFraud != null ? radarFraud.toJson() : null);
        Radar.RadarActivityType radarActivityType = this.activityType;
        jSONObject.putOpt(FIELD_ACTIVITY_TYPE, radarActivityType != null ? radarActivityType.toString() : null);
        Object obj = this.altitude;
        if (obj != null) {
            jSONObject.putOpt("altitude", obj);
        }
        return jSONObject;
    }
}

package io.radar.sdk.model;

import android.location.Location;
import io.radar.sdk.RadarUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarEvent.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\u0018\u0000 M2\u00020\u0001:\u0004MNOPB¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020\b\u0012\b\u0010$\u001a\u0004\u0018\u00010%¢\u0006\u0002\u0010&J\u0006\u0010L\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010#\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010;R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bK\u0010A¨\u0006Q"}, d2 = {"Lio/radar/sdk/model/RadarEvent;", "", "_id", "", RadarEvent.FIELD_CREATED_AT, "Ljava/util/Date;", RadarEvent.FIELD_ACTUAL_CREATED_AT, RadarEvent.FIELD_LIVE, "", "type", "Lio/radar/sdk/model/RadarEvent$RadarEventType;", "conversionName", RadarEvent.FIELD_GEOFENCE, "Lio/radar/sdk/model/RadarGeofence;", RadarEvent.FIELD_PLACE, "Lio/radar/sdk/model/RadarPlace;", "region", "Lio/radar/sdk/model/RadarRegion;", RadarEvent.FIELD_BEACON, "Lio/radar/sdk/model/RadarBeacon;", RadarEvent.FIELD_TRIP, "Lio/radar/sdk/model/RadarTrip;", RadarEvent.FIELD_FRAUD, "Lio/radar/sdk/model/RadarFraud;", RadarEvent.FIELD_ALTERNATE_PLACES, "", RadarEvent.FIELD_VERIFIED_PLACE, RadarEvent.FIELD_VERIFICATION, "Lio/radar/sdk/model/RadarEvent$RadarEventVerification;", RadarEvent.FIELD_CONFIDENCE, "Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;", "duration", "", "location", "Landroid/location/Location;", RadarEvent.FIELD_REPLAYED, "metadata", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLio/radar/sdk/model/RadarEvent$RadarEventType;Ljava/lang/String;Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarRegion;Lio/radar/sdk/model/RadarBeacon;Lio/radar/sdk/model/RadarTrip;Lio/radar/sdk/model/RadarFraud;[Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarEvent$RadarEventVerification;Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;FLandroid/location/Location;ZLorg/json/JSONObject;)V", "get_id", "()Ljava/lang/String;", "getActualCreatedAt", "()Ljava/util/Date;", "getAlternatePlaces", "()[Lio/radar/sdk/model/RadarPlace;", "[Lio/radar/sdk/model/RadarPlace;", "getBeacon", "()Lio/radar/sdk/model/RadarBeacon;", "getConfidence", "()Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;", "getConversionName", "getCreatedAt", "getDuration", "()F", "getFraud", "()Lio/radar/sdk/model/RadarFraud;", "getGeofence", "()Lio/radar/sdk/model/RadarGeofence;", "getLive", "()Z", "getLocation", "()Landroid/location/Location;", "getMetadata", "()Lorg/json/JSONObject;", "getPlace", "()Lio/radar/sdk/model/RadarPlace;", "getRegion", "()Lio/radar/sdk/model/RadarRegion;", "getReplayed", "getTrip", "()Lio/radar/sdk/model/RadarTrip;", "getType", "()Lio/radar/sdk/model/RadarEvent$RadarEventType;", "getVerification", "()Lio/radar/sdk/model/RadarEvent$RadarEventVerification;", "getVerifiedPlace", "toJson", "Companion", "RadarEventConfidence", "RadarEventType", "RadarEventVerification", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_ACTUAL_CREATED_AT = "actualCreatedAt";
    private static final String FIELD_ALTERNATE_PLACES = "alternatePlaces";
    private static final String FIELD_BEACON = "beacon";
    private static final String FIELD_CONFIDENCE = "confidence";
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_CREATED_AT = "createdAt";
    private static final String FIELD_DURATION = "duration";
    private static final String FIELD_FRAUD = "fraud";
    private static final String FIELD_GEOFENCE = "geofence";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_LIVE = "live";
    private static final String FIELD_LOCATION = "location";
    private static final String FIELD_LOCATION_ACCURACY = "locationAccuracy";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_PLACE = "place";
    private static final String FIELD_REGION = "region";
    private static final String FIELD_REPLAYED = "replayed";
    private static final String FIELD_TRIP = "trip";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_VERIFICATION = "verification";
    private static final String FIELD_VERIFIED_PLACE = "verifiedPlace";
    private final String _id;
    private final Date actualCreatedAt;
    private final RadarPlace[] alternatePlaces;
    private final RadarBeacon beacon;
    private final RadarEventConfidence confidence;
    private final String conversionName;
    private final Date createdAt;
    private final float duration;
    private final RadarFraud fraud;
    private final RadarGeofence geofence;
    private final boolean live;
    private final Location location;
    private final JSONObject metadata;
    private final RadarPlace place;
    private final RadarRegion region;
    private final boolean replayed;
    private final RadarTrip trip;
    private final RadarEventType type;
    private final RadarEventVerification verification;
    private final RadarPlace verifiedPlace;

    @JvmStatic
    public static final RadarEvent fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @JvmStatic
    public static final RadarEvent[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    @JvmStatic
    public static final String stringForType(RadarEventType radarEventType) {
        return INSTANCE.stringForType(radarEventType);
    }

    @JvmStatic
    public static final JSONArray toJson(RadarEvent[] radarEventArr) {
        return INSTANCE.toJson(radarEventArr);
    }

    public RadarEvent(String _id, Date createdAt, Date actualCreatedAt, boolean z, RadarEventType type, String str, RadarGeofence radarGeofence, RadarPlace radarPlace, RadarRegion radarRegion, RadarBeacon radarBeacon, RadarTrip radarTrip, RadarFraud radarFraud, RadarPlace[] radarPlaceArr, RadarPlace radarPlace2, RadarEventVerification verification, RadarEventConfidence confidence, float f, Location location, boolean z2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(actualCreatedAt, "actualCreatedAt");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(verification, "verification");
        Intrinsics.checkNotNullParameter(confidence, "confidence");
        Intrinsics.checkNotNullParameter(location, "location");
        this._id = _id;
        this.createdAt = createdAt;
        this.actualCreatedAt = actualCreatedAt;
        this.live = z;
        this.type = type;
        this.conversionName = str;
        this.geofence = radarGeofence;
        this.place = radarPlace;
        this.region = radarRegion;
        this.beacon = radarBeacon;
        this.trip = radarTrip;
        this.fraud = radarFraud;
        this.alternatePlaces = radarPlaceArr;
        this.verifiedPlace = radarPlace2;
        this.verification = verification;
        this.confidence = confidence;
        this.duration = f;
        this.location = location;
        this.replayed = z2;
        this.metadata = jSONObject;
    }

    public final String get_id() {
        return this._id;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getActualCreatedAt() {
        return this.actualCreatedAt;
    }

    public final boolean getLive() {
        return this.live;
    }

    public final RadarEventType getType() {
        return this.type;
    }

    public final String getConversionName() {
        return this.conversionName;
    }

    public final RadarGeofence getGeofence() {
        return this.geofence;
    }

    public final RadarPlace getPlace() {
        return this.place;
    }

    public final RadarRegion getRegion() {
        return this.region;
    }

    public final RadarBeacon getBeacon() {
        return this.beacon;
    }

    public final RadarTrip getTrip() {
        return this.trip;
    }

    public final RadarFraud getFraud() {
        return this.fraud;
    }

    public final RadarPlace[] getAlternatePlaces() {
        return this.alternatePlaces;
    }

    public final RadarPlace getVerifiedPlace() {
        return this.verifiedPlace;
    }

    public final RadarEventVerification getVerification() {
        return this.verification;
    }

    public final RadarEventConfidence getConfidence() {
        return this.confidence;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final boolean getReplayed() {
        return this.replayed;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lio/radar/sdk/model/RadarEvent$RadarEventType;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "CONVERSION", "USER_ENTERED_GEOFENCE", "USER_EXITED_GEOFENCE", "USER_DWELLED_IN_GEOFENCE", "USER_ENTERED_PLACE", "USER_EXITED_PLACE", "USER_ENTERED_REGION_COUNTRY", "USER_EXITED_REGION_COUNTRY", "USER_ENTERED_REGION_DMA", "USER_EXITED_REGION_DMA", "USER_ENTERED_REGION_STATE", "USER_EXITED_REGION_STATE", "USER_ENTERED_REGION_POSTAL_CODE", "USER_EXITED_REGION_POSTAL_CODE", "USER_NEARBY_PLACE_CHAIN", "USER_ENTERED_BEACON", "USER_EXITED_BEACON", "USER_STARTED_TRIP", "USER_UPDATED_TRIP", "USER_STOPPED_TRIP", "USER_APPROACHING_TRIP_DESTINATION", "USER_ARRIVED_AT_TRIP_DESTINATION", "USER_ARRIVED_AT_WRONG_TRIP_DESTINATION", "USER_FIRED_TRIP_ORDERS", "USER_FAILED_FRAUD", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarEventType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarEventType[] $VALUES;
        public static final RadarEventType UNKNOWN = new RadarEventType("UNKNOWN", 0);
        public static final RadarEventType CONVERSION = new RadarEventType("CONVERSION", 1);
        public static final RadarEventType USER_ENTERED_GEOFENCE = new RadarEventType("USER_ENTERED_GEOFENCE", 2);
        public static final RadarEventType USER_EXITED_GEOFENCE = new RadarEventType("USER_EXITED_GEOFENCE", 3);
        public static final RadarEventType USER_DWELLED_IN_GEOFENCE = new RadarEventType("USER_DWELLED_IN_GEOFENCE", 4);
        public static final RadarEventType USER_ENTERED_PLACE = new RadarEventType("USER_ENTERED_PLACE", 5);
        public static final RadarEventType USER_EXITED_PLACE = new RadarEventType("USER_EXITED_PLACE", 6);
        public static final RadarEventType USER_ENTERED_REGION_COUNTRY = new RadarEventType("USER_ENTERED_REGION_COUNTRY", 7);
        public static final RadarEventType USER_EXITED_REGION_COUNTRY = new RadarEventType("USER_EXITED_REGION_COUNTRY", 8);
        public static final RadarEventType USER_ENTERED_REGION_DMA = new RadarEventType("USER_ENTERED_REGION_DMA", 9);
        public static final RadarEventType USER_EXITED_REGION_DMA = new RadarEventType("USER_EXITED_REGION_DMA", 10);
        public static final RadarEventType USER_ENTERED_REGION_STATE = new RadarEventType("USER_ENTERED_REGION_STATE", 11);
        public static final RadarEventType USER_EXITED_REGION_STATE = new RadarEventType("USER_EXITED_REGION_STATE", 12);
        public static final RadarEventType USER_ENTERED_REGION_POSTAL_CODE = new RadarEventType("USER_ENTERED_REGION_POSTAL_CODE", 13);
        public static final RadarEventType USER_EXITED_REGION_POSTAL_CODE = new RadarEventType("USER_EXITED_REGION_POSTAL_CODE", 14);
        public static final RadarEventType USER_NEARBY_PLACE_CHAIN = new RadarEventType("USER_NEARBY_PLACE_CHAIN", 15);
        public static final RadarEventType USER_ENTERED_BEACON = new RadarEventType("USER_ENTERED_BEACON", 16);
        public static final RadarEventType USER_EXITED_BEACON = new RadarEventType("USER_EXITED_BEACON", 17);
        public static final RadarEventType USER_STARTED_TRIP = new RadarEventType("USER_STARTED_TRIP", 18);
        public static final RadarEventType USER_UPDATED_TRIP = new RadarEventType("USER_UPDATED_TRIP", 19);
        public static final RadarEventType USER_STOPPED_TRIP = new RadarEventType("USER_STOPPED_TRIP", 20);
        public static final RadarEventType USER_APPROACHING_TRIP_DESTINATION = new RadarEventType("USER_APPROACHING_TRIP_DESTINATION", 21);
        public static final RadarEventType USER_ARRIVED_AT_TRIP_DESTINATION = new RadarEventType("USER_ARRIVED_AT_TRIP_DESTINATION", 22);
        public static final RadarEventType USER_ARRIVED_AT_WRONG_TRIP_DESTINATION = new RadarEventType("USER_ARRIVED_AT_WRONG_TRIP_DESTINATION", 23);
        public static final RadarEventType USER_FIRED_TRIP_ORDERS = new RadarEventType("USER_FIRED_TRIP_ORDERS", 24);
        public static final RadarEventType USER_FAILED_FRAUD = new RadarEventType("USER_FAILED_FRAUD", 25);

        private static final /* synthetic */ RadarEventType[] $values() {
            return new RadarEventType[]{UNKNOWN, CONVERSION, USER_ENTERED_GEOFENCE, USER_EXITED_GEOFENCE, USER_DWELLED_IN_GEOFENCE, USER_ENTERED_PLACE, USER_EXITED_PLACE, USER_ENTERED_REGION_COUNTRY, USER_EXITED_REGION_COUNTRY, USER_ENTERED_REGION_DMA, USER_EXITED_REGION_DMA, USER_ENTERED_REGION_STATE, USER_EXITED_REGION_STATE, USER_ENTERED_REGION_POSTAL_CODE, USER_EXITED_REGION_POSTAL_CODE, USER_NEARBY_PLACE_CHAIN, USER_ENTERED_BEACON, USER_EXITED_BEACON, USER_STARTED_TRIP, USER_UPDATED_TRIP, USER_STOPPED_TRIP, USER_APPROACHING_TRIP_DESTINATION, USER_ARRIVED_AT_TRIP_DESTINATION, USER_ARRIVED_AT_WRONG_TRIP_DESTINATION, USER_FIRED_TRIP_ORDERS, USER_FAILED_FRAUD};
        }

        public static EnumEntries<RadarEventType> getEntries() {
            return $ENTRIES;
        }

        public static RadarEventType valueOf(String str) {
            return (RadarEventType) Enum.valueOf(RadarEventType.class, str);
        }

        public static RadarEventType[] values() {
            return (RadarEventType[]) $VALUES.clone();
        }

        private RadarEventType(String str, int i) {
        }

        static {
            RadarEventType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "LOW", "MEDIUM", "HIGH", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarEventConfidence {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarEventConfidence[] $VALUES;
        private final int value;
        public static final RadarEventConfidence NONE = new RadarEventConfidence("NONE", 0, 0);
        public static final RadarEventConfidence LOW = new RadarEventConfidence("LOW", 1, 1);
        public static final RadarEventConfidence MEDIUM = new RadarEventConfidence("MEDIUM", 2, 2);
        public static final RadarEventConfidence HIGH = new RadarEventConfidence("HIGH", 3, 3);

        private static final /* synthetic */ RadarEventConfidence[] $values() {
            return new RadarEventConfidence[]{NONE, LOW, MEDIUM, HIGH};
        }

        public static EnumEntries<RadarEventConfidence> getEntries() {
            return $ENTRIES;
        }

        public static RadarEventConfidence valueOf(String str) {
            return (RadarEventConfidence) Enum.valueOf(RadarEventConfidence.class, str);
        }

        public static RadarEventConfidence[] values() {
            return (RadarEventConfidence[]) $VALUES.clone();
        }

        private RadarEventConfidence(String str, int i, int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }

        static {
            RadarEventConfidence[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/radar/sdk/model/RadarEvent$RadarEventVerification;", "", "(Ljava/lang/String;I)V", "ACCEPT", "UNVERIFY", "REJECT", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarEventVerification {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarEventVerification[] $VALUES;
        public static final RadarEventVerification ACCEPT = new RadarEventVerification("ACCEPT", 0);
        public static final RadarEventVerification UNVERIFY = new RadarEventVerification("UNVERIFY", 1);
        public static final RadarEventVerification REJECT = new RadarEventVerification("REJECT", 2);

        private static final /* synthetic */ RadarEventVerification[] $values() {
            return new RadarEventVerification[]{ACCEPT, UNVERIFY, REJECT};
        }

        public static EnumEntries<RadarEventVerification> getEntries() {
            return $ENTRIES;
        }

        public static RadarEventVerification valueOf(String str) {
            return (RadarEventVerification) Enum.valueOf(RadarEventVerification.class, str);
        }

        public static RadarEventVerification[] values() {
            return (RadarEventVerification[]) $VALUES.clone();
        }

        private RadarEventVerification(String str, int i) {
        }

        static {
            RadarEventVerification[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* compiled from: RadarEvent.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020#H\u0007J\u001f\u0010$\u001a\u0004\u0018\u00010\u001d2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lio/radar/sdk/model/RadarEvent$Companion;", "", "()V", "FIELD_ACTUAL_CREATED_AT", "", "FIELD_ALTERNATE_PLACES", "FIELD_BEACON", "FIELD_CONFIDENCE", "FIELD_COORDINATES", "FIELD_CREATED_AT", "FIELD_DURATION", "FIELD_FRAUD", "FIELD_GEOFENCE", "FIELD_ID", "FIELD_LIVE", "FIELD_LOCATION", "FIELD_LOCATION_ACCURACY", "FIELD_METADATA", "FIELD_PLACE", "FIELD_REGION", "FIELD_REPLAYED", "FIELD_TRIP", "FIELD_TYPE", "FIELD_VERIFICATION", "FIELD_VERIFIED_PLACE", "fromJson", "", "Lio/radar/sdk/model/RadarEvent;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarEvent;", "obj", "Lorg/json/JSONObject;", "stringForType", "type", "Lio/radar/sdk/model/RadarEvent$RadarEventType;", "toJson", "events", "([Lio/radar/sdk/model/RadarEvent;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: RadarEvent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarEventType.values().length];
                try {
                    iArr[RadarEventType.USER_ENTERED_GEOFENCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarEventType.USER_EXITED_GEOFENCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarEventType.USER_DWELLED_IN_GEOFENCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RadarEventType.USER_ENTERED_PLACE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[RadarEventType.USER_EXITED_PLACE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[RadarEventType.USER_ENTERED_REGION_COUNTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[RadarEventType.USER_EXITED_REGION_COUNTRY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[RadarEventType.USER_ENTERED_REGION_DMA.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[RadarEventType.USER_EXITED_REGION_DMA.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[RadarEventType.USER_ENTERED_REGION_STATE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[RadarEventType.USER_EXITED_REGION_STATE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[RadarEventType.USER_ENTERED_REGION_POSTAL_CODE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[RadarEventType.USER_EXITED_REGION_POSTAL_CODE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[RadarEventType.USER_NEARBY_PLACE_CHAIN.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[RadarEventType.USER_ENTERED_BEACON.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[RadarEventType.USER_EXITED_BEACON.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[RadarEventType.USER_STARTED_TRIP.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[RadarEventType.USER_UPDATED_TRIP.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[RadarEventType.USER_STOPPED_TRIP.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[RadarEventType.USER_APPROACHING_TRIP_DESTINATION.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[RadarEventType.USER_ARRIVED_AT_TRIP_DESTINATION.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[RadarEventType.USER_ARRIVED_AT_WRONG_TRIP_DESTINATION.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[RadarEventType.USER_FIRED_TRIP_ORDERS.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[RadarEventType.USER_FAILED_FRAUD.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

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
        /* JADX WARN: Removed duplicated region for block: B:23:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x025e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x026f  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0284  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0297  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x028a  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0265  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarEvent fromJson(JSONObject obj) {
            RadarEventType radarEventType;
            JSONArray optJSONArray;
            float f;
            double d;
            String str;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            if (obj == null) {
                return null;
            }
            String optString = obj.optString("_id");
            if (optString == null) {
                optString = "";
            }
            String str2 = optString;
            Date isoStringToDate$sdk_release = RadarUtils.INSTANCE.isoStringToDate$sdk_release(obj.optString(RadarEvent.FIELD_CREATED_AT));
            if (isoStringToDate$sdk_release == null) {
                isoStringToDate$sdk_release = new Date();
            }
            Date date = isoStringToDate$sdk_release;
            Date isoStringToDate$sdk_release2 = RadarUtils.INSTANCE.isoStringToDate$sdk_release(obj.optString(RadarEvent.FIELD_ACTUAL_CREATED_AT));
            if (isoStringToDate$sdk_release2 == null) {
                isoStringToDate$sdk_release2 = new Date();
            }
            Date date2 = isoStringToDate$sdk_release2;
            boolean optBoolean = obj.optBoolean(RadarEvent.FIELD_LIVE);
            String optString2 = obj.optString("type");
            if (optString2 != null) {
                switch (optString2.hashCode()) {
                    case -2086465761:
                        if (optString2.equals("user.exited_geofence")) {
                            radarEventType = RadarEventType.USER_EXITED_GEOFENCE;
                            break;
                        }
                        break;
                    case -2076407267:
                        if (optString2.equals("user.arrived_at_wrong_trip_destination")) {
                            radarEventType = RadarEventType.USER_ARRIVED_AT_WRONG_TRIP_DESTINATION;
                            break;
                        }
                        break;
                    case -2071991389:
                        if (optString2.equals("user.exited_beacon")) {
                            radarEventType = RadarEventType.USER_EXITED_BEACON;
                            break;
                        }
                        break;
                    case -1716268600:
                        if (optString2.equals("user.exited_place")) {
                            radarEventType = RadarEventType.USER_EXITED_PLACE;
                            break;
                        }
                        break;
                    case -1641299675:
                        if (optString2.equals("user.failed_fraud")) {
                            radarEventType = RadarEventType.USER_FAILED_FRAUD;
                            break;
                        }
                        break;
                    case -1251605361:
                        if (optString2.equals("user.entered_beacon")) {
                            radarEventType = RadarEventType.USER_ENTERED_BEACON;
                            break;
                        }
                        break;
                    case -1005364232:
                        if (optString2.equals("user.entered_region_dma")) {
                            radarEventType = RadarEventType.USER_ENTERED_REGION_DMA;
                            break;
                        }
                        break;
                    case -844188518:
                        if (optString2.equals("user.stopped_trip")) {
                            radarEventType = RadarEventType.USER_STOPPED_TRIP;
                            break;
                        }
                        break;
                    case -258182923:
                        if (optString2.equals("user.exited_region_postal_code")) {
                            radarEventType = RadarEventType.USER_EXITED_REGION_POSTAL_CODE;
                            break;
                        }
                        break;
                    case -103183764:
                        if (optString2.equals("user.updated_trip")) {
                            radarEventType = RadarEventType.USER_UPDATED_TRIP;
                            break;
                        }
                        break;
                    case 158452425:
                        if (optString2.equals("user.dwelled_in_geofence")) {
                            radarEventType = RadarEventType.USER_DWELLED_IN_GEOFENCE;
                            break;
                        }
                        break;
                    case 226679697:
                        if (optString2.equals("user.entered_region_state")) {
                            radarEventType = RadarEventType.USER_ENTERED_REGION_STATE;
                            break;
                        }
                        break;
                    case 325491979:
                        if (optString2.equals("user.entered_geofence")) {
                            radarEventType = RadarEventType.USER_ENTERED_GEOFENCE;
                            break;
                        }
                        break;
                    case 385587468:
                        if (optString2.equals("user.exited_region_dma")) {
                            radarEventType = RadarEventType.USER_EXITED_REGION_DMA;
                            break;
                        }
                        break;
                    case 568887265:
                        if (optString2.equals("user.entered_region_postal_code")) {
                            radarEventType = RadarEventType.USER_ENTERED_REGION_POSTAL_CODE;
                            break;
                        }
                        break;
                    case 634483467:
                        if (optString2.equals("user.fired_trip_orders")) {
                            radarEventType = RadarEventType.USER_FIRED_TRIP_ORDERS;
                            break;
                        }
                        break;
                    case 678548235:
                        if (optString2.equals("user.arrived_at_trip_destination")) {
                            radarEventType = RadarEventType.USER_ARRIVED_AT_TRIP_DESTINATION;
                            break;
                        }
                        break;
                    case 968365670:
                        if (optString2.equals("user.started_trip")) {
                            radarEventType = RadarEventType.USER_STARTED_TRIP;
                            break;
                        }
                        break;
                    case 1081142108:
                        if (optString2.equals("user.entered_place")) {
                            radarEventType = RadarEventType.USER_ENTERED_PLACE;
                            break;
                        }
                        break;
                    case 1196434341:
                        if (optString2.equals("user.exited_region_state")) {
                            radarEventType = RadarEventType.USER_EXITED_REGION_STATE;
                            break;
                        }
                        break;
                    case 1356297932:
                        if (optString2.equals("user.nearby_place_chain")) {
                            radarEventType = RadarEventType.USER_NEARBY_PLACE_CHAIN;
                            break;
                        }
                        break;
                    case 1376657564:
                        if (optString2.equals("user.approaching_trip_destination")) {
                            radarEventType = RadarEventType.USER_APPROACHING_TRIP_DESTINATION;
                            break;
                        }
                        break;
                    case 1577140650:
                        if (optString2.equals("user.exited_region_country")) {
                            radarEventType = RadarEventType.USER_EXITED_REGION_COUNTRY;
                            break;
                        }
                        break;
                    case 1650830998:
                        if (optString2.equals("user.entered_region_country")) {
                            radarEventType = RadarEventType.USER_ENTERED_REGION_COUNTRY;
                            break;
                        }
                        break;
                }
                RadarEventType radarEventType2 = radarEventType;
                String optString3 = radarEventType2 != RadarEventType.CONVERSION ? obj.optString("type") : null;
                RadarGeofence fromJson = RadarGeofence.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_GEOFENCE));
                RadarPlace fromJson2 = RadarPlace.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_PLACE));
                RadarRegion fromJson3 = RadarRegion.INSTANCE.fromJson(obj.optJSONObject("region"));
                RadarBeacon fromJson4 = RadarBeacon.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_BEACON));
                RadarTrip fromJson5 = RadarTrip.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_TRIP));
                RadarFraud fromJson6 = RadarFraud.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_FRAUD));
                RadarPlace[] fromJson7 = RadarPlace.INSTANCE.fromJson(obj.optJSONArray(RadarEvent.FIELD_ALTERNATE_PLACES));
                RadarPlace fromJson8 = RadarPlace.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_VERIFIED_PLACE));
                int optInt = obj.optInt(RadarEvent.FIELD_VERIFICATION);
                RadarEventVerification radarEventVerification = optInt == -1 ? optInt != 1 ? RadarEventVerification.UNVERIFY : RadarEventVerification.ACCEPT : RadarEventVerification.REJECT;
                int optInt2 = obj.optInt(RadarEvent.FIELD_CONFIDENCE);
                RadarEventConfidence radarEventConfidence = optInt2 == 1 ? optInt2 != 2 ? optInt2 != 3 ? RadarEventConfidence.NONE : RadarEventConfidence.HIGH : RadarEventConfidence.MEDIUM : RadarEventConfidence.LOW;
                RadarEventVerification radarEventVerification2 = radarEventVerification;
                float optDouble = (float) obj.optDouble("duration", 0.0d);
                JSONObject optJSONObject = obj.optJSONObject("location");
                optJSONArray = optJSONObject == null ? optJSONObject.optJSONArray(RadarEvent.FIELD_COORDINATES) : null;
                Location location = new Location("RadarSDK");
                if (optJSONArray == null) {
                    f = optDouble;
                    d = optJSONArray.optDouble(0);
                } else {
                    f = optDouble;
                    d = 0.0d;
                }
                location.setLongitude(d);
                location.setLatitude(optJSONArray == null ? optJSONArray.optDouble(1) : 0.0d);
                if (obj.has(RadarEvent.FIELD_LOCATION_ACCURACY)) {
                    location.setAccuracy((float) obj.optDouble(RadarEvent.FIELD_LOCATION_ACCURACY));
                }
                location.setTime(date.getTime());
                boolean optBoolean2 = obj.optBoolean(RadarEvent.FIELD_REPLAYED);
                String optString4 = obj.optString("metadata");
                str = optString4;
                if (str != null || str.length() == 0) {
                    jSONObject = null;
                } else {
                    try {
                        jSONObject2 = new JSONObject(optString4);
                    } catch (Exception unused) {
                        jSONObject2 = null;
                    }
                    jSONObject = jSONObject2;
                }
                return new RadarEvent(str2, date, date2, optBoolean, radarEventType2, optString3, fromJson, fromJson2, fromJson3, fromJson4, fromJson5, fromJson6, fromJson7, fromJson8, radarEventVerification2, radarEventConfidence, f, location, optBoolean2, jSONObject);
            }
            radarEventType = RadarEventType.CONVERSION;
            RadarEventType radarEventType22 = radarEventType;
            if (radarEventType22 != RadarEventType.CONVERSION) {
            }
            RadarGeofence fromJson9 = RadarGeofence.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_GEOFENCE));
            RadarPlace fromJson22 = RadarPlace.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_PLACE));
            RadarRegion fromJson32 = RadarRegion.INSTANCE.fromJson(obj.optJSONObject("region"));
            RadarBeacon fromJson42 = RadarBeacon.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_BEACON));
            RadarTrip fromJson52 = RadarTrip.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_TRIP));
            RadarFraud fromJson62 = RadarFraud.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_FRAUD));
            RadarPlace[] fromJson72 = RadarPlace.INSTANCE.fromJson(obj.optJSONArray(RadarEvent.FIELD_ALTERNATE_PLACES));
            RadarPlace fromJson82 = RadarPlace.INSTANCE.fromJson(obj.optJSONObject(RadarEvent.FIELD_VERIFIED_PLACE));
            int optInt3 = obj.optInt(RadarEvent.FIELD_VERIFICATION);
            if (optInt3 == -1) {
            }
            int optInt22 = obj.optInt(RadarEvent.FIELD_CONFIDENCE);
            RadarEventConfidence radarEventConfidence2 = optInt22 == 1 ? optInt22 != 2 ? optInt22 != 3 ? RadarEventConfidence.NONE : RadarEventConfidence.HIGH : RadarEventConfidence.MEDIUM : RadarEventConfidence.LOW;
            RadarEventVerification radarEventVerification22 = radarEventVerification;
            float optDouble2 = (float) obj.optDouble("duration", 0.0d);
            JSONObject optJSONObject2 = obj.optJSONObject("location");
            if (optJSONObject2 == null) {
            }
            Location location2 = new Location("RadarSDK");
            if (optJSONArray == null) {
            }
            location2.setLongitude(d);
            location2.setLatitude(optJSONArray == null ? optJSONArray.optDouble(1) : 0.0d);
            if (obj.has(RadarEvent.FIELD_LOCATION_ACCURACY)) {
            }
            location2.setTime(date.getTime());
            boolean optBoolean22 = obj.optBoolean(RadarEvent.FIELD_REPLAYED);
            String optString42 = obj.optString("metadata");
            str = optString42;
            if (str != null) {
            }
            jSONObject = null;
            return new RadarEvent(str2, date, date2, optBoolean, radarEventType22, optString3, fromJson9, fromJson22, fromJson32, fromJson42, fromJson52, fromJson62, fromJson72, fromJson82, radarEventVerification22, radarEventConfidence2, f, location2, optBoolean22, jSONObject);
        }

        @JvmStatic
        public final RadarEvent[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarEvent[] radarEventArr = new RadarEvent[length];
            for (int i = 0; i < length; i++) {
                radarEventArr[i] = RadarEvent.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarEvent[]) ArraysKt.filterNotNull(radarEventArr).toArray(new RadarEvent[0]);
        }

        @JvmStatic
        public final JSONArray toJson(RadarEvent[] events) {
            if (events == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarEvent radarEvent : events) {
                jSONArray.put(radarEvent.toJson());
            }
            return jSONArray;
        }

        @JvmStatic
        public final String stringForType(RadarEventType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    return "user.entered_geofence";
                case 2:
                    return "user.exited_geofence";
                case 3:
                    return "user.dwelled_in_geofence";
                case 4:
                    return "user.entered_place";
                case 5:
                    return "user.exited_place";
                case 6:
                    return "user.entered_region_country";
                case 7:
                    return "user.exited_region_country";
                case 8:
                    return "user.entered_region_dma";
                case 9:
                    return "user.exited_region_dma";
                case 10:
                    return "user.entered_region_state";
                case 11:
                    return "user.exited_region_state";
                case 12:
                    return "user.entered_region_postal_code";
                case 13:
                    return "user.exited_region_postal_code";
                case 14:
                    return "user.nearby_place_chain";
                case 15:
                    return "user.entered_beacon";
                case 16:
                    return "user.exited_beacon";
                case 17:
                    return "user.started_trip";
                case 18:
                    return "user.updated_trip";
                case 19:
                    return "user.stopped_trip";
                case 20:
                    return "user.approaching_trip_destination";
                case 21:
                    return "user.arrived_at_trip_destination";
                case 22:
                    return "user.arrived_at_wrong_trip_destination";
                case 23:
                    return "user.fired_trip_orders";
                case 24:
                    return "user.failed_fraud";
                default:
                    return null;
            }
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this._id);
        jSONObject.putOpt(FIELD_CREATED_AT, RadarUtils.INSTANCE.dateToISOString$sdk_release(this.createdAt));
        jSONObject.putOpt(FIELD_ACTUAL_CREATED_AT, RadarUtils.INSTANCE.dateToISOString$sdk_release(this.actualCreatedAt));
        jSONObject.putOpt(FIELD_LIVE, Boolean.valueOf(this.live));
        jSONObject.putOpt("type", INSTANCE.stringForType(this.type));
        RadarGeofence radarGeofence = this.geofence;
        jSONObject.putOpt(FIELD_GEOFENCE, radarGeofence != null ? radarGeofence.toJson() : null);
        RadarPlace radarPlace = this.place;
        jSONObject.putOpt(FIELD_PLACE, radarPlace != null ? radarPlace.toJson() : null);
        RadarEventConfidence radarEventConfidence = this.confidence;
        jSONObject.putOpt(FIELD_CONFIDENCE, radarEventConfidence != null ? Integer.valueOf(radarEventConfidence.getValue()) : null);
        jSONObject.putOpt("duration", Float.valueOf(this.duration));
        RadarRegion radarRegion = this.region;
        jSONObject.putOpt("region", radarRegion != null ? radarRegion.toJson() : null);
        RadarBeacon radarBeacon = this.beacon;
        jSONObject.putOpt(FIELD_BEACON, radarBeacon != null ? radarBeacon.toJson() : null);
        RadarTrip radarTrip = this.trip;
        jSONObject.putOpt(FIELD_TRIP, radarTrip != null ? radarTrip.toJson() : null);
        RadarFraud radarFraud = this.fraud;
        jSONObject.putOpt(FIELD_FRAUD, radarFraud != null ? radarFraud.toJson() : null);
        jSONObject.putOpt(FIELD_ALTERNATE_PLACES, RadarPlace.INSTANCE.toJson(this.alternatePlaces));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("type", "Point");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.location.getLongitude());
        jSONArray.put(this.location.getLatitude());
        jSONObject2.putOpt(FIELD_COORDINATES, jSONArray);
        jSONObject.putOpt("location", jSONObject2);
        jSONObject.putOpt(FIELD_REPLAYED, Boolean.valueOf(this.replayed));
        jSONObject.putOpt("metadata", this.metadata);
        return jSONObject;
    }
}

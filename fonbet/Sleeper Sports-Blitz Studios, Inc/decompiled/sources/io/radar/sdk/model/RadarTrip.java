package io.radar.sdk.model;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.Radar;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarTrip.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 +2\u00020\u0001:\u0002+,Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015J\u0006\u0010*\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lio/radar/sdk/model/RadarTrip;", "", "_id", "", "externalId", "metadata", "Lorg/json/JSONObject;", "destinationGeofenceTag", "destinationGeofenceExternalId", RadarTrip.FIELD_DESTINATION_LOCATION, "Lio/radar/sdk/model/RadarCoordinate;", "mode", "Lio/radar/sdk/Radar$RadarRouteMode;", "etaDistance", "", "etaDuration", "status", "Lio/radar/sdk/model/RadarTrip$RadarTripStatus;", RadarTrip.FIELD_ORDERS, "", "Lio/radar/sdk/model/RadarTripOrder;", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lio/radar/sdk/model/RadarCoordinate;Lio/radar/sdk/Radar$RadarRouteMode;Ljava/lang/Double;Ljava/lang/Double;Lio/radar/sdk/model/RadarTrip$RadarTripStatus;[Lio/radar/sdk/model/RadarTripOrder;)V", "get_id", "()Ljava/lang/String;", "getDestinationGeofenceExternalId", "getDestinationGeofenceTag", "getDestinationLocation", "()Lio/radar/sdk/model/RadarCoordinate;", "getEtaDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEtaDuration", "getExternalId", "getMetadata", "()Lorg/json/JSONObject;", "getMode", "()Lio/radar/sdk/Radar$RadarRouteMode;", "getOrders", "()[Lio/radar/sdk/model/RadarTripOrder;", "[Lio/radar/sdk/model/RadarTripOrder;", "getStatus", "()Lio/radar/sdk/model/RadarTrip$RadarTripStatus;", "toJson", "Companion", "RadarTripStatus", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarTrip {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_DESTINATION_GEOFENCE_EXTERNAL_ID = "destinationGeofenceExternalId";
    private static final String FIELD_DESTINATION_GEOFENCE_TAG = "destinationGeofenceTag";
    private static final String FIELD_DESTINATION_LOCATION = "destinationLocation";
    private static final String FIELD_DISTANCE = "distance";
    private static final String FIELD_DURATION = "duration";
    private static final String FIELD_ETA = "eta";
    private static final String FIELD_EXTERNAL_ID = "externalId";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_MODE = "mode";
    private static final String FIELD_ORDERS = "orders";
    private static final String FIELD_STATUS = "status";
    private final String _id;
    private final String destinationGeofenceExternalId;
    private final String destinationGeofenceTag;
    private final RadarCoordinate destinationLocation;
    private final Double etaDistance;
    private final Double etaDuration;
    private final String externalId;
    private final JSONObject metadata;
    private final Radar.RadarRouteMode mode;
    private final RadarTripOrder[] orders;
    private final RadarTripStatus status;

    @JvmStatic
    public static final RadarTrip fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @JvmStatic
    public static final RadarTrip[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    public RadarTrip(String _id, String externalId, JSONObject jSONObject, String str, String str2, RadarCoordinate radarCoordinate, Radar.RadarRouteMode radarRouteMode, Double d, Double d2, RadarTripStatus status, RadarTripOrder[] radarTripOrderArr) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(status, "status");
        this._id = _id;
        this.externalId = externalId;
        this.metadata = jSONObject;
        this.destinationGeofenceTag = str;
        this.destinationGeofenceExternalId = str2;
        this.destinationLocation = radarCoordinate;
        this.mode = radarRouteMode;
        this.etaDistance = d;
        this.etaDuration = d2;
        this.status = status;
        this.orders = radarTripOrderArr;
    }

    public /* synthetic */ RadarTrip(String str, String str2, JSONObject jSONObject, String str3, String str4, RadarCoordinate radarCoordinate, Radar.RadarRouteMode radarRouteMode, Double d, Double d2, RadarTripStatus radarTripStatus, RadarTripOrder[] radarTripOrderArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, jSONObject, str3, str4, radarCoordinate, radarRouteMode, d, d2, radarTripStatus, (i & 1024) != 0 ? null : radarTripOrderArr);
    }

    public final String get_id() {
        return this._id;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final String getDestinationGeofenceTag() {
        return this.destinationGeofenceTag;
    }

    public final String getDestinationGeofenceExternalId() {
        return this.destinationGeofenceExternalId;
    }

    public final RadarCoordinate getDestinationLocation() {
        return this.destinationLocation;
    }

    public final Radar.RadarRouteMode getMode() {
        return this.mode;
    }

    public final Double getEtaDistance() {
        return this.etaDistance;
    }

    public final Double getEtaDuration() {
        return this.etaDuration;
    }

    public final RadarTripStatus getStatus() {
        return this.status;
    }

    public final RadarTripOrder[] getOrders() {
        return this.orders;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarTrip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/radar/sdk/model/RadarTrip$RadarTripStatus;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "STARTED", "APPROACHING", "ARRIVED", "EXPIRED", "COMPLETED", "CANCELED", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarTripStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarTripStatus[] $VALUES;
        public static final RadarTripStatus UNKNOWN = new RadarTripStatus("UNKNOWN", 0);
        public static final RadarTripStatus STARTED = new RadarTripStatus("STARTED", 1);
        public static final RadarTripStatus APPROACHING = new RadarTripStatus("APPROACHING", 2);
        public static final RadarTripStatus ARRIVED = new RadarTripStatus("ARRIVED", 3);
        public static final RadarTripStatus EXPIRED = new RadarTripStatus("EXPIRED", 4);
        public static final RadarTripStatus COMPLETED = new RadarTripStatus("COMPLETED", 5);
        public static final RadarTripStatus CANCELED = new RadarTripStatus("CANCELED", 6);

        private static final /* synthetic */ RadarTripStatus[] $values() {
            return new RadarTripStatus[]{UNKNOWN, STARTED, APPROACHING, ARRIVED, EXPIRED, COMPLETED, CANCELED};
        }

        public static EnumEntries<RadarTripStatus> getEntries() {
            return $ENTRIES;
        }

        public static RadarTripStatus valueOf(String str) {
            return (RadarTripStatus) Enum.valueOf(RadarTripStatus.class, str);
        }

        public static RadarTripStatus[] values() {
            return (RadarTripStatus[]) $VALUES.clone();
        }

        private RadarTripStatus(String str, int i) {
        }

        static {
            RadarTripStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* compiled from: RadarTrip.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/radar/sdk/model/RadarTrip$Companion;", "", "()V", "FIELD_COORDINATES", "", "FIELD_DESTINATION_GEOFENCE_EXTERNAL_ID", "FIELD_DESTINATION_GEOFENCE_TAG", "FIELD_DESTINATION_LOCATION", "FIELD_DISTANCE", "FIELD_DURATION", "FIELD_ETA", "FIELD_EXTERNAL_ID", "FIELD_ID", "FIELD_METADATA", "FIELD_MODE", "FIELD_ORDERS", "FIELD_STATUS", "fromJson", "", "Lio/radar/sdk/model/RadarTrip;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarTrip;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00c9  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarTrip fromJson(JSONObject obj) {
            RadarCoordinate radarCoordinate;
            Radar.RadarRouteMode radarRouteMode;
            String optString;
            RadarTripStatus radarTripStatus;
            Radar.RadarRouteMode radarRouteMode2;
            RadarCoordinate radarCoordinate2;
            if (obj == null) {
                return null;
            }
            String optString2 = obj.optString("_id");
            String str = optString2 == null ? "" : optString2;
            String optString3 = obj.optString("externalId");
            String str2 = optString3 == null ? "" : optString3;
            JSONObject optJSONObject = obj.optJSONObject("metadata");
            JSONObject jSONObject = optJSONObject == null ? null : optJSONObject;
            String optString4 = obj.optString("destinationGeofenceTag");
            String str3 = optString4 == null ? null : optString4;
            String optString5 = obj.optString("destinationGeofenceExternalId");
            String str4 = optString5 == null ? null : optString5;
            JSONObject optJSONObject2 = obj.optJSONObject(RadarTrip.FIELD_DESTINATION_LOCATION);
            if (optJSONObject2 != null) {
                JSONArray optJSONArray = optJSONObject2.optJSONArray(RadarTrip.FIELD_COORDINATES);
                if (optJSONArray != null) {
                    Intrinsics.checkNotNull(optJSONArray);
                    radarCoordinate2 = new RadarCoordinate(optJSONArray.optDouble(1), optJSONArray.optDouble(0));
                } else {
                    radarCoordinate2 = null;
                }
                radarCoordinate = radarCoordinate2;
            } else {
                radarCoordinate = null;
            }
            String optString6 = obj.optString("mode");
            if (optString6 != null) {
                switch (optString6.hashCode()) {
                    case -403236394:
                        if (optString6.equals("motorbike")) {
                            radarRouteMode2 = Radar.RadarRouteMode.MOTORBIKE;
                            radarRouteMode = radarRouteMode2;
                            break;
                        }
                        break;
                    case 98260:
                        if (optString6.equals("car")) {
                            radarRouteMode2 = Radar.RadarRouteMode.CAR;
                            radarRouteMode = radarRouteMode2;
                            break;
                        }
                        break;
                    case 3023841:
                        if (optString6.equals("bike")) {
                            radarRouteMode2 = Radar.RadarRouteMode.BIKE;
                            radarRouteMode = radarRouteMode2;
                            break;
                        }
                        break;
                    case 3148910:
                        if (optString6.equals("foot")) {
                            radarRouteMode2 = Radar.RadarRouteMode.FOOT;
                            radarRouteMode = radarRouteMode2;
                            break;
                        }
                        break;
                    case 110640223:
                        if (optString6.equals("truck")) {
                            radarRouteMode2 = Radar.RadarRouteMode.TRUCK;
                            radarRouteMode = radarRouteMode2;
                            break;
                        }
                        break;
                }
                JSONObject optJSONObject3 = obj.optJSONObject(RadarTrip.FIELD_ETA);
                Double valueOf = optJSONObject3 == null ? Double.valueOf(optJSONObject3.optDouble(RadarTrip.FIELD_DISTANCE)) : null;
                JSONObject optJSONObject4 = obj.optJSONObject(RadarTrip.FIELD_ETA);
                Double valueOf2 = optJSONObject4 != null ? Double.valueOf(optJSONObject4.optDouble("duration")) : null;
                optString = obj.optString("status");
                if (optString != null) {
                    switch (optString.hashCode()) {
                        case -1897185151:
                            if (optString.equals("started")) {
                                radarTripStatus = RadarTripStatus.STARTED;
                                break;
                            }
                            break;
                        case -1402931637:
                            if (optString.equals(MetricTracker.Action.COMPLETED)) {
                                radarTripStatus = RadarTripStatus.COMPLETED;
                                break;
                            }
                            break;
                        case -1309235419:
                            if (optString.equals("expired")) {
                                radarTripStatus = RadarTripStatus.EXPIRED;
                                break;
                            }
                            break;
                        case -734206867:
                            if (optString.equals("arrived")) {
                                radarTripStatus = RadarTripStatus.ARRIVED;
                                break;
                            }
                            break;
                        case -123173735:
                            if (optString.equals("canceled")) {
                                radarTripStatus = RadarTripStatus.CANCELED;
                                break;
                            }
                            break;
                        case 100499258:
                            if (optString.equals("approaching")) {
                                radarTripStatus = RadarTripStatus.APPROACHING;
                                break;
                            }
                            break;
                    }
                    return new RadarTrip(str, str2, jSONObject, str3, str4, radarCoordinate, radarRouteMode, valueOf, valueOf2, radarTripStatus, RadarTripOrder.INSTANCE.fromJson(obj.optJSONArray(RadarTrip.FIELD_ORDERS)));
                }
                radarTripStatus = RadarTripStatus.UNKNOWN;
                return new RadarTrip(str, str2, jSONObject, str3, str4, radarCoordinate, radarRouteMode, valueOf, valueOf2, radarTripStatus, RadarTripOrder.INSTANCE.fromJson(obj.optJSONArray(RadarTrip.FIELD_ORDERS)));
            }
            radarRouteMode = null;
            JSONObject optJSONObject32 = obj.optJSONObject(RadarTrip.FIELD_ETA);
            if (optJSONObject32 == null) {
            }
            JSONObject optJSONObject42 = obj.optJSONObject(RadarTrip.FIELD_ETA);
            Double valueOf22 = optJSONObject42 != null ? Double.valueOf(optJSONObject42.optDouble("duration")) : null;
            optString = obj.optString("status");
            if (optString != null) {
            }
            radarTripStatus = RadarTripStatus.UNKNOWN;
            return new RadarTrip(str, str2, jSONObject, str3, str4, radarCoordinate, radarRouteMode, valueOf, valueOf22, radarTripStatus, RadarTripOrder.INSTANCE.fromJson(obj.optJSONArray(RadarTrip.FIELD_ORDERS)));
        }

        @JvmStatic
        public final RadarTrip[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarTrip[] radarTripArr = new RadarTrip[length];
            for (int i = 0; i < length; i++) {
                radarTripArr[i] = RadarTrip.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarTrip[]) ArraysKt.filterNotNull(radarTripArr).toArray(new RadarTrip[0]);
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this._id);
        jSONObject.putOpt("externalId", this.externalId);
        jSONObject.putOpt("metadata", this.metadata);
        jSONObject.putOpt("destinationGeofenceTag", this.destinationGeofenceTag);
        jSONObject.putOpt("destinationGeofenceExternalId", this.destinationGeofenceExternalId);
        RadarCoordinate radarCoordinate = this.destinationLocation;
        jSONObject.putOpt(FIELD_DESTINATION_LOCATION, radarCoordinate != null ? radarCoordinate.toJson() : null);
        Radar.RadarRouteMode radarRouteMode = this.mode;
        jSONObject.putOpt("mode", radarRouteMode != null ? Radar.stringForMode(radarRouteMode) : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(FIELD_DISTANCE, this.etaDistance);
        jSONObject2.putOpt("duration", this.etaDuration);
        jSONObject.putOpt(FIELD_ETA, jSONObject2);
        jSONObject.putOpt("status", Radar.stringForTripStatus(this.status));
        jSONObject.putOpt(FIELD_ORDERS, RadarTripOrder.INSTANCE.toJson(this.orders));
        return jSONObject;
    }
}

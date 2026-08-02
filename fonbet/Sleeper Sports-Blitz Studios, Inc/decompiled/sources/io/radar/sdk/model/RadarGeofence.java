package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarGeofence.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0006\u0010\u0019\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/radar/sdk/model/RadarGeofence;", "", "_id", "", "description", "tag", "externalId", "metadata", "Lorg/json/JSONObject;", RadarGeofence.FIELD_OPERATING_HOURS, "Lio/radar/sdk/model/RadarOperatingHours;", RadarGeofence.FIELD_GEOMETRY, "Lio/radar/sdk/model/RadarGeofenceGeometry;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lio/radar/sdk/model/RadarOperatingHours;Lio/radar/sdk/model/RadarGeofenceGeometry;)V", "get_id", "()Ljava/lang/String;", "getDescription", "getExternalId", "getGeometry", "()Lio/radar/sdk/model/RadarGeofenceGeometry;", "getMetadata", "()Lorg/json/JSONObject;", "getOperatingHours", "()Lio/radar/sdk/model/RadarOperatingHours;", "getTag", "toJson", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarGeofence {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_DESCRIPTION = "description";
    private static final String FIELD_EXTERNAL_ID = "externalId";
    private static final String FIELD_GEOMETRY = "geometry";
    private static final String FIELD_GEOMETRY_CENTER = "geometryCenter";
    private static final String FIELD_GEOMETRY_RADIUS = "geometryRadius";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_OPERATING_HOURS = "operatingHours";
    private static final String FIELD_TAG = "tag";
    private static final String FIELD_TYPE = "type";
    private static final String TYPE_CIRCLE = "circle";
    private static final String TYPE_GEOMETRY_CIRCLE = "Circle";
    private static final String TYPE_GEOMETRY_POLYGON = "Polygon";
    private static final String TYPE_ISOCHRONE = "isochrone";
    private static final String TYPE_POLYGON = "polygon";
    private final String _id;
    private final String description;
    private final String externalId;
    private final RadarGeofenceGeometry geometry;
    private final JSONObject metadata;
    private final RadarOperatingHours operatingHours;
    private final String tag;

    @JvmStatic
    public static final RadarGeofence fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @JvmStatic
    public static final RadarGeofence[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    @JvmStatic
    private static final JSONArray toJson(RadarCoordinate[] radarCoordinateArr) {
        return INSTANCE.toJson(radarCoordinateArr);
    }

    @JvmStatic
    public static final JSONArray toJson(RadarGeofence[] radarGeofenceArr) {
        return INSTANCE.toJson(radarGeofenceArr);
    }

    public RadarGeofence(String _id, String description, String str, String str2, JSONObject jSONObject, RadarOperatingHours radarOperatingHours, RadarGeofenceGeometry radarGeofenceGeometry) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(description, "description");
        this._id = _id;
        this.description = description;
        this.tag = str;
        this.externalId = str2;
        this.metadata = jSONObject;
        this.operatingHours = radarOperatingHours;
        this.geometry = radarGeofenceGeometry;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final RadarOperatingHours getOperatingHours() {
        return this.operatingHours;
    }

    public final RadarGeofenceGeometry getGeometry() {
        return this.geometry;
    }

    /* compiled from: RadarGeofence.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0015H\u0003¢\u0006\u0002\u0010\u001fJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lio/radar/sdk/model/RadarGeofence$Companion;", "", "()V", "FIELD_COORDINATES", "", "FIELD_DESCRIPTION", "FIELD_EXTERNAL_ID", "FIELD_GEOMETRY", "FIELD_GEOMETRY_CENTER", "FIELD_GEOMETRY_RADIUS", "FIELD_ID", "FIELD_METADATA", "FIELD_OPERATING_HOURS", "FIELD_TAG", "FIELD_TYPE", "TYPE_CIRCLE", "TYPE_GEOMETRY_CIRCLE", "TYPE_GEOMETRY_POLYGON", "TYPE_ISOCHRONE", "TYPE_POLYGON", "fromJson", "", "Lio/radar/sdk/model/RadarGeofence;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarGeofence;", "obj", "Lorg/json/JSONObject;", "toJson", RadarGeofence.FIELD_COORDINATES, "Lio/radar/sdk/model/RadarCoordinate;", "([Lio/radar/sdk/model/RadarCoordinate;)Lorg/json/JSONArray;", "geofences", "([Lio/radar/sdk/model/RadarGeofence;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarGeofence fromJson(JSONObject obj) {
            RadarCoordinate radarCoordinate;
            String str;
            String str2;
            RadarGeofenceGeometry radarGeofenceGeometry;
            RadarCircleGeometry radarCircleGeometry;
            RadarPolygonGeometry radarPolygonGeometry;
            RadarPolygonGeometry radarPolygonGeometry2;
            JSONArray jSONArray;
            int i;
            String str3;
            String str4;
            RadarCoordinate radarCoordinate2;
            JSONArray optJSONArray;
            if (obj == null) {
                return null;
            }
            String optString = obj.optString("_id");
            String str5 = optString == null ? "" : optString;
            String optString2 = obj.optString("description");
            String str6 = optString2 == null ? "" : optString2;
            String optString3 = obj.optString("tag");
            String str7 = optString3 == null ? null : optString3;
            String optString4 = obj.optString("externalId");
            String str8 = optString4 == null ? null : optString4;
            JSONObject optJSONObject = obj.optJSONObject("metadata");
            JSONObject jSONObject = optJSONObject == null ? null : optJSONObject;
            JSONObject optJSONObject2 = obj.optJSONObject(RadarGeofence.FIELD_OPERATING_HOURS);
            RadarOperatingHours fromJson = optJSONObject2 != null ? RadarOperatingHours.INSTANCE.fromJson(optJSONObject2) : null;
            JSONObject optJSONObject3 = obj.optJSONObject(RadarGeofence.FIELD_GEOMETRY_CENTER);
            int i2 = 1;
            if (optJSONObject3 != null && (optJSONArray = optJSONObject3.optJSONArray(RadarGeofence.FIELD_COORDINATES)) != null) {
                radarCoordinate = new RadarCoordinate(optJSONArray.optDouble(1), optJSONArray.optDouble(0));
            } else {
                radarCoordinate = new RadarCoordinate(0.0d, 0.0d);
            }
            double optDouble = obj.optDouble(RadarGeofence.FIELD_GEOMETRY_RADIUS);
            String optString5 = obj.optString("type");
            if (optString5 != null) {
                int hashCode = optString5.hashCode();
                if (hashCode == -1360216880) {
                    str = str5;
                    str2 = str6;
                    radarGeofenceGeometry = null;
                    if (optString5.equals("circle")) {
                        radarCircleGeometry = new RadarCircleGeometry(radarCoordinate, optDouble);
                    }
                    radarCircleGeometry = radarGeofenceGeometry;
                } else if (hashCode == -397519558 ? optString5.equals(RadarGeofence.TYPE_POLYGON) : hashCode == 418067294 && optString5.equals(RadarGeofence.TYPE_ISOCHRONE)) {
                    JSONObject optJSONObject4 = obj.optJSONObject(RadarGeofence.FIELD_GEOMETRY);
                    JSONArray optJSONArray2 = optJSONObject4 != null ? optJSONObject4.optJSONArray(RadarGeofence.FIELD_COORDINATES) : null;
                    if (optJSONArray2 != null) {
                        JSONArray optJSONArray3 = optJSONArray2.optJSONArray(0);
                        if (optJSONArray3 != null) {
                            int length = optJSONArray3.length();
                            RadarCoordinate[] radarCoordinateArr = new RadarCoordinate[length];
                            int i3 = 0;
                            while (i3 < length) {
                                JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i3);
                                if (optJSONArray4 != null) {
                                    Intrinsics.checkNotNull(optJSONArray4);
                                    jSONArray = optJSONArray3;
                                    str3 = str5;
                                    str4 = str6;
                                    i = length;
                                    radarCoordinate2 = new RadarCoordinate(optJSONArray4.optDouble(i2), optJSONArray4.optDouble(0));
                                } else {
                                    jSONArray = optJSONArray3;
                                    i = length;
                                    str3 = str5;
                                    str4 = str6;
                                    radarCoordinate2 = new RadarCoordinate(0.0d, 0.0d);
                                }
                                radarCoordinateArr[i3] = radarCoordinate2;
                                i3++;
                                optJSONArray3 = jSONArray;
                                length = i;
                                str5 = str3;
                                str6 = str4;
                                i2 = 1;
                            }
                            str = str5;
                            str2 = str6;
                            radarPolygonGeometry = new RadarPolygonGeometry(radarCoordinateArr, radarCoordinate, optDouble);
                        } else {
                            str = str5;
                            str2 = str6;
                            radarPolygonGeometry2 = null;
                            radarCircleGeometry = radarPolygonGeometry2;
                        }
                    } else {
                        str = str5;
                        str2 = str6;
                        radarPolygonGeometry = new RadarPolygonGeometry(null, radarCoordinate, optDouble);
                    }
                    radarPolygonGeometry2 = radarPolygonGeometry;
                    radarCircleGeometry = radarPolygonGeometry2;
                }
                if (radarCircleGeometry == null) {
                    radarCircleGeometry = new RadarCircleGeometry(new RadarCoordinate(0.0d, 0.0d), 0.0d);
                }
                return new RadarGeofence(str, str2, str7, str8, jSONObject, fromJson, radarCircleGeometry);
            }
            str = str5;
            str2 = str6;
            radarGeofenceGeometry = null;
            radarCircleGeometry = radarGeofenceGeometry;
            if (radarCircleGeometry == null) {
            }
            return new RadarGeofence(str, str2, str7, str8, jSONObject, fromJson, radarCircleGeometry);
        }

        @JvmStatic
        public final RadarGeofence[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarGeofence[] radarGeofenceArr = new RadarGeofence[length];
            for (int i = 0; i < length; i++) {
                radarGeofenceArr[i] = RadarGeofence.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarGeofence[]) ArraysKt.filterNotNull(radarGeofenceArr).toArray(new RadarGeofence[0]);
        }

        @JvmStatic
        public final JSONArray toJson(RadarGeofence[] geofences) {
            if (geofences == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarGeofence radarGeofence : geofences) {
                jSONArray.put(radarGeofence.toJson());
            }
            return jSONArray;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final JSONArray toJson(RadarCoordinate[] coordinates) {
            if (coordinates == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarCoordinate radarCoordinate : coordinates) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(radarCoordinate.getLongitude());
                jSONArray2.put(radarCoordinate.getLatitude());
                jSONArray.put(jSONArray2);
            }
            return jSONArray;
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("_id", this._id);
        jSONObject2.putOpt("tag", this.tag);
        jSONObject2.putOpt("externalId", this.externalId);
        jSONObject2.putOpt("description", this.description);
        jSONObject2.putOpt("metadata", this.metadata);
        RadarOperatingHours radarOperatingHours = this.operatingHours;
        if (radarOperatingHours == null || (jSONObject = radarOperatingHours.toJson()) == null) {
            jSONObject = null;
        }
        jSONObject2.putOpt(FIELD_OPERATING_HOURS, jSONObject);
        RadarGeofenceGeometry radarGeofenceGeometry = this.geometry;
        if (radarGeofenceGeometry == null) {
            return jSONObject2;
        }
        if (radarGeofenceGeometry instanceof RadarCircleGeometry) {
            RadarCircleGeometry radarCircleGeometry = (RadarCircleGeometry) radarGeofenceGeometry;
            jSONObject2.putOpt(FIELD_GEOMETRY_CENTER, radarCircleGeometry.getCenter().toJson());
            jSONObject2.putOpt(FIELD_GEOMETRY_RADIUS, Double.valueOf(radarCircleGeometry.getRadius()));
            jSONObject2.putOpt("type", TYPE_GEOMETRY_CIRCLE);
            return jSONObject2;
        }
        if (!(radarGeofenceGeometry instanceof RadarPolygonGeometry)) {
            throw new NoWhenBranchMatchedException();
        }
        RadarPolygonGeometry radarPolygonGeometry = (RadarPolygonGeometry) radarGeofenceGeometry;
        jSONObject2.putOpt(FIELD_GEOMETRY_CENTER, radarPolygonGeometry.getCenter().toJson());
        jSONObject2.putOpt(FIELD_GEOMETRY_RADIUS, Double.valueOf(radarPolygonGeometry.getRadius()));
        if (radarPolygonGeometry.getCoordinates() != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(INSTANCE.toJson(radarPolygonGeometry.getCoordinates()));
            jSONObject2.putOpt(FIELD_COORDINATES, jSONArray);
        }
        jSONObject2.putOpt("type", TYPE_GEOMETRY_POLYGON);
        return jSONObject2;
    }
}

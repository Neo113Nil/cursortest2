package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarRouteGeometry.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nR\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lio/radar/sdk/model/RadarRouteGeometry;", "", RadarRouteGeometry.FIELD_COORDINATES, "", "Lio/radar/sdk/model/RadarCoordinate;", "([Lio/radar/sdk/model/RadarCoordinate;)V", "getCoordinates", "()[Lio/radar/sdk/model/RadarCoordinate;", "[Lio/radar/sdk/model/RadarCoordinate;", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarRouteGeometry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_TYPE = "type";
    private final RadarCoordinate[] coordinates;

    @JvmStatic
    public static final RadarRouteGeometry fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public RadarRouteGeometry(RadarCoordinate[] radarCoordinateArr) {
        this.coordinates = radarCoordinateArr;
    }

    public final RadarCoordinate[] getCoordinates() {
        return this.coordinates;
    }

    /* compiled from: RadarRouteGeometry.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/radar/sdk/model/RadarRouteGeometry$Companion;", "", "()V", "FIELD_COORDINATES", "", "FIELD_TYPE", "fromJson", "Lio/radar/sdk/model/RadarRouteGeometry;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarRouteGeometry fromJson(JSONObject obj) {
            JSONArray optJSONArray;
            RadarCoordinate radarCoordinate;
            if (obj == null || (optJSONArray = obj.optJSONArray(RadarRouteGeometry.FIELD_COORDINATES)) == null) {
                return null;
            }
            int length = optJSONArray.length();
            RadarCoordinate[] radarCoordinateArr = new RadarCoordinate[length];
            for (int i = 0; i < length; i++) {
                JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
                if (optJSONArray2 != null) {
                    Intrinsics.checkNotNull(optJSONArray2);
                    radarCoordinate = new RadarCoordinate(optJSONArray2.optDouble(1), optJSONArray2.optDouble(0));
                } else {
                    radarCoordinate = new RadarCoordinate(0.0d, 0.0d);
                }
                radarCoordinateArr[i] = radarCoordinate;
            }
            return new RadarRouteGeometry(radarCoordinateArr);
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", "LineString");
        JSONArray jSONArray = new JSONArray();
        RadarCoordinate[] radarCoordinateArr = this.coordinates;
        if (radarCoordinateArr != null) {
            for (RadarCoordinate radarCoordinate : radarCoordinateArr) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(radarCoordinate.getLongitude());
                jSONArray2.put(radarCoordinate.getLatitude());
                jSONArray.put(jSONArray2);
            }
        }
        jSONObject.putOpt(FIELD_COORDINATES, jSONArray);
        return jSONObject;
    }
}

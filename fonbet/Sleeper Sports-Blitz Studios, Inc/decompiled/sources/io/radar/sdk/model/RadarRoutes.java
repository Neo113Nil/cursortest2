package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: RadarRoutes.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0014"}, d2 = {"Lio/radar/sdk/model/RadarRoutes;", "", RadarRoutes.FIELD_GEODESIC, "Lio/radar/sdk/model/RadarRoute;", RadarRoutes.FIELD_FOOT, RadarRoutes.FIELD_BIKE, RadarRoutes.FIELD_CAR, RadarRoutes.FIELD_TRUCK, RadarRoutes.FIELD_MOTORBIKE, "(Lio/radar/sdk/model/RadarRoute;Lio/radar/sdk/model/RadarRoute;Lio/radar/sdk/model/RadarRoute;Lio/radar/sdk/model/RadarRoute;Lio/radar/sdk/model/RadarRoute;Lio/radar/sdk/model/RadarRoute;)V", "getBike", "()Lio/radar/sdk/model/RadarRoute;", "getCar", "getFoot", "getGeodesic", "getMotorbike", "getTruck", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarRoutes {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_BIKE = "bike";
    private static final String FIELD_CAR = "car";
    private static final String FIELD_FOOT = "foot";
    private static final String FIELD_GEODESIC = "geodesic";
    private static final String FIELD_MOTORBIKE = "motorbike";
    private static final String FIELD_TRUCK = "truck";
    private final RadarRoute bike;
    private final RadarRoute car;
    private final RadarRoute foot;
    private final RadarRoute geodesic;
    private final RadarRoute motorbike;
    private final RadarRoute truck;

    @JvmStatic
    public static final RadarRoutes fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public RadarRoutes(RadarRoute radarRoute, RadarRoute radarRoute2, RadarRoute radarRoute3, RadarRoute radarRoute4, RadarRoute radarRoute5, RadarRoute radarRoute6) {
        this.geodesic = radarRoute;
        this.foot = radarRoute2;
        this.bike = radarRoute3;
        this.car = radarRoute4;
        this.truck = radarRoute5;
        this.motorbike = radarRoute6;
    }

    public final RadarRoute getGeodesic() {
        return this.geodesic;
    }

    public final RadarRoute getFoot() {
        return this.foot;
    }

    public final RadarRoute getBike() {
        return this.bike;
    }

    public final RadarRoute getCar() {
        return this.car;
    }

    public final RadarRoute getTruck() {
        return this.truck;
    }

    public final RadarRoute getMotorbike() {
        return this.motorbike;
    }

    /* compiled from: RadarRoutes.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/model/RadarRoutes$Companion;", "", "()V", "FIELD_BIKE", "", "FIELD_CAR", "FIELD_FOOT", "FIELD_GEODESIC", "FIELD_MOTORBIKE", "FIELD_TRUCK", "fromJson", "Lio/radar/sdk/model/RadarRoutes;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarRoutes fromJson(JSONObject obj) {
            if (obj == null) {
                return null;
            }
            return new RadarRoutes(RadarRoute.INSTANCE.fromJson(obj.optJSONObject(RadarRoutes.FIELD_GEODESIC)), RadarRoute.INSTANCE.fromJson(obj.optJSONObject(RadarRoutes.FIELD_FOOT)), RadarRoute.INSTANCE.fromJson(obj.optJSONObject(RadarRoutes.FIELD_BIKE)), RadarRoute.INSTANCE.fromJson(obj.optJSONObject(RadarRoutes.FIELD_CAR)), RadarRoute.INSTANCE.fromJson(obj.optJSONObject(RadarRoutes.FIELD_TRUCK)), RadarRoute.INSTANCE.fromJson(obj.optJSONObject(RadarRoutes.FIELD_MOTORBIKE)));
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        RadarRoute radarRoute = this.geodesic;
        jSONObject.putOpt(FIELD_GEODESIC, radarRoute != null ? radarRoute.toJson() : null);
        RadarRoute radarRoute2 = this.foot;
        jSONObject.putOpt(FIELD_FOOT, radarRoute2 != null ? radarRoute2.toJson() : null);
        RadarRoute radarRoute3 = this.bike;
        jSONObject.putOpt(FIELD_BIKE, radarRoute3 != null ? radarRoute3.toJson() : null);
        RadarRoute radarRoute4 = this.car;
        jSONObject.putOpt(FIELD_CAR, radarRoute4 != null ? radarRoute4.toJson() : null);
        RadarRoute radarRoute5 = this.truck;
        jSONObject.putOpt(FIELD_TRUCK, radarRoute5 != null ? radarRoute5.toJson() : null);
        RadarRoute radarRoute6 = this.motorbike;
        jSONObject.putOpt(FIELD_MOTORBIKE, radarRoute6 != null ? radarRoute6.toJson() : null);
        return jSONObject;
    }
}

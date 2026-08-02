package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: RadarRoute.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lio/radar/sdk/model/RadarRoute;", "", RadarRoute.FIELD_DISTANCE, "Lio/radar/sdk/model/RadarRouteDistance;", "duration", "Lio/radar/sdk/model/RadarRouteDuration;", RadarRoute.FIELD_GEOMETRY, "Lio/radar/sdk/model/RadarRouteGeometry;", "(Lio/radar/sdk/model/RadarRouteDistance;Lio/radar/sdk/model/RadarRouteDuration;Lio/radar/sdk/model/RadarRouteGeometry;)V", "getDistance", "()Lio/radar/sdk/model/RadarRouteDistance;", "getDuration", "()Lio/radar/sdk/model/RadarRouteDuration;", "getGeometry", "()Lio/radar/sdk/model/RadarRouteGeometry;", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarRoute {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_DISTANCE = "distance";
    private static final String FIELD_DURATION = "duration";
    private static final String FIELD_GEOMETRY = "geometry";
    private final RadarRouteDistance distance;
    private final RadarRouteDuration duration;
    private final RadarRouteGeometry geometry;

    @JvmStatic
    public static final RadarRoute fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public RadarRoute(RadarRouteDistance radarRouteDistance, RadarRouteDuration radarRouteDuration, RadarRouteGeometry radarRouteGeometry) {
        this.distance = radarRouteDistance;
        this.duration = radarRouteDuration;
        this.geometry = radarRouteGeometry;
    }

    public final RadarRouteDistance getDistance() {
        return this.distance;
    }

    public final RadarRouteDuration getDuration() {
        return this.duration;
    }

    public final RadarRouteGeometry getGeometry() {
        return this.geometry;
    }

    /* compiled from: RadarRoute.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/model/RadarRoute$Companion;", "", "()V", "FIELD_DISTANCE", "", "FIELD_DURATION", "FIELD_GEOMETRY", "fromJson", "Lio/radar/sdk/model/RadarRoute;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarRoute fromJson(JSONObject obj) {
            if (obj == null) {
                return null;
            }
            return new RadarRoute(RadarRouteDistance.INSTANCE.fromJson(obj.optJSONObject(RadarRoute.FIELD_DISTANCE)), RadarRouteDuration.INSTANCE.fromJson(obj.optJSONObject("duration")), RadarRouteGeometry.INSTANCE.fromJson(obj.optJSONObject(RadarRoute.FIELD_GEOMETRY)));
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        RadarRouteDistance radarRouteDistance = this.distance;
        jSONObject.putOpt(FIELD_DISTANCE, radarRouteDistance != null ? radarRouteDistance.toJson() : null);
        RadarRouteDuration radarRouteDuration = this.duration;
        jSONObject.putOpt("duration", radarRouteDuration != null ? radarRouteDuration.toJson() : null);
        RadarRouteGeometry radarRouteGeometry = this.geometry;
        jSONObject.putOpt(FIELD_GEOMETRY, radarRouteGeometry != null ? radarRouteGeometry.toJson() : null);
        return jSONObject;
    }
}

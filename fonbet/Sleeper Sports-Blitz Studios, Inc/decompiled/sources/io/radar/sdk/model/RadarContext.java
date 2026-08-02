package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarContext.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/radar/sdk/model/RadarContext;", "", RadarContext.FIELD_GEOFENCES, "", "Lio/radar/sdk/model/RadarGeofence;", RadarContext.FIELD_PLACE, "Lio/radar/sdk/model/RadarPlace;", "country", "Lio/radar/sdk/model/RadarRegion;", "state", "dma", "postalCode", "([Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarPlace;Lio/radar/sdk/model/RadarRegion;Lio/radar/sdk/model/RadarRegion;Lio/radar/sdk/model/RadarRegion;Lio/radar/sdk/model/RadarRegion;)V", "getCountry", "()Lio/radar/sdk/model/RadarRegion;", "getDma", "getGeofences", "()[Lio/radar/sdk/model/RadarGeofence;", "[Lio/radar/sdk/model/RadarGeofence;", "getPlace", "()Lio/radar/sdk/model/RadarPlace;", "getPostalCode", "getState", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_DMA = "dma";
    private static final String FIELD_GEOFENCES = "geofences";
    private static final String FIELD_PLACE = "place";
    private static final String FIELD_POSTAL_CODE = "postalCode";
    private static final String FIELD_STATE = "state";
    private final RadarRegion country;
    private final RadarRegion dma;
    private final RadarGeofence[] geofences;
    private final RadarPlace place;
    private final RadarRegion postalCode;
    private final RadarRegion state;

    @JvmStatic
    public static final RadarContext fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public RadarContext(RadarGeofence[] geofences, RadarPlace radarPlace, RadarRegion radarRegion, RadarRegion radarRegion2, RadarRegion radarRegion3, RadarRegion radarRegion4) {
        Intrinsics.checkNotNullParameter(geofences, "geofences");
        this.geofences = geofences;
        this.place = radarPlace;
        this.country = radarRegion;
        this.state = radarRegion2;
        this.dma = radarRegion3;
        this.postalCode = radarRegion4;
    }

    public final RadarGeofence[] getGeofences() {
        return this.geofences;
    }

    public final RadarPlace getPlace() {
        return this.place;
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

    /* compiled from: RadarContext.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/model/RadarContext$Companion;", "", "()V", "FIELD_COUNTRY", "", "FIELD_DMA", "FIELD_GEOFENCES", "FIELD_PLACE", "FIELD_POSTAL_CODE", "FIELD_STATE", "fromJson", "Lio/radar/sdk/model/RadarContext;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarContext fromJson(JSONObject obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            RadarGeofence[] fromJson = RadarGeofence.INSTANCE.fromJson(obj.getJSONArray(RadarContext.FIELD_GEOFENCES));
            if (fromJson == null) {
                fromJson = new RadarGeofence[0];
            }
            return new RadarContext(fromJson, RadarPlace.INSTANCE.fromJson(obj.optJSONObject(RadarContext.FIELD_PLACE)), RadarRegion.INSTANCE.fromJson(obj.optJSONObject("country")), RadarRegion.INSTANCE.fromJson(obj.optJSONObject("state")), RadarRegion.INSTANCE.fromJson(obj.optJSONObject("dma")), RadarRegion.INSTANCE.fromJson(obj.optJSONObject("postalCode")));
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(FIELD_GEOFENCES, RadarGeofence.INSTANCE.toJson(this.geofences));
        RadarPlace radarPlace = this.place;
        jSONObject.putOpt(FIELD_PLACE, radarPlace != null ? radarPlace.toJson() : null);
        RadarRegion radarRegion = this.country;
        jSONObject.putOpt("country", radarRegion != null ? radarRegion.toJson() : null);
        RadarRegion radarRegion2 = this.state;
        jSONObject.putOpt("state", radarRegion2 != null ? radarRegion2.toJson() : null);
        RadarRegion radarRegion3 = this.dma;
        jSONObject.putOpt("dma", radarRegion3 != null ? radarRegion3.toJson() : null);
        RadarRegion radarRegion4 = this.postalCode;
        jSONObject.putOpt("postalCode", radarRegion4 != null ? radarRegion4.toJson() : null);
        return jSONObject;
    }
}

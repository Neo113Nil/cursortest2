package com.braze.models.outgoing;

import android.location.Location;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00013B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0011R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0011R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0014R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0014R\u0016\u00101\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0014¨\u00064"}, d2 = {"Lcom/braze/models/outgoing/BrazeLocation;", "Lcom/braze/models/IBrazeLocation;", "", "_latitude", "_longitude", "_altitude", "_accuracy", "_verticalAccuracy", "<init>", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "(Landroid/location/Location;)V", "Lorg/json/JSONObject;", "jsonObject", "(Lorg/json/JSONObject;)V", "component1", "()D", "component2", "component3", "()Ljava/lang/Double;", "component4", "component5", "forJsonPut", "()Lorg/json/JSONObject;", "copy", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/braze/models/outgoing/BrazeLocation;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "Ljava/lang/Double;", "getLatitude", "latitude", "getLongitude", "longitude", "getAltitude", IBrazeLocation.ALTITUDE, "getAccuracy", "accuracy", "getVerticalAccuracy", "verticalAccuracy", "Companion", "com/braze/models/outgoing/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BrazeLocation implements IBrazeLocation {
    private static final c Companion = new c();
    private final Double _accuracy;
    private final Double _altitude;
    private final double _latitude;
    private final double _longitude;
    private final Double _verticalAccuracy;

    public BrazeLocation(double d, double d2) {
        this(d, d2, null, null, null, 28, null);
    }

    /* renamed from: component1, reason: from getter */
    private final double get_latitude() {
        return this._latitude;
    }

    /* renamed from: component2, reason: from getter */
    private final double get_longitude() {
        return this._longitude;
    }

    /* renamed from: component3, reason: from getter */
    private final Double get_altitude() {
        return this._altitude;
    }

    /* renamed from: component4, reason: from getter */
    private final Double get_accuracy() {
        return this._accuracy;
    }

    /* renamed from: component5, reason: from getter */
    private final Double get_verticalAccuracy() {
        return this._verticalAccuracy;
    }

    public static /* synthetic */ BrazeLocation copy$default(BrazeLocation brazeLocation, double d, double d2, Double d3, Double d4, Double d5, int i, Object obj) {
        if ((i & 1) != 0) {
            d = brazeLocation._latitude;
        }
        double d6 = d;
        if ((i & 2) != 0) {
            d2 = brazeLocation._longitude;
        }
        double d7 = d2;
        if ((i & 4) != 0) {
            d3 = brazeLocation._altitude;
        }
        Double d8 = d3;
        if ((i & 8) != 0) {
            d4 = brazeLocation._accuracy;
        }
        Double d9 = d4;
        if ((i & 16) != 0) {
            d5 = brazeLocation._verticalAccuracy;
        }
        return brazeLocation.copy(d6, d7, d8, d9, d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$1() {
        return "Caught exception creating location Json.";
    }

    public final BrazeLocation copy(double _latitude, double _longitude, Double _altitude, Double _accuracy, Double _verticalAccuracy) {
        return new BrazeLocation(_latitude, _longitude, _altitude, _accuracy, _verticalAccuracy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrazeLocation)) {
            return false;
        }
        BrazeLocation brazeLocation = (BrazeLocation) other;
        return Double.compare(this._latitude, brazeLocation._latitude) == 0 && Double.compare(this._longitude, brazeLocation._longitude) == 0 && Intrinsics.areEqual((Object) this._altitude, (Object) brazeLocation._altitude) && Intrinsics.areEqual((Object) this._accuracy, (Object) brazeLocation._accuracy) && Intrinsics.areEqual((Object) this._verticalAccuracy, (Object) brazeLocation._verticalAccuracy);
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAccuracy() {
        return this._accuracy;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getAltitude() {
        return this._altitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLatitude() {
        return this._latitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public double getLongitude() {
        return this._longitude;
    }

    @Override // com.braze.models.IBrazeLocation
    public Double getVerticalAccuracy() {
        return this._verticalAccuracy;
    }

    public int hashCode() {
        int hashCode = (Double.hashCode(this._longitude) + (Double.hashCode(this._latitude) * 31)) * 31;
        Double d = this._altitude;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this._accuracy;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this._verticalAccuracy;
        return hashCode3 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        return "BrazeLocation(_latitude=" + this._latitude + ", _longitude=" + this._longitude + ", _altitude=" + this._altitude + ", _accuracy=" + this._accuracy + ", _verticalAccuracy=" + this._verticalAccuracy + ")";
    }

    public BrazeLocation(double d, double d2, Double d3) {
        this(d, d2, d3, null, null, 24, null);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", getLatitude());
            jSONObject.put("longitude", getLongitude());
            if (getAltitude() != null) {
                jSONObject.put(IBrazeLocation.ALTITUDE, getAltitude());
            }
            if (getAccuracy() != null) {
                jSONObject.put(IBrazeLocation.ACCURACY, getAccuracy());
            }
            if (getVerticalAccuracy() != null) {
                jSONObject.put(IBrazeLocation.VERTICAL_ACCURACY, getVerticalAccuracy());
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.outgoing.BrazeLocation$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$1;
                    forJsonPut$lambda$1 = BrazeLocation.forJsonPut$lambda$1();
                    return forJsonPut$lambda$1;
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }

    public BrazeLocation(double d, double d2, Double d3, Double d4) {
        this(d, d2, d3, d4, null, 16, null);
    }

    public BrazeLocation(double d, double d2, Double d3, Double d4, Double d5) {
        this._latitude = d;
        this._longitude = d2;
        this._altitude = d3;
        this._accuracy = d4;
        this._verticalAccuracy = d5;
        if (!ValidationUtils.isValidLocation(getLatitude(), getLongitude())) {
            throw new IllegalArgumentException("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively");
        }
    }

    public /* synthetic */ BrazeLocation(double d, double d2, Double d3, Double d4, Double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null, location.hasAccuracy() ? Double.valueOf(location.getAccuracy()) : null, c.a(Companion, location));
        Intrinsics.checkNotNullParameter(location, "location");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(JSONObject jsonObject) {
        this(jsonObject.getDouble("latitude"), jsonObject.getDouble("longitude"), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.ALTITUDE), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.ACCURACY), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.VERTICAL_ACCURACY));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
    }
}

package com.braze.models.outgoing;

import android.location.Location;
import android.os.Build;
import com.braze.Constants;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001/B=\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b'\u0010+B\u0011\b\u0016\u0012\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\b'\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÂ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\u0006J\b\u0010\n\u001a\u00020\tH\u0016JH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0006R\u0016\u0010&\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0006¨\u00060"}, d2 = {"Lcom/braze/models/outgoing/BrazeLocation;", "Lcom/braze/models/IBrazeLocation;", "", "component1", "component2", "component3", "()Ljava/lang/Double;", "component4", "component5", "Lorg/json/JSONObject;", "forJsonPut", "_latitude", "_longitude", "_altitude", "_accuracy", "_verticalAccuracy", "copy", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/braze/models/outgoing/BrazeLocation;", "", "toString", "", "hashCode", "", "other", "", "equals", "D", "Ljava/lang/Double;", "getLatitude", "()D", IBrazeLocation.LATITUDE, "getLongitude", IBrazeLocation.LONGITUDE, "getAltitude", IBrazeLocation.ALTITUDE, "getAccuracy", "accuracy", "getVerticalAccuracy", "verticalAccuracy", "<init>", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "(Landroid/location/Location;)V", "jsonObject", "(Lorg/json/JSONObject;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final /* data */ class BrazeLocation implements IBrazeLocation {
    private static final a Companion = new a(null);
    private final Double _accuracy;
    private final Double _altitude;
    private final double _latitude;
    private final double _longitude;
    private final Double _verticalAccuracy;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/braze/models/outgoing/BrazeLocation$a;", "", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Landroid/location/Location;)Ljava/lang/Double;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Double a(Location location) {
            if (Build.VERSION.SDK_INT < 26 || !location.hasVerticalAccuracy()) {
                return null;
            }
            return Double.valueOf(location.getVerticalAccuracyMeters());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating location Json.";
        }
    }

    public BrazeLocation(double d, double d2) {
        this(d, d2, null, null, null, 28, null);
    }

    public BrazeLocation(double d, double d2, Double d3) {
        this(d, d2, d3, null, null, 24, null);
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
            throw new IllegalArgumentException("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively".toString());
        }
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
        return Intrinsics.areEqual((Object) Double.valueOf(this._latitude), (Object) Double.valueOf(brazeLocation._latitude)) && Intrinsics.areEqual((Object) Double.valueOf(this._longitude), (Object) Double.valueOf(brazeLocation._longitude)) && Intrinsics.areEqual((Object) this._altitude, (Object) brazeLocation._altitude) && Intrinsics.areEqual((Object) this._accuracy, (Object) brazeLocation._accuracy) && Intrinsics.areEqual((Object) this._verticalAccuracy, (Object) brazeLocation._verticalAccuracy);
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
        int hashCode = ((Double.hashCode(this._latitude) * 31) + Double.hashCode(this._longitude)) * 31;
        Double d = this._altitude;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this._accuracy;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this._verticalAccuracy;
        return hashCode3 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        return "BrazeLocation(_latitude=" + this._latitude + ", _longitude=" + this._longitude + ", _altitude=" + this._altitude + ", _accuracy=" + this._accuracy + ", _verticalAccuracy=" + this._verticalAccuracy + ')';
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IBrazeLocation.LATITUDE, getLatitude());
            jSONObject.put(IBrazeLocation.LONGITUDE, getLongitude());
            if (getAltitude() != null) {
                jSONObject.put(IBrazeLocation.ALTITUDE, getAltitude());
            }
            if (getAccuracy() != null) {
                jSONObject.put(IBrazeLocation.ACCURACY, getAccuracy());
            }
            if (getVerticalAccuracy() != null) {
                jSONObject.put(IBrazeLocation.VERTICAL_ACCURACY, getVerticalAccuracy());
                return jSONObject;
            }
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
        return jSONObject;
    }

    public /* synthetic */ BrazeLocation(double d, double d2, Double d3, Double d4, Double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null, location.hasAccuracy() ? Double.valueOf(location.getAccuracy()) : null, Companion.a(location));
        Intrinsics.checkNotNullParameter(location, "location");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrazeLocation(JSONObject jsonObject) {
        this(jsonObject.getDouble(IBrazeLocation.LATITUDE), jsonObject.getDouble(IBrazeLocation.LONGITUDE), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.ALTITUDE), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.ACCURACY), JsonUtils.getDoubleOrNull(jsonObject, IBrazeLocation.VERTICAL_ACCURACY));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
    }
}

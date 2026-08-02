package com.braze.models;

import com.braze.Constants;
import com.braze.support.JsonUtils;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b(\b\u0007\u0018\u0000 92\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001:Bi\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u000b¢\u0006\u0004\b6\u00107B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b6\u00108J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010 \u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\"\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010(\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010*\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010,\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001dR(\u0010.\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010\u0015\u0012\u0004\b2\u00103\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u00101R\u0011\u00105\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u0010\u0017¨\u0006;"}, d2 = {"Lcom/braze/models/BrazeGeofence;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "otherGeofence", "", "equivalentServerData", "", "toString", "forJsonPut", "other", "", "compareTo", "jsonObject", "Lorg/json/JSONObject;", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "latitude", "D", "getLatitude", "()D", "longitude", "getLongitude", "radiusMeter", "I", "getRadiusMeter", "()I", "cooldownEnterSeconds", "getCooldownEnterSeconds", "cooldownExitSeconds", "getCooldownExitSeconds", "analyticsEnabledEnter", "Z", "getAnalyticsEnabledEnter", "()Z", "analyticsEnabledExit", "getAnalyticsEnabledExit", "enterEvents", "getEnterEvents", "exitEvents", "getExitEvents", "notificationResponsivenessMs", "getNotificationResponsivenessMs", "distanceFromGeofenceRefresh", "getDistanceFromGeofenceRefresh", "setDistanceFromGeofenceRefresh", "(D)V", "getDistanceFromGeofenceRefresh$annotations", "()V", "getRadiusMeters", "radiusMeters", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;DDIIIZZZZI)V", "(Lorg/json/JSONObject;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    private static final String ANALYTICS_ENABLED_ENTER = "analytics_enabled_enter";
    private static final String ANALYTICS_ENABLED_EXIT = "analytics_enabled_exit";
    private static final String COOLDOWN_ENTER_SECONDS = "cooldown_enter";
    private static final String COOLDOWN_EXIT_SECONDS = "cooldown_exit";
    private static final int DEFAULT_NOTIFICATION_RESPONSIVENESS_MS = 30000;
    private static final String ENTER_EVENTS = "enter_events";
    private static final String EXIT_EVENTS = "exit_events";
    private static final String ID = "id";
    private static final String LATITUDE = "latitude";
    private static final String LONGITUDE = "longitude";
    private static final String NOTIFICATION_RESPONSIVENESS_MS = "notification_responsiveness";
    private static final String RADIUS_METERS = "radius";
    private final boolean analyticsEnabledEnter;
    private final boolean analyticsEnabledExit;
    private final int cooldownEnterSeconds;
    private final int cooldownExitSeconds;
    private double distanceFromGeofenceRefresh;
    private final boolean enterEvents;
    private final boolean exitEvents;
    private final String id;
    private final JSONObject jsonObject;
    private final double latitude;
    private final double longitude;
    private final int notificationResponsivenessMs;
    private final int radiusMeter;

    public BrazeGeofence(JSONObject jsonObject, String id, double d, double d2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(id, "id");
        this.jsonObject = jsonObject;
        this.id = id;
        this.latitude = d;
        this.longitude = d2;
        this.radiusMeter = i;
        this.cooldownEnterSeconds = i2;
        this.cooldownExitSeconds = i3;
        this.analyticsEnabledEnter = z;
        this.analyticsEnabledExit = z2;
        this.enterEvents = z3;
        this.exitEvents = z4;
        this.notificationResponsivenessMs = i4;
        this.distanceFromGeofenceRefresh = -1.0d;
    }

    public static /* synthetic */ void getDistanceFromGeofenceRefresh$annotations() {
    }

    public final boolean equivalentServerData(BrazeGeofence otherGeofence) {
        Intrinsics.checkNotNullParameter(otherGeofence, "otherGeofence");
        try {
            return JsonUtils.isEqualTo(this.jsonObject, otherGeofence.getJsonObject());
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean getAnalyticsEnabledEnter() {
        return this.analyticsEnabledEnter;
    }

    public final boolean getAnalyticsEnabledExit() {
        return this.analyticsEnabledExit;
    }

    public final int getCooldownEnterSeconds() {
        return this.cooldownEnterSeconds;
    }

    public final int getCooldownExitSeconds() {
        return this.cooldownExitSeconds;
    }

    public final double getDistanceFromGeofenceRefresh() {
        return this.distanceFromGeofenceRefresh;
    }

    public final boolean getEnterEvents() {
        return this.enterEvents;
    }

    public final boolean getExitEvents() {
        return this.exitEvents;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getNotificationResponsivenessMs() {
        return this.notificationResponsivenessMs;
    }

    public final int getRadiusMeter() {
        return this.radiusMeter;
    }

    public final double getRadiusMeters() {
        return this.radiusMeter;
    }

    public final void setDistanceFromGeofenceRefresh(double d) {
        this.distanceFromGeofenceRefresh = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BrazeGeofence{id=");
        sb.append(this.id).append(", latitude=").append(this.latitude).append(", longitude=").append(this.longitude).append(", radiusMeters=").append(this.radiusMeter).append(", cooldownEnterSeconds=").append(this.cooldownEnterSeconds).append(", cooldownExitSeconds=").append(this.cooldownExitSeconds).append(", analyticsEnabledEnter=").append(this.analyticsEnabledEnter).append(", analyticsEnabledExit=").append(this.analyticsEnabledExit).append(", enterEvents=").append(this.enterEvents).append(", exitEvents=").append(this.exitEvents).append(", notificationResponsivenessMs=").append(this.notificationResponsivenessMs).append(", distanceFromGeofenceRefresh=");
        sb.append(this.distanceFromGeofenceRefresh).append(" }");
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(BrazeGeofence other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d = this.distanceFromGeofenceRefresh;
        return (d != -1.0d && d < other.distanceFromGeofenceRefresh) ? -1 : 1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getJsonObject() {
        return this.jsonObject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BrazeGeofence(JSONObject jsonObject) {
        this(jsonObject, r2, jsonObject.getDouble("latitude"), jsonObject.getDouble("longitude"), jsonObject.getInt(RADIUS_METERS), jsonObject.getInt(COOLDOWN_ENTER_SECONDS), jsonObject.getInt(COOLDOWN_EXIT_SECONDS), jsonObject.getBoolean(ANALYTICS_ENABLED_ENTER), jsonObject.getBoolean(ANALYTICS_ENABLED_EXIT), jsonObject.optBoolean(ENTER_EVENTS, true), jsonObject.optBoolean(EXIT_EVENTS, true), jsonObject.optInt(NOTIFICATION_RESPONSIVENESS_MS, 30000));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(ID)");
    }
}

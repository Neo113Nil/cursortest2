package com.braze.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jacoco.core.runtime.AgentOptions;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b,\b\u0007\u0018\u0000 X2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0002YZBk\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u0012\u0004\b5\u00106R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010)R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b=\u00106\u001a\u0004\b;\u0010<R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010<R \u0010\u000b\u001a\u00020\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bB\u00106\u001a\u0004\bA\u00103R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bD\u00106\u001a\u0004\bC\u00103R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bF\u00106\u001a\u0004\bE\u00103R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010G\u0012\u0004\bJ\u00106\u001a\u0004\bH\u0010IR \u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010G\u0012\u0004\bL\u00106\u001a\u0004\bK\u0010IR \u0010\u0011\u001a\u00020\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010G\u0012\u0004\bN\u00106\u001a\u0004\bM\u0010IR \u0010\u0012\u001a\u00020\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010G\u0012\u0004\bP\u00106\u001a\u0004\bO\u0010IR \u0010\u0013\u001a\u00020\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010@\u0012\u0004\bR\u00106\u001a\u0004\bQ\u00103R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010:\u001a\u0004\bS\u0010<\"\u0004\bT\u0010UR\u0011\u0010W\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bV\u0010<¨\u0006["}, d2 = {"Lcom/braze/models/BrazeGeofence;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "jsonObject", "", "id", "", "latitude", "longitude", "", "radiusMeter", "cooldownEnterSeconds", "cooldownExitSeconds", "", "analyticsEnabledEnter", "analyticsEnabledExit", "enterEvents", "exitEvents", "notificationResponsivenessMs", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;DDIIIZZZZI)V", "(Lorg/json/JSONObject;)V", "seen0", "distanceFromGeofenceRefresh", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DDIIIZZZZIDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", AgentOptions.OUTPUT, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$android_sdk_base_release", "(Lcom/braze/models/BrazeGeofence;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "otherGeofence", "equivalentServerData", "(Lcom/braze/models/BrazeGeofence;)Z", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "forJsonPut", "()Lorg/json/JSONObject;", "other", "compareTo", "(Lcom/braze/models/BrazeGeofence;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getJsonObject$annotations", "()V", "Ljava/lang/String;", "getId", "getId$annotations", "D", "getLatitude", "()D", "getLatitude$annotations", "getLongitude", "getLongitude$annotations", "I", "getRadiusMeter", "getRadiusMeter$annotations", "getCooldownEnterSeconds", "getCooldownEnterSeconds$annotations", "getCooldownExitSeconds", "getCooldownExitSeconds$annotations", "Z", "getAnalyticsEnabledEnter", "()Z", "getAnalyticsEnabledEnter$annotations", "getAnalyticsEnabledExit", "getAnalyticsEnabledExit$annotations", "getEnterEvents", "getEnterEvents$annotations", "getExitEvents", "getExitEvents$annotations", "getNotificationResponsivenessMs", "getNotificationResponsivenessMs$annotations", "getDistanceFromGeofenceRefresh", "setDistanceFromGeofenceRefresh", "(D)V", "getRadiusMeters", "radiusMeters", "Companion", "com/braze/models/d", "com/braze/models/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class BrazeGeofence implements IPutIntoJson<JSONObject>, Comparable<BrazeGeofence> {
    public static final String ANALYTICS_ENABLED_ENTER = "analytics_enabled_enter";
    public static final String ANALYTICS_ENABLED_EXIT = "analytics_enabled_exit";
    public static final String COOLDOWN_ENTER_SECONDS = "cooldown_enter";
    public static final String COOLDOWN_EXIT_SECONDS = "cooldown_exit";
    public static final d Companion = new d();
    public static final int DEFAULT_NOTIFICATION_RESPONSIVENESS_MS = 30000;
    public static final String ENTER_EVENTS = "enter_events";
    public static final String EXIT_EVENTS = "exit_events";
    public static final String ID = "id";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String NOTIFICATION_RESPONSIVENESS_MS = "notification_responsiveness";
    public static final String RADIUS_METERS = "radius";
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

    public /* synthetic */ BrazeGeofence(int i, String str, double d, double d2, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, c.f620a.getDescriptor());
        }
        this.jsonObject = new JSONObject();
        this.id = str;
        this.latitude = d;
        this.longitude = d2;
        this.radiusMeter = i2;
        this.cooldownEnterSeconds = i3;
        this.cooldownExitSeconds = i4;
        this.analyticsEnabledEnter = z;
        this.analyticsEnabledExit = z2;
        this.enterEvents = z3;
        this.exitEvents = z4;
        this.notificationResponsivenessMs = i5;
        this.distanceFromGeofenceRefresh = (i & 2048) == 0 ? -1.0d : d3;
    }

    @SerialName(ANALYTICS_ENABLED_ENTER)
    public static /* synthetic */ void getAnalyticsEnabledEnter$annotations() {
    }

    @SerialName(ANALYTICS_ENABLED_EXIT)
    public static /* synthetic */ void getAnalyticsEnabledExit$annotations() {
    }

    @SerialName(COOLDOWN_ENTER_SECONDS)
    public static /* synthetic */ void getCooldownEnterSeconds$annotations() {
    }

    @SerialName(COOLDOWN_EXIT_SECONDS)
    public static /* synthetic */ void getCooldownExitSeconds$annotations() {
    }

    @SerialName(ENTER_EVENTS)
    public static /* synthetic */ void getEnterEvents$annotations() {
    }

    @SerialName(EXIT_EVENTS)
    public static /* synthetic */ void getExitEvents$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @Transient
    private static /* synthetic */ void getJsonObject$annotations() {
    }

    @SerialName("latitude")
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @SerialName("longitude")
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @SerialName(NOTIFICATION_RESPONSIVENESS_MS)
    public static /* synthetic */ void getNotificationResponsivenessMs$annotations() {
    }

    @SerialName(RADIUS_METERS)
    public static /* synthetic */ void getRadiusMeter$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$android_sdk_base_release(BrazeGeofence self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeDoubleElement(serialDesc, 1, self.latitude);
        output.encodeDoubleElement(serialDesc, 2, self.longitude);
        output.encodeIntElement(serialDesc, 3, self.radiusMeter);
        output.encodeIntElement(serialDesc, 4, self.cooldownEnterSeconds);
        output.encodeIntElement(serialDesc, 5, self.cooldownExitSeconds);
        output.encodeBooleanElement(serialDesc, 6, self.analyticsEnabledEnter);
        output.encodeBooleanElement(serialDesc, 7, self.analyticsEnabledExit);
        output.encodeBooleanElement(serialDesc, 8, self.enterEvents);
        output.encodeBooleanElement(serialDesc, 9, self.exitEvents);
        output.encodeIntElement(serialDesc, 10, self.notificationResponsivenessMs);
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && Double.compare(self.distanceFromGeofenceRefresh, -1.0d) == 0) {
            return;
        }
        output.encodeDoubleElement(serialDesc, 11, self.distanceFromGeofenceRefresh);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BrazeGeofence.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.braze.models.BrazeGeofence");
        BrazeGeofence brazeGeofence = (BrazeGeofence) other;
        return Intrinsics.areEqual(this.id, brazeGeofence.id) && this.latitude == brazeGeofence.latitude && this.longitude == brazeGeofence.longitude && this.radiusMeter == brazeGeofence.radiusMeter && this.cooldownEnterSeconds == brazeGeofence.cooldownEnterSeconds && this.cooldownExitSeconds == brazeGeofence.cooldownExitSeconds && this.analyticsEnabledEnter == brazeGeofence.analyticsEnabledEnter && this.analyticsEnabledExit == brazeGeofence.analyticsEnabledExit && this.enterEvents == brazeGeofence.enterEvents && this.exitEvents == brazeGeofence.exitEvents && this.notificationResponsivenessMs == brazeGeofence.notificationResponsivenessMs;
    }

    public final boolean equivalentServerData(BrazeGeofence otherGeofence) {
        Intrinsics.checkNotNullParameter(otherGeofence, "otherGeofence");
        try {
            return Intrinsics.areEqual(this, otherGeofence);
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

    public int hashCode() {
        return Double.hashCode(getRadiusMeters()) + ((((Boolean.hashCode(this.exitEvents) + ((Boolean.hashCode(this.enterEvents) + ((Boolean.hashCode(this.analyticsEnabledExit) + ((Boolean.hashCode(this.analyticsEnabledEnter) + ((((((((Double.hashCode(this.longitude) + ((Double.hashCode(this.latitude) + ((this.id.hashCode() + (this.jsonObject.hashCode() * 31)) * 31)) * 31)) * 31) + this.radiusMeter) * 31) + this.cooldownEnterSeconds) * 31) + this.cooldownExitSeconds) * 31)) * 31)) * 31)) * 31)) * 31) + this.notificationResponsivenessMs) * 31);
    }

    public final void setDistanceFromGeofenceRefresh(double d) {
        this.distanceFromGeofenceRefresh = d;
    }

    public String toString() {
        return StringsKt.trimMargin$default("BrazeGeofence{id=" + this.id + ", \n            |latitude, longitude=(" + this.latitude + ", " + this.longitude + "),\n            |radiusMeters=" + this.radiusMeter + ", \n            |cooldownEnterSeconds=" + this.cooldownEnterSeconds + ", \n            |cooldownExitSeconds=" + this.cooldownExitSeconds + ", \n            |analyticsEnabledEnter=" + this.analyticsEnabledEnter + ", \n            |analyticsEnabledExit=" + this.analyticsEnabledExit + ", \n            |enterEvents=" + this.enterEvents + ", \n            |exitEvents=" + this.exitEvents + ", \n            |notificationResponsivenessMs=" + this.notificationResponsivenessMs + ", \n            |distanceFromGeofenceRefresh=" + this.distanceFromGeofenceRefresh + " }\n            |\n        ", null, 1, null);
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

    public /* synthetic */ BrazeGeofence(JSONObject jSONObject, String str, double d, double d2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new JSONObject() : jSONObject, str, d, d2, i, i2, i3, z, z2, z3, z4, i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BrazeGeofence(JSONObject jsonObject) {
        this(jsonObject, r2, jsonObject.getDouble("latitude"), jsonObject.getDouble("longitude"), jsonObject.getInt(RADIUS_METERS), jsonObject.getInt(COOLDOWN_ENTER_SECONDS), jsonObject.getInt(COOLDOWN_EXIT_SECONDS), jsonObject.getBoolean(ANALYTICS_ENABLED_ENTER), jsonObject.getBoolean(ANALYTICS_ENABLED_EXIT), jsonObject.optBoolean(ENTER_EVENTS, true), jsonObject.optBoolean(EXIT_EVENTS, true), jsonObject.optInt(NOTIFICATION_RESPONSIVENESS_MS, 30000));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
    }
}

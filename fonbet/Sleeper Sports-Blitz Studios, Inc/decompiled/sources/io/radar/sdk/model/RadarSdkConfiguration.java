package io.radar.sdk.model;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.RadarSettings;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarSdkConfiguration.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 82\u00020\u0001:\u00018Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0006\u00104\u001a\u000205J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00069"}, d2 = {"Lio/radar/sdk/model/RadarSdkConfiguration;", "", RadarSdkConfiguration.MAX_CONCURRENT_JOBS, "", "schedulerRequiresNetwork", "", RadarSdkConfiguration.USE_PERSISTENCE, RadarSdkConfiguration.EXTEND_FLUSH_REPLAYS, RadarSdkConfiguration.USE_LOG_PERSISTENCE, RadarSdkConfiguration.USE_RADAR_MODIFIED_BEACON, RadarSdkConfiguration.LOG_LEVEL, "Lio/radar/sdk/Radar$RadarLogLevel;", RadarSdkConfiguration.START_TRACKING_ON_INITIALIZE, RadarSdkConfiguration.TRACK_ONCE_ON_APP_OPEN, RadarSdkConfiguration.USE_OPENED_APP_CONVERSION, RadarSdkConfiguration.USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF, RadarSdkConfiguration.LOCATION_MANAGER_TIMEOUT, RadarSdkConfiguration.SYNC_AFTER_SET_USER, "(IZZZZZLio/radar/sdk/Radar$RadarLogLevel;ZZZZIZ)V", "getExtendFlushReplays", "()Z", "getLocationManagerTimeout", "()I", "getLogLevel", "()Lio/radar/sdk/Radar$RadarLogLevel;", "getMaxConcurrentJobs", "getSchedulerRequiresNetwork", "getStartTrackingOnInitialize", "getSyncAfterSetUser", "getTrackOnceOnAppOpen", "getUseForegroundLocationUpdatedAtMsDiff", "getUseLogPersistence", "getUseOpenedAppConversion", "getUsePersistence", "getUseRadarModifiedBeacon", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toJson", "Lorg/json/JSONObject;", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RadarSdkConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_MAX_CONCURRENT_JOBS = 1;
    private static final String EXTEND_FLUSH_REPLAYS = "extendFlushReplays";
    private static final String LOCATION_MANAGER_TIMEOUT = "locationManagerTimeout";
    private static final String LOG_LEVEL = "logLevel";
    private static final String MAX_CONCURRENT_JOBS = "maxConcurrentJobs";
    private static final String SCHEDULER_REQUIRES_NETWORK = "networkAny";
    private static final String START_TRACKING_ON_INITIALIZE = "startTrackingOnInitialize";
    private static final String SYNC_AFTER_SET_USER = "syncAfterSetUser";
    private static final String TRACK_ONCE_ON_APP_OPEN = "trackOnceOnAppOpen";
    private static final String USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF = "useForegroundLocationUpdatedAtMsDiff";
    private static final String USE_LOG_PERSISTENCE = "useLogPersistence";
    private static final String USE_OPENED_APP_CONVERSION = "useOpenedAppConversion";
    private static final String USE_PERSISTENCE = "usePersistence";
    private static final String USE_RADAR_MODIFIED_BEACON = "useRadarModifiedBeacon";
    private final boolean extendFlushReplays;
    private final int locationManagerTimeout;
    private final Radar.RadarLogLevel logLevel;
    private final int maxConcurrentJobs;
    private final boolean schedulerRequiresNetwork;
    private final boolean startTrackingOnInitialize;
    private final boolean syncAfterSetUser;
    private final boolean trackOnceOnAppOpen;
    private final boolean useForegroundLocationUpdatedAtMsDiff;
    private final boolean useLogPersistence;
    private final boolean useOpenedAppConversion;
    private final boolean usePersistence;
    private final boolean useRadarModifiedBeacon;

    public static /* synthetic */ RadarSdkConfiguration copy$default(RadarSdkConfiguration radarSdkConfiguration, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Radar.RadarLogLevel radarLogLevel, boolean z6, boolean z7, boolean z8, boolean z9, int i2, boolean z10, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = radarSdkConfiguration.maxConcurrentJobs;
        }
        return radarSdkConfiguration.copy(i, (i3 & 2) != 0 ? radarSdkConfiguration.schedulerRequiresNetwork : z, (i3 & 4) != 0 ? radarSdkConfiguration.usePersistence : z2, (i3 & 8) != 0 ? radarSdkConfiguration.extendFlushReplays : z3, (i3 & 16) != 0 ? radarSdkConfiguration.useLogPersistence : z4, (i3 & 32) != 0 ? radarSdkConfiguration.useRadarModifiedBeacon : z5, (i3 & 64) != 0 ? radarSdkConfiguration.logLevel : radarLogLevel, (i3 & 128) != 0 ? radarSdkConfiguration.startTrackingOnInitialize : z6, (i3 & 256) != 0 ? radarSdkConfiguration.trackOnceOnAppOpen : z7, (i3 & 512) != 0 ? radarSdkConfiguration.useOpenedAppConversion : z8, (i3 & 1024) != 0 ? radarSdkConfiguration.useForegroundLocationUpdatedAtMsDiff : z9, (i3 & 2048) != 0 ? radarSdkConfiguration.locationManagerTimeout : i2, (i3 & 4096) != 0 ? radarSdkConfiguration.syncAfterSetUser : z10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getUseOpenedAppConversion() {
        return this.useOpenedAppConversion;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getUseForegroundLocationUpdatedAtMsDiff() {
        return this.useForegroundLocationUpdatedAtMsDiff;
    }

    /* renamed from: component12, reason: from getter */
    public final int getLocationManagerTimeout() {
        return this.locationManagerTimeout;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getSyncAfterSetUser() {
        return this.syncAfterSetUser;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSchedulerRequiresNetwork() {
        return this.schedulerRequiresNetwork;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUsePersistence() {
        return this.usePersistence;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getExtendFlushReplays() {
        return this.extendFlushReplays;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseLogPersistence() {
        return this.useLogPersistence;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUseRadarModifiedBeacon() {
        return this.useRadarModifiedBeacon;
    }

    /* renamed from: component7, reason: from getter */
    public final Radar.RadarLogLevel getLogLevel() {
        return this.logLevel;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getStartTrackingOnInitialize() {
        return this.startTrackingOnInitialize;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getTrackOnceOnAppOpen() {
        return this.trackOnceOnAppOpen;
    }

    public final RadarSdkConfiguration copy(int maxConcurrentJobs, boolean schedulerRequiresNetwork, boolean usePersistence, boolean extendFlushReplays, boolean useLogPersistence, boolean useRadarModifiedBeacon, Radar.RadarLogLevel logLevel, boolean startTrackingOnInitialize, boolean trackOnceOnAppOpen, boolean useOpenedAppConversion, boolean useForegroundLocationUpdatedAtMsDiff, int locationManagerTimeout, boolean syncAfterSetUser) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return new RadarSdkConfiguration(maxConcurrentJobs, schedulerRequiresNetwork, usePersistence, extendFlushReplays, useLogPersistence, useRadarModifiedBeacon, logLevel, startTrackingOnInitialize, trackOnceOnAppOpen, useOpenedAppConversion, useForegroundLocationUpdatedAtMsDiff, locationManagerTimeout, syncAfterSetUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarSdkConfiguration)) {
            return false;
        }
        RadarSdkConfiguration radarSdkConfiguration = (RadarSdkConfiguration) other;
        return this.maxConcurrentJobs == radarSdkConfiguration.maxConcurrentJobs && this.schedulerRequiresNetwork == radarSdkConfiguration.schedulerRequiresNetwork && this.usePersistence == radarSdkConfiguration.usePersistence && this.extendFlushReplays == radarSdkConfiguration.extendFlushReplays && this.useLogPersistence == radarSdkConfiguration.useLogPersistence && this.useRadarModifiedBeacon == radarSdkConfiguration.useRadarModifiedBeacon && this.logLevel == radarSdkConfiguration.logLevel && this.startTrackingOnInitialize == radarSdkConfiguration.startTrackingOnInitialize && this.trackOnceOnAppOpen == radarSdkConfiguration.trackOnceOnAppOpen && this.useOpenedAppConversion == radarSdkConfiguration.useOpenedAppConversion && this.useForegroundLocationUpdatedAtMsDiff == radarSdkConfiguration.useForegroundLocationUpdatedAtMsDiff && this.locationManagerTimeout == radarSdkConfiguration.locationManagerTimeout && this.syncAfterSetUser == radarSdkConfiguration.syncAfterSetUser;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Integer.hashCode(this.maxConcurrentJobs) * 31) + Boolean.hashCode(this.schedulerRequiresNetwork)) * 31) + Boolean.hashCode(this.usePersistence)) * 31) + Boolean.hashCode(this.extendFlushReplays)) * 31) + Boolean.hashCode(this.useLogPersistence)) * 31) + Boolean.hashCode(this.useRadarModifiedBeacon)) * 31) + this.logLevel.hashCode()) * 31) + Boolean.hashCode(this.startTrackingOnInitialize)) * 31) + Boolean.hashCode(this.trackOnceOnAppOpen)) * 31) + Boolean.hashCode(this.useOpenedAppConversion)) * 31) + Boolean.hashCode(this.useForegroundLocationUpdatedAtMsDiff)) * 31) + Integer.hashCode(this.locationManagerTimeout)) * 31) + Boolean.hashCode(this.syncAfterSetUser);
    }

    public String toString() {
        return "RadarSdkConfiguration(maxConcurrentJobs=" + this.maxConcurrentJobs + ", schedulerRequiresNetwork=" + this.schedulerRequiresNetwork + ", usePersistence=" + this.usePersistence + ", extendFlushReplays=" + this.extendFlushReplays + ", useLogPersistence=" + this.useLogPersistence + ", useRadarModifiedBeacon=" + this.useRadarModifiedBeacon + ", logLevel=" + this.logLevel + ", startTrackingOnInitialize=" + this.startTrackingOnInitialize + ", trackOnceOnAppOpen=" + this.trackOnceOnAppOpen + ", useOpenedAppConversion=" + this.useOpenedAppConversion + ", useForegroundLocationUpdatedAtMsDiff=" + this.useForegroundLocationUpdatedAtMsDiff + ", locationManagerTimeout=" + this.locationManagerTimeout + ", syncAfterSetUser=" + this.syncAfterSetUser + ')';
    }

    public RadarSdkConfiguration(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Radar.RadarLogLevel logLevel, boolean z6, boolean z7, boolean z8, boolean z9, int i2, boolean z10) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.maxConcurrentJobs = i;
        this.schedulerRequiresNetwork = z;
        this.usePersistence = z2;
        this.extendFlushReplays = z3;
        this.useLogPersistence = z4;
        this.useRadarModifiedBeacon = z5;
        this.logLevel = logLevel;
        this.startTrackingOnInitialize = z6;
        this.trackOnceOnAppOpen = z7;
        this.useOpenedAppConversion = z8;
        this.useForegroundLocationUpdatedAtMsDiff = z9;
        this.locationManagerTimeout = i2;
        this.syncAfterSetUser = z10;
    }

    public /* synthetic */ RadarSdkConfiguration(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Radar.RadarLogLevel radarLogLevel, boolean z6, boolean z7, boolean z8, boolean z9, int i2, boolean z10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, z2, z3, z4, z5, radarLogLevel, z6, z7, (i3 & 512) != 0 ? false : z8, (i3 & 1024) != 0 ? false : z9, (i3 & 2048) != 0 ? 0 : i2, (i3 & 4096) != 0 ? false : z10);
    }

    public final int getMaxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

    public final boolean getSchedulerRequiresNetwork() {
        return this.schedulerRequiresNetwork;
    }

    public final boolean getUsePersistence() {
        return this.usePersistence;
    }

    public final boolean getExtendFlushReplays() {
        return this.extendFlushReplays;
    }

    public final boolean getUseLogPersistence() {
        return this.useLogPersistence;
    }

    public final boolean getUseRadarModifiedBeacon() {
        return this.useRadarModifiedBeacon;
    }

    public final Radar.RadarLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final boolean getStartTrackingOnInitialize() {
        return this.startTrackingOnInitialize;
    }

    public final boolean getTrackOnceOnAppOpen() {
        return this.trackOnceOnAppOpen;
    }

    public final boolean getUseOpenedAppConversion() {
        return this.useOpenedAppConversion;
    }

    public final boolean getUseForegroundLocationUpdatedAtMsDiff() {
        return this.useForegroundLocationUpdatedAtMsDiff;
    }

    public final int getLocationManagerTimeout() {
        return this.locationManagerTimeout;
    }

    public final boolean getSyncAfterSetUser() {
        return this.syncAfterSetUser;
    }

    /* compiled from: RadarSdkConfiguration.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lio/radar/sdk/model/RadarSdkConfiguration$Companion;", "", "()V", "DEFAULT_MAX_CONCURRENT_JOBS", "", "EXTEND_FLUSH_REPLAYS", "", "LOCATION_MANAGER_TIMEOUT", "LOG_LEVEL", "MAX_CONCURRENT_JOBS", "SCHEDULER_REQUIRES_NETWORK", "START_TRACKING_ON_INITIALIZE", "SYNC_AFTER_SET_USER", "TRACK_ONCE_ON_APP_OPEN", "USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF", "USE_LOG_PERSISTENCE", "USE_OPENED_APP_CONVERSION", "USE_PERSISTENCE", "USE_RADAR_MODIFIED_BEACON", "fromJson", "Lio/radar/sdk/model/RadarSdkConfiguration;", "json", "Lorg/json/JSONObject;", "updateSdkConfigurationFromServer", "", "context", "Landroid/content/Context;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RadarSdkConfiguration fromJson(JSONObject json) {
            JSONObject jSONObject = json == null ? new JSONObject() : json;
            int optInt = jSONObject.optInt(RadarSdkConfiguration.MAX_CONCURRENT_JOBS, 1);
            boolean optBoolean = jSONObject.optBoolean(RadarSdkConfiguration.SCHEDULER_REQUIRES_NETWORK, false);
            boolean optBoolean2 = jSONObject.optBoolean(RadarSdkConfiguration.USE_PERSISTENCE, false);
            boolean optBoolean3 = jSONObject.optBoolean(RadarSdkConfiguration.EXTEND_FLUSH_REPLAYS, false);
            boolean optBoolean4 = jSONObject.optBoolean(RadarSdkConfiguration.USE_LOG_PERSISTENCE, false);
            boolean optBoolean5 = jSONObject.optBoolean(RadarSdkConfiguration.USE_RADAR_MODIFIED_BEACON, false);
            String optString = jSONObject.optString(RadarSdkConfiguration.LOG_LEVEL, "info");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            String upperCase = optString.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return new RadarSdkConfiguration(optInt, optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, Radar.RadarLogLevel.valueOf(upperCase), jSONObject.optBoolean(RadarSdkConfiguration.START_TRACKING_ON_INITIALIZE, false), jSONObject.optBoolean(RadarSdkConfiguration.TRACK_ONCE_ON_APP_OPEN, false), jSONObject.optBoolean(RadarSdkConfiguration.USE_OPENED_APP_CONVERSION, true), jSONObject.optBoolean(RadarSdkConfiguration.USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF, false), jSONObject.optInt(RadarSdkConfiguration.LOCATION_MANAGER_TIMEOUT, 0), jSONObject.optBoolean(RadarSdkConfiguration.SYNC_AFTER_SET_USER, false));
        }

        public final void updateSdkConfigurationFromServer(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Radar.INSTANCE.getApiClient$sdk_release().getConfig$sdk_release("sdkConfigUpdate", false, new RadarApiClient.RadarGetConfigApiCallback() { // from class: io.radar.sdk.model.RadarSdkConfiguration$Companion$updateSdkConfigurationFromServer$1
                @Override // io.radar.sdk.RadarApiClient.RadarGetConfigApiCallback
                public void onComplete(Radar.RadarStatus status, RadarConfig config) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    if (config == null) {
                        return;
                    }
                    RadarSettings.INSTANCE.setSdkConfiguration(context, config.getMeta().getSdkConfiguration());
                }
            });
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(SCHEDULER_REQUIRES_NETWORK, Boolean.valueOf(this.schedulerRequiresNetwork));
        jSONObject.putOpt(MAX_CONCURRENT_JOBS, Integer.valueOf(this.maxConcurrentJobs));
        jSONObject.putOpt(USE_PERSISTENCE, Boolean.valueOf(this.usePersistence));
        jSONObject.putOpt(EXTEND_FLUSH_REPLAYS, Boolean.valueOf(this.extendFlushReplays));
        jSONObject.putOpt(USE_LOG_PERSISTENCE, Boolean.valueOf(this.useLogPersistence));
        jSONObject.putOpt(USE_RADAR_MODIFIED_BEACON, Boolean.valueOf(this.useRadarModifiedBeacon));
        String lowerCase = this.logLevel.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject.putOpt(LOG_LEVEL, lowerCase);
        jSONObject.putOpt(START_TRACKING_ON_INITIALIZE, Boolean.valueOf(this.startTrackingOnInitialize));
        jSONObject.putOpt(TRACK_ONCE_ON_APP_OPEN, Boolean.valueOf(this.trackOnceOnAppOpen));
        jSONObject.putOpt(USE_OPENED_APP_CONVERSION, Boolean.valueOf(this.useOpenedAppConversion));
        jSONObject.putOpt(USE_FOREGROUND_LOCATION_UPDATED_AT_MS_DIFF, Boolean.valueOf(this.useForegroundLocationUpdatedAtMsDiff));
        jSONObject.putOpt(LOCATION_MANAGER_TIMEOUT, Integer.valueOf(this.locationManagerTimeout));
        jSONObject.putOpt(SYNC_AFTER_SET_USER, Boolean.valueOf(this.syncAfterSetUser));
        return jSONObject;
    }
}

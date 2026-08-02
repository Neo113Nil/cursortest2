package io.radar.sdk;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.tencent.mmkv.MMKV;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.bm.Rule;
import org.json.JSONObject;

/* compiled from: RadarTrackingOptions.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b[\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 x2\u00020\u0001:\u0006xyz{|}B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0002\u0010\u001fJ\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\\\u001a\u00020\u0010HÆ\u0003J\t\u0010]\u001a\u00020\u0012HÆ\u0003J\t\u0010^\u001a\u00020\u0014HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0014HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0019HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0014HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0014HÆ\u0003J\t\u0010g\u001a\u00020\u0014HÆ\u0003J\t\u0010h\u001a\u00020\u0014HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\tHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\rHÆ\u0003Jé\u0001\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u0014HÆ\u0001J\u0013\u0010q\u001a\u00020\u00142\b\u0010r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010s\u001a\u00020\u0003HÖ\u0001J\u0006\u0010t\u001a\u00020uJ\t\u0010v\u001a\u00020wHÖ\u0001R\u001a\u0010\u001c\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\u001a\u0010\u001b\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010)\"\u0004\bC\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010)\"\u0004\bQ\u0010+R\u001a\u0010\u001d\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010!\"\u0004\bS\u0010#R\u001a\u0010\u0016\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010!\"\u0004\bU\u0010#R\u001a\u0010\u001e\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010!\"\u0004\bW\u0010#R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010!\"\u0004\bY\u0010#¨\u0006~"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions;", "", RadarTrackingOptions.KEY_DESIRED_STOPPED_UPDATE_INTERVAL, "", RadarTrackingOptions.KEY_FASTEST_STOPPED_UPDATE_INTERVAL, RadarTrackingOptions.KEY_DESIRED_MOVING_UPDATE_INTERVAL, RadarTrackingOptions.KEY_FASTEST_MOVING_UPDATE_INTERVAL, RadarTrackingOptions.KEY_DESIRED_SYNC_INTERVAL, RadarTrackingOptions.KEY_DESIRED_ACCURACY, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", RadarTrackingOptions.KEY_STOP_DURATION, RadarTrackingOptions.KEY_STOP_DISTANCE, RadarTrackingOptions.KEY_START_TRACKING_AFTER, "Ljava/util/Date;", RadarTrackingOptions.KEY_STOP_TRACKING_AFTER, RadarTrackingOptions.KEY_REPLAY, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", "sync", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", RadarTrackingOptions.KEY_USE_STOPPED_GEOFENCE, "", RadarTrackingOptions.KEY_STOPPED_GEOFENCE_RADIUS, RadarTrackingOptions.KEY_USE_MOVING_GEOFENCE, RadarTrackingOptions.KEY_MOVING_GEOFENCE_RADIUS, RadarTrackingOptions.KEY_SYNC_GEOFENCES, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", RadarTrackingOptions.KEY_SYNC_GEOFENCES_LIMIT, RadarTrackingOptions.KEY_FOREGROUND_SERVICE_ENABLED, RadarTrackingOptions.KEY_BEACONS, RadarTrackingOptions.KEY_USE_MOTION, RadarTrackingOptions.KEY_USE_PRESSURE, "(IIIIILio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;IILjava/util/Date;Ljava/util/Date;Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;ZIZILio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;IZZZZ)V", "getBeacons", "()Z", "setBeacons", "(Z)V", "getDesiredAccuracy", "()Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "setDesiredAccuracy", "(Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;)V", "getDesiredMovingUpdateInterval", "()I", "setDesiredMovingUpdateInterval", "(I)V", "getDesiredStoppedUpdateInterval", "setDesiredStoppedUpdateInterval", "getDesiredSyncInterval", "setDesiredSyncInterval", "getFastestMovingUpdateInterval", "setFastestMovingUpdateInterval", "getFastestStoppedUpdateInterval", "setFastestStoppedUpdateInterval", "getForegroundServiceEnabled", "setForegroundServiceEnabled", "getMovingGeofenceRadius", "setMovingGeofenceRadius", "getReplay", "()Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", "setReplay", "(Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;)V", "getStartTrackingAfter", "()Ljava/util/Date;", "setStartTrackingAfter", "(Ljava/util/Date;)V", "getStopDistance", "setStopDistance", "getStopDuration", "setStopDuration", "getStopTrackingAfter", "setStopTrackingAfter", "getStoppedGeofenceRadius", "setStoppedGeofenceRadius", "getSync", "()Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", "setSync", "(Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;)V", "getSyncGeofences", "()Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", "setSyncGeofences", "(Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;)V", "getSyncGeofencesLimit", "setSyncGeofencesLimit", "getUseMotion", "setUseMotion", "getUseMovingGeofence", "setUseMovingGeofence", "getUsePressure", "setUsePressure", "getUseStoppedGeofence", "setUseStoppedGeofence", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toJson", "Lorg/json/JSONObject;", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "RadarTrackingOptionsDesiredAccuracy", "RadarTrackingOptionsForegroundService", "RadarTrackingOptionsReplay", "RadarTrackingOptionsSync", "RadarTrackingOptionsSyncGeofences", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RadarTrackingOptions {
    public static final String KEY_BEACONS = "beacons";
    public static final String KEY_DESIRED_ACCURACY = "desiredAccuracy";
    public static final String KEY_DESIRED_MOVING_UPDATE_INTERVAL = "desiredMovingUpdateInterval";
    public static final String KEY_DESIRED_STOPPED_UPDATE_INTERVAL = "desiredStoppedUpdateInterval";
    public static final String KEY_DESIRED_SYNC_INTERVAL = "desiredSyncInterval";
    public static final String KEY_FASTEST_MOVING_UPDATE_INTERVAL = "fastestMovingUpdateInterval";
    public static final String KEY_FASTEST_STOPPED_UPDATE_INTERVAL = "fastestStoppedUpdateInterval";
    public static final String KEY_FOREGROUND_SERVICE_ENABLED = "foregroundServiceEnabled";
    public static final String KEY_MOVING_GEOFENCE_RADIUS = "movingGeofenceRadius";
    public static final String KEY_REPLAY = "replay";
    public static final String KEY_START_TRACKING_AFTER = "startTrackingAfter";
    public static final String KEY_STOPPED_GEOFENCE_RADIUS = "stoppedGeofenceRadius";
    public static final String KEY_STOP_DISTANCE = "stopDistance";
    public static final String KEY_STOP_DURATION = "stopDuration";
    public static final String KEY_STOP_TRACKING_AFTER = "stopTrackingAfter";
    public static final String KEY_SYNC = "sync";
    public static final String KEY_SYNC_GEOFENCES = "syncGeofences";
    public static final String KEY_SYNC_GEOFENCES_LIMIT = "syncGeofencesLimit";
    public static final String KEY_USE_MOTION = "useMotion";
    public static final String KEY_USE_MOVING_GEOFENCE = "useMovingGeofence";
    public static final String KEY_USE_PRESSURE = "usePressure";
    public static final String KEY_USE_STOPPED_GEOFENCE = "useStoppedGeofence";
    private boolean beacons;
    private RadarTrackingOptionsDesiredAccuracy desiredAccuracy;
    private int desiredMovingUpdateInterval;
    private int desiredStoppedUpdateInterval;
    private int desiredSyncInterval;
    private int fastestMovingUpdateInterval;
    private int fastestStoppedUpdateInterval;
    private boolean foregroundServiceEnabled;
    private int movingGeofenceRadius;
    private RadarTrackingOptionsReplay replay;
    private Date startTrackingAfter;
    private int stopDistance;
    private int stopDuration;
    private Date stopTrackingAfter;
    private int stoppedGeofenceRadius;
    private RadarTrackingOptionsSync sync;
    private RadarTrackingOptionsSyncGeofences syncGeofences;
    private int syncGeofencesLimit;
    private boolean useMotion;
    private boolean useMovingGeofence;
    private boolean usePressure;
    private boolean useStoppedGeofence;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final RadarTrackingOptions CONTINUOUS = new RadarTrackingOptions(30, 30, 30, 30, 20, RadarTrackingOptionsDesiredAccuracy.HIGH, 140, 70, null, null, RadarTrackingOptionsReplay.NONE, RadarTrackingOptionsSync.ALL, false, 0, false, 0, RadarTrackingOptionsSyncGeofences.NEAREST, 0, true, false, false, false);
    public static final RadarTrackingOptions RESPONSIVE = new RadarTrackingOptions(0, 0, 150, 30, 20, RadarTrackingOptionsDesiredAccuracy.MEDIUM, 140, 70, null, null, RadarTrackingOptionsReplay.STOPS, RadarTrackingOptionsSync.ALL, true, 100, true, 100, RadarTrackingOptionsSyncGeofences.NEAREST, 10, false, false, false, false);
    public static final RadarTrackingOptions EFFICIENT = new RadarTrackingOptions(MMKV.ExpireInHour, 1200, 1200, 360, 140, RadarTrackingOptionsDesiredAccuracy.MEDIUM, 140, 70, null, null, RadarTrackingOptionsReplay.STOPS, RadarTrackingOptionsSync.ALL, false, 0, false, 0, RadarTrackingOptionsSyncGeofences.NEAREST, 10, false, false, false, false);

    public static /* synthetic */ RadarTrackingOptions copy$default(RadarTrackingOptions radarTrackingOptions, int i, int i2, int i3, int i4, int i5, RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy, int i6, int i7, Date date, Date date2, RadarTrackingOptionsReplay radarTrackingOptionsReplay, RadarTrackingOptionsSync radarTrackingOptionsSync, boolean z, int i8, boolean z2, int i9, RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences, int i10, boolean z3, boolean z4, boolean z5, boolean z6, int i11, Object obj) {
        boolean z7;
        boolean z8;
        int i12 = (i11 & 1) != 0 ? radarTrackingOptions.desiredStoppedUpdateInterval : i;
        int i13 = (i11 & 2) != 0 ? radarTrackingOptions.fastestStoppedUpdateInterval : i2;
        int i14 = (i11 & 4) != 0 ? radarTrackingOptions.desiredMovingUpdateInterval : i3;
        int i15 = (i11 & 8) != 0 ? radarTrackingOptions.fastestMovingUpdateInterval : i4;
        int i16 = (i11 & 16) != 0 ? radarTrackingOptions.desiredSyncInterval : i5;
        RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy2 = (i11 & 32) != 0 ? radarTrackingOptions.desiredAccuracy : radarTrackingOptionsDesiredAccuracy;
        int i17 = (i11 & 64) != 0 ? radarTrackingOptions.stopDuration : i6;
        int i18 = (i11 & 128) != 0 ? radarTrackingOptions.stopDistance : i7;
        Date date3 = (i11 & 256) != 0 ? radarTrackingOptions.startTrackingAfter : date;
        Date date4 = (i11 & 512) != 0 ? radarTrackingOptions.stopTrackingAfter : date2;
        RadarTrackingOptionsReplay radarTrackingOptionsReplay2 = (i11 & 1024) != 0 ? radarTrackingOptions.replay : radarTrackingOptionsReplay;
        RadarTrackingOptionsSync radarTrackingOptionsSync2 = (i11 & 2048) != 0 ? radarTrackingOptions.sync : radarTrackingOptionsSync;
        boolean z9 = (i11 & 4096) != 0 ? radarTrackingOptions.useStoppedGeofence : z;
        int i19 = (i11 & 8192) != 0 ? radarTrackingOptions.stoppedGeofenceRadius : i8;
        int i20 = i12;
        boolean z10 = (i11 & 16384) != 0 ? radarTrackingOptions.useMovingGeofence : z2;
        int i21 = (i11 & 32768) != 0 ? radarTrackingOptions.movingGeofenceRadius : i9;
        RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences2 = (i11 & 65536) != 0 ? radarTrackingOptions.syncGeofences : radarTrackingOptionsSyncGeofences;
        int i22 = (i11 & 131072) != 0 ? radarTrackingOptions.syncGeofencesLimit : i10;
        boolean z11 = (i11 & 262144) != 0 ? radarTrackingOptions.foregroundServiceEnabled : z3;
        boolean z12 = (i11 & 524288) != 0 ? radarTrackingOptions.beacons : z4;
        boolean z13 = (i11 & 1048576) != 0 ? radarTrackingOptions.useMotion : z5;
        if ((i11 & 2097152) != 0) {
            z8 = z13;
            z7 = radarTrackingOptions.usePressure;
        } else {
            z7 = z6;
            z8 = z13;
        }
        return radarTrackingOptions.copy(i20, i13, i14, i15, i16, radarTrackingOptionsDesiredAccuracy2, i17, i18, date3, date4, radarTrackingOptionsReplay2, radarTrackingOptionsSync2, z9, i19, z10, i21, radarTrackingOptionsSyncGeofences2, i22, z11, z12, z8, z7);
    }

    @JvmStatic
    public static final RadarTrackingOptions fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDesiredStoppedUpdateInterval() {
        return this.desiredStoppedUpdateInterval;
    }

    /* renamed from: component10, reason: from getter */
    public final Date getStopTrackingAfter() {
        return this.stopTrackingAfter;
    }

    /* renamed from: component11, reason: from getter */
    public final RadarTrackingOptionsReplay getReplay() {
        return this.replay;
    }

    /* renamed from: component12, reason: from getter */
    public final RadarTrackingOptionsSync getSync() {
        return this.sync;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getUseStoppedGeofence() {
        return this.useStoppedGeofence;
    }

    /* renamed from: component14, reason: from getter */
    public final int getStoppedGeofenceRadius() {
        return this.stoppedGeofenceRadius;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getUseMovingGeofence() {
        return this.useMovingGeofence;
    }

    /* renamed from: component16, reason: from getter */
    public final int getMovingGeofenceRadius() {
        return this.movingGeofenceRadius;
    }

    /* renamed from: component17, reason: from getter */
    public final RadarTrackingOptionsSyncGeofences getSyncGeofences() {
        return this.syncGeofences;
    }

    /* renamed from: component18, reason: from getter */
    public final int getSyncGeofencesLimit() {
        return this.syncGeofencesLimit;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getForegroundServiceEnabled() {
        return this.foregroundServiceEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFastestStoppedUpdateInterval() {
        return this.fastestStoppedUpdateInterval;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getBeacons() {
        return this.beacons;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getUseMotion() {
        return this.useMotion;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getUsePressure() {
        return this.usePressure;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDesiredMovingUpdateInterval() {
        return this.desiredMovingUpdateInterval;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFastestMovingUpdateInterval() {
        return this.fastestMovingUpdateInterval;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDesiredSyncInterval() {
        return this.desiredSyncInterval;
    }

    /* renamed from: component6, reason: from getter */
    public final RadarTrackingOptionsDesiredAccuracy getDesiredAccuracy() {
        return this.desiredAccuracy;
    }

    /* renamed from: component7, reason: from getter */
    public final int getStopDuration() {
        return this.stopDuration;
    }

    /* renamed from: component8, reason: from getter */
    public final int getStopDistance() {
        return this.stopDistance;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getStartTrackingAfter() {
        return this.startTrackingAfter;
    }

    public final RadarTrackingOptions copy(int desiredStoppedUpdateInterval, int fastestStoppedUpdateInterval, int desiredMovingUpdateInterval, int fastestMovingUpdateInterval, int desiredSyncInterval, RadarTrackingOptionsDesiredAccuracy desiredAccuracy, int stopDuration, int stopDistance, Date startTrackingAfter, Date stopTrackingAfter, RadarTrackingOptionsReplay replay, RadarTrackingOptionsSync sync, boolean useStoppedGeofence, int stoppedGeofenceRadius, boolean useMovingGeofence, int movingGeofenceRadius, RadarTrackingOptionsSyncGeofences syncGeofences, int syncGeofencesLimit, boolean foregroundServiceEnabled, boolean beacons, boolean useMotion, boolean usePressure) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(replay, "replay");
        Intrinsics.checkNotNullParameter(sync, "sync");
        Intrinsics.checkNotNullParameter(syncGeofences, "syncGeofences");
        return new RadarTrackingOptions(desiredStoppedUpdateInterval, fastestStoppedUpdateInterval, desiredMovingUpdateInterval, fastestMovingUpdateInterval, desiredSyncInterval, desiredAccuracy, stopDuration, stopDistance, startTrackingAfter, stopTrackingAfter, replay, sync, useStoppedGeofence, stoppedGeofenceRadius, useMovingGeofence, movingGeofenceRadius, syncGeofences, syncGeofencesLimit, foregroundServiceEnabled, beacons, useMotion, usePressure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarTrackingOptions)) {
            return false;
        }
        RadarTrackingOptions radarTrackingOptions = (RadarTrackingOptions) other;
        return this.desiredStoppedUpdateInterval == radarTrackingOptions.desiredStoppedUpdateInterval && this.fastestStoppedUpdateInterval == radarTrackingOptions.fastestStoppedUpdateInterval && this.desiredMovingUpdateInterval == radarTrackingOptions.desiredMovingUpdateInterval && this.fastestMovingUpdateInterval == radarTrackingOptions.fastestMovingUpdateInterval && this.desiredSyncInterval == radarTrackingOptions.desiredSyncInterval && this.desiredAccuracy == radarTrackingOptions.desiredAccuracy && this.stopDuration == radarTrackingOptions.stopDuration && this.stopDistance == radarTrackingOptions.stopDistance && Intrinsics.areEqual(this.startTrackingAfter, radarTrackingOptions.startTrackingAfter) && Intrinsics.areEqual(this.stopTrackingAfter, radarTrackingOptions.stopTrackingAfter) && this.replay == radarTrackingOptions.replay && this.sync == radarTrackingOptions.sync && this.useStoppedGeofence == radarTrackingOptions.useStoppedGeofence && this.stoppedGeofenceRadius == radarTrackingOptions.stoppedGeofenceRadius && this.useMovingGeofence == radarTrackingOptions.useMovingGeofence && this.movingGeofenceRadius == radarTrackingOptions.movingGeofenceRadius && this.syncGeofences == radarTrackingOptions.syncGeofences && this.syncGeofencesLimit == radarTrackingOptions.syncGeofencesLimit && this.foregroundServiceEnabled == radarTrackingOptions.foregroundServiceEnabled && this.beacons == radarTrackingOptions.beacons && this.useMotion == radarTrackingOptions.useMotion && this.usePressure == radarTrackingOptions.usePressure;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.desiredStoppedUpdateInterval) * 31) + Integer.hashCode(this.fastestStoppedUpdateInterval)) * 31) + Integer.hashCode(this.desiredMovingUpdateInterval)) * 31) + Integer.hashCode(this.fastestMovingUpdateInterval)) * 31) + Integer.hashCode(this.desiredSyncInterval)) * 31) + this.desiredAccuracy.hashCode()) * 31) + Integer.hashCode(this.stopDuration)) * 31) + Integer.hashCode(this.stopDistance)) * 31;
        Date date = this.startTrackingAfter;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.stopTrackingAfter;
        return ((((((((((((((((((((((((hashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31) + this.replay.hashCode()) * 31) + this.sync.hashCode()) * 31) + Boolean.hashCode(this.useStoppedGeofence)) * 31) + Integer.hashCode(this.stoppedGeofenceRadius)) * 31) + Boolean.hashCode(this.useMovingGeofence)) * 31) + Integer.hashCode(this.movingGeofenceRadius)) * 31) + this.syncGeofences.hashCode()) * 31) + Integer.hashCode(this.syncGeofencesLimit)) * 31) + Boolean.hashCode(this.foregroundServiceEnabled)) * 31) + Boolean.hashCode(this.beacons)) * 31) + Boolean.hashCode(this.useMotion)) * 31) + Boolean.hashCode(this.usePressure);
    }

    public String toString() {
        return "RadarTrackingOptions(desiredStoppedUpdateInterval=" + this.desiredStoppedUpdateInterval + ", fastestStoppedUpdateInterval=" + this.fastestStoppedUpdateInterval + ", desiredMovingUpdateInterval=" + this.desiredMovingUpdateInterval + ", fastestMovingUpdateInterval=" + this.fastestMovingUpdateInterval + ", desiredSyncInterval=" + this.desiredSyncInterval + ", desiredAccuracy=" + this.desiredAccuracy + ", stopDuration=" + this.stopDuration + ", stopDistance=" + this.stopDistance + ", startTrackingAfter=" + this.startTrackingAfter + ", stopTrackingAfter=" + this.stopTrackingAfter + ", replay=" + this.replay + ", sync=" + this.sync + ", useStoppedGeofence=" + this.useStoppedGeofence + ", stoppedGeofenceRadius=" + this.stoppedGeofenceRadius + ", useMovingGeofence=" + this.useMovingGeofence + ", movingGeofenceRadius=" + this.movingGeofenceRadius + ", syncGeofences=" + this.syncGeofences + ", syncGeofencesLimit=" + this.syncGeofencesLimit + ", foregroundServiceEnabled=" + this.foregroundServiceEnabled + ", beacons=" + this.beacons + ", useMotion=" + this.useMotion + ", usePressure=" + this.usePressure + ')';
    }

    public RadarTrackingOptions(int i, int i2, int i3, int i4, int i5, RadarTrackingOptionsDesiredAccuracy desiredAccuracy, int i6, int i7, Date date, Date date2, RadarTrackingOptionsReplay replay, RadarTrackingOptionsSync sync, boolean z, int i8, boolean z2, int i9, RadarTrackingOptionsSyncGeofences syncGeofences, int i10, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(replay, "replay");
        Intrinsics.checkNotNullParameter(sync, "sync");
        Intrinsics.checkNotNullParameter(syncGeofences, "syncGeofences");
        this.desiredStoppedUpdateInterval = i;
        this.fastestStoppedUpdateInterval = i2;
        this.desiredMovingUpdateInterval = i3;
        this.fastestMovingUpdateInterval = i4;
        this.desiredSyncInterval = i5;
        this.desiredAccuracy = desiredAccuracy;
        this.stopDuration = i6;
        this.stopDistance = i7;
        this.startTrackingAfter = date;
        this.stopTrackingAfter = date2;
        this.replay = replay;
        this.sync = sync;
        this.useStoppedGeofence = z;
        this.stoppedGeofenceRadius = i8;
        this.useMovingGeofence = z2;
        this.movingGeofenceRadius = i9;
        this.syncGeofences = syncGeofences;
        this.syncGeofencesLimit = i10;
        this.foregroundServiceEnabled = z3;
        this.beacons = z4;
        this.useMotion = z5;
        this.usePressure = z6;
    }

    public final int getDesiredStoppedUpdateInterval() {
        return this.desiredStoppedUpdateInterval;
    }

    public final void setDesiredStoppedUpdateInterval(int i) {
        this.desiredStoppedUpdateInterval = i;
    }

    public final int getFastestStoppedUpdateInterval() {
        return this.fastestStoppedUpdateInterval;
    }

    public final void setFastestStoppedUpdateInterval(int i) {
        this.fastestStoppedUpdateInterval = i;
    }

    public final int getDesiredMovingUpdateInterval() {
        return this.desiredMovingUpdateInterval;
    }

    public final void setDesiredMovingUpdateInterval(int i) {
        this.desiredMovingUpdateInterval = i;
    }

    public final int getFastestMovingUpdateInterval() {
        return this.fastestMovingUpdateInterval;
    }

    public final void setFastestMovingUpdateInterval(int i) {
        this.fastestMovingUpdateInterval = i;
    }

    public final int getDesiredSyncInterval() {
        return this.desiredSyncInterval;
    }

    public final void setDesiredSyncInterval(int i) {
        this.desiredSyncInterval = i;
    }

    public final RadarTrackingOptionsDesiredAccuracy getDesiredAccuracy() {
        return this.desiredAccuracy;
    }

    public final void setDesiredAccuracy(RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy) {
        Intrinsics.checkNotNullParameter(radarTrackingOptionsDesiredAccuracy, "<set-?>");
        this.desiredAccuracy = radarTrackingOptionsDesiredAccuracy;
    }

    public final int getStopDuration() {
        return this.stopDuration;
    }

    public final void setStopDuration(int i) {
        this.stopDuration = i;
    }

    public final int getStopDistance() {
        return this.stopDistance;
    }

    public final void setStopDistance(int i) {
        this.stopDistance = i;
    }

    public final Date getStartTrackingAfter() {
        return this.startTrackingAfter;
    }

    public final void setStartTrackingAfter(Date date) {
        this.startTrackingAfter = date;
    }

    public final Date getStopTrackingAfter() {
        return this.stopTrackingAfter;
    }

    public final void setStopTrackingAfter(Date date) {
        this.stopTrackingAfter = date;
    }

    public final RadarTrackingOptionsReplay getReplay() {
        return this.replay;
    }

    public final void setReplay(RadarTrackingOptionsReplay radarTrackingOptionsReplay) {
        Intrinsics.checkNotNullParameter(radarTrackingOptionsReplay, "<set-?>");
        this.replay = radarTrackingOptionsReplay;
    }

    public final RadarTrackingOptionsSync getSync() {
        return this.sync;
    }

    public final void setSync(RadarTrackingOptionsSync radarTrackingOptionsSync) {
        Intrinsics.checkNotNullParameter(radarTrackingOptionsSync, "<set-?>");
        this.sync = radarTrackingOptionsSync;
    }

    public final boolean getUseStoppedGeofence() {
        return this.useStoppedGeofence;
    }

    public final void setUseStoppedGeofence(boolean z) {
        this.useStoppedGeofence = z;
    }

    public final int getStoppedGeofenceRadius() {
        return this.stoppedGeofenceRadius;
    }

    public final void setStoppedGeofenceRadius(int i) {
        this.stoppedGeofenceRadius = i;
    }

    public final boolean getUseMovingGeofence() {
        return this.useMovingGeofence;
    }

    public final void setUseMovingGeofence(boolean z) {
        this.useMovingGeofence = z;
    }

    public final int getMovingGeofenceRadius() {
        return this.movingGeofenceRadius;
    }

    public final void setMovingGeofenceRadius(int i) {
        this.movingGeofenceRadius = i;
    }

    public final RadarTrackingOptionsSyncGeofences getSyncGeofences() {
        return this.syncGeofences;
    }

    public final void setSyncGeofences(RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences) {
        Intrinsics.checkNotNullParameter(radarTrackingOptionsSyncGeofences, "<set-?>");
        this.syncGeofences = radarTrackingOptionsSyncGeofences;
    }

    public final int getSyncGeofencesLimit() {
        return this.syncGeofencesLimit;
    }

    public final void setSyncGeofencesLimit(int i) {
        this.syncGeofencesLimit = i;
    }

    public final boolean getForegroundServiceEnabled() {
        return this.foregroundServiceEnabled;
    }

    public final void setForegroundServiceEnabled(boolean z) {
        this.foregroundServiceEnabled = z;
    }

    public final boolean getBeacons() {
        return this.beacons;
    }

    public final void setBeacons(boolean z) {
        this.beacons = z;
    }

    public final boolean getUseMotion() {
        return this.useMotion;
    }

    public final void setUseMotion(boolean z) {
        this.useMotion = z;
    }

    public final boolean getUsePressure() {
        return this.usePressure;
    }

    public final void setUsePressure(boolean z) {
        this.usePressure = z;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarTrackingOptions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "", RadarTrackingOptions.KEY_DESIRED_ACCURACY, "", "(Ljava/lang/String;II)V", "getDesiredAccuracy$sdk_release", "()I", "toRadarString", "", "HIGH", "MEDIUM", "LOW", "NONE", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarTrackingOptionsDesiredAccuracy {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarTrackingOptionsDesiredAccuracy[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final String HIGH_STR = "high";
        public static final String LOW_STR = "low";
        public static final String MEDIUM_STR = "medium";
        public static final String NONE_STR = "none";
        private final int desiredAccuracy;
        public static final RadarTrackingOptionsDesiredAccuracy HIGH = new RadarTrackingOptionsDesiredAccuracy("HIGH", 0, 3);
        public static final RadarTrackingOptionsDesiredAccuracy MEDIUM = new RadarTrackingOptionsDesiredAccuracy("MEDIUM", 1, 2);
        public static final RadarTrackingOptionsDesiredAccuracy LOW = new RadarTrackingOptionsDesiredAccuracy("LOW", 2, 1);
        public static final RadarTrackingOptionsDesiredAccuracy NONE = new RadarTrackingOptionsDesiredAccuracy("NONE", 3, 0);

        /* compiled from: RadarTrackingOptions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTrackingOptionsDesiredAccuracy.values().length];
                try {
                    iArr[RadarTrackingOptionsDesiredAccuracy.HIGH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTrackingOptionsDesiredAccuracy.MEDIUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTrackingOptionsDesiredAccuracy.LOW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RadarTrackingOptionsDesiredAccuracy.NONE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ RadarTrackingOptionsDesiredAccuracy[] $values() {
            return new RadarTrackingOptionsDesiredAccuracy[]{HIGH, MEDIUM, LOW, NONE};
        }

        public static EnumEntries<RadarTrackingOptionsDesiredAccuracy> getEntries() {
            return $ENTRIES;
        }

        public static RadarTrackingOptionsDesiredAccuracy valueOf(String str) {
            return (RadarTrackingOptionsDesiredAccuracy) Enum.valueOf(RadarTrackingOptionsDesiredAccuracy.class, str);
        }

        public static RadarTrackingOptionsDesiredAccuracy[] values() {
            return (RadarTrackingOptionsDesiredAccuracy[]) $VALUES.clone();
        }

        private RadarTrackingOptionsDesiredAccuracy(String str, int i, int i2) {
            this.desiredAccuracy = i2;
        }

        /* renamed from: getDesiredAccuracy$sdk_release, reason: from getter */
        public final int getDesiredAccuracy() {
            return this.desiredAccuracy;
        }

        static {
            RadarTrackingOptionsDesiredAccuracy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: RadarTrackingOptions.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy$Companion;", "", "()V", "HIGH_STR", "", "LOW_STR", "MEDIUM_STR", "NONE_STR", "fromInt", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", RadarTrackingOptions.KEY_DESIRED_ACCURACY, "", "(Ljava/lang/Integer;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "fromRadarString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final RadarTrackingOptionsDesiredAccuracy fromInt(Integer desiredAccuracy) {
                for (RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy : RadarTrackingOptionsDesiredAccuracy.values()) {
                    int desiredAccuracy2 = radarTrackingOptionsDesiredAccuracy.getDesiredAccuracy();
                    if (desiredAccuracy != null && desiredAccuracy.intValue() == desiredAccuracy2) {
                        return radarTrackingOptionsDesiredAccuracy;
                    }
                }
                return RadarTrackingOptionsDesiredAccuracy.MEDIUM;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final RadarTrackingOptionsDesiredAccuracy fromRadarString(String desiredAccuracy) {
                if (desiredAccuracy != null) {
                    switch (desiredAccuracy.hashCode()) {
                        case -1078030475:
                            if (desiredAccuracy.equals("medium")) {
                                return RadarTrackingOptionsDesiredAccuracy.MEDIUM;
                            }
                            break;
                        case 107348:
                            if (desiredAccuracy.equals(RadarTrackingOptionsDesiredAccuracy.LOW_STR)) {
                                return RadarTrackingOptionsDesiredAccuracy.LOW;
                            }
                            break;
                        case 3202466:
                            if (desiredAccuracy.equals(RadarTrackingOptionsDesiredAccuracy.HIGH_STR)) {
                                return RadarTrackingOptionsDesiredAccuracy.HIGH;
                            }
                            break;
                        case 3387192:
                            if (desiredAccuracy.equals("none")) {
                                return RadarTrackingOptionsDesiredAccuracy.NONE;
                            }
                            break;
                    }
                }
                return RadarTrackingOptionsDesiredAccuracy.MEDIUM;
            }
        }

        public final String toRadarString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return HIGH_STR;
            }
            if (i == 2) {
                return "medium";
            }
            if (i == 3) {
                return LOW_STR;
            }
            if (i == 4) {
                return "none";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarTrackingOptions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", "", RadarTrackingOptions.KEY_REPLAY, "", "(Ljava/lang/String;II)V", "getReplay$sdk_release", "()I", "toRadarString", "", Rule.ALL, "STOPS", "NONE", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarTrackingOptionsReplay {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarTrackingOptionsReplay[] $VALUES;
        public static final String ALL_STR = "all";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final String NONE_STR = "none";
        public static final String STOPS_STR = "stops";
        private final int replay;
        public static final RadarTrackingOptionsReplay ALL = new RadarTrackingOptionsReplay(Rule.ALL, 0, 2);
        public static final RadarTrackingOptionsReplay STOPS = new RadarTrackingOptionsReplay("STOPS", 1, 1);
        public static final RadarTrackingOptionsReplay NONE = new RadarTrackingOptionsReplay("NONE", 2, 0);

        /* compiled from: RadarTrackingOptions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTrackingOptionsReplay.values().length];
                try {
                    iArr[RadarTrackingOptionsReplay.STOPS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTrackingOptionsReplay.NONE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTrackingOptionsReplay.ALL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ RadarTrackingOptionsReplay[] $values() {
            return new RadarTrackingOptionsReplay[]{ALL, STOPS, NONE};
        }

        public static EnumEntries<RadarTrackingOptionsReplay> getEntries() {
            return $ENTRIES;
        }

        public static RadarTrackingOptionsReplay valueOf(String str) {
            return (RadarTrackingOptionsReplay) Enum.valueOf(RadarTrackingOptionsReplay.class, str);
        }

        public static RadarTrackingOptionsReplay[] values() {
            return (RadarTrackingOptionsReplay[]) $VALUES.clone();
        }

        private RadarTrackingOptionsReplay(String str, int i, int i2) {
            this.replay = i2;
        }

        /* renamed from: getReplay$sdk_release, reason: from getter */
        public final int getReplay() {
            return this.replay;
        }

        static {
            RadarTrackingOptionsReplay[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: RadarTrackingOptions.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay$Companion;", "", "()V", "ALL_STR", "", "NONE_STR", "STOPS_STR", "fromInt", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", RadarTrackingOptions.KEY_REPLAY, "", "(Ljava/lang/Integer;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsReplay;", "fromRadarString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final RadarTrackingOptionsReplay fromInt(Integer replay) {
                for (RadarTrackingOptionsReplay radarTrackingOptionsReplay : RadarTrackingOptionsReplay.values()) {
                    int replay2 = radarTrackingOptionsReplay.getReplay();
                    if (replay != null && replay.intValue() == replay2) {
                        return radarTrackingOptionsReplay;
                    }
                }
                return RadarTrackingOptionsReplay.NONE;
            }

            public final RadarTrackingOptionsReplay fromRadarString(String replay) {
                if (replay != null) {
                    int hashCode = replay.hashCode();
                    if (hashCode != 96673) {
                        if (hashCode != 3387192) {
                            if (hashCode == 109770929 && replay.equals(RadarTrackingOptionsReplay.STOPS_STR)) {
                                return RadarTrackingOptionsReplay.STOPS;
                            }
                        } else if (replay.equals("none")) {
                            return RadarTrackingOptionsReplay.NONE;
                        }
                    } else if (replay.equals("all")) {
                        return RadarTrackingOptionsReplay.ALL;
                    }
                }
                return RadarTrackingOptionsReplay.NONE;
            }
        }

        public final String toRadarString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return STOPS_STR;
            }
            if (i == 2) {
                return "none";
            }
            if (i == 3) {
                return "all";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarTrackingOptions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", "", "sync", "", "(Ljava/lang/String;II)V", "getSync$sdk_release", "()I", "toRadarString", "", "NONE", "STOPS_AND_EXITS", Rule.ALL, "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarTrackingOptionsSync {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarTrackingOptionsSync[] $VALUES;
        public static final String ALL_STR = "all";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final String NONE_STR = "none";
        public static final String STOPS_AND_EXITS_STR = "stopsAndExits";
        private final int sync;
        public static final RadarTrackingOptionsSync NONE = new RadarTrackingOptionsSync("NONE", 0, 0);
        public static final RadarTrackingOptionsSync STOPS_AND_EXITS = new RadarTrackingOptionsSync("STOPS_AND_EXITS", 1, 1);
        public static final RadarTrackingOptionsSync ALL = new RadarTrackingOptionsSync(Rule.ALL, 2, 2);

        /* compiled from: RadarTrackingOptions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTrackingOptionsSync.values().length];
                try {
                    iArr[RadarTrackingOptionsSync.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTrackingOptionsSync.STOPS_AND_EXITS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTrackingOptionsSync.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ RadarTrackingOptionsSync[] $values() {
            return new RadarTrackingOptionsSync[]{NONE, STOPS_AND_EXITS, ALL};
        }

        public static EnumEntries<RadarTrackingOptionsSync> getEntries() {
            return $ENTRIES;
        }

        public static RadarTrackingOptionsSync valueOf(String str) {
            return (RadarTrackingOptionsSync) Enum.valueOf(RadarTrackingOptionsSync.class, str);
        }

        public static RadarTrackingOptionsSync[] values() {
            return (RadarTrackingOptionsSync[]) $VALUES.clone();
        }

        private RadarTrackingOptionsSync(String str, int i, int i2) {
            this.sync = i2;
        }

        /* renamed from: getSync$sdk_release, reason: from getter */
        public final int getSync() {
            return this.sync;
        }

        static {
            RadarTrackingOptionsSync[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: RadarTrackingOptions.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync$Companion;", "", "()V", "ALL_STR", "", "NONE_STR", "STOPS_AND_EXITS_STR", "fromInt", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", "sync", "", "(Ljava/lang/Integer;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSync;", "fromRadarString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final RadarTrackingOptionsSync fromInt(Integer sync) {
                for (RadarTrackingOptionsSync radarTrackingOptionsSync : RadarTrackingOptionsSync.values()) {
                    int sync2 = radarTrackingOptionsSync.getSync();
                    if (sync != null && sync.intValue() == sync2) {
                        return radarTrackingOptionsSync;
                    }
                }
                return RadarTrackingOptionsSync.STOPS_AND_EXITS;
            }

            public final RadarTrackingOptionsSync fromRadarString(String sync) {
                if (sync != null) {
                    int hashCode = sync.hashCode();
                    if (hashCode != 96673) {
                        if (hashCode != 3387192) {
                            if (hashCode == 1965468495 && sync.equals(RadarTrackingOptionsSync.STOPS_AND_EXITS_STR)) {
                                return RadarTrackingOptionsSync.STOPS_AND_EXITS;
                            }
                        } else if (sync.equals("none")) {
                            return RadarTrackingOptionsSync.NONE;
                        }
                    } else if (sync.equals("all")) {
                        return RadarTrackingOptionsSync.ALL;
                    }
                }
                return RadarTrackingOptionsSync.STOPS_AND_EXITS;
            }
        }

        public final String toRadarString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "all";
            }
            if (i == 2) {
                return STOPS_AND_EXITS_STR;
            }
            if (i == 3) {
                return "none";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarTrackingOptions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", "", RadarTrackingOptions.KEY_SYNC_GEOFENCES, "", "(Ljava/lang/String;II)V", "getSyncGeofences$sdk_release", "()I", "toRadarString", "", "NONE", "NEAREST", "CAMPAIGN", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarTrackingOptionsSyncGeofences {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarTrackingOptionsSyncGeofences[] $VALUES;
        public static final String CAMPAIGN_STR = "campaign-only";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final String NEAREST_STR = "nearest";
        public static final String NONE_STR = "none";
        private final int syncGeofences;
        public static final RadarTrackingOptionsSyncGeofences NONE = new RadarTrackingOptionsSyncGeofences("NONE", 0, 0);
        public static final RadarTrackingOptionsSyncGeofences NEAREST = new RadarTrackingOptionsSyncGeofences("NEAREST", 1, 1);
        public static final RadarTrackingOptionsSyncGeofences CAMPAIGN = new RadarTrackingOptionsSyncGeofences("CAMPAIGN", 2, 2);

        /* compiled from: RadarTrackingOptions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTrackingOptionsSyncGeofences.values().length];
                try {
                    iArr[RadarTrackingOptionsSyncGeofences.NEAREST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTrackingOptionsSyncGeofences.CAMPAIGN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTrackingOptionsSyncGeofences.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ RadarTrackingOptionsSyncGeofences[] $values() {
            return new RadarTrackingOptionsSyncGeofences[]{NONE, NEAREST, CAMPAIGN};
        }

        public static EnumEntries<RadarTrackingOptionsSyncGeofences> getEntries() {
            return $ENTRIES;
        }

        public static RadarTrackingOptionsSyncGeofences valueOf(String str) {
            return (RadarTrackingOptionsSyncGeofences) Enum.valueOf(RadarTrackingOptionsSyncGeofences.class, str);
        }

        public static RadarTrackingOptionsSyncGeofences[] values() {
            return (RadarTrackingOptionsSyncGeofences[]) $VALUES.clone();
        }

        private RadarTrackingOptionsSyncGeofences(String str, int i, int i2) {
            this.syncGeofences = i2;
        }

        /* renamed from: getSyncGeofences$sdk_release, reason: from getter */
        public final int getSyncGeofences() {
            return this.syncGeofences;
        }

        static {
            RadarTrackingOptionsSyncGeofences[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: RadarTrackingOptions.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences$Companion;", "", "()V", "CAMPAIGN_STR", "", "NEAREST_STR", "NONE_STR", "fromInt", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", RadarTrackingOptions.KEY_SYNC_GEOFENCES, "", "(Ljava/lang/Integer;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsSyncGeofences;", "fromRadarString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final RadarTrackingOptionsSyncGeofences fromInt(Integer syncGeofences) {
                for (RadarTrackingOptionsSyncGeofences radarTrackingOptionsSyncGeofences : RadarTrackingOptionsSyncGeofences.values()) {
                    int syncGeofences2 = radarTrackingOptionsSyncGeofences.getSyncGeofences();
                    if (syncGeofences != null && syncGeofences.intValue() == syncGeofences2) {
                        return radarTrackingOptionsSyncGeofences;
                    }
                }
                return RadarTrackingOptionsSyncGeofences.NONE;
            }

            public final RadarTrackingOptionsSyncGeofences fromRadarString(String syncGeofences) {
                return Intrinsics.areEqual(syncGeofences, RadarTrackingOptionsSyncGeofences.NEAREST_STR) ? RadarTrackingOptionsSyncGeofences.NEAREST : Intrinsics.areEqual(syncGeofences, RadarTrackingOptionsSyncGeofences.CAMPAIGN_STR) ? RadarTrackingOptionsSyncGeofences.CAMPAIGN : RadarTrackingOptionsSyncGeofences.NONE;
            }
        }

        public final String toRadarString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return NEAREST_STR;
            }
            if (i == 2) {
                return CAMPAIGN_STR;
            }
            if (i == 3) {
                return "none";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: RadarTrackingOptions.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\u0006\u00103\u001a\u000204J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00067"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService;", "", "text", "", "title", "icon", "", RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_UPDATES_ONLY, "", RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "importance", "id", RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_CHANNEL_NAME, "iconString", "iconColor", "deepLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivity", "()Ljava/lang/String;", "getChannelName", "getDeepLink", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconColor", "setIconColor", "(Ljava/lang/String;)V", "getIconString", "setIconString", "getId", "getImportance", "getText", "getTitle", "getUpdatesOnly", "()Z", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService;", "equals", "other", "hashCode", "toJson", "Lorg/json/JSONObject;", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RadarTrackingOptionsForegroundService {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final String KEY_FOREGROUND_SERVICE_ACTIVITY = "activity";
        public static final String KEY_FOREGROUND_SERVICE_CHANNEL_NAME = "channelName";
        public static final String KEY_FOREGROUND_SERVICE_DEEP_LINK = "deepLink";
        public static final String KEY_FOREGROUND_SERVICE_ICON = "icon";
        public static final String KEY_FOREGROUND_SERVICE_ICON_COLOR = "iconColor";
        public static final String KEY_FOREGROUND_SERVICE_ICON_STRING = "iconString";
        public static final String KEY_FOREGROUND_SERVICE_ID = "id";
        public static final String KEY_FOREGROUND_SERVICE_IMPORTANCE = "importance";
        public static final String KEY_FOREGROUND_SERVICE_TEXT = "text";
        public static final String KEY_FOREGROUND_SERVICE_TITLE = "title";
        public static final String KEY_FOREGROUND_SERVICE_UPDATES_ONLY = "updatesOnly";
        private final String activity;
        private final String channelName;
        private final String deepLink;
        private final Integer icon;
        private String iconColor;
        private String iconString;
        private final Integer id;
        private final Integer importance;
        private final String text;
        private final String title;
        private final boolean updatesOnly;

        public RadarTrackingOptionsForegroundService() {
            this(null, null, null, false, null, null, null, null, null, null, null, 2047, null);
        }

        public static /* synthetic */ RadarTrackingOptionsForegroundService copy$default(RadarTrackingOptionsForegroundService radarTrackingOptionsForegroundService, String str, String str2, Integer num, boolean z, String str3, Integer num2, Integer num3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = radarTrackingOptionsForegroundService.text;
            }
            if ((i & 2) != 0) {
                str2 = radarTrackingOptionsForegroundService.title;
            }
            if ((i & 4) != 0) {
                num = radarTrackingOptionsForegroundService.icon;
            }
            if ((i & 8) != 0) {
                z = radarTrackingOptionsForegroundService.updatesOnly;
            }
            if ((i & 16) != 0) {
                str3 = radarTrackingOptionsForegroundService.activity;
            }
            if ((i & 32) != 0) {
                num2 = radarTrackingOptionsForegroundService.importance;
            }
            if ((i & 64) != 0) {
                num3 = radarTrackingOptionsForegroundService.id;
            }
            if ((i & 128) != 0) {
                str4 = radarTrackingOptionsForegroundService.channelName;
            }
            if ((i & 256) != 0) {
                str5 = radarTrackingOptionsForegroundService.iconString;
            }
            if ((i & 512) != 0) {
                str6 = radarTrackingOptionsForegroundService.iconColor;
            }
            if ((i & 1024) != 0) {
                str7 = radarTrackingOptionsForegroundService.deepLink;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str4;
            String str11 = str5;
            Integer num4 = num2;
            Integer num5 = num3;
            String str12 = str3;
            Integer num6 = num;
            return radarTrackingOptionsForegroundService.copy(str, str2, num6, z, str12, num4, num5, str10, str11, str8, str9);
        }

        @JvmStatic
        public static final RadarTrackingOptionsForegroundService fromJson(JSONObject jSONObject) {
            return INSTANCE.fromJson(jSONObject);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component10, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component11, reason: from getter */
        public final String getDeepLink() {
            return this.deepLink;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUpdatesOnly() {
            return this.updatesOnly;
        }

        /* renamed from: component5, reason: from getter */
        public final String getActivity() {
            return this.activity;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getImportance() {
            return this.importance;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        /* renamed from: component8, reason: from getter */
        public final String getChannelName() {
            return this.channelName;
        }

        /* renamed from: component9, reason: from getter */
        public final String getIconString() {
            return this.iconString;
        }

        public final RadarTrackingOptionsForegroundService copy(String text, String title, Integer icon, boolean updatesOnly, String activity, Integer importance, Integer id, String channelName, String iconString, String iconColor, String deepLink) {
            return new RadarTrackingOptionsForegroundService(text, title, icon, updatesOnly, activity, importance, id, channelName, iconString, iconColor, deepLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadarTrackingOptionsForegroundService)) {
                return false;
            }
            RadarTrackingOptionsForegroundService radarTrackingOptionsForegroundService = (RadarTrackingOptionsForegroundService) other;
            return Intrinsics.areEqual(this.text, radarTrackingOptionsForegroundService.text) && Intrinsics.areEqual(this.title, radarTrackingOptionsForegroundService.title) && Intrinsics.areEqual(this.icon, radarTrackingOptionsForegroundService.icon) && this.updatesOnly == radarTrackingOptionsForegroundService.updatesOnly && Intrinsics.areEqual(this.activity, radarTrackingOptionsForegroundService.activity) && Intrinsics.areEqual(this.importance, radarTrackingOptionsForegroundService.importance) && Intrinsics.areEqual(this.id, radarTrackingOptionsForegroundService.id) && Intrinsics.areEqual(this.channelName, radarTrackingOptionsForegroundService.channelName) && Intrinsics.areEqual(this.iconString, radarTrackingOptionsForegroundService.iconString) && Intrinsics.areEqual(this.iconColor, radarTrackingOptionsForegroundService.iconColor) && Intrinsics.areEqual(this.deepLink, radarTrackingOptionsForegroundService.deepLink);
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.icon;
            int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.updatesOnly)) * 31;
            String str3 = this.activity;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.importance;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.id;
            int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str4 = this.channelName;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.iconString;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.iconColor;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.deepLink;
            return hashCode9 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "RadarTrackingOptionsForegroundService(text=" + this.text + ", title=" + this.title + ", icon=" + this.icon + ", updatesOnly=" + this.updatesOnly + ", activity=" + this.activity + ", importance=" + this.importance + ", id=" + this.id + ", channelName=" + this.channelName + ", iconString=" + this.iconString + ", iconColor=" + this.iconColor + ", deepLink=" + this.deepLink + ')';
        }

        public RadarTrackingOptionsForegroundService(String str, String str2, Integer num, boolean z, String str3, Integer num2, Integer num3, String str4, String str5, String str6, String str7) {
            this.text = str;
            this.title = str2;
            this.icon = num;
            this.updatesOnly = z;
            this.activity = str3;
            this.importance = num2;
            this.id = num3;
            this.channelName = str4;
            this.iconString = str5;
            this.iconColor = str6;
            this.deepLink = str7;
        }

        public /* synthetic */ RadarTrackingOptionsForegroundService(String str, String str2, Integer num, boolean z, String str3, Integer num2, Integer num3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7);
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final boolean getUpdatesOnly() {
            return this.updatesOnly;
        }

        public final String getActivity() {
            return this.activity;
        }

        public final Integer getImportance() {
            return this.importance;
        }

        public final Integer getId() {
            return this.id;
        }

        public final String getChannelName() {
            return this.channelName;
        }

        public final String getIconString() {
            return this.iconString;
        }

        public final void setIconString(String str) {
            this.iconString = str;
        }

        public final String getIconColor() {
            return this.iconColor;
        }

        public final void setIconColor(String str) {
            this.iconColor = str;
        }

        public final String getDeepLink() {
            return this.deepLink;
        }

        /* compiled from: RadarTrackingOptions.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService$Companion;", "", "()V", "KEY_FOREGROUND_SERVICE_ACTIVITY", "", "KEY_FOREGROUND_SERVICE_CHANNEL_NAME", "KEY_FOREGROUND_SERVICE_DEEP_LINK", "KEY_FOREGROUND_SERVICE_ICON", "KEY_FOREGROUND_SERVICE_ICON_COLOR", "KEY_FOREGROUND_SERVICE_ICON_STRING", "KEY_FOREGROUND_SERVICE_ID", "KEY_FOREGROUND_SERVICE_IMPORTANCE", "KEY_FOREGROUND_SERVICE_TEXT", "KEY_FOREGROUND_SERVICE_TITLE", "KEY_FOREGROUND_SERVICE_UPDATES_ONLY", "fromJson", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final RadarTrackingOptionsForegroundService fromJson(JSONObject obj) {
                if (obj == null) {
                    return null;
                }
                return new RadarTrackingOptionsForegroundService(obj.isNull("text") ? null : obj.optString("text"), obj.isNull("title") ? null : obj.optString("title"), obj.isNull("icon") ? null : Integer.valueOf(obj.optInt("icon")), obj.optBoolean(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_UPDATES_ONLY), obj.isNull(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY) ? null : obj.optString(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY), obj.isNull("importance") ? null : Integer.valueOf(obj.optInt("importance")), obj.isNull("id") ? null : Integer.valueOf(obj.optInt("id")), obj.isNull(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_CHANNEL_NAME) ? null : obj.optString(RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_CHANNEL_NAME), obj.isNull("iconString") ? null : obj.optString("iconString"), obj.isNull("iconColor") ? null : obj.optString("iconColor"), obj.isNull("deepLink") ? null : obj.optString("deepLink"));
            }
        }

        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", this.text);
            jSONObject.put("title", this.title);
            jSONObject.put("icon", this.icon);
            jSONObject.put("iconString", this.iconString);
            jSONObject.put("iconColor", this.iconColor);
            jSONObject.put(KEY_FOREGROUND_SERVICE_ACTIVITY, this.activity);
            jSONObject.put(KEY_FOREGROUND_SERVICE_UPDATES_ONLY, this.updatesOnly);
            jSONObject.put("importance", this.importance);
            jSONObject.put("id", this.id);
            jSONObject.put(KEY_FOREGROUND_SERVICE_CHANNEL_NAME, this.channelName);
            jSONObject.put("deepLink", this.deepLink);
            return jSONObject;
        }
    }

    /* compiled from: RadarTrackingOptions.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lio/radar/sdk/RadarTrackingOptions$Companion;", "", "()V", "CONTINUOUS", "Lio/radar/sdk/RadarTrackingOptions;", "EFFICIENT", "KEY_BEACONS", "", "KEY_DESIRED_ACCURACY", "KEY_DESIRED_MOVING_UPDATE_INTERVAL", "KEY_DESIRED_STOPPED_UPDATE_INTERVAL", "KEY_DESIRED_SYNC_INTERVAL", "KEY_FASTEST_MOVING_UPDATE_INTERVAL", "KEY_FASTEST_STOPPED_UPDATE_INTERVAL", "KEY_FOREGROUND_SERVICE_ENABLED", "KEY_MOVING_GEOFENCE_RADIUS", "KEY_REPLAY", "KEY_START_TRACKING_AFTER", "KEY_STOPPED_GEOFENCE_RADIUS", "KEY_STOP_DISTANCE", "KEY_STOP_DURATION", "KEY_STOP_TRACKING_AFTER", "KEY_SYNC", "KEY_SYNC_GEOFENCES", "KEY_SYNC_GEOFENCES_LIMIT", "KEY_USE_MOTION", "KEY_USE_MOVING_GEOFENCE", "KEY_USE_PRESSURE", "KEY_USE_STOPPED_GEOFENCE", "RESPONSIVE", "fromJson", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 io.radar.sdk.RadarTrackingOptions, still in use, count: 2, list:
              (r2v6 io.radar.sdk.RadarTrackingOptions) from 0x0102: MOVE (r13v2 io.radar.sdk.RadarTrackingOptions) = (r2v6 io.radar.sdk.RadarTrackingOptions)
              (r2v6 io.radar.sdk.RadarTrackingOptions) from 0x00e6: MOVE (r13v5 io.radar.sdk.RadarTrackingOptions) = (r2v6 io.radar.sdk.RadarTrackingOptions)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @kotlin.jvm.JvmStatic
        public final io.radar.sdk.RadarTrackingOptions fromJson(org.json.JSONObject r26) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.radar.sdk.RadarTrackingOptions.Companion.fromJson(org.json.JSONObject):io.radar.sdk.RadarTrackingOptions");
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_DESIRED_STOPPED_UPDATE_INTERVAL, this.desiredStoppedUpdateInterval);
        jSONObject.put(KEY_FASTEST_STOPPED_UPDATE_INTERVAL, this.fastestStoppedUpdateInterval);
        jSONObject.put(KEY_DESIRED_MOVING_UPDATE_INTERVAL, this.desiredMovingUpdateInterval);
        jSONObject.put(KEY_FASTEST_MOVING_UPDATE_INTERVAL, this.fastestMovingUpdateInterval);
        jSONObject.put(KEY_DESIRED_SYNC_INTERVAL, this.desiredSyncInterval);
        jSONObject.put(KEY_DESIRED_ACCURACY, this.desiredAccuracy.toRadarString());
        jSONObject.put(KEY_STOP_DURATION, this.stopDuration);
        jSONObject.put(KEY_STOP_DISTANCE, this.stopDistance);
        Date date = this.startTrackingAfter;
        jSONObject.put(KEY_START_TRACKING_AFTER, date != null ? Long.valueOf(date.getTime()) : null);
        Date date2 = this.stopTrackingAfter;
        jSONObject.put(KEY_STOP_TRACKING_AFTER, date2 != null ? Long.valueOf(date2.getTime()) : null);
        jSONObject.put(KEY_REPLAY, this.replay.toRadarString());
        jSONObject.put("sync", this.sync.toRadarString());
        jSONObject.put(KEY_USE_STOPPED_GEOFENCE, this.useStoppedGeofence);
        jSONObject.put(KEY_STOPPED_GEOFENCE_RADIUS, this.stoppedGeofenceRadius);
        jSONObject.put(KEY_USE_MOVING_GEOFENCE, this.useMovingGeofence);
        jSONObject.put(KEY_MOVING_GEOFENCE_RADIUS, this.movingGeofenceRadius);
        jSONObject.put(KEY_SYNC_GEOFENCES, this.syncGeofences.toRadarString());
        jSONObject.put(KEY_SYNC_GEOFENCES_LIMIT, this.syncGeofencesLimit);
        jSONObject.put(KEY_FOREGROUND_SERVICE_ENABLED, this.foregroundServiceEnabled);
        jSONObject.put(KEY_BEACONS, this.beacons);
        jSONObject.put(KEY_USE_MOTION, this.useMotion);
        jSONObject.put(KEY_USE_PRESSURE, this.usePressure);
        return jSONObject;
    }
}

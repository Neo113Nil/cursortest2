package io.radar.sdk;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imageutils.JfifUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarAbstractLocationClient;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.model.RadarBeacon;
import io.radar.sdk.model.RadarCircleGeometry;
import io.radar.sdk.model.RadarConfig;
import io.radar.sdk.model.RadarCoordinate;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarGeofence;
import io.radar.sdk.model.RadarMeta;
import io.radar.sdk.model.RadarPolygonGeometry;
import io.radar.sdk.model.RadarUser;
import io.radar.sdk.model.RadarVerifiedLocationToken;
import io.radar.sdk.util.BatteryState;
import io.sentry.SentryEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarLocationManager.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 j2\u00020\u0001:\u0001jB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!H\u0002J\u0012\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010\u0013H\u0002J\u001d\u0010.\u001a\u00020(2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100H\u0002¢\u0006\u0002\u00102J\u001c\u00103\u001a\u00020(2\u0006\u00104\u001a\u0002052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0012\u00106\u001a\u00020(2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0013J\"\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u0002092\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0013J\u0017\u0010:\u001a\u0004\u0018\u00010*2\u0006\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b=J\u0017\u0010>\u001a\u0004\u0018\u00010*2\u0006\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b?J\u0017\u0010@\u001a\u0004\u0018\u0001092\u0006\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\bAJ'\u0010B\u001a\u00020(2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u0001002\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020(H\u0000¢\u0006\u0002\bHJ\u0018\u0010I\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u00108\u001a\u000209J\b\u0010J\u001a\u00020(H\u0002J/\u0010K\u001a\u00020(2%\b\u0002\u0010L\u001a\u001f\u0012\u0013\u0012\u00110!¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020(\u0018\u00010MH\u0002J/\u0010Q\u001a\u00020(2%\b\u0002\u0010L\u001a\u001f\u0012\u0013\u0012\u00110!¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020(\u0018\u00010MH\u0002J\u0018\u0010R\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!H\u0002J\u001d\u0010S\u001a\u00020(2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100H\u0002¢\u0006\u0002\u00102J\r\u0010T\u001a\u00020(H\u0000¢\u0006\u0002\bUJ(\u0010V\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!2\u0006\u00108\u001a\u0002092\u0006\u0010W\u001a\u00020!H\u0002J\u0010\u0010X\u001a\u00020(2\u0006\u0010Y\u001a\u00020ZH\u0002J \u0010[\u001a\u00020(2\u0006\u00107\u001a\u00020#2\u0006\u0010\\\u001a\u00020%2\u0006\u0010]\u001a\u00020%H\u0002J\u0010\u0010^\u001a\u00020(2\b\b\u0002\u0010_\u001a\u00020`J\b\u0010a\u001a\u00020(H\u0002J\b\u0010b\u001a\u00020(H\u0002J\u0006\u0010c\u001a\u00020(J\u0019\u0010d\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0002\beJ\u0017\u0010f\u001a\u00020(2\b\u0010g\u001a\u0004\u0018\u00010hH\u0000¢\u0006\u0002\biR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Lio/radar/sdk/RadarLocationManager;", "", "context", "Landroid/content/Context;", "apiClient", "Lio/radar/sdk/RadarApiClient;", SentryEvent.JsonKeys.LOGGER, "Lio/radar/sdk/RadarLogger;", "batteryManager", "Lio/radar/sdk/RadarBatteryManager;", "provider", "Lio/radar/sdk/Radar$RadarLocationServicesProvider;", "permissionsHelper", "Lio/radar/sdk/RadarPermissionsHelper;", "(Landroid/content/Context;Lio/radar/sdk/RadarApiClient;Lio/radar/sdk/RadarLogger;Lio/radar/sdk/RadarBatteryManager;Lio/radar/sdk/Radar$RadarLocationServicesProvider;Lio/radar/sdk/RadarPermissionsHelper;)V", "activityManager", "Lio/radar/sdk/RadarActivityManager;", "callbacks", "Ljava/util/ArrayList;", "Lio/radar/sdk/Radar$RadarLocationCallback;", "locationClient", "Lio/radar/sdk/RadarAbstractLocationClient;", "getLocationClient$sdk_release", "()Lio/radar/sdk/RadarAbstractLocationClient;", "setLocationClient$sdk_release", "(Lio/radar/sdk/RadarAbstractLocationClient;)V", "getPermissionsHelper$sdk_release", "()Lio/radar/sdk/RadarPermissionsHelper;", "setPermissionsHelper$sdk_release", "(Lio/radar/sdk/RadarPermissionsHelper;)V", "sensorsManager", "Lio/radar/sdk/RadarSensorsManager;", "started", "", "startedDesiredAccuracy", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "startedFastestInterval", "", "startedInterval", "addBubbleGeofence", "", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "stopped", "addCallback", "callback", "addSyncedGeofences", "radarGeofences", "", "Lio/radar/sdk/model/RadarGeofence;", "([Lio/radar/sdk/model/RadarGeofence;)V", "callCallbacks", "status", "Lio/radar/sdk/Radar$RadarStatus;", "getLocation", RadarTrackingOptions.KEY_DESIRED_ACCURACY, "source", "Lio/radar/sdk/Radar$RadarLocationSource;", "getLocationFromGeofenceIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "getLocationFromGeofenceIntent$sdk_release", "getLocationFromLocationIntent", "getLocationFromLocationIntent$sdk_release", "getSourceFromGeofenceIntent", "getSourceFromGeofenceIntent$sdk_release", "handleBeacons", RadarTrackingOptions.KEY_BEACONS, "Lio/radar/sdk/model/RadarBeacon;", "handleBeacons$sdk_release", "([Lio/radar/sdk/model/RadarBeacon;Lio/radar/sdk/Radar$RadarLocationSource;)V", "handleBootCompleted", "handleBootCompleted$sdk_release", "handleLocation", "removeAllGeofences", "removeBubbleGeofences", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "removeSyncedGeofences", "replaceBubbleGeofence", "replaceSyncedGeofences", "restartPreviousTrackingOptions", "restartPreviousTrackingOptions$sdk_release", "sendLocation", "replayed", "startForegroundService", "foregroundService", "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsForegroundService;", "startLocationUpdates", "interval", "fastestInterval", RadarTripOptions.KEY_START_TRACKING, "options", "Lio/radar/sdk/RadarTrackingOptions;", "stopForegroundService", "stopLocationUpdates", "stopTracking", "updateTracking", "updateTracking$sdk_release", "updateTrackingFromMeta", "meta", "Lio/radar/sdk/model/RadarMeta;", "updateTrackingFromMeta$sdk_release", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarLocationManager {
    private static final String BUBBLE_MOVING_GEOFENCE_REQUEST_ID = "radar_moving";
    private static final String BUBBLE_STOPPED_GEOFENCE_REQUEST_ID = "radar_stopped";
    private static final String SYNCED_GEOFENCES_REQUEST_ID_PREFIX = "radar_sync";
    private final RadarActivityManager activityManager;
    private final RadarApiClient apiClient;
    private final RadarBatteryManager batteryManager;
    private final ArrayList<Radar.RadarLocationCallback> callbacks;
    private final Context context;
    private RadarAbstractLocationClient locationClient;
    private final RadarLogger logger;
    private RadarPermissionsHelper permissionsHelper;
    private final RadarSensorsManager sensorsManager;
    private boolean started;
    private RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy startedDesiredAccuracy;
    private int startedFastestInterval;
    private int startedInterval;

    public RadarLocationManager(Context context, RadarApiClient apiClient, RadarLogger logger, RadarBatteryManager batteryManager, Radar.RadarLocationServicesProvider provider, RadarPermissionsHelper permissionsHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(batteryManager, "batteryManager");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(permissionsHelper, "permissionsHelper");
        this.context = context;
        this.apiClient = apiClient;
        this.logger = logger;
        this.batteryManager = batteryManager;
        this.permissionsHelper = permissionsHelper;
        this.locationClient = provider == Radar.RadarLocationServicesProvider.HUAWEI ? new RadarHuaweiLocationClient(context, logger) : new RadarGoogleLocationClient(context, logger);
        this.startedDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.NONE;
        this.callbacks = new ArrayList<>();
        this.activityManager = new RadarActivityManager(context);
        this.sensorsManager = new RadarSensorsManager(context);
    }

    public /* synthetic */ RadarLocationManager(Context context, RadarApiClient radarApiClient, RadarLogger radarLogger, RadarBatteryManager radarBatteryManager, Radar.RadarLocationServicesProvider radarLocationServicesProvider, RadarPermissionsHelper radarPermissionsHelper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, radarApiClient, radarLogger, radarBatteryManager, radarLocationServicesProvider, (i & 32) != 0 ? new RadarPermissionsHelper() : radarPermissionsHelper);
    }

    /* renamed from: getPermissionsHelper$sdk_release, reason: from getter */
    public final RadarPermissionsHelper getPermissionsHelper() {
        return this.permissionsHelper;
    }

    public final void setPermissionsHelper$sdk_release(RadarPermissionsHelper radarPermissionsHelper) {
        Intrinsics.checkNotNullParameter(radarPermissionsHelper, "<set-?>");
        this.permissionsHelper = radarPermissionsHelper;
    }

    /* renamed from: getLocationClient$sdk_release, reason: from getter */
    public final RadarAbstractLocationClient getLocationClient() {
        return this.locationClient;
    }

    public final void setLocationClient$sdk_release(RadarAbstractLocationClient radarAbstractLocationClient) {
        Intrinsics.checkNotNullParameter(radarAbstractLocationClient, "<set-?>");
        this.locationClient = radarAbstractLocationClient;
    }

    private final void addCallback(Radar.RadarLocationCallback callback) {
        if (callback == null) {
            return;
        }
        synchronized (this.callbacks) {
            this.callbacks.add(callback);
        }
    }

    static /* synthetic */ void callCallbacks$default(RadarLocationManager radarLocationManager, Radar.RadarStatus radarStatus, Location location, int i, Object obj) {
        if ((i & 2) != 0) {
            location = null;
        }
        radarLocationManager.callCallbacks(radarStatus, location);
    }

    private final void callCallbacks(Radar.RadarStatus status, Location location) {
        synchronized (this.callbacks) {
            if (this.callbacks.isEmpty()) {
                return;
            }
            RadarLogger.d$default(this.logger, "Calling callbacks | callbacks.size = " + this.callbacks.size(), null, null, 6, null);
            Iterator<Radar.RadarLocationCallback> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onComplete(status, location, RadarState.INSTANCE.getStopped$sdk_release(this.context));
            }
            this.callbacks.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void getLocation$default(RadarLocationManager radarLocationManager, Radar.RadarLocationCallback radarLocationCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            radarLocationCallback = null;
        }
        radarLocationManager.getLocation(radarLocationCallback);
    }

    public final void getLocation(Radar.RadarLocationCallback callback) {
        getLocation(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM, Radar.RadarLocationSource.FOREGROUND_LOCATION, callback);
    }

    public static /* synthetic */ void getLocation$default(RadarLocationManager radarLocationManager, RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy, Radar.RadarLocationSource radarLocationSource, Radar.RadarLocationCallback radarLocationCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            radarLocationCallback = null;
        }
        radarLocationManager.getLocation(radarTrackingOptionsDesiredAccuracy, radarLocationSource, radarLocationCallback);
    }

    public final void getLocation(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, final Radar.RadarLocationSource source, Radar.RadarLocationCallback callback) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.permissionsHelper.locationServicesEnabled$sdk_release(this.context)) {
            RadarLogger.d$default(this.logger, "Location services are not enabled", null, null, 6, null);
            Radar.INSTANCE.sendError$sdk_release(Radar.RadarStatus.ERROR_PERMISSIONS, "Location services are not enabled");
            if (callback != null) {
                Radar.RadarLocationCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PERMISSIONS, null, false, 6, null);
                return;
            }
            return;
        }
        if (!this.permissionsHelper.fineLocationPermissionGranted$sdk_release(this.context) && !this.permissionsHelper.coarseLocationPermissionGranted$sdk_release(this.context)) {
            Radar.sendError$sdk_release$default(Radar.INSTANCE, Radar.RadarStatus.ERROR_PERMISSIONS, null, 2, null);
            if (callback != null) {
                Radar.RadarLocationCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PERMISSIONS, null, false, 6, null);
                return;
            }
            return;
        }
        addCallback(callback);
        RadarLogger.d$default(this.logger, "Requesting location", null, null, 6, null);
        this.locationClient.getCurrentLocation(desiredAccuracy, new Function1<Location, Unit>() { // from class: io.radar.sdk.RadarLocationManager$getLocation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                invoke2(location);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Location location) {
                RadarLogger radarLogger;
                RadarLogger radarLogger2;
                if (location == null) {
                    radarLogger2 = RadarLocationManager.this.logger;
                    RadarLogger.d$default(radarLogger2, "Location timeout", null, null, 6, null);
                    Radar.INSTANCE.sendError$sdk_release(Radar.RadarStatus.ERROR_LOCATION, "Location timeout");
                    RadarLocationManager.callCallbacks$default(RadarLocationManager.this, Radar.RadarStatus.ERROR_LOCATION, null, 2, null);
                    return;
                }
                radarLogger = RadarLocationManager.this.logger;
                RadarLogger.d$default(radarLogger, "Successfully requested location", null, null, 6, null);
                this.handleLocation(location, source);
            }
        });
    }

    public static /* synthetic */ void startTracking$default(RadarLocationManager radarLocationManager, RadarTrackingOptions radarTrackingOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            radarTrackingOptions = RadarTrackingOptions.EFFICIENT;
        }
        radarLocationManager.startTracking(radarTrackingOptions);
    }

    public final void startTracking(RadarTrackingOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        stopLocationUpdates();
        if (!this.permissionsHelper.fineLocationPermissionGranted$sdk_release(this.context) && !this.permissionsHelper.coarseLocationPermissionGranted$sdk_release(this.context)) {
            Radar.sendError$sdk_release$default(Radar.INSTANCE, Radar.RadarStatus.ERROR_PERMISSIONS, null, 2, null);
            return;
        }
        RadarSettings.INSTANCE.setTracking$sdk_release(this.context, true);
        RadarSettings.INSTANCE.setTrackingOptions$sdk_release(this.context, options);
        updateTracking$sdk_release$default(this, null, 1, null);
    }

    public final void stopTracking() {
        this.started = false;
        RadarSettings.INSTANCE.setTracking$sdk_release(this.context, false);
        RadarTrackingOptions trackingOptions$sdk_release = RadarSettings.INSTANCE.getTrackingOptions$sdk_release(this.context);
        trackingOptions$sdk_release.setStartTrackingAfter(null);
        trackingOptions$sdk_release.setStopTrackingAfter(null);
        RadarSettings.INSTANCE.setTrackingOptions$sdk_release(this.context, trackingOptions$sdk_release);
        updateTracking$sdk_release$default(this, null, 1, null);
        if (RadarSettings.INSTANCE.getSdkConfiguration(this.context).getExtendFlushReplays()) {
            Radar.flushReplays$sdk_release$default(null, null, 3, null);
        }
        if (Radar.getTrackingOptions().getUseMotion()) {
            this.activityManager.stopActivityUpdates$sdk_release();
        }
        if (Radar.getTrackingOptions().getUsePressure()) {
            this.sensorsManager.onPause();
        }
    }

    private final void startLocationUpdates(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, int interval, int fastestInterval) {
        if (this.started && desiredAccuracy == this.startedDesiredAccuracy && interval == this.startedInterval && fastestInterval == this.startedFastestInterval) {
            return;
        }
        this.locationClient.requestLocationUpdates(desiredAccuracy, interval, fastestInterval, RadarLocationReceiver.INSTANCE.getLocationPendingIntent$sdk_release(this.context));
        this.started = true;
        this.startedDesiredAccuracy = desiredAccuracy;
        this.startedInterval = interval;
        this.startedFastestInterval = fastestInterval;
    }

    private final void stopLocationUpdates() {
        this.locationClient.removeLocationUpdates(RadarLocationReceiver.INSTANCE.getLocationPendingIntent$sdk_release(this.context));
        this.started = false;
    }

    public final void handleBeacons$sdk_release(RadarBeacon[] beacons, Radar.RadarLocationSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (Build.VERSION.SDK_INT >= 26) {
            RadarLogger.d$default(this.logger, "Handling beacons", null, null, 6, null);
            Radar.INSTANCE.getBeaconManager$sdk_release().handleBeacons$sdk_release(beacons, source);
            Location lastLocation$sdk_release = RadarState.INSTANCE.getLastLocation$sdk_release(this.context);
            if (lastLocation$sdk_release == null) {
                RadarLogger.d$default(this.logger, "Not handling beacons, no last location", null, null, 6, null);
            }
            handleLocation(lastLocation$sdk_release, source);
        }
    }

    public final void handleBootCompleted$sdk_release() {
        RadarLogger.d$default(this.logger, "Handling boot completed", null, null, 6, null);
        this.started = false;
        RadarState.INSTANCE.setStopped$sdk_release(this.context, false);
        this.locationClient.getLastLocation(new Function1<Location, Unit>() { // from class: io.radar.sdk.RadarLocationManager$handleBootCompleted$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                invoke2(location);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Location location) {
                RadarLocationManager.this.updateTracking$sdk_release(location);
            }
        });
    }

    public static /* synthetic */ void updateTracking$sdk_release$default(RadarLocationManager radarLocationManager, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            location = null;
        }
        radarLocationManager.updateTracking$sdk_release(location);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateTracking$sdk_release(Location location) {
        boolean tracking$sdk_release = RadarSettings.INSTANCE.getTracking$sdk_release(this.context);
        RadarTrackingOptions trackingOptions = Radar.getTrackingOptions();
        RadarTrackingOptions trackingOptions$sdk_release = RadarSettings.INSTANCE.getTrackingOptions$sdk_release(this.context);
        RadarLogger.d$default(this.logger, "Updating tracking | options = " + trackingOptions + "; location = " + location, null, null, 6, null);
        Date date = new Date();
        if (!tracking$sdk_release && trackingOptions$sdk_release.getStartTrackingAfter() != null) {
            Date startTrackingAfter = trackingOptions$sdk_release.getStartTrackingAfter();
            Intrinsics.checkNotNull(startTrackingAfter);
            if (startTrackingAfter.before(date)) {
                RadarLogger.d$default(this.logger, "Starting time-based tracking | startTrackingAfter = " + trackingOptions.getStartTrackingAfter(), null, null, 6, null);
                RadarSettings.INSTANCE.setTracking$sdk_release(this.context, true);
                tracking$sdk_release = true;
                if (!tracking$sdk_release) {
                    if (Radar.getTrackingOptions().getUseMotion()) {
                        this.activityManager.m13254startActivityUpdatesd1pmJ48$sdk_release();
                    }
                    if (Radar.getTrackingOptions().getUsePressure()) {
                        this.sensorsManager.onResume();
                    }
                    if (trackingOptions.getForegroundServiceEnabled()) {
                        RadarTrackingOptions.RadarTrackingOptionsForegroundService foregroundService$sdk_release = RadarSettings.INSTANCE.getForegroundService$sdk_release(this.context);
                        if (!foregroundService$sdk_release.getUpdatesOnly()) {
                            startForegroundService(foregroundService$sdk_release);
                        }
                    }
                    if (RadarState.INSTANCE.getStopped$sdk_release(this.context)) {
                        if (trackingOptions.getDesiredStoppedUpdateInterval() == 0) {
                            stopLocationUpdates();
                        } else {
                            startLocationUpdates(trackingOptions.getDesiredAccuracy(), trackingOptions.getDesiredStoppedUpdateInterval(), trackingOptions.getFastestStoppedUpdateInterval());
                        }
                        if (!trackingOptions.getUseStoppedGeofence()) {
                            removeBubbleGeofences$default(this, null, 1, null);
                        } else if (location != null) {
                            replaceBubbleGeofence(location, true);
                        }
                    } else {
                        if (trackingOptions.getDesiredMovingUpdateInterval() == 0) {
                            stopLocationUpdates();
                        } else {
                            startLocationUpdates(trackingOptions.getDesiredAccuracy(), trackingOptions.getDesiredMovingUpdateInterval(), trackingOptions.getFastestMovingUpdateInterval());
                        }
                        if (!trackingOptions.getUseMovingGeofence()) {
                            removeBubbleGeofences$default(this, null, 1, null);
                        } else if (location != null) {
                            replaceBubbleGeofence(location, false);
                        }
                    }
                    if (Build.VERSION.SDK_INT < 26 || trackingOptions.getForegroundServiceEnabled() || !RadarForegroundService.INSTANCE.getStarted$sdk_release()) {
                        return;
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: io.radar.sdk.RadarLocationManager$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RadarLocationManager.updateTracking$lambda$2(RadarLocationManager.this);
                        }
                    }, 5000L);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26 && RadarForegroundService.INSTANCE.getStarted$sdk_release()) {
                    stopForegroundService();
                }
                stopLocationUpdates();
                removeAllGeofences();
                if (Build.VERSION.SDK_INT >= 26) {
                    Radar.INSTANCE.getBeaconManager$sdk_release().stopMonitoringBeacons();
                    return;
                }
                return;
            }
        }
        if (tracking$sdk_release && trackingOptions$sdk_release.getStopTrackingAfter() != null) {
            Date stopTrackingAfter = trackingOptions$sdk_release.getStopTrackingAfter();
            Intrinsics.checkNotNull(stopTrackingAfter);
            if (stopTrackingAfter.before(date)) {
                RadarLogger.d$default(this.logger, "Stopping time-based tracking | startTrackingAfter = " + trackingOptions.getStartTrackingAfter(), null, null, 6, null);
                RadarSettings.INSTANCE.setTracking$sdk_release(this.context, false);
                tracking$sdk_release = false;
            }
        }
        if (!tracking$sdk_release) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTracking$lambda$2(RadarLocationManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stopForegroundService();
    }

    public final void updateTrackingFromMeta$sdk_release(RadarMeta meta) {
        if (meta != null) {
            if (meta.getRemoteTrackingOptions() != null) {
                RadarLogger.d$default(this.logger, "Setting remote tracking options | trackingOptions = " + meta.getRemoteTrackingOptions(), null, null, 6, null);
                RadarSettings.INSTANCE.setRemoteTrackingOptions$sdk_release(this.context, meta.getRemoteTrackingOptions());
            } else {
                RadarSettings.INSTANCE.removeRemoteTrackingOptions$sdk_release(this.context);
                RadarLogger.d$default(this.logger, "Removed remote tracking options | trackingOptions = " + Radar.getTrackingOptions(), null, null, 6, null);
            }
        }
        updateTracking$sdk_release$default(this, null, 1, null);
    }

    public final void restartPreviousTrackingOptions$sdk_release() {
        RadarTrackingOptions previousTrackingOptions$sdk_release = RadarSettings.INSTANCE.getPreviousTrackingOptions$sdk_release(this.context);
        RadarLogger.d$default(this.logger, "Restarting previous tracking options | trackingOptions = " + previousTrackingOptions$sdk_release, null, null, 6, null);
        if (previousTrackingOptions$sdk_release == null) {
            Radar.stopTracking();
        } else {
            Radar.startTracking(previousTrackingOptions$sdk_release);
        }
        RadarSettings.INSTANCE.removePreviousTrackingOptions$sdk_release(this.context);
    }

    public final Location getLocationFromGeofenceIntent$sdk_release(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.locationClient.getLocationFromGeofenceIntent(intent);
    }

    public final Radar.RadarLocationSource getSourceFromGeofenceIntent$sdk_release(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.locationClient.getSourceFromGeofenceIntent(intent);
    }

    public final Location getLocationFromLocationIntent$sdk_release(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.locationClient.getLocationFromLocationIntent(intent);
    }

    private final void replaceBubbleGeofence(final Location location, final boolean stopped) {
        removeBubbleGeofences(new Function1<Boolean, Unit>() { // from class: io.radar.sdk.RadarLocationManager$replaceBubbleGeofence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                RadarLocationManager.this.addBubbleGeofence(location, stopped);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addBubbleGeofence(Location location, boolean stopped) {
        RadarTrackingOptions trackingOptions = Radar.getTrackingOptions();
        if (stopped && trackingOptions.getUseStoppedGeofence()) {
            float stoppedGeofenceRadius = trackingOptions.getStoppedGeofenceRadius();
            DefaultConstructorMarker defaultConstructorMarker = null;
            RadarAbstractLocationClient.RadarAbstractGeofence[] radarAbstractGeofenceArr = {new RadarAbstractLocationClient.RadarAbstractGeofence(BUBBLE_STOPPED_GEOFENCE_REQUEST_ID, location.getLatitude(), location.getLongitude(), stoppedGeofenceRadius, false, true, false, 0, JfifUtil.MARKER_RST0, defaultConstructorMarker)};
            RadarAbstractLocationClient.RadarAbstractGeofenceRequest radarAbstractGeofenceRequest = new RadarAbstractLocationClient.RadarAbstractGeofenceRequest(false, true, 0 == true ? 1 : 0, 5, defaultConstructorMarker);
            RadarLogger.d$default(this.logger, "Adding stopped bubble geofence | latitude = " + location.getLatitude() + "; longitude = " + location.getLongitude() + "; radius = " + stoppedGeofenceRadius + "; identifier = radar_stopped", null, null, 6, null);
            this.locationClient.addGeofences(radarAbstractGeofenceArr, radarAbstractGeofenceRequest, RadarLocationReceiver.INSTANCE.getBubbleGeofencePendingIntent$sdk_release(this.context), new Function1<Boolean, Unit>() { // from class: io.radar.sdk.RadarLocationManager$addBubbleGeofence$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    RadarLogger radarLogger;
                    RadarLogger radarLogger2;
                    if (z) {
                        radarLogger2 = RadarLocationManager.this.logger;
                        RadarLogger.d$default(radarLogger2, "Successfully added stopped bubble geofence", null, null, 6, null);
                    } else {
                        radarLogger = RadarLocationManager.this.logger;
                        RadarLogger.d$default(radarLogger, "Error adding stopped bubble geofence", null, null, 6, null);
                    }
                }
            });
            return;
        }
        if (stopped || !trackingOptions.getUseMovingGeofence()) {
            return;
        }
        float movingGeofenceRadius = trackingOptions.getMovingGeofenceRadius();
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z = true;
        RadarAbstractLocationClient.RadarAbstractGeofence radarAbstractGeofence = new RadarAbstractLocationClient.RadarAbstractGeofence(BUBBLE_MOVING_GEOFENCE_REQUEST_ID, location.getLatitude(), location.getLongitude(), movingGeofenceRadius, false, true, z, (trackingOptions.getStopDuration() * 1000) + 10000, 16, defaultConstructorMarker2);
        RadarAbstractLocationClient.RadarAbstractGeofenceRequest radarAbstractGeofenceRequest2 = new RadarAbstractLocationClient.RadarAbstractGeofenceRequest(false, z, true, 1, defaultConstructorMarker2);
        RadarLogger.d$default(this.logger, "Adding moving bubble geofence | latitude = " + location.getLatitude() + "; longitude = " + location.getLongitude() + "; radius = " + movingGeofenceRadius + "; identifier = radar_moving", null, null, 6, null);
        this.locationClient.addGeofences(new RadarAbstractLocationClient.RadarAbstractGeofence[]{radarAbstractGeofence}, radarAbstractGeofenceRequest2, RadarLocationReceiver.INSTANCE.getBubbleGeofencePendingIntent$sdk_release(this.context), new Function1<Boolean, Unit>() { // from class: io.radar.sdk.RadarLocationManager$addBubbleGeofence$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2) {
                RadarLogger radarLogger;
                RadarLogger radarLogger2;
                if (z2) {
                    radarLogger2 = RadarLocationManager.this.logger;
                    RadarLogger.d$default(radarLogger2, "Successfully added moving bubble geofence", null, null, 6, null);
                } else {
                    radarLogger = RadarLocationManager.this.logger;
                    RadarLogger.d$default(radarLogger, "Error adding moving bubble geofence", null, null, 6, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceSyncedGeofences(final RadarGeofence[] radarGeofences) {
        removeSyncedGeofences(new Function1<Boolean, Unit>() { // from class: io.radar.sdk.RadarLocationManager$replaceSyncedGeofences$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                RadarLocationManager.this.addSyncedGeofences(radarGeofences);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSyncedGeofences(RadarGeofence[] radarGeofences) {
        RadarCoordinate radarCoordinate;
        double d;
        RadarTrackingOptions radarTrackingOptions;
        ArrayList arrayList;
        RadarTrackingOptions trackingOptions = Radar.getTrackingOptions();
        if (trackingOptions.getSyncGeofences() == RadarTrackingOptions.RadarTrackingOptionsSyncGeofences.NONE || radarGeofences == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int length = radarGeofences.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            RadarGeofence radarGeofence = radarGeofences[i];
            int i3 = i2 + 1;
            if (radarGeofence.getGeometry() instanceof RadarCircleGeometry) {
                radarCoordinate = ((RadarCircleGeometry) radarGeofence.getGeometry()).getCenter();
                d = ((RadarCircleGeometry) radarGeofence.getGeometry()).getRadius();
            } else if (radarGeofence.getGeometry() instanceof RadarPolygonGeometry) {
                radarCoordinate = ((RadarPolygonGeometry) radarGeofence.getGeometry()).getCenter();
                d = ((RadarPolygonGeometry) radarGeofence.getGeometry()).getRadius();
            } else {
                radarCoordinate = null;
                d = 100.0d;
            }
            if (radarCoordinate != null) {
                try {
                    String str = "radar_sync_" + i2;
                    arrayList2.add(new RadarAbstractLocationClient.RadarAbstractGeofence(str, radarCoordinate.getLatitude(), radarCoordinate.getLongitude(), (float) d, true, true, true, (trackingOptions.getStopDuration() * 1000) + 10000));
                    RadarLogger radarLogger = this.logger;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Adding synced geofence | latitude = ");
                    radarTrackingOptions = trackingOptions;
                    arrayList = arrayList2;
                    try {
                        sb.append(radarCoordinate.getLatitude());
                        sb.append("; longitude = ");
                        sb.append(radarCoordinate.getLongitude());
                        sb.append("; radius = ");
                        sb.append(d);
                        sb.append("; identifier = ");
                        sb.append(str);
                        RadarLogger.d$default(radarLogger, sb.toString(), null, null, 6, null);
                    } catch (Exception unused) {
                        RadarLogger.d$default(this.logger, "Error building synced geofence | latitude = " + radarCoordinate.getLatitude() + "; longitude = " + radarCoordinate.getLongitude() + "; radius = " + d, null, null, 6, null);
                        i++;
                        trackingOptions = radarTrackingOptions;
                        i2 = i3;
                        arrayList2 = arrayList;
                    }
                } catch (Exception unused2) {
                    radarTrackingOptions = trackingOptions;
                    arrayList = arrayList2;
                }
            } else {
                radarTrackingOptions = trackingOptions;
                arrayList = arrayList2;
            }
            i++;
            trackingOptions = radarTrackingOptions;
            i2 = i3;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.size() == 0) {
            RadarLogger.d$default(this.logger, "No synced geofences", null, null, 6, null);
            return;
        }
        this.locationClient.addGeofences((RadarAbstractLocationClient.RadarAbstractGeofence[]) arrayList3.toArray(new RadarAbstractLocationClient.RadarAbstractGeofence[0]), new RadarAbstractLocationClient.RadarAbstractGeofenceRequest(false, false, false, 7, null), RadarLocationReceiver.INSTANCE.getSyncedGeofencesPendingIntent$sdk_release(this.context), new Function1<Boolean, Unit>() { // from class: io.radar.sdk.RadarLocationManager$addSyncedGeofences$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                RadarLogger radarLogger2;
                RadarLogger radarLogger3;
                if (z) {
                    radarLogger3 = RadarLocationManager.this.logger;
                    RadarLogger.d$default(radarLogger3, "Successfully added synced geofences", null, null, 6, null);
                } else {
                    radarLogger2 = RadarLocationManager.this.logger;
                    RadarLogger.d$default(radarLogger2, "Error adding synced geofences", null, null, 6, null);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void removeBubbleGeofences$default(RadarLocationManager radarLocationManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        radarLocationManager.removeBubbleGeofences(function1);
    }

    private final void removeBubbleGeofences(final Function1<? super Boolean, Unit> block) {
        this.locationClient.removeGeofences(RadarLocationReceiver.INSTANCE.getBubbleGeofencePendingIntent$sdk_release(this.context), new Function1<Boolean, Unit>() { // from class: io.radar.sdk.RadarLocationManager$removeBubbleGeofences$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                RadarLogger radarLogger;
                RadarLogger radarLogger2;
                if (z) {
                    radarLogger2 = RadarLocationManager.this.logger;
                    RadarLogger.d$default(radarLogger2, "Removed bubble geofences", null, null, 6, null);
                    Function1<Boolean, Unit> function1 = block;
                    if (function1 != null) {
                        function1.invoke(true);
                        return;
                    }
                    return;
                }
                radarLogger = RadarLocationManager.this.logger;
                RadarLogger.d$default(radarLogger, "Error removing bubble geofences", null, null, 6, null);
                Function1<Boolean, Unit> function12 = block;
                if (function12 != null) {
                    function12.invoke(false);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void removeSyncedGeofences$default(RadarLocationManager radarLocationManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        radarLocationManager.removeSyncedGeofences(function1);
    }

    private final void removeSyncedGeofences(final Function1<? super Boolean, Unit> block) {
        this.locationClient.removeGeofences(RadarLocationReceiver.INSTANCE.getSyncedGeofencesPendingIntent$sdk_release(this.context), new Function1<Boolean, Unit>() { // from class: io.radar.sdk.RadarLocationManager$removeSyncedGeofences$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                RadarLogger radarLogger;
                RadarLogger radarLogger2;
                if (z) {
                    radarLogger2 = RadarLocationManager.this.logger;
                    RadarLogger.d$default(radarLogger2, "Removed synced geofences", null, null, 6, null);
                    Function1<Boolean, Unit> function1 = block;
                    if (function1 != null) {
                        function1.invoke(true);
                        return;
                    }
                    return;
                }
                radarLogger = RadarLocationManager.this.logger;
                RadarLogger.d$default(radarLogger, "Error removing synced geofences", null, null, 6, null);
                Function1<Boolean, Unit> function12 = block;
                if (function12 != null) {
                    function12.invoke(false);
                }
            }
        });
    }

    private final void removeAllGeofences() {
        removeBubbleGeofences$default(this, null, 1, null);
        removeSyncedGeofences$default(this, null, 1, null);
    }

    public final void handleLocation(Location location, Radar.RadarLocationSource source) {
        long j;
        boolean z;
        float f;
        boolean z2;
        Location location2 = location;
        Intrinsics.checkNotNullParameter(source, "source");
        if (Radar.isTestKey$sdk_release()) {
            long time = location2 == null ? -1L : new Date().getTime() - location2.getTime();
            Integer appStandbyBucket = this.batteryManager.getAppStandbyBucket();
            BatteryState batteryState = this.batteryManager.getBatteryState();
            RadarLogger.d$default(this.logger, "Handling location | location = " + location2 + "; latency = " + time + "; standbyBucket = " + appStandbyBucket + "; performanceState = " + batteryState.getPerformanceState().name() + "; isCharging = " + batteryState.isCharging() + "; batteryPercentage = " + batteryState.getPercent() + "; isPowerSaveMode = " + batteryState.getPowerSaveMode() + "; isIgnoringBatteryOptimizations = " + batteryState.isIgnoringBatteryOptimizations() + "; locationPowerSaveMode = " + batteryState.getPowerLocationPowerSaveModeString() + "; isDozeMode = " + batteryState.isDeviceIdleMode(), null, null, 6, null);
        } else {
            RadarLogger.d$default(this.logger, "Handling location | source = " + source + "; location = " + location2, null, null, 6, null);
        }
        if (Intrinsics.areEqual(location2 != null ? Float.valueOf(location2.getAccuracy()) : null, 0.0f)) {
            location2.setAccuracy(1000.0f);
            RadarLogger.d$default(this.logger, "Setting default accuracy of 1000 for location without accuracy", null, null, 6, null);
        }
        if (location2 == null || !RadarUtils.INSTANCE.valid$sdk_release(location2)) {
            RadarLogger.d$default(this.logger, "Invalid location | source = " + source + "; location = " + location2, null, null, 6, null);
            Radar.INSTANCE.sendError$sdk_release(Radar.RadarStatus.ERROR_LOCATION, "Invalid location | source = " + source + "; location = " + location2);
            callCallbacks$default(this, Radar.RadarStatus.ERROR_LOCATION, null, 2, null);
            return;
        }
        RadarTrackingOptions trackingOptions = Radar.getTrackingOptions();
        boolean stopped$sdk_release = RadarState.INSTANCE.getStopped$sdk_release(this.context);
        boolean z3 = source == Radar.RadarLocationSource.FOREGROUND_LOCATION || source == Radar.RadarLocationSource.MANUAL_LOCATION || source == Radar.RadarLocationSource.BEACON_ENTER || source == Radar.RadarLocationSource.BEACON_EXIT;
        if (!z3 && location2.getAccuracy() >= 1000.0f && trackingOptions.getDesiredAccuracy() != RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW) {
            RadarLogger.d$default(this.logger, "Skipping location: inaccurate | accuracy = " + location2.getAccuracy(), null, null, 6, null);
            updateTracking$sdk_release(location);
            return;
        }
        if (trackingOptions.getStopDistance() <= 0 || trackingOptions.getStopDuration() <= 0) {
            j = 0;
            z = z3 || source == Radar.RadarLocationSource.GEOFENCE_DWELL;
            f = Float.MAX_VALUE;
        } else {
            Location lastMovedLocation$sdk_release = RadarState.INSTANCE.getLastMovedLocation$sdk_release(this.context);
            if (lastMovedLocation$sdk_release == null) {
                RadarState.INSTANCE.setLastMovedLocation$sdk_release(this.context, location2);
                lastMovedLocation$sdk_release = location2;
            }
            long lastMovedAt$sdk_release = RadarState.INSTANCE.getLastMovedAt$sdk_release(this.context);
            if (lastMovedAt$sdk_release == 0) {
                lastMovedAt$sdk_release = location2.getTime();
                RadarState.INSTANCE.setLastMovedAt$sdk_release(this.context, lastMovedAt$sdk_release);
            }
            if (!z3 && lastMovedAt$sdk_release > location2.getTime()) {
                RadarLogger.d$default(this.logger, "Skipping location: old | lastMovedAt = " + lastMovedAt$sdk_release + "; location.time = " + location2.getTime(), null, null, 6, null);
                return;
            }
            f = location2.distanceTo(lastMovedLocation$sdk_release);
            j = 0;
            long time2 = (location2.getTime() - lastMovedAt$sdk_release) / 1000;
            z = f < ((float) trackingOptions.getStopDistance()) && time2 > ((long) trackingOptions.getStopDuration());
            RadarLogger.d$default(this.logger, "Calculating stopped | stopped = " + z + "; distance = " + f + "; duration = " + time2 + "; location.time = " + location2.getTime() + "; lastMovedAt = " + lastMovedAt$sdk_release, null, null, 6, null);
            if (f > trackingOptions.getStopDistance()) {
                RadarState.INSTANCE.setLastMovedLocation$sdk_release(this.context, location2);
                if (!z) {
                    RadarState.INSTANCE.setLastMovedAt$sdk_release(this.context, location2.getTime());
                }
            }
        }
        boolean z4 = z && !stopped$sdk_release;
        RadarState.INSTANCE.setStopped$sdk_release(this.context, z);
        RadarState.INSTANCE.setLastLocation$sdk_release(this.context, location2);
        Radar.INSTANCE.sendClientLocation$sdk_release(location2, z, source);
        if (source != Radar.RadarLocationSource.MANUAL_LOCATION) {
            updateTracking$sdk_release(location);
        }
        callCallbacks(Radar.RadarStatus.SUCCESS, location2);
        Location lastFailedStoppedLocation$sdk_release = RadarState.INSTANCE.getLastFailedStoppedLocation$sdk_release(this.context);
        if (trackingOptions.getReplay() != RadarTrackingOptions.RadarTrackingOptionsReplay.STOPS || lastFailedStoppedLocation$sdk_release == null || z4) {
            z2 = false;
        } else {
            RadarState.INSTANCE.setLastFailedStoppedLocation$sdk_release(this.context, null);
            RadarLogger.d$default(this.logger, "Replaying location | location = " + location2 + "; stopped = true", null, null, 6, null);
            location2 = lastFailedStoppedLocation$sdk_release;
            z2 = true;
            z = true;
        }
        long lastSentAt$sdk_release = RadarState.INSTANCE.getLastSentAt$sdk_release(this.context);
        boolean z5 = lastSentAt$sdk_release == j || this.callbacks.size() > 0 || z4 || z2;
        long currentTimeMillis = (System.currentTimeMillis() - lastSentAt$sdk_release) / 1000;
        if (!z5) {
            if (!z3 && z && stopped$sdk_release && f < trackingOptions.getStopDistance() && (trackingOptions.getDesiredStoppedUpdateInterval() == 0 || trackingOptions.getSync() != RadarTrackingOptions.RadarTrackingOptionsSync.ALL)) {
                RadarLogger.d$default(this.logger, "Skipping sync: already stopped | stopped = " + z + "; wasStopped = " + stopped$sdk_release, null, null, 6, null);
                return;
            }
            double d = currentTimeMillis + 0.1d;
            if (d < trackingOptions.getDesiredSyncInterval()) {
                RadarLogger.d$default(this.logger, "Skipping sync: desired sync interval | desiredSyncInterval = " + trackingOptions.getDesiredSyncInterval() + "; lastSyncInterval = " + d, null, null, 6, null);
                return;
            }
            if (!z3 && !z4 && currentTimeMillis < 1) {
                RadarLogger.d$default(this.logger, "Skipping sync: rate limit | justStopped = " + z4 + "; lastSyncInterval = " + currentTimeMillis, null, null, 6, null);
                return;
            }
            if (trackingOptions.getSync() == RadarTrackingOptions.RadarTrackingOptionsSync.NONE) {
                RadarLogger.d$default(this.logger, "Skipping sync: sync mode | sync = " + trackingOptions.getSync(), null, null, 6, null);
                return;
            }
            boolean canExit$sdk_release = RadarState.INSTANCE.getCanExit$sdk_release(this.context);
            if (!canExit$sdk_release && trackingOptions.getSync() == RadarTrackingOptions.RadarTrackingOptionsSync.STOPS_AND_EXITS) {
                RadarLogger.d$default(this.logger, "Skipping sync: can't exit | sync = " + trackingOptions.getSync() + "; canExit = " + canExit$sdk_release, null, null, 6, null);
                return;
            }
        }
        RadarState.INSTANCE.updateLastSentAt$sdk_release(this.context);
        if (source == Radar.RadarLocationSource.FOREGROUND_LOCATION) {
            return;
        }
        sendLocation(location2, z, source, z2);
    }

    private final void sendLocation(final Location location, final boolean stopped, final Radar.RadarLocationSource source, final boolean replayed) {
        final RadarTrackingOptions trackingOptions = Radar.getTrackingOptions();
        final RadarTrackingOptions.RadarTrackingOptionsForegroundService foregroundService$sdk_release = RadarSettings.INSTANCE.getForegroundService$sdk_release(this.context);
        if (trackingOptions.getForegroundServiceEnabled() && foregroundService$sdk_release.getUpdatesOnly()) {
            startForegroundService(foregroundService$sdk_release);
        }
        RadarLogger.d$default(this.logger, "Sending location | source = " + source + "; location = " + location + "; stopped = " + stopped + "; replayed = " + replayed, null, null, 6, null);
        final Function1<RadarBeacon[], Unit> function1 = new Function1<RadarBeacon[], Unit>() { // from class: io.radar.sdk.RadarLocationManager$sendLocation$callTrackApi$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(RadarBeacon[] radarBeaconArr) {
                invoke2(radarBeaconArr);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RadarBeacon[] radarBeaconArr) {
                RadarApiClient radarApiClient;
                radarApiClient = RadarLocationManager.this.apiClient;
                Location location2 = location;
                boolean z = stopped;
                boolean foreground = RadarActivityLifecycleCallbacks.INSTANCE.getForeground();
                Radar.RadarLocationSource radarLocationSource = source;
                boolean z2 = replayed;
                final RadarLocationManager radarLocationManager = this;
                final RadarTrackingOptions radarTrackingOptions = trackingOptions;
                final RadarTrackingOptions.RadarTrackingOptionsForegroundService radarTrackingOptionsForegroundService = foregroundService$sdk_release;
                final RadarLocationManager radarLocationManager2 = RadarLocationManager.this;
                RadarApiClient.track$sdk_release$default(radarApiClient, location2, z, foreground, radarLocationSource, z2, radarBeaconArr, false, null, null, null, null, null, null, null, new RadarApiClient.RadarTrackApiCallback() { // from class: io.radar.sdk.RadarLocationManager$sendLocation$callTrackApi$1.1
                    @Override // io.radar.sdk.RadarApiClient.RadarTrackApiCallback
                    public void onComplete(Radar.RadarStatus status, JSONObject res, RadarEvent[] events, RadarUser user, RadarGeofence[] nearbyGeofences, RadarConfig config, RadarVerifiedLocationToken token) {
                        Intrinsics.checkNotNullParameter(status, "status");
                        RadarLocationManager.this.replaceSyncedGeofences(nearbyGeofences);
                        if (radarTrackingOptions.getForegroundServiceEnabled() && radarTrackingOptionsForegroundService.getUpdatesOnly()) {
                            RadarLocationManager.this.stopForegroundService();
                        }
                        radarLocationManager2.updateTrackingFromMeta$sdk_release(config != null ? config.getMeta() : null);
                    }
                }, 16320, null);
            }
        };
        if (trackingOptions.getBeacons() && Build.VERSION.SDK_INT >= 26 && this.permissionsHelper.bluetoothPermissionsGranted$sdk_release(this.context)) {
            this.apiClient.searchBeacons$sdk_release(location, 1000, 10, new RadarApiClient.RadarSearchBeaconsApiCallback() { // from class: io.radar.sdk.RadarLocationManager$sendLocation$1
                @Override // io.radar.sdk.RadarApiClient.RadarSearchBeaconsApiCallback
                public void onComplete(Radar.RadarStatus status, JSONObject res, RadarBeacon[] beacons, String[] uuids, String[] uids) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    if ((uuids != null && uuids.length != 0) || (uids != null && uids.length != 0)) {
                        Radar.INSTANCE.getBeaconManager$sdk_release().startMonitoringBeaconUUIDs(uuids, uids);
                        RadarBeaconManager beaconManager$sdk_release = Radar.INSTANCE.getBeaconManager$sdk_release();
                        final Function1<RadarBeacon[], Unit> function12 = function1;
                        beaconManager$sdk_release.rangeBeaconUUIDs(uuids, uids, true, new Radar.RadarBeaconCallback() { // from class: io.radar.sdk.RadarLocationManager$sendLocation$1$onComplete$1
                            @Override // io.radar.sdk.Radar.RadarBeaconCallback
                            public void onComplete(Radar.RadarStatus status2, RadarBeacon[] beacons2) {
                                Intrinsics.checkNotNullParameter(status2, "status");
                                if (status2 != Radar.RadarStatus.SUCCESS || beacons2 == null) {
                                    function12.invoke(null);
                                } else {
                                    function12.invoke(beacons2);
                                }
                            }
                        });
                        return;
                    }
                    if (beacons != null) {
                        Radar.INSTANCE.getBeaconManager$sdk_release().startMonitoringBeacons(beacons);
                        RadarBeaconManager beaconManager$sdk_release2 = Radar.INSTANCE.getBeaconManager$sdk_release();
                        final Function1<RadarBeacon[], Unit> function13 = function1;
                        beaconManager$sdk_release2.rangeBeacons(beacons, true, new Radar.RadarBeaconCallback() { // from class: io.radar.sdk.RadarLocationManager$sendLocation$1$onComplete$2
                            @Override // io.radar.sdk.Radar.RadarBeaconCallback
                            public void onComplete(Radar.RadarStatus status2, RadarBeacon[] beacons2) {
                                Intrinsics.checkNotNullParameter(status2, "status");
                                if (status2 != Radar.RadarStatus.SUCCESS || beacons2 == null) {
                                    function13.invoke(null);
                                } else {
                                    function13.invoke(beacons2);
                                }
                            }
                        });
                        return;
                    }
                    function1.invoke(new RadarBeacon[0]);
                }
            }, stopped || source == Radar.RadarLocationSource.BEACON_ENTER || source == Radar.RadarLocationSource.BEACON_EXIT);
        } else {
            function1.invoke(null);
        }
    }

    private final void startForegroundService(RadarTrackingOptions.RadarTrackingOptionsForegroundService foregroundService) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (RadarForegroundService.INSTANCE.getStarted$sdk_release()) {
                    RadarLogger.d$default(this.logger, "Already started foreground service", null, null, 6, null);
                    return;
                }
                Intent intent = new Intent(this.context, (Class<?>) RadarForegroundService.class);
                intent.setAction("start");
                Intent putExtra = intent.putExtra("id", foregroundService.getId());
                Integer importance = foregroundService.getImportance();
                putExtra.putExtra("importance", importance != null ? importance.intValue() : 3).putExtra("title", foregroundService.getTitle()).putExtra("text", foregroundService.getText()).putExtra("icon", foregroundService.getIcon()).putExtra("iconString", foregroundService.getIconString()).putExtra("iconColor", foregroundService.getIconColor()).putExtra(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, foregroundService.getActivity()).putExtra("deepLink", foregroundService.getDeepLink());
                RadarLogger.d$default(this.logger, "Starting foreground service with intent | intent = " + intent, null, null, 6, null);
                this.context.getApplicationContext().startForegroundService(intent);
                RadarForegroundService.INSTANCE.setStarted$sdk_release(true);
            } catch (Exception e) {
                this.logger.e("Error starting foreground service with intent", Radar.RadarLogType.SDK_EXCEPTION, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopForegroundService() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Intent intent = new Intent(this.context, (Class<?>) RadarForegroundService.class);
                intent.setAction("stop");
                RadarLogger.d$default(this.logger, "Stopping foreground service with intent", null, null, 6, null);
                this.context.getApplicationContext().startService(intent);
                RadarForegroundService.INSTANCE.setStarted$sdk_release(false);
            } catch (Exception e) {
                this.logger.e("Error stopping foreground service with intent", Radar.RadarLogType.SDK_EXCEPTION, e);
            }
        }
    }
}

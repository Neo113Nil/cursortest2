package io.radar.sdk;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import androidx.media3.common.C;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import io.radar.sdk.Radar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarLocationReceiver.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017¨\u0006\n"}, d2 = {"Lio/radar/sdk/RadarLocationReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarLocationReceiver extends BroadcastReceiver {
    public static final String ACTION_ACTIVITY = "io.radar.sdk.LocationReceiver.ACTIVITY";
    public static final String ACTION_BEACON = "io.radar.sdk.LocationReceiver.BEACON";
    public static final String ACTION_BUBBLE_GEOFENCE = "io.radar.sdk.LocationReceiver.GEOFENCE";
    public static final String ACTION_LOCATION = "io.radar.sdk.LocationReceiver.LOCATION";
    public static final String ACTION_SYNCED_GEOFENCES = "io.radar.sdk.LocationReceiver.SYNCED_GEOFENCES";
    public static final String ACTION_VERIFIED_LOCATION = "io.radar.sdk.LocationReceiver.VERIFIED_LOCATION";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int REQUEST_CODE_ACTIVITY = 201605254;
    private static final int REQUEST_CODE_BEACON = 201605253;
    private static final int REQUEST_CODE_BUBBLE_GEOFENCE = 201605251;
    private static final int REQUEST_CODE_LOCATION = 201605250;
    private static final int REQUEST_CODE_SYNCED_GEOFENCES = 201605252;
    private static final int REQUEST_CODE_VERIFIED_LOCATION = 201605255;

    /* compiled from: RadarLocationReceiver.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lio/radar/sdk/RadarLocationReceiver$Companion;", "", "()V", "ACTION_ACTIVITY", "", "ACTION_BEACON", "ACTION_BUBBLE_GEOFENCE", "ACTION_LOCATION", "ACTION_SYNCED_GEOFENCES", "ACTION_VERIFIED_LOCATION", "REQUEST_CODE_ACTIVITY", "", "REQUEST_CODE_BEACON", "REQUEST_CODE_BUBBLE_GEOFENCE", "REQUEST_CODE_LOCATION", "REQUEST_CODE_SYNCED_GEOFENCES", "REQUEST_CODE_VERIFIED_LOCATION", "baseIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getActivityPendingIntent", "Landroid/app/PendingIntent;", "getActivityPendingIntent$sdk_release", "getBeaconPendingIntent", "getBeaconPendingIntent$sdk_release", "getBubbleGeofencePendingIntent", "getBubbleGeofencePendingIntent$sdk_release", "getLocationPendingIntent", "getLocationPendingIntent$sdk_release", "getSyncedGeofencesPendingIntent", "getSyncedGeofencesPendingIntent$sdk_release", "getVerifiedLocationPendingIntent", "getVerifiedLocationPendingIntent$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PendingIntent getLocationPendingIntent$sdk_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent baseIntent = baseIntent(context);
            baseIntent.setAction(RadarLocationReceiver.ACTION_LOCATION);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, RadarLocationReceiver.REQUEST_CODE_LOCATION, baseIntent, Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final PendingIntent getVerifiedLocationPendingIntent$sdk_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent baseIntent = baseIntent(context);
            baseIntent.setAction(RadarLocationReceiver.ACTION_VERIFIED_LOCATION);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, RadarLocationReceiver.REQUEST_CODE_VERIFIED_LOCATION, baseIntent, Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final PendingIntent getBubbleGeofencePendingIntent$sdk_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent baseIntent = baseIntent(context);
            baseIntent.setAction(RadarLocationReceiver.ACTION_BUBBLE_GEOFENCE);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, RadarLocationReceiver.REQUEST_CODE_BUBBLE_GEOFENCE, baseIntent, Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final PendingIntent getSyncedGeofencesPendingIntent$sdk_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent baseIntent = baseIntent(context);
            baseIntent.setAction(RadarLocationReceiver.ACTION_SYNCED_GEOFENCES);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, RadarLocationReceiver.REQUEST_CODE_SYNCED_GEOFENCES, baseIntent, Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final PendingIntent getBeaconPendingIntent$sdk_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent baseIntent = baseIntent(context);
            baseIntent.setAction(RadarLocationReceiver.ACTION_BEACON);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, RadarLocationReceiver.REQUEST_CODE_BEACON, baseIntent, Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final PendingIntent getActivityPendingIntent$sdk_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent baseIntent = baseIntent(context);
            baseIntent.setAction(RadarLocationReceiver.ACTION_ACTIVITY);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, RadarLocationReceiver.REQUEST_CODE_ACTIVITY, baseIntent, Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        private final Intent baseIntent(Context context) {
            return new Intent(context, (Class<?>) RadarLocationReceiver.class);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        if (r0.equals(io.radar.sdk.RadarLocationReceiver.ACTION_BUBBLE_GEOFENCE) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
    
        r0 = io.radar.sdk.Radar.INSTANCE.getLocationManager$sdk_release().getLocationFromGeofenceIntent$sdk_release(r13);
        r2 = io.radar.sdk.Radar.INSTANCE.getLocationManager$sdk_release().getSourceFromGeofenceIntent$sdk_release(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0126, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
    
        io.radar.sdk.Radar.INSTANCE.handleLocation$sdk_release(r12, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010d, code lost:
    
        if (r0.equals(io.radar.sdk.RadarLocationReceiver.ACTION_SYNCED_GEOFENCES) == false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        int intExtra;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!Radar.INSTANCE.getInitialized$sdk_release()) {
            Radar.initialize(context, null, new RadarInitializeOptions(null, null, RadarSettings.INSTANCE.getFraudEnabled$sdk_release(context), null, null, false, 59, null));
        }
        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Received broadcast | action = " + intent.getAction(), null, null, 6, null);
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2035686220:
                    break;
                case -992172314:
                    break;
                case -930677989:
                    if (action.equals(ACTION_LOCATION)) {
                        Location locationFromLocationIntent$sdk_release = Radar.INSTANCE.getLocationManager$sdk_release().getLocationFromLocationIntent$sdk_release(intent);
                        Radar.RadarLocationSource radarLocationSource = Radar.RadarLocationSource.BACKGROUND_LOCATION;
                        if (locationFromLocationIntent$sdk_release != null) {
                            if (Build.VERSION.SDK_INT < 26 || RadarForegroundService.INSTANCE.getStarted$sdk_release()) {
                                Radar.INSTANCE.handleLocation$sdk_release(context, locationFromLocationIntent$sdk_release, radarLocationSource);
                                break;
                            } else {
                                RadarJobScheduler.INSTANCE.scheduleJob$sdk_release(context, locationFromLocationIntent$sdk_release, radarLocationSource);
                                break;
                            }
                        }
                    }
                    break;
                case 798292259:
                    if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                        Radar.INSTANCE.handleBootCompleted$sdk_release(context);
                        break;
                    }
                    break;
                case 1093389610:
                    if (action.equals(ACTION_BEACON) && Build.VERSION.SDK_INT >= 26 && (intExtra = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1)) != -1) {
                        try {
                            RadarJobScheduler.INSTANCE.scheduleJob$sdk_release(context, RadarBeaconUtils.INSTANCE.beaconsForScanResults(intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT")), intExtra == 4 ? Radar.RadarLocationSource.BEACON_EXIT : Radar.RadarLocationSource.BEACON_ENTER);
                            break;
                        } catch (Exception e) {
                            Radar.INSTANCE.getLogger$sdk_release().e("Error scheduling beacons job", Radar.RadarLogType.SDK_EXCEPTION, e);
                            break;
                        }
                    }
                    break;
                case 1737074039:
                    if (action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Package replaced - reinitializing Radar SDK", null, null, 6, null);
                        Radar.INSTANCE.handleBootCompleted$sdk_release(context);
                        break;
                    }
                    break;
            }
        }
        if (ActivityTransitionResult.hasResult(intent)) {
            ActivityTransitionResult extractResult = ActivityTransitionResult.extractResult(intent);
            Intrinsics.checkNotNull(extractResult);
            for (ActivityTransitionEvent activityTransitionEvent : extractResult.getTransitionEvents()) {
                Radar.RadarActivityType activityType = RadarActivityManager.INSTANCE.getActivityType(activityTransitionEvent.getActivityType());
                JSONObject lastMotionActivity$sdk_release = RadarState.INSTANCE.getLastMotionActivity$sdk_release(context);
                if (lastMotionActivity$sdk_release != null && Intrinsics.areEqual(lastMotionActivity$sdk_release.getString("type"), activityType.toString())) {
                    RadarLogger.i$default(Radar.INSTANCE.getLogger$sdk_release(), "Activity detected but not initiating trackOnce for: " + activityType, null, null, 6, null);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", activityType.toString());
                jSONObject.put("dateTime", activityTransitionEvent.getElapsedRealTimeNanos());
                RadarState.INSTANCE.setLastMotionActivity$sdk_release(context, jSONObject);
                RadarLogger.i$default(Radar.INSTANCE.getLogger$sdk_release(), "Activity detected and initiating trackOnce for: " + activityType, null, null, 6, null);
            }
            Radar.trackOnce$default(null, 1, null);
        }
    }
}

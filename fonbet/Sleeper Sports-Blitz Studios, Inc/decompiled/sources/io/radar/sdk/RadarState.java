package io.radar.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.radar.sdk.model.RadarBeacon;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarState.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b0\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020'2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b(J\u001d\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b*J\u001f\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010,2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010,2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0004\b0\u0010.J\u001f\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010,2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u0004\u0018\u0001062\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b7J\u0017\u00108\u001a\u0004\u0018\u0001062\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b9J\u0017\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020>2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b?J\u0017\u0010@\u001a\u0004\u0018\u0001062\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\bAJ\u0017\u0010B\u001a\u0004\u0018\u00010;2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\bCJ\u0015\u0010D\u001a\u00020>2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\bEJ\u0017\u0010F\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\bGJ\u001d\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\bIJ\u0010\u0010J\u001a\u00020K2\u0006\u0010#\u001a\u00020$H\u0002J\u0015\u0010L\u001a\u00020'2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\bMJ%\u0010N\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010QH\u0000¢\u0006\u0002\bRJ\u001d\u0010S\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\u0006\u0010T\u001a\u00020'H\u0000¢\u0006\u0002\bUJ%\u0010V\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010QH\u0000¢\u0006\u0002\bXJ'\u0010Y\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010,H\u0001¢\u0006\u0004\b[\u0010\\J'\u0010]\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\u000e\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010,H\u0001¢\u0006\u0004\b_\u0010\\J'\u0010`\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\u000e\u0010a\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010,H\u0001¢\u0006\u0004\bb\u0010cJ\u001f\u0010d\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\b\u0010e\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0002\bfJ\u001f\u0010g\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\b\u0010e\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0002\bhJ\u001f\u0010i\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\b\u0010j\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0002\bkJ\u001d\u0010l\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\u0006\u0010m\u001a\u00020>H\u0000¢\u0006\u0002\bnJ\u001f\u0010o\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\b\u0010e\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0002\bpJ\u001f\u0010q\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\b\u0010r\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0002\bsJ\u001f\u0010t\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\b\u0010u\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\bvJ%\u0010w\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\u000e\u0010x\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010QH\u0000¢\u0006\u0002\byJ\u001d\u0010z\u001a\u00020O2\u0006\u0010#\u001a\u00020$2\u0006\u0010{\u001a\u00020'H\u0000¢\u0006\u0002\b|J\u0014\u0010}\u001a\u0004\u0018\u00010;2\b\u0010~\u001a\u0004\u0018\u00010\u0004H\u0002J\u0016\u0010\u007f\u001a\u00020O2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0003\b\u0080\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, d2 = {"Lio/radar/sdk/RadarState;", "", "()V", "KEY_BEACON_IDS", "", "KEY_CAN_EXIT", "KEY_GEOFENCE_IDS", "KEY_LAST_BEACONS", "KEY_LAST_BEACON_UIDS", "KEY_LAST_BEACON_UUIDS", "KEY_LAST_FAILED_STOPPED_LOCATION_ACCURACY", "KEY_LAST_FAILED_STOPPED_LOCATION_LATITUDE", "KEY_LAST_FAILED_STOPPED_LOCATION_LONGITUDE", "KEY_LAST_FAILED_STOPPED_LOCATION_PROVIDER", "KEY_LAST_FAILED_STOPPED_LOCATION_TIME", "KEY_LAST_LOCATION_ACCURACY", "KEY_LAST_LOCATION_LATITUDE", "KEY_LAST_LOCATION_LONGITUDE", "KEY_LAST_LOCATION_PROVIDER", "KEY_LAST_LOCATION_TIME", "KEY_LAST_MOTION_ACTIVITY", "KEY_LAST_MOVED_AT", "KEY_LAST_MOVED_LOCATION_ACCURACY", "KEY_LAST_MOVED_LOCATION_LATITUDE", "KEY_LAST_MOVED_LOCATION_LONGITUDE", "KEY_LAST_MOVED_LOCATION_PROVIDER", "KEY_LAST_MOVED_LOCATION_TIME", "KEY_LAST_PRESSURE", "KEY_LAST_SENT_AT", "KEY_PLACE_ID", "KEY_REGION_IDS", "KEY_STARTED", "KEY_STOPPED", "getBeaconIds", "", "context", "Landroid/content/Context;", "getBeaconIds$sdk_release", "getCanExit", "", "getCanExit$sdk_release", "getGeofenceIds", "getGeofenceIds$sdk_release", "getLastBeaconUIDs", "", "getLastBeaconUIDs$sdk_release", "(Landroid/content/Context;)[Ljava/lang/String;", "getLastBeaconUUIDs", "getLastBeaconUUIDs$sdk_release", "getLastBeacons", "Lio/radar/sdk/model/RadarBeacon;", "getLastBeacons$sdk_release", "(Landroid/content/Context;)[Lio/radar/sdk/model/RadarBeacon;", "getLastFailedStoppedLocation", "Landroid/location/Location;", "getLastFailedStoppedLocation$sdk_release", "getLastLocation", "getLastLocation$sdk_release", "getLastMotionActivity", "Lorg/json/JSONObject;", "getLastMotionActivity$sdk_release", "getLastMovedAt", "", "getLastMovedAt$sdk_release", "getLastMovedLocation", "getLastMovedLocation$sdk_release", "getLastPressure", "getLastPressure$sdk_release", "getLastSentAt", "getLastSentAt$sdk_release", "getPlaceId", "getPlaceId$sdk_release", "getRegionIds", "getRegionIds$sdk_release", "getSharedPreferences", "Landroid/content/SharedPreferences;", "getStopped", "getStopped$sdk_release", "setBeaconIds", "", "beaconIds", "", "setBeaconIds$sdk_release", "setCanExit", "canExit", "setCanExit$sdk_release", "setGeofenceIds", "geofenceIds", "setGeofenceIds$sdk_release", "setLastBeaconUIDs", "uids", "setLastBeaconUIDs$sdk_release", "(Landroid/content/Context;[Ljava/lang/String;)V", "setLastBeaconUUIDs", "uuids", "setLastBeaconUUIDs$sdk_release", "setLastBeacons", RadarTrackingOptions.KEY_BEACONS, "setLastBeacons$sdk_release", "(Landroid/content/Context;[Lio/radar/sdk/model/RadarBeacon;)V", "setLastFailedStoppedLocation", FirebaseAnalytics.Param.LOCATION, "setLastFailedStoppedLocation$sdk_release", "setLastLocation", "setLastLocation$sdk_release", "setLastMotionActivity", "motionJson", "setLastMotionActivity$sdk_release", "setLastMovedAt", "lastMovedAt", "setLastMovedAt$sdk_release", "setLastMovedLocation", "setLastMovedLocation$sdk_release", "setLastPressure", "pressureJson", "setLastPressure$sdk_release", "setPlaceId", "placeId", "setPlaceId$sdk_release", "setRegionIds", "regionIds", "setRegionIds$sdk_release", "setStopped", RadarState.KEY_STOPPED, "setStopped$sdk_release", "stringToJsonObject", "jsonString", "updateLastSentAt", "updateLastSentAt$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarState {
    public static final RadarState INSTANCE = new RadarState();
    private static final String KEY_BEACON_IDS = "beacon_ids";
    private static final String KEY_CAN_EXIT = "can_exit";
    private static final String KEY_GEOFENCE_IDS = "geofence_ids";
    private static final String KEY_LAST_BEACONS = "last_beacons";
    private static final String KEY_LAST_BEACON_UIDS = "last_beacon_uids";
    private static final String KEY_LAST_BEACON_UUIDS = "last_beacon_uuids";
    private static final String KEY_LAST_FAILED_STOPPED_LOCATION_ACCURACY = "last_failed_stopped_location_accuracy";
    private static final String KEY_LAST_FAILED_STOPPED_LOCATION_LATITUDE = "last_failed_stopped_location_latitude";
    private static final String KEY_LAST_FAILED_STOPPED_LOCATION_LONGITUDE = "last_failed_stopped_location_longitude";
    private static final String KEY_LAST_FAILED_STOPPED_LOCATION_PROVIDER = "last_failed_stopped_location_provider";
    private static final String KEY_LAST_FAILED_STOPPED_LOCATION_TIME = "last_failed_stopped_location_time";
    private static final String KEY_LAST_LOCATION_ACCURACY = "last_location_accuracy";
    private static final String KEY_LAST_LOCATION_LATITUDE = "last_location_latitude";
    private static final String KEY_LAST_LOCATION_LONGITUDE = "last_location_longitude";
    private static final String KEY_LAST_LOCATION_PROVIDER = "last_location_provider";
    private static final String KEY_LAST_LOCATION_TIME = "last_location_time";
    private static final String KEY_LAST_MOTION_ACTIVITY = "last_motion_activity";
    private static final String KEY_LAST_MOVED_AT = "last_moved_at";
    private static final String KEY_LAST_MOVED_LOCATION_ACCURACY = "last_moved_location_accuracy";
    private static final String KEY_LAST_MOVED_LOCATION_LATITUDE = "last_moved_location_latitude";
    private static final String KEY_LAST_MOVED_LOCATION_LONGITUDE = "last_moved_location_longitude";
    private static final String KEY_LAST_MOVED_LOCATION_PROVIDER = "last_moved_location_provider";
    private static final String KEY_LAST_MOVED_LOCATION_TIME = "last_moved_location_time";
    private static final String KEY_LAST_PRESSURE = "last_pressure";
    private static final String KEY_LAST_SENT_AT = "last_sent_at";
    private static final String KEY_PLACE_ID = "place_id";
    private static final String KEY_REGION_IDS = "region_ids";
    private static final String KEY_STARTED = "has_started";
    private static final String KEY_STOPPED = "stopped";

    private RadarState() {
    }

    private final SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RadarSDK", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final Location getLastLocation$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f = getSharedPreferences(context).getFloat(KEY_LAST_LOCATION_LATITUDE, 0.0f);
        float f2 = getSharedPreferences(context).getFloat(KEY_LAST_LOCATION_LONGITUDE, 0.0f);
        float f3 = getSharedPreferences(context).getFloat(KEY_LAST_LOCATION_ACCURACY, 0.0f);
        String string = getSharedPreferences(context).getString(KEY_LAST_LOCATION_PROVIDER, "RadarSDK");
        long j = getSharedPreferences(context).getLong(KEY_LAST_LOCATION_TIME, 0L);
        Location location = new Location(string);
        location.setLatitude(f);
        location.setLongitude(f2);
        location.setAccuracy(f3);
        location.setTime(j);
        if (RadarUtils.INSTANCE.valid$sdk_release(location)) {
            return location;
        }
        return null;
    }

    public final void setLastLocation$sdk_release(Context context, Location location) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (location == null || !RadarUtils.INSTANCE.valid$sdk_release(location)) {
            SharedPreferences.Editor editor = getSharedPreferences(context).edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.remove(KEY_LAST_LOCATION_LATITUDE);
            editor.remove(KEY_LAST_LOCATION_LONGITUDE);
            editor.remove(KEY_LAST_LOCATION_ACCURACY);
            editor.remove(KEY_LAST_LOCATION_PROVIDER);
            editor.remove(KEY_LAST_LOCATION_TIME);
            editor.apply();
            return;
        }
        SharedPreferences.Editor editor2 = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor2, "editor");
        editor2.putFloat(KEY_LAST_LOCATION_LATITUDE, (float) location.getLatitude());
        editor2.putFloat(KEY_LAST_LOCATION_LONGITUDE, (float) location.getLongitude());
        editor2.putFloat(KEY_LAST_LOCATION_ACCURACY, location.getAccuracy());
        editor2.putString(KEY_LAST_LOCATION_PROVIDER, location.getProvider());
        editor2.putLong(KEY_LAST_LOCATION_TIME, location.getTime());
        editor2.apply();
    }

    public final Location getLastMovedLocation$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f = getSharedPreferences(context).getFloat(KEY_LAST_MOVED_LOCATION_LATITUDE, 0.0f);
        float f2 = getSharedPreferences(context).getFloat(KEY_LAST_MOVED_LOCATION_LONGITUDE, 0.0f);
        float f3 = getSharedPreferences(context).getFloat(KEY_LAST_MOVED_LOCATION_ACCURACY, 0.0f);
        String string = getSharedPreferences(context).getString(KEY_LAST_MOVED_LOCATION_PROVIDER, "RadarSDK");
        long j = getSharedPreferences(context).getLong(KEY_LAST_MOVED_LOCATION_TIME, 0L);
        Location location = new Location(string);
        location.setLatitude(f);
        location.setLongitude(f2);
        location.setAccuracy(f3);
        location.setTime(j);
        if (RadarUtils.INSTANCE.valid$sdk_release(location)) {
            return location;
        }
        return null;
    }

    public final void setLastMovedLocation$sdk_release(Context context, Location location) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (location == null || !RadarUtils.INSTANCE.valid$sdk_release(location)) {
            return;
        }
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putFloat(KEY_LAST_MOVED_LOCATION_LATITUDE, (float) location.getLatitude());
        editor.putFloat(KEY_LAST_MOVED_LOCATION_LONGITUDE, (float) location.getLongitude());
        editor.putFloat(KEY_LAST_MOVED_LOCATION_ACCURACY, location.getAccuracy());
        editor.putString(KEY_LAST_MOVED_LOCATION_PROVIDER, location.getProvider());
        editor.putLong(KEY_LAST_MOVED_LOCATION_TIME, location.getTime());
        editor.apply();
    }

    public final long getLastMovedAt$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getLong(KEY_LAST_MOVED_AT, 0L);
    }

    public final void setLastMovedAt$sdk_release(Context context, long lastMovedAt) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong(KEY_LAST_MOVED_AT, lastMovedAt);
        editor.apply();
    }

    public final boolean getStopped$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getBoolean(KEY_STOPPED, false);
    }

    public final void setStopped$sdk_release(Context context, boolean stopped) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_STOPPED, stopped);
        editor.apply();
    }

    public final void updateLastSentAt$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong(KEY_LAST_SENT_AT, System.currentTimeMillis());
        editor.apply();
    }

    public final long getLastSentAt$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getLong(KEY_LAST_SENT_AT, 0L);
    }

    public final boolean getCanExit$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getBoolean(KEY_CAN_EXIT, true);
    }

    public final void setCanExit$sdk_release(Context context, boolean canExit) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean(KEY_CAN_EXIT, canExit);
        editor.apply();
    }

    public final Location getLastFailedStoppedLocation$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f = getSharedPreferences(context).getFloat(KEY_LAST_FAILED_STOPPED_LOCATION_LATITUDE, 0.0f);
        float f2 = getSharedPreferences(context).getFloat(KEY_LAST_FAILED_STOPPED_LOCATION_LONGITUDE, 0.0f);
        float f3 = getSharedPreferences(context).getFloat(KEY_LAST_FAILED_STOPPED_LOCATION_ACCURACY, 0.0f);
        String string = getSharedPreferences(context).getString(KEY_LAST_FAILED_STOPPED_LOCATION_PROVIDER, "RadarSDK");
        long j = getSharedPreferences(context).getLong(KEY_LAST_FAILED_STOPPED_LOCATION_TIME, 0L);
        Location location = new Location(string);
        location.setLatitude(f);
        location.setLongitude(f2);
        location.setAccuracy(f3);
        location.setTime(j);
        if (RadarUtils.INSTANCE.valid$sdk_release(location)) {
            return location;
        }
        return null;
    }

    public final void setLastFailedStoppedLocation$sdk_release(Context context, Location location) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (location == null || !RadarUtils.INSTANCE.valid$sdk_release(location)) {
            SharedPreferences.Editor editor = getSharedPreferences(context).edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.remove(KEY_LAST_FAILED_STOPPED_LOCATION_LATITUDE);
            editor.remove(KEY_LAST_FAILED_STOPPED_LOCATION_LONGITUDE);
            editor.remove(KEY_LAST_FAILED_STOPPED_LOCATION_ACCURACY);
            editor.remove(KEY_LAST_FAILED_STOPPED_LOCATION_PROVIDER);
            editor.remove(KEY_LAST_FAILED_STOPPED_LOCATION_TIME);
            editor.apply();
            return;
        }
        SharedPreferences.Editor editor2 = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor2, "editor");
        editor2.putFloat(KEY_LAST_FAILED_STOPPED_LOCATION_LATITUDE, (float) location.getLatitude());
        editor2.putFloat(KEY_LAST_FAILED_STOPPED_LOCATION_LONGITUDE, (float) location.getLongitude());
        editor2.putFloat(KEY_LAST_FAILED_STOPPED_LOCATION_ACCURACY, location.getAccuracy());
        editor2.putString(KEY_LAST_FAILED_STOPPED_LOCATION_PROVIDER, location.getProvider());
        editor2.putLong(KEY_LAST_FAILED_STOPPED_LOCATION_TIME, location.getTime());
        editor2.apply();
    }

    public final Set<String> getGeofenceIds$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getStringSet(KEY_GEOFENCE_IDS, null);
    }

    public final void setGeofenceIds$sdk_release(Context context, Set<String> geofenceIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet(KEY_GEOFENCE_IDS, geofenceIds);
        editor.apply();
    }

    public final String getPlaceId$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getString(KEY_PLACE_ID, null);
    }

    public final void setPlaceId$sdk_release(Context context, String placeId) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_PLACE_ID, placeId);
        editor.apply();
    }

    public final Set<String> getRegionIds$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getStringSet(KEY_REGION_IDS, null);
    }

    public final void setRegionIds$sdk_release(Context context, Set<String> regionIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet(KEY_REGION_IDS, regionIds);
        editor.apply();
    }

    public final Set<String> getBeaconIds$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSharedPreferences(context).getStringSet(KEY_BEACON_IDS, null);
    }

    public final void setBeaconIds$sdk_release(Context context, Set<String> beaconIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet(KEY_BEACON_IDS, beaconIds);
        editor.apply();
    }

    public final RadarBeacon[] getLastBeacons$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RadarBeaconUtils.INSTANCE.beaconsForStringSet(getSharedPreferences(context).getStringSet(KEY_LAST_BEACONS, null));
    }

    public final void setLastBeacons$sdk_release(Context context, RadarBeacon[] beacons) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> stringSetForBeacons = RadarBeaconUtils.INSTANCE.stringSetForBeacons(beacons);
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet(KEY_LAST_BEACONS, stringSetForBeacons);
        editor.apply();
    }

    public final String[] getLastBeaconUUIDs$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> stringSet = getSharedPreferences(context).getStringSet(KEY_LAST_BEACON_UUIDS, null);
        if (stringSet != null) {
            return (String[]) stringSet.toArray(new String[0]);
        }
        return null;
    }

    public final void setLastBeaconUUIDs$sdk_release(Context context, String[] uuids) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet(KEY_LAST_BEACON_UUIDS, uuids != null ? ArraysKt.toSet(uuids) : null);
        editor.apply();
    }

    public final String[] getLastBeaconUIDs$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> stringSet = getSharedPreferences(context).getStringSet(KEY_LAST_BEACON_UIDS, null);
        if (stringSet != null) {
            return (String[]) stringSet.toArray(new String[0]);
        }
        return null;
    }

    public final void setLastBeaconUIDs$sdk_release(Context context, String[] uids) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet(KEY_LAST_BEACON_UIDS, uids != null ? ArraysKt.toSet(uids) : null);
        editor.apply();
    }

    private final JSONObject stringToJsonObject(String jsonString) {
        if (jsonString == null) {
            return null;
        }
        try {
            return new JSONObject(jsonString);
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONObject getLastMotionActivity$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return stringToJsonObject(getSharedPreferences(context).getString(KEY_LAST_MOTION_ACTIVITY, null));
    }

    public final void setLastMotionActivity$sdk_release(Context context, JSONObject motionJson) {
        Intrinsics.checkNotNullParameter(context, "context");
        String jSONObject = motionJson != null ? motionJson.toString() : null;
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_LAST_MOTION_ACTIVITY, jSONObject);
        editor.apply();
    }

    public final JSONObject getLastPressure$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return stringToJsonObject(getSharedPreferences(context).getString(KEY_LAST_PRESSURE, null));
    }

    public final void setLastPressure$sdk_release(Context context, JSONObject pressureJson) {
        Intrinsics.checkNotNullParameter(context, "context");
        String jSONObject = pressureJson != null ? pressureJson.toString() : null;
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_LAST_PRESSURE, jSONObject);
        editor.apply();
    }
}

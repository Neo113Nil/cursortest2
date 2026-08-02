package io.radar.sdk;

import Gh.C1165b;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f49714a = new M0();

    public final void A(Context context, Location location) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (location == null || !R0.f49781a.p(location)) {
            return;
        }
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putFloat("last_moved_location_latitude", (float) location.getLatitude());
        editor.putFloat("last_moved_location_longitude", (float) location.getLongitude());
        editor.putFloat("last_moved_location_accuracy", location.getAccuracy());
        editor.putString("last_moved_location_provider", location.getProvider());
        editor.putLong("last_moved_location_time", location.getTime());
        editor.apply();
    }

    public final void B(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("place_id", str);
        editor.apply();
    }

    public final void C(Context context, Set set) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet("region_ids", set);
        editor.apply();
    }

    public final void D(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean("stopped", z10);
        editor.apply();
    }

    public final JSONObject E(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void F(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong("last_sent_at", System.currentTimeMillis());
        editor.apply();
    }

    public final Set a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o(context).getStringSet("beacon_ids", null);
    }

    public final boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o(context).getBoolean("can_exit", true);
    }

    public final Set c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o(context).getStringSet("geofence_ids", null);
    }

    public final String[] d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> stringSet = o(context).getStringSet("last_beacon_uids", null);
        if (stringSet == null) {
            return null;
        }
        Object[] array = stringSet.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final String[] e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> stringSet = o(context).getStringSet("last_beacon_uuids", null);
        if (stringSet == null) {
            return null;
        }
        Object[] array = stringSet.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final C1165b[] f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C4631k0.f50118a.c(o(context).getStringSet("last_beacons", null));
    }

    public final Location g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f10 = o(context).getFloat("last_failed_stopped_location_latitude", 0.0f);
        float f11 = o(context).getFloat("last_failed_stopped_location_longitude", 0.0f);
        float f12 = o(context).getFloat("last_failed_stopped_location_accuracy", 0.0f);
        String string = o(context).getString("last_failed_stopped_location_provider", "RadarSDK");
        long j10 = o(context).getLong("last_failed_stopped_location_time", 0L);
        Location location = new Location(string);
        location.setLatitude(f10);
        location.setLongitude(f11);
        location.setAccuracy(f12);
        location.setTime(j10);
        if (R0.f49781a.p(location)) {
            return location;
        }
        return null;
    }

    public final Location h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f10 = o(context).getFloat("last_location_latitude", 0.0f);
        float f11 = o(context).getFloat("last_location_longitude", 0.0f);
        float f12 = o(context).getFloat("last_location_accuracy", 0.0f);
        String string = o(context).getString("last_location_provider", "RadarSDK");
        long j10 = o(context).getLong("last_location_time", 0L);
        Location location = new Location(string);
        location.setLatitude(f10);
        location.setLongitude(f11);
        location.setAccuracy(f12);
        location.setTime(j10);
        if (R0.f49781a.p(location)) {
            return location;
        }
        return null;
    }

    public final JSONObject i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return E(o(context).getString("last_motion_activity", null));
    }

    public final long j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o(context).getLong("last_moved_at", 0L);
    }

    public final Location k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f10 = o(context).getFloat("last_moved_location_latitude", 0.0f);
        float f11 = o(context).getFloat("last_moved_location_longitude", 0.0f);
        float f12 = o(context).getFloat("last_moved_location_accuracy", 0.0f);
        String string = o(context).getString("last_moved_location_provider", "RadarSDK");
        long j10 = o(context).getLong("last_moved_location_time", 0L);
        Location location = new Location(string);
        location.setLatitude(f10);
        location.setLongitude(f11);
        location.setAccuracy(f12);
        location.setTime(j10);
        if (R0.f49781a.p(location)) {
            return location;
        }
        return null;
    }

    public final long l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o(context).getLong("last_sent_at", 0L);
    }

    public final String m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o(context).getString("place_id", null);
    }

    public final Set n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o(context).getStringSet("region_ids", null);
    }

    public final SharedPreferences o(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RadarSDK", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…K\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final boolean p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o(context).getBoolean("stopped", false);
    }

    public final void q(Context context, Set set) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet("beacon_ids", set);
        editor.apply();
    }

    public final void r(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean("can_exit", z10);
        editor.apply();
    }

    public final void s(Context context, Set set) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet("geofence_ids", set);
        editor.apply();
    }

    public final void t(Context context, String[] strArr) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet("last_beacon_uids", strArr != null ? ArraysKt.toSet(strArr) : null);
        editor.apply();
    }

    public final void u(Context context, String[] strArr) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet("last_beacon_uuids", strArr != null ? ArraysKt.toSet(strArr) : null);
        editor.apply();
    }

    public final void v(Context context, C1165b[] c1165bArr) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set i10 = C4631k0.f50118a.i(c1165bArr);
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putStringSet("last_beacons", i10);
        editor.apply();
    }

    public final void w(Context context, Location location) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (location == null || !R0.f49781a.p(location)) {
            SharedPreferences.Editor editor = o(context).edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.remove("last_failed_stopped_location_latitude");
            editor.remove("last_failed_stopped_location_longitude");
            editor.remove("last_failed_stopped_location_accuracy");
            editor.remove("last_failed_stopped_location_provider");
            editor.remove("last_failed_stopped_location_time");
            editor.apply();
            return;
        }
        SharedPreferences.Editor editor2 = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor2, "editor");
        editor2.putFloat("last_failed_stopped_location_latitude", (float) location.getLatitude());
        editor2.putFloat("last_failed_stopped_location_longitude", (float) location.getLongitude());
        editor2.putFloat("last_failed_stopped_location_accuracy", location.getAccuracy());
        editor2.putString("last_failed_stopped_location_provider", location.getProvider());
        editor2.putLong("last_failed_stopped_location_time", location.getTime());
        editor2.apply();
    }

    public final void x(Context context, Location location) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (location == null || !R0.f49781a.p(location)) {
            SharedPreferences.Editor editor = o(context).edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.remove("last_location_latitude");
            editor.remove("last_location_longitude");
            editor.remove("last_location_accuracy");
            editor.remove("last_location_provider");
            editor.remove("last_location_time");
            editor.apply();
            return;
        }
        SharedPreferences.Editor editor2 = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor2, "editor");
        editor2.putFloat("last_location_latitude", (float) location.getLatitude());
        editor2.putFloat("last_location_longitude", (float) location.getLongitude());
        editor2.putFloat("last_location_accuracy", location.getAccuracy());
        editor2.putString("last_location_provider", location.getProvider());
        editor2.putLong("last_location_time", location.getTime());
        editor2.apply();
    }

    public final void y(Context context, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("last_motion_activity", jSONObject2);
        editor.apply();
    }

    public final void z(Context context, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = o(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong("last_moved_at", j10);
        editor.apply();
    }
}

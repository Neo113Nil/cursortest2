package io.radar.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import io.radar.sdk.C4589c;
import io.radar.sdk.N0;
import java.text.DecimalFormat;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f49705a = new L0();

    public final boolean A(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getBoolean("user_debug", false);
    }

    public final String B(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getString("user_id", null);
    }

    public final String C(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = u(context).getString("verified_host", null);
        return string == null ? "https://api-verified.radar.io" : string;
    }

    public final String D(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getString("x_platform_sdk_type", null);
    }

    public final String E(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getString("x_platform_sdk_version", null);
    }

    public final boolean F(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).contains("x_platform_sdk_type") && u(context).contains("x_platform_sdk_version");
    }

    public final void G(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove("previous_tracking_options");
        editor.apply();
    }

    public final void H(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove("remote_tracking_options");
        editor.apply();
    }

    public final void I(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean("anonymous", z10);
        editor.apply();
    }

    public final void J(Context context, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("client_sdk_configuration", jSONObject2);
        editor.apply();
    }

    public final void K(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("user_description", str);
        editor.apply();
    }

    public final void L(Context context, N0.c foregroundService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(foregroundService, "foregroundService");
        N0.c d10 = d(context);
        if (foregroundService.f() == null) {
            foregroundService.m(d10.f());
        }
        if (foregroundService.e() == null) {
            foregroundService.l(d10.e());
        }
        String jSONObject = foregroundService.n().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "foregroundService.toJson().toString()");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("foreground_service", jSONObject);
        editor.apply();
    }

    public final void M(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("radar_user_id", str);
        editor.apply();
    }

    public final void N(Context context, C4589c.EnumC4596h provider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(provider, "provider");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("provider", provider.name());
        editor.apply();
    }

    public final void O(Context context, C4589c.EnumC4599k level) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(level, "level");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putInt("log_level", level.b());
        editor.apply();
    }

    public final void P(Context context, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(context, "context");
        String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("user_metadata", jSONObject2);
        editor.apply();
    }

    public final void Q(Context context, I0 notificationOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationOptions, "notificationOptions");
        String jSONObject = notificationOptions.f().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "notificationOptions.toJson().toString()");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("notification_options", jSONObject);
        editor.apply();
        N0.c d10 = d(context);
        String i10 = d10.i();
        String j10 = d10.j();
        Integer d11 = d10.d();
        boolean k10 = d10.k();
        String b10 = d10.b();
        Integer h10 = d10.h();
        Integer g10 = d10.g();
        String c10 = d10.c();
        String e10 = notificationOptions.e();
        if (e10 == null) {
            e10 = d10.f();
        }
        String d12 = notificationOptions.d();
        if (d12 == null) {
            d12 = d10.e();
        }
        L(context, new N0.c(i10, j10, d11, k10, b10, h10, g10, c10, e10, d12));
    }

    public final void R(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean("permissions_denied", z10);
        editor.apply();
    }

    public final void S(Context context, N0 options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        String jSONObject = options.z().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "optionsObj.toString()");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("previous_tracking_options", jSONObject);
        editor.apply();
    }

    public final void T(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("product", str);
        editor.apply();
    }

    public final void U(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("publishable_key", str);
        editor.apply();
    }

    public final void V(Context context, N0 options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        String jSONObject = options.z().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "options.toJson().toString()");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("remote_tracking_options", jSONObject);
        editor.apply();
    }

    public final void W(Context context, Gh.y yVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4589c c4589c = C4589c.f49918a;
        G0.b(c4589c.y(), "Setting SDK configuration | sdkConfiguration = " + yVar, null, null, 6, null);
        if (yVar == null) {
            SharedPreferences.Editor editor = u(context).edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.remove("sdk_configuration");
            editor.apply();
            return;
        }
        c4589c.F0(yVar.j());
        O(context, yVar.c());
        String jSONObject = yVar.n().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "configuration.toJson().toString()");
        SharedPreferences.Editor editor2 = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor2, "editor");
        editor2.putString("sdk_configuration", jSONObject);
        editor2.apply();
    }

    public final void X(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean("sharing", z10);
        editor.apply();
    }

    public final void Y(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean("background_tracking", z10);
        editor.apply();
    }

    public final void Z(Context context, N0 options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        String jSONObject = options.z().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "optionsObj.toString()");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("tracking_options", jSONObject);
        editor.apply();
    }

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getBoolean("anonymous", false);
    }

    public final void a0(Context context, O0 o02) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject j10 = o02 != null ? o02.j() : null;
        String jSONObject = j10 != null ? j10.toString() : null;
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("trip_options", jSONObject);
        editor.apply();
    }

    public final JSONObject b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = u(context).getString("client_sdk_configuration", null);
        return string != null ? new JSONObject(string) : new JSONObject();
    }

    public final void b0(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putBoolean("user_debug", z10);
        editor.apply();
    }

    public final String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getString("user_description", null);
    }

    public final void c0(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("user_id", str);
        editor.apply();
    }

    public final N0.c d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        N0.c cVar = null;
        String string = u(context).getString("foreground_service", null);
        if (string != null) {
            cVar = N0.c.f49745k.a(new JSONObject(string));
        }
        if (cVar != null) {
            return cVar;
        }
        return new N0.c(null, null, null, false, null, null, null, null, null, null, 1023, null);
    }

    public final void d0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong("last_app_open_time", currentTimeMillis);
        editor.apply();
    }

    public final String e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = u(context).getString("host", null);
        return string == null ? "https://api.radar.io" : string;
    }

    public final void e0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong("last_tracked_time", currentTimeMillis);
        editor.apply();
    }

    public final String f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getString("radar_user_id", null);
    }

    public final boolean f0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j10 = u(context).getLong("session_id", 0L);
        if (s(context).a()) {
            G0.b(C4589c.f49918a.y(), "Flushing replays from updateSessionId()", null, null, 6, null);
            C4589c.j(null, null, 3, null);
        }
        if (currentTimeMillis - j10 <= 300) {
            return false;
        }
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong("session_id", currentTimeMillis);
        editor.apply();
        C4589c c4589c = C4589c.f49918a;
        c4589c.Z();
        G0.b(c4589c.y(), "New session | sessionId = " + t(context), null, null, 6, null);
        X(context, false);
        return true;
    }

    public final String g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = u(context).getString("install_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor editor = u(context).edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putString("install_id", uuid);
        editor.apply();
        return uuid;
    }

    public final long h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getLong("last_app_open_time", 0L);
    }

    public final long i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getLong("last_tracked_time", 0L);
    }

    public final String j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getString("provider", null);
    }

    public final C4589c.EnumC4599k k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C4589c.EnumC4599k.f50032b.a(u(context).getInt("log_level", A(context) ? C4589c.EnumC4599k.DEBUG.b() : C4589c.EnumC4599k.NONE.b()));
    }

    public final JSONObject l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = u(context).getString("user_metadata", null);
        if (string == null) {
            return null;
        }
        return new JSONObject(string);
    }

    public final I0 m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = u(context).getString("notification_options", null);
        if (string == null) {
            return null;
        }
        return I0.f49679g.a(new JSONObject(string));
    }

    public final boolean n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getBoolean("permissions_denied", false);
    }

    public final N0 o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (u(context).contains("previous_tracking_options")) {
            return y(context, "previous_tracking_options");
        }
        return null;
    }

    public final String p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getString("product", null);
    }

    public final String q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getString("publishable_key", null);
    }

    public final N0 r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (u(context).contains("remote_tracking_options")) {
            return y(context, "remote_tracking_options");
        }
        return null;
    }

    public final Gh.y s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = u(context).getString("sdk_configuration", null);
        return Gh.y.f4201n.a(string != null ? new JSONObject(string) : null);
    }

    public final String t(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String format = new DecimalFormat("#").format(u(context).getLong("session_id", 0L));
        Intrinsics.checkNotNullExpressionValue(format, "DecimalFormat(\"#\").forma…tLong(KEY_SESSION_ID, 0))");
        return format;
    }

    public final SharedPreferences u(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RadarSDK", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…K\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final boolean v(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getBoolean("sharing", false);
    }

    public final boolean w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return u(context).getBoolean("background_tracking", false);
    }

    public final N0 x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return y(context, "tracking_options");
    }

    public final N0 y(Context context, String str) {
        String string = u(context).getString(str, null);
        if (string != null) {
            return N0.f49715u.a(new JSONObject(string));
        }
        int i10 = u(context).getInt("dwell_delay", 0);
        if (i10 <= 0) {
            return N0.f49718x;
        }
        N0 n02 = i10 == 60000 ? N0.f49717w : N0.f49718x;
        if (u(context).getInt("sync_mode", 0) == -1) {
            n02.y(N0.e.ALL);
        }
        if (u(context).getInt("offline_mode", 0) == -1) {
            n02.v(N0.d.NONE);
        }
        return n02;
    }

    public final O0 z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = u(context).getString("trip_options", null);
        if (string == null) {
            return null;
        }
        return O0.f49766i.a(new JSONObject(string));
    }
}

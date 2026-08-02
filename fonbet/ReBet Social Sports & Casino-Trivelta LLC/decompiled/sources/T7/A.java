package T7;

import T7.A;
import T7.C1675o;
import T7.C1682w;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC2177b;
import com.facebook.GraphRequest;
import com.twilio.voice.EventKeys;
import g6.C4331C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f10965a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final String f10966b = A.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    public static final List f10967c = CollectionsKt.listOf((Object[]) new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled"});

    /* renamed from: d, reason: collision with root package name */
    public static final Map f10968d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f10969e = new AtomicReference(a.NOT_LOADED);

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f10970f = new ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f10971g;

    /* renamed from: h, reason: collision with root package name */
    public static JSONArray f10972h;

    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public interface b {
        void a(C1682w c1682w);

        void onError();
    }

    public static final void d(b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        f10970f.add(callback);
        h();
    }

    public static final C1682w f(String str) {
        if (str != null) {
            return (C1682w) f10968d.get(str);
        }
        return null;
    }

    public static final Map g() {
        JSONObject jSONObject;
        Context l10 = C4331C.l();
        String m10 = C4331C.m();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m10}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        String string = l10.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(format, null);
        if (!Y.d0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                Y.j0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return f10965a.l(jSONObject);
            }
        }
        return null;
    }

    public static final void h() {
        final Context l10 = C4331C.l();
        final String m10 = C4331C.m();
        if (Y.d0(m10)) {
            f10969e.set(a.ERROR);
            f10965a.n();
            return;
        }
        if (f10968d.containsKey(m10)) {
            f10969e.set(a.SUCCESS);
            f10965a.n();
            return;
        }
        AtomicReference atomicReference = f10969e;
        a aVar = a.NOT_LOADED;
        a aVar2 = a.LOADING;
        if (!AbstractC2177b.a(atomicReference, aVar, aVar2) && !AbstractC2177b.a(atomicReference, a.ERROR, aVar2)) {
            f10965a.n();
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m10}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        C4331C.t().execute(new Runnable() { // from class: T7.x
            @Override // java.lang.Runnable
            public final void run() {
                A.i(l10, format, m10);
            }
        });
    }

    public static final void i(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        C1682w c1682w = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!Y.d0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                Y.j0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                c1682w = f10965a.j(applicationId, jSONObject);
            }
        }
        A a10 = f10965a;
        JSONObject e11 = a10.e(applicationId);
        if (e11 != null) {
            a10.j(applicationId, e11);
            sharedPreferences.edit().putString(settingsKey, e11.toString()).apply();
        }
        if (c1682w != null) {
            String m10 = c1682w.m();
            if (!f10971g && m10 != null && m10.length() > 0) {
                f10971g = true;
                Log.w(f10966b, m10);
            }
        }
        C1681v.m(applicationId, true);
        p6.i.d();
        f10969e.set(f10968d.containsKey(applicationId) ? a.SUCCESS : a.ERROR);
        a10.n();
    }

    public static final void o(b bVar) {
        bVar.onError();
    }

    public static final void p(b bVar, C1682w c1682w) {
        bVar.a(c1682w);
    }

    public static final C1682w q(String applicationId, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z10) {
            Map map = f10968d;
            if (map.containsKey(applicationId)) {
                return (C1682w) map.get(applicationId);
            }
        }
        A a10 = f10965a;
        JSONObject e10 = a10.e(applicationId);
        if (e10 == null) {
            return null;
        }
        C1682w j10 = a10.j(applicationId, e10);
        if (Intrinsics.areEqual(applicationId, C4331C.m())) {
            f10969e.set(a.SUCCESS);
            a10.n();
        }
        return j10;
    }

    public final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f10967c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest x10 = GraphRequest.f30314n.x(null, "app", null);
        x10.F(true);
        x10.J(bundle);
        JSONObject d10 = x10.k().d();
        return d10 == null ? new JSONObject() : d10;
    }

    public final C1682w j(String applicationId, JSONObject settingsJSON) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        JSONArray optJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        C1675o.a aVar = C1675o.f11150g;
        C1675o a10 = aVar.a(optJSONArray);
        if (a10 == null) {
            a10 = aVar.b();
        }
        C1675o c1675o = a10;
        int optInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z10 = (optInt & 8) != 0;
        boolean z11 = (optInt & 16) != 0;
        boolean z12 = (optInt & 32) != 0;
        boolean z13 = (optInt & 256) != 0;
        boolean z14 = (optInt & 16384) != 0;
        JSONArray optJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        f10972h = optJSONArray2;
        if (optJSONArray2 != null && G.b()) {
            l6.e eVar = l6.e.f55641a;
            l6.e.c(optJSONArray2 == null ? null : optJSONArray2.toString());
        }
        boolean optBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String optString = settingsJSON.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = settingsJSON.optInt("app_events_session_timeout", p6.j.a());
        EnumSet a11 = Q.f11034b.a(settingsJSON.optLong("seamless_login"));
        Map k10 = k(settingsJSON.optJSONObject("android_dialog_configs"));
        String optString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = settingsJSON.optString("smart_login_menu_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = settingsJSON.optString("sdk_update_message");
        Intrinsics.checkNotNullExpressionValue(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        C1682w c1682w = new C1682w(optBoolean, optString, optBoolean2, optInt2, a11, k10, z10, c1675o, optString2, optString3, z11, z12, optJSONArray2, optString4, z13, z14, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"), m(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params"), m(settingsJSON.optJSONObject("protected_mode_rules"), "maca_rules"), l(settingsJSON));
        f10968d.put(applicationId, c1682w);
        return c1682w;
    }

    public final Map k(JSONObject jSONObject) {
        JSONArray optJSONArray;
        int length;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(EventKeys.DATA)) != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                C1682w.b.a aVar = C1682w.b.f11237d;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "dialogConfigData.optJSONObject(i)");
                C1682w.b a10 = aVar.a(optJSONObject);
                if (a10 != null) {
                    String a11 = a10.a();
                    Map map = (Map) hashMap.get(a11);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a11, map);
                    }
                    map.put(a10.b(), a10);
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    public final Map l(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e10) {
                Y.j0("FacebookSDK", e10);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e11) {
                Y.j0("FacebookSDK", e11);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public final JSONArray m(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public final synchronized void n() {
        a aVar = (a) f10969e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            final C1682w c1682w = (C1682w) f10968d.get(C4331C.m());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f10970f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final b bVar = (b) concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: T7.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            A.o(A.b.this);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f10970f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final b bVar2 = (b) concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: T7.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            A.p(A.b.this, c1682w);
                        }
                    });
                }
            }
        }
    }
}

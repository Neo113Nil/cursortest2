package com.facebook.internal;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.lnb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x {
    public static final x a = new x();
    public static final List b = kotlin.collections.b.j("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", lnb.q(new StringBuilder("app_events_config.os_version("), Build.VERSION.RELEASE, ')'));
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final AtomicReference d = new AtomicReference(w.a);
    public static final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    public static volatile boolean f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b);
        bundle.putString("fields", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, arrayList));
        String str = com.facebook.d0.j;
        com.facebook.d0 B = com.moloco.sdk.internal.publisher.h0.B(null, "app", null);
        B.i = true;
        B.d = bundle;
        JSONObject jSONObject = B.c().d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final u b(String str) {
        return (u) c.get(str);
    }

    public static final HashMap c() {
        JSONObject jSONObject;
        String string = com.facebook.w.a().getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{com.facebook.w.b()}, 1)), null);
        if (!k0.A(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    com.facebook.w wVar = com.facebook.w.a;
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return h(jSONObject);
                }
            } else {
                a70.r("Required value was null.");
            }
        }
        return null;
    }

    public static final void d() {
        Context a2 = com.facebook.w.a();
        String b2 = com.facebook.w.b();
        boolean A = k0.A(b2);
        w wVar = w.d;
        x xVar = a;
        AtomicReference atomicReference = d;
        if (A) {
            atomicReference.set(wVar);
            xVar.j();
            return;
        }
        if (c.containsKey(b2)) {
            atomicReference.set(w.c);
            xVar.j();
            return;
        }
        while (true) {
            w wVar2 = w.a;
            w wVar3 = w.b;
            if (atomicReference.compareAndSet(wVar2, wVar3)) {
                break;
            }
            if (atomicReference.get() != wVar2) {
                while (!atomicReference.compareAndSet(wVar, wVar3)) {
                    if (atomicReference.get() != wVar) {
                        xVar.j();
                        return;
                    }
                }
            }
        }
        com.facebook.w.c().execute(new r(a2, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{b2}, 1)), b2));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static com.facebook.internal.u e(java.lang.String r36, org.json.JSONObject r37) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.x.e(java.lang.String, org.json.JSONObject):com.facebook.internal.u");
    }

    public static ArrayList f(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (Intrinsics.c(jSONObject2.getString(U3.i.W), "prod_keys")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray(U3.i.X);
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (Intrinsics.c(jSONObject3.getString(U3.i.W), str)) {
                            JSONArray jSONArray3 = jSONObject3.getJSONArray(U3.i.X);
                            ArrayList arrayList = new ArrayList();
                            int length3 = jSONArray3.length();
                            for (int i3 = 0; i3 < length3; i3++) {
                                arrayList.add(jSONArray3.getJSONObject(i3).getString(U3.i.X));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(arrayList);
                            return arrayList2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList g(JSONObject jSONObject, boolean z) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(U3.i.W);
            if ((!Intrinsics.c(string, "prod_keys") || !z) && (!Intrinsics.c(string, "test_keys") || z)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray(U3.i.X);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject3.getString(U3.i.W);
                    if (!Intrinsics.c(string2, "_valueToSum") && !Intrinsics.c(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray(U3.i.X);
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            try {
                                arrayList2.add(jSONArray3.getJSONObject(i3).getString(U3.i.X));
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new Pair(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    public static HashMap h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException unused) {
                com.facebook.w wVar = com.facebook.w.a;
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException unused2) {
                com.facebook.w wVar2 = com.facebook.w.a;
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static JSONArray i(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final u k(String str, boolean z) {
        str.getClass();
        if (!z) {
            ConcurrentHashMap concurrentHashMap = c;
            if (concurrentHashMap.containsKey(str)) {
                return (u) concurrentHashMap.get(str);
            }
        }
        u e2 = e(str, a());
        if (str.equals(com.facebook.w.b())) {
            d.set(w.c);
            a.j();
        }
        return e2;
    }

    public final synchronized void j() {
        w wVar = (w) d.get();
        if (w.a != wVar && w.b != wVar) {
            u uVar = (u) c.get(com.facebook.w.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (w.d == wVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new v((com.facebook.appevents.m) concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new v((com.facebook.appevents.m) concurrentLinkedQueue2.poll(), uVar));
                    }
                }
            }
        }
    }
}

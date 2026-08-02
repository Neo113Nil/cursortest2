package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Q9 {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static boolean d;
    public static JSONObject e;
    public static JSONObject f;

    public static final JSONObject a() {
        synchronized (b) {
            if (d) {
                Objects.toString(f);
                return f;
            }
            d = true;
            Context context = AbstractC3424fj.a;
            String str = null;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                str = Pa.a(context, "unified_id_info_store").a.getString("publisher_provided_unified_id", null);
            }
            try {
                try {
                    f = new JSONObject(str);
                } catch (JSONException e2) {
                    e2.getMessage();
                }
            } catch (NullPointerException e3) {
                e3.getMessage();
            }
            Objects.toString(f);
            return f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (a) {
            try {
                e = jSONObject;
                c = true;
                Context context = AbstractC3424fj.a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    Qa a2 = Pa.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = e;
                    if (jSONObject2 == null) {
                        a2.a("ufids");
                    } else {
                        a2.a("ufids", String.valueOf(jSONObject2), false);
                    }
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    JSONObject jSONObject3 = e;
                    if (jSONObject3 == null) {
                        edit.remove("InMobi_unifiedId");
                    } else {
                        edit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                    }
                    edit.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(JSONObject jSONObject) {
        synchronized (b) {
            try {
                Objects.toString(f);
                Objects.toString(jSONObject);
                f = jSONObject;
                d = true;
                Context context = AbstractC3424fj.a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    Qa a2 = Pa.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = f;
                    if (jSONObject2 == null) {
                        a2.a("publisher_provided_unified_id");
                    } else {
                        a2.a("publisher_provided_unified_id", String.valueOf(jSONObject2), false);
                        Unit unit = Unit.a;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final JSONObject b() {
        synchronized (a) {
            if (c) {
                return e;
            }
            c = true;
            Context context = AbstractC3424fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                String string = Pa.a(context, "unified_id_info_store").a.getString("ufids", null);
                if (string != null) {
                    try {
                        e = new JSONObject(string);
                    } catch (JSONException e2) {
                        e2.getMessage();
                    }
                    return e;
                }
            }
            return null;
        }
    }
}

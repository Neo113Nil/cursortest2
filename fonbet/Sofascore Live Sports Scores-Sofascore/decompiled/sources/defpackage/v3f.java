package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.internal.k0;
import com.facebook.w;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v3f {
    public static SharedPreferences c;
    public static final v3f a = new v3f();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static final void a(String str, String str2) {
        if (cw3.a.contains(v3f.class)) {
            return;
        }
        try {
            str2.getClass();
            if (!d.get()) {
                a.c();
            }
            LinkedHashMap linkedHashMap = b;
            linkedHashMap.put(str, str2);
            SharedPreferences sharedPreferences = c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", k0.E(tub.p(linkedHashMap))).apply();
            } else {
                Intrinsics.i("shardPreferences");
                throw null;
            }
        } catch (Throwable th) {
            cw3.a(v3f.class, th);
        }
    }

    public static final String b(View view, String str) {
        if (cw3.a.contains(v3f.class)) {
            return null;
        }
        try {
            str.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = xsk.i(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return k0.K(jSONObject.toString());
        } catch (Throwable th) {
            cw3.a(v3f.class, th);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            sharedPreferences.getClass();
            c = sharedPreferences;
            LinkedHashMap linkedHashMap = b;
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(k0.D(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}

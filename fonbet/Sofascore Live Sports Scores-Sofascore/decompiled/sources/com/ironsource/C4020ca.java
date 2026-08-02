package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.C4197m8;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ca, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4020ca {
    private static final String b = "ca";
    private static final String c = "supersonic_shared_preferen";
    private static final String d = "version";
    private static final String e = "back_button_state";
    private static final String f = "search_keys";
    private static final String g = "^\\d+_\\d+$";
    private static C4020ca h;
    private SharedPreferences a;

    private C4020ca(Context context) {
        this.a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            edit.apply();
            return true;
        } catch (JSONException e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public C4197m8.a b() {
        int parseInt = Integer.parseInt(this.a.getString(e, "2"));
        return parseInt == 0 ? C4197m8.a.None : parseInt == 1 ? C4197m8.a.Device : parseInt == 2 ? C4197m8.a.Controller : C4197m8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(e, str);
        edit.apply();
    }

    public List<String> d() {
        String string = this.a.getString(f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C4114he c4114he = new C4114he(string);
            if (c4114he.a(U3.i.R)) {
                try {
                    arrayList.addAll(c4114he.a((JSONArray) c4114he.b(U3.i.R)));
                    return arrayList;
                } catch (JSONException e2) {
                    C4157k4.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(f, str);
        edit.apply();
    }

    public static synchronized C4020ca e() {
        C4020ca c4020ca;
        synchronized (C4020ca.class) {
            c4020ca = h;
        }
        return c4020ca;
    }

    public String c() {
        return this.a.getString("version", Y1.f);
    }

    private boolean b(String str) {
        return str.matches(g);
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString("version", str);
        edit.apply();
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public String a(String str) {
        String string = this.a.getString(str, null);
        return string != null ? string : "{}";
    }

    public static synchronized C4020ca a(Context context) {
        C4020ca c4020ca;
        synchronized (C4020ca.class) {
            c4020ca = h;
            if (c4020ca == null) {
                c4020ca = new C4020ca(context);
                h = c4020ca;
            }
        }
        return c4020ca;
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor edit = this.a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                edit.remove(str);
            }
        }
        edit.apply();
        return arrayList;
    }
}

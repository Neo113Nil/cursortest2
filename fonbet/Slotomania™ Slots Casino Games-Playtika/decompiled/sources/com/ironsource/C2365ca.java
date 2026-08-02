package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C2578o8;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2365ca {
    private static final String b = "ca";
    private static final String c = "supersonic_shared_preferen";
    private static final String d = "version";
    private static final String e = "back_button_state";
    private static final String f = "search_keys";
    private static final String g = "^\\d+_\\d+$";
    private static C2365ca h;
    private SharedPreferences a;

    private C2365ca(Context context) {
        this.a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C2365ca a(Context context) {
        C2365ca c2365ca;
        synchronized (C2365ca.class) {
            if (h == null) {
                h = new C2365ca(context);
            }
            c2365ca = h;
        }
        return c2365ca;
    }

    public static synchronized C2365ca e() {
        C2365ca c2365ca;
        synchronized (C2365ca.class) {
            c2365ca = h;
        }
        return c2365ca;
    }

    public C2578o8.a b() {
        int parseInt = Integer.parseInt(this.a.getString(e, "2"));
        return parseInt == 0 ? C2578o8.a.None : parseInt == 1 ? C2578o8.a.Device : parseInt == 2 ? C2578o8.a.Controller : C2578o8.a.Controller;
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
            C2477ie c2477ie = new C2477ie(string);
            if (c2477ie.a(X3.i.R)) {
                try {
                    arrayList.addAll(c2477ie.a((JSONArray) c2477ie.b(X3.i.R)));
                    return arrayList;
                } catch (JSONException e2) {
                    C2556n4.d().a(e2);
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

    public void a(String str, String str2) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public String c() {
        return this.a.getString("version", "-1");
    }

    public String a(String str) {
        String string = this.a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    private boolean b(String str) {
        return str.matches(g);
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(string);
            if (jsonObjectInit.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject = jsonObjectInit.getJSONObject(str2);
            if (jSONObject.isNull(str3)) {
                return false;
            }
            jSONObject.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString("ssaUserData", jsonObjectInit.toString());
            edit.apply();
            return true;
        } catch (JSONException e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString("version", str);
        edit.apply();
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

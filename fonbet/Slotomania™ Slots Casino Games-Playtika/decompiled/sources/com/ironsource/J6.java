package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class J6 {
    public static final String b = "userId";
    public static final String c = "appKey";
    private static J6 d;
    private final JSONObject a = IronSourceNetworkBridge.jsonObjectInit();

    private J6() {
    }

    public static synchronized J6 a() {
        J6 j6;
        synchronized (J6.class) {
            if (d == null) {
                d = new J6();
            }
            j6 = d;
        }
        return j6;
    }

    public synchronized JSONObject b() throws JSONException {
        if (Jb.Y().h().v()) {
            return IronSourceNetworkBridge.jsonObjectInit(this.a.toString());
        }
        return this.a;
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.a.put(str, obj);
        } catch (Exception e) {
            C2556n4.d().a(e);
        }
    }

    public synchronized String a(String str) {
        return this.a.optString(str);
    }
}

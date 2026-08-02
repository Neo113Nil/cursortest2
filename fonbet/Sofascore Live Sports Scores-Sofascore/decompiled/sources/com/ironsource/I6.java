package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class I6 {
    public static final String b = "userId";
    public static final String c = "appKey";
    private static I6 d;
    private final JSONObject a = new JSONObject();

    private I6() {
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized JSONObject b() throws JSONException {
        if (Ib.a0().h().w()) {
            return new JSONObject(this.a.toString());
        }
        return this.a;
    }

    public static synchronized I6 a() {
        I6 i6;
        synchronized (I6.class) {
            i6 = d;
            if (i6 == null) {
                i6 = new I6();
                d = i6;
            }
        }
        return i6;
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.a.put(str, obj);
        } catch (Exception e) {
            C4157k4.d().a(e);
        }
    }

    public synchronized String a(String str) {
        return this.a.optString(str);
    }
}

package com.inmobi.media;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class O6 {
    public static final JSONObject a(N6 n6) {
        n6.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", Float.valueOf(N3.a(n6.a)));
        jSONObject.put("y", Float.valueOf(N3.a(n6.b)));
        jSONObject.put("width", n6.c);
        jSONObject.put("height", n6.d);
        return jSONObject;
    }
}

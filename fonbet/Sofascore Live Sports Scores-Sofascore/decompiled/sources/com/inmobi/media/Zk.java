package com.inmobi.media;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Zk {
    public final C3389ea a;

    public Zk(C3389ea c3389ea) {
        c3389ea.getClass();
        this.a = c3389ea;
    }

    public final HashMap a() {
        C3872x1 c3872x1;
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            if (this.a.a() && (c3872x1 = Yk.a) != null && (str = c3872x1.b) != null) {
                hashMap2.put("GPID", str);
            }
        } catch (Exception unused) {
        }
        String jSONObject = new JSONObject(hashMap2).toString();
        jSONObject.getClass();
        hashMap.put("u-id-map", jSONObject);
        return hashMap;
    }
}

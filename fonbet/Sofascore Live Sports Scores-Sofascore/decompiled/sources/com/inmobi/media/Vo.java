package com.inmobi.media;

import defpackage.joa;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vo {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.a.entrySet()) {
                jSONObject.put(String.valueOf(Uf.a((Tf) entry.getKey())), ((Uo) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
            return new JSONObject();
        }
    }
}

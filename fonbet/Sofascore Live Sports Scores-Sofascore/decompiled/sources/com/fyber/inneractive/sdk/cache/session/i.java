package com.fyber.inneractive.sdk.cache.session;

import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i {
    public final h a = new h();

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : this.a.entrySet()) {
                com.fyber.inneractive.sdk.cache.session.enums.c cVar = (com.fyber.inneractive.sdk.cache.session.enums.c) entry.getKey();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", cVar.a().value());
                    jSONObject2.put("subType", cVar.name().toLowerCase(Locale.US).contains("video") ? "video" : U3.i.d);
                    jSONObject2.put("session_data", ((g) entry.getValue()).a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}

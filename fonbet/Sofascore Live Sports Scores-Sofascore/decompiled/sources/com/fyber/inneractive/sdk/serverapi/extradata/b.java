package com.fyber.inneractive.sdk.serverapi.extradata;

import com.ironsource.U3;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b implements c {
    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final void a(String str, String str2, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(U3.i.W, str);
        jSONObject.put(U3.i.X, str2);
        ((JSONArray) obj).put(jSONObject);
    }

    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final boolean a(Object obj) {
        return ((JSONArray) obj).length() == 0;
    }
}

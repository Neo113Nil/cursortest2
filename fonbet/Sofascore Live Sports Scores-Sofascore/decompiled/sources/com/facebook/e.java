package com.facebook;

import defpackage.pic;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements z {
    public final /* synthetic */ pic a;

    @Override // com.facebook.z
    public final void a(g0 g0Var) {
        g0Var.getClass();
        JSONObject jSONObject = g0Var.d;
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("access_token");
        pic picVar = this.a;
        picVar.d = optString;
        picVar.a = jSONObject.optInt("expires_at");
        picVar.b = jSONObject.optInt("expires_in");
        picVar.c = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
        picVar.e = jSONObject.optString("graph_domain", null);
    }
}

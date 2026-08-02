package com.plaid.internal;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class H {
    public static String a(r rVar, C3712p c3712p) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (InterfaceC3738s interfaceC3738s : c3712p.f40926c) {
                jSONArray.put(new JSONObject().put("u", C3791x7.a(interfaceC3738s.b())).put("s", interfaceC3738s.a()));
            }
            String str = c3712p.f40928e;
            if (str != null) {
                jSONObject.put("cid", C3791x7.a(str));
            }
            EnumC3684l7 enumC3684l7 = rVar.f41008a;
            if (enumC3684l7 != null) {
                jSONObject.put("st", enumC3684l7.getCode());
            }
            if (rVar.a() != null) {
                jSONObject.put("er", rVar.a().getCode());
            }
            jSONObject.put("os", "and").put("v", 20901).put("fl", c3712p.f40927d).put("rq", jSONArray);
        } catch (JSONException unused) {
        }
        return Base64.encodeToString(("client-error:" + jSONObject).getBytes(StandardCharsets.UTF_8), 10);
    }
}

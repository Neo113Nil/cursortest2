package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.শ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0555 extends AbstractC0978 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f1824 = StringFog.decrypt("BNJw+WjIH1EVzg==\n", "Z70elw2raz4=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f1823 = StringFog.decrypt("+A==\n", "i2aG5ugsYVA=\n") + UUID.randomUUID().toString().replace(StringFog.decrypt("AQ==\n", "LMVO1Isq6Jk=\n"), "");

    public C0555(C1037 c1037) {
        this.f3205 = c1037;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m354() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.has(this.f1824);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m355(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f1824);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        if (optJSONObject2 != null) {
            return optJSONObject2.optString(StringFog.decrypt("PdIma4fxowws6y13kfu4DQ==\n", "Xr1IBeKS12M=\n"));
        }
        return null;
    }
}

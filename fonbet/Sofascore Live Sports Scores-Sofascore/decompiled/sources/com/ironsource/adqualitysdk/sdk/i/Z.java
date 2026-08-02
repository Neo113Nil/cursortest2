package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Z extends C0648 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final String f115;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final String f116;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final String f117;

    public Z(JSONObject jSONObject) {
        this.f116 = jSONObject.optString(StringFog.decrypt("GryaK/tJUk0BuIsO3E1Iaz2rnRv7VA==\n", "bdn4fZIsJQ4=\n"));
        this.f117 = jSONObject.optString(StringFog.decrypt("c3qU46vJz2l2XZD5jQ==\n", "BRPxlOilrho=\n"));
        this.f115 = jSONObject.optString(StringFog.decrypt("chjJp53I/0FnDuuwltrAUA==\n", "Anm7wvO8qSg=\n"));
        this.f2200 = jSONObject.optString(StringFog.decrypt("SMvNSj6/d5BBzA==\n", "IriZJXfRHfU=\n"));
        this.f2198 = false;
        this.f2195 = !TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("257EfcK/9wDSmQ==\n", "se2QEovRnWU=\n"))) || jSONObject.optBoolean(StringFog.decrypt("1A5d9mnoPvLECnvNZe8G7w==\n", "oX04oQyKaJs=\n")) || jSONObject.optBoolean(StringFog.decrypt("u7jIWrvIlbW8pMBonca/uKC/\n", "zsutDd6q1t0=\n"));
        this.f2194 = jSONObject.optBoolean(StringFog.decrypt("r4MBjfmxLmW/hye29bYWeA==\n", "2vBk2pzTeAw=\n"));
        this.f2193 = jSONObject.optBoolean(StringFog.decrypt("nGfBUfXpqOKjZw==\n", "6RSkFI2d2oM=\n"));
        ArrayList arrayList = null;
        this.f2199 = TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("TbJj0pMojvRA\n", "OMAPguFN6J0=\n"))) ? null : Arrays.asList(jSONObject.optString(StringFog.decrypt("5Dh6nr64bHTp\n", "kUoWzszdCh0=\n")).split(StringFog.decrypt("Fw==\n", "O/evyrlNzrc=\n")));
        this.f2197 = jSONObject.optBoolean(StringFog.decrypt("AXXPbWSsU6sXdMNXcQ==\n", "dAaqJwXaMtg=\n"), true);
        this.f2196 = false;
        this.f2192 = jSONObject.optBoolean(StringFog.decrypt("xEerNt2wFS3gXLQ21a4aLdo=\n", "qTLHQrTAeUg=\n"));
        this.f2191 = jSONObject.optBoolean(StringFog.decrypt("vw5ghqhmO4ai\n", "1mMQycY2VPU=\n"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("jakzZ4C5unucrjlilg==\n", "+8BWEPPt1TI=\n"));
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                Object opt = optJSONArray.opt(i);
                if (opt != null) {
                    arrayList.add(opt);
                }
            }
        }
        if (arrayList != null) {
            this.f2190 = arrayList;
        }
    }

    public Z() {
    }
}

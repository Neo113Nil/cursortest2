package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1036 extends C0648 {

    /* renamed from: ףּ, reason: contains not printable characters */
    public final boolean f3299;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final boolean f3300;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final int f3301;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final String f3302;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final String f3303;

    public C1036(JSONObject jSONObject) {
        this.f3299 = false;
        this.f3303 = jSONObject.optString(StringFog.decrypt("c/QpAbmWOO1m6SYDoJo=\n", "EpBoYs3/ToQ=\n"));
        this.f3302 = jSONObject.optString(StringFog.decrypt("0k9m3XIz8f7JS3f4VTfr2PVYYe1yLg==\n", "pSoEixtWhr0=\n"));
        this.f3301 = jSONObject.optInt(StringFog.decrypt("g/YE8u0N2aSQ\n", "9JNmpIRoru0=\n"), -1);
        this.f3300 = jSONObject.optBoolean(StringFog.decrypt("4k9mKq98ePbuQW49omli8uI=\n", "hzcHSds9G4I=\n"));
        this.f3299 = jSONObject.optBoolean(StringFog.decrypt("WcrvGC8f991ZyvAoABzf2lTI4g==\n", "OKmbW05zm78=\n"));
        this.f2200 = jSONObject.optString(StringFog.decrypt("pvTNMfQje3Gv8w==\n", "zIeZXr1NERQ=\n"));
        ArrayList arrayList = null;
        this.f2199 = TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("E1nifB+qHfAe\n", "ZiuOLG3Pe5k=\n"))) ? null : Arrays.asList(jSONObject.optString(StringFog.decrypt("6VtOOzAldSTk\n", "nCkia0JAE00=\n")).split(StringFog.decrypt("xQ==\n", "6Zz9Rn1+Tfw=\n")));
        this.f2198 = jSONObject.optBoolean(StringFog.decrypt("wXA1bLj2NxTRdBharvw=\n", "tANQO92UYX0=\n"));
        boolean z = true;
        this.f2197 = jSONObject.optBoolean(StringFog.decrypt("wuP1LhEaQ5vU4vkUBA==\n", "t5CQZHBsIug=\n"), true);
        if (TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("lGi8AZ4ePAedbw==\n", "/hvobtdwVmI=\n"))) && !jSONObject.optBoolean(StringFog.decrypt("5/e343alOC7385HYeqIAMw==\n", "koTStBPHbkc=\n")) && !jSONObject.optBoolean(StringFog.decrypt("LZ6SdllW+P4qgppEf1jS8zaZ\n", "WO33ITw0u5Y=\n"))) {
            z = false;
        }
        this.f2195 = z;
        this.f2194 = jSONObject.optBoolean(StringFog.decrypt("o410l+7H/9KziVKs4sDHzw==\n", "1v4RwIulqbs=\n"));
        this.f2193 = jSONObject.optBoolean(StringFog.decrypt("KDeNKtBGsZQXNw==\n", "XUTob6gyw/U=\n"));
        this.f2196 = jSONObject.optBoolean(StringFog.decrypt("QenQbwuK68ZE9tB1G4TJxlHtxg==\n", "NJq1In7mn68=\n"));
        this.f2192 = jSONObject.optBoolean(StringFog.decrypt("RBHtQ7N/aklgCvJDu2FlSVo=\n", "KWSBN9oPBiw=\n"));
        this.f2191 = jSONObject.optBoolean(StringFog.decrypt("/F0dDAGZLJ/h\n", "lTBtQ2/JQ+w=\n"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("hcHcCP/JxbGUxtYN6Q==\n", "86i5f4ydqvg=\n"));
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
}

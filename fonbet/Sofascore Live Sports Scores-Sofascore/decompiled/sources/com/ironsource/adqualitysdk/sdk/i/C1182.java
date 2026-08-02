package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾌ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1182 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String f3746;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f3747;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List f3748;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject f3749;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ISAdQualityAdType f3750;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3751;

    static {
        StringFog.decrypt("l1jTFA==\n", "4yGjcZyn8fs=\n");
        StringFog.decrypt("8WG7Shhc\n", "kAXvM2g5qDM=\n");
        StringFog.decrypt("E8tjOE4X\n", "Y6oRWSNkFNM=\n");
        StringFog.decrypt("rSJGSd1bllKpMg==\n", "zEEyIKsy4js=\n");
        StringFog.decrypt("LChgHQ4luNc/Mw==\n", "WkEFakhM1KM=\n");
        StringFog.decrypt("wYAmLftqX1bxgDAP930=\n", "tuVEe5IPKCU=\n");
    }

    public C1182(JSONObject jSONObject) {
        this.f3750 = ISAdQualityAdType.UNKNOWN;
        this.f3751 = AbstractC1088.m645(jSONObject.optString(StringFog.decrypt("htaJAA==\n", "8q/5Zfc98Qo=\n")));
        String m645 = AbstractC1088.m645(jSONObject.optString(StringFog.decrypt("OXHzeC8h\n", "WBWnAV9EP7U=\n")));
        if (!TextUtils.isEmpty(m645)) {
            this.f3750 = ISAdQualityAdType.fromInt(Integer.parseInt(m645));
        }
        this.f3749 = jSONObject.optJSONObject(StringFog.decrypt("ImKezTg/\n", "UgPsrFVMAlg=\n"));
        String decrypt = StringFog.decrypt("X0sFqPc99xZbWw==\n", "PihxwYFUg38=\n");
        List arrayList = new ArrayList();
        String str = AbstractC0523.f1759;
        JSONArray optJSONArray = jSONObject.optJSONArray(decrypt);
        this.f3748 = optJSONArray != null ? AbstractC0523.m344(optJSONArray) : arrayList;
        this.f3747 = AbstractC1088.m645(jSONObject.optString(StringFog.decrypt("/YxTYs4A7oPulw==\n", "i+U2FYhpgvc=\n")));
        this.f3746 = AbstractC1088.m645(jSONObject.optString(StringFog.decrypt("XthruqYIiaJu2H2Yqh8=\n", "Kb0J7M9t/tE=\n")));
    }
}

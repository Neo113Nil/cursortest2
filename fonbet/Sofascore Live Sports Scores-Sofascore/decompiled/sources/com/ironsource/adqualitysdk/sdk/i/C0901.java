package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẓ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0901 extends AbstractRunnableC0606 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0892 f3020;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0983 f3021;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3022;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3023;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3024;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f3025;

    public C0901(C0892 c0892, String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, C0983 c0983) {
        this.f3020 = c0892;
        this.f3025 = str;
        this.f3024 = jSONObject;
        this.f3023 = jSONObject2;
        this.f3022 = z;
        this.f3021 = c0983;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        if (this.f3025.equals(StringFog.decrypt("tKDPcqSFSeKzpPFztQ==\n", "wNCQAcH2Or0=\n"))) {
            this.f3020.f2999++;
        }
        C0892 c0892 = this.f3020;
        int i = c0892.f2998;
        c0892.f2998 = i + 1;
        JSONObject m346 = AbstractC0523.m346(this.f3024, false);
        m346.put(StringFog.decrypt("Tjk8vA==\n", "IFhR2TTlQIc=\n"), this.f3025);
        m346.put(StringFog.decrypt("RSU=\n", "IEt4SZwahrI=\n"), i);
        String decrypt = StringFog.decrypt("gwISg4nyiC+c\n", "93Bz4OyQ6Uw=\n");
        JSONObject jSONObject = this.f3023;
        if (jSONObject != null) {
            decrypt = jSONObject.optString(AbstractC0615.f2039);
            String str = AbstractC0615.f1993;
            m346.put(str, this.f3023.optString(str, null));
        }
        if (TextUtils.isEmpty(decrypt)) {
            decrypt = StringFog.decrypt("V0ZF/w==\n", "OSkrmrt0FE4=\n");
        }
        m346.put(AbstractC0615.f2038, decrypt);
        String str2 = AbstractC0615.f2037;
        if (!m346.has(str2)) {
            m346.put(str2, decrypt);
        }
        AbstractC1008.m611(new C0908(this, this.f3020.mo234(m346, this.f3022, true, this.f3025.equals(StringFog.decrypt("tmzuJYhOUg==\n", "whyxTOYnJvU=\n")))));
    }
}

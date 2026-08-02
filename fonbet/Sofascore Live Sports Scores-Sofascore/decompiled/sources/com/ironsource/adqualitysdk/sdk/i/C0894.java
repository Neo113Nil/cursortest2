package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṯ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0894 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0892 f3003;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1031 f3004;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONArray f3005;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3006;

    public C0894(C0892 c0892, boolean z, JSONArray jSONArray, C1031 c1031) {
        this.f3003 = c0892;
        this.f3006 = z;
        this.f3005 = jSONArray;
        this.f3004 = c1031;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        JSONObject mo234 = this.f3003.mo234(null, this.f3006, false, false);
        try {
            mo234.put(StringFog.decrypt("yqtgeV5B\n", "r90FFyoyw7A=\n"), this.f3005);
        } catch (JSONException e) {
            String decrypt = StringFog.decrypt("gDUQhbATTMeyHgeMpxNiwa8+A4i9CFc=\n", "wVtx6clnJaQ=\n");
            AbstractC0420.m252(decrypt, decrypt, StringFog.decrypt("OkjR0SltT00aW9fXNSoMWglfzcoWKFhe\n", "fzqjvltNLD8=\n"), e, null, false);
        }
        AbstractC1008.m611(new C0900(this, mo234));
    }
}

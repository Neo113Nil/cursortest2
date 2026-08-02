package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.טּ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1020 extends AbstractRunnableC0606 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0987 f3265;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0815 f3266;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0301 f3267;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0567 f3268;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3269;

    public C1020(C0987 c0987, JSONObject jSONObject, C0567 c0567, C0301 c0301, C0815 c0815) {
        this.f3265 = c0987;
        this.f3269 = jSONObject;
        this.f3268 = c0567;
        this.f3267 = c0301;
        this.f3266 = c0815;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        String m600 = C0987.m600(this.f3265, this.f3269);
        C1027 c1027 = (C1027) this.f3265.f3221.get(m600);
        if (c1027 == null) {
            c1027 = new C1027(this.f3269, this.f3268);
            this.f3265.f3221.put(m600, c1027);
        } else {
            c1027.f2186 = this.f3268;
            C1036 c1036 = new C1036(this.f3269);
            c1027.f2185 = c1036;
            c1027.f3278 = c1036;
            AbstractC1008.m611(new C1119(c1027));
        }
        c1027.f3217 = this.f3267;
        c1027.f3284 = this.f3266;
    }
}

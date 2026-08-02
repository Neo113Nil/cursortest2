package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ọ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0908 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0901 f3033;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3034;

    public C0908(C0901 c0901, JSONObject jSONObject) {
        this.f3033 = c0901;
        this.f3034 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0983 c0983 = this.f3033.f3021;
        JSONObject jSONObject = this.f3034;
        c0983.f3213.f3094.m520(jSONObject);
        C0926 c0926 = c0983.f3213;
        C0991 c0991 = new C0991(c0983);
        synchronized (c0926.f3103) {
        }
        c0926.m558(jSONObject);
        c0926.f3103.getClass();
        C0290 c0290 = new C0290(jSONObject);
        C0911 c0911 = new C0911(c0290);
        c0911.m537(c0926.m553().m498());
        c0926.f3103.m135(c0290, c0991);
        c0926.m551(c0911.m535());
        AbstractC1008.m610(c0991);
    }
}

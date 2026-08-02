package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.爫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1007 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0987 f3247;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0297 f3248;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3249;

    public C1007(C0987 c0987, JSONObject jSONObject, C0297 c0297) {
        this.f3247 = c0987;
        this.f3249 = jSONObject;
        this.f3248 = c0297;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        String m600 = C0987.m600(this.f3247, this.f3249);
        a0 a0Var = (a0) this.f3247.f3220.get(m600);
        if (a0Var == null) {
            a0Var = new a0(this.f3249);
            this.f3247.f3220.put(m600, a0Var);
        } else {
            a0Var.m87(this.f3249);
        }
        a0Var.f3217 = this.f3248;
    }
}

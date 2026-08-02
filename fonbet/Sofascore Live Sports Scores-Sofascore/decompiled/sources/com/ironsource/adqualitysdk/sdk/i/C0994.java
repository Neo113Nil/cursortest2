package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.丫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0994 extends AbstractRunnableC0606 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0987 f3229;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0282 f3230;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0526 f3231;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3232;

    public C0994(C0987 c0987, JSONObject jSONObject, C0526 c0526, C0282 c0282) {
        this.f3229 = c0987;
        this.f3232 = jSONObject;
        this.f3231 = c0526;
        this.f3230 = c0282;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        String m600 = C0987.m600(this.f3229, this.f3232);
        C3963a c3963a = (C3963a) this.f3229.f3219.get(m600);
        if (c3963a == null) {
            c3963a = new C3963a(this.f3232, this.f3231);
            this.f3229.f3219.put(m600, c3963a);
        } else {
            JSONObject jSONObject = this.f3232;
            C0526 c0526 = this.f3231;
            c3963a.f120 = new C0323(jSONObject);
            c3963a.f126 = c0526;
        }
        c3963a.f3217 = this.f3230;
    }
}

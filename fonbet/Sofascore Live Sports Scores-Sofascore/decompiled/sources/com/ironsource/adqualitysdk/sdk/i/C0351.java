package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.γ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0351 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0298 f890;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f891;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f892;

    public C0351(C0298 c0298, String str, JSONObject jSONObject) {
        this.f890 = c0298;
        this.f892 = str;
        this.f891 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0298 c0298 = this.f890;
        String str = this.f892;
        JSONObject jSONObject = this.f891;
        c0298.getClass();
        Iterator it = new HashSet(c0298.f548).iterator();
        while (it.hasNext()) {
            JSONObject mo404 = ((InterfaceC0890) it.next()).mo404(str, jSONObject);
            if (mo404 != null) {
                AbstractC0523.m348(jSONObject, mo404, false);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str2 = AbstractC0615.f2039;
            jSONObject2.put(str2, jSONObject.remove(str2));
            String str3 = AbstractC0615.f1993;
            jSONObject2.put(str3, jSONObject.remove(str3));
        } catch (JSONException unused) {
        }
        c0298.f549.m557(str, jSONObject, jSONObject2, new C0299(c0298, str));
    }
}

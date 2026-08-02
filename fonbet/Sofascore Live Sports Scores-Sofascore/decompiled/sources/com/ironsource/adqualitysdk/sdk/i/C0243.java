package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.mz1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ƨ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0243 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0233 f451;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0991 f452;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0290 f453;

    public C0243(C0233 c0233, C0290 c0290, C0991 c0991) {
        this.f451 = c0233;
        this.f453 = c0290;
        this.f452 = c0991;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        int i;
        C0233 c0233 = this.f451;
        C0358 c0358 = c0233.f439;
        String o = mz1.o(new StringBuilder(), c0233.f440, StringFog.decrypt("JQ==\n", "D1Ej351OUcI=\n"));
        C0715 c0715 = c0358.f901;
        c0715.getClass();
        try {
            i = c0715.f2420.m407(o);
        } catch (Throwable unused) {
            i = 0;
        }
        C0233 c02332 = this.f451;
        c02332.getClass();
        if (i <= 10000) {
            String o2 = mz1.o(new StringBuilder(), c02332.f440, this.f453.f530);
            if (TextUtils.isEmpty(o2)) {
                AbstractC0420.m252(C0233.m134(this.f451), StringFog.decrypt("uTC3XwjRPLqIMLNS\n", "+lHUN22CSNU=\n"), StringFog.decrypt("MXvd0edm6DIHctCD50z6fEJnlMWie7thEXzGw6Bqu3kAapTEqH27fQd50cGz\n", "ZRO0oscPmxI=\n"), null, null, true);
                return;
            }
            try {
                C0290 c0290 = this.f453;
                c0290.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringFog.decrypt("wjOPtJK0Qzw=\n", "slz8wNbVN10=\n"), c0290.f531);
                jSONObject.put(StringFog.decrypt("BevpYw==\n", "cJ6AByoBs5c=\n"), c0290.f530);
                String jSONObject2 = jSONObject.toString();
                AbstractC0420.m251(C0233.m134(this.f451), StringFog.decrypt("NTB000tD+mAEMHDe\n", "dlEXuy4Qjg8=\n"), StringFog.decrypt("jL4PuleJIbqgvQa3XZN8\n", "z99s0j7nRpo=\n"), jSONObject2, true);
                this.f451.f439.m209(o2, jSONObject2);
            } catch (JSONException unused2) {
                return;
            }
        }
        C0991 c0991 = this.f452;
        if (c0991 != null) {
            AbstractC1008.m610(c0991);
        }
    }
}

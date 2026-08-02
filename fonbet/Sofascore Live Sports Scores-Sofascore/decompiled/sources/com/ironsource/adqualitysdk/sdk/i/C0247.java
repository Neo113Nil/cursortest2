package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ƴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0247 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0244 f458;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ int f459;

    public C0247(C0244 c0244, int i) {
        this.f458 = c0244;
        this.f459 = i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        int i;
        JSONObject jSONObject;
        C0927 c0927 = this.f458.f455;
        if (this.f459 >= c0927.f3107.m553().m499()) {
            i = 0;
        } else {
            C0926 c0926 = c0927.f3107;
            if (c0926.m553() == null || ((C0346) AbstractC0274.m142()).f849) {
                i = 100;
            } else {
                C0812 m553 = c0926.m553();
                synchronized (m553) {
                    jSONObject = m553.f3206;
                }
                i = jSONObject.optInt(StringFog.decrypt("ruaX\n", "y5XjfK9DQRE=\n"), m553.f2613);
            }
        }
        C0926 c09262 = c0927.f3107;
        c09262.f3101.removeCallbacksAndMessages(null);
        c09262.f3101.postDelayed(new C1123(c09262), i);
    }
}

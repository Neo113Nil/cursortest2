package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܬ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0534 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0527 f1777;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0845 f1778;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1779;

    public C0534(C0527 c0527, String str, C0845 c0845, boolean z) {
        this.f1777 = c0527;
        this.f1779 = str;
        this.f1778 = c0845;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0543 m349 = this.f1777.m349(this.f1779);
        if (m349 != null) {
            C0845 c0845 = this.f1778;
            C0918 c0918 = c0845.f2792;
            m349.f1800 = c0918.f3075;
            m349.f1799 = c0918.f3074;
            m349.f1798 = c0845.f2789.m268();
            if (StringFog.decrypt("UjrPHtcRwA==\n", "F3SOXJtUhJQ=\n").equals(m349.f1798) || StringFog.decrypt("y/45rZwyUCI=\n", "j7dq7N5+FWY=\n").equals(m349.f1798)) {
                m349.f1798 = C0543.f1792;
            }
            C0918 c09182 = c0845.f2792;
            m349.f1797 = c09182.f3073;
            m349.f1796 = c09182.f3072;
            m349.f1795 = c0845.m513();
        }
    }
}

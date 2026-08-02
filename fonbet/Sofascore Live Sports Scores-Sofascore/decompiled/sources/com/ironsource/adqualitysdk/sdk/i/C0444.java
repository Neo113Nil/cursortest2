package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ד, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0444 extends AbstractC0697 {
    public C0444(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872) {
        super(abstractC0287, abstractC02872);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        C1068 m171 = this.f2352.m171(c0950, c1102);
        C1068 m1712 = this.f2351.m171(c0950, c1102);
        if ((m171.f3367 instanceof String) || (m1712.f3367 instanceof String)) {
            return new C1068("" + m171.f3367 + m1712.f3367);
        }
        Number m639 = m171.m639();
        Number m6392 = m1712.m639();
        if ((m639 instanceof Double) || (m6392 instanceof Double)) {
            return new C1068(Double.valueOf(m6392.doubleValue() + m639.doubleValue()));
        }
        if ((m639 instanceof Long) || (m6392 instanceof Long)) {
            return new C1068(Long.valueOf(m6392.longValue() + m639.longValue()));
        }
        return new C1068(Integer.valueOf(m6392.intValue() + m639.intValue()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0697
    /* renamed from: ﾒ */
    public final String mo172() {
        return StringFog.decrypt("jA==\n", "p6/t6PEmB6o=\n");
    }
}

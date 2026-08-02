package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ເ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0597 extends AbstractC0590 {
    public C0597(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872) {
        super(abstractC0287, abstractC02872);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﾒ */
    public final Number mo235(Number number, Number number2) {
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number2.doubleValue() * number.doubleValue());
        }
        if ((number instanceof Long) || (number2 instanceof Long)) {
            return Long.valueOf(number2.longValue() * number.longValue());
        }
        return Integer.valueOf(number2.intValue() * number.intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0697
    /* renamed from: ﾒ */
    public final String mo172() {
        return StringFog.decrypt("rw==\n", "hTPpFxYcTJs=\n");
    }
}

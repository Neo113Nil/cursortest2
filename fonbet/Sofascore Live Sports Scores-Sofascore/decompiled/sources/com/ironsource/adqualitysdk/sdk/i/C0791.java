package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴄ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0791 extends AbstractC0590 {
    public C0791(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872) {
        super(abstractC0287, abstractC02872);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﾒ */
    public final Number mo235(Number number, Number number2) {
        return ((number instanceof Double) || (number2 instanceof Double)) ? Double.valueOf(number.doubleValue() % number2.doubleValue()) : ((number instanceof Long) || (number2 instanceof Long)) ? Long.valueOf(number.longValue() % number2.longValue()) : Integer.valueOf(number.intValue() % number2.intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0697
    /* renamed from: ﾒ */
    public final String mo172() {
        return StringFog.decrypt("ZA==\n", "QdlUkVLA9nE=\n");
    }
}

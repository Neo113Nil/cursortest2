package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ԁ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0426 extends AbstractC0287 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0337 f1216;

    public C0426(C0337 c0337) {
        this.f1216 = c0337;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0426 c0426 = (C0426) obj;
        C0337 c0337 = this.f1216;
        return c0337 != null ? c0337.equals(c0426.f1216) : c0426.f1216 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        int hashCode = C0426.class.hashCode() * 31;
        C0337 c0337 = this.f1216;
        return hashCode + (c0337 != null ? c0337.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        C1068 m171 = this.f1216.m171(c0950, c1102);
        c0950.m566(this.f1216.f829, Integer.valueOf(m171.m639().intValue() - 1));
        return m171;
    }
}

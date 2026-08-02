package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ү, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0414 extends AbstractC0287 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0337 f1179;

    public C0414(C0337 c0337) {
        this.f1179 = c0337;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0414 c0414 = (C0414) obj;
        C0337 c0337 = this.f1179;
        return c0337 != null ? c0337.equals(c0414.f1179) : c0414.f1179 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        int hashCode = C0414.class.hashCode() * 31;
        C0337 c0337 = this.f1179;
        return hashCode + (c0337 != null ? c0337.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1179.f829);
        return AbstractC1133.m662("J2s=\n", "DEDkPvJJH8g=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        C1068 m171 = this.f1179.m171(c0950, c1102);
        c0950.m566(this.f1179.f829, Integer.valueOf(m171.m639().intValue() + 1));
        return m171;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0621 extends AbstractC0287 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0287 f2051;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0287 f2052;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287 f2053;

    public C0621(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872, AbstractC0287 abstractC02873) {
        this.f2053 = abstractC0287;
        this.f2052 = abstractC02872;
        this.f2051 = abstractC02873;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0621 c0621 = (C0621) obj;
        AbstractC0287 abstractC0287 = this.f2053;
        if (abstractC0287 == null ? c0621.f2053 != null : !abstractC0287.equals(c0621.f2053)) {
            return false;
        }
        AbstractC0287 abstractC02872 = this.f2052;
        if (abstractC02872 == null ? c0621.f2052 != null : !abstractC02872.equals(c0621.f2052)) {
            return false;
        }
        AbstractC0287 abstractC02873 = this.f2051;
        return abstractC02873 != null ? abstractC02873.equals(c0621.f2051) : c0621.f2051 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        AbstractC0287 abstractC0287 = this.f2053;
        int hashCode = (abstractC0287 != null ? abstractC0287.hashCode() : 0) * 31;
        AbstractC0287 abstractC02872 = this.f2052;
        int hashCode2 = (hashCode + (abstractC02872 != null ? abstractC02872.hashCode() : 0)) * 31;
        AbstractC0287 abstractC02873 = this.f2051;
        return hashCode2 + (abstractC02873 != null ? abstractC02873.hashCode() : 0);
    }

    public final String toString() {
        return this.f2053 + StringFog.decrypt("KBh/\n", "CCdfEaK2Ngk=\n") + this.f2052 + StringFog.decrypt("E6MX\n", "M5k3Kgohk9s=\n") + this.f2051;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        return this.f2053.m171(c0950, c1102).m640() ? this.f2052.m171(c0950, c1102) : this.f2051.m171(c0950, c1102);
    }
}

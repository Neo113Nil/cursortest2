package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓶ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0704 extends AbstractC0413 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0271 f2379;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0271 f2380;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0287 f2381;

    public C0704(AbstractC0287 abstractC0287, AbstractC0271 abstractC0271, AbstractC0271 abstractC02712, byte b) {
        super(b);
        this.f2381 = abstractC0287;
        this.f2380 = abstractC0271;
        this.f2379 = abstractC02712;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0704 c0704 = (C0704) obj;
        AbstractC0287 abstractC0287 = this.f2381;
        if (abstractC0287 == null ? c0704.f2381 != null : !abstractC0287.equals(c0704.f2381)) {
            return false;
        }
        AbstractC0271 abstractC0271 = this.f2380;
        if (abstractC0271 == null ? c0704.f2380 != null : !abstractC0271.equals(c0704.f2380)) {
            return false;
        }
        AbstractC0271 abstractC02712 = this.f2379;
        return abstractC02712 != null ? abstractC02712.equals(c0704.f2379) : c0704.f2379 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final int hashCode() {
        AbstractC0287 abstractC0287 = this.f2381;
        int hashCode = (abstractC0287 != null ? abstractC0287.hashCode() : 0) * 31;
        AbstractC0271 abstractC0271 = this.f2380;
        int hashCode2 = (hashCode + (abstractC0271 != null ? abstractC0271.hashCode() : 0)) * 31;
        AbstractC0271 abstractC02712 = this.f2379;
        return hashCode2 + (abstractC02712 != null ? abstractC02712.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("v/N+dA==\n", "1pVeXCwZY4w=\n"));
        sb.append(this.f2381);
        sb.append(StringFog.decrypt("U7I=\n", "epLyniqZ4Ak=\n"));
        sb.append(this.f2380);
        if (this.f2379 != null) {
            if (this.f2380 instanceof C0981) {
                sb.append(" ");
            } else {
                sb.append("\n");
                byte b = this.f1178;
                for (int i = 0; i < b; i++) {
                    sb.append("  ");
                }
            }
            sb.append(StringFog.decrypt("s2Ep4Yk=\n", "1g1ahKkJeb0=\n"));
            sb.append(this.f2379);
        }
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final C1068 mo74(C0950 c0950, C1102 c1102) {
        if (this.f2381.m171(c0950, c1102).m640()) {
            return this.f2380.m141(c0950, c1102);
        }
        if (this.f2379 == null) {
            return new C1068(Boolean.FALSE);
        }
        c0950.f3160.add(this);
        return this.f2379.m141(c0950, c1102);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final int mo72() {
        int mo72 = this.f2380.mo72();
        AbstractC0271 abstractC0271 = this.f2379;
        if (abstractC0271 == null) {
            return mo72;
        }
        int mo722 = abstractC0271.mo72() + mo72;
        return this.f2380 instanceof C0981 ? mo722 - 1 : mo722;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final int mo73(C0950 c0950) {
        if (!c0950.f3160.contains(this)) {
            return 0;
        }
        int mo72 = this.f2380.mo72();
        return this.f2380 instanceof C0981 ? mo72 - 1 : mo72;
    }
}

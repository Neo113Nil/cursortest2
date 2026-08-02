package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓗ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0688 extends AbstractC0271 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0271 f2334;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0287 f2335;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0287 f2336;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287 f2337;

    public C0688(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872, AbstractC0287 abstractC02873, AbstractC0271 abstractC0271) {
        this.f2337 = abstractC0287;
        this.f2336 = abstractC02872;
        this.f2335 = abstractC02873;
        this.f2334 = abstractC0271;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0688 c0688 = (C0688) obj;
        AbstractC0287 abstractC0287 = this.f2337;
        if (abstractC0287 == null ? c0688.f2337 != null : !abstractC0287.equals(c0688.f2337)) {
            return false;
        }
        AbstractC0287 abstractC02872 = this.f2336;
        if (abstractC02872 == null ? c0688.f2336 != null : !abstractC02872.equals(c0688.f2336)) {
            return false;
        }
        AbstractC0287 abstractC02873 = this.f2335;
        if (abstractC02873 == null ? c0688.f2335 != null : !abstractC02873.equals(c0688.f2335)) {
            return false;
        }
        AbstractC0271 abstractC0271 = this.f2334;
        return abstractC0271 != null ? abstractC0271.equals(c0688.f2334) : c0688.f2334 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final int hashCode() {
        AbstractC0287 abstractC0287 = this.f2337;
        int hashCode = (abstractC0287 != null ? abstractC0287.hashCode() : 0) * 31;
        AbstractC0287 abstractC02872 = this.f2336;
        int hashCode2 = (hashCode + (abstractC02872 != null ? abstractC02872.hashCode() : 0)) * 31;
        AbstractC0287 abstractC02873 = this.f2335;
        int hashCode3 = (hashCode2 + (abstractC02873 != null ? abstractC02873.hashCode() : 0)) * 31;
        AbstractC0271 abstractC0271 = this.f2334;
        return hashCode3 + (abstractC0271 != null ? abstractC0271.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("9r/b1f4=\n", "kNCp9dZ42HI=\n"));
        AbstractC0287 abstractC0287 = this.f2337;
        if (abstractC0287 != null) {
            sb.append(abstractC0287);
        }
        sb.append(StringFog.decrypt("zM0=\n", "9+0Ib6Aj4/c=\n"));
        sb.append(this.f2336);
        sb.append(StringFog.decrypt("IrU=\n", "GZWFrBStz9M=\n"));
        AbstractC0287 abstractC02872 = this.f2335;
        if (abstractC02872 != null) {
            sb.append(abstractC02872);
        }
        sb.append(StringFog.decrypt("zJo=\n", "5bo8GYlPOlg=\n"));
        sb.append(this.f2334);
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final C1068 mo74(C0950 c0950, C1102 c1102) {
        AbstractC0287 abstractC0287 = this.f2337;
        if (abstractC0287 != null) {
            abstractC0287.m171(c0950, c1102);
        }
        while (this.f2336.m171(c0950, c1102).m640()) {
            C1068 m141 = this.f2334.m141(c0950, c1102);
            if (m141.f3365) {
                break;
            }
            if (m141.f3366) {
                return m141;
            }
            AbstractC0287 abstractC02872 = this.f2335;
            if (abstractC02872 != null) {
                abstractC02872.m171(c0950, c1102);
            }
        }
        return new C1068(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final int mo73(C0950 c0950) {
        return 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final int mo72() {
        return this.f2334.mo72();
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class X extends AbstractC0271 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0271 f113;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287 f114;

    public X(AbstractC0287 abstractC0287, AbstractC0271 abstractC0271) {
        this.f114 = abstractC0287;
        this.f113 = abstractC0271;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        X x = (X) obj;
        AbstractC0287 abstractC0287 = this.f114;
        if (abstractC0287 == null ? x.f114 != null : !abstractC0287.equals(x.f114)) {
            return false;
        }
        AbstractC0271 abstractC0271 = this.f113;
        return abstractC0271 != null ? abstractC0271.equals(x.f113) : x.f113 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final int hashCode() {
        AbstractC0287 abstractC0287 = this.f114;
        int hashCode = (abstractC0287 != null ? abstractC0287.hashCode() : 0) * 31;
        AbstractC0271 abstractC0271 = this.f113;
        return hashCode + (abstractC0271 != null ? abstractC0271.hashCode() : 0);
    }

    public final String toString() {
        return StringFog.decrypt("6wAnMOocUg==\n", "nGhOXI88eqY=\n") + this.f114 + StringFog.decrypt("+tc=\n", "0/fc/SsEolk=\n") + this.f113;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1068 mo74(C0950 c0950, C1102 c1102) {
        while (this.f114.m171(c0950, c1102).m640()) {
            C1068 m141 = this.f113.m141(c0950, c1102);
            if (m141.f3365) {
                break;
            }
            if (m141.f3366) {
                return m141;
            }
        }
        return new C1068(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int mo73(C0950 c0950) {
        return 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int mo72() {
        return this.f113.mo72();
    }
}

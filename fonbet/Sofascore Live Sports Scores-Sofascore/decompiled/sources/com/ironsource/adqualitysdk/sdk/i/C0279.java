package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɼ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0279 extends AbstractC0287 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287 f505;

    public C0279(AbstractC0287 abstractC0287) {
        this.f505 = abstractC0287;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0279 c0279 = (C0279) obj;
        AbstractC0287 abstractC0287 = this.f505;
        return abstractC0287 != null ? abstractC0287.equals(c0279.f505) : c0279.f505 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        int hashCode = C0279.class.hashCode() * 31;
        AbstractC0287 abstractC0287 = this.f505;
        return hashCode + (abstractC0287 != null ? abstractC0287.hashCode() : 0);
    }

    public final String toString() {
        return StringFog.decrypt("NA==\n", "FeYxNRV11mk=\n") + this.f505;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        return new C1068(Boolean.valueOf(!this.f505.m171(c0950, c1102).m640()));
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓫ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C0694 extends AbstractC0271 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287 f2349;

    public C0694(AbstractC0287 abstractC0287) {
        this.f2349 = abstractC0287;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0694 c0694 = (C0694) obj;
        AbstractC0287 abstractC0287 = this.f2349;
        return abstractC0287 != null ? abstractC0287.equals(c0694.f2349) : c0694.f2349 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final int hashCode() {
        AbstractC0287 abstractC0287 = this.f2349;
        if (abstractC0287 != null) {
            return abstractC0287.hashCode();
        }
        return 0;
    }

    public String toString() {
        if (this.f2349 == null) {
            return StringFog.decrypt("Qg==\n", "eQnlXwSavHg=\n");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2349);
        return AbstractC1133.m662("XQ==\n", "Zir9X+ubh/8=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public C1068 mo74(C0950 c0950, C1102 c1102) {
        AbstractC0287 abstractC0287 = this.f2349;
        return abstractC0287 != null ? abstractC0287.m171(c0950, c1102) : new C1068(null);
    }
}

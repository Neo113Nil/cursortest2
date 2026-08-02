package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐞ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0618 extends AbstractC0287 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287 f2042;

    public C0618(AbstractC0287 abstractC0287) {
        this.f2042 = abstractC0287;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0618 c0618 = (C0618) obj;
        AbstractC0287 abstractC0287 = this.f2042;
        return abstractC0287 != null ? abstractC0287.equals(c0618.f2042) : c0618.f2042 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        AbstractC0287 abstractC0287 = this.f2042;
        if (abstractC0287 != null) {
            return abstractC0287.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("fQ==\n", "VarFqWy+0q8=\n"));
        sb.append(this.f2042);
        return AbstractC1133.m662("XQ==\n", "dMTvG77QB2A=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        return this.f2042.m171(c0950, c1102);
    }
}

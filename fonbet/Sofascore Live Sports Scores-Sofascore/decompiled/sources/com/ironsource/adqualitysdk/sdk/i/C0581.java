package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ล, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0581 extends AbstractC0287 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0287 f1875;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0337 f1876;

    public C0581(C0337 c0337, AbstractC0287 abstractC0287) {
        this.f1876 = c0337;
        this.f1875 = abstractC0287;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0581 c0581 = (C0581) obj;
        C0337 c0337 = this.f1876;
        if (c0337 == null ? c0581.f1876 != null : !c0337.equals(c0581.f1876)) {
            return false;
        }
        AbstractC0287 abstractC0287 = this.f1875;
        return abstractC0287 != null ? abstractC0287.equals(c0581.f1875) : c0581.f1875 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        C0337 c0337 = this.f1876;
        int hashCode = (c0337 != null ? c0337.hashCode() : 0) * 31;
        AbstractC0287 abstractC0287 = this.f1875;
        return hashCode + (abstractC0287 != null ? abstractC0287.hashCode() : 0);
    }

    public final String toString() {
        return this.f1876 + StringFog.decrypt("Jpbj\n", "BqvDMNvzqqE=\n") + this.f1875;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        C1068 m171 = this.f1875.m171(c0950, c1102);
        c0950.m566(this.f1876.f829, m171.f3367);
        return m171;
    }
}

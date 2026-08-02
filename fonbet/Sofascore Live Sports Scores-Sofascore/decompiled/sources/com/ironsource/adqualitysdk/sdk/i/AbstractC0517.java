package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۊ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0517 extends AbstractC0287 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object f1751;

    public AbstractC0517(Object obj) {
        this.f1751 = obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC0517 abstractC0517 = (AbstractC0517) obj;
        Object obj2 = this.f1751;
        return obj2 != null ? obj2.equals(abstractC0517.f1751) : abstractC0517.f1751 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        Object obj = this.f1751;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "" + this.f1751;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        return new C1068(this.f1751);
    }
}

package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓯ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0697 extends AbstractC0287 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0287 f2351;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287 f2352;

    public AbstractC0697(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872) {
        this.f2352 = abstractC0287;
        this.f2351 = abstractC02872;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC0697 abstractC0697 = (AbstractC0697) obj;
        AbstractC0287 abstractC0287 = this.f2352;
        if (abstractC0287 == null ? abstractC0697.f2352 != null : !abstractC0287.equals(abstractC0697.f2352)) {
            return false;
        }
        AbstractC0287 abstractC02872 = this.f2351;
        return abstractC02872 != null ? abstractC02872.equals(abstractC0697.f2351) : abstractC0697.f2351 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        AbstractC0287 abstractC0287 = this.f2352;
        int hashCode = (abstractC0287 != null ? abstractC0287.hashCode() : 0) * 31;
        AbstractC0287 abstractC02872 = this.f2351;
        return hashCode + (abstractC02872 != null ? abstractC02872.hashCode() : 0);
    }

    public final String toString() {
        return this.f2352 + " " + mo172() + " " + this.f2351;
    }

    /* renamed from: ﾒ */
    public abstract String mo172();
}

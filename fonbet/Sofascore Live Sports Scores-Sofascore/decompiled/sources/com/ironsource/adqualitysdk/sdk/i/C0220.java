package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ľ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0220 extends AbstractC0287 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f423;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287 f424;

    public C0220(AbstractC0287 abstractC0287, String str) {
        this.f424 = abstractC0287;
        this.f423 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0220 c0220 = (C0220) obj;
        AbstractC0287 abstractC0287 = this.f424;
        if (abstractC0287 == null ? c0220.f424 != null : !abstractC0287.equals(c0220.f424)) {
            return false;
        }
        String str = this.f423;
        return str != null ? str.equals(c0220.f423) : c0220.f423 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        AbstractC0287 abstractC0287 = this.f424;
        int hashCode = (abstractC0287 != null ? abstractC0287.hashCode() : 0) * 31;
        String str = this.f423;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return this.f424.toString() + StringFog.decrypt("Ew==\n", "Pd+rnTvurJw=\n") + this.f423;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        Object obj = this.f424.m171(c0950, c1102).f3367;
        if (obj instanceof C1102) {
            C1102 c11022 = (C1102) obj;
            String str = this.f423;
            return new C1068(str != null ? c11022.f3466.m128(str) : null);
        }
        try {
            return new C1068(obj.getClass().getDeclaredField(this.f423).get(obj));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("OoJBx6YuLxcenEbJoGckBl+WWs24amoAHJNW26cubQ==\n", "f/AzqNQOSmE=\n"));
            sb.append(this);
            throw new C0240(c1102, c0950, AbstractC1133.m662("Ow==\n", "HIcGbMA72oE=\n", sb), e);
        }
    }
}

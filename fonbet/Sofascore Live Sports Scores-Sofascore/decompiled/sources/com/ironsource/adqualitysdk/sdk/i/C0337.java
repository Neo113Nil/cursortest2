package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ͺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0337 extends AbstractC0287 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f829;

    public C0337(String str) {
        this.f829 = AbstractC1088.m645(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            return this.f829.equals(((C0337) obj).f829);
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        String str = this.f829;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f829;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        C0499 c0499;
        try {
            return new C1068(c0950.m564(this.f829));
        } catch (Exception e) {
            String str = this.f829;
            if (str != null) {
                c0499 = c1102.f3466.m128(str);
            } else {
                c1102.getClass();
                c0499 = null;
            }
            if (c0499 != null) {
                return new C1068(c0499);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("y9m11M0uXu7vx7Lay2dV/67Ov8vNa0jr58Spm5g=\n", "jqvHu78OO5g=\n"));
            sb.append(this);
            throw new C0240(c1102, c0950, AbstractC1133.m662("Vg==\n", "cYdJcLq+57c=\n", sb), e);
        }
    }
}

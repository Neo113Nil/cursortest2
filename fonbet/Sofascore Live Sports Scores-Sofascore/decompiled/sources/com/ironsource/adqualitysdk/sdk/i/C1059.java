package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮋ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1059 extends AbstractC0287 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3348;

    public C1059(String str) {
        this.f3348 = AbstractC1088.m645(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C1059 c1059 = (C1059) obj;
        String str = this.f3348;
        return str != null ? str.equals(c1059.f3348) : c1059.f3348 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        String str = this.f3348;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f3348;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        AbstractC0433 abstractC0433 = c1102.f3463;
        String str = this.f3348;
        return new C1068(abstractC0433.m269(str.substring(0, str.length() - StringFog.decrypt("g2iH+cxL\n", "rQvrmL84Pac=\n").length()), true));
    }
}

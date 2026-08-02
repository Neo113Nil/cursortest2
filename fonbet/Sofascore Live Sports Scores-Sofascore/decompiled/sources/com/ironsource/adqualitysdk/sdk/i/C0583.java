package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ห, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0583 extends AbstractC0287 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287[] f1878;

    public C0583(ArrayList arrayList) {
        AbstractC0287[] abstractC0287Arr = new AbstractC0287[arrayList.size()];
        this.f1878 = abstractC0287Arr;
        arrayList.toArray(abstractC0287Arr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            return Arrays.equals(this.f1878, ((C0583) obj).f1878);
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public final int hashCode() {
        return Arrays.hashCode(this.f1878);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("sA==\n", "60hT73u1Ax0=\n"));
        sb.append(AbstractC0287.m170(this.f1878));
        return AbstractC1133.m662("IQ==\n", "fDs1sSBZ8Ys=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public final C1068 mo133(C0950 c0950, C1102 c1102) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0287 abstractC0287 : this.f1878) {
            arrayList.add(abstractC0287.m171(c0950, c1102).f3367);
        }
        return new C1068(arrayList);
    }
}

package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1727Fx extends AbstractC2596fo {
    public final /* synthetic */ C4U A00;

    public C1727Fx(C4U c4u) {
        this.A00 = c4u;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2596fo
    public final void A03() {
        Y2 y2;
        Y2 y22;
        String str;
        C2597fp c2597fp;
        Y2 y23;
        AbstractC2817jd abstractC2817jd;
        VA va;
        String str2;
        AbstractC2817jd abstractC2817jd2;
        C2652gi c2652gi;
        C2652gi c2652gi2;
        AbstractC2817jd abstractC2817jd3;
        AbstractC2817jd abstractC2817jd4;
        y2 = this.A00.A04;
        if (!y2.A07()) {
            C4U c4u = this.A00;
            y22 = this.A00.A04;
            c4u.setImpressionRecordingFlag(y22);
            str = this.A00.A08;
            if (!TextUtils.isEmpty(str)) {
                C2309b9 c2309b9 = new C2309b9();
                c2597fp = this.A00.A07;
                C2309b9 A03 = c2309b9.A03(c2597fp);
                y23 = this.A00.A04;
                C2309b9 A02 = A03.A02(y23);
                abstractC2817jd = this.A00.A0D;
                Map<String, String> A05 = A02.A04(abstractC2817jd.A0z()).A05();
                va = this.A00.A0F;
                str2 = this.A00.A08;
                va.ABJ(str2, A05);
                abstractC2817jd2 = this.A00.A0D;
                C1916Ng A2A = abstractC2817jd2.A2A();
                c2652gi = this.A00.A0E;
                C1916Ng.A07(A2A, c2652gi);
                c2652gi2 = this.A00.A0E;
                c2652gi2.A0F().A3L();
                abstractC2817jd3 = this.A00.A0D;
                String A0y = abstractC2817jd3.A0y();
                abstractC2817jd4 = this.A00.A0D;
                AbstractC1936Oa.A02(A0y, AbstractC2172Xm.A00(abstractC2817jd4.A10()));
            }
        }
    }
}

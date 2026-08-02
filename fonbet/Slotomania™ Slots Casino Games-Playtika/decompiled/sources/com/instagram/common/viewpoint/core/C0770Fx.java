package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0770Fx extends AbstractC1639fo {
    public final /* synthetic */ C4U A00;

    public C0770Fx(C4U c4u) {
        this.A00 = c4u;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1639fo
    public final void A03() {
        Y2 y2;
        Y2 y22;
        String str;
        C1640fp c1640fp;
        Y2 y23;
        AbstractC1860jd abstractC1860jd;
        VA va;
        String str2;
        AbstractC1860jd abstractC1860jd2;
        C1695gi c1695gi;
        C1695gi c1695gi2;
        AbstractC1860jd abstractC1860jd3;
        AbstractC1860jd abstractC1860jd4;
        y2 = this.A00.A04;
        if (!y2.A07()) {
            C4U c4u = this.A00;
            y22 = this.A00.A04;
            c4u.setImpressionRecordingFlag(y22);
            str = this.A00.A08;
            if (!TextUtils.isEmpty(str)) {
                C1352b9 c1352b9 = new C1352b9();
                c1640fp = this.A00.A07;
                C1352b9 A03 = c1352b9.A03(c1640fp);
                y23 = this.A00.A04;
                C1352b9 A02 = A03.A02(y23);
                abstractC1860jd = this.A00.A0D;
                Map<String, String> A05 = A02.A04(abstractC1860jd.A0z()).A05();
                va = this.A00.A0F;
                str2 = this.A00.A08;
                va.ABJ(str2, A05);
                abstractC1860jd2 = this.A00.A0D;
                C0959Ng A2A = abstractC1860jd2.A2A();
                c1695gi = this.A00.A0E;
                C0959Ng.A07(A2A, c1695gi);
                c1695gi2 = this.A00.A0E;
                c1695gi2.A0F().A3L();
                abstractC1860jd3 = this.A00.A0D;
                String A0y = abstractC1860jd3.A0y();
                abstractC1860jd4 = this.A00.A0D;
                AbstractC0979Oa.A02(A0y, AbstractC1215Xm.A00(abstractC1860jd4.A10()));
            }
        }
    }
}

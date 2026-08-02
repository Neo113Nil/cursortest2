package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1707Fc extends AbstractC2596fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C2490e5 A02;
    public final /* synthetic */ FY A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C1707Fc(FY fy, String str, C2490e5 c2490e5, VA va, Map map, Y2 y2) {
        this.A03 = fy;
        this.A04 = str;
        this.A02 = c2490e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2596fo
    public final void A03() {
        C2597fp c2597fp;
        SparseBooleanArray sparseBooleanArray;
        C2597fp c2597fp2;
        C1916Ng c1916Ng;
        C2652gi c2652gi;
        SparseBooleanArray sparseBooleanArray2;
        c2597fp = this.A03.A02;
        if (!c2597fp.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A08;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                VA va = this.A00;
                String str = this.A04;
                C2309b9 c2309b9 = new C2309b9(this.A05);
                c2597fp2 = this.A03.A03;
                va.ABJ(str, c2309b9.A03(c2597fp2).A02(this.A01).A05());
                c1916Ng = this.A03.A00;
                c2652gi = this.A03.A09;
                C1916Ng.A07(c1916Ng, c2652gi);
                sparseBooleanArray2 = this.A03.A08;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}

package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0765Fs extends AbstractC1639fo {
    public final /* synthetic */ VA A00;
    public final /* synthetic */ Y2 A01;
    public final /* synthetic */ C1533e5 A02;
    public final /* synthetic */ C0763Fq A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0765Fs(C0763Fq c0763Fq, String str, C1533e5 c1533e5, VA va, Map map, Y2 y2) {
        this.A03 = c0763Fq;
        this.A04 = str;
        this.A02 = c1533e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1639fo
    public final void A03() {
        C1640fp c1640fp;
        SparseBooleanArray sparseBooleanArray;
        C1640fp c1640fp2;
        C0959Ng c0959Ng;
        C1695gi c1695gi;
        SparseBooleanArray sparseBooleanArray2;
        c1640fp = this.A03.A02;
        if (!c1640fp.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                VA va = this.A00;
                String str = this.A04;
                C1352b9 c1352b9 = new C1352b9(this.A05);
                c1640fp2 = this.A03.A03;
                va.ABJ(str, c1352b9.A03(c1640fp2).A02(this.A01).A05());
                c0959Ng = this.A03.A00;
                c1695gi = this.A03.A06;
                C0959Ng.A07(c0959Ng, c1695gi);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}

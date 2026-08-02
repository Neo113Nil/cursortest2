package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C05837y extends AbstractC1834j4 {
    public final /* synthetic */ C05817w A00;
    public final /* synthetic */ AbstractC1864jh A01;
    public final /* synthetic */ C05707l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05837y(C05817w c05817w, boolean z, boolean z2, C05707l c05707l, AbstractC1864jh abstractC1864jh) {
        super(z);
        this.A00 = c05817w;
        this.A03 = z2;
        this.A02 = c05707l;
        this.A01 = abstractC1864jh;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1834j4
    public final void A00() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1834j4
    public final void A01(boolean z) {
        C1695gi c1695gi;
        WK wk;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1695gi c1695gi2;
        C1695gi c1695gi3;
        c1695gi = this.A00.A04;
        if (!C1145Up.A1t(c1695gi) || !this.A03) {
            wk = this.A00.A05;
            if (wk == WK.A0J) {
                c1695gi2 = this.A00.A04;
                c1695gi2.A0F().AER();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A01);
            return;
        }
        C05817w c05817w = this.A00;
        c1695gi3 = this.A00.A04;
        c05817w.A06 = AbstractC1480dD.A01(c1695gi3, this.A02, 0, new C1873jq(this));
    }
}

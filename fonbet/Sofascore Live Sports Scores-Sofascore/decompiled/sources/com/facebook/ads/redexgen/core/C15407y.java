package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C15407y extends AbstractC2791j4 {
    public final /* synthetic */ C15387w A00;
    public final /* synthetic */ AbstractC2821jh A01;
    public final /* synthetic */ C15277l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15407y(C15387w c15387w, boolean z, boolean z2, C15277l c15277l, AbstractC2821jh abstractC2821jh) {
        super(z);
        this.A00 = c15387w;
        this.A03 = z2;
        this.A02 = c15277l;
        this.A01 = abstractC2821jh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2791j4
    public final void A00() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2791j4
    public final void A01(boolean z) {
        C2652gi c2652gi;
        WK wk;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C2652gi c2652gi2;
        C2652gi c2652gi3;
        c2652gi = this.A00.A04;
        if (!C2102Up.A1t(c2652gi) || !this.A03) {
            wk = this.A00.A05;
            if (wk == WK.A0J) {
                c2652gi2 = this.A00.A04;
                c2652gi2.A0F().AER();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A01);
            return;
        }
        C15387w c15387w = this.A00;
        c2652gi3 = this.A00.A04;
        c15387w.A06 = AbstractC2437dD.A01(c2652gi3, this.A02, 0, new C2830jq(this));
    }
}

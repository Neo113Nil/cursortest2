package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1874jr implements SM {
    public final /* synthetic */ C05817w A00;
    public final /* synthetic */ boolean A01;

    public C1874jr(C05817w c05817w, boolean z) {
        this.A00 = c05817w;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        C1695gi c1695gi;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1695gi c1695gi2;
        NQ nq;
        c1695gi = this.A00.A04;
        if (!C1145Up.A1t(c1695gi) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A00);
            return;
        }
        C05817w c05817w = this.A00;
        c1695gi2 = this.A00.A04;
        nq = this.A00.A03;
        c05817w.A06 = AbstractC1480dD.A01(c1695gi2, (C05707l) nq, 0, new C1875js(this));
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}

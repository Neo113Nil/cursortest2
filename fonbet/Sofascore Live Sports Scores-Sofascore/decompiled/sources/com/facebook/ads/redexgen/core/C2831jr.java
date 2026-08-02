package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2831jr implements SM {
    public final /* synthetic */ C15387w A00;
    public final /* synthetic */ boolean A01;

    public C2831jr(C15387w c15387w, boolean z) {
        this.A00 = c15387w;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        C2652gi c2652gi;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C2652gi c2652gi2;
        NQ nq;
        c2652gi = this.A00.A04;
        if (!C2102Up.A1t(c2652gi) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A00);
            return;
        }
        C15387w c15387w = this.A00;
        c2652gi2 = this.A00.A04;
        nq = this.A00.A03;
        c15387w.A06 = AbstractC2437dD.A01(c2652gi2, (C15277l) nq, 0, new C2832js(this));
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}

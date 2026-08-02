package com.facebook.ads.redexgen.core;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1737Gh implements InterfaceC2472dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1734Ge A01;

    public C1737Gh(C1734Ge c1734Ge, int i) {
        this.A01 = c1734Ge;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2472dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2472dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2472dm
    public final void ADc(int i) {
        C1734Ge.A03(this.A01, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2472dm
    public final void ADw(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0L(f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2472dm
    public final void AFw(boolean z) {
        this.A01.A0W(z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2472dm
    public final void AGQ(String str) {
        C2652gi c2652gi;
        C2811jT c2811jT;
        InterfaceC2193Yh interfaceC2193Yh;
        ZU zu;
        int i;
        C2811jT c2811jT2;
        C2652gi c2652gi2;
        c2652gi = this.A01.A0D;
        c2652gi.A0F().A3a(str);
        c2811jT = this.A01.A0A;
        if (c2811jT.A2H()) {
            i = this.A01.A00;
            c2811jT2 = this.A01.A0A;
            if (i < c2811jT2.A23()) {
                c2652gi2 = this.A01.A0D;
                c2652gi2.A0F().AC2();
                this.A01.A0X(false, this.A00);
                return;
            }
        }
        interfaceC2193Yh = this.A01.A0I;
        zu = this.A01.A0J;
        interfaceC2193Yh.A4j(zu.A81());
        this.A01.A0M(3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2472dm
    public final void AKc() {
        AbstractC2187Yb abstractC2187Yb;
        AbstractC2187Yb abstractC2187Yb2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC2187Yb = this.A01.A0H;
        abstractC2187Yb.setProgressImmediate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        abstractC2187Yb2 = this.A01.A0H;
        abstractC2187Yb2.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2472dm
    public final void AKd(float f) {
        AbstractC2187Yb abstractC2187Yb;
        abstractC2187Yb = this.A01.A0H;
        abstractC2187Yb.setProgress(100.0f * f);
    }
}

package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0780Gh implements InterfaceC1515dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0777Ge A01;

    public C0780Gh(C0777Ge c0777Ge, int i) {
        this.A01 = c0777Ge;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1515dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1515dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1515dm
    public final void ADc(int i) {
        C0777Ge.A03(this.A01, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1515dm
    public final void ADw(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0L(f);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1515dm
    public final void AFw(boolean z) {
        this.A01.A0W(z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1515dm
    public final void AGQ(String str) {
        C1695gi c1695gi;
        C1854jT c1854jT;
        InterfaceC1236Yh interfaceC1236Yh;
        ZU zu;
        int i;
        C1854jT c1854jT2;
        C1695gi c1695gi2;
        c1695gi = this.A01.A0D;
        c1695gi.A0F().A3a(str);
        c1854jT = this.A01.A0A;
        if (c1854jT.A2H()) {
            i = this.A01.A00;
            c1854jT2 = this.A01.A0A;
            if (i < c1854jT2.A23()) {
                c1695gi2 = this.A01.A0D;
                c1695gi2.A0F().AC2();
                this.A01.A0X(false, this.A00);
                return;
            }
        }
        interfaceC1236Yh = this.A01.A0I;
        zu = this.A01.A0J;
        interfaceC1236Yh.A4j(zu.A81());
        this.A01.A0M(3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1515dm
    public final void AKc() {
        AbstractC1230Yb abstractC1230Yb;
        AbstractC1230Yb abstractC1230Yb2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC1230Yb = this.A01.A0H;
        abstractC1230Yb.setProgressImmediate(0.0f);
        abstractC1230Yb2 = this.A01.A0H;
        abstractC1230Yb2.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1515dm
    public final void AKd(float f) {
        AbstractC1230Yb abstractC1230Yb;
        abstractC1230Yb = this.A01.A0H;
        abstractC1230Yb.setProgress(100.0f * f);
    }
}

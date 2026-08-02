package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AE implements InterfaceC3121oo, InterfaceC15317p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C15347s A05;
    public C8O A06;
    public DT A07;
    public boolean A08;
    public boolean A09;
    public C3212qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC2778ir A0B = EnumC2778ir.A09;
    public final C15156z A0D = new C15156z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j, boolean z) throws AD;

    public abstract void A1c(C3212qI[] c3212qIArr, long j, long j2) throws AD;

    public AE(int i) {
        this.A0C = i;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j, boolean z) throws AD {
        this.A08 = false;
        this.A02 = j;
        this.A03 = j;
        A1a(j, z);
    }

    public final int A1Q(long j) {
        return ((DT) AbstractC14363y.A01(this.A07)).AK2(j - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C15156z c15156z, C3133p0 c3133p0, int i) {
        int AHP = ((DT) AbstractC14363y.A01(this.A07)).AHP(c15156z, c3133p0, i);
        if (AHP == -4) {
            if (c3133p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c3133p0.A00 = c3133p0.A01;
            c3133p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c3133p0.A01);
        } else if (AHP == -5) {
            C3212qI c3212qI = (C3212qI) AbstractC14363y.A01(c15156z.A00);
            if (c3212qI.A0M != Long.MAX_VALUE) {
                c15156z.A00 = c3212qI.A07().A0s(c3212qI.A0M + this.A04).A14();
            }
        }
        return AHP;
    }

    public final AD A1S(Throwable th, C3212qI c3212qI, int i) {
        return A1T(th, c3212qI, false, i);
    }

    public final AD A1T(Throwable th, C3212qI c3212qI, boolean z, int i) {
        int i2 = 4;
        if (c3212qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c3212qI);
                i2 = AbstractC15247i.A03(formatSupport);
            } catch (AD unused) {
            } catch (Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return AD.A04(th, getName(), A1O(), c3212qI, i2, z, i);
    }

    public final C15156z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C15347s A1V() {
        return (C15347s) AbstractC14363y.A01(this.A05);
    }

    public final C8O A1W() {
        return (C8O) AbstractC14363y.A01(this.A06);
    }

    public void A1X() throws AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z, boolean z2) throws AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((DT) AbstractC14363y.A01(this.A07)).AAe();
    }

    public final C3212qI[] A1e() {
        return (C3212qI[]) AbstractC14363y.A01(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void A5x() {
        AbstractC14363y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void A6L(C15347s c15347s, C3212qI[] c3212qIArr, DT dt, long j, boolean z, boolean z2, long j2, long j3) throws AD {
        AbstractC14363y.A08(this.A01 == 0);
        this.A05 = c15347s;
        this.A01 = 1;
        A1b(z, z2);
        AIa(c3212qIArr, dt, j2, j3);
        A1P(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final InterfaceC15317p A7D() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public AnonymousClass78 A8T() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC2778ir A99() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final DT A9D() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo, com.facebook.ads.redexgen.core.InterfaceC15317p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC15187c
    public void A9i(int i, Object obj) throws AD {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void AA9(int i, C8O c8o) {
        this.A00 = i;
        this.A06 = c8o;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void ACU() throws IOException {
        ((DT) AbstractC14363y.A01(this.A07)).ACR();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void AIa(C3212qI[] c3212qIArr, DT dt, long j, long j2) throws AD {
        AbstractC14363y.A08(!this.A08);
        this.A07 = dt;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j;
        }
        this.A0A = c3212qIArr;
        this.A04 = j2;
        A1c(c3212qIArr, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void AIm(long j) throws AD {
        A1P(j, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws AD {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void start() throws AD {
        AbstractC14363y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3121oo
    public final void stop() {
        AbstractC14363y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}

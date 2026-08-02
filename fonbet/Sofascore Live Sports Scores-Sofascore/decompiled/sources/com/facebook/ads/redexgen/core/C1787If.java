package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1787If implements XN {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ C14715h A00;

    public C1787If(C14715h c14715h) {
        this.A00 = c14715h;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        AbstractC2365c3 abstractC2365c3;
        AbstractC2365c3 abstractC2365c32;
        InterfaceC2472dm interfaceC2472dm;
        AbstractC2365c3 abstractC2365c33;
        InterfaceC2472dm interfaceC2472dm2;
        AbstractC2187Yb abstractC2187Yb;
        InterfaceC2472dm interfaceC2472dm3;
        int i;
        AbstractC2365c3 abstractC2365c34;
        InterfaceC2472dm interfaceC2472dm4;
        AbstractC2187Yb abstractC2187Yb2;
        abstractC2365c3 = this.A00.A01;
        if (abstractC2365c3 instanceof C1835Kc) {
            abstractC2365c34 = this.A00.A01;
            if (abstractC2365c34.A1M()) {
                interfaceC2472dm4 = this.A00.A07;
                interfaceC2472dm4.AFw(true);
                abstractC2187Yb2 = this.A00.A06;
                abstractC2187Yb2.setToolbarActionMode(1);
                interfaceC2472dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC2472dm3.ADc(i);
            }
        }
        abstractC2365c32 = this.A00.A01;
        if (abstractC2365c32 instanceof C1815Ji) {
            abstractC2365c33 = this.A00.A01;
            if (abstractC2365c33.A1M()) {
                interfaceC2472dm2 = this.A00.A07;
                interfaceC2472dm2.AFw(true);
                abstractC2187Yb = this.A00.A06;
                abstractC2187Yb.setToolbarActionMode(1);
                interfaceC2472dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC2472dm3.ADc(i);
            }
        }
        interfaceC2472dm = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC2472dm.AFw(false);
        interfaceC2472dm3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC2472dm3.ADc(i);
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        InterfaceC2472dm interfaceC2472dm;
        int i;
        DZ dz;
        DZ dz2;
        int i2;
        interfaceC2472dm = this.A00.A07;
        i = this.A00.A03;
        interfaceC2472dm.ADw(i - f);
        dz = this.A00.A02;
        if (dz != null) {
            dz2 = this.A00.A02;
            i2 = this.A00.A03;
            dz2.A07((int) (i2 - f));
        }
    }
}

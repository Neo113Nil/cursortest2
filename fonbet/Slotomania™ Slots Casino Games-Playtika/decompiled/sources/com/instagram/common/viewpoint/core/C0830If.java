package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0830If implements XN {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ C05145h A00;

    public C0830If(C05145h c05145h) {
        this.A00 = c05145h;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AbstractC1408c3 abstractC1408c3;
        AbstractC1408c3 abstractC1408c32;
        InterfaceC1515dm interfaceC1515dm;
        AbstractC1408c3 abstractC1408c33;
        InterfaceC1515dm interfaceC1515dm2;
        AbstractC1230Yb abstractC1230Yb;
        InterfaceC1515dm interfaceC1515dm3;
        int i;
        AbstractC1408c3 abstractC1408c34;
        InterfaceC1515dm interfaceC1515dm4;
        AbstractC1230Yb abstractC1230Yb2;
        abstractC1408c3 = this.A00.A01;
        if (abstractC1408c3 instanceof C0878Kc) {
            abstractC1408c34 = this.A00.A01;
            if (abstractC1408c34.A1M()) {
                interfaceC1515dm4 = this.A00.A07;
                interfaceC1515dm4.AFw(true);
                abstractC1230Yb2 = this.A00.A06;
                abstractC1230Yb2.setToolbarActionMode(1);
                interfaceC1515dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1515dm3.ADc(i);
            }
        }
        abstractC1408c32 = this.A00.A01;
        if (abstractC1408c32 instanceof C0858Ji) {
            abstractC1408c33 = this.A00.A01;
            if (abstractC1408c33.A1M()) {
                interfaceC1515dm2 = this.A00.A07;
                interfaceC1515dm2.AFw(true);
                abstractC1230Yb = this.A00.A06;
                abstractC1230Yb.setToolbarActionMode(1);
                interfaceC1515dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1515dm3.ADc(i);
            }
        }
        interfaceC1515dm = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC1515dm.AFw(false);
        interfaceC1515dm3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC1515dm3.ADc(i);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f) {
        InterfaceC1515dm interfaceC1515dm;
        int i;
        DZ dz;
        DZ dz2;
        int i2;
        interfaceC1515dm = this.A00.A07;
        i = this.A00.A03;
        interfaceC1515dm.ADw(i - f);
        dz = this.A00.A02;
        if (dz != null) {
            dz2 = this.A00.A02;
            i2 = this.A00.A03;
            dz2.A07((int) (i2 - f));
        }
    }
}

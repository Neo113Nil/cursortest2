package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2133Vw extends N2 {
    public static byte[] A01;
    public final /* synthetic */ UK A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, 63};
    }

    public C2133Vw(UK uk) {
        this.A00 = uk;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0B(C2834ju c2834ju) {
        this.A00.A1d(c2834ju);
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        InterfaceC2082Tv interfaceC2082Tv;
        InterfaceC2082Tv interfaceC2082Tv2;
        interfaceC2082Tv = this.A00.A0I;
        if (interfaceC2082Tv != null) {
            interfaceC2082Tv2 = this.A00.A0I;
            interfaceC2082Tv2.ACm();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(N1 n1) {
        C15227g c15227g;
        C15227g c15227g2;
        c15227g = this.A00.A0B;
        if (c15227g != null) {
            c15227g2 = this.A00.A0B;
            c15227g2.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(C2124Vm c2124Vm) {
        long j;
        InterfaceC2082Tv interfaceC2082Tv;
        InterfaceC2082Tv interfaceC2082Tv2;
        InterfaceC1878Lt A0F = this.A00.A16().A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c2124Vm.A03().getErrorCode(), c2124Vm.A04());
        interfaceC2082Tv = this.A00.A0I;
        if (interfaceC2082Tv != null) {
            interfaceC2082Tv2 = this.A00.A0I;
            interfaceC2082Tv2.ADp(c2124Vm);
        }
    }
}

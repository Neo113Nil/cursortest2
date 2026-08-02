package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1176Vw extends N2 {
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

    public C1176Vw(UK uk2) {
        this.A00 = uk2;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0B(C1877ju c1877ju) {
        this.A00.A1d(c1877ju);
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        InterfaceC1125Tv interfaceC1125Tv;
        InterfaceC1125Tv interfaceC1125Tv2;
        interfaceC1125Tv = this.A00.A0I;
        if (interfaceC1125Tv != null) {
            interfaceC1125Tv2 = this.A00.A0I;
            interfaceC1125Tv2.ACm();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C05657g c05657g;
        C05657g c05657g2;
        c05657g = this.A00.A0B;
        if (c05657g != null) {
            c05657g2 = this.A00.A0B;
            c05657g2.A0M();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C1167Vm c1167Vm) {
        long j;
        InterfaceC1125Tv interfaceC1125Tv;
        InterfaceC1125Tv interfaceC1125Tv2;
        InterfaceC0921Lt A0F = this.A00.A16().A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c1167Vm.A03().getErrorCode(), c1167Vm.A04());
        interfaceC1125Tv = this.A00.A0I;
        if (interfaceC1125Tv != null) {
            interfaceC1125Tv2 = this.A00.A0I;
            interfaceC1125Tv2.ADp(c1167Vm);
        }
    }
}

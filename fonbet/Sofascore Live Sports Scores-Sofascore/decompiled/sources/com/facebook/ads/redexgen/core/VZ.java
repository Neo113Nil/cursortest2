package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class VZ implements InterfaceC2050Sp {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C2834ju A00;
    public final /* synthetic */ UK A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{28, 55, 63, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, 63, 55, 4};
    }

    static {
        A01();
    }

    public VZ(UK uk, C2834ju c2834ju, boolean z) {
        this.A01 = uk;
        this.A00 = c2834ju;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2050Sp
    public final void ADL() {
        C2652gi c2652gi;
        long j;
        InterfaceC2082Tv interfaceC2082Tv;
        InterfaceC2082Tv interfaceC2082Tv2;
        if (this.A01.A0e != null) {
            this.A01.A0e.A0J();
            this.A01.A0e = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c2652gi = this.A01.A0g;
        InterfaceC1878Lt A0F = c2652gi.A0F();
        j = this.A01.A00;
        A0F.A3N(Y1.A01(j), adErrorType.getErrorCode(), A00);
        interfaceC2082Tv = this.A01.A0I;
        if (interfaceC2082Tv != null) {
            interfaceC2082Tv2 = this.A01.A0I;
            interfaceC2082Tv2.ADp(C2124Vm.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2050Sp
    public final void ADT() {
        InterfaceC2082Tv interfaceC2082Tv;
        VW vw;
        C2652gi c2652gi;
        InterfaceC2082Tv interfaceC2082Tv2;
        C2652gi c2652gi2;
        boolean A0r;
        InterfaceC2082Tv interfaceC2082Tv3;
        C15227g c15227g;
        C15227g c15227g2;
        this.A01.A0e = this.A00;
        if (this.A02) {
            c15227g = this.A01.A0B;
            if (c15227g != null) {
                c15227g2 = this.A01.A0B;
                c15227g2.A0L();
            }
        }
        interfaceC2082Tv = this.A01.A0I;
        if (interfaceC2082Tv != null) {
            vw = this.A01.A0G;
            if (vw.equals(VW.A04)) {
                A0r = this.A01.A0r();
                if (!A0r) {
                    interfaceC2082Tv3 = this.A01.A0I;
                    interfaceC2082Tv3.AEq();
                }
            }
            if (this.A02) {
                UK uk = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c2652gi = uk.A0g;
                    if (C2102Up.A1s(c2652gi) && this.A01.A13() != null && this.A01.A13().A1g()) {
                        UK uk2 = this.A01;
                        c2652gi2 = this.A01.A0g;
                        uk2.A0P = AbstractC2437dD.A01(c2652gi2, this.A01.A13(), 4, new C2128Vr(this));
                        return;
                    } else {
                        UK uk3 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            interfaceC2082Tv2 = uk3.A0I;
                            interfaceC2082Tv2.ACq();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}

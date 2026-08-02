package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class VZ implements InterfaceC1093Sp {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C1877ju A00;
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
        A03 = new byte[]{Ascii.FS, 55, 63, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, 63, 55, 4};
    }

    static {
        A01();
    }

    public VZ(UK uk2, C1877ju c1877ju, boolean z) {
        this.A01 = uk2;
        this.A00 = c1877ju;
        this.A02 = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1093Sp
    public final void ADL() {
        C1695gi c1695gi;
        long j;
        InterfaceC1125Tv interfaceC1125Tv;
        InterfaceC1125Tv interfaceC1125Tv2;
        if (this.A01.A0e != null) {
            this.A01.A0e.A0J();
            this.A01.A0e = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c1695gi = this.A01.A0g;
        InterfaceC0921Lt A0F = c1695gi.A0F();
        j = this.A01.A00;
        A0F.A3N(Y1.A01(j), adErrorType.getErrorCode(), A00);
        interfaceC1125Tv = this.A01.A0I;
        if (interfaceC1125Tv != null) {
            interfaceC1125Tv2 = this.A01.A0I;
            interfaceC1125Tv2.ADp(C1167Vm.A01(adErrorType, A00));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1093Sp
    public final void ADT() {
        InterfaceC1125Tv interfaceC1125Tv;
        VW vw;
        C1695gi c1695gi;
        InterfaceC1125Tv interfaceC1125Tv2;
        C1695gi c1695gi2;
        boolean A0r;
        InterfaceC1125Tv interfaceC1125Tv3;
        C05657g c05657g;
        C05657g c05657g2;
        this.A01.A0e = this.A00;
        if (this.A02) {
            c05657g = this.A01.A0B;
            if (c05657g != null) {
                c05657g2 = this.A01.A0B;
                c05657g2.A0L();
            }
        }
        interfaceC1125Tv = this.A01.A0I;
        if (interfaceC1125Tv != null) {
            vw = this.A01.A0G;
            if (vw.equals(VW.A04)) {
                A0r = this.A01.A0r();
                if (!A0r) {
                    interfaceC1125Tv3 = this.A01.A0I;
                    interfaceC1125Tv3.AEq();
                }
            }
            if (this.A02) {
                UK uk2 = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c1695gi = uk2.A0g;
                    if (C1145Up.A1s(c1695gi) && this.A01.A13() != null && this.A01.A13().A1g()) {
                        UK uk3 = this.A01;
                        c1695gi2 = this.A01.A0g;
                        uk3.A0P = AbstractC1480dD.A01(c1695gi2, this.A01.A13(), 4, new C1171Vr(this));
                        return;
                    } else {
                        UK uk4 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            interfaceC1125Tv2 = uk4.A0I;
                            interfaceC1125Tv2.ACq();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}

package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class L9 {
    public static byte[] A02;
    public final List<C2255qI> A00;
    public final InterfaceC0802Hd[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, -100, -92, -113, -102, -105, -110, 78, -111, -102, -99, -95, -109, -110, 78, -111, -113, -98, -94, -105, -99, -100, 78, -101, -105, -101, -109, 78, -94, -89, -98, -109, 78, -98, -96, -99, -92, -105, -110, -109, -110, 104, 78, -123, -108, -108, -112, -115, -121, -123, -104, -115, -109, -110, 83, -121, -119, -123, 81, 90, 84, 92, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -47, -45, -49, -101, -91, -98, -90};
    }

    public L9(List<C2255qI> list) {
        this.A00 = list;
        this.A01 = new InterfaceC0802Hd[list.size()];
    }

    public final void A02(long j, C05024v c05024v) {
        H3.A03(j, c05024v, this.A01);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(HA ha, LG lg) {
        for (int i = 0; i < i; i++) {
            lg.A05();
            InterfaceC0802Hd AKS = ha.AKS(lg.A03(), 3);
            C2255qI c2255qI = this.A00.get(i);
            String str = c2255qI.A0W;
            AbstractC04793y.A09(A00(43, 19, 7).equals(str) || A00(62, 19, 81).equals(str), A00(0, 43, 17) + str);
            C04462p A11 = new C04462p().A0y(c2255qI.A0T != null ? c2255qI.A0T : lg.A04()).A11(str);
            int i2 = c2255qI.A0H;
            C04462p A10 = A11.A0n(i2).A10(c2255qI.A0V);
            int i3 = c2255qI.A03;
            AKS.A6e(A10.A0Z(i3).A12(c2255qI.A0X).A14());
            this.A01[i] = AKS;
        }
    }
}

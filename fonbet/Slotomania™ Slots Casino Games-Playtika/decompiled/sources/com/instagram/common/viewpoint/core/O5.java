package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.VT, 77, 81, 72, 73, 93, 90, SignedBytes.MAX_POWER_OF_TWO, 81, 70, 71, SignedBytes.MAX_POWER_OF_TWO, 93, SignedBytes.MAX_POWER_OF_TWO, 93, 85, 88};
    }

    public static void A02(C1695gi c1695gi, AbstractC1860jd abstractC1860jd, boolean z, O3 o3) {
        if (!C1145Up.A2E(c1695gi)) {
            C1101Sx c1101Sx = new C1101Sx(c1695gi);
            C0967No A07 = abstractC1860jd.A29().A0H().A07();
            c1101Sx.A0e(new VI(abstractC1860jd.A2E(), c1695gi.A0A()));
            if (A07 == null) {
                o3.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (A07.A0Y()) {
                o3.AFG();
                return;
            }
            C1097St c1097St = new C1097St(A07.A0L(), abstractC1860jd.A1D(), abstractC1860jd.A10());
            c1097St.A04 = true;
            c1097St.A03 = A00(0, 5, 86);
            switch (O2.A00[A07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c1101Sx.A0Y(c1097St);
                    break;
            }
            c1101Sx.A0c(new C1099Sv(abstractC1860jd.A2C().A01(), -1, -1, abstractC1860jd.A1D(), abstractC1860jd.A10()));
            c1101Sx.A0c(new C1099Sv(A07.A0K(), -1, -1, abstractC1860jd.A1D(), abstractC1860jd.A10()));
            O0.A00(abstractC1860jd, c1101Sx, A00(5, 12, 71));
            c1101Sx.A0X(new C1838jA(c1695gi, o3, c1101Sx, A07, z), new C1094Sq(abstractC1860jd.A1D(), abstractC1860jd.A10()));
            return;
        }
        o3.AFG();
    }
}

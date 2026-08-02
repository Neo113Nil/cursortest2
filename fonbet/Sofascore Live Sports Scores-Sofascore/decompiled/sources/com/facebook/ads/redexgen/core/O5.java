package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.vungle.ads.internal.protos.Sdk;
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
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88};
    }

    public static void A02(C2652gi c2652gi, AbstractC2817jd abstractC2817jd, boolean z, O3 o3) {
        if (!C2102Up.A2E(c2652gi)) {
            C2058Sx c2058Sx = new C2058Sx(c2652gi);
            C1924No A07 = abstractC2817jd.A29().A0H().A07();
            c2058Sx.A0e(new VI(abstractC2817jd.A2E(), c2652gi.A0A()));
            if (A07 == null) {
                o3.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (A07.A0Y()) {
                o3.AFG();
                return;
            }
            C2054St c2054St = new C2054St(A07.A0L(), abstractC2817jd.A1D(), abstractC2817jd.A10());
            c2054St.A04 = true;
            c2054St.A03 = A00(0, 5, 86);
            switch (O2.A00[A07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c2058Sx.A0Y(c2054St);
                    break;
            }
            c2058Sx.A0c(new C2056Sv(abstractC2817jd.A2C().A01(), -1, -1, abstractC2817jd.A1D(), abstractC2817jd.A10()));
            c2058Sx.A0c(new C2056Sv(A07.A0K(), -1, -1, abstractC2817jd.A1D(), abstractC2817jd.A10()));
            O0.A00(abstractC2817jd, c2058Sx, A00(5, 12, 71));
            c2058Sx.A0X(new C2795jA(c2652gi, o3, c2058Sx, A07, z), new C2051Sq(abstractC2817jd.A1D(), abstractC2817jd.A10()));
            return;
        }
        o3.AFG();
    }
}

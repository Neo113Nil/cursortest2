package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x00da */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A02(C2652gi c2652gi, C2058Sx c2058Sx, C15277l c15277l) {
        c2058Sx.A0d(new C2056Sv(c15277l.A2C().A01(), C2489e4.A04, C2489e4.A04, c15277l.A1D(), A00(17, 14, 113)));
        boolean A1g = c15277l.A1g();
        String A002 = A00(17, 14, 113);
        if (A1g) {
            C2054St c2054St = new C2054St(c15277l.A0x(), c15277l.A1D(), A002);
            c2054St.A04 = true;
            c2054St.A03 = A00(0, 5, 66);
            c2058Sx.A0Y(c2054St);
        }
        boolean A30 = C2102Up.A30(c2652gi, C2579fX.A03());
        C2054St c2054St2 = new C2054St(c15277l.A29().A0H().A09(), c15277l.A1D(), A00(17, 14, 113), c15277l.A29().A0H().A06());
        if (A1g && !A30) {
            c2058Sx.A0Y(c2054St2);
        } else {
            c2058Sx.A0b(c2054St2);
        }
        c2058Sx.A0d(new C2056Sv(c15277l.A29().A0H().A08(), O1.A00(c15277l.A29().A0H()), O1.A01(c15277l.A29().A0H()), c15277l.A1D(), A00(17, 14, 113)));
        O0.A00(c15277l, c2058Sx, A002);
        Iterator<String> it = c15277l.A29().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c2058Sx.A0d(new C2056Sv(url, -1, -1, c15277l.A1D(), A00(17, 14, 113)));
        }
    }

    public static void A03(C2652gi c2652gi, C2058Sx c2058Sx, C15277l c15277l) {
        int i = 0;
        for (NR nr : c15277l.A2G()) {
            C2056Sv c2056Sv = new C2056Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), c15277l.A1D(), A00(5, 12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
            if (i == 0) {
                c2058Sx.A0c(c2056Sv);
            } else {
                c2058Sx.A0d(c2056Sv);
            }
            O0.A00(c15277l, c2058Sx, A00(17, 14, 113));
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c2058Sx.A0d(new C2056Sv(it.next(), -1, -1, c15277l.A1D(), A00(5, 12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)));
            }
            if (!TextUtils.isEmpty(nr.A0H().A09())) {
                new C2054St(nr.A0H().A09(), c15277l.A1D(), A00(5, 12, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), nr.A0H().A06()).A04 = false;
            }
            i++;
        }
    }
}

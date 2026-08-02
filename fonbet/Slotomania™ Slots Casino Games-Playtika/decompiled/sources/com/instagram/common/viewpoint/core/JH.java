package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class JH {
    public static byte[] A00;
    public static String[] A01 = {"f", "wBzTr9isyWuzk0Was82fzP", "sjHXZ8xDB", "rmj8ZpQPq6N", "k0JnkexrU5JvppKLiAvWnmQe", "wOTrIZh22Rcriy8Kptm38zvp", "MO9vm10BV89BFpJ5cx5aSl", "G2cEiJ7mV"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {-68, -33, -33, -44, -83, -32, -37, -39, -63, -32, -43, -40, -20, 5, 10, Ascii.FF, 7, 7, 6, 9, Ascii.VT, -4, -5, -73, 7, 10, 10, -1, -73, Ascii.CR, -4, 9, 10, 0, 6, 5, -47, -73};
        String[] strArr = A01;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "tjOAGVDnT";
        strArr2[7] = "ur6F1gHbb";
        A00 = bArr;
    }

    static {
        A03();
    }

    public static JG A00(byte[] bArr) {
        C05024v c05024v = new C05024v(bArr);
        if (c05024v.A0A() < 32) {
            return null;
        }
        c05024v.A0f(0);
        if (c05024v.A0C() != c05024v.A07() + 4 || c05024v.A0C() != 1886614376) {
            return null;
        }
        int dataSize = AbstractC0844Iu.A01(c05024v.A0C());
        if (dataSize > 1) {
            AbstractC04874g.A07(A01(0, 12, 82), A01(12, 26, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) + dataSize);
            return null;
        }
        UUID uuid = new UUID(c05024v.A0P(), c05024v.A0P());
        if (dataSize == 1) {
            c05024v.A0g(c05024v.A0L() * 16);
        }
        int atomType = c05024v.A0L();
        String[] strArr = A01;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[6] = "Op4nBnIC0DPoqkcvuw04qL";
        if (atomType != c05024v.A07()) {
            return null;
        }
        byte[] bArr2 = new byte[atomType];
        c05024v.A0k(bArr2, 0, atomType);
        return new JG(uuid, dataSize, bArr2);
    }

    public static UUID A02(byte[] bArr) {
        UUID uuid;
        JG parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            uuid = parsedAtom.A01;
            return uuid;
        }
        return null;
    }
}

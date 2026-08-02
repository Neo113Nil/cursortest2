package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2260aM {
    A03,
    A02,
    A07,
    A06,
    A04,
    A05;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{35, 40, 34, 57, 37, 39, 52, 34, 2, 13, 22, 23, 16, 27, 7, 5, 22, 0, 37, 45, 44, 33, 61, 37, 55, 58, 45, 43, 60, 41, 38, 47, 36, 45, 78, 65, 84, 73, 86, 69, 33, 35, 52, 46, 35, 52, 38, 48, 35, 53, 46, 34, 50, 35, 52, 52, 63, 87, 64, 82, 68, 87, 65, 90, 86, 80, 70, 70, 64, 86, 86, 90, 86, 70, 87, 64, 64, 75};
    }

    static {
        A01();
    }
}

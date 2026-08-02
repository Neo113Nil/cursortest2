package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class T0 {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, 23, 25, 30, 27, -42, 26, 37, 45, 36, 34, 37, 23, 26, -42, 28, 23, 31, 34, 43, 40, 27, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, 22, 17, 21, 36, 23, 19, 38, 27, 40, 23, 17, 37, 27, 44, 23, 17, 20, 43, 38, 23, 37, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, 29, 32, 27, 34, 43, 46, 41, 29, 48, 27, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, 30, 28, 30, 35, 32, 63, 61, 63, 68, 65, 59, 63, 75, 74, 80, 65, 84, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, 23, 27, 15, 21, 19, 28, 31, 17, 20, 15, 36, 25, 29, 21, 70, 67, 61};
    }

    static {
        A01();
        A09 = T0.class.getSimpleName();
        A05 = AbstractC2064Td.A0o;
        A06 = AbstractC2064Td.A0s;
        A02 = AbstractC2064Td.A0l;
        A01 = AbstractC2064Td.A0k;
        A03 = AbstractC2064Td.A0m;
        A00 = AbstractC2064Td.A0i;
        A04 = AbstractC2064Td.A0n;
        A07 = AbstractC2064Td.A0t;
    }

    public static void A02(T8 t8, C2051Sq c2051Sq, int i, String str, long j) {
        if (!A06(t8)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c2051Sq.A01);
            jSONObject.put(A00(134, 13, 46), c2051Sq.A02);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 73), Y1.A07(System.currentTimeMillis() - j));
            }
            C2065Te c2065Te = new C2065Te(str);
            c2065Te.A07(jSONObject);
            c2065Te.A05(1);
            t8.A08().ABD(A00(154, 5, 84), i, c2065Te);
        } catch (Throwable deLogException) {
            t8.A08().A4I(deLogException);
        }
    }

    public static void A03(T8 t8, C2056Sv c2056Sv, String str, int i, String str2, Long l, Long l2) {
        if (A06(t8)) {
            A05(t8, c2056Sv.A06, c2056Sv.A07, c2056Sv.A08, A00(186, 5, 71), str, i, str2, l, l2, null);
        }
    }

    public static void A04(T8 t8, C2060Sz c2060Sz, boolean z) {
        if (!A06(t8)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c2060Sz.A01);
            jSONObject.put(A00(134, 13, 46), c2060Sz.A03);
            jSONObject.put(A00(104, 16, 23), c2060Sz.A02);
            jSONObject.put(A00(159, 13, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), c2060Sz.A00);
            if (C2102Up.A2T(t8)) {
                jSONObject.put(A00(200, 3, 106), c2060Sz.A04);
            }
            String A002 = z ? A00(61, 10, 6) : A00(71, 11, 23);
            int i = z ? A05 : A06;
            C2065Te c2065Te = new C2065Te(A002);
            c2065Te.A07(jSONObject);
            c2065Te.A05(1);
            t8.A08().ABD(A00(154, 5, 84), i, c2065Te);
        } catch (Throwable th) {
            t8.A08().A4I(th);
        }
    }

    public static void A05(T8 t8, String str, String str2, String str3, String str4, String str5, int i, String str6, Long l, Long l2, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(191, 9, 73), String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), str5);
            if (C2102Up.A2T(t8)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String A002 = A00(19, 19, 14);
            if (i == A03) {
                A002 = A00(38, 23, 79);
            } else if (i == A01) {
                A002 = A00(0, 19, 39);
            }
            C2065Te c2065Te = new C2065Te(A002);
            c2065Te.A07(jSONObject);
            c2065Te.A05(1);
            t8.A08().ABD(A00(154, 5, 84), i, c2065Te);
        } catch (Throwable th) {
            t8.A08().A4I(th);
        }
    }

    public static boolean A06(T8 t8) {
        int A062;
        if (t8.A05().AAO()) {
            A062 = 1;
        } else {
            A062 = AbstractC2104Ur.A06(t8);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || t8.A09().A00() <= 1.0d / ((double) A062);
    }
}

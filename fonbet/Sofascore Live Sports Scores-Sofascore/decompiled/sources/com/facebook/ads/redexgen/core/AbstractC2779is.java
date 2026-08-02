package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Random;

/* renamed from: com.facebook.ads.redexgen.X.is, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2779is {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static final Random A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{39, 0, 8, 13, 4, 5, 65, 21, 14, 65, 19, 4, 21, 19, 8, 4, 23, 4, 65, 44, 4, 5, 8, 0, 39, 14, 19, 12, 0, 21, 73, 100, 115, 110, 68, 121, 110, 84, 117, 104, 109, 9, 43, 54, 33, 32, 116, 10, 45, 56, 45, 44, 42, 126, 72, 89, 13, 108, 100, 13, 107, Byte.MAX_VALUE, 110, 13, 124, 107, 105, 13, 65, 72, 91, 72, 65, 13, 89, 66, 13, 8, 73, 59, 13, 28, 72, 41, 33, 72, 46, 58, 43, 72, 26, 13, 25, 29, 13, 27, 28, 72, 28, 7, 72, 89, 12, 58, 43, Byte.MAX_VALUE, 30, 22, Byte.MAX_VALUE, 25, 13, 28, Byte.MAX_VALUE, 41, 54, 59, 58, 48, Byte.MAX_VALUE, 59, 42, 45, 62, 43, 54, 48, 49, Byte.MAX_VALUE, 43, 48, Byte.MAX_VALUE, 122, 59, 37, 40, 36, 42, 37, 57, 19, 14, 10, 2, 8, 18, 19, 56, 19, 21, 30, 14, 9, 0, 56, 19, 8, 56, 1, 14, 9, 3, 56, 20, 2, 0, 10, 2, 9, 19, 56, 14, 9, 56, 8, 14, 11, 15, 28, 23, 29, 22, 11, 87, 10, 28, 26, 84, 24, 16, 31, 11, 26, 84, 13, 11, 24, 23, 10, 31, 28, 11, 84, 11, 28, 8, 12, 28, 10, 13, 87, 15, 24, 21, 12, 28, 112, 99, 104, 98, 105, 116, 40, 117, 99, 101, 43, 103, 111, 96, 116, 101, 43, 112, 111, 98, 99, 105, 43, 98, 115, 116, 103, 114, 111, 105, 104, 40, 112, 103, 106, 115, 99, 78, 93, 86, 92, 87, 74, 22, 75, 93, 91, 21, 89, 81, 94, 74, 91, 21, 78, 81, 92, 93, 87, 21, 73, 94, 92, 21, 84, 93, 78, 93, 84, 22, 78, 89, 84, 77, 93, 89, 71, 74, 90, 70};
    }

    static {
        A02();
        A00 = A01(41, 12, 83);
        A01 = A01(139, 37, 109);
        A03 = new Random();
    }

    public static int A00(int i, int i2) {
        if (i2 != 0) {
            return (int) ((Math.pow(2.0d, i - 1) * i2 * 1000.0d) + A03.nextInt(2000));
        }
        return (int) Math.min(((i - 1) * 1000) + 500, 5000L);
    }

    public static void A03(C2808jQ c2808jQ, MediaFormat mediaFormat) {
        String A012 = A01(0, 30, 107);
        String A013 = A01(30, 11, 11);
        if (!c2808jQ.A01) {
            return;
        }
        try {
            if (C2777iq.A02()) {
                if (c2808jQ.A0P && !C2777iq.A03(mediaFormat.getInteger(A01(290, 5, 36)), mediaFormat.getInteger(A01(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 6, 71)))) {
                    return;
                }
                long j = c2808jQ.A00;
                if (j > 0) {
                    mediaFormat.setLong(A01(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 37, 12), j);
                    AbstractC2709hd.A01(A013, A01(102, 31, 85), Long.valueOf(j));
                }
                mediaFormat.setInteger(A01(252, 38, 50), c2808jQ.A02);
                AbstractC2709hd.A01(A013, A01(53, 26, 39), Integer.valueOf(c2808jQ.A02));
                mediaFormat.setInteger(A01(176, 39, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), 1);
                AbstractC2709hd.A00(A013, A01(79, 23, 98));
            }
        } catch (ClassCastException e) {
            AbstractC2709hd.A02(A013, A012, e);
        } catch (NullPointerException e2) {
            AbstractC2709hd.A02(A013, A012, e2);
        }
    }

    public static boolean A04(C2808jQ c2808jQ, int i, int i2, int i3, int i4) {
        if (c2808jQ.A01 && c2808jQ.A0P && C2777iq.A03(i, i2) != C2777iq.A03(i3, i4)) {
            return true;
        }
        return false;
    }
}

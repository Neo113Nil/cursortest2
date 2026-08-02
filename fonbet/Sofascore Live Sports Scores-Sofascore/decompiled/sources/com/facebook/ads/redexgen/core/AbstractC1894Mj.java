package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC1894Mj {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, 28, 19, 3, 16, 9, 18, 17, 36, 27, 11, 30, 17, 16, 21, 30};
    }

    public static long A00(InterfaceC1895Mk interfaceC1895Mk) {
        return interfaceC1895Mk.A6h(A02(0, 7, 111), -1L);
    }

    public static Uri A01(InterfaceC1895Mk interfaceC1895Mk) {
        String A6j = interfaceC1895Mk.A6j(A02(7, 9, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), null);
        if (A6j == null) {
            return null;
        }
        return Uri.parse(A6j);
    }
}

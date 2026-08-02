package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class JC extends AbstractRunnableC2139Wc {
    public static byte[] A01;
    public final /* synthetic */ C2428d4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-87, -68, -73, -72, -62, 115, -63, -72, -55, -72, -59, 115, -58, -57, -76, -59, -57, -72, -73, 115, -61, -65, -76, -52, -68, -63, -70};
    }

    public JC(C2428d4 c2428d4) {
        this.A00 = c2428d4;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        boolean z;
        z = this.A00.A04;
        if (z) {
            return;
        }
        this.A00.A0I(A00(0, 27, 64));
    }
}

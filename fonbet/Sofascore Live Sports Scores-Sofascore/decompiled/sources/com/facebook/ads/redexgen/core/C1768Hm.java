package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1768Hm extends AbstractRunnableC2139Wc {
    public static byte[] A02;
    public final /* synthetic */ AnonymousClass55 A00;
    public final /* synthetic */ C4A A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{21, 72, 57, 57, 56, 69, 60, 65, 58, -13, 60, 65, 55, 56, 57, 60, 65, 60, 71, 56, 63, 76};
    }

    public C1768Hm(AnonymousClass55 anonymousClass55, C4A c4a) {
        this.A00 = anonymousClass55;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        C1689Ek c1689Ek;
        C1689Ek c1689Ek2;
        c1689Ek = this.A00.A0b;
        if (c1689Ek.getState() == EnumC2594fm.A02) {
            c1689Ek2 = this.A00.A0b;
            if (c1689Ek2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0s(A00(0, 22, 104));
            }
        }
    }
}

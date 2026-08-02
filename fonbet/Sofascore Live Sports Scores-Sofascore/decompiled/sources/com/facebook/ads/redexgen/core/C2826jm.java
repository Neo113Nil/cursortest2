package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2826jm extends AbstractRunnableC2139Wc {
    public static byte[] A01;
    public final /* synthetic */ C2825jl A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C2826jm(C2825jl c2825jl) {
        this.A00 = c2825jl;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        C2652gi c2652gi;
        AbstractC2298ay abstractC2298ay;
        C2827jn c2827jn;
        c2652gi = this.A00.A03;
        c2652gi.A0F().AKw();
        abstractC2298ay = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c2827jn = this.A00.A00;
        abstractC2298ay.loadUrl(append.append(c2827jn.A03()).toString());
    }
}

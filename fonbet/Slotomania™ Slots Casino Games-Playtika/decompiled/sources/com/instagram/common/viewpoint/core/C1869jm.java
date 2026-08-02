package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1869jm extends AbstractRunnableC1182Wc {
    public static byte[] A01;
    public final /* synthetic */ C1868jl A00;

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

    public C1869jm(C1868jl c1868jl) {
        this.A00 = c1868jl;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        C1695gi c1695gi;
        AbstractC1341ay abstractC1341ay;
        C1870jn c1870jn;
        c1695gi = this.A00.A03;
        c1695gi.A0F().AKw();
        abstractC1341ay = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c1870jn = this.A00.A00;
        abstractC1341ay.loadUrl(append.append(c1870jn.A03()).toString());
    }
}

package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2841k1 extends AbstractC2596fo {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass81 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C2841k1(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2596fo
    public final void A03() {
        Y2 y2;
        Y2 y22;
        AnonymousClass76 anonymousClass76;
        C2825jl c2825jl;
        AnonymousClass76 anonymousClass762;
        C15307o c15307o;
        C2597fp c2597fp;
        Y2 y23;
        C15307o c15307o2;
        VA va;
        C15307o c15307o3;
        AnonymousClass76 anonymousClass763;
        C15307o c15307o4;
        C15307o c15307o5;
        C1916Ng A2A;
        AnonymousClass76 anonymousClass764;
        C2597fp c2597fp2;
        AnonymousClass76 anonymousClass765;
        C15307o c15307o6;
        y2 = this.A00.A0H;
        if (!y2.A07()) {
            y22 = this.A00.A0H;
            y22.A05();
            anonymousClass76 = this.A00.A04;
            InterfaceC2879kf A0F = anonymousClass76.A0F();
            c2825jl = this.A00.A02;
            A0F.A4Q(c2825jl != null);
            anonymousClass762 = this.A00.A04;
            anonymousClass762.A0F().A3L();
            c15307o = this.A00.A03;
            AbstractC1936Oa.A02(c15307o.A0y(), AbstractC2172Xm.A00(A00(0, 6, 63)));
            C2309b9 c2309b9 = new C2309b9();
            c2597fp = this.A00.A0B;
            C2309b9 A03 = c2309b9.A03(c2597fp);
            y23 = this.A00.A0H;
            C2309b9 A02 = A03.A02(y23);
            c15307o2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c15307o2.A0z()).A05();
            va = this.A00.A05;
            c15307o3 = this.A00.A03;
            va.ABJ(c15307o3.A2E(), A05);
            anonymousClass763 = this.A00.A04;
            if (C2102Up.A1A(anonymousClass763)) {
                anonymousClass765 = this.A00.A04;
                C2148Wl A00 = C2148Wl.A00(anonymousClass765);
                String adPlacementType = AdPlacementType.BANNER.toString();
                c15307o6 = this.A00.A03;
                A00.A0E(adPlacementType, c15307o6.A2E());
            }
            c15307o4 = this.A00.A03;
            if (c15307o4 == null) {
                A2A = null;
            } else {
                c15307o5 = this.A00.A03;
                A2A = c15307o5.A2A();
            }
            anonymousClass764 = this.A00.A04;
            C1916Ng.A07(A2A, anonymousClass764);
            c2597fp2 = this.A00.A0B;
            c2597fp2.A0V();
        }
    }
}

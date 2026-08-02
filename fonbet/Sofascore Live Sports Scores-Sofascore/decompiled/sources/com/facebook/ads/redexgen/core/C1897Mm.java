package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1897Mm implements InterfaceC2020Rk {
    public static String[] A01 = {"OzZgVge9f1M6v6ECGvfzE2lelYGRNpcR", "wWE4h2nZ4zwlNyDcFF4AKhs", "2tlTz3YI6lX4F9BnCi72Ebdo8SjZZSMc", "OEQW3vRvYAQWgt7PHCfPR8E", "3OILw1bCaEkMk35ZNNqR0SRTWeQg1PRg", "i6GFbsYgPXu23Z4kIsNVdeySMROLxMHq", "jYSQemNdDQ7ZZ3K3t", "DXND3IEKe4RSyw4IFeihHP08ajxTSSoO"};
    public final /* synthetic */ MW A00;

    public C1897Mm(MW mw) {
        this.A00 = mw;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2020Rk
    public final boolean AAI() {
        boolean z;
        C2513eS c2513eS;
        C2513eS c2513eS2;
        VI vi;
        InterfaceC2193Yh interfaceC2193Yh;
        ZU zu;
        VI vi2;
        InterfaceC2193Yh interfaceC2193Yh2;
        ZU zu2;
        z = this.A00.A0E;
        if (z) {
            if (this.A00.A0U.getToolbarActionMode() == 1) {
                AbstractC2187Yb abstractC2187Yb = this.A00.A0U;
                if (A01[6].length() != 17) {
                    throw new RuntimeException();
                }
                A01[6] = "6SLOwM6DBUuyj18aF";
                abstractC2187Yb.setToolbarActionMode(2);
                this.A00.A0N();
            } else if (this.A00.A0U.getToolbarActionMode() == 0) {
                vi2 = this.A00.A0L;
                vi2.A04(VH.A07, null);
                interfaceC2193Yh2 = this.A00.A0O;
                zu2 = this.A00.A0P;
                interfaceC2193Yh2.A4j(zu2.A7w());
            } else {
                c2513eS = this.A00.A09;
                if (c2513eS != null) {
                    c2513eS2 = this.A00.A09;
                    if (c2513eS2.A0h()) {
                        vi = this.A00.A0L;
                        vi.A04(VH.A07, null);
                        interfaceC2193Yh = this.A00.A0O;
                        zu = this.A00.A0P;
                        interfaceC2193Yh.A4j(zu.A7w());
                    }
                }
            }
            return true;
        }
        return false;
    }
}

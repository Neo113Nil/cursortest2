package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C14333v extends AbstractC1672Dt {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", "dl", "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ C1665Dm A00;

    public C14333v(C1665Dm c1665Dm) {
        this.A00 = c1665Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1673Du c1673Du) {
        C1689Ek c1689Ek;
        boolean z;
        Handler handler;
        boolean A0G;
        boolean z2;
        Handler handler2;
        int i;
        c1689Ek = this.A00.A01;
        if (c1689Ek == null) {
            return;
        }
        z = this.A00.A05;
        if (!z && c1673Du.A00().getAction() == 0) {
            C1665Dm c1665Dm = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            handler = c1665Dm.A07;
            handler.removeCallbacksAndMessages(null);
            A0G = this.A00.A0G(EnumC2565fJ.A04);
            if (A0G) {
                this.A00.A03();
                C1665Dm c1665Dm2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c1665Dm2.A06(true, false);
                } else {
                    c1665Dm2.A06(true, false);
                }
            }
            z2 = this.A00.A04;
            if (!z2) {
                return;
            }
            handler2 = this.A00.A07;
            C1666Dn c1666Dn = new C1666Dn(this);
            i = this.A00.A00;
            handler2.postDelayed(c1666Dn, i);
        }
    }
}

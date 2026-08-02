package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1737hO extends WP {
    public static String[] A01 = {"12g74Y80MldwuLH5Sc5BNMhqIci3y3n7", "gYGMtvDgCappq8Eqx1aX2vuQToh52UHd", "GlXHohOtVJhIOcbHhrFcSUyeAoJlZUN4", "CknPoCaYYZqOx1VHoQWkocTpfCeiqOL0", "IgiYYUSARpIlAyCBMTexeC9bH0PhGiJU", "Cia0Frm0699G8jcollxZnIfMYARIEex0", "Mzdi9MK983UUFZlepuPfFCQdgw1DK7MX", "jSW62lJNNGtUKopGO2HTdr7H5wR53AmM"};
    public final /* synthetic */ C1735hM A00;

    public C1737hO(C1735hM c1735hM) {
        this.A00 = c1735hM;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        C1056Rd c1056Rd;
        C1056Rd c1056Rd2;
        C1056Rd c1056Rd3;
        c1056Rd = this.A00.A01;
        if (c1056Rd.A06() != null) {
            c1056Rd2 = this.A00.A01;
            String[] strArr = A01;
            if (strArr[3].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "nnCrEA10h1A2hd08C5n1xIwFCKPiTwdC";
            strArr2[0] = "49SRRBhRmQihygS20ldMlh5Gkuzwxt90";
            AdListener A06 = c1056Rd2.A06();
            c1056Rd3 = this.A00.A01;
            A06.onAdClicked(c1056Rd3.A07());
        }
    }
}

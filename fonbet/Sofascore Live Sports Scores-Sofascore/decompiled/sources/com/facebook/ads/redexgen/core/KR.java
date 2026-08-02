package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class KR implements InterfaceC2290aq {
    public static byte[] A01;
    public final /* synthetic */ KE A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, 61, 59, 53, 72, 61, 67, 66, 51, 61, 53, 54};
    }

    public KR(KE ke) {
        this.A00 = ke;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AF7(String str) {
        C2281ah c2281ah;
        AbstractC2817jd abstractC2817jd;
        M3 m3;
        AbstractC2817jd abstractC2817jd2;
        M3 m32;
        this.A00.A0T = false;
        this.A00.setBrowserProgressBarValue(100);
        c2281ah = this.A00.A0H;
        YB.A0O(c2281ah, 8);
        abstractC2817jd = this.A00.A0E;
        if (abstractC2817jd.A1l()) {
            m3 = this.A00.A0I;
            if (m3 != null) {
                abstractC2817jd2 = this.A00.A0E;
                String A14 = abstractC2817jd2.A14();
                if (!TextUtils.isEmpty(A14)) {
                    m32 = this.A00.A0I;
                    m32.loadUrl(A14);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AF9(String str) {
        C2281ah c2281ah;
        boolean z;
        int i;
        this.A00.A0T = true;
        c2281ah = this.A00.A0H;
        YB.A0O(c2281ah, 0);
        this.A00.setUrlToBrowser(str);
        z = this.A00.A0R;
        if (!z) {
            i = this.A00.A01;
            if (i > 1) {
                this.A00.A0R = true;
                this.A00.A0h(A00(0, 19, 108));
            }
        }
        KE.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AFY(int i) {
        boolean z;
        z = this.A00.A0T;
        if (z) {
            this.A00.setBrowserProgressBarValue(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AFb(String str) {
        this.A00.setTitleToBrowser(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AFe() {
        C2369c7 c2369c7;
        c2369c7 = this.A00.A0J;
        c2369c7.A0C().ADJ(14);
    }
}

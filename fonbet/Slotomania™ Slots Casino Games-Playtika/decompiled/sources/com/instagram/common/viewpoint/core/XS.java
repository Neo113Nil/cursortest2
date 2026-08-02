package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network/classes2.dex */
public final class XS {
    public static String[] A05 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC1860jd A02;
    public final C1695gi A03;
    public final XQ A04;

    public XS(C1695gi c1695gi, AbstractC1860jd abstractC1860jd, XQ xq) {
        this.A03 = c1695gi;
        this.A04 = xq;
        this.A02 = abstractC1860jd;
    }

    public static XS A00(C1695gi c1695gi, AbstractC1860jd abstractC1860jd, XQ xq) {
        Object creativeAsCtaLoggingHelper = c1695gi.A0I();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new XS(c1695gi, abstractC1860jd, xq);
            c1695gi.A0P(creativeAsCtaLoggingHelper);
        }
        return (XS) creativeAsCtaLoggingHelper;
    }

    public static boolean A01(C1695gi c1695gi) {
        return C1145Up.A1g(c1695gi) && X6.A0I(c1695gi);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final XR A02(AbstractC1860jd abstractC1860jd) {
        if (C1145Up.A1m(this.A03)) {
            r4 = abstractC1860jd.A1e() && A01(this.A03);
            return new XR(r4, r4);
        }
        boolean A1e = abstractC1860jd.A1e();
        if (A1e) {
            boolean A01 = A01(this.A03);
            String[] strArr = A05;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
        }
        r4 = false;
        return new XR(A1e, r4);
    }

    public final void A03() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }
}

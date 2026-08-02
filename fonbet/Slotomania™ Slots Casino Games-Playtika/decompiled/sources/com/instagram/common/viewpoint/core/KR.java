package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network/classes2.dex */
public class KR implements InterfaceC1333aq {
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
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, Base64.padSymbol, 59, 53, 72, Base64.padSymbol, 67, 66, 51, Base64.padSymbol, 53, 54};
    }

    public KR(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1333aq
    public final void AF7(String str) {
        C1324ah c1324ah;
        AbstractC1860jd abstractC1860jd;
        M3 m3;
        AbstractC1860jd abstractC1860jd2;
        M3 m32;
        this.A00.A0T = false;
        this.A00.setBrowserProgressBarValue(100);
        c1324ah = this.A00.A0H;
        YB.A0O(c1324ah, 8);
        abstractC1860jd = this.A00.A0E;
        if (abstractC1860jd.A1l()) {
            m3 = this.A00.A0I;
            if (m3 != null) {
                abstractC1860jd2 = this.A00.A0E;
                String A14 = abstractC1860jd2.A14();
                if (!TextUtils.isEmpty(A14)) {
                    m32 = this.A00.A0I;
                    m32.loadUrl(A14);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1333aq
    public final void AF9(String str) {
        C1324ah c1324ah;
        boolean z;
        int i;
        this.A00.A0T = true;
        c1324ah = this.A00.A0H;
        YB.A0O(c1324ah, 0);
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1333aq
    public final void AFY(int i) {
        boolean z;
        z = this.A00.A0T;
        if (z) {
            this.A00.setBrowserProgressBarValue(i);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1333aq
    public final void AFb(String str) {
        this.A00.setTitleToBrowser(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1333aq
    public final void AFe() {
        C1412c7 c1412c7;
        c1412c7 = this.A00.A0J;
        c1412c7.A0C().ADJ(14);
    }
}

package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2471dl implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1734Ge A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, 115, 119, 114, 115, 100};
    }

    public ViewOnClickListenerC2471dl(C1734Ge c1734Ge) {
        this.A00 = c1734Ge;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1791Ij abstractC1791Ij;
        AbstractC1791Ij abstractC1791Ij2;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1791Ij = this.A00.A04;
            if (abstractC1791Ij != null) {
                abstractC1791Ij2 = this.A00.A04;
                abstractC1791Ij2.A1D(A00(0, 6, 84));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

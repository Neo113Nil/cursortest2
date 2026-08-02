package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1453cm implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0858Ji A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 37, 37, 38, 40, 43, 56};
    }

    public ViewOnClickListenerC1453cm(C0858Ji c0858Ji) {
        this.A00 = c0858Ji;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1412c7 c1412c7;
        C1412c7 c1412c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0p(A00(0, 7, 120));
            c1412c7 = this.A00.A0b;
            if (c1412c7.A0D() != null) {
                c1412c72 = this.A00.A0b;
                c1412c72.A0D().ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

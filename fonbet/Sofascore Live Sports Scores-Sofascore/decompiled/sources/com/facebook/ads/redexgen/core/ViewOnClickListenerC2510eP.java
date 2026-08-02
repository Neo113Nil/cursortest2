package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2510eP implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C2513eS A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{4, 15, 5, 2, 0, 19, 5, 18};
    }

    public ViewOnClickListenerC2510eP(C2513eS c2513eS) {
        this.A00 = c2513eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC1850Kr viewOnClickListenerC1850Kr;
        ViewOnClickListenerC1850Kr viewOnClickListenerC1850Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC1850Kr = this.A00.A0l;
            if (viewOnClickListenerC1850Kr == null) {
                return;
            }
            viewOnClickListenerC1850Kr2 = this.A00.A0l;
            viewOnClickListenerC1850Kr2.A0E(A00(0, 8, 44));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

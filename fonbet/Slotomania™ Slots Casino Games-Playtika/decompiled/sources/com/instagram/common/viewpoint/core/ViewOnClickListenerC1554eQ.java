package com.instagram.common.viewpoint.core;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1554eQ implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1556eS A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.EM, Ascii.SYN, Ascii.DC2, Ascii.NAK, Ascii.SYN, 35};
    }

    public ViewOnClickListenerC1554eQ(C1556eS c1556eS) {
        this.A00 = c1556eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC0893Kr viewOnClickListenerC0893Kr;
        ViewOnClickListenerC0893Kr viewOnClickListenerC0893Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0893Kr = this.A00.A0l;
            if (viewOnClickListenerC0893Kr == null) {
                return;
            }
            viewOnClickListenerC0893Kr2 = this.A00.A0l;
            viewOnClickListenerC0893Kr2.A0E(A00(0, 6, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

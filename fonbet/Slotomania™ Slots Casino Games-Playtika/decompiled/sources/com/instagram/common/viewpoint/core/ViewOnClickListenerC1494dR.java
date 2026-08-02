package com.instagram.common.viewpoint.core;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1494dR implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C5F A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.DC4, Ascii.ETB, Ascii.ETB, Ascii.CAN, 39, Ascii.DC4, Ascii.FS, Ascii.US, 38};
    }

    public ViewOnClickListenerC1494dR(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C1444cd c1444cd;
        InterfaceC1515dm interfaceC1515dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0K;
            if (!z) {
                c1444cd = this.A00.A0H;
                c1444cd.A02(A00(0, 9, 103));
                interfaceC1515dm = this.A00.A0Z;
                interfaceC1515dm.ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

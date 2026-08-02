package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2047Sm {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C2048Sn A00;
    public final C2049So A01;
    public final C2648ge A02;
    public final InterfaceC2628gK A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = C2047Sm.class.getSimpleName();
    }

    public C2047Sm(C2648ge c2648ge, CY cy, C2048Sn c2048Sn, C2049So c2049So) {
        this.A02 = c2648ge;
        this.A03 = cy.A5U(EnumC2629gL.A06);
        this.A00 = c2048Sn;
        this.A01 = c2049So;
        this.A03.A41(new C2660gq(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (!this.A03.AAe()) {
                this.A02.A05().AAO();
                return;
            }
            String btExtras = this.A03.A7i().optString(A00(0, 9, 7));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C2102Up.A0j(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class N3 {
    public static byte[] A04;
    public boolean A00;

    @Nullable
    public final N4 A01;
    public final C1695gi A02;
    public final C1640fp A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, Ascii.SUB, 40, 40, Ascii.RS, 36, 35, -43, 33, 36, Ascii.FS, Ascii.FS, Ascii.SUB, Ascii.EM};
    }

    public abstract void A08(Map<String, String> map);

    public N3(C1695gi c1695gi, N4 n4, C1640fp c1640fp) {
        this.A02 = c1695gi;
        this.A01 = n4;
        this.A03 = c1640fp;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new C1352b9().A03(this.A03).A05();
        A08(extraData);
        this.A00 = true;
        XI.A04(this.A02, A00(0, 17, 60));
        N4 n4 = this.A01;
    }
}

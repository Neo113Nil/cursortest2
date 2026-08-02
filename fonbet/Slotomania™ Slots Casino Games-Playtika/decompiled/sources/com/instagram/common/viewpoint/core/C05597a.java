package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05597a extends AbstractC1830j0 {
    public static byte[] A00;
    public static String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C05597a(C1695gi c1695gi, O7 o7) {
        super(c1695gi, o7);
    }

    private C1819ip A00(Runnable runnable) {
        return new C1819ip(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1830j0
    public final void A0P() {
        AbstractC1864jh abstractC1864jh = (AbstractC1864jh) this.A01;
        abstractC1864jh.A00(this.A08.A00);
        abstractC1864jh.A01(this.A08.A01);
        abstractC1864jh.A0J();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1830j0
    public final void A0R(N1 n1, C1126Tw c1126Tw, C1124Tu c1124Tu, O8 o8) {
        C05817w c05817w = (C05817w) n1;
        C1823it c1823it = new C1823it(this, o8, c05817w);
        if (C1145Up.A2f(this.A0B)) {
            Handler A0H = A0H();
            C1127Tx A05 = c1126Tw.A05();
            String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            A0H.postDelayed(c1823it, A05.A05());
        }
        c05817w.A0K(this.A0B, A00(c1823it), o8, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0a(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A8k() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC1864jh rewardedVideoAdapter = (AbstractC1864jh) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 82));
        }
        throw new IllegalStateException(A01(34, 33, 34));
    }
}

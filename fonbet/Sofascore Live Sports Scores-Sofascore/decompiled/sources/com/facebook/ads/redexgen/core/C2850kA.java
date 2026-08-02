package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.kA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2850kA extends AbstractRunnableC2139Wc {
    public static byte[] A02;
    public final /* synthetic */ N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, 29, 33, 35, 50, 50, 43, 44, 37};
    }

    public C2850kA(N8 n8, String str) {
        this.A00 = n8;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        T8 t8;
        T8 t82;
        CountDownLatch countDownLatch;
        boolean A0J;
        N7 n7;
        N7 n72;
        N7 n73;
        String A00 = A00(0, 17, 81);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                n7 = this.A00.A02;
                ((C1915Nf) n7.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                n72 = this.A00.A02;
                n72.A07(this.A01);
                n73 = this.A00.A02;
                n73.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            t82 = this.A00.A03;
            t82.A08().ABC(A00, AbstractC2064Td.A1B, new C2065Te(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            t8 = this.A00.A03;
            t8.A08().ABC(A00, AbstractC2064Td.A1A, new C2065Te(e2));
        }
    }
}

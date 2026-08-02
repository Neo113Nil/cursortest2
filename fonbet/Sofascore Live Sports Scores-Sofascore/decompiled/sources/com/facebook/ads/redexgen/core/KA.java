package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class KA implements InterfaceC2290aq {
    public static byte[] A01;
    public static String[] A02 = {"Lf", "nmAxyBcQYqE4UmHMsUF1rAa8zTrMAPgx", "yXHjwHYuNIdrzaXYLvaZZ8rDuk", "9P19JGz6dEYaA5InwGx6w36V1Sjc1fgT", "Uaeemoya7byMjdbMYqkdDOMCW0kva5u1", "a9sExJmhm07IJOfFlJQHVREgKDfvTtqT", "zS9IM7X0AIqJ7SZD2m", "JScTq5ptQGF6W5ukeGazDvn9iL3"};
    public final /* synthetic */ C1815Ji A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -31, -45, -32, -51, -36, -49, -28, -41, -43, -49, -30, -41, -35, -36, -51, -41, -49, -48};
    }

    static {
        A01();
    }

    public KA(C1815Ji c1815Ji) {
        this.A00 = c1815Ji;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AF7(String str) {
        C2281ah c2281ah;
        C2281ah c2281ah2;
        AbstractC2817jd abstractC2817jd;
        M3 m3;
        AbstractC2817jd abstractC2817jd2;
        M3 m32;
        C2281ah c2281ah3;
        this.A00.A0K = false;
        c2281ah = this.A00.A07;
        if (c2281ah != null) {
            c2281ah3 = this.A00.A07;
            c2281ah3.setProgress(100);
        }
        c2281ah2 = this.A00.A07;
        YB.A0O(c2281ah2, 8);
        abstractC2817jd = this.A00.A0X;
        if (abstractC2817jd.A1l()) {
            m3 = this.A00.A08;
            if (m3 != null) {
                abstractC2817jd2 = this.A00.A0X;
                String A14 = abstractC2817jd2.A14();
                if (!TextUtils.isEmpty(A14)) {
                    m32 = this.A00.A08;
                    m32.loadUrl(A14);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AF9(String str) {
        C2281ah c2281ah;
        M8 m8;
        boolean z;
        int i;
        M8 m82;
        this.A00.A0K = true;
        c2281ah = this.A00.A07;
        YB.A0O(c2281ah, 0);
        m8 = this.A00.A06;
        if (m8 != null) {
            m82 = this.A00.A06;
            m82.setUrl(str);
        }
        C1815Ji c1815Ji = this.A00;
        String[] strArr = A02;
        if (strArr[4].charAt(17) != strArr[5].charAt(17)) {
            A02[2] = "wX256yuF2";
            z = c1815Ji.A0I;
            if (!z) {
                i = this.A00.A00;
                if (i > 1) {
                    this.A00.A0I = true;
                    this.A00.A0o(A00(0, 19, 95));
                }
            }
            C1815Ji.A02(this.A00);
            if (A02[2].length() != 27) {
                A02[6] = "lsrcQj4qqEXeVsDQCf";
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AFY(int i) {
        boolean z;
        C2281ah c2281ah;
        C2281ah c2281ah2;
        z = this.A00.A0K;
        if (z) {
            c2281ah = this.A00.A07;
            if (c2281ah != null) {
                c2281ah2 = this.A00.A07;
                c2281ah2.setProgress(i);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AFb(String str) {
        M8 m8;
        M8 m82;
        m8 = this.A00.A06;
        if (m8 != null) {
            m82 = this.A00.A06;
            m82.setTitle(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2290aq
    public final void AFe() {
        C2369c7 c2369c7;
        c2369c7 = this.A00.A0b;
        c2369c7.A0C().ADJ(14);
    }
}

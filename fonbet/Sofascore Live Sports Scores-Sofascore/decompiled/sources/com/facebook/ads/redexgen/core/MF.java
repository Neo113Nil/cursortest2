package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class MF implements InterfaceC2217Zf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC2215Zd A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, 13, 15, 76, 4, 3, 1, 7, 0, 13, 13, 9, 76, 3, 6, 17, 76, 3, 6, 16, 7, 18, 13, 16, 22, 11, 12, 5, 76, 36, 43, 44, 43, 49, 42, 61, 35, 38, 61, 48, 39, 50, 45, 48, 54, 43, 44, 37, 61, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public MF(AbstractC2215Zd abstractC2215Zd) {
        this.A00 = abstractC2215Zd;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2217Zf
    public final void A53() {
        InterfaceC2193Yh interfaceC2193Yh;
        InterfaceC2193Yh interfaceC2193Yh2;
        interfaceC2193Yh = this.A00.A09;
        if (interfaceC2193Yh == null) {
            return;
        }
        interfaceC2193Yh2 = this.A00.A09;
        interfaceC2193Yh2.A4j(A00(0, 53, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2217Zf
    public final void A54() {
        InterfaceC2194Yi interfaceC2194Yi;
        InterfaceC2214Zc interfaceC2214Zc;
        InterfaceC2214Zc interfaceC2214Zc2;
        InterfaceC2194Yi interfaceC2194Yi2;
        this.A00.A0P();
        interfaceC2194Yi = this.A00.A0A;
        if (interfaceC2194Yi != null) {
            interfaceC2194Yi2 = this.A00.A0A;
            interfaceC2194Yi2.AFi(true);
        }
        interfaceC2214Zc = this.A00.A05;
        if (interfaceC2214Zc != null) {
            interfaceC2214Zc2 = this.A00.A05;
            interfaceC2214Zc2.ACr();
        }
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2217Zf
    public final void A9c() {
        C1946Ok c1946Ok;
        C1946Ok c1946Ok2;
        C1946Ok c1946Ok3;
        C2652gi c2652gi;
        c1946Ok = this.A00.A04;
        if (c1946Ok == null) {
            A54();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC2215Zd.A03(this.A00);
        c1946Ok2 = this.A00.A04;
        if (c1946Ok2.A02() != null) {
            AbstractC2215Zd abstractC2215Zd = this.A00;
            c1946Ok3 = this.A00.A04;
            abstractC2215Zd.A0H(c1946Ok3.A02());
        } else {
            this.A00.A0F();
        }
        c2652gi = this.A00.A07;
        if (C2102Up.A2Z(c2652gi)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2217Zf
    public final void AAp() {
        C1942Og c1942Og;
        C1945Oj c1945Oj;
        C2652gi c2652gi;
        C1942Og c1942Og2;
        String str;
        c1942Og = this.A00.A06;
        if (!TextUtils.isEmpty(c1942Og.A0I())) {
            X6 x6 = new X6();
            c2652gi = this.A00.A07;
            c1942Og2 = this.A00.A06;
            Uri A00 = XB.A00(c1942Og2.A0I());
            str = this.A00.A0B;
            X6.A0O(x6, c2652gi, A00, str);
        }
        c1945Oj = this.A00.A03;
        c1945Oj.A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2217Zf
    public final void AAq() {
        InterfaceC2194Yi interfaceC2194Yi;
        C1942Og c1942Og;
        C1945Oj c1945Oj;
        C2652gi c2652gi;
        C1942Og c1942Og2;
        String str;
        InterfaceC2194Yi interfaceC2194Yi2;
        this.A00.A0P();
        interfaceC2194Yi = this.A00.A0A;
        if (interfaceC2194Yi != null) {
            interfaceC2194Yi2 = this.A00.A0A;
            interfaceC2194Yi2.AFi(true);
        }
        c1942Og = this.A00.A06;
        if (!TextUtils.isEmpty(c1942Og.A0C())) {
            X6 x6 = new X6();
            c2652gi = this.A00.A07;
            c1942Og2 = this.A00.A06;
            Uri A00 = XB.A00(c1942Og2.A0C());
            str = this.A00.A0B;
            X6.A0O(x6, c2652gi, A00, str);
        }
        c1945Oj = this.A00.A03;
        c1945Oj.A06();
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2217Zf
    public final void AEr(EnumC1944Oi enumC1944Oi) {
        EnumC1944Oi enumC1944Oi2;
        C1942Og c1942Og;
        C1946Ok A0B;
        C1942Og c1942Og2;
        C1942Og c1942Og3;
        AbstractC2215Zd.A02(this.A00);
        this.A00.A02 = enumC1944Oi;
        enumC1944Oi2 = this.A00.A02;
        if (enumC1944Oi2 != EnumC1944Oi.A04) {
            AbstractC2215Zd abstractC2215Zd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c1942Og2 = abstractC2215Zd.A06;
                A0B = c1942Og2.A0B();
            } else {
                c1942Og = abstractC2215Zd.A06;
                A0B = c1942Og.A0B();
            }
        } else {
            c1942Og3 = this.A00.A06;
            A0B = c1942Og3.A0A();
        }
        AbstractC2215Zd abstractC2215Zd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC2215Zd2.A0H(A0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2217Zf
    public final void AF4(C1946Ok c1946Ok) {
        C1945Oj c1945Oj;
        AbstractC2215Zd.A02(this.A00);
        c1945Oj = this.A00.A03;
        c1945Oj.A07(c1946Ok.A01());
        if (!c1946Ok.A05().isEmpty()) {
            AbstractC2215Zd abstractC2215Zd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC2215Zd.A0H(c1946Ok);
            return;
        }
        this.A00.A0G(c1946Ok);
    }
}

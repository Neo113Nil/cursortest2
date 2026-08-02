package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network/classes2.dex */
public class MF implements InterfaceC1260Zf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC1258Zd A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, Ascii.CR, Ascii.SI, 76, 4, 3, 1, 7, 0, Ascii.CR, Ascii.CR, 9, 76, 3, 6, 17, 76, 3, 6, Ascii.DLE, 7, Ascii.DC2, Ascii.CR, Ascii.DLE, Ascii.SYN, Ascii.VT, Ascii.FF, 5, 76, 36, 43, 44, 43, 49, 42, Base64.padSymbol, 35, 38, Base64.padSymbol, 48, 39, 50, 45, 48, 54, 43, 44, 37, Base64.padSymbol, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public MF(AbstractC1258Zd abstractC1258Zd) {
        this.A00 = abstractC1258Zd;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1260Zf
    public final void A53() {
        InterfaceC1236Yh interfaceC1236Yh;
        InterfaceC1236Yh interfaceC1236Yh2;
        interfaceC1236Yh = this.A00.A09;
        if (interfaceC1236Yh == null) {
            return;
        }
        interfaceC1236Yh2 = this.A00.A09;
        interfaceC1236Yh2.A4j(A00(0, 53, 115));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1260Zf
    public final void A54() {
        InterfaceC1237Yi interfaceC1237Yi;
        InterfaceC1257Zc interfaceC1257Zc;
        InterfaceC1257Zc interfaceC1257Zc2;
        InterfaceC1237Yi interfaceC1237Yi2;
        this.A00.A0P();
        interfaceC1237Yi = this.A00.A0A;
        if (interfaceC1237Yi != null) {
            interfaceC1237Yi2 = this.A00.A0A;
            interfaceC1237Yi2.AFi(true);
        }
        interfaceC1257Zc = this.A00.A05;
        if (interfaceC1257Zc != null) {
            interfaceC1257Zc2 = this.A00.A05;
            interfaceC1257Zc2.ACr();
        }
        this.A00.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1260Zf
    public final void A9c() {
        C0989Ok c0989Ok;
        C0989Ok c0989Ok2;
        C0989Ok c0989Ok3;
        C1695gi c1695gi;
        c0989Ok = this.A00.A04;
        if (c0989Ok == null) {
            A54();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC1258Zd.A03(this.A00);
        c0989Ok2 = this.A00.A04;
        if (c0989Ok2.A02() != null) {
            AbstractC1258Zd abstractC1258Zd = this.A00;
            c0989Ok3 = this.A00.A04;
            abstractC1258Zd.A0H(c0989Ok3.A02());
        } else {
            this.A00.A0F();
        }
        c1695gi = this.A00.A07;
        if (C1145Up.A2Z(c1695gi)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1260Zf
    public final void AAp() {
        C0985Og c0985Og;
        C0988Oj c0988Oj;
        C1695gi c1695gi;
        C0985Og c0985Og2;
        String str;
        c0985Og = this.A00.A06;
        if (!TextUtils.isEmpty(c0985Og.A0I())) {
            X6 x6 = new X6();
            c1695gi = this.A00.A07;
            c0985Og2 = this.A00.A06;
            Uri A00 = XB.A00(c0985Og2.A0I());
            str = this.A00.A0B;
            X6.A0O(x6, c1695gi, A00, str);
        }
        c0988Oj = this.A00.A03;
        c0988Oj.A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1260Zf
    public final void AAq() {
        InterfaceC1237Yi interfaceC1237Yi;
        C0985Og c0985Og;
        C0988Oj c0988Oj;
        C1695gi c1695gi;
        C0985Og c0985Og2;
        String str;
        InterfaceC1237Yi interfaceC1237Yi2;
        this.A00.A0P();
        interfaceC1237Yi = this.A00.A0A;
        if (interfaceC1237Yi != null) {
            interfaceC1237Yi2 = this.A00.A0A;
            interfaceC1237Yi2.AFi(true);
        }
        c0985Og = this.A00.A06;
        if (!TextUtils.isEmpty(c0985Og.A0C())) {
            X6 x6 = new X6();
            c1695gi = this.A00.A07;
            c0985Og2 = this.A00.A06;
            Uri A00 = XB.A00(c0985Og2.A0C());
            str = this.A00.A0B;
            X6.A0O(x6, c1695gi, A00, str);
        }
        c0988Oj = this.A00.A03;
        c0988Oj.A06();
        this.A00.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1260Zf
    public final void AEr(EnumC0987Oi enumC0987Oi) {
        EnumC0987Oi enumC0987Oi2;
        C0985Og c0985Og;
        C0989Ok A0B;
        C0985Og c0985Og2;
        C0985Og c0985Og3;
        AbstractC1258Zd.A02(this.A00);
        this.A00.A02 = enumC0987Oi;
        enumC0987Oi2 = this.A00.A02;
        if (enumC0987Oi2 != EnumC0987Oi.A04) {
            AbstractC1258Zd abstractC1258Zd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c0985Og2 = abstractC1258Zd.A06;
                A0B = c0985Og2.A0B();
            } else {
                c0985Og = abstractC1258Zd.A06;
                A0B = c0985Og.A0B();
            }
        } else {
            c0985Og3 = this.A00.A06;
            A0B = c0985Og3.A0A();
        }
        AbstractC1258Zd abstractC1258Zd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC1258Zd2.A0H(A0B);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1260Zf
    public final void AF4(C0989Ok c0989Ok) {
        C0988Oj c0988Oj;
        AbstractC1258Zd.A02(this.A00);
        c0988Oj = this.A00.A03;
        c0988Oj.A07(c0989Ok.A01());
        if (!c0989Ok.A05().isEmpty()) {
            AbstractC1258Zd abstractC1258Zd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC1258Zd.A0H(c0989Ok);
            return;
        }
        this.A00.A0G(c0989Ok);
    }
}

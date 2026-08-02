package defpackage;

import java.util.EnumMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sf5 extends waa {
    public final /* synthetic */ int d;

    public /* synthetic */ sf5(int i) {
        this.d = i;
    }

    @Override // defpackage.waa
    public final int A() {
        return 9;
    }

    @Override // defpackage.waa, defpackage.gml
    public final lw1 k(String str, int i, EnumMap enumMap) {
        switch (this.d) {
            case 0:
                if (i != 8) {
                    a70.p("Can only encode EAN_13, but got ".concat(fn0.C(i)));
                    break;
                } else {
                    break;
                }
            case 1:
                if (i != 7) {
                    a70.p("Can only encode EAN_8, but got ".concat(fn0.C(i)));
                    break;
                } else {
                    break;
                }
            default:
                if (i != 16) {
                    a70.p("Can only encode UPC_E, but got ".concat(fn0.C(i)));
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Override // defpackage.waa
    public final boolean[] x(String str) {
        boolean[] zArr = null;
        switch (this.d) {
            case 0:
                int length = str.length();
                if (length != 12) {
                    if (length == 13) {
                        try {
                            if (!l8k.E(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (um8 unused) {
                            a70.p("Illegal contents");
                        }
                    } else {
                        a70.p("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                    return zArr;
                }
                try {
                    str = ljg.j(l8k.F(str), str);
                } catch (um8 e) {
                    ilg.k(e);
                }
                int i = rf5.j[Character.digit(str.charAt(0), 10)];
                zArr = new boolean[95];
                int q = waa.q(zArr, 0, l8k.e, true);
                for (int i2 = 1; i2 <= 6; i2++) {
                    int digit = Character.digit(str.charAt(i2), 10);
                    if (((i >> (6 - i2)) & 1) == 1) {
                        digit += 10;
                    }
                    q += waa.q(zArr, q, l8k.i[digit], false);
                }
                int q2 = waa.q(zArr, q, l8k.f, false) + q;
                for (int i3 = 7; i3 <= 12; i3++) {
                    q2 += waa.q(zArr, q2, l8k.h[Character.digit(str.charAt(i3), 10)], true);
                }
                waa.q(zArr, q2, l8k.e, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 != 7) {
                    if (length2 == 8) {
                        try {
                            if (!l8k.E(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (um8 unused2) {
                            a70.p("Illegal contents");
                        }
                    } else {
                        a70.p("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                    return zArr;
                }
                try {
                    str = ljg.j(l8k.F(str), str);
                } catch (um8 e2) {
                    ilg.k(e2);
                }
                zArr = new boolean[67];
                int q3 = waa.q(zArr, 0, l8k.e, true);
                for (int i4 = 0; i4 <= 3; i4++) {
                    q3 += waa.q(zArr, q3, l8k.h[Character.digit(str.charAt(i4), 10)], false);
                }
                int q4 = waa.q(zArr, q3, l8k.f, false) + q3;
                for (int i5 = 4; i5 <= 7; i5++) {
                    q4 += waa.q(zArr, q4, l8k.h[Character.digit(str.charAt(i5), 10)], true);
                }
                waa.q(zArr, q4, l8k.e, true);
                return zArr;
            default:
                int length3 = str.length();
                if (length3 != 7) {
                    if (length3 == 8) {
                        try {
                            if (!l8k.E(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (um8 unused3) {
                            a70.p("Illegal contents");
                        }
                    } else {
                        a70.p("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                    return zArr;
                }
                try {
                    str = ljg.j(l8k.F(rf5.G(str)), str);
                } catch (um8 e3) {
                    ilg.k(e3);
                }
                int digit2 = Character.digit(str.charAt(0), 10);
                if (digit2 == 0 || digit2 == 1) {
                    int i6 = rf5.k[digit2][Character.digit(str.charAt(7), 10)];
                    zArr = new boolean[51];
                    int q5 = waa.q(zArr, 0, l8k.e, true);
                    for (int i7 = 1; i7 <= 6; i7++) {
                        int digit3 = Character.digit(str.charAt(i7), 10);
                        if (((i6 >> (6 - i7)) & 1) == 1) {
                            digit3 += 10;
                        }
                        q5 += waa.q(zArr, q5, l8k.i[digit3], false);
                    }
                    waa.q(zArr, q5, l8k.g, false);
                } else {
                    a70.p("Number system must be 0 or 1");
                }
                return zArr;
        }
    }
}

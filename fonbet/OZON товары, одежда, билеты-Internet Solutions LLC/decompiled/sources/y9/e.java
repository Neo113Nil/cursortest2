package y9;

import h9.EnumC6876a;
import java.util.Arrays;
import java.util.EnumMap;
import o9.C8659a;

/* loaded from: classes9.dex */
public final class e extends r {

    /* renamed from: d, reason: collision with root package name */
    static final int[] f106318d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106319a;

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f106320b = new StringBuilder(20);

    /* renamed from: c, reason: collision with root package name */
    private final int[] f106321c = new int[9];

    public e(boolean z11) {
        this.f106319a = z11;
    }

    private static int g(int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            int i12 = Integer.MAX_VALUE;
            for (int i13 : iArr) {
                if (i13 < i12 && i13 > i11) {
                    i12 = i13;
                }
            }
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = iArr[i17];
                if (i18 > i12) {
                    i15 |= 1 << ((length - 1) - i17);
                    i14++;
                    i16 += i18;
                }
            }
            if (i14 == 3) {
                for (int i19 = 0; i19 < length && i14 > 0; i19++) {
                    int i21 = iArr[i19];
                    if (i21 > i12) {
                        i14--;
                        if ((i21 << 1) >= i16) {
                            return -1;
                        }
                    }
                }
                return i15;
            }
            if (i14 <= 3) {
                return -1;
            }
            i11 = i12;
        }
    }

    @Override // y9.r
    public final h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m, h9.d, h9.h {
        char c11;
        int[] iArr = this.f106321c;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f106320b;
        sb2.setLength(0);
        int j11 = c8659a.j();
        int h11 = c8659a.h(0);
        int length = iArr.length;
        boolean z11 = false;
        int i12 = 0;
        int i13 = h11;
        while (h11 < j11) {
            if (c8659a.f(h11) != z11) {
                iArr[i12] = iArr[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else if (g(iArr) == 148 && c8659a.l(Math.max(0, i13 - ((h11 - i13) / 2)), i13)) {
                    int h12 = c8659a.h(new int[]{i13, h11}[1]);
                    int j12 = c8659a.j();
                    while (true) {
                        r.e(h12, c8659a, iArr);
                        int g10 = g(iArr);
                        if (g10 < 0) {
                            throw h9.m.a();
                        }
                        int i14 = 0;
                        while (true) {
                            if (i14 < 43) {
                                if (f106318d[i14] == g10) {
                                    c11 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i14);
                                    break;
                                }
                                i14++;
                            } else {
                                if (g10 != 148) {
                                    throw h9.m.a();
                                }
                                c11 = '*';
                            }
                        }
                        sb2.append(c11);
                        int i15 = h12;
                        for (int i16 : iArr) {
                            i15 += i16;
                        }
                        int h13 = c8659a.h(i15);
                        if (c11 == '*') {
                            sb2.setLength(sb2.length() - 1);
                            int i17 = 0;
                            for (int i18 : iArr) {
                                i17 += i18;
                            }
                            int i19 = (h13 - h12) - i17;
                            if (h13 != j12 && (i19 << 1) < i17) {
                                throw h9.m.a();
                            }
                            if (this.f106319a) {
                                int length2 = sb2.length() - 1;
                                int i21 = 0;
                                for (int i22 = 0; i22 < length2; i22++) {
                                    i21 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb2.charAt(i22));
                                }
                                if (sb2.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i21 % 43)) {
                                    throw h9.d.a();
                                }
                                sb2.setLength(length2);
                            }
                            if (sb2.length() == 0) {
                                throw h9.m.a();
                            }
                            float f7 = (r5[1] + r5[0]) / 2.0f;
                            float f11 = (i17 / 2.0f) + h12;
                            float f12 = i11;
                            return new h9.q(sb2.toString(), null, new h9.s[]{new h9.s(f7, f12), new h9.s(f11, f12)}, EnumC6876a.CODE_39);
                        }
                        h12 = h13;
                    }
                } else {
                    i13 += iArr[0] + iArr[1];
                    int i23 = i12 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i23);
                    iArr[i23] = 0;
                    iArr[i12] = 0;
                    i12--;
                }
                iArr[i12] = 1;
                z11 = !z11;
            }
            h11++;
        }
        throw h9.m.a();
    }
}

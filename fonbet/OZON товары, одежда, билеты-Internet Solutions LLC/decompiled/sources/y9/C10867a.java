package y9;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h9.EnumC6876a;
import java.util.Arrays;
import java.util.EnumMap;
import o9.C8659a;

/* renamed from: y9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10867a extends r {

    /* renamed from: d, reason: collision with root package name */
    static final char[] f106307d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e, reason: collision with root package name */
    static final int[] f106308e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f, reason: collision with root package name */
    private static final char[] f106309f = {'A', 'B', 'C', 'D'};

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f106310a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private int[] f106311b = new int[80];

    /* renamed from: c, reason: collision with root package name */
    private int f106312c = 0;

    static boolean g(char[] cArr, char c11) {
        if (cArr != null) {
            for (char c12 : cArr) {
                if (c12 == c11) {
                    return true;
                }
            }
        }
        return false;
    }

    private int h(int i11) {
        int i12 = i11 + 7;
        if (i12 >= this.f106312c) {
            return -1;
        }
        int[] iArr = this.f106311b;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        int i15 = Integer.MAX_VALUE;
        int i16 = 0;
        for (int i17 = i11; i17 < i12; i17 += 2) {
            int i18 = iArr[i17];
            if (i18 < i15) {
                i15 = i18;
            }
            if (i18 > i16) {
                i16 = i18;
            }
        }
        int i19 = (i15 + i16) / 2;
        int i21 = 0;
        for (int i22 = i11 + 1; i22 < i12; i22 += 2) {
            int i23 = iArr[i22];
            if (i23 < i13) {
                i13 = i23;
            }
            if (i23 > i21) {
                i21 = i23;
            }
        }
        int i24 = (i13 + i21) / 2;
        int i25 = UserVerificationMethods.USER_VERIFY_PATTERN;
        int i26 = 0;
        for (int i27 = 0; i27 < 7; i27++) {
            i25 >>= 1;
            if (iArr[i11 + i27] > ((i27 & 1) == 0 ? i19 : i24)) {
                i26 |= i25;
            }
        }
        while (true) {
            int[] iArr2 = f106308e;
            if (i14 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i14] == i26) {
                return i14;
            }
            i14++;
        }
    }

    @Override // y9.r
    public final h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m {
        int i12;
        int[] iArr;
        int i13;
        Arrays.fill(this.f106311b, 0);
        this.f106312c = 0;
        int i14 = c8659a.i(0);
        int j11 = c8659a.j();
        if (i14 >= j11) {
            throw h9.m.a();
        }
        int i15 = 1;
        int i16 = 0;
        boolean z11 = true;
        while (i14 < j11) {
            if (c8659a.f(i14) != z11) {
                i16++;
            } else {
                int[] iArr2 = this.f106311b;
                int i17 = this.f106312c;
                iArr2[i17] = i16;
                int i18 = i17 + 1;
                this.f106312c = i18;
                if (i18 >= iArr2.length) {
                    int[] iArr3 = new int[i18 << 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i18);
                    this.f106311b = iArr3;
                }
                z11 = !z11;
                i16 = 1;
            }
            i14++;
        }
        int[] iArr4 = this.f106311b;
        int i19 = this.f106312c;
        iArr4[i19] = i16;
        int i21 = i19 + 1;
        this.f106312c = i21;
        if (i21 >= iArr4.length) {
            int[] iArr5 = new int[i21 << 1];
            System.arraycopy(iArr4, 0, iArr5, 0, i21);
            this.f106311b = iArr5;
        }
        int i22 = 1;
        while (i22 < this.f106312c) {
            int h11 = h(i22);
            if (h11 != -1) {
                char[] cArr = f106307d;
                char c11 = cArr[h11];
                char[] cArr2 = f106309f;
                if (g(cArr2, c11)) {
                    int i23 = 0;
                    for (int i24 = i22; i24 < i22 + 7; i24++) {
                        i23 += this.f106311b[i24];
                    }
                    if (i22 == i15 || this.f106311b[i22 - 1] >= i23 / 2) {
                        StringBuilder sb2 = this.f106310a;
                        sb2.setLength(0);
                        int i25 = i22;
                        while (true) {
                            int h12 = h(i25);
                            if (h12 == -1) {
                                throw h9.m.a();
                            }
                            sb2.append((char) h12);
                            i12 = i25 + 8;
                            if ((sb2.length() <= i15 || !g(cArr2, cArr[h12])) && i12 < this.f106312c) {
                                i25 = i12;
                                i15 = i15;
                            }
                        }
                        int i26 = i25 + 7;
                        int i27 = this.f106311b[i26];
                        int i28 = 0;
                        for (int i29 = -8; i29 < -1; i29++) {
                            i28 += this.f106311b[i12 + i29];
                        }
                        if (i12 < this.f106312c && i27 < i28 / 2) {
                            throw h9.m.a();
                        }
                        int[] iArr6 = new int[4];
                        iArr6[0] = 0;
                        iArr6[i15] = 0;
                        iArr6[2] = 0;
                        iArr6[3] = 0;
                        int[] iArr7 = new int[4];
                        iArr7[0] = 0;
                        iArr7[i15] = 0;
                        iArr7[2] = 0;
                        iArr7[3] = 0;
                        int length = sb2.length() - i15;
                        int i31 = i22;
                        int i32 = 0;
                        while (true) {
                            char charAt = sb2.charAt(i32);
                            iArr = f106308e;
                            int i33 = iArr[charAt];
                            int i34 = 6;
                            while (i34 >= 0) {
                                int i35 = (i34 & 1) + ((i33 & 1) << 1);
                                iArr6[i35] = iArr6[i35] + this.f106311b[i31 + i34];
                                iArr7[i35] = iArr7[i35] + 1;
                                i33 >>= 1;
                                i34--;
                                i15 = i15;
                            }
                            int i36 = i15;
                            if (i32 >= length) {
                                break;
                            }
                            i31 += 8;
                            i32++;
                            i15 = i36;
                        }
                        float[] fArr = new float[4];
                        float[] fArr2 = new float[4];
                        int i37 = 0;
                        for (int i38 = 2; i37 < i38; i38 = 2) {
                            fArr2[i37] = 0.0f;
                            int i39 = i37 + 2;
                            float f7 = iArr6[i39];
                            float f11 = iArr7[i39];
                            float f12 = ((f7 / f11) + (iArr6[i37] / iArr7[i37])) / 2.0f;
                            fArr2[i39] = f12;
                            fArr[i37] = f12;
                            fArr[i39] = ((f7 * 2.0f) + 1.5f) / f11;
                            i37++;
                        }
                        int i41 = i22;
                        int i42 = 0;
                        loop8: while (true) {
                            int i43 = iArr[sb2.charAt(i42)];
                            for (int i44 = 6; i44 >= 0; i44--) {
                                int i45 = (i44 & 1) + ((i43 & 1) << 1);
                                float f13 = this.f106311b[i41 + i44];
                                if (f13 < fArr2[i45] || f13 > fArr[i45]) {
                                    break loop8;
                                }
                                i43 >>= 1;
                            }
                            if (i42 >= length) {
                                for (int i46 = 0; i46 < sb2.length(); i46++) {
                                    sb2.setCharAt(i46, cArr[sb2.charAt(i46)]);
                                }
                                if (!g(cArr2, sb2.charAt(0))) {
                                    throw h9.m.a();
                                }
                                if (!g(cArr2, sb2.charAt(sb2.length() - 1))) {
                                    throw h9.m.a();
                                }
                                if (sb2.length() <= 3) {
                                    throw h9.m.a();
                                }
                                if (enumMap == null || !enumMap.containsKey(h9.e.RETURN_CODABAR_START_END)) {
                                    sb2.deleteCharAt(sb2.length() - 1);
                                    i13 = 0;
                                    sb2.deleteCharAt(0);
                                } else {
                                    i13 = 0;
                                }
                                int i47 = i13;
                                while (i13 < i22) {
                                    i47 += this.f106311b[i13];
                                    i13++;
                                }
                                float f14 = i47;
                                while (i22 < i26) {
                                    i47 += this.f106311b[i22];
                                    i22++;
                                }
                                float f15 = i11;
                                return new h9.q(sb2.toString(), null, new h9.s[]{new h9.s(f14, f15), new h9.s(i47, f15)}, EnumC6876a.CODABAR);
                            }
                            i41 += 8;
                            i42++;
                        }
                        throw h9.m.a();
                    }
                }
            }
            i22 += 2;
            i15 = i15;
        }
        throw h9.m.a();
    }
}

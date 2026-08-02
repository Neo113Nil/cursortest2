package y9;

import h9.EnumC6876a;
import o9.C8659a;

/* renamed from: y9.A, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10865A extends y {

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f106304j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k, reason: collision with root package name */
    static final int[][] f106305k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i, reason: collision with root package name */
    private final int[] f106306i = new int[4];

    public static String r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c11 = cArr[5];
        switch (c11) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c11);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c11);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    @Override // y9.y
    protected final boolean g(String str) throws h9.h {
        return y.h(r(str));
    }

    @Override // y9.y
    protected final int[] j(int i11, C8659a c8659a) throws h9.m {
        return y.m(c8659a, i11, true, f106304j);
    }

    @Override // y9.y
    protected final int k(C8659a c8659a, int[] iArr, StringBuilder sb2) throws h9.m {
        int[] iArr2 = this.f106306i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j11 = c8659a.j();
        int i11 = iArr[1];
        int i12 = 0;
        for (int i13 = 0; i13 < 6 && i11 < j11; i13++) {
            int i14 = y.i(c8659a, iArr2, i11, y.f106359h);
            sb2.append((char) ((i14 % 10) + 48));
            for (int i15 : iArr2) {
                i11 += i15;
            }
            if (i14 >= 10) {
                i12 |= 1 << (5 - i13);
            }
        }
        for (int i16 = 0; i16 <= 1; i16++) {
            for (int i17 = 0; i17 < 10; i17++) {
                if (i12 == f106305k[i16][i17]) {
                    sb2.insert(0, (char) (i16 + 48));
                    sb2.append((char) (i17 + 48));
                    return i11;
                }
            }
        }
        throw h9.m.a();
    }

    @Override // y9.y
    final EnumC6876a p() {
        return EnumC6876a.UPC_E;
    }
}

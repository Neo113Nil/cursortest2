package u9;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f100401a;

    /* renamed from: b, reason: collision with root package name */
    private final int f100402b;

    /* renamed from: c, reason: collision with root package name */
    private final int f100403c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f100404d;

    public e(String str, int i11, int i12) {
        this.f100401a = str;
        this.f100403c = i11;
        this.f100402b = i12;
        byte[] bArr = new byte[i11 * i12];
        this.f100404d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void b(int i11, int i12, int i13, int i14) {
        if (i11 < 0) {
            int i15 = this.f100402b;
            i11 += i15;
            i12 += 4 - ((i15 + 4) % 8);
        }
        int i16 = this.f100403c;
        if (i12 < 0) {
            i12 += i16;
            i11 += 4 - ((i16 + 4) % 8);
        }
        this.f100404d[(i11 * i16) + i12] = (byte) ((this.f100401a.charAt(i13) & (1 << (8 - i14))) == 0 ? 0 : 1);
    }

    private void d(int i11, int i12, int i13) {
        int i14 = i11 - 2;
        int i15 = i12 - 2;
        b(i14, i15, i13, 1);
        int i16 = i12 - 1;
        b(i14, i16, i13, 2);
        int i17 = i11 - 1;
        b(i17, i15, i13, 3);
        b(i17, i16, i13, 4);
        b(i17, i12, i13, 5);
        b(i11, i15, i13, 6);
        b(i11, i16, i13, 7);
        b(i11, i12, i13, 8);
    }

    public final boolean a(int i11, int i12) {
        return this.f100404d[(i12 * this.f100403c) + i11] == 1;
    }

    public final void c() {
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = 0;
        int i15 = 0;
        int i16 = 4;
        while (true) {
            i11 = this.f100403c;
            i12 = this.f100402b;
            if (i16 == i12 && i14 == 0) {
                int i17 = i12 - 1;
                b(i17, 0, i15, 1);
                b(i17, 1, i15, 2);
                b(i17, 2, i15, 3);
                b(0, i11 - 2, i15, 4);
                int i18 = i11 - 1;
                b(0, i18, i15, 5);
                b(1, i18, i15, 6);
                b(2, i18, i15, 7);
                b(3, i18, i15, 8);
                i15++;
            }
            i13 = i12 - 2;
            if (i16 == i13 && i14 == 0 && i11 % 4 != 0) {
                b(i12 - 3, 0, i15, 1);
                b(i13, 0, i15, 2);
                b(i12 - 1, 0, i15, 3);
                b(0, i11 - 4, i15, 4);
                b(0, i11 - 3, i15, 5);
                b(0, i11 - 2, i15, 6);
                int i19 = i11 - 1;
                b(0, i19, i15, 7);
                b(1, i19, i15, 8);
                i15++;
            }
            if (i16 == i13 && i14 == 0 && i11 % 8 == 4) {
                b(i12 - 3, 0, i15, 1);
                b(i13, 0, i15, 2);
                b(i12 - 1, 0, i15, 3);
                b(0, i11 - 2, i15, 4);
                int i21 = i11 - 1;
                b(0, i21, i15, 5);
                b(1, i21, i15, 6);
                b(2, i21, i15, 7);
                b(3, i21, i15, 8);
                i15++;
            }
            if (i16 == i12 + 4 && i14 == 2 && i11 % 8 == 0) {
                int i22 = i12 - 1;
                b(i22, 0, i15, 1);
                int i23 = i11 - 1;
                b(i22, i23, i15, 2);
                int i24 = i11 - 3;
                b(0, i24, i15, 3);
                int i25 = i11 - 2;
                b(0, i25, i15, 4);
                b(0, i23, i15, 5);
                b(1, i24, i15, 6);
                b(1, i25, i15, 7);
                b(1, i23, i15, 8);
                i15++;
            }
            while (true) {
                bArr = this.f100404d;
                if (i16 < i12 && i14 >= 0 && bArr[(i16 * i11) + i14] < 0) {
                    d(i16, i14, i15);
                    i15++;
                }
                int i26 = i16 - 2;
                int i27 = i14 + 2;
                if (i26 < 0 || i27 >= i11) {
                    break;
                }
                i16 = i26;
                i14 = i27;
            }
            int i28 = i16 - 1;
            int i29 = i14 + 5;
            while (true) {
                if (i28 >= 0 && i29 < i11 && bArr[(i28 * i11) + i29] < 0) {
                    d(i28, i29, i15);
                    i15++;
                }
                int i31 = i28 + 2;
                int i32 = i29 - 2;
                if (i31 >= i12 || i32 < 0) {
                    break;
                }
                i28 = i31;
                i29 = i32;
            }
            i16 = i28 + 5;
            i14 = i29 - 1;
            if (i16 >= i12 && i14 >= i11) {
                break;
            }
        }
        int i33 = i11 - 1;
        int i34 = i12 - 1;
        if (bArr[(i34 * i11) + i33] < 0) {
            int i35 = (i34 * i11) + i33;
            byte b11 = (byte) 1;
            bArr[i35] = b11;
            bArr[(i13 * i11) + (i11 - 2)] = b11;
        }
    }
}

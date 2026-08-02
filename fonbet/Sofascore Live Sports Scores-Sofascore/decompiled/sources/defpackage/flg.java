package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes7.dex */
public final class flg {
    public static final int[] n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int m;
    public final byte[] a = new byte[4];
    public int b = 0;
    public final int[] l = new int[64];

    public flg() {
        ((f74) g74.a.get()).getClass();
        h();
    }

    public static int a(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    public static int b(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    public static int c(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public static int d(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    public final int e(byte[] bArr) {
        long j = this.c << 3;
        i(Byte.MIN_VALUE);
        while (this.b != 0) {
            i((byte) 0);
        }
        if (this.m > 14) {
            f();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        f();
        r4a.A(this.d, 0, bArr);
        r4a.A(this.e, 4, bArr);
        r4a.A(this.f, 8, bArr);
        r4a.A(this.g, 12, bArr);
        r4a.A(this.h, 16, bArr);
        r4a.A(this.i, 20, bArr);
        r4a.A(this.j, 24, bArr);
        r4a.A(this.k, 28, bArr);
        h();
        return 32;
    }

    public final void f() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.l;
            if (i > 63) {
                break;
            }
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
            i++;
        }
        int i5 = this.d;
        int i6 = this.e;
        int i7 = this.f;
        int i8 = this.g;
        int i9 = this.h;
        int i10 = this.i;
        int i11 = this.j;
        int i12 = this.k;
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            int a = a(i9, i10, i11) + d(i9);
            int[] iArr2 = n;
            int i15 = a + iArr2[i13] + iArr[i13] + i12;
            int i16 = i8 + i15;
            int b = b(i5, i6, i7) + c(i5) + i15;
            int i17 = i13 + 1;
            int a2 = a(i16, i9, i10) + d(i16) + iArr2[i17] + iArr[i17] + i11;
            int i18 = i7 + a2;
            int b2 = b(b, i5, i6) + c(b) + a2;
            int i19 = i13 + 2;
            int a3 = a(i18, i16, i9) + d(i18) + iArr2[i19] + iArr[i19] + i10;
            int i20 = i6 + a3;
            int b3 = b(b2, b, i5) + c(b2) + a3;
            int i21 = i13 + 3;
            int a4 = a(i20, i18, i16) + d(i20) + iArr2[i21] + iArr[i21] + i9;
            int i22 = i5 + a4;
            int b4 = b(b3, b2, b) + c(b3) + a4;
            int i23 = i13 + 4;
            int a5 = a(i22, i20, i18) + d(i22) + iArr2[i23] + iArr[i23] + i16;
            i12 = b + a5;
            i8 = b(b4, b3, b2) + c(b4) + a5;
            int i24 = i13 + 5;
            int a6 = a(i12, i22, i20) + d(i12) + iArr2[i24] + iArr[i24] + i18;
            i11 = b2 + a6;
            i7 = b(i8, b4, b3) + c(i8) + a6;
            int i25 = i13 + 6;
            int a7 = a(i11, i12, i22) + d(i11) + iArr2[i25] + iArr[i25] + i20;
            i10 = b3 + a7;
            i6 = b(i7, i8, b4) + c(i7) + a7;
            int i26 = i13 + 7;
            int a8 = a(i10, i11, i12) + d(i10) + iArr2[i26] + iArr[i26] + i22;
            i9 = b4 + a8;
            i5 = b(i6, i7, i8) + c(i6) + a8;
            i13 += 8;
        }
        this.d += i5;
        this.e += i6;
        this.f += i7;
        this.g += i8;
        this.h += i9;
        this.i += i10;
        this.j += i11;
        this.k += i12;
        this.m = 0;
        for (int i27 = 0; i27 < 16; i27++) {
            iArr[i27] = 0;
        }
    }

    public final void g(int i, byte[] bArr) {
        this.l[this.m] = (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i] << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i2 = this.m + 1;
        this.m = i2;
        if (i2 == 16) {
            f();
        }
    }

    public final void h() {
        this.c = 0L;
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.d = 1779033703;
        this.e = -1150833019;
        this.f = 1013904242;
        this.g = -1521486534;
        this.h = 1359893119;
        this.i = -1694144372;
        this.j = 528734635;
        this.k = 1541459225;
        this.m = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.l;
            if (i2 == iArr.length) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }

    public final void i(byte b) {
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        bArr[i] = b;
        if (i2 == bArr.length) {
            g(0, bArr);
            this.b = 0;
        }
        this.c++;
    }

    public final void j(int i, int i2, byte[] bArr) {
        int i3 = 0;
        int max = Math.max(0, i2);
        int i4 = this.b;
        byte[] bArr2 = this.a;
        if (i4 != 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= max) {
                    i3 = i5;
                    break;
                }
                int i6 = this.b;
                int i7 = i6 + 1;
                this.b = i7;
                int i8 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (i7 == 4) {
                    g(0, bArr2);
                    this.b = 0;
                    i3 = i8;
                    break;
                }
                i5 = i8;
            }
        }
        int i9 = max - 3;
        while (i3 < i9) {
            g(i + i3, bArr);
            i3 += 4;
        }
        while (i3 < max) {
            int i10 = this.b;
            this.b = i10 + 1;
            bArr2[i10] = bArr[i3 + i];
            i3++;
        }
        this.c += max;
    }

    public final String toString() {
        return "SHA256[Java]()";
    }
}

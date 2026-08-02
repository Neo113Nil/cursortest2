package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nm2 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public byte[] d;
    public int e;

    public nm2(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = i;
                this.c = i2;
                this.d = new byte[(i2 * 2) - 1];
                this.e = 0;
                break;
            default:
                this.b = i;
                this.c = i2;
                this.d = new byte[(i2 * 2) - 1];
                this.e = 0;
                break;
        }
    }

    public void a() {
        int i;
        int i2;
        int i3;
        switch (this.a) {
            case 2:
                int i4 = this.b;
                qx9.t(i4 >= 0 && (i4 < (i = this.e) || (i4 == i && this.c == 0)));
                break;
            case 3:
                int i5 = this.b;
                z1a.E(i5 >= 0 && (i5 < (i2 = this.e) || (i5 == i2 && this.c == 0)));
                break;
            default:
                int i6 = this.c;
                qx9.t(i6 >= 0 && (i6 < (i3 = this.b) || (i6 == i3 && this.e == 0)));
                break;
        }
    }

    public int b() {
        int i;
        int i2;
        switch (this.a) {
            case 2:
                i = (this.e - this.b) * 8;
                i2 = this.c;
                break;
            default:
                i = (this.e - this.b) * 8;
                i2 = this.c;
                break;
        }
        return i - i2;
    }

    public void c() {
        switch (this.a) {
            case 2:
                if (this.c != 0) {
                    this.c = 0;
                    this.b++;
                    a();
                    break;
                }
                break;
            default:
                if (this.c != 0) {
                    this.c = 0;
                    this.b++;
                    a();
                    break;
                }
                break;
        }
    }

    public boolean d(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.b) {
                break;
            }
            if (r(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public boolean e() {
        int i = this.c;
        int i2 = this.e;
        int i3 = 0;
        while (this.c < this.b && !h()) {
            i3++;
        }
        boolean z = this.c == this.b;
        this.c = i;
        this.e = i2;
        return !z && d((i3 * 2) + 1);
    }

    public int f() {
        switch (this.a) {
            case 2:
                qx9.t(this.c == 0);
                break;
            default:
                z1a.E(this.c == 0);
                break;
        }
        return this.b;
    }

    public int g() {
        int i;
        int i2;
        switch (this.a) {
            case 2:
                i = this.b * 8;
                i2 = this.c;
                break;
            default:
                i = this.b * 8;
                i2 = this.c;
                break;
        }
        return i + i2;
    }

    public boolean h() {
        switch (this.a) {
            case 2:
                boolean z = (this.d[this.b] & (128 >> this.c)) != 0;
                s();
                return z;
            case 3:
                boolean z2 = (this.d[this.b] & (128 >> this.c)) != 0;
                s();
                return z2;
            case 4:
                boolean z3 = (this.d[this.c] & (128 >> this.e)) != 0;
                s();
                return z3;
            case 5:
                boolean z4 = (((this.d[this.c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.e) & 1) == 1;
                t(1);
                return z4;
            default:
                boolean z5 = (((this.d[this.c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.e) & 1) == 1;
                t(1);
                return z5;
        }
    }

    public int i(int i) {
        switch (this.a) {
            case 2:
                if (i == 0) {
                    return 0;
                }
                this.c += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.c;
                    if (i3 <= 8) {
                        byte[] bArr = this.d;
                        int i4 = this.b;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((255 & bArr[i4]) >> (8 - i3)));
                        if (i3 == 8) {
                            this.c = 0;
                            this.b = i4 + 1;
                        }
                        a();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.c = i6;
                    byte[] bArr2 = this.d;
                    int i7 = this.b;
                    this.b = i7 + 1;
                    i2 |= (bArr2[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i6;
                }
            case 3:
                if (i == 0) {
                    return 0;
                }
                this.c += i;
                int i8 = 0;
                while (true) {
                    int i9 = this.c;
                    if (i9 <= 8) {
                        byte[] bArr3 = this.d;
                        int i10 = this.b;
                        int i11 = ((-1) >>> (32 - i)) & (i8 | ((255 & bArr3[i10]) >> (8 - i9)));
                        if (i9 == 8) {
                            this.c = 0;
                            this.b = i10 + 1;
                        }
                        a();
                        return i11;
                    }
                    int i12 = i9 - 8;
                    this.c = i12;
                    byte[] bArr4 = this.d;
                    int i13 = this.b;
                    this.b = i13 + 1;
                    i8 |= (bArr4[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i12;
                }
            case 4:
                this.e += i;
                int i14 = 0;
                while (true) {
                    int i15 = this.e;
                    int i16 = 2;
                    if (i15 <= 8) {
                        byte[] bArr5 = this.d;
                        int i17 = this.c;
                        int i18 = ((-1) >>> (32 - i)) & (i14 | ((255 & bArr5[i17]) >> (8 - i15)));
                        if (i15 == 8) {
                            this.e = 0;
                            this.c = i17 + (r(i17 + 1) ? 2 : 1);
                        }
                        a();
                        return i18;
                    }
                    int i19 = i15 - 8;
                    this.e = i19;
                    byte[] bArr6 = this.d;
                    int i20 = this.c;
                    i14 |= (bArr6[i20] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i19;
                    if (!r(i20 + 1)) {
                        i16 = 1;
                    }
                    this.c = i20 + i16;
                }
            case 5:
                int i21 = this.c;
                int min = Math.min(i, 8 - this.e);
                byte[] bArr7 = this.d;
                int i22 = i21 + 1;
                int i23 = ((bArr7[i21] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.e) & (255 >> (8 - min));
                while (min < i) {
                    i23 |= (bArr7[i22] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << min;
                    min += 8;
                    i22++;
                }
                int i24 = i23 & ((-1) >>> (32 - i));
                t(i);
                return i24;
            default:
                int i25 = this.c;
                int min2 = Math.min(i, 8 - this.e);
                byte[] bArr8 = this.d;
                int i26 = i25 + 1;
                int i27 = ((bArr8[i25] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.e) & (255 >> (8 - min2));
                while (min2 < i) {
                    i27 |= (bArr8[i26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << min2;
                    min2 += 8;
                    i26++;
                }
                int i28 = i27 & ((-1) >>> (32 - i));
                t(i);
                return i28;
        }
    }

    public void j(int i, byte[] bArr) {
        switch (this.a) {
            case 2:
                int i2 = i >> 3;
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr2 = this.d;
                    int i4 = this.b;
                    int i5 = i4 + 1;
                    this.b = i5;
                    byte b = bArr2[i4];
                    int i6 = this.c;
                    byte b2 = (byte) (b << i6);
                    bArr[i3] = b2;
                    bArr[i3] = (byte) (((bArr2[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i6)) | b2);
                }
                int i7 = i & 7;
                if (i7 != 0) {
                    byte b3 = (byte) (bArr[i2] & (255 >> i7));
                    bArr[i2] = b3;
                    int i8 = this.c;
                    if (i8 + i7 > 8) {
                        byte[] bArr3 = this.d;
                        int i9 = this.b;
                        this.b = i9 + 1;
                        bArr[i2] = (byte) (b3 | ((bArr3[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i8));
                        i8 -= 8;
                        this.c = i8;
                    }
                    int i10 = i8 + i7;
                    this.c = i10;
                    byte[] bArr4 = this.d;
                    int i11 = this.b;
                    bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
                    if (i10 == 8) {
                        this.c = 0;
                        this.b = i11 + 1;
                    }
                    a();
                    break;
                }
                break;
            default:
                int i12 = i >> 3;
                for (int i13 = 0; i13 < i12; i13++) {
                    byte[] bArr5 = this.d;
                    int i14 = this.b;
                    int i15 = i14 + 1;
                    this.b = i15;
                    byte b4 = bArr5[i14];
                    int i16 = this.c;
                    byte b5 = (byte) (b4 << i16);
                    bArr[i13] = b5;
                    bArr[i13] = (byte) (((bArr5[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i16)) | b5);
                }
                int i17 = i & 7;
                if (i17 != 0) {
                    byte b6 = (byte) (bArr[i12] & (255 >> i17));
                    bArr[i12] = b6;
                    int i18 = this.c;
                    if (i18 + i17 > 8) {
                        byte[] bArr6 = this.d;
                        int i19 = this.b;
                        this.b = i19 + 1;
                        bArr[i12] = (byte) (b6 | ((bArr6[i19] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i18));
                        i18 -= 8;
                        this.c = i18;
                    }
                    int i20 = i18 + i17;
                    this.c = i20;
                    byte[] bArr7 = this.d;
                    int i21 = this.b;
                    bArr[i12] = (byte) (((byte) (((255 & bArr7[i21]) >> (8 - i20)) << (8 - i17))) | bArr[i12]);
                    if (i20 == 8) {
                        this.c = 0;
                        this.b = i21 + 1;
                    }
                    a();
                    break;
                }
                break;
        }
    }

    public long k(int i) {
        if (i <= 32) {
            int i2 = i(i);
            String str = nik.a;
            return i2 & 4294967295L;
        }
        int i3 = i(i - 32);
        int i4 = i(32);
        String str2 = nik.a;
        return (i4 & 4294967295L) | ((i3 & 4294967295L) << 32);
    }

    public void l(int i, byte[] bArr) {
        switch (this.a) {
            case 2:
                qx9.t(this.c == 0);
                System.arraycopy(this.d, this.b, bArr, 0, i);
                this.b += i;
                a();
                break;
            default:
                z1a.E(this.c == 0);
                System.arraycopy(this.d, this.b, bArr, 0, i);
                this.b += i;
                a();
                break;
        }
    }

    public int m() {
        int i = 0;
        while (!h()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? i(i) : 0);
    }

    public int n() {
        int m = m();
        return ((m + 1) / 2) * (m % 2 == 0 ? -1 : 1);
    }

    public void o(j9e j9eVar) {
        p(j9eVar.a, j9eVar.c);
        q(j9eVar.b * 8);
    }

    public void p(byte[] bArr, int i) {
        switch (this.a) {
            case 2:
                this.d = bArr;
                this.b = 0;
                this.c = 0;
                this.e = i;
                break;
            default:
                this.d = bArr;
                this.b = 0;
                this.c = 0;
                this.e = i;
                break;
        }
    }

    public void q(int i) {
        switch (this.a) {
            case 2:
                int i2 = i / 8;
                this.b = i2;
                this.c = i - (i2 * 8);
                a();
                break;
            default:
                int i3 = i / 8;
                this.b = i3;
                this.c = i - (i3 * 8);
                a();
                break;
        }
    }

    public boolean r(int i) {
        if (2 > i || i >= this.b) {
            return false;
        }
        byte[] bArr = this.d;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public void s() {
        switch (this.a) {
            case 2:
                int i = this.c + 1;
                this.c = i;
                if (i == 8) {
                    this.c = 0;
                    this.b++;
                }
                a();
                break;
            case 3:
                int i2 = this.c + 1;
                this.c = i2;
                if (i2 == 8) {
                    this.c = 0;
                    this.b++;
                }
                a();
                break;
            default:
                int i3 = this.e + 1;
                this.e = i3;
                if (i3 == 8) {
                    this.e = 0;
                    int i4 = this.c;
                    this.c = i4 + (r(i4 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 2:
                int i4 = i / 8;
                int i5 = this.b + i4;
                this.b = i5;
                int i6 = (i - (i4 * 8)) + this.c;
                this.c = i6;
                if (i6 > 7) {
                    this.b = i5 + 1;
                    this.c = i6 - 8;
                }
                a();
                break;
            case 3:
                int i7 = i / 8;
                int i8 = this.b + i7;
                this.b = i8;
                int i9 = (i - (i7 * 8)) + this.c;
                this.c = i9;
                if (i9 > 7) {
                    this.b = i8 + 1;
                    this.c = i9 - 8;
                }
                a();
                break;
            case 4:
                int i10 = this.c;
                int i11 = i / 8;
                int i12 = i10 + i11;
                this.c = i12;
                int i13 = (i - (i11 * 8)) + this.e;
                this.e = i13;
                if (i13 > 7) {
                    this.c = i12 + 1;
                    this.e = i13 - 8;
                }
                while (true) {
                    i10++;
                    if (i10 > this.c) {
                        a();
                        break;
                    } else if (r(i10)) {
                        this.c++;
                        i10 += 2;
                    }
                }
            case 5:
                int i14 = i / 8;
                int i15 = this.c + i14;
                this.c = i15;
                int i16 = (i - (i14 * 8)) + this.e;
                this.e = i16;
                if (i16 > 7) {
                    i15++;
                    this.c = i15;
                    i16 -= 8;
                    this.e = i16;
                }
                qx9.t(i15 >= 0 && (i15 < (i2 = this.b) || (i15 == i2 && i16 == 0)));
                break;
            default:
                int i17 = i / 8;
                int i18 = this.c + i17;
                this.c = i18;
                int i19 = (i - (i17 * 8)) + this.e;
                this.e = i19;
                if (i19 > 7) {
                    i18++;
                    this.c = i18;
                    i19 -= 8;
                    this.e = i19;
                }
                z1a.E(i18 >= 0 && (i18 < (i3 = this.b) || (i18 == i3 && i19 == 0)));
                break;
        }
    }

    public void u(int i) {
        switch (this.a) {
            case 2:
                qx9.t(this.c == 0);
                this.b += i;
                a();
                break;
            default:
                z1a.E(this.c == 0);
                this.b += i;
                a();
                break;
        }
    }

    public nm2(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.d = nik.b;
                break;
            default:
                this.d = lik.e;
                break;
        }
    }

    public nm2(byte[] bArr, int i, int i2) {
        this.a = 4;
        this.d = bArr;
        this.c = i;
        this.b = i2;
        this.e = 0;
        a();
    }

    public nm2(byte[] bArr, int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.d = bArr;
                this.b = bArr.length;
                break;
            default:
                this.d = bArr;
                this.b = bArr.length;
                break;
        }
    }

    public /* synthetic */ nm2(byte[] bArr, int i, int i2, byte b) {
        this.a = i2;
        this.d = bArr;
        this.e = i;
    }
}

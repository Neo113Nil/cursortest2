package m3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: m3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8049B {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f74257a;

    /* renamed from: b, reason: collision with root package name */
    private int f74258b;

    /* renamed from: c, reason: collision with root package name */
    private int f74259c;

    /* renamed from: d, reason: collision with root package name */
    private int f74260d;

    public C8049B() {
        this.f74257a = N.f74291c;
    }

    private void a() {
        int i11;
        int i12 = this.f74258b;
        G10.a.h(i12 >= 0 && (i12 < (i11 = this.f74260d) || (i12 == i11 && this.f74259c == 0)));
    }

    public final int b() {
        return ((this.f74260d - this.f74258b) * 8) - this.f74259c;
    }

    public final void c() {
        if (this.f74259c == 0) {
            return;
        }
        this.f74259c = 0;
        this.f74258b++;
        a();
    }

    public final int d() {
        G10.a.h(this.f74259c == 0);
        return this.f74258b;
    }

    public final int e() {
        return (this.f74258b * 8) + this.f74259c;
    }

    public final void f(int i11) {
        int i12 = i11 & 16383;
        int min = Math.min(8 - this.f74259c, 14);
        int i13 = this.f74259c;
        int i14 = (8 - i13) - min;
        byte[] bArr = this.f74257a;
        int i15 = this.f74258b;
        byte b11 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr[i15]);
        bArr[i15] = b11;
        int i16 = 14 - min;
        bArr[i15] = (byte) (b11 | ((i12 >>> i16) << i14));
        int i17 = i15 + 1;
        while (i16 > 8) {
            this.f74257a[i17] = (byte) (i12 >>> (i16 - 8));
            i16 -= 8;
            i17++;
        }
        int i18 = 8 - i16;
        byte[] bArr2 = this.f74257a;
        byte b12 = (byte) (bArr2[i17] & ((1 << i18) - 1));
        bArr2[i17] = b12;
        bArr2[i17] = (byte) (((i12 & ((1 << i16) - 1)) << i18) | b12);
        p(14);
        a();
    }

    public final boolean g() {
        boolean z11 = (this.f74257a[this.f74258b] & (UserVerificationMethods.USER_VERIFY_PATTERN >> this.f74259c)) != 0;
        o();
        return z11;
    }

    public final int h(int i11) {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        this.f74259c += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f74259c;
            if (i12 <= 8) {
                break;
            }
            int i14 = i12 - 8;
            this.f74259c = i14;
            byte[] bArr = this.f74257a;
            int i15 = this.f74258b;
            this.f74258b = i15 + 1;
            i13 |= (bArr[i15] & 255) << i14;
        }
        byte[] bArr2 = this.f74257a;
        int i16 = this.f74258b;
        int i17 = ((-1) >>> (32 - i11)) & (i13 | ((bArr2[i16] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.f74259c = 0;
            this.f74258b = i16 + 1;
        }
        a();
        return i17;
    }

    public final void i(int i11, byte[] bArr) {
        int i12 = i11 >> 3;
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr2 = this.f74257a;
            int i14 = this.f74258b;
            int i15 = i14 + 1;
            this.f74258b = i15;
            byte b11 = bArr2[i14];
            int i16 = this.f74259c;
            byte b12 = (byte) (b11 << i16);
            bArr[i13] = b12;
            bArr[i13] = (byte) (((255 & bArr2[i15]) >> (8 - i16)) | b12);
        }
        int i17 = i11 & 7;
        if (i17 == 0) {
            return;
        }
        byte b13 = (byte) (bArr[i12] & (255 >> i17));
        bArr[i12] = b13;
        int i18 = this.f74259c;
        if (i18 + i17 > 8) {
            byte[] bArr3 = this.f74257a;
            int i19 = this.f74258b;
            this.f74258b = i19 + 1;
            bArr[i12] = (byte) (b13 | ((bArr3[i19] & 255) << i18));
            this.f74259c = i18 - 8;
        }
        int i21 = this.f74259c + i17;
        this.f74259c = i21;
        byte[] bArr4 = this.f74257a;
        int i22 = this.f74258b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i22]) >> (8 - i21)) << (8 - i17))) | bArr[i12]);
        if (i21 == 8) {
            this.f74259c = 0;
            this.f74258b = i22 + 1;
        }
        a();
    }

    public final long j(int i11) {
        if (i11 <= 32) {
            int h11 = h(i11);
            int i12 = N.f74289a;
            return 4294967295L & h11;
        }
        int h12 = h(i11 - 32);
        int h13 = h(32);
        int i13 = N.f74289a;
        return (4294967295L & h13) | ((h12 & 4294967295L) << 32);
    }

    public final void k(int i11, byte[] bArr) {
        G10.a.h(this.f74259c == 0);
        System.arraycopy(this.f74257a, this.f74258b, bArr, 0, i11);
        this.f74258b += i11;
        a();
    }

    public final void l(int i11, byte[] bArr) {
        this.f74257a = bArr;
        this.f74258b = 0;
        this.f74259c = 0;
        this.f74260d = i11;
    }

    public final void m(C8050C c8050c) {
        l(c8050c.i(), c8050c.e());
        n(c8050c.f() * 8);
    }

    public final void n(int i11) {
        int i12 = i11 / 8;
        this.f74258b = i12;
        this.f74259c = i11 - (i12 * 8);
        a();
    }

    public final void o() {
        int i11 = this.f74259c + 1;
        this.f74259c = i11;
        if (i11 == 8) {
            this.f74259c = 0;
            this.f74258b++;
        }
        a();
    }

    public final void p(int i11) {
        int i12 = i11 / 8;
        int i13 = this.f74258b + i12;
        this.f74258b = i13;
        int i14 = (i11 - (i12 * 8)) + this.f74259c;
        this.f74259c = i14;
        if (i14 > 7) {
            this.f74258b = i13 + 1;
            this.f74259c = i14 - 8;
        }
        a();
    }

    public final void q(int i11) {
        G10.a.h(this.f74259c == 0);
        this.f74258b += i11;
        a();
    }

    public C8049B(int i11, byte[] bArr) {
        this.f74257a = bArr;
        this.f74260d = i11;
    }
}

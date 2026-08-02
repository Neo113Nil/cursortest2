package e1;

import java.nio.charset.Charset;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public int f45481a;

    /* renamed from: b, reason: collision with root package name */
    public int f45482b;

    /* renamed from: c, reason: collision with root package name */
    public int f45483c;
    public byte[] data;

    public I() {
        this.data = Z.EMPTY_BYTE_ARRAY;
    }

    public final void a() {
        int i10;
        int i11 = this.f45481a;
        AbstractC4134a.g(i11 >= 0 && (i11 < (i10 = this.f45483c) || (i11 == i10 && this.f45482b == 0)));
    }

    public int b() {
        return ((this.f45483c - this.f45481a) * 8) - this.f45482b;
    }

    public void c() {
        if (this.f45482b == 0) {
            return;
        }
        this.f45482b = 0;
        this.f45481a++;
        a();
    }

    public int d() {
        AbstractC4134a.g(this.f45482b == 0);
        return this.f45481a;
    }

    public int e() {
        return (this.f45481a * 8) + this.f45482b;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f45482b, i11);
        int i12 = this.f45482b;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.data;
        int i14 = this.f45481a;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - min;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.data[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.data;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        r(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.data[this.f45481a] & (128 >> this.f45482b)) != 0;
        q();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f45482b += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f45482b;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f45482b = i13;
            byte[] bArr = this.data;
            int i14 = this.f45481a;
            this.f45481a = i14 + 1;
            i12 |= (bArr[i14] & UByte.MAX_VALUE) << i13;
        }
        byte[] bArr2 = this.data;
        int i15 = this.f45481a;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & UByte.MAX_VALUE) >> (8 - i11)));
        if (i11 == 8) {
            this.f45482b = 0;
            this.f45481a = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.data;
            int i13 = this.f45481a;
            int i14 = i13 + 1;
            this.f45481a = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f45482b;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.f45482b;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.data;
            int i18 = this.f45481a;
            this.f45481a = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & UByte.MAX_VALUE) << i17));
            this.f45482b = i17 - 8;
        }
        int i19 = this.f45482b + i16;
        this.f45482b = i19;
        byte[] bArr4 = this.data;
        int i20 = this.f45481a;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f45482b = 0;
            this.f45481a = i20 + 1;
        }
        a();
    }

    public long j(int i10) {
        return i10 <= 32 ? Z.H1(h(i10)) : Z.G1(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        AbstractC4134a.g(this.f45482b == 0);
        System.arraycopy(this.data, this.f45481a, bArr, i10, i11);
        this.f45481a += i11;
        a();
    }

    public String l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void m(J j10) {
        o(j10.f(), j10.j());
        p(j10.g() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i10) {
        this.data = bArr;
        this.f45481a = 0;
        this.f45482b = 0;
        this.f45483c = i10;
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f45481a = i11;
        this.f45482b = i10 - (i11 * 8);
        a();
    }

    public void q() {
        int i10 = this.f45482b + 1;
        this.f45482b = i10;
        if (i10 == 8) {
            this.f45482b = 0;
            this.f45481a++;
        }
        a();
    }

    public void r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f45481a + i11;
        this.f45481a = i12;
        int i13 = this.f45482b + (i10 - (i11 * 8));
        this.f45482b = i13;
        if (i13 > 7) {
            this.f45481a = i12 + 1;
            this.f45482b = i13 - 8;
        }
        a();
    }

    public void s(int i10) {
        AbstractC4134a.g(this.f45482b == 0);
        this.f45481a += i10;
        a();
    }

    public I(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public I(byte[] bArr, int i10) {
        this.data = bArr;
        this.f45483c = i10;
    }
}

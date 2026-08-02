package o9;

import java.util.Arrays;

/* renamed from: o9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8659a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int[] f77800a;

    /* renamed from: b, reason: collision with root package name */
    private int f77801b;

    public C8659a() {
        this.f77801b = 0;
        this.f77800a = new int[1];
    }

    private void e(int i11) {
        int[] iArr = this.f77800a;
        if (i11 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i11 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f77800a = iArr2;
        }
    }

    public final void a(boolean z11) {
        e(this.f77801b + 1);
        if (z11) {
            int[] iArr = this.f77800a;
            int i11 = this.f77801b;
            int i12 = i11 / 32;
            iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
        }
        this.f77801b++;
    }

    public final void b(C8659a c8659a) {
        int i11 = c8659a.f77801b;
        e(this.f77801b + i11);
        for (int i12 = 0; i12 < i11; i12++) {
            a(c8659a.f(i12));
        }
    }

    public final void c(int i11, int i12) {
        if (i12 < 0 || i12 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        e(this.f77801b + i12);
        while (i12 > 0) {
            boolean z11 = true;
            if (((i11 >> (i12 - 1)) & 1) != 1) {
                z11 = false;
            }
            a(z11);
            i12--;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        int[] iArr = (int[]) this.f77800a.clone();
        int i11 = this.f77801b;
        C8659a c8659a = new C8659a();
        c8659a.f77800a = iArr;
        c8659a.f77801b = i11;
        return c8659a;
    }

    public final void d() {
        int length = this.f77800a.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f77800a[i11] = 0;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8659a)) {
            return false;
        }
        C8659a c8659a = (C8659a) obj;
        return this.f77801b == c8659a.f77801b && Arrays.equals(this.f77800a, c8659a.f77800a);
    }

    public final boolean f(int i11) {
        return ((1 << (i11 & 31)) & this.f77800a[i11 / 32]) != 0;
    }

    public final int[] g() {
        return this.f77800a;
    }

    public final int h(int i11) {
        int i12 = this.f77801b;
        if (i11 >= i12) {
            return i12;
        }
        int i13 = i11 / 32;
        int i14 = (-(1 << (i11 & 31))) & this.f77800a[i13];
        while (i14 == 0) {
            i13++;
            int[] iArr = this.f77800a;
            if (i13 == iArr.length) {
                return this.f77801b;
            }
            i14 = iArr[i13];
        }
        return Math.min(Integer.numberOfTrailingZeros(i14) + (i13 << 5), this.f77801b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f77800a) + (this.f77801b * 31);
    }

    public final int i(int i11) {
        int i12 = this.f77801b;
        if (i11 >= i12) {
            return i12;
        }
        int i13 = i11 / 32;
        int i14 = (-(1 << (i11 & 31))) & (~this.f77800a[i13]);
        while (i14 == 0) {
            i13++;
            int[] iArr = this.f77800a;
            if (i13 == iArr.length) {
                return this.f77801b;
            }
            i14 = ~iArr[i13];
        }
        return Math.min(Integer.numberOfTrailingZeros(i14) + (i13 << 5), this.f77801b);
    }

    public final int j() {
        return this.f77801b;
    }

    public final int k() {
        return (this.f77801b + 7) / 8;
    }

    public final boolean l(int i11, int i12) {
        if (i12 < i11 || i11 < 0 || i12 > this.f77801b) {
            throw new IllegalArgumentException();
        }
        if (i12 != i11) {
            int i13 = i12 - 1;
            int i14 = i11 / 32;
            int i15 = i13 / 32;
            int i16 = i14;
            while (i16 <= i15) {
                if ((((2 << (i16 >= i15 ? 31 & i13 : 31)) - (1 << (i16 > i14 ? 0 : i11 & 31))) & this.f77800a[i16]) != 0) {
                    return false;
                }
                i16++;
            }
        }
        return true;
    }

    public final void m() {
        int[] iArr = new int[this.f77800a.length];
        int i11 = (this.f77801b - 1) / 32;
        int i12 = i11 + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            long j11 = this.f77800a[i13];
            long j12 = ((j11 & 1431655765) << 1) | ((j11 >> 1) & 1431655765);
            long j13 = ((j12 & 858993459) << 2) | ((j12 >> 2) & 858993459);
            long j14 = ((j13 & 252645135) << 4) | ((j13 >> 4) & 252645135);
            long j15 = ((j14 & 16711935) << 8) | ((j14 >> 8) & 16711935);
            iArr[i11 - i13] = (int) (((j15 & 65535) << 16) | ((j15 >> 16) & 65535));
        }
        int i14 = this.f77801b;
        int i15 = i12 << 5;
        if (i14 != i15) {
            int i16 = i15 - i14;
            int i17 = iArr[0] >>> i16;
            for (int i18 = 1; i18 < i12; i18++) {
                int i19 = iArr[i18];
                iArr[i18 - 1] = i17 | (i19 << (32 - i16));
                i17 = i19 >>> i16;
            }
            iArr[i11] = i17;
        }
        this.f77800a = iArr;
    }

    public final void n(int i11) {
        int[] iArr = this.f77800a;
        int i12 = i11 / 32;
        iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
    }

    public final void o(int i11, int i12) {
        this.f77800a[i11 / 32] = i12;
    }

    public final void p(C8659a c8659a) {
        if (this.f77801b != c8659a.f77801b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i11 = 0;
        while (true) {
            int[] iArr = this.f77800a;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = iArr[i11] ^ c8659a.f77800a[i11];
            i11++;
        }
    }

    public final String toString() {
        int i11 = this.f77801b;
        StringBuilder sb2 = new StringBuilder((i11 / 8) + i11 + 1);
        for (int i12 = 0; i12 < this.f77801b; i12++) {
            if ((i12 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(f(i12) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public C8659a(int i11) {
        this.f77801b = i11;
        this.f77800a = new int[(i11 + 31) / 32];
    }
}

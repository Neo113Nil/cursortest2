package o9;

import java.util.Arrays;

/* renamed from: o9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8660b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final int f77802a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77803b;

    /* renamed from: c, reason: collision with root package name */
    private final int f77804c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f77805d;

    public C8660b(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f77802a = i11;
        this.f77803b = i12;
        int i13 = (i11 + 31) / 32;
        this.f77804c = i13;
        this.f77805d = new int[i13 * i12];
    }

    public final void a() {
        int[] iArr = this.f77805d;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = 0;
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8660b clone() {
        int[] iArr = (int[]) this.f77805d.clone();
        return new C8660b(this.f77802a, this.f77803b, this.f77804c, iArr);
    }

    public final void c(int i11, int i12) {
        int i13 = (i11 / 32) + (i12 * this.f77804c);
        int[] iArr = this.f77805d;
        iArr[i13] = (1 << (i11 & 31)) ^ iArr[i13];
    }

    public final boolean d(int i11, int i12) {
        return ((this.f77805d[(i11 / 32) + (i12 * this.f77804c)] >>> (i11 & 31)) & 1) != 0;
    }

    public final int[] e() {
        int[] iArr = this.f77805d;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i11 = this.f77804c;
        int i12 = length / i11;
        int i13 = (length % i11) << 5;
        int i14 = iArr[length];
        int i15 = 31;
        while ((i14 >>> i15) == 0) {
            i15--;
        }
        return new int[]{i13 + i15, i12};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8660b)) {
            return false;
        }
        C8660b c8660b = (C8660b) obj;
        return this.f77802a == c8660b.f77802a && this.f77803b == c8660b.f77803b && this.f77804c == c8660b.f77804c && Arrays.equals(this.f77805d, c8660b.f77805d);
    }

    public final int[] f() {
        int i11 = this.f77802a;
        int i12 = this.f77803b;
        int i13 = -1;
        int i14 = i12;
        int i15 = -1;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            while (true) {
                int i18 = this.f77804c;
                if (i17 < i18) {
                    int i19 = this.f77805d[(i18 * i16) + i17];
                    if (i19 != 0) {
                        if (i16 < i14) {
                            i14 = i16;
                        }
                        if (i16 > i15) {
                            i15 = i16;
                        }
                        int i21 = i17 << 5;
                        if (i21 < i11) {
                            int i22 = 0;
                            while ((i19 << (31 - i22)) == 0) {
                                i22++;
                            }
                            int i23 = i22 + i21;
                            if (i23 < i11) {
                                i11 = i23;
                            }
                        }
                        if (i21 + 31 > i13) {
                            int i24 = 31;
                            while ((i19 >>> i24) == 0) {
                                i24--;
                            }
                            int i25 = i21 + i24;
                            if (i25 > i13) {
                                i13 = i25;
                            }
                        }
                    }
                    i17++;
                }
            }
        }
        if (i13 < i11 || i15 < i14) {
            return null;
        }
        return new int[]{i11, i14, (i13 - i11) + 1, (i15 - i14) + 1};
    }

    public final int g() {
        return this.f77803b;
    }

    public final C8659a h(int i11, C8659a c8659a) {
        int j11 = c8659a.j();
        int i12 = this.f77802a;
        if (j11 < i12) {
            c8659a = new C8659a(i12);
        } else {
            c8659a.d();
        }
        int i13 = this.f77804c;
        int i14 = i11 * i13;
        for (int i15 = 0; i15 < i13; i15++) {
            c8659a.o(i15 << 5, this.f77805d[i14 + i15]);
        }
        return c8659a;
    }

    public final int hashCode() {
        int i11 = this.f77802a;
        return Arrays.hashCode(this.f77805d) + (((((((i11 * 31) + i11) * 31) + this.f77803b) * 31) + this.f77804c) * 31);
    }

    public final int[] i() {
        int[] iArr;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            iArr = this.f77805d;
            if (i12 >= iArr.length || iArr[i12] != 0) {
                break;
            }
            i12++;
        }
        if (i12 == iArr.length) {
            return null;
        }
        int i13 = this.f77804c;
        int i14 = i12 / i13;
        int i15 = (i12 % i13) << 5;
        while ((iArr[i12] << (31 - i11)) == 0) {
            i11++;
        }
        return new int[]{i15 + i11, i14};
    }

    public final int j() {
        return this.f77802a;
    }

    public final void k() {
        int i11 = this.f77802a;
        C8659a c8659a = new C8659a(i11);
        C8659a c8659a2 = new C8659a(i11);
        int i12 = this.f77803b;
        int i13 = (i12 + 1) / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            c8659a = h(i14, c8659a);
            int i15 = (i12 - 1) - i14;
            c8659a2 = h(i15, c8659a2);
            c8659a.m();
            c8659a2.m();
            int[] g10 = c8659a2.g();
            int i16 = this.f77804c;
            int[] iArr = this.f77805d;
            System.arraycopy(g10, 0, iArr, i14 * i16, i16);
            System.arraycopy(c8659a.g(), 0, iArr, i15 * i16, i16);
        }
    }

    public final void l(int i11, int i12) {
        int i13 = (i11 / 32) + (i12 * this.f77804c);
        int[] iArr = this.f77805d;
        iArr[i13] = (1 << (i11 & 31)) | iArr[i13];
    }

    public final void m(int i11, int i12, int i13, int i14) {
        if (i12 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i14 <= 0 || i13 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i15 = i13 + i11;
        int i16 = i14 + i12;
        if (i16 > this.f77803b || i15 > this.f77802a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i12 < i16) {
            int i17 = this.f77804c * i12;
            for (int i18 = i11; i18 < i15; i18++) {
                int i19 = (i18 / 32) + i17;
                int[] iArr = this.f77805d;
                iArr[i19] = iArr[i19] | (1 << (i18 & 31));
            }
            i12++;
        }
    }

    public final String toString() {
        int i11 = this.f77802a;
        int i12 = this.f77803b;
        StringBuilder sb2 = new StringBuilder((i11 + 1) * i12);
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                sb2.append(d(i14, i13) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    private C8660b(int i11, int i12, int i13, int[] iArr) {
        this.f77802a = i11;
        this.f77803b = i12;
        this.f77804c = i13;
        this.f77805d = iArr;
    }
}

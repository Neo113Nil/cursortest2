package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l6 {

    /* renamed from: f, reason: collision with root package name */
    public static final l6 f5126f = new l6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f5127a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5128b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5129c;

    /* renamed from: d, reason: collision with root package name */
    public int f5130d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5131e;

    public l6(int i5, int[] iArr, Object[] objArr, boolean z5) {
        this.f5127a = i5;
        this.f5128b = iArr;
        this.f5129c = objArr;
        this.f5131e = z5;
    }

    public static l6 a() {
        return new l6(0, new int[8], new Object[8], true);
    }

    public final void b(u5 u5Var) {
        if (this.f5127a != 0) {
            for (int i5 = 0; i5 < this.f5127a; i5++) {
                int i10 = this.f5128b[i5];
                Object obj = this.f5129c[i5];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    ((x4) u5Var.f5267a).Q(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    ((x4) u5Var.f5267a).R(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    x4 x4Var = (x4) u5Var.f5267a;
                    x4Var.V((i12 << 3) | 2);
                    x4Var.S((w4) obj);
                } else if (i11 == 3) {
                    ((x4) u5Var.f5267a).M(i12, 3);
                    ((l6) obj).b(u5Var);
                    ((x4) u5Var.f5267a).M(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new o5());
                    }
                    ((x4) u5Var.f5267a).P(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int b02;
        int K;
        int b03;
        int i5 = this.f5130d;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5127a; i11++) {
            int i12 = this.f5128b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f5129c[i11]).getClass();
                    b03 = x4.b0(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    w4 w4Var = (w4) this.f5129c[i11];
                    int b04 = x4.b0(i15);
                    int c2 = w4Var.c();
                    i10 = androidx.appcompat.widget.c1.g(c2, c2, b04, i10);
                } else if (i14 == 3) {
                    int b05 = x4.b0(i13 << 3);
                    b02 = b05 + b05;
                    K = ((l6) this.f5129c[i11]).c();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new o5());
                    }
                    ((Integer) this.f5129c[i11]).getClass();
                    b03 = x4.b0(i13 << 3) + 4;
                }
                i10 = b03 + i10;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.f5129c[i11]).longValue();
                b02 = x4.b0(i16);
                K = x4.K(longValue);
            }
            i10 = K + b02 + i10;
        }
        this.f5130d = i10;
        return i10;
    }

    public final void d(int i5, Object obj) {
        if (!this.f5131e) {
            throw new UnsupportedOperationException();
        }
        e(this.f5127a + 1);
        int[] iArr = this.f5128b;
        int i10 = this.f5127a;
        iArr[i10] = i5;
        this.f5129c[i10] = obj;
        this.f5127a = i10 + 1;
    }

    public final void e(int i5) {
        int[] iArr = this.f5128b;
        if (i5 > iArr.length) {
            int i10 = this.f5127a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i5) {
                i5 = i11;
            }
            if (i5 < 8) {
                i5 = 8;
            }
            this.f5128b = Arrays.copyOf(iArr, i5);
            this.f5129c = Arrays.copyOf(this.f5129c, i5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        int i5 = this.f5127a;
        if (i5 == l6Var.f5127a) {
            int[] iArr = this.f5128b;
            int[] iArr2 = l6Var.f5128b;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.f5129c;
                    Object[] objArr2 = l6Var.f5129c;
                    int i11 = this.f5127a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f5127a;
        int i10 = i5 + 527;
        int[] iArr = this.f5128b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i5; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.f5129c;
        int i15 = this.f5127a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}

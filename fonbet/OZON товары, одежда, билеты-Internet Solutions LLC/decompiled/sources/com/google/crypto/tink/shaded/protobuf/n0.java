package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.t0;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: f, reason: collision with root package name */
    private static final n0 f59438f = new n0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f59439a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f59440b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f59441c;

    /* renamed from: d, reason: collision with root package name */
    private int f59442d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f59443e;

    private n0() {
        this(0, new int[8], new Object[8], true);
    }

    private void a(int i11) {
        int[] iArr = this.f59440b;
        if (i11 > iArr.length) {
            int i12 = this.f59439a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f59440b = Arrays.copyOf(iArr, i11);
            this.f59441c = Arrays.copyOf(this.f59441c, i11);
        }
    }

    public static n0 b() {
        return f59438f;
    }

    static n0 g(n0 n0Var, n0 n0Var2) {
        int i11 = n0Var.f59439a + n0Var2.f59439a;
        int[] copyOf = Arrays.copyOf(n0Var.f59440b, i11);
        System.arraycopy(n0Var2.f59440b, 0, copyOf, n0Var.f59439a, n0Var2.f59439a);
        Object[] copyOf2 = Arrays.copyOf(n0Var.f59441c, i11);
        System.arraycopy(n0Var2.f59441c, 0, copyOf2, n0Var.f59439a, n0Var2.f59439a);
        return new n0(i11, copyOf, copyOf2, true);
    }

    static n0 h() {
        return new n0();
    }

    public final int c() {
        int i11;
        int k11;
        int i12;
        int i13 = this.f59442d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f59439a; i15++) {
            int i16 = this.f59440b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.f59441c[i15]).getClass();
                    i12 = AbstractC5906l.i(i17) + 8;
                } else if (i18 == 2) {
                    i12 = AbstractC5906l.c(i17, (AbstractC5903i) this.f59441c[i15]);
                } else if (i18 == 3) {
                    i11 = AbstractC5906l.i(i17) * 2;
                    k11 = ((n0) this.f59441c[i15]).c();
                } else {
                    if (i18 != 5) {
                        throw new IllegalStateException(A.e());
                    }
                    ((Integer) this.f59441c[i15]).getClass();
                    i12 = AbstractC5906l.i(i17) + 4;
                }
                i14 = i12 + i14;
            } else {
                long longValue = ((Long) this.f59441c[i15]).longValue();
                i11 = AbstractC5906l.i(i17);
                k11 = AbstractC5906l.k(longValue);
            }
            i14 = k11 + i11 + i14;
        }
        this.f59442d = i14;
        return i14;
    }

    public final int d() {
        int i11 = this.f59442d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f59439a; i13++) {
            int i14 = this.f59440b[i13] >>> 3;
            i12 += AbstractC5906l.c(3, (AbstractC5903i) this.f59441c[i13]) + AbstractC5906l.j(i14) + AbstractC5906l.i(2) + (AbstractC5906l.i(1) * 2);
        }
        this.f59442d = i12;
        return i12;
    }

    public final void e() {
        if (this.f59443e) {
            this.f59443e = false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        int i11 = this.f59439a;
        if (i11 == n0Var.f59439a) {
            int[] iArr = this.f59440b;
            int[] iArr2 = n0Var.f59440b;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    Object[] objArr = this.f59441c;
                    Object[] objArr2 = n0Var.f59441c;
                    int i13 = this.f59439a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (objArr[i14].equals(objArr2[i14])) {
                        }
                    }
                    return true;
                }
                if (iArr[i12] != iArr2[i12]) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    final void f(n0 n0Var) {
        if (n0Var.equals(f59438f)) {
            return;
        }
        if (!this.f59443e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f59439a + n0Var.f59439a;
        a(i11);
        System.arraycopy(n0Var.f59440b, 0, this.f59440b, this.f59439a, n0Var.f59439a);
        System.arraycopy(n0Var.f59441c, 0, this.f59441c, this.f59439a, n0Var.f59439a);
        this.f59439a = i11;
    }

    public final int hashCode() {
        int i11 = this.f59439a;
        int i12 = (527 + i11) * 31;
        int[] iArr = this.f59440b;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i12 + i14) * 31;
        Object[] objArr = this.f59441c;
        int i17 = this.f59439a;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    final void i(int i11, StringBuilder sb2) {
        for (int i12 = 0; i12 < this.f59439a; i12++) {
            U.b(sb2, i11, String.valueOf(this.f59440b[i12] >>> 3), this.f59441c[i12]);
        }
    }

    final void j(int i11, Object obj) {
        if (!this.f59443e) {
            throw new UnsupportedOperationException();
        }
        a(this.f59439a + 1);
        int[] iArr = this.f59440b;
        int i12 = this.f59439a;
        iArr[i12] = i11;
        this.f59441c[i12] = obj;
        this.f59439a = i12 + 1;
    }

    final void k(t0 t0Var) throws IOException {
        ((C5907m) t0Var).getClass();
        if (t0.a.ASCENDING == t0.a.DESCENDING) {
            for (int i11 = this.f59439a - 1; i11 >= 0; i11--) {
                ((C5907m) t0Var).x(this.f59440b[i11] >>> 3, this.f59441c[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.f59439a; i12++) {
            ((C5907m) t0Var).x(this.f59440b[i12] >>> 3, this.f59441c[i12]);
        }
    }

    public final void l(t0 t0Var) throws IOException {
        if (this.f59439a == 0) {
            return;
        }
        C5907m c5907m = (C5907m) t0Var;
        c5907m.getClass();
        for (int i11 = 0; i11 < this.f59439a; i11++) {
            int i12 = this.f59440b[i11];
            Object obj = this.f59441c[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                c5907m.t(i13, ((Long) obj).longValue());
            } else if (i14 == 1) {
                c5907m.m(i13, ((Long) obj).longValue());
            } else if (i14 == 2) {
                c5907m.d(i13, (AbstractC5903i) obj);
            } else if (i14 == 3) {
                c5907m.getClass();
                c5907m.G(i13);
                ((n0) obj).l(t0Var);
                c5907m.h(i13);
            } else {
                if (i14 != 5) {
                    throw new RuntimeException(A.e());
                }
                c5907m.k(i13, ((Integer) obj).intValue());
            }
        }
    }

    private n0(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f59442d = -1;
        this.f59439a = i11;
        this.f59440b = iArr;
        this.f59441c = objArr;
        this.f59443e = z11;
    }
}

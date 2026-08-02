package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h4 {

    /* renamed from: f, reason: collision with root package name */
    public static final h4 f5474f = new h4(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f5475a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5476b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5477c;

    /* renamed from: d, reason: collision with root package name */
    public int f5478d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5479e;

    public h4(int i5, int[] iArr, Object[] objArr, boolean z5) {
        this.f5475a = i5;
        this.f5476b = iArr;
        this.f5477c = objArr;
        this.f5479e = z5;
    }

    public static h4 b() {
        return new h4(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int e0;
        int O;
        int e02;
        int i5 = this.f5478d;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5475a; i11++) {
            int i12 = this.f5476b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f5477c[i11]).getClass();
                    e02 = z2.e0(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    y2 y2Var = (y2) this.f5477c[i11];
                    int e03 = z2.e0(i15);
                    int c2 = y2Var.c();
                    i10 = androidx.appcompat.widget.c1.x(c2, c2, e03, i10);
                } else if (i14 == 3) {
                    int e04 = z2.e0(i13 << 3);
                    e0 = e04 + e04;
                    O = ((h4) this.f5477c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new m3());
                    }
                    ((Integer) this.f5477c[i11]).getClass();
                    e02 = z2.e0(i13 << 3) + 4;
                }
                i10 = e02 + i10;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.f5477c[i11]).longValue();
                e0 = z2.e0(i16);
                O = z2.O(longValue);
            }
            i10 = O + e0 + i10;
        }
        this.f5478d = i10;
        return i10;
    }

    public final void c(int i5, Object obj) {
        if (!this.f5479e) {
            throw new UnsupportedOperationException();
        }
        e(this.f5475a + 1);
        int[] iArr = this.f5476b;
        int i10 = this.f5475a;
        iArr[i10] = i5;
        this.f5477c[i10] = obj;
        this.f5475a = i10 + 1;
    }

    public final void d(r3 r3Var) {
        if (this.f5475a != 0) {
            for (int i5 = 0; i5 < this.f5475a; i5++) {
                int i10 = this.f5476b[i5];
                Object obj = this.f5477c[i5];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    ((z2) r3Var.f5558a).b0(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    ((z2) r3Var.f5558a).T(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    ((z2) r3Var.f5558a).Q(i12, (y2) obj);
                } else if (i11 == 3) {
                    ((z2) r3Var.f5558a).Y(i12, 3);
                    ((h4) obj).d(r3Var);
                    ((z2) r3Var.f5558a).Y(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new m3());
                    }
                    ((z2) r3Var.f5558a).R(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i5) {
        int[] iArr = this.f5476b;
        if (i5 > iArr.length) {
            int i10 = this.f5475a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i5) {
                i5 = i11;
            }
            if (i5 < 8) {
                i5 = 8;
            }
            this.f5476b = Arrays.copyOf(iArr, i5);
            this.f5477c = Arrays.copyOf(this.f5477c, i5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        int i5 = this.f5475a;
        if (i5 == h4Var.f5475a) {
            int[] iArr = this.f5476b;
            int[] iArr2 = h4Var.f5476b;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.f5477c;
                    Object[] objArr2 = h4Var.f5477c;
                    int i11 = this.f5475a;
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
        int i5 = this.f5475a;
        int i10 = i5 + 527;
        int[] iArr = this.f5476b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i5; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.f5477c;
        int i15 = this.f5475a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}

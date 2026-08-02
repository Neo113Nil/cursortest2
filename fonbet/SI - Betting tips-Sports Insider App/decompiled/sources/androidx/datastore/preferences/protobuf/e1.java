package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final e1 f1603f = new e1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f1604a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1605b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1606c;

    /* renamed from: d, reason: collision with root package name */
    public int f1607d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1608e;

    public e1(int i5, int[] iArr, Object[] objArr, boolean z5) {
        this.f1604a = i5;
        this.f1605b = iArr;
        this.f1606c = objArr;
        this.f1608e = z5;
    }

    public final void a(int i5) {
        int[] iArr = this.f1605b;
        if (i5 > iArr.length) {
            int i10 = this.f1604a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i5) {
                i5 = i11;
            }
            if (i5 < 8) {
                i5 = 8;
            }
            this.f1605b = Arrays.copyOf(iArr, i5);
            this.f1606c = Arrays.copyOf(this.f1606c, i5);
        }
    }

    public final int b() {
        int e0;
        int g02;
        int e02;
        int i5 = this.f1607d;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f1604a; i11++) {
            int i12 = this.f1605b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f1606c[i11]).getClass();
                    e02 = o.e0(i13) + 8;
                } else if (i14 == 2) {
                    e02 = o.c0(i13, (i) this.f1606c[i11]);
                } else if (i14 == 3) {
                    e0 = o.e0(i13) * 2;
                    g02 = ((e1) this.f1606c[i11]).b();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(c0.b());
                    }
                    ((Integer) this.f1606c[i11]).getClass();
                    e02 = o.e0(i13) + 4;
                }
                i10 = e02 + i10;
            } else {
                long longValue = ((Long) this.f1606c[i11]).longValue();
                e0 = o.e0(i13);
                g02 = o.g0(longValue);
            }
            i10 = g02 + e0 + i10;
        }
        this.f1607d = i10;
        return i10;
    }

    public final void c(int i5, Object obj) {
        if (!this.f1608e) {
            throw new UnsupportedOperationException();
        }
        a(this.f1604a + 1);
        int[] iArr = this.f1605b;
        int i10 = this.f1604a;
        iArr[i10] = i5;
        this.f1606c[i10] = obj;
        this.f1604a = i10 + 1;
    }

    public final void d(h0 h0Var) {
        if (this.f1604a == 0) {
            return;
        }
        h0Var.getClass();
        o oVar = (o) h0Var.f1616a;
        for (int i5 = 0; i5 < this.f1604a; i5++) {
            int i10 = this.f1605b[i5];
            Object obj = this.f1606c[i5];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                oVar.A0(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                oVar.q0(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                oVar.m0(i11, (i) obj);
            } else if (i12 == 3) {
                oVar.x0(i11, 3);
                ((e1) obj).d(h0Var);
                oVar.x0(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(c0.b());
                }
                oVar.o0(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        int i5 = this.f1604a;
        if (i5 == e1Var.f1604a) {
            int[] iArr = this.f1605b;
            int[] iArr2 = e1Var.f1605b;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.f1606c;
                    Object[] objArr2 = e1Var.f1606c;
                    int i11 = this.f1604a;
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
        int i5 = this.f1604a;
        int i10 = (527 + i5) * 31;
        int[] iArr = this.f1605b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i5; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f1606c;
        int i15 = this.f1604a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}

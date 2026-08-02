package com.logrocket.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: f, reason: collision with root package name */
    public static final o1 f6767f = new o1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f6768a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6769b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6770c;

    /* renamed from: d, reason: collision with root package name */
    public int f6771d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6772e;

    public o1(int i5, int[] iArr, Object[] objArr, boolean z5) {
        this.f6768a = i5;
        this.f6769b = iArr;
        this.f6770c = objArr;
        this.f6772e = z5;
    }

    public final int a() {
        int o3;
        int q;
        int j;
        int i5 = this.f6771d;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f6768a; i11++) {
            int i12 = this.f6769b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f6770c[i11]).getClass();
                    j = p.j(i13);
                } else if (i14 == 2) {
                    j = p.g(i13, (j) this.f6770c[i11]);
                } else if (i14 == 3) {
                    o3 = p.o(i13) * 2;
                    q = ((o1) this.f6770c[i11]).a();
                } else {
                    if (i14 != 5) {
                        int i15 = f0.f6689a;
                        throw new IllegalStateException(new e0("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f6770c[i11]).getClass();
                    j = p.i(i13);
                }
                i10 = j + i10;
            } else {
                long longValue = ((Long) this.f6770c[i11]).longValue();
                o3 = p.o(i13);
                q = p.q(longValue);
            }
            i10 = q + o3 + i10;
        }
        this.f6771d = i10;
        return i10;
    }

    public final void b(n0 n0Var) {
        if (this.f6768a == 0) {
            return;
        }
        n0Var.getClass();
        p pVar = (p) n0Var.f6757a;
        for (int i5 = 0; i5 < this.f6768a; i5++) {
            int i10 = this.f6769b[i5];
            Object obj = this.f6770c[i5];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                pVar.N(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                pVar.C(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                n0Var.b(i11, (j) obj);
            } else if (i12 == 3) {
                pVar.K(i11, 3);
                ((o1) obj).b(n0Var);
                pVar.K(i11, 4);
            } else {
                if (i12 != 5) {
                    int i13 = f0.f6689a;
                    throw new RuntimeException(new e0("Protocol message tag had invalid wire type."));
                }
                pVar.A(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i5 = this.f6768a;
        if (i5 == o1Var.f6768a) {
            int[] iArr = this.f6769b;
            int[] iArr2 = o1Var.f6769b;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.f6770c;
                    Object[] objArr2 = o1Var.f6770c;
                    int i11 = this.f6768a;
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
        int i5 = this.f6768a;
        int i10 = (527 + i5) * 31;
        int[] iArr = this.f6769b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i5; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f6770c;
        int i15 = this.f6768a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}

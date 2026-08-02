package q9;

/* loaded from: classes9.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final C8999a f81756a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f81757b;

    b(C8999a c8999a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f81756a = c8999a;
        int length = iArr.length;
        int i11 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f81757b = iArr;
            return;
        }
        while (i11 < length && iArr[i11] == 0) {
            i11++;
        }
        if (i11 == length) {
            this.f81757b = new int[]{0};
            return;
        }
        int i12 = length - i11;
        int[] iArr2 = new int[i12];
        this.f81757b = iArr2;
        System.arraycopy(iArr, i11, iArr2, 0, i12);
    }

    final b a(b bVar) {
        C8999a c8999a = bVar.f81756a;
        C8999a c8999a2 = this.f81756a;
        if (!c8999a2.equals(c8999a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g()) {
            return bVar;
        }
        if (bVar.g()) {
            return this;
        }
        int[] iArr = this.f81757b;
        int length = iArr.length;
        int[] iArr2 = bVar.f81757b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i11 = length2; i11 < iArr.length; i11++) {
            iArr3[i11] = iArr2[i11 - length2] ^ iArr[i11];
        }
        return new b(c8999a2, iArr3);
    }

    final b[] b(b bVar) {
        C8999a c8999a = bVar.f81756a;
        C8999a c8999a2 = this.f81756a;
        if (!c8999a2.equals(c8999a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.g()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b f7 = c8999a2.f();
        int g10 = c8999a2.g(bVar.d(bVar.f()));
        b bVar2 = this;
        while (bVar2.f() >= bVar.f() && !bVar2.g()) {
            int f11 = bVar2.f() - bVar.f();
            int i11 = c8999a2.i(bVar2.d(bVar2.f()), g10);
            b j11 = bVar.j(f11, i11);
            f7 = f7.a(c8999a2.a(f11, i11));
            bVar2 = bVar2.a(j11);
        }
        return new b[]{f7, bVar2};
    }

    final int c(int i11) {
        if (i11 == 0) {
            return d(0);
        }
        int[] iArr = this.f81757b;
        if (i11 != 1) {
            int i12 = iArr[0];
            int length = iArr.length;
            for (int i13 = 1; i13 < length; i13++) {
                i12 = this.f81756a.i(i11, i12) ^ iArr[i13];
            }
            return i12;
        }
        int i14 = 0;
        for (int i15 : iArr) {
            C8999a c8999a = C8999a.f81741h;
            i14 ^= i15;
        }
        return i14;
    }

    final int d(int i11) {
        return this.f81757b[(r0.length - 1) - i11];
    }

    final int[] e() {
        return this.f81757b;
    }

    final int f() {
        return this.f81757b.length - 1;
    }

    final boolean g() {
        return this.f81757b[0] == 0;
    }

    final b h(int i11) {
        C8999a c8999a = this.f81756a;
        if (i11 == 0) {
            return c8999a.f();
        }
        if (i11 == 1) {
            return this;
        }
        int[] iArr = this.f81757b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr2[i12] = c8999a.i(iArr[i12], i11);
        }
        return new b(c8999a, iArr2);
    }

    final b i(b bVar) {
        C8999a c8999a = bVar.f81756a;
        C8999a c8999a2 = this.f81756a;
        if (!c8999a2.equals(c8999a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g() || bVar.g()) {
            return c8999a2.f();
        }
        int[] iArr = this.f81757b;
        int length = iArr.length;
        int[] iArr2 = bVar.f81757b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            for (int i13 = 0; i13 < length2; i13++) {
                int i14 = i11 + i13;
                iArr3[i14] = iArr3[i14] ^ c8999a2.i(i12, iArr2[i13]);
            }
        }
        return new b(c8999a2, iArr3);
    }

    final b j(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        C8999a c8999a = this.f81756a;
        if (i12 == 0) {
            return c8999a.f();
        }
        int[] iArr = this.f81757b;
        int length = iArr.length;
        int[] iArr2 = new int[i11 + length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr2[i13] = c8999a.i(iArr[i13], i12);
        }
        return new b(c8999a, iArr2);
    }

    public final String toString() {
        if (g()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(f() * 8);
        for (int f7 = f(); f7 >= 0; f7--) {
            int d11 = d(f7);
            if (d11 != 0) {
                if (d11 < 0) {
                    if (f7 == f()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    d11 = -d11;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (f7 == 0 || d11 != 1) {
                    int h11 = this.f81756a.h(d11);
                    if (h11 == 0) {
                        sb2.append('1');
                    } else if (h11 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(h11);
                    }
                }
                if (f7 != 0) {
                    if (f7 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(f7);
                    }
                }
            }
        }
        return sb2.toString();
    }
}

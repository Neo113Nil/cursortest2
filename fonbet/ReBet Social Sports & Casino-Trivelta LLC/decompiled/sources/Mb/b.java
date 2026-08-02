package Mb;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f7607a;
    private final int[] coefficients;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f7607a = aVar;
        int length = iArr.length;
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.coefficients = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.coefficients = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.coefficients = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    public b a(b bVar) {
        if (!this.f7607a.equals(bVar.f7607a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f()) {
            return bVar;
        }
        if (bVar.f()) {
            return this;
        }
        int[] iArr = this.coefficients;
        int[] iArr2 = bVar.coefficients;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = a.a(iArr2[i10 - length], iArr[i10]);
        }
        return new b(this.f7607a, iArr3);
    }

    public b[] b(b bVar) {
        if (!this.f7607a.equals(bVar.f7607a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b e10 = this.f7607a.e();
        int f10 = this.f7607a.f(bVar.c(bVar.e()));
        b bVar2 = this;
        while (bVar2.e() >= bVar.e() && !bVar2.f()) {
            int e11 = bVar2.e() - bVar.e();
            int h10 = this.f7607a.h(bVar2.c(bVar2.e()), f10);
            b h11 = bVar.h(e11, h10);
            e10 = e10.a(this.f7607a.b(e11, h10));
            bVar2 = bVar2.a(h11);
        }
        return new b[]{e10, bVar2};
    }

    public int c(int i10) {
        return this.coefficients[(r0.length - 1) - i10];
    }

    public int[] d() {
        return this.coefficients;
    }

    public int e() {
        return this.coefficients.length - 1;
    }

    public boolean f() {
        return this.coefficients[0] == 0;
    }

    public b g(b bVar) {
        if (!this.f7607a.equals(bVar.f7607a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f() || bVar.f()) {
            return this.f7607a.e();
        }
        int[] iArr = this.coefficients;
        int length = iArr.length;
        int[] iArr2 = bVar.coefficients;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = a.a(iArr3[i13], this.f7607a.h(i11, iArr2[i12]));
            }
        }
        return new b(this.f7607a, iArr3);
    }

    public b h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f7607a.e();
        }
        int length = this.coefficients.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f7607a.h(this.coefficients[i12], i11);
        }
        return new b(this.f7607a, iArr);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(e() * 8);
        for (int e10 = e(); e10 >= 0; e10--) {
            int c10 = c(e10);
            if (c10 != 0) {
                if (c10 < 0) {
                    sb2.append(" - ");
                    c10 = -c10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (e10 == 0 || c10 != 1) {
                    int g10 = this.f7607a.g(c10);
                    if (g10 == 0) {
                        sb2.append('1');
                    } else if (g10 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(g10);
                    }
                }
                if (e10 != 0) {
                    if (e10 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(e10);
                    }
                }
            }
        }
        return sb2.toString();
    }
}

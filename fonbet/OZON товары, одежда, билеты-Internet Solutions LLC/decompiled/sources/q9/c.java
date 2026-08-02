package q9;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final C8999a f81758a;

    public c(C8999a c8999a) {
        this.f81758a = c8999a;
    }

    public final void a(int[] iArr, int i11) throws e {
        int[] iArr2;
        C8999a c8999a = this.f81758a;
        b bVar = new b(c8999a, iArr);
        int[] iArr3 = new int[i11];
        boolean z11 = true;
        for (int i12 = 0; i12 < i11; i12++) {
            int c11 = bVar.c(c8999a.b(c8999a.c() + i12));
            iArr3[(i11 - 1) - i12] = c11;
            if (c11 != 0) {
                z11 = false;
            }
        }
        if (z11) {
            return;
        }
        b bVar2 = new b(c8999a, iArr3);
        b a11 = c8999a.a(i11, 1);
        if (a11.f() >= bVar2.f()) {
            a11 = bVar2;
            bVar2 = a11;
        }
        b f7 = c8999a.f();
        b d11 = c8999a.d();
        do {
            b bVar3 = a11;
            a11 = bVar2;
            bVar2 = bVar3;
            b bVar4 = d11;
            b bVar5 = f7;
            f7 = bVar4;
            if (bVar2.f() < i11 / 2) {
                int d12 = f7.d(0);
                if (d12 == 0) {
                    throw new e("sigmaTilde(0) was zero");
                }
                int g10 = c8999a.g(d12);
                b[] bVarArr = {f7.h(g10), bVar2.h(g10)};
                b bVar6 = bVarArr[0];
                b bVar7 = bVarArr[1];
                int f11 = bVar6.f();
                if (f11 == 1) {
                    iArr2 = new int[]{bVar6.d(1)};
                } else {
                    int[] iArr4 = new int[f11];
                    int i13 = 0;
                    for (int i14 = 1; i14 < c8999a.e() && i13 < f11; i14++) {
                        if (bVar6.c(i14) == 0) {
                            iArr4[i13] = c8999a.g(i14);
                            i13++;
                        }
                    }
                    if (i13 != f11) {
                        throw new e("Error locator degree does not match number of roots");
                    }
                    iArr2 = iArr4;
                }
                int length = iArr2.length;
                int[] iArr5 = new int[length];
                for (int i15 = 0; i15 < length; i15++) {
                    int g11 = c8999a.g(iArr2[i15]);
                    int i16 = 1;
                    for (int i17 = 0; i17 < length; i17++) {
                        if (i15 != i17) {
                            int i18 = c8999a.i(iArr2[i17], g11);
                            i16 = c8999a.i(i16, (i18 & 1) == 0 ? i18 | 1 : i18 & (-2));
                        }
                    }
                    iArr5[i15] = c8999a.i(bVar7.c(g11), c8999a.g(i16));
                    if (c8999a.c() != 0) {
                        iArr5[i15] = c8999a.i(iArr5[i15], g11);
                    }
                }
                for (int i19 = 0; i19 < iArr2.length; i19++) {
                    int length2 = (iArr.length - 1) - c8999a.h(iArr2[i19]);
                    if (length2 < 0) {
                        throw new e("Bad error location");
                    }
                    iArr[length2] = iArr[length2] ^ iArr5[i19];
                }
                return;
            }
            if (bVar2.g()) {
                throw new e("r_{i-1} was zero");
            }
            b f12 = c8999a.f();
            int g12 = c8999a.g(bVar2.d(bVar2.f()));
            while (a11.f() >= bVar2.f() && !a11.g()) {
                int f13 = a11.f() - bVar2.f();
                int i21 = c8999a.i(a11.d(a11.f()), g12);
                f12 = f12.a(c8999a.a(f13, i21));
                a11 = a11.a(bVar2.j(f13, i21));
            }
            d11 = f12.i(f7).a(bVar5);
        } while (a11.f() < bVar2.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}

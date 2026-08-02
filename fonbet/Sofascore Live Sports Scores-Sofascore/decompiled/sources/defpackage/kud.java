package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kud extends cvd {
    public static final kud c = new kud(1, 0, 2);

    @Override // defpackage.cvd
    public final void a(zz0 zz0Var, qf0 qf0Var, mlh mlhVar, qn2 qn2Var, dvd dvdVar) {
        int[] iArr;
        vu8 vu8Var;
        int c2;
        int g = zz0Var.g(0);
        if (mlhVar.n != 0) {
            sf3.a("Cannot move a group while inserting");
        }
        if (g < 0) {
            sf3.a("Parameter offset is out of bounds");
        }
        if (g == 0) {
            return;
        }
        int i = mlhVar.t;
        int i2 = mlhVar.v;
        int i3 = mlhVar.u;
        int i4 = i;
        while (true) {
            iArr = mlhVar.b;
            if (g <= 0) {
                break;
            }
            i4 += iArr[(mlhVar.q(i4) * 5) + 3];
            if (i4 > i3) {
                sf3.a("Parameter offset is out of bounds");
            }
            g--;
        }
        int i5 = iArr[(mlhVar.q(i4) * 5) + 3];
        int f = mlhVar.f(mlhVar.q(mlhVar.t), mlhVar.b);
        int f2 = mlhVar.f(mlhVar.q(i4), mlhVar.b);
        int i6 = i4 + i5;
        int f3 = mlhVar.f(mlhVar.q(i6), mlhVar.b);
        int i7 = f3 - f2;
        mlhVar.w(i7, Math.max(mlhVar.t - 1, 0));
        mlhVar.v(i5);
        int[] iArr2 = mlhVar.b;
        int q = mlhVar.q(i6) * 5;
        mh0.e(mlhVar.q(i) * 5, q, iArr2, iArr2, (i5 * 5) + q);
        if (i7 > 0) {
            Object[] objArr = mlhVar.c;
            int g2 = mlhVar.g(f2 + i7);
            System.arraycopy(objArr, g2, objArr, f, mlhVar.g(f3 + i7) - g2);
        }
        int i8 = f2 + i7;
        int i9 = i8 - f;
        int i10 = mlhVar.k;
        int i11 = mlhVar.l;
        int length = mlhVar.c.length;
        int i12 = mlhVar.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int q2 = mlhVar.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(q2 * 5) + 4] = mlh.h(mlh.h(mlhVar.f(q2, iArr2) - i15, i12 < q2 ? 0 : i10, i11, length), mlhVar.k, mlhVar.l, mlhVar.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int o = mlhVar.o();
        int b = llh.b(mlhVar.d, i6, o);
        ArrayList arrayList = new ArrayList();
        if (b >= 0) {
            while (b < mlhVar.d.size() && (c2 = mlhVar.c((vu8Var = (vu8) mlhVar.d.get(b)))) >= i6 && c2 < i16) {
                arrayList.add(vu8Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            vu8 vu8Var2 = (vu8) arrayList.get(i18);
            int c3 = mlhVar.c(vu8Var2) + i17;
            if (c3 >= mlhVar.g) {
                vu8Var2.a = -(o - c3);
            } else {
                vu8Var2.a = c3;
            }
            mlhVar.d.add(llh.b(mlhVar.d, c3, o), vu8Var2);
        }
        if (mlhVar.J(i6, i5)) {
            sf3.a("Unexpectedly removed anchors");
        }
        mlhVar.l(i2, mlhVar.u, i);
        if (i7 > 0) {
            mlhVar.K(i8, i7, i6 - 1);
        }
    }
}

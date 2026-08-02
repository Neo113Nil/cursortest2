package defpackage;

import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mj6 implements f2f {
    public final int a;
    public final e1d b;
    public final q10 c;
    public final wv d;
    public final wv e;
    public final i8l f;
    public final i8l g;
    public final xv h;
    public final xv i;
    public final j8l j;
    public final j8l k;

    public mj6(kx4 kx4Var, int i, e1d e1dVar, q10 q10Var) {
        int e0 = kx4Var.e0(48.0f);
        this.a = i;
        this.b = e1dVar;
        this.c = q10Var;
        kv1 kv1Var = uxf.o;
        this.d = new wv(kv1Var, kv1Var, 0);
        kv1 kv1Var2 = uxf.q;
        this.e = new wv(kv1Var2, kv1Var2, 0);
        this.f = new i8l(pd0.d);
        this.g = new i8l(pd0.e);
        lv1 lv1Var = uxf.l;
        lv1 lv1Var2 = uxf.n;
        this.h = new xv(lv1Var, lv1Var2, 0);
        this.i = new xv(lv1Var2, lv1Var, 0);
        this.j = new j8l(lv1Var, e0);
        this.k = new j8l(lv1Var2, e0);
    }

    @Override // defpackage.f2f
    public final long a(x6a x6aVar, long j, ema emaVar, long j2) {
        x6a x6aVar2;
        char c;
        long j3;
        int i;
        e1d e1dVar = this.b;
        if (e1dVar != null) {
            e1dVar.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + this.a) & 4294967295L);
        int i2 = (int) (j5 >> 32);
        int i3 = 0;
        List j6 = b.j(this.d, this.e, ((int) (x6aVar.a() >> 32)) < i2 / 2 ? this.f : this.g);
        int size = j6.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                x6aVar2 = x6aVar;
                c = c2;
                j3 = j4;
                i = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i5 = (int) (j2 >> c);
            int i6 = size;
            int i7 = i4;
            x6aVar2 = x6aVar;
            List list = j6;
            i = ((vfc) j6.get(i4)).a(x6aVar2, j5, i5, emaVar);
            if (i7 == list.size() - 1 || (i >= 0 && i5 + i <= i2)) {
                break;
            }
            i4 = i7 + 1;
            j6 = list;
            size = i6;
            c2 = c;
            j4 = j3;
        }
        int i8 = (int) (j5 & j3);
        List j7 = b.j(this.h, this.i, ((int) (x6aVar2.a() & j3)) < i8 / 2 ? this.j : this.k);
        int size2 = j7.size();
        for (int i9 = 0; i9 < size2; i9++) {
            int i10 = (int) (j2 & j3);
            int a = ((wfc) j7.get(i9)).a(x6aVar2, j5, i10);
            if (i9 == j7.size() - 1 || (a >= 0 && i10 + a <= i8)) {
                i3 = a;
                break;
            }
        }
        long j8 = (i << c) | (i3 & j3);
        this.c.invoke(x6aVar2, y6a.b(j8, j2));
        return j8;
    }
}

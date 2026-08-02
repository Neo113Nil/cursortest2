package defpackage;

import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fd5 implements f2f {
    public final long a;
    public final kx4 b;
    public final int c;
    public final q10 d;
    public final wv e;
    public final wv f;
    public final i8l g;
    public final i8l h;
    public final xv i;
    public final xv j;
    public final xv k;
    public final j8l l;
    public final j8l m;

    public fd5(long j, kx4 kx4Var, q10 q10Var) {
        int e0 = kx4Var.e0(48.0f);
        this.a = j;
        this.b = kx4Var;
        this.c = e0;
        this.d = q10Var;
        int e02 = kx4Var.e0(Float.intBitsToFloat((int) (j >> 32)));
        kv1 kv1Var = uxf.o;
        this.e = new wv(kv1Var, kv1Var, e02);
        kv1 kv1Var2 = uxf.q;
        this.f = new wv(kv1Var2, kv1Var2, e02);
        this.g = new i8l(pd0.d);
        this.h = new i8l(pd0.e);
        int e03 = kx4Var.e0(Float.intBitsToFloat((int) (j & 4294967295L)));
        lv1 lv1Var = uxf.l;
        lv1 lv1Var2 = uxf.n;
        this.i = new xv(lv1Var, lv1Var2, e03);
        this.j = new xv(lv1Var2, lv1Var, e03);
        this.k = new xv(uxf.m, lv1Var, e03);
        this.l = new j8l(lv1Var, e0);
        this.m = new j8l(lv1Var2, e0);
    }

    @Override // defpackage.f2f
    public final long a(x6a x6aVar, long j, ema emaVar, long j2) {
        x6a x6aVar2;
        long j3;
        char c;
        int i;
        int i2;
        int i3;
        char c2 = ' ';
        int i4 = (int) (j >> 32);
        boolean z = true;
        List j4 = b.j(this.e, this.f, ((int) (x6aVar.a() >> 32)) < i4 / 2 ? this.g : this.h);
        int size = j4.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                x6aVar2 = x6aVar;
                j3 = j;
                c = c2;
                i = 0;
                break;
            }
            vfc vfcVar = (vfc) j4.get(i5);
            int i6 = (int) (j2 >> c2);
            int i7 = size;
            c = c2;
            j3 = j;
            int i8 = i5;
            x6aVar2 = x6aVar;
            i = vfcVar.a(x6aVar2, j3, i6, emaVar);
            if (i8 == j4.size() - 1 || (i >= 0 && i6 + i <= i4)) {
                break;
            }
            i5 = i8 + 1;
            size = i7;
            c2 = c;
        }
        int i9 = (int) (j3 & 4294967295L);
        List j5 = b.j(this.i, this.j, this.k, ((int) (x6aVar2.a() & 4294967295L)) < i9 / 2 ? this.l : this.m);
        int size2 = j5.size();
        int i10 = 0;
        while (i10 < size2) {
            boolean z2 = z;
            int i11 = (int) (j2 & 4294967295L);
            int a = ((wfc) j5.get(i10)).a(x6aVar2, j3, i11);
            if (i10 == j5.size() - 1 || (a >= (i3 = this.c) && i11 + a <= i9 - i3)) {
                i2 = a;
                break;
            }
            i10++;
            z = z2;
        }
        i2 = 0;
        long j6 = (i << c) | (i2 & 4294967295L);
        this.d.invoke(x6aVar2, y6a.b(j6, j2));
        return j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fd5) {
            fd5 fd5Var = (fd5) obj;
            return this.a == fd5Var.a && Intrinsics.c(this.b, fd5Var.b) && this.c == fd5Var.c && this.d == fd5Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + wv8.a(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) r75.a(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}

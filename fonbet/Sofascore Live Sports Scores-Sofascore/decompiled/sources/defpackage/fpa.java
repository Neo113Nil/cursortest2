package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fpa implements l1c {
    public final hpa a;
    public final int b;
    public final boolean c;
    public final float d;
    public final l1c e;
    public final float f;
    public final boolean g;
    public final ku3 h;
    public final kx4 i;
    public final int j;
    public final Function1 k;
    public final Function1 l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final ewd q;
    public final int r;
    public final int s;

    public fpa(hpa hpaVar, int i, boolean z, float f, l1c l1cVar, float f2, boolean z2, ku3 ku3Var, kx4 kx4Var, int i2, Function1 function1, Function1 function12, List list, int i3, int i4, int i5, ewd ewdVar, int i6, int i7) {
        this.a = hpaVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = l1cVar;
        this.f = f2;
        this.g = z2;
        this.h = ku3Var;
        this.i = kx4Var;
        this.j = i2;
        this.k = function1;
        this.l = function12;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = ewdVar;
        this.r = i6;
        this.s = i7;
    }

    @Override // defpackage.l1c
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.l1c
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.l1c
    public final Function1 c() {
        return this.e.c();
    }

    public final fpa d(int i, boolean z) {
        hpa hpaVar;
        int i2;
        long j;
        int i3;
        if (this.g) {
            return null;
        }
        List list = this.m;
        if (list.isEmpty() || (hpaVar = this.a) == null) {
            return null;
        }
        int i4 = hpaVar.g;
        int i5 = this.b - i;
        if (i5 < 0 || i5 >= i4) {
            return null;
        }
        gpa gpaVar = (gpa) CollectionsKt.Y(list);
        gpa gpaVar2 = (gpa) CollectionsKt.h0(list);
        if (gpaVar.w || gpaVar2.w) {
            return null;
        }
        int i6 = this.o;
        int i7 = this.n;
        ewd ewdVar = this.q;
        if (i < 0) {
            if (Math.min((uaa.v(gpaVar, ewdVar) + gpaVar.o) - i7, (uaa.v(gpaVar2, ewdVar) + gpaVar2.o) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - uaa.v(gpaVar, ewdVar), i6 - uaa.v(gpaVar2, ewdVar)) <= i) {
            return null;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            gpa gpaVar3 = (gpa) list.get(i8);
            gpaVar3.getClass();
            if (gpaVar3.w) {
                i2 = i8;
            } else {
                long j2 = gpaVar3.t;
                long j3 = 4294967295L;
                int i9 = i8;
                char c = ' ';
                gpaVar3.t = (((int) (j2 >> 32)) << 32) | ((((int) (j2 & 4294967295L)) + i) & 4294967295L);
                if (z) {
                    int size2 = gpaVar3.g.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        lqa a = gpaVar3.j.a(i10, gpaVar3.b);
                        if (a != null) {
                            long j4 = a.l;
                            j = j3;
                            i3 = i9;
                            a.l = (((int) (j4 >> r14)) << c) | ((((int) (j4 & j)) + i) & j);
                        } else {
                            j = j3;
                            i3 = i9;
                        }
                        i10++;
                        i9 = i3;
                        j3 = j;
                        c = ' ';
                    }
                }
                i2 = i9;
            }
            i8 = i2 + 1;
        }
        return new fpa(this.a, i5, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, ewdVar, this.r, this.s);
    }

    public final long e() {
        l1c l1cVar = this.e;
        return (l1cVar.getWidth() << 32) | (l1cVar.getHeight() & 4294967295L);
    }

    @Override // defpackage.l1c
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.l1c
    public final int getWidth() {
        return this.e.getWidth();
    }
}

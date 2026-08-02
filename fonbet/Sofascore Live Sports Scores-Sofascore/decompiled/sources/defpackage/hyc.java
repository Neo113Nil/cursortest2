package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hyc {
    public q80 a;
    public sf8 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public es0 h;
    public ujc i;
    public long j;
    public kx4 k;
    public dfj l;
    public p03 m;
    public ema n;
    public aej o;
    public int p;
    public int q;
    public gyc r;
    public long s;

    public hyc(q80 q80Var, dfj dfjVar, sf8 sf8Var, int i, boolean z, int i2, int i3, List list, es0 es0Var) {
        this.a = q80Var;
        this.b = sf8Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = es0Var;
        int i4 = v3a.b;
        this.j = v3a.a;
        this.l = dfjVar;
        this.p = -1;
        this.q = -1;
    }

    public final int a(int i, ema emaVar) {
        int i2 = this.p;
        int i3 = this.q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = cn3.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            a = h(a, emaVar);
        }
        int l = ufa.l(b(a, emaVar).e);
        int i4 = an3.i(a);
        if (l < i4) {
            l = i4;
        }
        this.p = i;
        this.q = l;
        return l;
    }

    public final eyc b(long j, ema emaVar) {
        p03 e = e(emaVar);
        long o = v7a.o(e.c(), this.c, j, this.d);
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new eyc(e, o, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, ema emaVar) {
        this.s = (this.s << 2) | 3;
        long h = this.f > 1 ? h(j, emaVar) : j;
        aej aejVar = this.o;
        if (aejVar != null) {
            eyc eycVar = aejVar.b;
            zdj zdjVar = aejVar.a;
            if (!eycVar.a.a()) {
                ema emaVar2 = zdjVar.h;
                long j2 = zdjVar.j;
                if (emaVar == emaVar2 && (an3.b(h, j2) || (an3.h(h) == an3.h(j2) && an3.j(h) == an3.j(j2) && an3.g(h) >= eycVar.e && !eycVar.c))) {
                    aej aejVar2 = this.o;
                    aejVar2.getClass();
                    if (an3.b(h, aejVar2.a.j)) {
                        return false;
                    }
                    aej aejVar3 = this.o;
                    aejVar3.getClass();
                    this.o = g(emaVar, h, aejVar3.b);
                    return true;
                }
            }
        }
        es0 es0Var = this.h;
        if (es0Var != null) {
            this.n = emaVar;
            long j3 = this.l.a.b;
            gyc gycVar = this.r;
            if (gycVar == null) {
                gycVar = new gyc(this);
                this.r = gycVar;
            }
            float h0 = gycVar.h0(es0Var.c);
            float h02 = gycVar.h0(es0Var.a);
            float h03 = gycVar.h0(es0Var.b);
            float f = 2.0f;
            float f2 = (h02 + h03) / 2.0f;
            float f3 = h03;
            float f4 = h02;
            while (f3 - f4 >= h0) {
                float f5 = f;
                float f6 = f3;
                if (es0.a(gycVar.a(j, gycVar.O(f2)))) {
                    f3 = f2;
                } else {
                    f4 = f2;
                    f3 = f6;
                }
                f2 = (f4 + f3) / f5;
                f = f5;
            }
            float floor = (((float) Math.floor((f4 - h02) / h0)) * h0) + h02;
            float f7 = h0 + floor;
            if (f7 <= h03 && !es0.a(gycVar.a(j, gycVar.O(f7)))) {
                floor = f7;
            }
            long O = gycVar.O(floor);
            if (lfj.d(O)) {
                O = iyc.a(j3, O);
            }
            long j4 = O;
            gyc gycVar2 = this.r;
            if (gycVar2 == null) {
                gycVar2 = new gyc(this);
                this.r = gycVar2;
            }
            aej aejVar4 = gycVar2.a;
            if (aejVar4 != null) {
                zdj zdjVar2 = aejVar4.a;
                if (lfj.a(j4, zdjVar2.b.a.b) && zdjVar2.f == this.c) {
                    this.o = aejVar4;
                    return true;
                }
            }
            f(dfj.a(this.l, 0L, j4, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213));
        }
        this.o = g(emaVar, h, b(h, emaVar));
        return true;
    }

    public final void d(kx4 kx4Var) {
        long j;
        kx4 kx4Var2 = this.k;
        if (kx4Var != null) {
            int i = v3a.b;
            j = v3a.a(kx4Var.j(), kx4Var.getFontScale());
        } else {
            j = v3a.a;
        }
        if (kx4Var2 == null) {
            this.k = kx4Var;
            this.j = j;
            return;
        }
        if (kx4Var == null || this.j != j) {
            this.k = kx4Var;
            this.j = j;
            this.s = (this.s << 2) | 1;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.p = -1;
            this.r = null;
        }
    }

    public final p03 e(ema emaVar) {
        p03 p03Var = this.m;
        if (p03Var == null || emaVar != this.n || p03Var.a()) {
            this.n = emaVar;
            q80 q80Var = this.a;
            dfj C = g7a.C(this.l, emaVar);
            kx4 kx4Var = this.k;
            kx4Var.getClass();
            sf8 sf8Var = this.b;
            List list = this.g;
            if (list == null) {
                list = km5.a;
            }
            p03Var = new p03(q80Var, C, list, kx4Var, sf8Var);
        }
        this.m = p03Var;
        return p03Var;
    }

    public final void f(dfj dfjVar) {
        boolean d = dfjVar.d(this.l);
        this.l = dfjVar;
        if (d) {
            return;
        }
        this.s <<= 2;
        this.m = null;
        this.o = null;
        this.q = -1;
        this.p = -1;
    }

    public final aej g(ema emaVar, long j, eyc eycVar) {
        float min = Math.min(eycVar.a.c(), eycVar.d);
        q80 q80Var = this.a;
        dfj dfjVar = this.l;
        List list = this.g;
        if (list == null) {
            list = km5.a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        kx4 kx4Var = this.k;
        kx4Var.getClass();
        return new aej(new zdj(q80Var, dfjVar, list, i, z, i2, kx4Var, emaVar, this.b, j), eycVar, cn3.d(j, (ufa.l(min) << 32) | (ufa.l(eycVar.e) & 4294967295L)));
    }

    public final long h(long j, ema emaVar) {
        ujc ujcVar = this.i;
        dfj dfjVar = this.l;
        kx4 kx4Var = this.k;
        kx4Var.getClass();
        ujc v = qha.v(ujcVar, emaVar, dfjVar, kx4Var, this.b);
        this.i = v;
        return v.a(this.f, j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(this.o != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) v3a.b(this.j));
        sb.append(", history=");
        sb.append(this.s);
        sb.append(", constraints=");
        aej aejVar = this.o;
        return lnb.p(sb, aejVar != null ? new an3(aejVar.a.j) : "null", ')');
    }
}

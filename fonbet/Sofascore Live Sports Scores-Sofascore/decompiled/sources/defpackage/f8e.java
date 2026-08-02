package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f8e {
    public String a;
    public dfj b;
    public sf8 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public kx4 i;
    public x10 j;
    public boolean k;
    public long l;
    public ujc m;
    public e8e n;
    public ema o;
    public long p;
    public int q;
    public int r;
    public long s;

    public f8e(String str, dfj dfjVar, sf8 sf8Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dfjVar;
        this.c = sf8Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        int i4 = v3a.b;
        this.h = v3a.a;
        this.l = 0L;
        if (!(true & true)) {
            t3a.a("width and height must be >= 0");
        }
        this.p = cn3.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public static long f(f8e f8eVar, long j, ema emaVar) {
        dfj dfjVar = f8eVar.b;
        ujc ujcVar = f8eVar.m;
        kx4 kx4Var = f8eVar.i;
        kx4Var.getClass();
        ujc v = qha.v(ujcVar, emaVar, dfjVar, kx4Var, f8eVar.c);
        f8eVar.m = v;
        return v.a(f8eVar.g, j);
    }

    public final int a(int i, ema emaVar) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = cn3.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            a = f(this, a, emaVar);
        }
        e8e e = e(emaVar);
        long o = v7a.o(e.c(), this.d, a, this.e);
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int l = ufa.l(new x10((a20) e, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, o).b());
        int i6 = an3.i(a);
        if (l < i6) {
            l = i6;
        }
        this.q = i;
        this.r = l;
        return l;
    }

    public final boolean b(long j, ema emaVar) {
        e8e e8eVar;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long f = this.g > 1 ? f(this, j, emaVar) : j;
        x10 x10Var = this.j;
        boolean z2 = false;
        if (x10Var != null && (e8eVar = this.n) != null && !e8eVar.a() && emaVar == this.o && (an3.b(f, this.p) || (an3.h(f) == an3.h(this.p) && an3.j(f) == an3.j(this.p) && an3.g(f) >= x10Var.b() && !x10Var.d.d))) {
            if (!an3.b(f, this.p)) {
                x10 x10Var2 = this.j;
                x10Var2.getClass();
                this.l = cn3.d(f, (ufa.l(Math.min(x10Var2.a.i.c(), x10Var2.d())) << 32) | (ufa.l(x10Var2.b()) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= x10Var2.d() && ((int) (4294967295L & r12)) >= x10Var2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = f;
            }
            return false;
        }
        e8e e = e(emaVar);
        long o = v7a.o(e.c(), this.d, f, this.e);
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        x10 x10Var3 = new x10((a20) e, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, o);
        this.p = f;
        this.l = cn3.d(f, (ufa.l(x10Var3.b()) & 4294967295L) | (ufa.l(x10Var3.d()) << 32));
        if (this.d != 3 && (((int) (r1 >> 32)) < x10Var3.d() || ((int) (r1 & 4294967295L)) < x10Var3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = x10Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = cn3.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(kx4 kx4Var) {
        long j;
        kx4 kx4Var2 = this.i;
        if (kx4Var != null) {
            int i = v3a.b;
            j = v3a.a(kx4Var.j(), kx4Var.getFontScale());
        } else {
            j = v3a.a;
        }
        if (kx4Var2 == null) {
            this.i = kx4Var;
            this.h = j;
        } else if (kx4Var == null || this.h != j) {
            this.i = kx4Var;
            this.h = j;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final e8e e(ema emaVar) {
        e8e e8eVar = this.n;
        if (e8eVar == null || emaVar != this.o || e8eVar.a()) {
            this.o = emaVar;
            String str = this.a;
            dfj C = g7a.C(this.b, emaVar);
            km5 km5Var = km5.a;
            kx4 kx4Var = this.i;
            kx4Var.getClass();
            e8eVar = new a20(str, C, km5Var, km5Var, this.c, kx4Var);
        }
        this.n = e8eVar;
        return e8eVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) v3a.b(this.h));
        sb.append(", history=");
        return lnb.l(this.s, ", constraints=$)", sb);
    }
}

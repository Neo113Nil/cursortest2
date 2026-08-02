package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dtj implements i72 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final hv9 l;
    public final int m;
    public final hv9 n;
    public final int o;
    public final int p;
    public final int q;
    public final hv9 r;
    public final hv9 s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final lv9 y;
    public final vv9 z;

    static {
        new dtj(new btj());
    }

    public dtj(btj btjVar) {
        this.a = btjVar.a;
        this.b = btjVar.b;
        this.c = btjVar.c;
        this.d = btjVar.d;
        this.e = btjVar.e;
        this.f = btjVar.f;
        this.g = btjVar.g;
        this.h = btjVar.h;
        this.i = btjVar.i;
        this.j = btjVar.j;
        this.k = btjVar.k;
        this.l = btjVar.l;
        this.m = btjVar.m;
        this.n = btjVar.n;
        this.o = btjVar.o;
        this.p = btjVar.p;
        this.q = btjVar.q;
        this.r = btjVar.r;
        this.s = btjVar.s;
        this.t = btjVar.t;
        this.u = btjVar.u;
        this.v = btjVar.v;
        this.w = btjVar.w;
        this.x = btjVar.x;
        this.y = lv9.f(btjVar.y);
        this.z = vv9.t(btjVar.z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dtj dtjVar = (dtj) obj;
        if (this.a == dtjVar.a && this.b == dtjVar.b && this.c == dtjVar.c && this.d == dtjVar.d && this.e == dtjVar.e && this.f == dtjVar.f && this.g == dtjVar.g && this.h == dtjVar.h && this.k == dtjVar.k && this.i == dtjVar.i && this.j == dtjVar.j && this.l.equals(dtjVar.l) && this.m == dtjVar.m && this.n.equals(dtjVar.n) && this.o == dtjVar.o && this.p == dtjVar.p && this.q == dtjVar.q && this.r.equals(dtjVar.r) && this.s.equals(dtjVar.s) && this.t == dtjVar.t && this.u == dtjVar.u && this.v == dtjVar.v && this.w == dtjVar.w && this.x == dtjVar.x) {
            return aik.H(dtjVar.y, this.y) && this.z.equals(dtjVar.z);
        }
        return false;
    }

    public int hashCode() {
        return this.z.hashCode() + ((this.y.hashCode() + ((((((((((((this.s.hashCode() + ((this.r.hashCode() + ((((((((this.n.hashCode() + ((((this.l.hashCode() + ((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31)) * 31) + this.m) * 31)) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31)) * 31)) * 31) + this.t) * 31) + this.u) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31)) * 31);
    }
}

package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class etj {
    public static final etj x = new etj(new ctj());
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final hv9 i;
    public final hv9 j;
    public final hv9 k;
    public final hv9 l;
    public final hv9 m;
    public final int n;
    public final int o;
    public final hv9 p;
    public final atj q;
    public final hv9 r;
    public final hv9 s;
    public final boolean t;
    public final int u;
    public final lv9 v;
    public final vv9 w;

    static {
        wt3.s(1, 2, 3, 4, 5);
        wt3.s(6, 7, 8, 9, 10);
        wt3.s(11, 12, 13, 14, 15);
        wt3.s(16, 17, 18, 19, 20);
        wt3.s(21, 22, 23, 24, 25);
        wt3.s(26, 27, 28, 29, 30);
        wt3.s(31, 32, 33, 34, 35);
        nik.N(36);
        nik.N(37);
        nik.N(38);
    }

    public etj(ctj ctjVar) {
        this.a = ctjVar.a;
        this.b = ctjVar.b;
        this.c = ctjVar.c;
        this.d = ctjVar.d;
        this.e = ctjVar.e;
        this.f = ctjVar.f;
        this.g = ctjVar.g;
        this.h = ctjVar.h;
        this.i = ctjVar.i;
        this.j = ctjVar.j;
        this.k = ctjVar.k;
        this.l = ctjVar.l;
        this.n = ctjVar.n;
        this.m = ctjVar.m;
        this.o = ctjVar.o;
        this.p = ctjVar.p;
        this.q = ctjVar.q;
        this.r = ctjVar.r;
        this.t = ctjVar.s;
        this.s = ctjVar.t;
        this.u = ctjVar.u;
        this.v = lv9.f(ctjVar.v);
        this.w = vv9.t(ctjVar.w);
    }

    public ctj a() {
        ctj ctjVar = new ctj();
        ctjVar.c(this);
        return ctjVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        etj etjVar = (etj) obj;
        if (this.a == etjVar.a && this.b == etjVar.b && this.c == etjVar.c && this.d == etjVar.d && this.h == etjVar.h && this.e == etjVar.e && this.f == etjVar.f && this.g == etjVar.g && this.i.equals(etjVar.i) && this.j.equals(etjVar.j) && this.k.equals(etjVar.k) && this.l.equals(etjVar.l) && this.n == etjVar.n && this.m.equals(etjVar.m) && this.o == etjVar.o && this.p.equals(etjVar.p) && this.q.equals(etjVar.q) && this.s.equals(etjVar.s) && this.r.equals(etjVar.r) && this.t == etjVar.t && this.u == etjVar.u) {
            return aik.H(etjVar.v, this.v) && this.w.equals(etjVar.w);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.p.hashCode() + ((((this.m.hashCode() + ((((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31;
        this.q.getClass();
        return this.w.hashCode() + ((this.v.hashCode() + ((((this.s.hashCode() + ((((this.r.hashCode() + ((hashCode + 29791) * 961)) * 961) + (this.t ? 1 : 0)) * 31)) * 31) + this.u) * 28629151)) * 31);
    }
}

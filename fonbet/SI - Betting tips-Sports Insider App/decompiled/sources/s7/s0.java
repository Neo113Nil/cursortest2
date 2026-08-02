package s7;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s0 {
    public Long A;
    public long B;
    public String C;
    public int D;
    public int E;
    public long F;
    public String G;
    public byte[] H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public String P;
    public boolean Q;
    public long R;
    public long S;

    /* renamed from: a, reason: collision with root package name */
    public final f1 f23026a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23027b;

    /* renamed from: c, reason: collision with root package name */
    public String f23028c;

    /* renamed from: d, reason: collision with root package name */
    public String f23029d;

    /* renamed from: e, reason: collision with root package name */
    public String f23030e;

    /* renamed from: f, reason: collision with root package name */
    public String f23031f;

    /* renamed from: g, reason: collision with root package name */
    public long f23032g;

    /* renamed from: h, reason: collision with root package name */
    public long f23033h;

    /* renamed from: i, reason: collision with root package name */
    public long f23034i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public long f23035k;

    /* renamed from: l, reason: collision with root package name */
    public String f23036l;

    /* renamed from: m, reason: collision with root package name */
    public long f23037m;

    /* renamed from: n, reason: collision with root package name */
    public long f23038n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23039o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23040p;
    public Boolean q;

    /* renamed from: r, reason: collision with root package name */
    public long f23041r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f23042s;

    /* renamed from: t, reason: collision with root package name */
    public String f23043t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23044u;

    /* renamed from: v, reason: collision with root package name */
    public long f23045v;

    /* renamed from: w, reason: collision with root package name */
    public long f23046w;

    /* renamed from: x, reason: collision with root package name */
    public int f23047x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23048y;

    /* renamed from: z, reason: collision with root package name */
    public Long f23049z;

    public s0(f1 f1Var, String str) {
        g6.v.h(f1Var);
        g6.v.e(str);
        this.f23026a = f1Var;
        this.f23027b = str;
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        d1Var.j();
    }

    public final void A(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23046w != j;
        this.f23046w = j;
    }

    public final void B(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.B != j;
        this.B = j;
    }

    public final String C() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.C;
    }

    public final String D() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.f23027b;
    }

    public final String E() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.f23028c;
    }

    public final void F(String str) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= !Objects.equals(this.f23028c, str);
        this.f23028c = str;
    }

    public final String G() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.f23029d;
    }

    public final void H(String str) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= true ^ Objects.equals(this.f23029d, str);
        this.f23029d = str;
    }

    public final void I(String str) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= !Objects.equals(this.f23030e, str);
        this.f23030e = str;
    }

    public final String J() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.f23031f;
    }

    public final void K(String str) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= !Objects.equals(this.f23031f, str);
        this.f23031f = str;
    }

    public final void L(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23033h != j;
        this.f23033h = j;
    }

    public final void M(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23034i != j;
        this.f23034i = j;
    }

    public final String N() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.j;
    }

    public final void O(String str) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long P() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.f23035k;
    }

    public final void Q(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23035k != j;
        this.f23035k = j;
    }

    public final void R(String str) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= !Objects.equals(this.f23036l, str);
        this.f23036l = str;
    }

    public final void S(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23037m != j;
        this.f23037m = j;
    }

    public final void a(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23038n != j;
        this.f23038n = j;
    }

    public final long b() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.f23041r;
    }

    public final void c(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23041r != j;
        this.f23041r = j;
    }

    public final void d(boolean z5) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23039o != z5;
        this.f23039o = z5;
    }

    public final void e(long j) {
        g6.v.b(j >= 0);
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23032g != j;
        this.f23032g = j;
    }

    public final void f(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.R != j;
        this.R = j;
    }

    public final void g(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.S != j;
        this.S = j;
    }

    public final void h(long j) {
        f1 f1Var = this.f23026a;
        d1 d1Var = f1Var.f22746g;
        n0 n0Var = f1Var.f22745f;
        f1.m(d1Var);
        d1Var.j();
        long j6 = this.f23032g + j;
        String str = this.f23027b;
        if (j6 > 2147483647L) {
            f1.m(n0Var);
            n0Var.f22906i.b(n0.r(str), "Bundle index overflow. appId");
            j6 = (-1) + j;
        }
        long j10 = this.F + 1;
        if (j10 > 2147483647L) {
            f1.m(n0Var);
            n0Var.f22906i.b(n0.r(str), "Delivery index overflow. appId");
            j10 = 0;
        }
        this.Q = true;
        this.f23032g = j6;
        this.F = j10;
    }

    public final void i(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.J != j;
        this.J = j;
    }

    public final void j(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.K != j;
        this.K = j;
    }

    public final void k(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.L != j;
        this.L = j;
    }

    public final void l(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.M != j;
        this.M = j;
    }

    public final void m(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.O != j;
        this.O = j;
    }

    public final void n(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.N != j;
        this.N = j;
    }

    public final boolean o() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.Q;
    }

    public final void p(int i5) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.D != i5;
        this.D = i5;
    }

    public final void q(int i5) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.E != i5;
        this.E = i5;
    }

    public final void r(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.F != j;
        this.F = j;
    }

    public final String s() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.G;
    }

    public final int t() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.I;
    }

    public final String u() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        String str = this.P;
        v(null);
        return str;
    }

    public final void v(String str) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final Boolean w() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.q;
    }

    public final void x(List list) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        if (Objects.equals(this.f23042s, list)) {
            return;
        }
        this.Q = true;
        this.f23042s = list != null ? new ArrayList(list) : null;
    }

    public final boolean y() {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        return this.f23044u;
    }

    public final void z(long j) {
        d1 d1Var = this.f23026a.f22746g;
        f1.m(d1Var);
        d1Var.j();
        this.Q |= this.f23045v != j;
        this.f23045v = j;
    }
}

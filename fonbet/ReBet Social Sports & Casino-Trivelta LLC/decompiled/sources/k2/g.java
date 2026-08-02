package k2;

import android.text.Layout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f54176a;

    /* renamed from: b, reason: collision with root package name */
    public int f54177b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f54178c;

    /* renamed from: d, reason: collision with root package name */
    public int f54179d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f54180e;

    /* renamed from: k, reason: collision with root package name */
    public float f54186k;

    /* renamed from: l, reason: collision with root package name */
    public String f54187l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f54190o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f54191p;

    /* renamed from: r, reason: collision with root package name */
    public C5147b f54193r;

    /* renamed from: t, reason: collision with root package name */
    public String f54195t;

    /* renamed from: u, reason: collision with root package name */
    public String f54196u;

    /* renamed from: f, reason: collision with root package name */
    public int f54181f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f54182g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f54183h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f54184i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f54185j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f54188m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f54189n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f54192q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f54194s = Float.MAX_VALUE;

    public g A(String str) {
        this.f54176a = str;
        return this;
    }

    public g B(float f10) {
        this.f54186k = f10;
        return this;
    }

    public g C(int i10) {
        this.f54185j = i10;
        return this;
    }

    public g D(String str) {
        this.f54187l = str;
        return this;
    }

    public g E(boolean z10) {
        this.f54184i = z10 ? 1 : 0;
        return this;
    }

    public g F(boolean z10) {
        this.f54181f = z10 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f54191p = alignment;
        return this;
    }

    public g H(String str) {
        this.f54195t = str;
        return this;
    }

    public g I(int i10) {
        this.f54189n = i10;
        return this;
    }

    public g J(int i10) {
        this.f54188m = i10;
        return this;
    }

    public g K(float f10) {
        this.f54194s = f10;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f54190o = alignment;
        return this;
    }

    public g M(boolean z10) {
        this.f54192q = z10 ? 1 : 0;
        return this;
    }

    public g N(C5147b c5147b) {
        this.f54193r = c5147b;
        return this;
    }

    public g O(boolean z10) {
        this.f54182g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
    }

    public int b() {
        if (this.f54180e) {
            return this.f54179d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f54196u;
    }

    public int d() {
        if (this.f54178c) {
            return this.f54177b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f54176a;
    }

    public float f() {
        return this.f54186k;
    }

    public int g() {
        return this.f54185j;
    }

    public String h() {
        return this.f54187l;
    }

    public Layout.Alignment i() {
        return this.f54191p;
    }

    public String j() {
        return this.f54195t;
    }

    public int k() {
        return this.f54189n;
    }

    public int l() {
        return this.f54188m;
    }

    public float m() {
        return this.f54194s;
    }

    public int n() {
        int i10 = this.f54183h;
        if (i10 == -1 && this.f54184i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f54184i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f54190o;
    }

    public boolean p() {
        return this.f54192q == 1;
    }

    public C5147b q() {
        return this.f54193r;
    }

    public boolean r() {
        return this.f54180e;
    }

    public boolean s() {
        return this.f54178c;
    }

    public final g t(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f54178c && gVar.f54178c) {
                z(gVar.f54177b);
            }
            if (this.f54183h == -1) {
                this.f54183h = gVar.f54183h;
            }
            if (this.f54184i == -1) {
                this.f54184i = gVar.f54184i;
            }
            if (this.f54176a == null && (str = gVar.f54176a) != null) {
                this.f54176a = str;
            }
            if (this.f54181f == -1) {
                this.f54181f = gVar.f54181f;
            }
            if (this.f54182g == -1) {
                this.f54182g = gVar.f54182g;
            }
            if (this.f54189n == -1) {
                this.f54189n = gVar.f54189n;
            }
            if (this.f54190o == null && (alignment2 = gVar.f54190o) != null) {
                this.f54190o = alignment2;
            }
            if (this.f54191p == null && (alignment = gVar.f54191p) != null) {
                this.f54191p = alignment;
            }
            if (this.f54192q == -1) {
                this.f54192q = gVar.f54192q;
            }
            if (this.f54185j == -1) {
                this.f54185j = gVar.f54185j;
                this.f54186k = gVar.f54186k;
            }
            if (this.f54193r == null) {
                this.f54193r = gVar.f54193r;
            }
            if (this.f54194s == Float.MAX_VALUE) {
                this.f54194s = gVar.f54194s;
            }
            if (this.f54195t == null) {
                this.f54195t = gVar.f54195t;
            }
            if (this.f54196u == null) {
                this.f54196u = gVar.f54196u;
            }
            if (z10 && !this.f54180e && gVar.f54180e) {
                w(gVar.f54179d);
            }
            if (z10 && this.f54188m == -1 && (i10 = gVar.f54188m) != -1) {
                this.f54188m = i10;
            }
        }
        return this;
    }

    public boolean u() {
        return this.f54181f == 1;
    }

    public boolean v() {
        return this.f54182g == 1;
    }

    public g w(int i10) {
        this.f54179d = i10;
        this.f54180e = true;
        return this;
    }

    public g x(boolean z10) {
        this.f54183h = z10 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f54196u = str;
        return this;
    }

    public g z(int i10) {
        this.f54177b = i10;
        this.f54178c = true;
        return this;
    }
}

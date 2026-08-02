package q4;

import android.text.Layout;

/* loaded from: classes8.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f81596a;

    /* renamed from: b, reason: collision with root package name */
    private int f81597b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f81598c;

    /* renamed from: d, reason: collision with root package name */
    private int f81599d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f81600e;

    /* renamed from: k, reason: collision with root package name */
    private float f81606k;

    /* renamed from: l, reason: collision with root package name */
    private String f81607l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f81610o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f81611p;

    /* renamed from: r, reason: collision with root package name */
    private b f81613r;

    /* renamed from: t, reason: collision with root package name */
    private String f81615t;

    /* renamed from: u, reason: collision with root package name */
    private String f81616u;

    /* renamed from: f, reason: collision with root package name */
    private int f81601f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f81602g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f81603h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f81604i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f81605j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f81608m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f81609n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f81612q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f81614s = Float.MAX_VALUE;

    public final void A(float f7) {
        this.f81606k = f7;
    }

    public final void B(int i11) {
        this.f81605j = i11;
    }

    public final void C(String str) {
        this.f81607l = str;
    }

    public final void D(boolean z11) {
        this.f81604i = z11 ? 1 : 0;
    }

    public final void E(boolean z11) {
        this.f81601f = z11 ? 1 : 0;
    }

    public final void F(Layout.Alignment alignment) {
        this.f81611p = alignment;
    }

    public final void G(String str) {
        this.f81615t = str;
    }

    public final void H(int i11) {
        this.f81609n = i11;
    }

    public final void I(int i11) {
        this.f81608m = i11;
    }

    public final void J(float f7) {
        this.f81614s = f7;
    }

    public final void K(Layout.Alignment alignment) {
        this.f81610o = alignment;
    }

    public final void L(boolean z11) {
        this.f81612q = z11 ? 1 : 0;
    }

    public final void M(b bVar) {
        this.f81613r = bVar;
    }

    public final void N(boolean z11) {
        this.f81602g = z11 ? 1 : 0;
    }

    public final void a(g gVar) {
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f81598c && gVar.f81598c) {
                y(gVar.f81597b);
            }
            if (this.f81603h == -1) {
                this.f81603h = gVar.f81603h;
            }
            if (this.f81604i == -1) {
                this.f81604i = gVar.f81604i;
            }
            if (this.f81596a == null && (str = gVar.f81596a) != null) {
                this.f81596a = str;
            }
            if (this.f81601f == -1) {
                this.f81601f = gVar.f81601f;
            }
            if (this.f81602g == -1) {
                this.f81602g = gVar.f81602g;
            }
            if (this.f81609n == -1) {
                this.f81609n = gVar.f81609n;
            }
            if (this.f81610o == null && (alignment2 = gVar.f81610o) != null) {
                this.f81610o = alignment2;
            }
            if (this.f81611p == null && (alignment = gVar.f81611p) != null) {
                this.f81611p = alignment;
            }
            if (this.f81612q == -1) {
                this.f81612q = gVar.f81612q;
            }
            if (this.f81605j == -1) {
                this.f81605j = gVar.f81605j;
                this.f81606k = gVar.f81606k;
            }
            if (this.f81613r == null) {
                this.f81613r = gVar.f81613r;
            }
            if (this.f81614s == Float.MAX_VALUE) {
                this.f81614s = gVar.f81614s;
            }
            if (this.f81615t == null) {
                this.f81615t = gVar.f81615t;
            }
            if (this.f81616u == null) {
                this.f81616u = gVar.f81616u;
            }
            if (!this.f81600e && gVar.f81600e) {
                v(gVar.f81599d);
            }
            if (this.f81608m != -1 || (i11 = gVar.f81608m) == -1) {
                return;
            }
            this.f81608m = i11;
        }
    }

    public final int b() {
        if (this.f81600e) {
            return this.f81599d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final String c() {
        return this.f81616u;
    }

    public final int d() {
        if (this.f81598c) {
            return this.f81597b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final String e() {
        return this.f81596a;
    }

    public final float f() {
        return this.f81606k;
    }

    public final int g() {
        return this.f81605j;
    }

    public final String h() {
        return this.f81607l;
    }

    public final Layout.Alignment i() {
        return this.f81611p;
    }

    public final String j() {
        return this.f81615t;
    }

    public final int k() {
        return this.f81609n;
    }

    public final int l() {
        return this.f81608m;
    }

    public final float m() {
        return this.f81614s;
    }

    public final int n() {
        int i11 = this.f81603h;
        if (i11 == -1 && this.f81604i == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f81604i == 1 ? 2 : 0);
    }

    public final Layout.Alignment o() {
        return this.f81610o;
    }

    public final boolean p() {
        return this.f81612q == 1;
    }

    public final b q() {
        return this.f81613r;
    }

    public final boolean r() {
        return this.f81600e;
    }

    public final boolean s() {
        return this.f81598c;
    }

    public final boolean t() {
        return this.f81601f == 1;
    }

    public final boolean u() {
        return this.f81602g == 1;
    }

    public final void v(int i11) {
        this.f81599d = i11;
        this.f81600e = true;
    }

    public final void w(boolean z11) {
        this.f81603h = z11 ? 1 : 0;
    }

    public final void x(String str) {
        this.f81616u = str;
    }

    public final void y(int i11) {
        this.f81597b = i11;
        this.f81598c = true;
    }

    public final void z(String str) {
        this.f81596a = str;
    }
}

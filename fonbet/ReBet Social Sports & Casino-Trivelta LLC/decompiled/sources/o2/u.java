package o2;

import androidx.media3.common.a;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.Z;
import o2.L;
import o2.v;

/* loaded from: classes.dex */
public final class u implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final String f59255a;

    /* renamed from: f, reason: collision with root package name */
    public String f59260f;

    /* renamed from: g, reason: collision with root package name */
    public H1.O f59261g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59264j;

    /* renamed from: l, reason: collision with root package name */
    public int f59266l;

    /* renamed from: m, reason: collision with root package name */
    public int f59267m;

    /* renamed from: o, reason: collision with root package name */
    public int f59269o;

    /* renamed from: p, reason: collision with root package name */
    public int f59270p;

    /* renamed from: t, reason: collision with root package name */
    public int f59274t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f59276v;

    /* renamed from: e, reason: collision with root package name */
    public int f59259e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final e1.J f59256b = new e1.J(new byte[15], 2);

    /* renamed from: c, reason: collision with root package name */
    public final e1.I f59257c = new e1.I();

    /* renamed from: d, reason: collision with root package name */
    public final e1.J f59258d = new e1.J();

    /* renamed from: q, reason: collision with root package name */
    public v.b f59271q = new v.b();

    /* renamed from: r, reason: collision with root package name */
    public int f59272r = -2147483647;

    /* renamed from: s, reason: collision with root package name */
    public int f59273s = -1;

    /* renamed from: u, reason: collision with root package name */
    public long f59275u = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59265k = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f59268n = true;

    /* renamed from: h, reason: collision with root package name */
    public double f59262h = -9.223372036854776E18d;

    /* renamed from: i, reason: collision with root package name */
    public double f59263i = -9.223372036854776E18d;

    public u(String str) {
        this.f59255a = str;
    }

    private boolean k(e1.J j10) {
        int i10 = this.f59266l;
        if ((i10 & 2) == 0) {
            j10.b0(j10.j());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (j10.a() > 0) {
            int i11 = this.f59267m << 8;
            this.f59267m = i11;
            int M10 = i11 | j10.M();
            this.f59267m = M10;
            if (v.e(M10)) {
                j10.b0(j10.g() - 3);
                this.f59267m = 0;
                return true;
            }
        }
        return false;
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        AbstractC4134a.i(this.f59261g);
        while (j10.a() > 0) {
            int i10 = this.f59259e;
            if (i10 != 0) {
                if (i10 == 1) {
                    f(j10, this.f59256b, false);
                    if (this.f59256b.a() != 0) {
                        this.f59268n = false;
                    } else if (i()) {
                        this.f59256b.b0(0);
                        H1.O o10 = this.f59261g;
                        e1.J j11 = this.f59256b;
                        o10.a(j11, j11.j());
                        this.f59256b.X(2);
                        this.f59258d.X(this.f59271q.f59279c);
                        this.f59268n = true;
                        this.f59259e = 2;
                    } else if (this.f59256b.j() < 15) {
                        e1.J j12 = this.f59256b;
                        j12.a0(j12.j() + 1);
                        this.f59268n = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f59271q.f59277a)) {
                        f(j10, this.f59258d, true);
                    }
                    l(j10);
                    int i11 = this.f59269o;
                    v.b bVar = this.f59271q;
                    if (i11 == bVar.f59279c) {
                        int i12 = bVar.f59277a;
                        if (i12 == 1) {
                            h(new e1.I(this.f59258d.f()));
                        } else if (i12 == 17) {
                            this.f59274t = v.f(new e1.I(this.f59258d.f()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f59259e = 1;
                    }
                }
            } else if (k(j10)) {
                this.f59259e = 1;
            }
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59259e = 0;
        this.f59267m = 0;
        this.f59256b.X(2);
        this.f59269o = 0;
        this.f59270p = 0;
        this.f59272r = -2147483647;
        this.f59273s = -1;
        this.f59274t = 0;
        this.f59275u = -1L;
        this.f59276v = false;
        this.f59264j = false;
        this.f59268n = true;
        this.f59265k = true;
        this.f59262h = -9.223372036854776E18d;
        this.f59263i = -9.223372036854776E18d;
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59260f = dVar.b();
        this.f59261g = rVar.c(dVar.c(), 1);
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59266l = i10;
        if (!this.f59265k && (this.f59270p != 0 || !this.f59268n)) {
            this.f59264j = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f59264j) {
                this.f59263i = j10;
            } else {
                this.f59262h = j10;
            }
        }
    }

    public final void f(e1.J j10, e1.J j11, boolean z10) {
        int g10 = j10.g();
        int min = Math.min(j10.a(), j11.a());
        j10.q(j11.f(), j11.g(), min);
        j11.c0(min);
        if (z10) {
            j10.b0(g10);
        }
    }

    public final void g() {
        int i10;
        if (this.f59276v) {
            this.f59265k = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = ((this.f59273s - this.f59274t) * 1000000.0d) / this.f59272r;
        long round = Math.round(this.f59262h);
        if (this.f59264j) {
            this.f59264j = false;
            this.f59262h = this.f59263i;
        } else {
            this.f59262h += d10;
        }
        this.f59261g.g(round, i10, this.f59270p, 0, null);
        this.f59276v = false;
        this.f59274t = 0;
        this.f59270p = 0;
    }

    public final void h(e1.I i10) {
        v.c h10 = v.h(i10);
        this.f59272r = h10.f59281b;
        this.f59273s = h10.f59282c;
        long j10 = this.f59275u;
        long j11 = this.f59271q.f59278b;
        if (j10 != j11) {
            this.f59275u = j11;
            String str = "mhm1";
            if (h10.f59280a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(h10.f59280a));
            }
            byte[] bArr = h10.compatibleProfileLevelSet;
            this.f59261g.c(new a.b().j0(this.f59260f).W(this.f59255a).y0("audio/mhm1").z0(this.f59272r).U(str).k0((bArr == null || bArr.length <= 0) ? null : AbstractC3445z.v(Z.EMPTY_BYTE_ARRAY, bArr)).P());
        }
        this.f59276v = true;
    }

    public final boolean i() {
        int j10 = this.f59256b.j();
        this.f59257c.o(this.f59256b.f(), j10);
        boolean g10 = v.g(this.f59257c, this.f59271q);
        if (g10) {
            this.f59269o = 0;
            this.f59270p += this.f59271q.f59279c + j10;
        }
        return g10;
    }

    public final boolean j(int i10) {
        return i10 == 1 || i10 == 17;
    }

    public final void l(e1.J j10) {
        int min = Math.min(j10.a(), this.f59271q.f59279c - this.f59269o);
        this.f59261g.a(j10, min);
        this.f59269o += min;
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
    }
}

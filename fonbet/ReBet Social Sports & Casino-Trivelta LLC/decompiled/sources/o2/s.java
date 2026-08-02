package o2;

import H1.AbstractC1168a;
import androidx.media3.common.a;
import b1.C2338G;
import com.plaid.internal.EnumC3631g;
import e1.AbstractC4134a;
import java.util.Collections;
import o2.L;

/* loaded from: classes.dex */
public final class s implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final String f59218a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59220c;

    /* renamed from: d, reason: collision with root package name */
    public final e1.J f59221d;

    /* renamed from: e, reason: collision with root package name */
    public final e1.I f59222e;

    /* renamed from: f, reason: collision with root package name */
    public H1.O f59223f;

    /* renamed from: g, reason: collision with root package name */
    public String f59224g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.media3.common.a f59225h;

    /* renamed from: i, reason: collision with root package name */
    public int f59226i;

    /* renamed from: j, reason: collision with root package name */
    public int f59227j;

    /* renamed from: k, reason: collision with root package name */
    public int f59228k;

    /* renamed from: l, reason: collision with root package name */
    public int f59229l;

    /* renamed from: m, reason: collision with root package name */
    public long f59230m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f59231n;

    /* renamed from: o, reason: collision with root package name */
    public int f59232o;

    /* renamed from: p, reason: collision with root package name */
    public int f59233p;

    /* renamed from: q, reason: collision with root package name */
    public int f59234q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f59235r;

    /* renamed from: s, reason: collision with root package name */
    public long f59236s;

    /* renamed from: t, reason: collision with root package name */
    public int f59237t;

    /* renamed from: u, reason: collision with root package name */
    public long f59238u;

    /* renamed from: v, reason: collision with root package name */
    public int f59239v;

    /* renamed from: w, reason: collision with root package name */
    public String f59240w;

    public s(String str, int i10, String str2) {
        this.f59218a = str;
        this.f59219b = i10;
        this.f59220c = str2;
        e1.J j10 = new e1.J(1024);
        this.f59221d = j10;
        this.f59222e = new e1.I(j10.f());
        this.f59230m = -9223372036854775807L;
    }

    public static long f(e1.I i10) {
        return i10.h((i10.h(2) + 1) * 8);
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        AbstractC4134a.i(this.f59223f);
        while (j10.a() > 0) {
            int i10 = this.f59226i;
            if (i10 != 0) {
                if (i10 == 1) {
                    int M10 = j10.M();
                    if ((M10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE) == 224) {
                        this.f59229l = M10;
                        this.f59226i = 2;
                    } else if (M10 != 86) {
                        this.f59226i = 0;
                    }
                } else if (i10 == 2) {
                    int M11 = ((this.f59229l & (-225)) << 8) | j10.M();
                    this.f59228k = M11;
                    if (M11 > this.f59221d.f().length) {
                        m(this.f59228k);
                    }
                    this.f59227j = 0;
                    this.f59226i = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(j10.a(), this.f59228k - this.f59227j);
                    j10.q(this.f59222e.data, this.f59227j, min);
                    int i11 = this.f59227j + min;
                    this.f59227j = i11;
                    if (i11 == this.f59228k) {
                        this.f59222e.p(0);
                        g(this.f59222e);
                        this.f59226i = 0;
                    }
                }
            } else if (j10.M() == 86) {
                this.f59226i = 1;
            }
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59226i = 0;
        this.f59230m = -9223372036854775807L;
        this.f59231n = false;
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59223f = rVar.c(dVar.c(), 1);
        this.f59224g = dVar.b();
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59230m = j10;
    }

    public final void g(e1.I i10) {
        if (!i10.g()) {
            this.f59231n = true;
            l(i10);
        } else if (!this.f59231n) {
            return;
        }
        if (this.f59232o != 0) {
            throw C2338G.a(null, null);
        }
        if (this.f59233p != 0) {
            throw C2338G.a(null, null);
        }
        k(i10, j(i10));
        if (this.f59235r) {
            i10.r((int) this.f59236s);
        }
    }

    public final int h(e1.I i10) {
        int b10 = i10.b();
        AbstractC1168a.b e10 = AbstractC1168a.e(i10, true);
        this.f59240w = e10.f4379c;
        this.f59237t = e10.f4377a;
        this.f59239v = e10.f4378b;
        return b10 - i10.b();
    }

    public final void i(e1.I i10) {
        int h10 = i10.h(3);
        this.f59234q = h10;
        if (h10 == 0) {
            i10.r(8);
            return;
        }
        if (h10 == 1) {
            i10.r(9);
            return;
        }
        if (h10 == 3 || h10 == 4 || h10 == 5) {
            i10.r(6);
        } else {
            if (h10 != 6 && h10 != 7) {
                throw new IllegalStateException();
            }
            i10.r(1);
        }
    }

    public final int j(e1.I i10) {
        int h10;
        if (this.f59234q != 0) {
            throw C2338G.a(null, null);
        }
        int i11 = 0;
        do {
            h10 = i10.h(8);
            i11 += h10;
        } while (h10 == 255);
        return i11;
    }

    public final void k(e1.I i10, int i11) {
        int e10 = i10.e();
        if ((e10 & 7) == 0) {
            this.f59221d.b0(e10 >> 3);
        } else {
            i10.i(this.f59221d.f(), 0, i11 * 8);
            this.f59221d.b0(0);
        }
        this.f59223f.a(this.f59221d, i11);
        AbstractC4134a.g(this.f59230m != -9223372036854775807L);
        this.f59223f.g(this.f59230m, 1, i11, 0, null);
        this.f59230m += this.f59238u;
    }

    public final void l(e1.I i10) {
        boolean g10;
        int h10 = i10.h(1);
        int h11 = h10 == 1 ? i10.h(1) : 0;
        this.f59232o = h11;
        if (h11 != 0) {
            throw C2338G.a(null, null);
        }
        if (h10 == 1) {
            f(i10);
        }
        if (!i10.g()) {
            throw C2338G.a(null, null);
        }
        this.f59233p = i10.h(6);
        int h12 = i10.h(4);
        int h13 = i10.h(3);
        if (h12 != 0 || h13 != 0) {
            throw C2338G.a(null, null);
        }
        if (h10 == 0) {
            int e10 = i10.e();
            int h14 = h(i10);
            i10.p(e10);
            byte[] bArr = new byte[(h14 + 7) / 8];
            i10.i(bArr, 0, h14);
            androidx.media3.common.a P10 = new a.b().j0(this.f59224g).W(this.f59220c).y0("audio/mp4a-latm").U(this.f59240w).T(this.f59239v).z0(this.f59237t).k0(Collections.singletonList(bArr)).n0(this.f59218a).w0(this.f59219b).P();
            if (!P10.equals(this.f59225h)) {
                this.f59225h = P10;
                this.f59238u = 1024000000 / P10.f20519G;
                this.f59223f.c(P10);
            }
        } else {
            i10.r(((int) f(i10)) - h(i10));
        }
        i(i10);
        boolean g11 = i10.g();
        this.f59235r = g11;
        this.f59236s = 0L;
        if (g11) {
            if (h10 == 1) {
                this.f59236s = f(i10);
            } else {
                do {
                    g10 = i10.g();
                    this.f59236s = (this.f59236s << 8) + i10.h(8);
                } while (g10);
            }
        }
        if (i10.g()) {
            i10.r(8);
        }
    }

    public final void m(int i10) {
        this.f59221d.X(i10);
        this.f59222e.n(this.f59221d.f());
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
    }
}

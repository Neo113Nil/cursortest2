package o2;

import H1.AbstractC1168a;
import H1.C1181n;
import androidx.media3.common.a;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import o2.L;

/* renamed from: o2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5789i implements InterfaceC5793m {
    private static final byte[] ID3_IDENTIFIER = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59045a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.I f59046b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.J f59047c;

    /* renamed from: d, reason: collision with root package name */
    public final String f59048d;

    /* renamed from: e, reason: collision with root package name */
    public final int f59049e;

    /* renamed from: f, reason: collision with root package name */
    public final String f59050f;

    /* renamed from: g, reason: collision with root package name */
    public String f59051g;

    /* renamed from: h, reason: collision with root package name */
    public H1.O f59052h;

    /* renamed from: i, reason: collision with root package name */
    public H1.O f59053i;

    /* renamed from: j, reason: collision with root package name */
    public int f59054j;

    /* renamed from: k, reason: collision with root package name */
    public int f59055k;

    /* renamed from: l, reason: collision with root package name */
    public int f59056l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f59057m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f59058n;

    /* renamed from: o, reason: collision with root package name */
    public int f59059o;

    /* renamed from: p, reason: collision with root package name */
    public int f59060p;

    /* renamed from: q, reason: collision with root package name */
    public int f59061q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f59062r;

    /* renamed from: s, reason: collision with root package name */
    public long f59063s;

    /* renamed from: t, reason: collision with root package name */
    public int f59064t;

    /* renamed from: u, reason: collision with root package name */
    public long f59065u;

    /* renamed from: v, reason: collision with root package name */
    public H1.O f59066v;

    /* renamed from: w, reason: collision with root package name */
    public long f59067w;

    public C5789i(boolean z10, String str) {
        this(z10, null, 0, str);
    }

    private boolean i(e1.J j10, byte[] bArr, int i10) {
        int min = Math.min(j10.a(), i10 - this.f59055k);
        j10.q(bArr, this.f59055k, min);
        int i11 = this.f59055k + min;
        this.f59055k = i11;
        return i11 == i10;
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        f();
        while (j10.a() > 0) {
            int i10 = this.f59054j;
            if (i10 == 0) {
                j(j10);
            } else if (i10 == 1) {
                g(j10);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(j10, this.f59046b.data, this.f59057m ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    p(j10);
                }
            } else if (i(j10, this.f59047c.f(), 10)) {
                o();
            }
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59065u = -9223372036854775807L;
        q();
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59051g = dVar.b();
        H1.O c10 = rVar.c(dVar.c(), 1);
        this.f59052h = c10;
        this.f59066v = c10;
        if (!this.f59045a) {
            this.f59053i = new C1181n();
            return;
        }
        dVar.a();
        H1.O c11 = rVar.c(dVar.c(), 5);
        this.f59053i = c11;
        c11.c(new a.b().j0(dVar.b()).W(this.f59050f).y0("application/id3").P());
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59065u = j10;
    }

    public final void f() {
        AbstractC4134a.e(this.f59052h);
        Z.i(this.f59066v);
        Z.i(this.f59053i);
    }

    public final void g(e1.J j10) {
        if (j10.a() == 0) {
            return;
        }
        this.f59046b.data[0] = j10.f()[j10.g()];
        this.f59046b.p(2);
        int h10 = this.f59046b.h(4);
        int i10 = this.f59060p;
        if (i10 != -1 && h10 != i10) {
            q();
            return;
        }
        if (!this.f59058n) {
            this.f59058n = true;
            this.f59059o = this.f59061q;
            this.f59060p = h10;
        }
        t();
    }

    public final boolean h(e1.J j10, int i10) {
        j10.b0(i10 + 1);
        if (!w(j10, this.f59046b.data, 1)) {
            return false;
        }
        this.f59046b.p(4);
        int h10 = this.f59046b.h(1);
        int i11 = this.f59059o;
        if (i11 != -1 && h10 != i11) {
            return false;
        }
        if (this.f59060p != -1) {
            if (!w(j10, this.f59046b.data, 1)) {
                return true;
            }
            this.f59046b.p(2);
            if (this.f59046b.h(4) != this.f59060p) {
                return false;
            }
            j10.b0(i10 + 2);
        }
        if (!w(j10, this.f59046b.data, 4)) {
            return true;
        }
        this.f59046b.p(14);
        int h11 = this.f59046b.h(13);
        if (h11 < 7) {
            return false;
        }
        byte[] f10 = j10.f();
        int j11 = j10.j();
        int i12 = i10 + h11;
        if (i12 >= j11) {
            return true;
        }
        byte b10 = f10[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == j11) {
                return true;
            }
            return l((byte) -1, f10[i13]) && ((f10[i13] & 8) >> 3) == h10;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == j11) {
            return true;
        }
        if (f10[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == j11 || f10[i15] == 51;
    }

    public final void j(e1.J j10) {
        byte[] f10 = j10.f();
        int g10 = j10.g();
        int j11 = j10.j();
        while (g10 < j11) {
            int i10 = g10 + 1;
            byte b10 = f10[g10];
            int i11 = b10 & UByte.MAX_VALUE;
            if (this.f59056l == 512 && l((byte) -1, (byte) i11) && (this.f59058n || h(j10, g10 - 1))) {
                this.f59061q = (b10 & 8) >> 3;
                this.f59057m = (b10 & 1) == 0;
                if (this.f59058n) {
                    t();
                } else {
                    r();
                }
                j10.b0(i10);
                return;
            }
            int i12 = this.f59056l;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f59056l = 768;
            } else if (i13 == 511) {
                this.f59056l = 512;
            } else if (i13 == 836) {
                this.f59056l = 1024;
            } else if (i13 == 1075) {
                u();
                j10.b0(i10);
                return;
            } else if (i12 != 256) {
                this.f59056l = 256;
            }
            g10 = i10;
        }
        j10.b0(g10);
    }

    public long k() {
        return this.f59063s;
    }

    public final boolean l(byte b10, byte b11) {
        return m(((b10 & UByte.MAX_VALUE) << 8) | (b11 & UByte.MAX_VALUE));
    }

    public final void n() {
        this.f59046b.p(0);
        if (this.f59062r) {
            this.f59046b.r(10);
        } else {
            int i10 = 2;
            int h10 = this.f59046b.h(2) + 1;
            if (h10 != 2) {
                AbstractC4156x.i("AdtsReader", "Detected audio object type: " + h10 + ", but assuming AAC LC.");
            } else {
                i10 = h10;
            }
            this.f59046b.r(5);
            byte[] b10 = AbstractC1168a.b(i10, this.f59060p, this.f59046b.h(3));
            AbstractC1168a.b f10 = AbstractC1168a.f(b10);
            androidx.media3.common.a P10 = new a.b().j0(this.f59051g).W(this.f59050f).y0("audio/mp4a-latm").U(f10.f4379c).T(f10.f4378b).z0(f10.f4377a).k0(Collections.singletonList(b10)).n0(this.f59048d).w0(this.f59049e).P();
            this.f59063s = 1024000000 / P10.f20519G;
            this.f59052h.c(P10);
            this.f59062r = true;
        }
        this.f59046b.r(4);
        int h11 = this.f59046b.h(13);
        int i11 = h11 - 7;
        if (this.f59057m) {
            i11 = h11 - 9;
        }
        v(this.f59052h, this.f59063s, 0, i11);
    }

    public final void o() {
        this.f59053i.a(this.f59047c, 10);
        this.f59047c.b0(6);
        v(this.f59053i, 0L, 10, this.f59047c.L() + 10);
    }

    public final void p(e1.J j10) {
        int min = Math.min(j10.a(), this.f59064t - this.f59055k);
        this.f59066v.a(j10, min);
        int i10 = this.f59055k + min;
        this.f59055k = i10;
        if (i10 == this.f59064t) {
            AbstractC4134a.g(this.f59065u != -9223372036854775807L);
            this.f59066v.g(this.f59065u, 1, this.f59064t, 0, null);
            this.f59065u += this.f59067w;
            s();
        }
    }

    public final void q() {
        this.f59058n = false;
        s();
    }

    public final void r() {
        this.f59054j = 1;
        this.f59055k = 0;
    }

    public final void s() {
        this.f59054j = 0;
        this.f59055k = 0;
        this.f59056l = 256;
    }

    public final void t() {
        this.f59054j = 3;
        this.f59055k = 0;
    }

    public final void u() {
        this.f59054j = 2;
        this.f59055k = ID3_IDENTIFIER.length;
        this.f59064t = 0;
        this.f59047c.b0(0);
    }

    public final void v(H1.O o10, long j10, int i10, int i11) {
        this.f59054j = 4;
        this.f59055k = i10;
        this.f59066v = o10;
        this.f59067w = j10;
        this.f59064t = i11;
    }

    public final boolean w(e1.J j10, byte[] bArr, int i10) {
        if (j10.a() < i10) {
            return false;
        }
        j10.q(bArr, 0, i10);
        return true;
    }

    public C5789i(boolean z10, String str, int i10, String str2) {
        this.f59046b = new e1.I(new byte[7]);
        this.f59047c = new e1.J(Arrays.copyOf(ID3_IDENTIFIER, 10));
        this.f59059o = -1;
        this.f59060p = -1;
        this.f59063s = -9223372036854775807L;
        this.f59065u = -9223372036854775807L;
        this.f59045a = z10;
        this.f59048d = str;
        this.f59049e = i10;
        this.f59050f = str2;
        s();
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
    }
}

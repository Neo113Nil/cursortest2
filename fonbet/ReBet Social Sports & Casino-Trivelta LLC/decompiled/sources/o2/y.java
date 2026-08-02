package o2;

import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Q;
import o2.L;

/* loaded from: classes.dex */
public final class y implements L {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5793m f59290a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.I f59291b = new e1.I(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f59292c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f59293d;

    /* renamed from: e, reason: collision with root package name */
    public Q f59294e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f59295f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f59296g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f59297h;

    /* renamed from: i, reason: collision with root package name */
    public int f59298i;

    /* renamed from: j, reason: collision with root package name */
    public int f59299j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59300k;

    /* renamed from: l, reason: collision with root package name */
    public long f59301l;

    public y(InterfaceC5793m interfaceC5793m) {
        this.f59290a = interfaceC5793m;
    }

    @Override // o2.L
    public void a(e1.J j10, int i10) {
        AbstractC4134a.i(this.f59294e);
        if ((i10 & 1) != 0) {
            int i11 = this.f59292c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    AbstractC4156x.i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f59299j != -1) {
                        AbstractC4156x.i("PesReader", "Unexpected start indicator: expected " + this.f59299j + " more bytes");
                    }
                    this.f59290a.c(j10.j() == 0);
                }
            }
            h(1);
        }
        while (j10.a() > 0) {
            int i12 = this.f59292c;
            if (i12 == 0) {
                j10.c0(j10.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(j10, this.f59291b.data, Math.min(10, this.f59298i)) && e(j10, null, this.f59298i)) {
                        g();
                        i10 |= this.f59300k ? 4 : 0;
                        this.f59290a.e(this.f59301l, i10);
                        h(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int a10 = j10.a();
                    int i13 = this.f59299j;
                    int i14 = i13 == -1 ? 0 : a10 - i13;
                    if (i14 > 0) {
                        a10 -= i14;
                        j10.a0(j10.g() + a10);
                    }
                    this.f59290a.a(j10);
                    int i15 = this.f59299j;
                    if (i15 != -1) {
                        int i16 = i15 - a10;
                        this.f59299j = i16;
                        if (i16 == 0) {
                            this.f59290a.c(false);
                            h(1);
                        }
                    }
                }
            } else if (e(j10, this.f59291b.data, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // o2.L
    public void b() {
        this.f59292c = 0;
        this.f59293d = 0;
        this.f59297h = false;
        this.f59290a.b();
    }

    @Override // o2.L
    public void c(Q q10, H1.r rVar, L.d dVar) {
        this.f59294e = q10;
        this.f59290a.d(rVar, dVar);
    }

    public boolean d(boolean z10) {
        return this.f59292c == 3 && this.f59299j == -1 && !(z10 && (this.f59290a instanceof C5794n)) && (!z10 || f());
    }

    public final boolean e(e1.J j10, byte[] bArr, int i10) {
        int min = Math.min(j10.a(), i10 - this.f59293d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            j10.c0(min);
        } else {
            j10.q(bArr, this.f59293d, min);
        }
        int i11 = this.f59293d + min;
        this.f59293d = i11;
        return i11 == i10;
    }

    public final boolean f() {
        this.f59291b.p(0);
        int h10 = this.f59291b.h(24);
        if (h10 != 1) {
            AbstractC4156x.i("PesReader", "Unexpected start code prefix: " + h10);
            this.f59299j = -1;
            return false;
        }
        this.f59291b.r(8);
        int h11 = this.f59291b.h(16);
        this.f59291b.r(5);
        this.f59300k = this.f59291b.g();
        this.f59291b.r(2);
        this.f59295f = this.f59291b.g();
        this.f59296g = this.f59291b.g();
        this.f59291b.r(6);
        int h12 = this.f59291b.h(8);
        this.f59298i = h12;
        if (h11 == 0) {
            this.f59299j = -1;
        } else {
            int i10 = (h11 - 3) - h12;
            this.f59299j = i10;
            if (i10 < 0) {
                AbstractC4156x.i("PesReader", "Found negative packet payload size: " + this.f59299j);
                this.f59299j = -1;
            }
        }
        return true;
    }

    public final void g() {
        this.f59291b.p(0);
        this.f59301l = -9223372036854775807L;
        if (this.f59295f) {
            this.f59291b.r(4);
            this.f59291b.r(1);
            this.f59291b.r(1);
            long h10 = (this.f59291b.h(3) << 30) | (this.f59291b.h(15) << 15) | this.f59291b.h(15);
            this.f59291b.r(1);
            if (!this.f59297h && this.f59296g) {
                this.f59291b.r(4);
                this.f59291b.r(1);
                this.f59291b.r(1);
                this.f59291b.r(1);
                this.f59294e.b((this.f59291b.h(3) << 30) | (this.f59291b.h(15) << 15) | this.f59291b.h(15));
                this.f59297h = true;
            }
            this.f59301l = this.f59294e.b(h10);
        }
    }

    public final void h(int i10) {
        this.f59292c = i10;
        this.f59293d = 0;
    }
}

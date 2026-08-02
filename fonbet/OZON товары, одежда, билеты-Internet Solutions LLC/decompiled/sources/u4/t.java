package u4;

import N3.M;
import com.google.common.collect.AbstractC5880y;
import j3.C7272n;
import m3.C8049B;
import m3.C8050C;
import m3.N;
import u4.J;
import u4.u;

/* loaded from: classes8.dex */
public final class t implements InterfaceC9958l {

    /* renamed from: e, reason: collision with root package name */
    private String f100240e;

    /* renamed from: f, reason: collision with root package name */
    private M f100241f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f100244i;

    /* renamed from: k, reason: collision with root package name */
    private int f100246k;

    /* renamed from: l, reason: collision with root package name */
    private int f100247l;

    /* renamed from: n, reason: collision with root package name */
    private int f100249n;

    /* renamed from: o, reason: collision with root package name */
    private int f100250o;

    /* renamed from: s, reason: collision with root package name */
    private int f100254s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f100256u;

    /* renamed from: d, reason: collision with root package name */
    private int f100239d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f100236a = new C8050C(2, new byte[15]);

    /* renamed from: b, reason: collision with root package name */
    private final C8049B f100237b = new C8049B();

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f100238c = new C8050C();

    /* renamed from: p, reason: collision with root package name */
    private u.a f100251p = new u.a();

    /* renamed from: q, reason: collision with root package name */
    private int f100252q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    private int f100253r = -1;

    /* renamed from: t, reason: collision with root package name */
    private long f100255t = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f100245j = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f100248m = true;

    /* renamed from: g, reason: collision with root package name */
    private double f100242g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    private double f100243h = -9.223372036854776E18d;

    private static void a(C8050C c8050c, C8050C c8050c2, boolean z11) {
        int f7 = c8050c.f();
        int min = Math.min(c8050c.a(), c8050c2.a());
        c8050c.n(c8050c2.f(), min, c8050c2.e());
        c8050c2.S(min);
        if (z11) {
            c8050c.R(f7);
        }
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100239d = 0;
        this.f100247l = 0;
        this.f100236a.O(2);
        this.f100249n = 0;
        this.f100250o = 0;
        this.f100252q = -2147483647;
        this.f100253r = -1;
        this.f100254s = 0;
        this.f100255t = -1L;
        this.f100256u = false;
        this.f100244i = false;
        this.f100248m = true;
        this.f100245j = true;
        this.f100242g = -9.223372036854776E18d;
        this.f100243h = -9.223372036854776E18d;
    }

    @Override // u4.InterfaceC9958l
    public final void c(C8050C c8050c) throws j3.v {
        int i11;
        G10.a.i(this.f100241f);
        while (c8050c.a() > 0) {
            int i12 = this.f100239d;
            int i13 = 0;
            if (i12 == 0) {
                int i14 = this.f100246k;
                if ((i14 & 2) != 0) {
                    if ((i14 & 4) == 0) {
                        while (c8050c.a() > 0) {
                            int i15 = this.f100247l << 8;
                            this.f100247l = i15;
                            int E11 = i15 | c8050c.E();
                            this.f100247l = E11;
                            if ((E11 & 16777215) == 12583333) {
                                c8050c.R(c8050c.f() - 3);
                                this.f100247l = 0;
                            }
                        }
                    }
                    this.f100239d = 1;
                    break;
                }
                c8050c.R(c8050c.i());
            } else {
                u.a aVar = this.f100251p;
                C8050C c8050c2 = this.f100238c;
                if (i12 == 1) {
                    C8050C c8050c3 = this.f100236a;
                    a(c8050c, c8050c3, false);
                    if (c8050c3.a() == 0) {
                        int i16 = c8050c3.i();
                        byte[] e11 = c8050c3.e();
                        C8049B c8049b = this.f100237b;
                        c8049b.l(i16, e11);
                        boolean a11 = u.a(c8049b, aVar);
                        if (a11) {
                            this.f100249n = 0;
                            this.f100250o = aVar.f100259c + i16 + this.f100250o;
                        }
                        if (a11) {
                            c8050c3.R(0);
                            this.f100241f.e(c8050c3.i(), c8050c3);
                            c8050c3.O(2);
                            c8050c2.O(aVar.f100259c);
                            this.f100248m = true;
                            this.f100239d = 2;
                        } else if (c8050c3.i() < 15) {
                            c8050c3.Q(c8050c3.i() + 1);
                            this.f100248m = false;
                        }
                    } else {
                        this.f100248m = false;
                    }
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException();
                    }
                    int i17 = aVar.f100257a;
                    if (i17 == 1 || i17 == 17) {
                        a(c8050c, c8050c2, true);
                    }
                    int min = Math.min(c8050c.a(), aVar.f100259c - this.f100249n);
                    this.f100241f.e(min, c8050c);
                    int i18 = this.f100249n + min;
                    this.f100249n = i18;
                    if (i18 == aVar.f100259c) {
                        int i19 = aVar.f100257a;
                        if (i19 == 1) {
                            byte[] e12 = c8050c2.e();
                            u.b b11 = u.b(new C8049B(e12.length, e12));
                            this.f100252q = b11.f100261b;
                            this.f100253r = b11.f100262c;
                            long j11 = this.f100255t;
                            long j12 = aVar.f100258b;
                            if (j11 != j12) {
                                this.f100255t = j12;
                                int i21 = b11.f100260a;
                                String concat = i21 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i21))) : "mhm1";
                                byte[] bArr = b11.f100263d;
                                AbstractC5880y C11 = (bArr == null || bArr.length <= 0) ? null : AbstractC5880y.C(N.f74291c, bArr);
                                C7272n.a aVar2 = new C7272n.a();
                                aVar2.j0(this.f100240e);
                                aVar2.W("video/mp2t");
                                aVar2.y0("audio/mhm1");
                                aVar2.z0(this.f100252q);
                                aVar2.U(concat);
                                aVar2.k0(C11);
                                this.f100241f.a(aVar2.P());
                            }
                            this.f100256u = true;
                        } else if (i19 == 17) {
                            byte[] e13 = c8050c2.e();
                            C8049B c8049b2 = new C8049B(e13.length, e13);
                            if (c8049b2.g()) {
                                c8049b2.p(2);
                                i13 = c8049b2.h(13);
                            }
                            this.f100254s = i13;
                        } else if (i19 == 2) {
                            if (this.f100256u) {
                                this.f100245j = false;
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            double d11 = ((this.f100253r - this.f100254s) * 1000000.0d) / this.f100252q;
                            long round = Math.round(this.f100242g);
                            if (this.f100244i) {
                                this.f100244i = false;
                                this.f100242g = this.f100243h;
                            } else {
                                this.f100242g += d11;
                            }
                            this.f100241f.b(round, i11, this.f100250o, 0, null);
                            this.f100256u = false;
                            this.f100254s = 0;
                            this.f100250o = 0;
                        }
                        this.f100239d = 1;
                    }
                }
            }
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100246k = i11;
        if (!this.f100245j && (this.f100250o != 0 || !this.f100248m)) {
            this.f100244i = true;
        }
        if (j11 != -9223372036854775807L) {
            if (this.f100244i) {
                this.f100243h = j11;
            } else {
                this.f100242g = j11;
            }
        }
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100240e = dVar.b();
        this.f100241f = rVar.track(dVar.c(), 1);
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
    }
}

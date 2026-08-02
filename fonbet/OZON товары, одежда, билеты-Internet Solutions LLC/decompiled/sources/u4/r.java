package u4;

import N3.C3650a;
import N3.M;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import java.util.Collections;
import m3.C8049B;
import m3.C8050C;
import u4.J;

/* loaded from: classes8.dex */
public final class r implements InterfaceC9958l {

    /* renamed from: a, reason: collision with root package name */
    private final String f100200a;

    /* renamed from: b, reason: collision with root package name */
    private final int f100201b;

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f100202c;

    /* renamed from: d, reason: collision with root package name */
    private final C8049B f100203d;

    /* renamed from: e, reason: collision with root package name */
    private M f100204e;

    /* renamed from: f, reason: collision with root package name */
    private String f100205f;

    /* renamed from: g, reason: collision with root package name */
    private C7272n f100206g;

    /* renamed from: h, reason: collision with root package name */
    private int f100207h;

    /* renamed from: i, reason: collision with root package name */
    private int f100208i;

    /* renamed from: j, reason: collision with root package name */
    private int f100209j;

    /* renamed from: k, reason: collision with root package name */
    private int f100210k;

    /* renamed from: l, reason: collision with root package name */
    private long f100211l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f100212m;

    /* renamed from: n, reason: collision with root package name */
    private int f100213n;

    /* renamed from: o, reason: collision with root package name */
    private int f100214o;

    /* renamed from: p, reason: collision with root package name */
    private int f100215p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f100216q;

    /* renamed from: r, reason: collision with root package name */
    private long f100217r;

    /* renamed from: s, reason: collision with root package name */
    private int f100218s;

    /* renamed from: t, reason: collision with root package name */
    private long f100219t;

    /* renamed from: u, reason: collision with root package name */
    private int f100220u;

    /* renamed from: v, reason: collision with root package name */
    private String f100221v;

    public r(String str, int i11) {
        this.f100200a = str;
        this.f100201b = i11;
        C8050C c8050c = new C8050C(UserVerificationMethods.USER_VERIFY_ALL);
        this.f100202c = c8050c;
        byte[] e11 = c8050c.e();
        this.f100203d = new C8049B(e11.length, e11);
        this.f100211l = -9223372036854775807L;
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100207h = 0;
        this.f100211l = -9223372036854775807L;
        this.f100212m = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019e, code lost:
    
        if (r23.f100212m == false) goto L89;
     */
    @Override // u4.InterfaceC9958l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C8050C c8050c) throws j3.v {
        int h11;
        boolean g10;
        G10.a.i(this.f100204e);
        while (c8050c.a() > 0) {
            int i11 = this.f100207h;
            if (i11 != 0) {
                if (i11 != 1) {
                    C8050C c8050c2 = this.f100202c;
                    C8049B c8049b = this.f100203d;
                    if (i11 == 2) {
                        int E11 = ((this.f100210k & (-225)) << 8) | c8050c.E();
                        this.f100209j = E11;
                        if (E11 > c8050c2.e().length) {
                            c8050c2.O(this.f100209j);
                            byte[] e11 = c8050c2.e();
                            c8049b.getClass();
                            c8049b.l(e11.length, e11);
                        }
                        this.f100208i = 0;
                        this.f100207h = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(c8050c.a(), this.f100209j - this.f100208i);
                        c8050c.n(this.f100208i, min, c8049b.f74257a);
                        int i12 = this.f100208i + min;
                        this.f100208i = i12;
                        if (i12 == this.f100209j) {
                            c8049b.n(0);
                            if (!c8049b.g()) {
                                this.f100212m = true;
                                int h12 = c8049b.h(1);
                                int h13 = h12 == 1 ? c8049b.h(1) : 0;
                                this.f100213n = h13;
                                if (h13 != 0) {
                                    throw j3.v.a(null, null);
                                }
                                if (h12 == 1) {
                                    c8049b.h((c8049b.h(2) + 1) * 8);
                                }
                                if (!c8049b.g()) {
                                    throw j3.v.a(null, null);
                                }
                                this.f100214o = c8049b.h(6);
                                int h14 = c8049b.h(4);
                                int h15 = c8049b.h(3);
                                if (h14 != 0 || h15 != 0) {
                                    throw j3.v.a(null, null);
                                }
                                if (h12 == 0) {
                                    int e12 = c8049b.e();
                                    int b11 = c8049b.b();
                                    C3650a.C0354a b12 = C3650a.b(c8049b, true);
                                    this.f100221v = b12.f18544c;
                                    this.f100218s = b12.f18542a;
                                    this.f100220u = b12.f18543b;
                                    int b13 = b11 - c8049b.b();
                                    c8049b.n(e12);
                                    byte[] bArr = new byte[(b13 + 7) / 8];
                                    c8049b.i(b13, bArr);
                                    C7272n.a aVar = new C7272n.a();
                                    aVar.j0(this.f100205f);
                                    aVar.W("video/mp2t");
                                    aVar.y0("audio/mp4a-latm");
                                    aVar.U(this.f100221v);
                                    aVar.T(this.f100220u);
                                    aVar.z0(this.f100218s);
                                    aVar.k0(Collections.singletonList(bArr));
                                    aVar.n0(this.f100200a);
                                    aVar.w0(this.f100201b);
                                    C7272n P11 = aVar.P();
                                    if (!P11.equals(this.f100206g)) {
                                        this.f100206g = P11;
                                        this.f100219t = 1024000000 / P11.f69103H;
                                        this.f100204e.a(P11);
                                    }
                                } else {
                                    int b14 = c8049b.b();
                                    C3650a.C0354a b15 = C3650a.b(c8049b, true);
                                    this.f100221v = b15.f18544c;
                                    this.f100218s = b15.f18542a;
                                    this.f100220u = b15.f18543b;
                                    c8049b.p(c8049b.h((c8049b.h(2) + 1) * 8) - (b14 - c8049b.b()));
                                }
                                int h16 = c8049b.h(3);
                                this.f100215p = h16;
                                if (h16 == 0) {
                                    c8049b.p(8);
                                } else if (h16 == 1) {
                                    c8049b.p(9);
                                } else if (h16 == 3 || h16 == 4 || h16 == 5) {
                                    c8049b.p(6);
                                } else {
                                    if (h16 != 6 && h16 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c8049b.p(1);
                                }
                                boolean g11 = c8049b.g();
                                this.f100216q = g11;
                                this.f100217r = 0L;
                                if (g11) {
                                    if (h12 == 1) {
                                        this.f100217r = c8049b.h((c8049b.h(2) + 1) * 8);
                                    } else {
                                        do {
                                            g10 = c8049b.g();
                                            this.f100217r = (this.f100217r << 8) + c8049b.h(8);
                                        } while (g10);
                                    }
                                }
                                if (c8049b.g()) {
                                    c8049b.p(8);
                                }
                            }
                            if (this.f100213n != 0) {
                                throw j3.v.a(null, null);
                            }
                            if (this.f100214o != 0) {
                                throw j3.v.a(null, null);
                            }
                            if (this.f100215p != 0) {
                                throw j3.v.a(null, null);
                            }
                            int i13 = 0;
                            do {
                                h11 = c8049b.h(8);
                                i13 += h11;
                            } while (h11 == 255);
                            int e13 = c8049b.e();
                            if ((e13 & 7) == 0) {
                                c8050c2.R(e13 >> 3);
                            } else {
                                c8049b.i(i13 * 8, c8050c2.e());
                                c8050c2.R(0);
                            }
                            this.f100204e.e(i13, c8050c2);
                            G10.a.h(this.f100211l != -9223372036854775807L);
                            this.f100204e.b(this.f100211l, 1, i13, 0, null);
                            this.f100211l += this.f100219t;
                            if (this.f100216q) {
                                c8049b.p((int) this.f100217r);
                            }
                            this.f100207h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int E12 = c8050c.E();
                    if ((E12 & 224) == 224) {
                        this.f100210k = E12;
                        this.f100207h = 2;
                    } else if (E12 != 86) {
                        this.f100207h = 0;
                    }
                }
            } else if (c8050c.E() == 86) {
                this.f100207h = 1;
            }
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100211l = j11;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100204e = rVar.track(dVar.c(), 1);
        this.f100205f = dVar.b();
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
    }
}

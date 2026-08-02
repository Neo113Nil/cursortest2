package u4;

import N3.C3664o;
import N3.M;
import j3.C7272n;
import java.util.concurrent.atomic.AtomicInteger;
import m3.C8050C;
import m3.N;
import u4.J;

/* renamed from: u4.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9956j implements InterfaceC9958l {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f100045a;

    /* renamed from: c, reason: collision with root package name */
    private final String f100047c;

    /* renamed from: d, reason: collision with root package name */
    private final int f100048d;

    /* renamed from: f, reason: collision with root package name */
    private String f100050f;

    /* renamed from: g, reason: collision with root package name */
    private M f100051g;

    /* renamed from: i, reason: collision with root package name */
    private int f100053i;

    /* renamed from: j, reason: collision with root package name */
    private int f100054j;

    /* renamed from: k, reason: collision with root package name */
    private long f100055k;

    /* renamed from: l, reason: collision with root package name */
    private C7272n f100056l;

    /* renamed from: m, reason: collision with root package name */
    private int f100057m;

    /* renamed from: n, reason: collision with root package name */
    private int f100058n;

    /* renamed from: h, reason: collision with root package name */
    private int f100052h = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f100061q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f100046b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    private int f100059o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f100060p = -1;

    /* renamed from: e, reason: collision with root package name */
    private final String f100049e = "video/mp2t";

    public C9956j(String str, int i11, int i12) {
        this.f100045a = new C8050C(new byte[i12]);
        this.f100047c = str;
        this.f100048d = i11;
    }

    private boolean a(C8050C c8050c, byte[] bArr, int i11) {
        int min = Math.min(c8050c.a(), i11 - this.f100053i);
        c8050c.n(this.f100053i, min, bArr);
        int i12 = this.f100053i + min;
        this.f100053i = i12;
        return i12 == i11;
    }

    private void g(C3664o.a aVar) {
        int i11;
        int i12 = aVar.f18643b;
        if (i12 == -2147483647 || (i11 = aVar.f18644c) == -1) {
            return;
        }
        C7272n c7272n = this.f100056l;
        String str = aVar.f18642a;
        if (c7272n != null && i11 == c7272n.f69102G && i12 == c7272n.f69103H && str.equals(c7272n.f69127o)) {
            return;
        }
        C7272n c7272n2 = this.f100056l;
        C7272n.a aVar2 = c7272n2 == null ? new C7272n.a() : c7272n2.a();
        aVar2.j0(this.f100050f);
        aVar2.W(this.f100049e);
        aVar2.y0(str);
        aVar2.T(i11);
        aVar2.z0(i12);
        aVar2.n0(this.f100047c);
        aVar2.w0(this.f100048d);
        C7272n P11 = aVar2.P();
        this.f100056l = P11;
        this.f100051g.a(P11);
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100052h = 0;
        this.f100053i = 0;
        this.f100054j = 0;
        this.f100061q = -9223372036854775807L;
        this.f100046b.set(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
    @Override // u4.InterfaceC9958l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C8050C c8050c) throws j3.v {
        char c11;
        char c12;
        int i11;
        byte b11;
        boolean z11;
        int i12;
        int i13;
        byte b12;
        int i14;
        byte b13;
        int i15;
        byte b14;
        G10.a.i(this.f100051g);
        while (c8050c.a() > 0) {
            int i16 = this.f100052h;
            C8050C c8050c2 = this.f100045a;
            switch (i16) {
                case 0:
                    while (true) {
                        if (c8050c.a() > 0) {
                            int i17 = this.f100054j << 8;
                            this.f100054j = i17;
                            int E11 = i17 | c8050c.E();
                            this.f100054j = E11;
                            int i18 = (E11 == 2147385345 || E11 == -25230976 || E11 == 536864768 || E11 == -14745368) ? 1 : (E11 == 1683496997 || E11 == 622876772) ? 2 : (E11 == 1078008818 || E11 == -233094848) ? 3 : (E11 == 1908687592 || E11 == -398277519) ? 4 : 0;
                            this.f100058n = i18;
                            if (i18 != 0) {
                                byte[] e11 = c8050c2.e();
                                int i19 = this.f100054j;
                                e11[0] = (byte) ((i19 >> 24) & 255);
                                e11[1] = (byte) ((i19 >> 16) & 255);
                                e11[2] = (byte) ((i19 >> 8) & 255);
                                e11[3] = (byte) (i19 & 255);
                                this.f100053i = 4;
                                this.f100054j = 0;
                                int i21 = this.f100058n;
                                if (i21 != 3 && i21 != 4) {
                                    if (i21 != 1) {
                                        this.f100052h = 2;
                                        break;
                                    } else {
                                        this.f100052h = 1;
                                        break;
                                    }
                                } else {
                                    this.f100052h = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!a(c8050c, c8050c2.e(), 18)) {
                        break;
                    } else {
                        byte[] e12 = c8050c2.e();
                        if (this.f100056l == null) {
                            c11 = 7;
                            C7272n b15 = C3664o.b(e12, this.f100050f, this.f100047c, this.f100048d, this.f100049e);
                            this.f100056l = b15;
                            this.f100051g.a(b15);
                        } else {
                            c11 = 7;
                        }
                        byte b16 = e12[0];
                        if (b16 != -2) {
                            if (b16 == -1) {
                                c12 = 5;
                                i15 = ((e12[c11] & 3) << 12) | ((e12[6] & 255) << 4);
                                b14 = e12[9];
                            } else if (b16 != 31) {
                                c12 = 5;
                                i11 = ((e12[6] & 255) << 4) | ((e12[5] & 3) << 12);
                                b11 = e12[c11];
                            } else {
                                c12 = 5;
                                i15 = ((e12[6] & 3) << 12) | ((e12[c11] & 255) << 4);
                                b14 = e12[8];
                            }
                            i12 = (i15 | ((b14 & 60) >> 2)) + 1;
                            z11 = true;
                            if (z11) {
                                i12 = (i12 * 16) / 14;
                            }
                            this.f100057m = i12;
                            if (b16 == -2) {
                                if (b16 == -1) {
                                    i13 = (e12[4] & 7) << 4;
                                    b13 = e12[c11];
                                } else if (b16 != 31) {
                                    i13 = (e12[4] & 1) << 6;
                                    b12 = e12[c12];
                                } else {
                                    i13 = (e12[c12] & 7) << 4;
                                    b13 = e12[6];
                                }
                                i14 = b13 & 60;
                                this.f100055k = com.google.common.primitives.b.c(N.X(this.f100056l.f69103H, (((i14 >> 2) | i13) + 1) * 32));
                                c8050c2.R(0);
                                this.f100051g.e(18, c8050c2);
                                this.f100052h = 6;
                                break;
                            } else {
                                i13 = (e12[c12] & 1) << 6;
                                b12 = e12[4];
                            }
                            i14 = b12 & 252;
                            this.f100055k = com.google.common.primitives.b.c(N.X(this.f100056l.f69103H, (((i14 >> 2) | i13) + 1) * 32));
                            c8050c2.R(0);
                            this.f100051g.e(18, c8050c2);
                            this.f100052h = 6;
                        } else {
                            c12 = 5;
                            i11 = ((e12[4] & 3) << 12) | ((e12[c11] & 255) << 4);
                            b11 = e12[6];
                        }
                        i12 = (i11 | ((b11 & 240) >> 4)) + 1;
                        z11 = false;
                        if (z11) {
                        }
                        this.f100057m = i12;
                        if (b16 == -2) {
                        }
                        i14 = b12 & 252;
                        this.f100055k = com.google.common.primitives.b.c(N.X(this.f100056l.f69103H, (((i14 >> 2) | i13) + 1) * 32));
                        c8050c2.R(0);
                        this.f100051g.e(18, c8050c2);
                        this.f100052h = 6;
                    }
                case 2:
                    if (!a(c8050c, c8050c2.e(), 7)) {
                        break;
                    } else {
                        this.f100059o = C3664o.d(c8050c2.e());
                        this.f100052h = 3;
                        break;
                    }
                case 3:
                    if (!a(c8050c, c8050c2.e(), this.f100059o)) {
                        break;
                    } else {
                        C3664o.a c13 = C3664o.c(c8050c2.e());
                        g(c13);
                        this.f100057m = c13.f18645d;
                        long j11 = c13.f18646e;
                        this.f100055k = j11 != -9223372036854775807L ? j11 : 0L;
                        c8050c2.R(0);
                        this.f100051g.e(this.f100059o, c8050c2);
                        this.f100052h = 6;
                        break;
                    }
                case 4:
                    if (!a(c8050c, c8050c2.e(), 6)) {
                        break;
                    } else {
                        int f7 = C3664o.f(c8050c2.e());
                        this.f100060p = f7;
                        int i22 = this.f100053i;
                        if (i22 > f7) {
                            int i23 = i22 - f7;
                            this.f100053i = i22 - i23;
                            c8050c.R(c8050c.f() - i23);
                        }
                        this.f100052h = 5;
                        break;
                    }
                case 5:
                    if (!a(c8050c, c8050c2.e(), this.f100060p)) {
                        break;
                    } else {
                        C3664o.a e13 = C3664o.e(c8050c2.e(), this.f100046b);
                        if (this.f100058n == 3) {
                            g(e13);
                        }
                        this.f100057m = e13.f18645d;
                        long j12 = e13.f18646e;
                        this.f100055k = j12 != -9223372036854775807L ? j12 : 0L;
                        c8050c2.R(0);
                        this.f100051g.e(this.f100060p, c8050c2);
                        this.f100052h = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(c8050c.a(), this.f100057m - this.f100053i);
                    this.f100051g.e(min, c8050c);
                    int i24 = this.f100053i + min;
                    this.f100053i = i24;
                    if (i24 == this.f100057m) {
                        G10.a.h(this.f100061q != -9223372036854775807L);
                        this.f100051g.b(this.f100061q, this.f100058n == 4 ? 0 : 1, this.f100057m, 0, null);
                        this.f100061q += this.f100055k;
                        this.f100052h = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100061q = j11;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100050f = dVar.b();
        this.f100051g = rVar.track(dVar.c(), 1);
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
    }
}

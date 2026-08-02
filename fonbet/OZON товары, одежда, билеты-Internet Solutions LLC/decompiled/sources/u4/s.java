package u4;

import N3.F;
import N3.M;
import j3.C7272n;
import m3.C8050C;
import u4.J;

/* loaded from: classes8.dex */
public final class s implements InterfaceC9958l {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f100222a;

    /* renamed from: b, reason: collision with root package name */
    private final F.a f100223b;

    /* renamed from: c, reason: collision with root package name */
    private final String f100224c;

    /* renamed from: d, reason: collision with root package name */
    private final int f100225d;

    /* renamed from: e, reason: collision with root package name */
    private final String f100226e;

    /* renamed from: f, reason: collision with root package name */
    private M f100227f;

    /* renamed from: g, reason: collision with root package name */
    private String f100228g;

    /* renamed from: h, reason: collision with root package name */
    private int f100229h;

    /* renamed from: i, reason: collision with root package name */
    private int f100230i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f100231j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f100232k;

    /* renamed from: l, reason: collision with root package name */
    private long f100233l;

    /* renamed from: m, reason: collision with root package name */
    private int f100234m;

    /* renamed from: n, reason: collision with root package name */
    private long f100235n;

    public s() {
        this(null, 0, "video/mp2p");
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100229h = 0;
        this.f100230i = 0;
        this.f100232k = false;
        this.f100235n = -9223372036854775807L;
    }

    @Override // u4.InterfaceC9958l
    public final void c(C8050C c8050c) {
        G10.a.i(this.f100227f);
        while (c8050c.a() > 0) {
            int i11 = this.f100229h;
            C8050C c8050c2 = this.f100222a;
            if (i11 == 0) {
                byte[] e11 = c8050c.e();
                int f7 = c8050c.f();
                int i12 = c8050c.i();
                while (true) {
                    if (f7 >= i12) {
                        c8050c.R(i12);
                        break;
                    }
                    byte b11 = e11[f7];
                    boolean z11 = (b11 & 255) == 255;
                    boolean z12 = this.f100232k && (b11 & 224) == 224;
                    this.f100232k = z11;
                    if (z12) {
                        c8050c.R(f7 + 1);
                        this.f100232k = false;
                        c8050c2.e()[1] = e11[f7];
                        this.f100230i = 2;
                        this.f100229h = 1;
                        break;
                    }
                    f7++;
                }
            } else if (i11 == 1) {
                int min = Math.min(c8050c.a(), 4 - this.f100230i);
                c8050c.n(this.f100230i, min, c8050c2.e());
                int i13 = this.f100230i + min;
                this.f100230i = i13;
                if (i13 >= 4) {
                    c8050c2.R(0);
                    int p11 = c8050c2.p();
                    F.a aVar = this.f100223b;
                    if (aVar.a(p11)) {
                        this.f100234m = aVar.f18496c;
                        if (!this.f100231j) {
                            this.f100233l = (aVar.f18500g * 1000000) / aVar.f18497d;
                            C7272n.a aVar2 = new C7272n.a();
                            aVar2.j0(this.f100228g);
                            aVar2.W(this.f100226e);
                            aVar2.y0(aVar.f18495b);
                            aVar2.o0(4096);
                            aVar2.T(aVar.f18498e);
                            aVar2.z0(aVar.f18497d);
                            aVar2.n0(this.f100224c);
                            aVar2.w0(this.f100225d);
                            this.f100227f.a(aVar2.P());
                            this.f100231j = true;
                        }
                        c8050c2.R(0);
                        this.f100227f.e(4, c8050c2);
                        this.f100229h = 2;
                    } else {
                        this.f100230i = 0;
                        this.f100229h = 1;
                    }
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(c8050c.a(), this.f100234m - this.f100230i);
                this.f100227f.e(min2, c8050c);
                int i14 = this.f100230i + min2;
                this.f100230i = i14;
                if (i14 >= this.f100234m) {
                    G10.a.h(this.f100235n != -9223372036854775807L);
                    this.f100227f.b(this.f100235n, 1, this.f100234m, 0, null);
                    this.f100235n += this.f100233l;
                    this.f100230i = 0;
                    this.f100229h = 0;
                }
            }
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100235n = j11;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100228g = dVar.b();
        this.f100227f = rVar.track(dVar.c(), 1);
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
    }

    public s(String str, int i11, String str2) {
        this.f100229h = 0;
        C8050C c8050c = new C8050C(4);
        this.f100222a = c8050c;
        c8050c.e()[0] = -1;
        this.f100223b = new F.a();
        this.f100235n = -9223372036854775807L;
        this.f100224c = str;
        this.f100225d = i11;
        this.f100226e = str2;
    }
}

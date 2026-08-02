package u4;

import N3.C3652c;
import N3.M;
import j3.C7272n;
import m3.C8049B;
import m3.C8050C;
import u4.J;

/* renamed from: u4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9951e implements InterfaceC9958l {

    /* renamed from: a, reason: collision with root package name */
    private final C8049B f99995a;

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f99996b;

    /* renamed from: c, reason: collision with root package name */
    private final String f99997c;

    /* renamed from: d, reason: collision with root package name */
    private final int f99998d;

    /* renamed from: e, reason: collision with root package name */
    private final String f99999e;

    /* renamed from: f, reason: collision with root package name */
    private String f100000f;

    /* renamed from: g, reason: collision with root package name */
    private M f100001g;

    /* renamed from: h, reason: collision with root package name */
    private int f100002h;

    /* renamed from: i, reason: collision with root package name */
    private int f100003i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f100004j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f100005k;

    /* renamed from: l, reason: collision with root package name */
    private long f100006l;

    /* renamed from: m, reason: collision with root package name */
    private C7272n f100007m;

    /* renamed from: n, reason: collision with root package name */
    private int f100008n;

    /* renamed from: o, reason: collision with root package name */
    private long f100009o;

    public C9951e(String str, int i11, String str2) {
        C8049B c8049b = new C8049B(16, new byte[16]);
        this.f99995a = c8049b;
        this.f99996b = new C8050C(c8049b.f74257a);
        this.f100002h = 0;
        this.f100003i = 0;
        this.f100004j = false;
        this.f100005k = false;
        this.f100009o = -9223372036854775807L;
        this.f99997c = str;
        this.f99998d = i11;
        this.f99999e = str2;
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100002h = 0;
        this.f100003i = 0;
        this.f100004j = false;
        this.f100005k = false;
        this.f100009o = -9223372036854775807L;
    }

    @Override // u4.InterfaceC9958l
    public final void c(C8050C c8050c) {
        G10.a.i(this.f100001g);
        while (c8050c.a() > 0) {
            int i11 = this.f100002h;
            C8050C c8050c2 = this.f99996b;
            if (i11 == 0) {
                while (c8050c.a() > 0) {
                    if (this.f100004j) {
                        int E11 = c8050c.E();
                        this.f100004j = E11 == 172;
                        if (E11 == 64 || E11 == 65) {
                            this.f100005k = E11 == 65;
                            this.f100002h = 1;
                            c8050c2.e()[0] = -84;
                            c8050c2.e()[1] = (byte) (this.f100005k ? 65 : 64);
                            this.f100003i = 2;
                        }
                    } else {
                        this.f100004j = c8050c.E() == 172;
                    }
                }
            } else if (i11 == 1) {
                byte[] e11 = c8050c2.e();
                int min = Math.min(c8050c.a(), 16 - this.f100003i);
                c8050c.n(this.f100003i, min, e11);
                int i12 = this.f100003i + min;
                this.f100003i = i12;
                if (i12 == 16) {
                    C8049B c8049b = this.f99995a;
                    c8049b.n(0);
                    C3652c.b c11 = C3652c.c(c8049b);
                    C7272n c7272n = this.f100007m;
                    int i13 = c11.f18565a;
                    if (c7272n == null || 2 != c7272n.f69102G || i13 != c7272n.f69103H || !"audio/ac4".equals(c7272n.f69127o)) {
                        C7272n.a aVar = new C7272n.a();
                        aVar.j0(this.f100000f);
                        aVar.W(this.f99999e);
                        aVar.y0("audio/ac4");
                        aVar.T(2);
                        aVar.z0(i13);
                        aVar.n0(this.f99997c);
                        aVar.w0(this.f99998d);
                        C7272n P11 = aVar.P();
                        this.f100007m = P11;
                        this.f100001g.a(P11);
                    }
                    this.f100008n = c11.f18566b;
                    this.f100006l = (c11.f18567c * 1000000) / this.f100007m.f69103H;
                    c8050c2.R(0);
                    this.f100001g.e(16, c8050c2);
                    this.f100002h = 2;
                }
            } else if (i11 == 2) {
                int min2 = Math.min(c8050c.a(), this.f100008n - this.f100003i);
                this.f100001g.e(min2, c8050c);
                int i14 = this.f100003i + min2;
                this.f100003i = i14;
                if (i14 == this.f100008n) {
                    G10.a.h(this.f100009o != -9223372036854775807L);
                    this.f100001g.b(this.f100009o, 1, this.f100008n, 0, null);
                    this.f100009o += this.f100006l;
                    this.f100002h = 0;
                }
            }
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100009o = j11;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100000f = dVar.b();
        this.f100001g = rVar.track(dVar.c(), 1);
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
    }
}

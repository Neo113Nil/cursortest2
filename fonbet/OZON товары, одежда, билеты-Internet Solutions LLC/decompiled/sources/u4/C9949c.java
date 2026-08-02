package u4;

import N3.C3651b;
import N3.M;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import java.util.Objects;
import m3.C8049B;
import m3.C8050C;
import u4.J;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9949c implements InterfaceC9958l {

    /* renamed from: a, reason: collision with root package name */
    private final C8049B f99978a;

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f99979b;

    /* renamed from: c, reason: collision with root package name */
    private final String f99980c;

    /* renamed from: d, reason: collision with root package name */
    private final int f99981d;

    /* renamed from: e, reason: collision with root package name */
    private final String f99982e;

    /* renamed from: f, reason: collision with root package name */
    private String f99983f;

    /* renamed from: g, reason: collision with root package name */
    private M f99984g;

    /* renamed from: h, reason: collision with root package name */
    private int f99985h;

    /* renamed from: i, reason: collision with root package name */
    private int f99986i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f99987j;

    /* renamed from: k, reason: collision with root package name */
    private long f99988k;

    /* renamed from: l, reason: collision with root package name */
    private C7272n f99989l;

    /* renamed from: m, reason: collision with root package name */
    private int f99990m;

    /* renamed from: n, reason: collision with root package name */
    private long f99991n;

    public C9949c(String str) {
        this(null, 0, str);
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f99985h = 0;
        this.f99986i = 0;
        this.f99987j = false;
        this.f99991n = -9223372036854775807L;
    }

    @Override // u4.InterfaceC9958l
    public final void c(C8050C c8050c) {
        G10.a.i(this.f99984g);
        while (c8050c.a() > 0) {
            int i11 = this.f99985h;
            C8050C c8050c2 = this.f99979b;
            if (i11 == 0) {
                while (true) {
                    if (c8050c.a() <= 0) {
                        break;
                    }
                    if (this.f99987j) {
                        int E11 = c8050c.E();
                        if (E11 == 119) {
                            this.f99987j = false;
                            this.f99985h = 1;
                            c8050c2.e()[0] = 11;
                            c8050c2.e()[1] = 119;
                            this.f99986i = 2;
                            break;
                        }
                        this.f99987j = E11 == 11;
                    } else {
                        this.f99987j = c8050c.E() == 11;
                    }
                }
            } else if (i11 == 1) {
                byte[] e11 = c8050c2.e();
                int min = Math.min(c8050c.a(), 128 - this.f99986i);
                c8050c.n(this.f99986i, min, e11);
                int i12 = this.f99986i + min;
                this.f99986i = i12;
                if (i12 == 128) {
                    C8049B c8049b = this.f99978a;
                    c8049b.n(0);
                    C3651b.a d11 = C3651b.d(c8049b);
                    C7272n c7272n = this.f99989l;
                    int i13 = d11.f18552b;
                    int i14 = d11.f18553c;
                    String str = d11.f18551a;
                    if (c7272n == null || i14 != c7272n.f69102G || i13 != c7272n.f69103H || !Objects.equals(str, c7272n.f69127o)) {
                        C7272n.a aVar = new C7272n.a();
                        aVar.j0(this.f99983f);
                        aVar.W(this.f99982e);
                        aVar.y0(str);
                        aVar.T(i14);
                        aVar.z0(i13);
                        aVar.n0(this.f99980c);
                        aVar.w0(this.f99981d);
                        int i15 = d11.f18556f;
                        aVar.t0(i15);
                        if ("audio/ac3".equals(str)) {
                            aVar.S(i15);
                        }
                        C7272n P11 = aVar.P();
                        this.f99989l = P11;
                        this.f99984g.a(P11);
                    }
                    this.f99990m = d11.f18554d;
                    this.f99988k = (d11.f18555e * 1000000) / this.f99989l.f69103H;
                    c8050c2.R(0);
                    this.f99984g.e(UserVerificationMethods.USER_VERIFY_PATTERN, c8050c2);
                    this.f99985h = 2;
                }
            } else if (i11 == 2) {
                int min2 = Math.min(c8050c.a(), this.f99990m - this.f99986i);
                this.f99984g.e(min2, c8050c);
                int i16 = this.f99986i + min2;
                this.f99986i = i16;
                if (i16 == this.f99990m) {
                    G10.a.h(this.f99991n != -9223372036854775807L);
                    this.f99984g.b(this.f99991n, 1, this.f99990m, 0, null);
                    this.f99991n += this.f99988k;
                    this.f99985h = 0;
                }
            }
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f99991n = j11;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f99983f = dVar.b();
        this.f99984g = rVar.track(dVar.c(), 1);
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
    }

    public C9949c(String str, int i11, String str2) {
        C8049B c8049b = new C8049B(UserVerificationMethods.USER_VERIFY_PATTERN, new byte[UserVerificationMethods.USER_VERIFY_PATTERN]);
        this.f99978a = c8049b;
        this.f99979b = new C8050C(c8049b.f74257a);
        this.f99985h = 0;
        this.f99991n = -9223372036854775807L;
        this.f99980c = str;
        this.f99981d = i11;
        this.f99982e = str2;
    }
}

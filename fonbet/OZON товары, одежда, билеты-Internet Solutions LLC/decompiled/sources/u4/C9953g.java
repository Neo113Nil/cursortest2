package u4;

import N3.C3659j;
import N3.H;
import N3.InterfaceC3665p;
import java.io.IOException;
import m3.C8049B;
import m3.C8050C;
import u4.J;

/* renamed from: u4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9953g implements InterfaceC3665p {

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f100012c;

    /* renamed from: d, reason: collision with root package name */
    private final C8049B f100013d;

    /* renamed from: e, reason: collision with root package name */
    private N3.r f100014e;

    /* renamed from: f, reason: collision with root package name */
    private long f100015f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f100017h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f100018i;

    /* renamed from: a, reason: collision with root package name */
    private final C9954h f100010a = new C9954h(0, null, "audio/mp4a-latm", true);

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f100011b = new C8050C(2048);

    /* renamed from: g, reason: collision with root package name */
    private long f100016g = -1;

    public C9953g() {
        C8050C c8050c = new C8050C(10);
        this.f100012c = c8050c;
        byte[] e11 = c8050c.e();
        this.f100013d = new C8049B(e11.length, e11);
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f100017h = false;
        this.f100010a.b();
        this.f100015f = j12;
    }

    @Override // N3.InterfaceC3665p
    public final void b(N3.r rVar) {
        this.f100014e = rVar;
        this.f100010a.e(rVar, new J.d(0, 1));
        rVar.endTracks();
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(N3.q qVar) throws IOException {
        C3659j c3659j = (C3659j) qVar;
        int i11 = 0;
        while (true) {
            C8050C c8050c = this.f100012c;
            c3659j.d(c8050c.e(), 0, 10, false);
            c8050c.R(0);
            if (c8050c.H() != 4801587) {
                break;
            }
            c8050c.S(3);
            int D11 = c8050c.D();
            i11 += D11 + 10;
            c3659j.i(D11, false);
        }
        c3659j.e();
        c3659j.i(i11, false);
        if (this.f100016g == -1) {
            this.f100016g = i11;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        do {
            C8050C c8050c2 = this.f100012c;
            c3659j.d(c8050c2.e(), 0, 2, false);
            c8050c2.R(0);
            if ((c8050c2.L() & 65526) == 65520) {
                i13++;
                if (i13 >= 4 && i14 > 188) {
                    return true;
                }
                c3659j.d(c8050c2.e(), 0, 4, false);
                C8049B c8049b = this.f100013d;
                c8049b.n(14);
                int h11 = c8049b.h(13);
                if (h11 <= 6) {
                    i12++;
                    c3659j.e();
                    c3659j.i(i12, false);
                } else {
                    c3659j.i(h11 - 6, false);
                    i14 += h11;
                }
            } else {
                i12++;
                c3659j.e();
                c3659j.i(i12, false);
            }
            i13 = 0;
            i14 = 0;
        } while (i12 - i11 < 8192);
        return false;
    }

    @Override // N3.InterfaceC3665p
    public final int f(N3.q qVar, N3.G g10) throws IOException {
        G10.a.i(this.f100014e);
        C3659j c3659j = (C3659j) qVar;
        c3659j.getLength();
        C8050C c8050c = this.f100011b;
        int read = c3659j.read(c8050c.e(), 0, 2048);
        boolean z11 = read == -1;
        if (!this.f100018i) {
            this.f100014e.seekMap(new H.b(-9223372036854775807L));
            this.f100018i = true;
        }
        if (z11) {
            return -1;
        }
        c8050c.R(0);
        c8050c.Q(read);
        boolean z12 = this.f100017h;
        C9954h c9954h = this.f100010a;
        if (!z12) {
            c9954h.d(4, this.f100015f);
            this.f100017h = true;
        }
        c9954h.c(c8050c);
        return 0;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}

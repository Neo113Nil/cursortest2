package u4;

import N3.M;
import j3.C7272n;
import m3.C8050C;
import u4.J;

/* loaded from: classes8.dex */
public final class q implements InterfaceC9958l {

    /* renamed from: b, reason: collision with root package name */
    private M f100195b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f100196c;

    /* renamed from: e, reason: collision with root package name */
    private int f100198e;

    /* renamed from: f, reason: collision with root package name */
    private int f100199f;

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f100194a = new C8050C(10);

    /* renamed from: d, reason: collision with root package name */
    private long f100197d = -9223372036854775807L;

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100196c = false;
        this.f100197d = -9223372036854775807L;
    }

    @Override // u4.InterfaceC9958l
    public final void c(C8050C c8050c) {
        G10.a.i(this.f100195b);
        if (this.f100196c) {
            int a11 = c8050c.a();
            int i11 = this.f100199f;
            if (i11 < 10) {
                int min = Math.min(a11, 10 - i11);
                byte[] e11 = c8050c.e();
                int f7 = c8050c.f();
                C8050C c8050c2 = this.f100194a;
                System.arraycopy(e11, f7, c8050c2.e(), this.f100199f, min);
                if (this.f100199f + min == 10) {
                    c8050c2.R(0);
                    if (73 != c8050c2.E() || 68 != c8050c2.E() || 51 != c8050c2.E()) {
                        m3.s.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f100196c = false;
                        return;
                    } else {
                        c8050c2.S(3);
                        this.f100198e = c8050c2.D() + 10;
                    }
                }
            }
            int min2 = Math.min(a11, this.f100198e - this.f100199f);
            this.f100195b.e(min2, c8050c);
            this.f100199f += min2;
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f100196c = true;
        this.f100197d = j11;
        this.f100198e = 0;
        this.f100199f = 0;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        M track = rVar.track(dVar.c(), 5);
        this.f100195b = track;
        C7272n.a aVar = new C7272n.a();
        aVar.j0(dVar.b());
        aVar.W("video/mp2t");
        aVar.y0("application/id3");
        track.a(aVar.P());
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
        int i11;
        G10.a.i(this.f100195b);
        if (this.f100196c && (i11 = this.f100198e) != 0 && this.f100199f == i11) {
            G10.a.h(this.f100197d != -9223372036854775807L);
            this.f100195b.b(this.f100197d, 1, this.f100198e, 0, null);
            this.f100196c = false;
        }
    }
}

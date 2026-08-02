package u4;

import N3.C3651b;
import N3.C3659j;
import N3.H;
import N3.InterfaceC3665p;
import java.io.IOException;
import m3.C8050C;
import u4.J;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9948b implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final C9949c f99975a = new C9949c("audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f99976b = new C8050C(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f99977c;

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f99977c = false;
        this.f99975a.b();
    }

    @Override // N3.InterfaceC3665p
    public final void b(N3.r rVar) {
        this.f99975a.e(rVar, new J.d(0, 1));
        rVar.endTracks();
        rVar.seekMap(new H.b(-9223372036854775807L));
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(N3.q qVar) throws IOException {
        C3659j c3659j;
        C8050C c8050c = new C8050C(10);
        int i11 = 0;
        while (true) {
            c3659j = (C3659j) qVar;
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
        int i12 = 0;
        int i13 = i11;
        while (true) {
            c3659j.d(c8050c.e(), 0, 6, false);
            c8050c.R(0);
            if (c8050c.L() != 2935) {
                c3659j.e();
                i13++;
                if (i13 - i11 >= 8192) {
                    break;
                }
                c3659j.i(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                int e11 = C3651b.e(c8050c.e());
                if (e11 == -1) {
                    break;
                }
                c3659j.i(e11 - 6, false);
            }
        }
        return false;
    }

    @Override // N3.InterfaceC3665p
    public final int f(N3.q qVar, N3.G g10) throws IOException {
        C8050C c8050c = this.f99976b;
        int read = ((C3659j) qVar).read(c8050c.e(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        c8050c.R(0);
        c8050c.Q(read);
        boolean z11 = this.f99977c;
        C9949c c9949c = this.f99975a;
        if (!z11) {
            c9949c.d(4, 0L);
            this.f99977c = true;
        }
        c9949c.c(c8050c);
        return 0;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}

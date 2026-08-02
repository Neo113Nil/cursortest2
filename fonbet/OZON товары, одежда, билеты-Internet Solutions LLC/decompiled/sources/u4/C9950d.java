package u4;

import N3.C3659j;
import N3.H;
import N3.InterfaceC3665p;
import java.io.IOException;
import m3.C8050C;
import u4.J;

/* renamed from: u4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9950d implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final C9951e f99992a = new C9951e(null, 0, "audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f99993b = new C8050C(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f99994c;

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f99994c = false;
        this.f99992a.b();
    }

    @Override // N3.InterfaceC3665p
    public final void b(N3.r rVar) {
        this.f99992a.e(rVar, new J.d(0, 1));
        rVar.endTracks();
        rVar.seekMap(new H.b(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        return false;
     */
    @Override // N3.InterfaceC3665p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(N3.q qVar) throws IOException {
        C3659j c3659j;
        int i11;
        C8050C c8050c = new C8050C(10);
        int i12 = 0;
        while (true) {
            c3659j = (C3659j) qVar;
            c3659j.d(c8050c.e(), 0, 10, false);
            c8050c.R(0);
            if (c8050c.H() != 4801587) {
                break;
            }
            c8050c.S(3);
            int D11 = c8050c.D();
            i12 += D11 + 10;
            c3659j.i(D11, false);
        }
        c3659j.e();
        c3659j.i(i12, false);
        int i13 = 0;
        int i14 = i12;
        while (true) {
            int i15 = 7;
            c3659j.d(c8050c.e(), 0, 7, false);
            c8050c.R(0);
            int L11 = c8050c.L();
            if (L11 == 44096 || L11 == 44097) {
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                byte[] e11 = c8050c.e();
                if (e11.length < 7) {
                    i11 = -1;
                } else {
                    int i16 = ((e11[2] & 255) << 8) | (e11[3] & 255);
                    if (i16 == 65535) {
                        i16 = ((e11[4] & 255) << 16) | ((e11[5] & 255) << 8) | (e11[6] & 255);
                    } else {
                        i15 = 4;
                    }
                    if (L11 == 44097) {
                        i15 += 2;
                    }
                    i11 = i16 + i15;
                }
                if (i11 == -1) {
                    break;
                }
                c3659j.i(i11 - 7, false);
            } else {
                c3659j.e();
                i14++;
                if (i14 - i12 >= 8192) {
                    break;
                }
                c3659j.i(i14, false);
                i13 = 0;
            }
        }
    }

    @Override // N3.InterfaceC3665p
    public final int f(N3.q qVar, N3.G g10) throws IOException {
        C8050C c8050c = this.f99993b;
        int read = ((C3659j) qVar).read(c8050c.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        c8050c.R(0);
        c8050c.Q(read);
        boolean z11 = this.f99994c;
        C9951e c9951e = this.f99992a;
        if (!z11) {
            c9951e.d(4, 0L);
            this.f99994c = true;
        }
        c9951e.c(c8050c);
        return 0;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}

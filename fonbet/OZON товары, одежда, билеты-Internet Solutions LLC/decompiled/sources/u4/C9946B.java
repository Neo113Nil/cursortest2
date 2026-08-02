package u4;

import N3.C3659j;
import N3.H;
import N3.InterfaceC3665p;
import android.util.SparseArray;
import io.sentry.W2;
import java.io.IOException;
import m3.C8049B;
import m3.C8050C;
import m3.C8056I;
import u4.J;

/* renamed from: u4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9946B implements InterfaceC3665p {

    /* renamed from: e, reason: collision with root package name */
    private boolean f99899e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f99900f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f99901g;

    /* renamed from: h, reason: collision with root package name */
    private long f99902h;

    /* renamed from: i, reason: collision with root package name */
    private y f99903i;

    /* renamed from: j, reason: collision with root package name */
    private N3.r f99904j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f99905k;

    /* renamed from: a, reason: collision with root package name */
    private final C8056I f99895a = new C8056I(0);

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f99897c = new C8050C(4096);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f99896b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private final z f99898d = new z();

    /* renamed from: u4.B$a */
    /* loaded from: classes8.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9958l f99906a;

        /* renamed from: b, reason: collision with root package name */
        private final C8056I f99907b;

        /* renamed from: c, reason: collision with root package name */
        private final C8049B f99908c = new C8049B(64, new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f99909d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f99910e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f99911f;

        /* renamed from: g, reason: collision with root package name */
        private long f99912g;

        public a(InterfaceC9958l interfaceC9958l, C8056I c8056i) {
            this.f99906a = interfaceC9958l;
            this.f99907b = c8056i;
        }

        public final void a(C8050C c8050c) throws j3.v {
            C8049B c8049b = this.f99908c;
            c8050c.n(0, 3, c8049b.f74257a);
            c8049b.n(0);
            c8049b.p(8);
            this.f99909d = c8049b.g();
            this.f99910e = c8049b.g();
            c8049b.p(6);
            c8050c.n(0, c8049b.h(8), c8049b.f74257a);
            c8049b.n(0);
            this.f99912g = 0L;
            if (this.f99909d) {
                c8049b.p(4);
                c8049b.p(1);
                c8049b.p(1);
                long h11 = (c8049b.h(3) << 30) | (c8049b.h(15) << 15) | c8049b.h(15);
                c8049b.p(1);
                boolean z11 = this.f99911f;
                C8056I c8056i = this.f99907b;
                if (!z11 && this.f99910e) {
                    c8049b.p(4);
                    c8049b.p(1);
                    c8049b.p(1);
                    c8049b.p(1);
                    c8056i.b((c8049b.h(3) << 30) | (c8049b.h(15) << 15) | c8049b.h(15));
                    this.f99911f = true;
                }
                this.f99912g = c8056i.b(h11);
            }
            long j11 = this.f99912g;
            InterfaceC9958l interfaceC9958l = this.f99906a;
            interfaceC9958l.d(4, j11);
            interfaceC9958l.c(c8050c);
            interfaceC9958l.f(false);
        }

        public final void b() {
            this.f99911f = false;
            this.f99906a.b();
        }
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        C8056I c8056i = this.f99895a;
        int i11 = 0;
        boolean z11 = c8056i.f() == -9223372036854775807L;
        if (!z11) {
            long d11 = c8056i.d();
            z11 = (d11 == -9223372036854775807L || d11 == 0 || d11 == j12) ? false : true;
        }
        if (z11) {
            c8056i.h(j12);
        }
        y yVar = this.f99903i;
        if (yVar != null) {
            yVar.e(j12);
        }
        while (true) {
            SparseArray<a> sparseArray = this.f99896b;
            if (i11 >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i11).b();
            i11++;
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(N3.r rVar) {
        this.f99904j = rVar;
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(N3.q qVar) throws IOException {
        byte[] bArr = new byte[14];
        C3659j c3659j = (C3659j) qVar;
        c3659j.d(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c3659j.i(bArr[13] & 7, false);
            c3659j.d(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // N3.InterfaceC3665p
    public final int f(N3.q qVar, N3.G g10) throws IOException {
        InterfaceC9958l interfaceC9958l;
        G10.a.i(this.f99904j);
        C3659j c3659j = (C3659j) qVar;
        long length = c3659j.getLength();
        z zVar = this.f99898d;
        if (length != -1 && !zVar.d()) {
            return zVar.f(c3659j, g10);
        }
        if (!this.f99905k) {
            this.f99905k = true;
            if (zVar.b() != -9223372036854775807L) {
                y yVar = new y(zVar.c(), zVar.b(), length);
                this.f99903i = yVar;
                this.f99904j.seekMap(yVar.a());
            } else {
                this.f99904j.seekMap(new H.b(zVar.b()));
            }
        }
        y yVar2 = this.f99903i;
        if (yVar2 != null && yVar2.c()) {
            return this.f99903i.b(c3659j, g10);
        }
        c3659j.e();
        long f7 = length != -1 ? length - c3659j.f() : -1L;
        if (f7 != -1 && f7 < 4) {
            return -1;
        }
        C8050C c8050c = this.f99897c;
        if (!c3659j.d(c8050c.e(), 0, 4, true)) {
            return -1;
        }
        c8050c.R(0);
        int p11 = c8050c.p();
        if (p11 == 441) {
            return -1;
        }
        if (p11 == 442) {
            c3659j.d(c8050c.e(), 0, 10, false);
            c8050c.R(9);
            c3659j.m((c8050c.E() & 7) + 14, false);
            return 0;
        }
        if (p11 == 443) {
            c3659j.d(c8050c.e(), 0, 2, false);
            c8050c.R(0);
            c3659j.m(c8050c.L() + 6, false);
            return 0;
        }
        if (((p11 & (-256)) >> 8) != 1) {
            c3659j.m(1, false);
            return 0;
        }
        int i11 = p11 & 255;
        SparseArray<a> sparseArray = this.f99896b;
        a aVar = sparseArray.get(i11);
        if (!this.f99899e) {
            if (aVar == null) {
                if (i11 == 189) {
                    interfaceC9958l = new C9949c("video/mp2p");
                    this.f99900f = true;
                    this.f99902h = c3659j.getPosition();
                } else if ((p11 & 224) == 192) {
                    interfaceC9958l = new s();
                    this.f99900f = true;
                    this.f99902h = c3659j.getPosition();
                } else if ((p11 & 240) == 224) {
                    interfaceC9958l = new m();
                    this.f99901g = true;
                    this.f99902h = c3659j.getPosition();
                } else {
                    interfaceC9958l = null;
                }
                if (interfaceC9958l != null) {
                    interfaceC9958l.e(this.f99904j, new J.d(i11, 256));
                    aVar = new a(interfaceC9958l, this.f99895a);
                    sparseArray.put(i11, aVar);
                }
            }
            if (c3659j.getPosition() > ((this.f99900f && this.f99901g) ? this.f99902h + 8192 : W2.MAX_EVENT_SIZE_BYTES)) {
                this.f99899e = true;
                this.f99904j.endTracks();
            }
        }
        c3659j.d(c8050c.e(), 0, 2, false);
        c8050c.R(0);
        int L11 = c8050c.L() + 6;
        if (aVar == null) {
            c3659j.m(L11, false);
            return 0;
        }
        c8050c.O(L11);
        c3659j.b(c8050c.e(), 0, L11, false);
        c8050c.R(6);
        aVar.a(c8050c);
        c8050c.Q(c8050c.b());
        return 0;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}

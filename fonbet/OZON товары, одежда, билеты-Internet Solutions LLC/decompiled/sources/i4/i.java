package i4;

import N3.C3659j;
import N3.G;
import N3.H;
import N3.M;
import N3.r;
import i4.b;
import j3.C7272n;
import java.io.IOException;
import m3.C8050C;
import m3.N;

/* loaded from: classes8.dex */
abstract class i {

    /* renamed from: b, reason: collision with root package name */
    private M f65833b;

    /* renamed from: c, reason: collision with root package name */
    private r f65834c;

    /* renamed from: d, reason: collision with root package name */
    private g f65835d;

    /* renamed from: e, reason: collision with root package name */
    private long f65836e;

    /* renamed from: f, reason: collision with root package name */
    private long f65837f;

    /* renamed from: g, reason: collision with root package name */
    private long f65838g;

    /* renamed from: h, reason: collision with root package name */
    private int f65839h;

    /* renamed from: i, reason: collision with root package name */
    private int f65840i;

    /* renamed from: k, reason: collision with root package name */
    private long f65842k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f65843l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f65844m;

    /* renamed from: a, reason: collision with root package name */
    private final e f65832a = new e();

    /* renamed from: j, reason: collision with root package name */
    private a f65841j = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        C7272n f65845a;

        /* renamed from: b, reason: collision with root package name */
        b.a f65846b;
    }

    private static final class b implements g {
        @Override // i4.g
        public final long a(C3659j c3659j) {
            return -1L;
        }

        @Override // i4.g
        public final H b() {
            return new H.b(-9223372036854775807L);
        }

        @Override // i4.g
        public final void c(long j11) {
        }
    }

    protected final long a(long j11) {
        return (j11 * 1000000) / this.f65840i;
    }

    protected final long b(long j11) {
        return (this.f65840i * j11) / 1000000;
    }

    final void c(r rVar, M m11) {
        this.f65834c = rVar;
        this.f65833b = m11;
        h(true);
    }

    protected void d(long j11) {
        this.f65838g = j11;
    }

    protected abstract long e(C8050C c8050c);

    final int f(C3659j c3659j, G g10) throws IOException {
        G10.a.i(this.f65833b);
        int i11 = N.f74289a;
        int i12 = this.f65839h;
        e eVar = this.f65832a;
        if (i12 == 0) {
            while (eVar.d(c3659j)) {
                this.f65842k = c3659j.getPosition() - this.f65837f;
                if (!g(eVar.c(), this.f65837f, this.f65841j)) {
                    C7272n c7272n = this.f65841j.f65845a;
                    this.f65840i = c7272n.f69103H;
                    if (!this.f65844m) {
                        this.f65833b.a(c7272n);
                        this.f65844m = true;
                    }
                    b.a aVar = this.f65841j.f65846b;
                    if (aVar != null) {
                        this.f65835d = aVar;
                    } else if (c3659j.getLength() == -1) {
                        this.f65835d = new b();
                    } else {
                        f b11 = eVar.b();
                        this.f65835d = new C7006a(this, this.f65837f, c3659j.getLength(), b11.f65825d + b11.f65826e, b11.f65823b, (b11.f65822a & 4) != 0);
                    }
                    this.f65839h = 2;
                    eVar.f();
                    return 0;
                }
                this.f65837f = c3659j.getPosition();
            }
            this.f65839h = 3;
            return -1;
        }
        if (i12 == 1) {
            c3659j.m((int) this.f65837f, false);
            this.f65839h = 2;
            return 0;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        long a11 = this.f65835d.a(c3659j);
        if (a11 >= 0) {
            g10.f18501a = a11;
            return 1;
        }
        if (a11 < -1) {
            d(-(a11 + 2));
        }
        if (!this.f65843l) {
            H b12 = this.f65835d.b();
            G10.a.i(b12);
            this.f65834c.seekMap(b12);
            M m11 = this.f65833b;
            b12.getDurationUs();
            m11.getClass();
            this.f65843l = true;
        }
        if (this.f65842k <= 0 && !eVar.d(c3659j)) {
            this.f65839h = 3;
            return -1;
        }
        this.f65842k = 0L;
        C8050C c11 = eVar.c();
        long e11 = e(c11);
        if (e11 >= 0) {
            long j11 = this.f65838g;
            if (j11 + e11 >= this.f65836e) {
                long a12 = a(j11);
                this.f65833b.e(c11.i(), c11);
                this.f65833b.b(a12, 1, c11.i(), 0, null);
                this.f65836e = -1L;
            }
        }
        this.f65838g += e11;
        return 0;
    }

    protected abstract boolean g(C8050C c8050c, long j11, a aVar) throws IOException;

    protected void h(boolean z11) {
        if (z11) {
            this.f65841j = new a();
            this.f65837f = 0L;
            this.f65839h = 0;
        } else {
            this.f65839h = 1;
        }
        this.f65836e = -1L;
        this.f65838g = 0L;
    }

    final void i(long j11, long j12) {
        this.f65832a.e();
        if (j11 == 0) {
            h(!this.f65843l);
            return;
        }
        if (this.f65839h != 0) {
            long b11 = b(j12);
            this.f65836e = b11;
            g gVar = this.f65835d;
            int i11 = N.f74289a;
            gVar.c(b11);
            this.f65839h = 2;
        }
    }
}

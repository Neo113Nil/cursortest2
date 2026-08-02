package o2;

import H1.C1176i;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import b1.C2338G;
import e1.AbstractC4134a;
import java.io.EOFException;
import o2.L;

/* renamed from: o2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5788h implements InterfaceC1183p {

    /* renamed from: m, reason: collision with root package name */
    public static final H1.u f59032m = new H1.u() { // from class: o2.g
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return C5788h.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f59033a;

    /* renamed from: b, reason: collision with root package name */
    public final C5789i f59034b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.J f59035c;

    /* renamed from: d, reason: collision with root package name */
    public final e1.J f59036d;

    /* renamed from: e, reason: collision with root package name */
    public final e1.I f59037e;

    /* renamed from: f, reason: collision with root package name */
    public H1.r f59038f;

    /* renamed from: g, reason: collision with root package name */
    public long f59039g;

    /* renamed from: h, reason: collision with root package name */
    public long f59040h;

    /* renamed from: i, reason: collision with root package name */
    public int f59041i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59042j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59043k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f59044l;

    public C5788h() {
        this(0);
    }

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new C5788h()};
    }

    private static int e(int i10, long j10) {
        return (int) ((i10 * 8000000) / j10);
    }

    private H1.J h(long j10, boolean z10) {
        return new C1176i(j10, this.f59040h, e(this.f59041i, this.f59034b.k()), this.f59041i, z10);
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f59043k = false;
        this.f59034b.b();
        this.f59039g = j11;
    }

    @Override // H1.InterfaceC1183p
    public void c(H1.r rVar) {
        this.f59038f = rVar;
        this.f59034b.d(rVar, new L.d(0, 1));
        rVar.s();
    }

    public final void d(InterfaceC1184q interfaceC1184q) {
        if (this.f59042j) {
            return;
        }
        this.f59041i = -1;
        interfaceC1184q.g();
        long j10 = 0;
        if (interfaceC1184q.getPosition() == 0) {
            l(interfaceC1184q);
        }
        int i10 = 0;
        int i11 = 0;
        while (interfaceC1184q.e(this.f59036d.f(), 0, 2, true)) {
            try {
                this.f59036d.b0(0);
                if (!C5789i.m(this.f59036d.U())) {
                    break;
                }
                if (!interfaceC1184q.e(this.f59036d.f(), 0, 4, true)) {
                    break;
                }
                this.f59037e.p(14);
                int h10 = this.f59037e.h(13);
                if (h10 <= 6) {
                    this.f59042j = true;
                    throw C2338G.a("Malformed ADTS stream", null);
                }
                j10 += h10;
                i11++;
                if (i11 != 1000 && interfaceC1184q.m(h10 - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i10 = i11;
        interfaceC1184q.g();
        if (i10 > 0) {
            this.f59041i = (int) (j10 / i10);
        } else {
            this.f59041i = -1;
        }
        this.f59042j = true;
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, H1.I i10) {
        AbstractC4134a.i(this.f59038f);
        long length = interfaceC1184q.getLength();
        int i11 = this.f59033a;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && length != -1)) {
            d(interfaceC1184q);
        }
        int read = interfaceC1184q.read(this.f59035c.f(), 0, 2048);
        boolean z10 = read == -1;
        i(length, z10);
        if (z10) {
            return -1;
        }
        this.f59035c.b0(0);
        this.f59035c.a0(read);
        if (!this.f59043k) {
            this.f59034b.e(this.f59039g, 4);
            this.f59043k = true;
        }
        this.f59034b.a(this.f59035c);
        return 0;
    }

    public final void i(long j10, boolean z10) {
        if (this.f59044l) {
            return;
        }
        boolean z11 = (this.f59033a & 1) != 0 && this.f59041i > 0;
        if (z11 && this.f59034b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f59034b.k() == -9223372036854775807L) {
            this.f59038f.q(new J.b(-9223372036854775807L));
        } else {
            this.f59038f.q(h(j10, (this.f59033a & 2) != 0));
        }
        this.f59044l = true;
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        int l10 = l(interfaceC1184q);
        int i10 = l10;
        int i11 = 0;
        int i12 = 0;
        do {
            interfaceC1184q.n(this.f59036d.f(), 0, 2);
            this.f59036d.b0(0);
            if (C5789i.m(this.f59036d.U())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                interfaceC1184q.n(this.f59036d.f(), 0, 4);
                this.f59037e.p(14);
                int h10 = this.f59037e.h(13);
                if (h10 <= 6) {
                    i10++;
                    interfaceC1184q.g();
                    interfaceC1184q.j(i10);
                } else {
                    interfaceC1184q.j(h10 - 6);
                    i12 += h10;
                }
            } else {
                i10++;
                interfaceC1184q.g();
                interfaceC1184q.j(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - l10 < 8192);
        return false;
    }

    public final int l(InterfaceC1184q interfaceC1184q) {
        int i10 = 0;
        while (true) {
            interfaceC1184q.n(this.f59036d.f(), 0, 10);
            this.f59036d.b0(0);
            if (this.f59036d.P() != 4801587) {
                break;
            }
            this.f59036d.c0(3);
            int L10 = this.f59036d.L();
            i10 += L10 + 10;
            interfaceC1184q.j(L10);
        }
        interfaceC1184q.g();
        interfaceC1184q.j(i10);
        if (this.f59040h == -1) {
            this.f59040h = i10;
        }
        return i10;
    }

    public C5788h(int i10) {
        this.f59033a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f59034b = new C5789i(true, "audio/mp4a-latm");
        this.f59035c = new e1.J(2048);
        this.f59041i = -1;
        this.f59040h = -1L;
        e1.J j10 = new e1.J(10);
        this.f59036d = j10;
        this.f59037e = new e1.I(j10.f());
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}

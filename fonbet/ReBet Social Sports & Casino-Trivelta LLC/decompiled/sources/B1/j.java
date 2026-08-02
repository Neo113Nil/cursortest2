package B1;

import B1.f;
import H1.C1177j;
import H1.O;
import b1.AbstractC2335D;
import e1.J;
import h1.AbstractC4417m;
import h1.C4401D;
import h1.C4418n;
import h1.InterfaceC4411g;

/* loaded from: classes.dex */
public class j extends a {

    /* renamed from: n, reason: collision with root package name */
    public final int f593n;

    /* renamed from: o, reason: collision with root package name */
    public final long f594o;

    /* renamed from: p, reason: collision with root package name */
    public final f f595p;

    /* renamed from: q, reason: collision with root package name */
    public long f596q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f597r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f598s;

    public j(InterfaceC4411g interfaceC4411g, C4418n c4418n, androidx.media3.common.a aVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, f fVar) {
        super(interfaceC4411g, c4418n, aVar, i10, obj, j10, j11, j12, j13, j14);
        this.f593n = i11;
        this.f594o = j15;
        this.f595p = fVar;
    }

    @Override // D1.m.e
    public final void a() {
        c j10 = j();
        if (this.f596q == 0) {
            j10.b(this.f594o);
            f fVar = this.f595p;
            f.b l10 = l(j10);
            long j11 = this.f530k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f594o;
            long j13 = this.f531l;
            fVar.d(l10, j12, j13 != -9223372036854775807L ? j13 - this.f594o : -9223372036854775807L);
        }
        try {
            C4418n e10 = this.f557b.e(this.f596q);
            C4401D c4401d = this.f564i;
            C1177j c1177j = new C1177j(c4401d, e10.f47559f, c4401d.b(e10));
            do {
                try {
                    if (this.f597r) {
                        break;
                    }
                } finally {
                    this.f596q = c1177j.getPosition() - this.f557b.f47559f;
                }
            } while (this.f595p.a(c1177j));
            m(j10);
            this.f596q = c1177j.getPosition() - this.f557b.f47559f;
            n();
            AbstractC4417m.a(this.f564i);
            this.f598s = !this.f597r;
        } catch (Throwable th2) {
            n();
            AbstractC4417m.a(this.f564i);
            throw th2;
        }
    }

    @Override // D1.m.e
    public final void c() {
        this.f597r = true;
    }

    @Override // B1.m
    public long g() {
        return this.f605j + this.f593n;
    }

    @Override // B1.m
    public boolean h() {
        return this.f598s;
    }

    public final void m(c cVar) {
        if (AbstractC2335D.q(this.f559d.f20542n)) {
            androidx.media3.common.a aVar = this.f559d;
            int i10 = aVar.f20525M;
            if ((i10 <= 1 && aVar.f20526N <= 1) || i10 == -1 || aVar.f20526N == -1) {
                return;
            }
            O c10 = cVar.c(0, 4);
            androidx.media3.common.a aVar2 = this.f559d;
            int i11 = aVar2.f20525M * aVar2.f20526N;
            long j10 = (this.f563h - this.f562g) / i11;
            for (int i12 = 1; i12 < i11; i12++) {
                c10.a(new J(), 0);
                c10.g(i12 * j10, 0, 0, 0, null);
            }
        }
    }

    public void n() {
    }

    public f.b l(c cVar) {
        return cVar;
    }
}

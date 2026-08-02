package i4;

import N3.C3659j;
import N3.G;
import N3.InterfaceC3665p;
import N3.M;
import N3.q;
import N3.r;
import j3.v;
import java.io.IOException;
import m3.C8050C;

/* loaded from: classes.dex */
public final class d implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private r f65814a;

    /* renamed from: b, reason: collision with root package name */
    private i f65815b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f65816c;

    private boolean g(C3659j c3659j) throws IOException {
        f fVar = new f();
        if (fVar.a(c3659j, true) && (fVar.f65822a & 2) == 2) {
            int min = Math.min(fVar.f65826e, 8);
            C8050C c8050c = new C8050C(min);
            c3659j.d(c8050c.e(), 0, min, false);
            c8050c.R(0);
            if (b.j(c8050c)) {
                this.f65815b = new b();
                return true;
            }
            c8050c.R(0);
            if (j.j(c8050c)) {
                this.f65815b = new j();
                return true;
            }
            c8050c.R(0);
            if (h.k(c8050c)) {
                this.f65815b = new h();
                return true;
            }
        }
        return false;
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        i iVar = this.f65815b;
        if (iVar != null) {
            iVar.i(j11, j12);
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f65814a = rVar;
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        try {
            return g((C3659j) qVar);
        } catch (v unused) {
            return false;
        }
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        G10.a.i(this.f65814a);
        if (this.f65815b == null) {
            C3659j c3659j = (C3659j) qVar;
            if (!g(c3659j)) {
                throw v.a(null, "Failed to determine bitstream type");
            }
            c3659j.e();
        }
        if (!this.f65816c) {
            M track = this.f65814a.track(0, 1);
            this.f65814a.endTracks();
            this.f65815b.c(this.f65814a, track);
            this.f65816c = true;
        }
        return this.f65815b.f((C3659j) qVar, g10);
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}

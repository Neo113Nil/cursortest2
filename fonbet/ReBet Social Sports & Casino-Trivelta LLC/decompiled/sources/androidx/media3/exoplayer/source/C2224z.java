package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.D;
import e1.AbstractC4134a;
import java.io.IOException;
import m1.o1;

/* renamed from: androidx.media3.exoplayer.source.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2224z implements C, C.a {

    /* renamed from: a, reason: collision with root package name */
    public final D.b f21895a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21896b;

    /* renamed from: c, reason: collision with root package name */
    public final D1.b f21897c;

    /* renamed from: d, reason: collision with root package name */
    public D f21898d;

    /* renamed from: e, reason: collision with root package name */
    public C f21899e;

    /* renamed from: f, reason: collision with root package name */
    public C.a f21900f;

    /* renamed from: g, reason: collision with root package name */
    public a f21901g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21902h;

    /* renamed from: i, reason: collision with root package name */
    public long f21903i = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.source.z$a */
    public interface a {
        void a(D.b bVar, IOException iOException);

        void b(D.b bVar);
    }

    public C2224z(D.b bVar, D1.b bVar2, long j10) {
        this.f21895a = bVar;
        this.f21897c = bVar2;
        this.f21896b = j10;
    }

    public void a(D.b bVar) {
        long q10 = q(this.f21896b);
        C c10 = ((D) AbstractC4134a.e(this.f21898d)).c(bVar, this.f21897c, q10);
        this.f21899e = c10;
        if (this.f21900f != null) {
            c10.t(this, q10);
        }
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        C c10 = this.f21899e;
        return c10 != null && c10.b(kVar);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        return ((C) e1.Z.i(this.f21899e)).d();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        C c10 = this.f21899e;
        return c10 != null && c10.e();
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        return ((C) e1.Z.i(this.f21899e)).f(j10, o1Var);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        return ((C) e1.Z.i(this.f21899e)).g();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        ((C) e1.Z.i(this.f21899e)).h(j10);
    }

    @Override // androidx.media3.exoplayer.source.C.a
    public void i(C c10) {
        ((C.a) e1.Z.i(this.f21900f)).i(this);
        a aVar = this.f21901g;
        if (aVar != null) {
            aVar.b(this.f21895a);
        }
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        return ((C) e1.Z.i(this.f21899e)).k(j10);
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(androidx.media3.exoplayer.trackselection.y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f21903i;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f21896b) ? j10 : j11;
        this.f21903i = -9223372036854775807L;
        return ((C) e1.Z.i(this.f21899e)).m(yVarArr, zArr, c0VarArr, zArr2, j12);
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        return ((C) e1.Z.i(this.f21899e)).n();
    }

    public long o() {
        return this.f21903i;
    }

    public long p() {
        return this.f21896b;
    }

    public final long q(long j10) {
        long j11 = this.f21903i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
        try {
            C c10 = this.f21899e;
            if (c10 != null) {
                c10.r();
                return;
            }
            D d10 = this.f21898d;
            if (d10 != null) {
                d10.q();
            }
        } catch (IOException e10) {
            a aVar = this.f21901g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f21902h) {
                return;
            }
            this.f21902h = true;
            aVar.a(this.f21895a, e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.d0.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void j(C c10) {
        ((C.a) e1.Z.i(this.f21900f)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        this.f21900f = aVar;
        C c10 = this.f21899e;
        if (c10 != null) {
            c10.t(this, q(this.f21896b));
        }
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        return ((C) e1.Z.i(this.f21899e)).u();
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
        ((C) e1.Z.i(this.f21899e)).v(j10, z10);
    }

    public void w(long j10) {
        this.f21903i = j10;
    }

    public void x() {
        if (this.f21899e != null) {
            ((D) AbstractC4134a.e(this.f21898d)).f(this.f21899e);
        }
    }

    public void y(D d10) {
        AbstractC4134a.g(this.f21898d == null);
        this.f21898d = d10;
    }
}

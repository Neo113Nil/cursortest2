package t2;

import androidx.media3.exoplayer.source.D;
import b1.AbstractC2335D;
import e1.AbstractC4134a;
import t2.InterfaceC6383a;

/* renamed from: t2.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6419s0 extends androidx.media3.exoplayer.c {

    /* renamed from: A, reason: collision with root package name */
    public boolean f65531A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f65532B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f65533C;

    /* renamed from: r, reason: collision with root package name */
    public long f65534r;

    /* renamed from: s, reason: collision with root package name */
    public L0 f65535s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC6399i f65536t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f65537u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.media3.common.a f65538v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.media3.common.a f65539w;

    /* renamed from: x, reason: collision with root package name */
    public final j1 f65540x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC6383a.c f65541y;

    /* renamed from: z, reason: collision with root package name */
    public final k1.f f65542z;

    public AbstractC6419s0(int i10, j1 j1Var, InterfaceC6383a.c cVar) {
        super(i10);
        this.f65540x = j1Var;
        this.f65541y = cVar;
        this.f65542z = new k1.f(0);
    }

    public final boolean A0(k1.f fVar) {
        int o02 = o0(V(), fVar, 0);
        if (o02 == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (o02 != -4) {
            return false;
        }
        fVar.q();
        if (fVar.i()) {
            return true;
        }
        this.f65540x.a(f(), fVar.f54110f);
        return true;
    }

    public final boolean B0() {
        androidx.media3.common.a aVar = this.f65538v;
        if (aVar != null && !this.f65532B) {
            return true;
        }
        if (aVar == null) {
            m1.O0 V10 = V();
            if (o0(V10, this.f65542z, 2) != -5) {
                return false;
            }
            androidx.media3.common.a y02 = y0((androidx.media3.common.a) AbstractC4134a.e(V10.f56121b));
            this.f65538v = y02;
            x0(y02);
            this.f65532B = this.f65541y.b(this.f65538v, 3);
        }
        if (this.f65532B) {
            if (k1.g(this.f65538v.f20543o) == 2 && !r0()) {
                return false;
            }
            v0(this.f65538v);
            this.f65532B = false;
        }
        return true;
    }

    public abstract boolean C0(k1.f fVar);

    @Override // androidx.media3.exoplayer.c, androidx.media3.exoplayer.p
    public m1.Q0 P() {
        return this.f65540x;
    }

    @Override // androidx.media3.exoplayer.q
    public int a(androidx.media3.common.a aVar) {
        return androidx.media3.exoplayer.q.r(AbstractC2335D.k(aVar.f20543o) == f() ? 4 : 0);
    }

    @Override // androidx.media3.exoplayer.p
    public boolean b() {
        return this.f65537u;
    }

    @Override // androidx.media3.exoplayer.p
    public boolean c() {
        return true;
    }

    @Override // androidx.media3.exoplayer.c
    public void e0(boolean z10, boolean z11) {
        this.f65540x.a(f(), 0L);
    }

    @Override // androidx.media3.exoplayer.p
    public void h(long j10, long j11) {
        try {
            if (this.f65531A && !b() && B0()) {
                if (this.f65536t != null) {
                    do {
                    } while ((r0() ? s0() : false) | u0());
                } else if (r0()) {
                    while (t0()) {
                    }
                }
            }
        } catch (C6427w0 e10) {
            this.f65531A = false;
            this.f65541y.d(e10);
        }
    }

    @Override // androidx.media3.exoplayer.c
    public void j0() {
        InterfaceC6399i interfaceC6399i = this.f65536t;
        if (interfaceC6399i != null) {
            interfaceC6399i.release();
        }
    }

    @Override // androidx.media3.exoplayer.c
    public void k0() {
        this.f65531A = true;
    }

    @Override // androidx.media3.exoplayer.c
    public void l0() {
        this.f65531A = false;
    }

    @Override // androidx.media3.exoplayer.c
    public void m0(androidx.media3.common.a[] aVarArr, long j10, long j11, D.b bVar) {
        this.f65534r = j10;
    }

    public final boolean r0() {
        if (this.f65535s != null) {
            return true;
        }
        if (this.f65539w == null) {
            if (this.f65536t == null || k1.g(this.f65538v.f20543o) != 1) {
                this.f65539w = z0(this.f65538v);
            } else {
                androidx.media3.common.a outputFormat = this.f65536t.getOutputFormat();
                if (outputFormat == null) {
                    return false;
                }
                this.f65539w = z0(outputFormat);
            }
        }
        L0 a10 = this.f65541y.a(this.f65539w);
        if (a10 == null) {
            return false;
        }
        this.f65535s = a10;
        return true;
    }

    public abstract boolean s0();

    public final boolean t0() {
        k1.f f10 = this.f65535s.f();
        if (f10 == null) {
            return false;
        }
        if (!this.f65533C) {
            if (!A0(f10)) {
                return false;
            }
            if (C0(f10)) {
                return true;
            }
            this.f65533C = true;
        }
        boolean i10 = f10.i();
        if (!this.f65535s.a()) {
            return false;
        }
        this.f65533C = false;
        this.f65537u = i10;
        return !i10;
    }

    public final boolean u0() {
        if (!this.f65536t.f(this.f65542z) || !A0(this.f65542z)) {
            return false;
        }
        if (C0(this.f65542z)) {
            return true;
        }
        w0(this.f65542z);
        this.f65536t.c(this.f65542z);
        return true;
    }

    public abstract void v0(androidx.media3.common.a aVar);

    public void w0(k1.f fVar) {
    }

    public void x0(androidx.media3.common.a aVar) {
    }

    public androidx.media3.common.a y0(androidx.media3.common.a aVar) {
        return aVar;
    }

    public androidx.media3.common.a z0(androidx.media3.common.a aVar) {
        return aVar;
    }
}

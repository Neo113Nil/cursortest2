package androidx.media3.exoplayer;

import androidx.media3.exoplayer.q;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.c0;
import b1.AbstractC2346O;
import e1.AbstractC4134a;
import e1.InterfaceC4143j;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import m1.I;
import m1.O0;
import m1.Q0;
import m1.k1;
import n1.G1;

/* loaded from: classes.dex */
public abstract class c implements p, q {

    /* renamed from: b, reason: collision with root package name */
    public final int f20909b;

    /* renamed from: d, reason: collision with root package name */
    public k1 f20911d;

    /* renamed from: e, reason: collision with root package name */
    public int f20912e;

    /* renamed from: f, reason: collision with root package name */
    public G1 f20913f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC4143j f20914g;

    /* renamed from: h, reason: collision with root package name */
    public int f20915h;

    /* renamed from: i, reason: collision with root package name */
    public c0 f20916i;

    /* renamed from: j, reason: collision with root package name */
    public long f20917j;

    /* renamed from: k, reason: collision with root package name */
    public long f20918k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20920m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20921n;

    /* renamed from: p, reason: collision with root package name */
    public D.b f20923p;

    /* renamed from: q, reason: collision with root package name */
    public q.a f20924q;
    private androidx.media3.common.a[] streamFormats;

    /* renamed from: a, reason: collision with root package name */
    public final Object f20908a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final O0 f20910c = new O0();

    /* renamed from: l, reason: collision with root package name */
    public long f20919l = Long.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC2346O f20922o = AbstractC2346O.f24345a;

    public c(int i10) {
        this.f20909b = i10;
    }

    @Override // androidx.media3.exoplayer.p
    public final void C(AbstractC2346O abstractC2346O) {
        if (Objects.equals(this.f20922o, abstractC2346O)) {
            return;
        }
        this.f20922o = abstractC2346O;
        n0(abstractC2346O);
    }

    @Override // androidx.media3.exoplayer.p
    public final void D(int i10, G1 g12, InterfaceC4143j interfaceC4143j) {
        this.f20912e = i10;
        this.f20913f = g12;
        this.f20914g = interfaceC4143j;
        f0();
    }

    @Override // androidx.media3.exoplayer.p
    public final q F() {
        return this;
    }

    @Override // androidx.media3.exoplayer.q
    public final void G(q.a aVar) {
        synchronized (this.f20908a) {
            this.f20924q = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.q
    public int K() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.p
    public final void L(k1 k1Var, androidx.media3.common.a[] aVarArr, c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, D.b bVar) {
        AbstractC4134a.g(this.f20915h == 0);
        this.f20911d = k1Var;
        this.f20923p = bVar;
        this.f20915h = 1;
        e0(z10, z11);
        u(aVarArr, c0Var, j11, j12, bVar);
        p0(j11, z10);
    }

    @Override // androidx.media3.exoplayer.p
    public final c0 M() {
        return this.f20916i;
    }

    @Override // androidx.media3.exoplayer.p
    public final long N() {
        return this.f20919l;
    }

    @Override // androidx.media3.exoplayer.p
    public final void O(long j10) {
        p0(j10, false);
    }

    @Override // androidx.media3.exoplayer.p
    public Q0 P() {
        return null;
    }

    public final I R(Throwable th2, androidx.media3.common.a aVar, int i10) {
        return S(th2, aVar, false, i10);
    }

    public final I S(Throwable th2, androidx.media3.common.a aVar, boolean z10, int i10) {
        int i11;
        if (aVar != null && !this.f20921n) {
            this.f20921n = true;
            try {
                i11 = q.Q(a(aVar));
            } catch (I unused) {
            } finally {
                this.f20921n = false;
            }
            return I.d(th2, getName(), W(), aVar, i11, this.f20923p, z10, i10);
        }
        i11 = 4;
        return I.d(th2, getName(), W(), aVar, i11, this.f20923p, z10, i10);
    }

    public final InterfaceC4143j T() {
        return (InterfaceC4143j) AbstractC4134a.e(this.f20914g);
    }

    public final k1 U() {
        return (k1) AbstractC4134a.e(this.f20911d);
    }

    public final O0 V() {
        this.f20910c.a();
        return this.f20910c;
    }

    public final int W() {
        return this.f20912e;
    }

    public final long X() {
        return this.f20918k;
    }

    public final G1 Y() {
        return (G1) AbstractC4134a.e(this.f20913f);
    }

    public final androidx.media3.common.a[] Z() {
        return (androidx.media3.common.a[]) AbstractC4134a.e(this.streamFormats);
    }

    public final long a0() {
        return this.f20917j;
    }

    public final AbstractC2346O b0() {
        return this.f20922o;
    }

    public final boolean c0() {
        return i() ? this.f20920m : ((c0) AbstractC4134a.e(this.f20916i)).c();
    }

    public void d0() {
    }

    @Override // androidx.media3.exoplayer.p
    public final void disable() {
        AbstractC4134a.g(this.f20915h == 1);
        this.f20910c.a();
        this.f20915h = 0;
        this.f20916i = null;
        this.streamFormats = null;
        this.f20920m = false;
        d0();
        this.f20923p = null;
    }

    public void e0(boolean z10, boolean z11) {
    }

    @Override // androidx.media3.exoplayer.p, androidx.media3.exoplayer.q
    public final int f() {
        return this.f20909b;
    }

    public void f0() {
    }

    @Override // androidx.media3.exoplayer.q
    public final void g() {
        synchronized (this.f20908a) {
            this.f20924q = null;
        }
    }

    public void g0(long j10, boolean z10) {
    }

    @Override // androidx.media3.exoplayer.p
    public final int getState() {
        return this.f20915h;
    }

    public void h0() {
    }

    @Override // androidx.media3.exoplayer.p
    public final boolean i() {
        return this.f20919l == Long.MIN_VALUE;
    }

    public final void i0() {
        q.a aVar;
        synchronized (this.f20908a) {
            aVar = this.f20924q;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void j0() {
    }

    public void k0() {
    }

    public void l0() {
    }

    @Override // androidx.media3.exoplayer.p
    public final void m() {
        this.f20920m = true;
    }

    public void m0(androidx.media3.common.a[] aVarArr, long j10, long j11, D.b bVar) {
    }

    public final int o0(O0 o02, k1.f fVar, int i10) {
        int s10 = ((c0) AbstractC4134a.e(this.f20916i)).s(o02, fVar, i10);
        if (s10 != -4) {
            if (s10 == -5) {
                androidx.media3.common.a aVar = (androidx.media3.common.a) AbstractC4134a.e(o02.f56121b);
                if (aVar.f20548t != LongCompanionObject.MAX_VALUE) {
                    o02.f56121b = aVar.b().C0(aVar.f20548t + this.f20917j).P();
                }
            }
            return s10;
        }
        if (fVar.i()) {
            this.f20919l = Long.MIN_VALUE;
            return this.f20920m ? -4 : -3;
        }
        long j10 = fVar.f54110f + this.f20917j;
        fVar.f54110f = j10;
        this.f20919l = Math.max(this.f20919l, j10);
        return s10;
    }

    public final void p0(long j10, boolean z10) {
        this.f20920m = false;
        this.f20918k = j10;
        this.f20919l = j10;
        g0(j10, z10);
    }

    public int q0(long j10) {
        return ((c0) AbstractC4134a.e(this.f20916i)).q(j10 - this.f20917j);
    }

    @Override // androidx.media3.exoplayer.p
    public final void release() {
        AbstractC4134a.g(this.f20915h == 0);
        h0();
    }

    @Override // androidx.media3.exoplayer.p
    public final void reset() {
        AbstractC4134a.g(this.f20915h == 0);
        this.f20910c.a();
        j0();
    }

    @Override // androidx.media3.exoplayer.p
    public final void start() {
        AbstractC4134a.g(this.f20915h == 1);
        this.f20915h = 2;
        k0();
    }

    @Override // androidx.media3.exoplayer.p
    public final void stop() {
        AbstractC4134a.g(this.f20915h == 2);
        this.f20915h = 1;
        l0();
    }

    @Override // androidx.media3.exoplayer.o.b
    public void t(int i10, Object obj) {
    }

    @Override // androidx.media3.exoplayer.p
    public final void u(androidx.media3.common.a[] aVarArr, c0 c0Var, long j10, long j11, D.b bVar) {
        AbstractC4134a.g(!this.f20920m);
        this.f20916i = c0Var;
        this.f20923p = bVar;
        if (this.f20919l == Long.MIN_VALUE) {
            this.f20919l = j10;
        }
        this.streamFormats = aVarArr;
        this.f20917j = j11;
        m0(aVarArr, j10, j11, bVar);
    }

    @Override // androidx.media3.exoplayer.p
    public final void v() {
        ((c0) AbstractC4134a.e(this.f20916i)).a();
    }

    @Override // androidx.media3.exoplayer.p
    public final boolean y() {
        return this.f20920m;
    }

    public void n0(AbstractC2346O abstractC2346O) {
    }
}

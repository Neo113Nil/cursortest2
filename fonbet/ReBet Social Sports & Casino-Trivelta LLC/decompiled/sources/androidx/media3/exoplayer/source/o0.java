package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.D;
import b1.AbstractC2346O;
import h1.InterfaceC4403F;

/* loaded from: classes.dex */
public abstract class o0 extends AbstractC2207h {

    /* renamed from: l, reason: collision with root package name */
    public static final Void f21841l = null;

    /* renamed from: k, reason: collision with root package name */
    public final D f21842k;

    public o0(D d10) {
        this.f21842k = d10;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h, androidx.media3.exoplayer.source.AbstractC2200a
    public final void D(InterfaceC4403F interfaceC4403F) {
        super.D(interfaceC4403F);
        V();
    }

    public D.b M(D.b bVar) {
        return bVar;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final D.b H(Void r12, D.b bVar) {
        return M(bVar);
    }

    public long O(long j10, D.b bVar) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long I(Void r12, long j10, D.b bVar) {
        return O(j10, bVar);
    }

    public int Q(int i10) {
        return i10;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int J(Void r12, int i10) {
        return Q(i10);
    }

    public abstract void S(AbstractC2346O abstractC2346O);

    @Override // androidx.media3.exoplayer.source.AbstractC2207h
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void K(Void r12, D d10, AbstractC2346O abstractC2346O) {
        S(abstractC2346O);
    }

    public final void U() {
        L(f21841l, this.f21842k);
    }

    public void V() {
        U();
    }

    @Override // androidx.media3.exoplayer.source.D
    public b1.z d() {
        return this.f21842k.d();
    }

    @Override // androidx.media3.exoplayer.source.D
    public void n(b1.z zVar) {
        this.f21842k.n(zVar);
    }

    @Override // androidx.media3.exoplayer.source.D
    public boolean r() {
        return this.f21842k.r();
    }

    @Override // androidx.media3.exoplayer.source.D
    public AbstractC2346O s() {
        return this.f21842k.s();
    }
}

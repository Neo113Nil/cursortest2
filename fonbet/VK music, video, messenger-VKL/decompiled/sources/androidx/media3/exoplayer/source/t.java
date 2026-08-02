package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import xsna.ewo0;
import xsna.kr10;
import xsna.mjp0;
import xsna.y2r0;

/* compiled from: WrappingMediaSource.java */
/* loaded from: classes12.dex */
public abstract class t extends c<Void> {
    public final i k;

    public t(i iVar) {
        this.k = iVar;
    }

    public abstract void A(ewo0 ewo0Var);

    public void B() {
        y(null, this.k);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final kr10 f() {
        return this.k.f();
    }

    @Override // androidx.media3.exoplayer.source.i
    @Nullable
    public final ewo0 i() {
        return this.k.i();
    }

    @Override // androidx.media3.exoplayer.source.i
    public void l(kr10 kr10Var) {
        this.k.l(kr10Var);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final boolean n() {
        return this.k.n();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r(@Nullable mjp0 mjp0Var) {
        this.j = mjp0Var;
        this.i = y2r0.o(null);
        B();
    }

    @Override // androidx.media3.exoplayer.source.c
    @Nullable
    public final i.b u(Void r1, i.b bVar) {
        return z(bVar);
    }

    @Override // androidx.media3.exoplayer.source.c
    public final long v(Object obj, long j) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final int w(Void r1, int i) {
        return i;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void x(Object obj, a aVar, ewo0 ewo0Var) {
        A(ewo0Var);
    }

    @Nullable
    public i.b z(i.b bVar) {
        return bVar;
    }
}

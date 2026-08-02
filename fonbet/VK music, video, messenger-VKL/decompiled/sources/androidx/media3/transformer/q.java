package androidx.media3.transformer;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.i;
import androidx.media3.transformer.a;
import xsna.cq10;
import xsna.g0h0;
import xsna.io20;
import xsna.slp0;
import xsna.w8s;

/* compiled from: ExoAssetLoaderBaseRenderer.java */
/* loaded from: classes12.dex */
public abstract class q extends androidx.media3.exoplayer.a {
    public final a.c A;
    public final DecoderInputBuffer B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long t;
    public g0h0 u;
    public e v;
    public boolean w;
    public androidx.media3.common.a x;
    public androidx.media3.common.a y;
    public final slp0 z;

    public q(int i, slp0 slp0Var, a.c cVar) {
        super(i);
        this.z = slp0Var;
        this.A = cVar;
        this.B = new DecoderInputBuffer(0);
    }

    public final boolean C() throws ExportException {
        if (this.u != null) {
            return true;
        }
        if (this.y == null) {
            if (this.v != null && c0.c(this.x.n) == 1) {
                i iVar = (i) this.v;
                iVar.g(false);
                androidx.media3.common.a aVar = iVar.j;
                if (aVar != null) {
                    this.y = I(aVar);
                }
                return false;
            }
            this.y = I(this.x);
        }
        g0h0 b = this.A.b(this.y);
        if (b != null) {
            this.u = b;
            return true;
        }
        return false;
    }

    public abstract boolean D() throws ExportException;

    public abstract void E(androidx.media3.common.a aVar) throws ExportException;

    public final boolean J(DecoderInputBuffer decoderInputBuffer) {
        w8s w8sVar = this.d;
        w8sVar.a();
        int B = B(w8sVar, decoderInputBuffer, 0);
        if (B == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (B != -4) {
            return false;
        }
        decoderInputBuffer.h();
        if (decoderInputBuffer.b(4)) {
            return true;
        }
        this.z.a(this.c, decoderInputBuffer.g);
        return true;
    }

    public final boolean K() throws ExportException {
        androidx.media3.common.a aVar = this.x;
        if (aVar == null || this.D) {
            if (aVar == null) {
                w8s w8sVar = this.d;
                w8sVar.a();
                if (B(w8sVar, this.B, 2) == -5) {
                    androidx.media3.common.a aVar2 = w8sVar.b;
                    aVar2.getClass();
                    androidx.media3.common.a H = H(aVar2);
                    this.x = H;
                    G(H);
                    this.D = this.A.d(3, this.x);
                }
                return false;
            }
            if (this.D) {
                if (c0.c(this.x.n) != 2 || C()) {
                    E(this.x);
                    this.D = false;
                }
                return false;
            }
        }
        return true;
    }

    public abstract boolean L(DecoderInputBuffer decoderInputBuffer);

    @Override // androidx.media3.exoplayer.k
    public final int a(androidx.media3.common.a aVar) {
        return androidx.media3.exoplayer.k.f(io20.i(aVar.n) == this.c ? 4 : 0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j
    public final cq10 getMediaClock() {
        return this.z;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j
    public final boolean isEnded() {
        return this.w;
    }

    @Override // androidx.media3.exoplayer.j
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.j
    public final void render(long j, long j2) {
        boolean z;
        boolean D;
        boolean z2;
        try {
            if (this.C && !this.w && K()) {
                if (this.v != null) {
                    do {
                        D = C() ? D() : false;
                        e eVar = this.v;
                        DecoderInputBuffer decoderInputBuffer = this.B;
                        if (((i) eVar).f(decoderInputBuffer) && J(decoderInputBuffer)) {
                            if (!L(decoderInputBuffer)) {
                                F(decoderInputBuffer);
                                ((i) this.v).h(decoderInputBuffer);
                            }
                            z2 = true;
                        }
                        z2 = false;
                    } while (D | z2);
                    return;
                }
                if (C()) {
                    do {
                        DecoderInputBuffer e = this.u.e();
                        if (e != null) {
                            if (!this.E) {
                                if (J(e)) {
                                    if (L(e)) {
                                        z = true;
                                    } else {
                                        this.E = true;
                                    }
                                }
                            }
                            boolean b = e.b(4);
                            if (this.u.h()) {
                                this.E = false;
                                this.w = b;
                                z = !b;
                            }
                        }
                        z = false;
                    } while (z);
                }
            }
        } catch (ExportException e2) {
            this.C = false;
            this.A.a(e2);
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void t(boolean z, boolean z2) {
        this.z.a(this.c, 0L);
    }

    @Override // androidx.media3.exoplayer.a
    public final void w() {
        e eVar = this.v;
        if (eVar != null) {
            ((i) eVar).i();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void x() {
        this.C = true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void y() {
        this.C = false;
    }

    @Override // androidx.media3.exoplayer.a
    public final void z(androidx.media3.common.a[] aVarArr, long j, long j2, i.b bVar) {
        this.t = j;
    }

    public void F(DecoderInputBuffer decoderInputBuffer) {
    }

    public void G(androidx.media3.common.a aVar) {
    }

    public androidx.media3.common.a H(androidx.media3.common.a aVar) {
        return aVar;
    }

    public androidx.media3.common.a I(androidx.media3.common.a aVar) {
        return aVar;
    }
}

package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.source.i;
import java.io.IOException;
import java.util.Objects;
import xsna.cq10;
import xsna.dvf;
import xsna.ewo0;
import xsna.fxc0;
import xsna.m0h0;
import xsna.w8s;
import xsna.wyf0;
import xsna.x1b0;

/* compiled from: BaseRenderer.java */
/* loaded from: classes12.dex */
public abstract class a implements j, k {
    public final int c;

    @Nullable
    public wyf0 e;
    public int f;
    public x1b0 g;
    public dvf h;
    public int i;

    @Nullable
    public m0h0 j;

    @Nullable
    public androidx.media3.common.a[] k;
    public long l;
    public long m;
    public boolean o;
    public boolean p;

    @Nullable
    public i.b r;

    @Nullable
    public k.a s;
    public final Object b = new Object();
    public final w8s d = new w8s();
    public long n = Long.MIN_VALUE;
    public ewo0 q = ewo0.a;

    public a(int i) {
        this.c = i;
    }

    public final int B(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i) {
        m0h0 m0h0Var = this.j;
        m0h0Var.getClass();
        int b = m0h0Var.b(w8sVar, decoderInputBuffer, i);
        if (b == -4) {
            if (decoderInputBuffer.b(4)) {
                this.n = Long.MIN_VALUE;
                return this.o ? -4 : -3;
            }
            long j = decoderInputBuffer.g + this.l;
            decoderInputBuffer.g = j;
            this.n = Math.max(this.n, j);
            return b;
        }
        if (b == -5) {
            androidx.media3.common.a aVar = w8sVar.b;
            aVar.getClass();
            long j2 = aVar.s;
            if (j2 != Long.MAX_VALUE) {
                a.C0043a a = aVar.a();
                a.r = j2 + this.l;
                w8sVar.b = new androidx.media3.common.a(a);
            }
        }
        return b;
    }

    @Override // androidx.media3.exoplayer.k
    public final void c() {
        synchronized (this.b) {
            this.s = null;
        }
    }

    @Override // androidx.media3.exoplayer.j
    public final void d(long j, boolean z) throws ExoPlaybackException {
        this.o = false;
        this.m = j;
        this.n = j;
        if (!z) {
            m0h0 m0h0Var = this.j;
            m0h0Var.getClass();
            z = m0h0Var.skipData(j - this.l) != 0;
        }
        u(j, false, z);
    }

    @Override // androidx.media3.exoplayer.j
    public final void disable() {
        fxc0.z(this.i == 1);
        this.d.a();
        this.i = 0;
        this.j = null;
        this.k = null;
        this.o = false;
        s();
        this.r = null;
    }

    @Override // androidx.media3.exoplayer.j
    public final long e() {
        return this.n;
    }

    @Override // androidx.media3.exoplayer.j
    public final void g(int i, x1b0 x1b0Var, dvf dvfVar) {
        this.f = i;
        this.g = x1b0Var;
        this.h = dvfVar;
    }

    @Override // androidx.media3.exoplayer.j
    @Nullable
    public cq10 getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.j
    public final int getState() {
        return this.i;
    }

    @Override // androidx.media3.exoplayer.j
    @Nullable
    public final m0h0 getStream() {
        return this.j;
    }

    @Override // androidx.media3.exoplayer.j, androidx.media3.exoplayer.k
    public final int getTrackType() {
        return this.c;
    }

    @Override // androidx.media3.exoplayer.j
    public final boolean hasReadStreamToEnd() {
        return this.n == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.j
    public final void i(androidx.media3.common.a[] aVarArr, m0h0 m0h0Var, long j, long j2, i.b bVar) throws ExoPlaybackException {
        fxc0.z(!this.o);
        this.j = m0h0Var;
        this.r = bVar;
        if (this.n == Long.MIN_VALUE) {
            this.n = j;
        }
        this.k = aVarArr;
        this.l = j2;
        z(aVarArr, j, j2, bVar);
    }

    @Override // androidx.media3.exoplayer.j
    public final boolean isCurrentStreamFinal() {
        return this.o;
    }

    @Override // androidx.media3.exoplayer.j
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.j
    public final void j(ewo0 ewo0Var) {
        if (Objects.equals(this.q, ewo0Var)) {
            return;
        }
        this.q = ewo0Var;
        A();
    }

    @Override // androidx.media3.exoplayer.j
    public final void k(wyf0 wyf0Var, androidx.media3.common.a[] aVarArr, m0h0 m0h0Var, boolean z, boolean z2, long j, long j2, i.b bVar) throws ExoPlaybackException {
        fxc0.z(this.i == 0);
        this.e = wyf0Var;
        this.r = bVar;
        this.i = 1;
        t(z, z2);
        i(aVarArr, m0h0Var, j, j2, bVar);
        this.o = false;
        this.m = j;
        this.n = j;
        u(j, z, true);
    }

    @Override // androidx.media3.exoplayer.j
    public final void maybeThrowStreamError() throws IOException {
        m0h0 m0h0Var = this.j;
        m0h0Var.getClass();
        m0h0Var.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.k
    public final void p(k.a aVar) {
        synchronized (this.b) {
            this.s = aVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExoPlaybackException r(Exception exc, @Nullable androidx.media3.common.a aVar, boolean z, int i) {
        int i2;
        if (aVar != null && !this.p) {
            this.p = true;
            try {
                i2 = a(aVar) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.p = false;
            }
            return new ExoPlaybackException(1, exc, null, i, getName(), this.f, aVar, aVar != null ? 4 : i2, this.r, z);
        }
        i2 = 4;
        return new ExoPlaybackException(1, exc, null, i, getName(), this.f, aVar, aVar != null ? 4 : i2, this.r, z);
    }

    @Override // androidx.media3.exoplayer.j
    public final void release() {
        fxc0.z(this.i == 0);
        v();
    }

    @Override // androidx.media3.exoplayer.j
    public final void reset() {
        fxc0.z(this.i == 0);
        this.d.a();
        w();
    }

    @Override // androidx.media3.exoplayer.j
    public final void setCurrentStreamFinal() {
        this.o = true;
    }

    @Override // androidx.media3.exoplayer.j
    public final void start() throws ExoPlaybackException {
        fxc0.z(this.i == 1);
        this.i = 2;
        x();
    }

    @Override // androidx.media3.exoplayer.j
    public final void stop() {
        fxc0.z(this.i == 2);
        this.i = 1;
        y();
    }

    @Override // androidx.media3.exoplayer.k
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    public void A() {
    }

    @Override // androidx.media3.exoplayer.j
    public final a getCapabilities() {
        return this;
    }

    public void s() {
    }

    public void v() {
    }

    public void w() {
    }

    public void x() throws ExoPlaybackException {
    }

    public void y() {
    }

    @Override // androidx.media3.exoplayer.i.b
    public void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
    }

    public void t(boolean z, boolean z2) throws ExoPlaybackException {
    }

    public void u(long j, boolean z, boolean z2) throws ExoPlaybackException {
    }

    public void z(androidx.media3.common.a[] aVarArr, long j, long j2, i.b bVar) throws ExoPlaybackException {
    }
}

package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import xsna.d7q;
import xsna.m0h0;
import xsna.o3i0;
import xsna.qfp0;
import xsna.xu1;
import xsna.y2r0;

/* compiled from: MaskingMediaPeriod.java */
/* loaded from: classes12.dex */
public final class f implements h, h.a {
    public final i.b b;
    public final long c;
    public final xu1 d;
    public i e;
    public h f;

    @Nullable
    public h.a g;
    public boolean h;
    public long i = C.TIME_UNSET;

    public f(i.b bVar, xu1 xu1Var, long j) {
        this.b = bVar;
        this.d = xu1Var;
        this.c = j;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long a(long j, o3i0 o3i0Var) {
        h hVar = this.f;
        String str = y2r0.a;
        return hVar.a(j, o3i0Var);
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final void b(h hVar) {
        h.a aVar = this.g;
        String str = y2r0.a;
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public final void d(h hVar) {
        h.a aVar = this.g;
        String str = y2r0.a;
        aVar.d(this);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void discardBuffer(long j, boolean z) {
        h hVar = this.f;
        String str = y2r0.a;
        hVar.discardBuffer(j, z);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(h.a aVar, long j) {
        this.g = aVar;
        h hVar = this.f;
        if (hVar != null) {
            long j2 = this.i;
            if (j2 == C.TIME_UNSET) {
                j2 = this.c;
            }
            hVar.e(this, j2);
        }
    }

    public final void f(i.b bVar) {
        long j = this.i;
        if (j == C.TIME_UNSET) {
            j = this.c;
        }
        i iVar = this.e;
        iVar.getClass();
        h m = iVar.m(bVar, this.d, j);
        this.f = m;
        if (this.g != null) {
            m.e(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        h hVar = this.f;
        String str = y2r0.a;
        return hVar.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        h hVar = this.f;
        String str = y2r0.a;
        return hVar.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final qfp0 getTrackGroups() {
        h hVar = this.f;
        String str = y2r0.a;
        return hVar.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long h(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
        long j2 = this.i;
        long j3 = (j2 == C.TIME_UNSET || j != this.c) ? j : j2;
        this.i = C.TIME_UNSET;
        h hVar = this.f;
        String str = y2r0.a;
        return hVar.h(d7qVarArr, zArr, m0h0VarArr, zArr2, j3);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        h hVar = this.f;
        return hVar != null && hVar.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        h hVar = this.f;
        return hVar != null && hVar.k(fVar);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void maybeThrowPrepareError() throws IOException {
        try {
            h hVar = this.f;
            if (hVar != null) {
                hVar.maybeThrowPrepareError();
                return;
            }
            i iVar = this.e;
            if (iVar != null) {
                iVar.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long readDiscontinuity() {
        h hVar = this.f;
        String str = y2r0.a;
        return hVar.readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        h hVar = this.f;
        String str = y2r0.a;
        hVar.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long seekToUs(long j) {
        h hVar = this.f;
        String str = y2r0.a;
        return hVar.seekToUs(j);
    }
}

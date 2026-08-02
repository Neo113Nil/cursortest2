package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.source.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import xsna.d7q;
import xsna.m0h0;
import xsna.o3i0;
import xsna.qfp0;
import xsna.w8s;

/* compiled from: TimeOffsetMediaPeriod.java */
/* loaded from: classes12.dex */
public final class s implements h, h.a {
    public final h b;
    public final long c;
    public h.a d;

    /* compiled from: TimeOffsetMediaPeriod.java */
    public static final class a implements m0h0 {
        public final m0h0 b;
        public final long c;

        public a(m0h0 m0h0Var, long j) {
            this.b = m0h0Var;
            this.c = j;
        }

        @Override // xsna.m0h0
        public final int b(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i) {
            int b = this.b.b(w8sVar, decoderInputBuffer, i);
            if (b == -4) {
                decoderInputBuffer.g += this.c;
            }
            return b;
        }

        @Override // xsna.m0h0
        public final boolean isReady() {
            return this.b.isReady();
        }

        @Override // xsna.m0h0
        public final void maybeThrowError() throws IOException {
            this.b.maybeThrowError();
        }

        @Override // xsna.m0h0
        public final int skipData(long j) {
            return this.b.skipData(j - this.c);
        }
    }

    public s(h hVar, long j) {
        this.b = hVar;
        this.c = j;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long a(long j, o3i0 o3i0Var) {
        long j2 = this.c;
        return this.b.a(j - j2, o3i0Var) + j2;
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final void b(h hVar) {
        h.a aVar = this.d;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final List c(ArrayList arrayList) {
        return this.b.c(arrayList);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public final void d(h hVar) {
        h.a aVar = this.d;
        aVar.getClass();
        aVar.d(this);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void discardBuffer(long j, boolean z) {
        this.b.discardBuffer(j - this.c, z);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(h.a aVar, long j) {
        this.d = aVar;
        this.b.e(this, j - this.c);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.c;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.c;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final qfp0 getTrackGroups() {
        return this.b.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long h(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
        m0h0[] m0h0VarArr2 = new m0h0[m0h0VarArr.length];
        int i = 0;
        while (true) {
            m0h0 m0h0Var = null;
            if (i >= m0h0VarArr.length) {
                break;
            }
            a aVar = (a) m0h0VarArr[i];
            if (aVar != null) {
                m0h0Var = aVar.b;
            }
            m0h0VarArr2[i] = m0h0Var;
            i++;
        }
        h hVar = this.b;
        long j2 = this.c;
        long h = hVar.h(d7qVarArr, zArr, m0h0VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < m0h0VarArr.length; i2++) {
            m0h0 m0h0Var2 = m0h0VarArr2[i2];
            if (m0h0Var2 == null) {
                m0h0VarArr[i2] = null;
            } else {
                m0h0 m0h0Var3 = m0h0VarArr[i2];
                if (m0h0Var3 == null || ((a) m0h0Var3).b != m0h0Var2) {
                    m0h0VarArr[i2] = new a(m0h0Var2, j2);
                }
            }
        }
        return h + j2;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        return this.b.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        f.a aVar = new f.a();
        long j = fVar.a;
        aVar.b = fVar.b;
        aVar.c = fVar.c;
        aVar.a = j - this.c;
        return this.b.k(new androidx.media3.exoplayer.f(aVar));
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void maybeThrowPrepareError() throws IOException {
        this.b.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long readDiscontinuity() {
        long readDiscontinuity = this.b.readDiscontinuity();
        return readDiscontinuity == C.TIME_UNSET ? C.TIME_UNSET : readDiscontinuity + this.c;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        this.b.reevaluateBuffer(j - this.c);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long seekToUs(long j) {
        long j2 = this.c;
        return this.b.seekToUs(j - j2) + j2;
    }
}

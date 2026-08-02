package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import xsna.d7q;
import xsna.io20;
import xsna.m0h0;
import xsna.o3i0;
import xsna.qfp0;
import xsna.w8s;
import xsna.y2r0;

/* compiled from: ClippingMediaPeriod.java */
/* loaded from: classes12.dex */
public final class b implements h, h.a {
    public final h b;

    @Nullable
    public h.a c;
    public a[] d = new a[0];
    public long e;
    public long f;
    public long g;
    public long h;

    @Nullable
    public ClippingMediaSource.IllegalClippingException i;

    /* compiled from: ClippingMediaPeriod.java */
    public final class a implements m0h0 {
        public final m0h0 b;
        public boolean c;

        public a(m0h0 m0h0Var) {
            this.b = m0h0Var;
        }

        @Override // xsna.m0h0
        public final int b(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i) {
            b bVar = b.this;
            if (bVar.f()) {
                return -3;
            }
            if (this.c) {
                decoderInputBuffer.b = 4;
                return -4;
            }
            long bufferedPositionUs = bVar.getBufferedPositionUs();
            int b = this.b.b(w8sVar, decoderInputBuffer, i);
            if (b != -5) {
                long j = bVar.h;
                if (j == Long.MIN_VALUE || ((b != -4 || decoderInputBuffer.g < j) && !(b == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.f))) {
                    return b;
                }
                decoderInputBuffer.c();
                decoderInputBuffer.b = 4;
                this.c = true;
                return -4;
            }
            androidx.media3.common.a aVar = w8sVar.b;
            aVar.getClass();
            int i2 = aVar.J;
            int i3 = aVar.I;
            if (i3 == 0 && i2 == 0) {
                return -5;
            }
            if (bVar.g != 0) {
                i3 = 0;
            }
            if (bVar.h != Long.MIN_VALUE) {
                i2 = 0;
            }
            a.C0043a a = aVar.a();
            a.H = i3;
            a.I = i2;
            w8sVar.b = new androidx.media3.common.a(a);
            return -5;
        }

        @Override // xsna.m0h0
        public final boolean isReady() {
            return !b.this.f() && this.b.isReady();
        }

        @Override // xsna.m0h0
        public final void maybeThrowError() throws IOException {
            this.b.maybeThrowError();
        }

        @Override // xsna.m0h0
        public final int skipData(long j) {
            if (b.this.f()) {
                return -3;
            }
            return this.b.skipData(j);
        }
    }

    public b(h hVar, boolean z, long j, long j2) {
        this.b = hVar;
        this.e = z ? j : -9223372036854775807L;
        this.f = C.TIME_UNSET;
        this.g = j;
        this.h = j2;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long a(long j, o3i0 o3i0Var) {
        long j2 = this.g;
        if (j == j2) {
            return j2;
        }
        long k = y2r0.k(o3i0Var.a, 0L, j - j2);
        long j3 = o3i0Var.b;
        long j4 = this.h;
        long k2 = y2r0.k(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (k != o3i0Var.a || k2 != o3i0Var.b) {
            o3i0Var = new o3i0(k, k2);
        }
        return this.b.a(j, o3i0Var);
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final void b(h hVar) {
        if (this.i != null) {
            return;
        }
        h.a aVar = this.c;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final List c(ArrayList arrayList) {
        return this.b.c(arrayList);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public final void d(h hVar) {
        h.a aVar = this.c;
        aVar.getClass();
        aVar.d(this);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void discardBuffer(long j, boolean z) {
        this.b.discardBuffer(j, z);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(h.a aVar, long j) {
        this.c = aVar;
        this.b.e(this, j);
    }

    public final boolean f() {
        return this.e != C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.h;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.h;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final qfp0 getTrackGroups() {
        return this.b.getTrackGroups();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // androidx.media3.exoplayer.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        this.d = new a[m0h0VarArr.length];
        m0h0[] m0h0VarArr2 = new m0h0[m0h0VarArr.length];
        for (int i2 = 0; i2 < m0h0VarArr.length; i2++) {
            a[] aVarArr = this.d;
            a aVar = (a) m0h0VarArr[i2];
            aVarArr[i2] = aVar;
            m0h0VarArr2[i2] = aVar != null ? aVar.b : null;
        }
        long h = this.b.h(d7qVarArr, zArr, m0h0VarArr2, zArr2, j);
        long j3 = this.h;
        long max = Math.max(h, j);
        if (j3 != Long.MIN_VALUE) {
            max = Math.min(max, j3);
        }
        if (f()) {
            if (h >= j) {
                if (h != 0) {
                    for (d7q d7qVar : d7qVarArr) {
                        if (d7qVar != null) {
                            androidx.media3.common.a selectedFormat = d7qVar.getSelectedFormat();
                            if (!io20.a(selectedFormat.n, selectedFormat.k)) {
                            }
                        }
                    }
                }
            }
            j2 = max;
            this.e = j2;
            for (i = 0; i < m0h0VarArr.length; i++) {
                m0h0 m0h0Var = m0h0VarArr2[i];
                if (m0h0Var == null) {
                    this.d[i] = null;
                } else {
                    a[] aVarArr2 = this.d;
                    a aVar2 = aVarArr2[i];
                    if (aVar2 == null || aVar2.b != m0h0Var) {
                        aVarArr2[i] = new a(m0h0Var);
                    }
                }
                m0h0VarArr[i] = this.d[i];
            }
            return max;
        }
        j2 = C.TIME_UNSET;
        this.e = j2;
        while (i < m0h0VarArr.length) {
        }
        return max;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        return this.b.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        return this.b.k(fVar);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void maybeThrowPrepareError() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.i;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.b.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long readDiscontinuity() {
        if (f()) {
            long j = this.e;
            this.e = C.TIME_UNSET;
            this.f = j;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != C.TIME_UNSET ? readDiscontinuity : j;
        }
        long readDiscontinuity2 = this.b.readDiscontinuity();
        if (readDiscontinuity2 != C.TIME_UNSET) {
            long j2 = this.g;
            long j3 = this.h;
            long max = Math.max(readDiscontinuity2, j2);
            if (j3 != Long.MIN_VALUE) {
                max = Math.min(max, j3);
            }
            if (max != this.f) {
                this.f = max;
                return max;
            }
        }
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        this.b.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long seekToUs(long j) {
        this.e = C.TIME_UNSET;
        for (a aVar : this.d) {
            if (aVar != null) {
                aVar.c = false;
            }
        }
        long seekToUs = this.b.seekToUs(j);
        long j2 = this.g;
        long j3 = this.h;
        long max = Math.max(seekToUs, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }
}

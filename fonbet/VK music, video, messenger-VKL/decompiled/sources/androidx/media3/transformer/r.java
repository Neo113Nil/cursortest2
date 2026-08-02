package androidx.media3.transformer;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.transformer.a;
import java.util.ArrayList;
import xsna.m6g;
import xsna.slp0;

/* compiled from: ExoAssetLoaderVideoRenderer.java */
/* loaded from: classes12.dex */
public final class r extends q {
    public final c F;
    public final int G;
    public final ArrayList H;

    @Nullable
    public final LogSessionId I;
    public int J;

    public r(c cVar, int i, slp0 slp0Var, a.c cVar2, @Nullable LogSessionId logSessionId) {
        super(2, slp0Var, cVar2);
        this.F = cVar;
        this.G = i;
        this.I = logSessionId;
        this.H = new ArrayList();
        this.J = -1;
    }

    @Override // androidx.media3.transformer.q
    public final boolean D() throws ExportException {
        if (((i) this.v).e()) {
            this.u.g();
            this.w = true;
            return false;
        }
        i iVar = (i) this.v;
        MediaCodec.BufferInfo bufferInfo = iVar.g(false) ? iVar.a : null;
        if (bufferInfo != null) {
            long j = bufferInfo.presentationTimeUs;
            long j2 = j - this.t;
            if (j2 >= 0) {
                ArrayList arrayList = this.H;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Long) arrayList.get(i)).longValue() == j) {
                        arrayList.remove(i);
                    }
                }
                if (this.u.f() != this.J && this.u.i(j2)) {
                    ((i) this.v).k(j2, true);
                    return true;
                }
            }
            ((i) this.v).j();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4.G == 1) goto L8;
     */
    @Override // androidx.media3.transformer.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(androidx.media3.common.a aVar) throws ExportException {
        this.u.getClass();
        boolean z = m6g.h(aVar.D);
        Surface b = this.u.b();
        b.getClass();
        i b2 = this.F.b(aVar, b, z, this.I);
        this.v = b2;
        this.J = b2.f;
    }

    @Override // androidx.media3.transformer.q
    public final void F(DecoderInputBuffer decoderInputBuffer) {
        long j = decoderInputBuffer.g;
        if (j < this.m) {
            this.H.add(Long.valueOf(j));
        }
    }

    @Override // androidx.media3.transformer.q
    public final androidx.media3.common.a H(androidx.media3.common.a aVar) {
        if (this.G != 3 || !m6g.h(aVar.D)) {
            return aVar;
        }
        a.C0043a a = aVar.a();
        a.C = m6g.h;
        return new androidx.media3.common.a(a);
    }

    @Override // androidx.media3.transformer.q
    public final androidx.media3.common.a I(androidx.media3.common.a aVar) {
        m6g m6gVar = aVar.D;
        if (m6gVar == null || !m6gVar.f()) {
            m6gVar = m6g.h;
        }
        if (this.G == 1 && m6g.h(m6gVar)) {
            m6gVar = m6g.h;
        }
        a.C0043a a = aVar.a();
        a.C = m6gVar;
        return new androidx.media3.common.a(a);
    }

    @Override // androidx.media3.transformer.q
    public final boolean L(DecoderInputBuffer decoderInputBuffer) {
        if (!decoderInputBuffer.b(4)) {
            decoderInputBuffer.e.getClass();
            if (this.v == null) {
                decoderInputBuffer.g -= this.t;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.j, androidx.media3.exoplayer.k
    public final String getName() {
        return "ExoAssetLoaderVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.j
    public final long o(long j, long j2) {
        if (this.i == 1) {
            return 1000000L;
        }
        int i = this.J;
        if (i == -1) {
            return 10000L;
        }
        return i * 2000;
    }

    @Override // androidx.media3.transformer.q
    public final void G(androidx.media3.common.a aVar) {
    }
}

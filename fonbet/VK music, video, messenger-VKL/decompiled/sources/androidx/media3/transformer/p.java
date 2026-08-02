package androidx.media3.transformer;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.transformer.a;
import java.nio.ByteBuffer;
import xsna.slp0;

/* compiled from: ExoAssetLoaderAudioRenderer.java */
/* loaded from: classes12.dex */
public final class p extends q {
    public final c F;

    @Nullable
    public final LogSessionId G;
    public boolean H;

    public p(c cVar, slp0 slp0Var, a.c cVar2, @Nullable LogSessionId logSessionId) {
        super(1, slp0Var, cVar2);
        this.F = cVar;
        this.G = logSessionId;
    }

    @Override // androidx.media3.transformer.q
    public final boolean D() throws ExportException {
        DecoderInputBuffer e = this.u.e();
        if (e != null) {
            if (!this.H) {
                if (((i) this.v).e()) {
                    ByteBuffer byteBuffer = e.e;
                    byteBuffer.getClass();
                    byteBuffer.limit(0);
                    e.a(4);
                    this.w = this.u.h();
                    return false;
                }
                ByteBuffer d = ((i) this.v).d();
                if (d != null) {
                    e.e(d.limit());
                    e.e.put(d).flip();
                    i iVar = (i) this.v;
                    MediaCodec.BufferInfo bufferInfo = iVar.g(false) ? iVar.a : null;
                    bufferInfo.getClass();
                    e.g = bufferInfo.presentationTimeUs;
                    e.b = bufferInfo.flags;
                    ((i) this.v).j();
                    this.H = true;
                }
            }
            if (this.u.h()) {
                this.H = false;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.transformer.q
    public final void E(androidx.media3.common.a aVar) throws ExportException {
        this.v = this.F.a(aVar, this.G);
    }

    @Override // androidx.media3.transformer.q
    public final boolean L(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.b(4)) {
            return false;
        }
        long j = decoderInputBuffer.g - this.t;
        decoderInputBuffer.g = j;
        if (this.v == null || j >= 0) {
            return false;
        }
        decoderInputBuffer.c();
        return true;
    }

    @Override // androidx.media3.exoplayer.j, androidx.media3.exoplayer.k
    public final String getName() {
        return "ExoAssetLoaderAudioRenderer";
    }
}

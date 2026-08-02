package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.video.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import xsna.b900;
import xsna.hq10;
import xsna.tjk;
import xsna.vrl;

/* compiled from: MediaCodecAdapter.java */
/* loaded from: classes12.dex */
public interface c {

    /* compiled from: MediaCodecAdapter.java */
    public static final class a {
        public final hq10 a;
        public final MediaFormat b;
        public final androidx.media3.common.a c;

        @Nullable
        public final Surface d;

        @Nullable
        public final MediaCrypto e;

        @Nullable
        public final b900 f;

        public a(hq10 hq10Var, MediaFormat mediaFormat, androidx.media3.common.a aVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable b900 b900Var) {
            this.a = hq10Var;
            this.b = mediaFormat;
            this.c = aVar;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = b900Var;
        }
    }

    /* compiled from: MediaCodecAdapter.java */
    public interface b {
        c a(a aVar) throws IOException;
    }

    void a(int i, int i2, int i3, long j);

    void b(int i, tjk tjkVar, long j, int i2);

    void c(c.e eVar, Handler handler);

    void d(int i);

    int e(MediaCodec.BufferInfo bufferInfo);

    void f(ArrayList arrayList);

    void flush();

    default boolean g(MediaCodecRenderer.a aVar) {
        return false;
    }

    @Nullable
    ByteBuffer getInputBuffer(int i);

    @Nullable
    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void h();

    void i(Surface surface);

    int j();

    void k(ArrayList arrayList);

    default void l(vrl vrlVar) {
        vrlVar.run();
    }

    void m(int i, long j);

    void release();

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);
}

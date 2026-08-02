package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.video.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import xsna.b900;
import xsna.fxc0;
import xsna.tjk;

/* compiled from: SynchronousMediaCodecAdapter.java */
/* loaded from: classes12.dex */
public final class f implements c {
    public final MediaCodec a;

    @Nullable
    public final b900 b;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    public static class a implements c.b {
        public static MediaCodec b(c.a aVar) throws IOException {
            String str = aVar.a.a;
            Trace.beginSection("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            return createByCodecName;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
        @Override // androidx.media3.exoplayer.mediacodec.c.b
        @SuppressLint({"WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final c a(c.a aVar) throws IOException {
            MediaCodec mediaCodec = null;
            try {
                mediaCodec = b(aVar);
                Trace.beginSection("configureCodec");
                Surface surface = aVar.d;
                mediaCodec.configure(aVar.b, surface, aVar.e, (surface == null && aVar.a.k && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodec.start();
                Trace.endSection();
                return new f(mediaCodec, aVar.f);
            } catch (IOException e) {
                e = e;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                if (mediaCodec != null) {
                }
                throw e;
            }
        }
    }

    public f(MediaCodec mediaCodec, b900 b900Var) {
        boolean addMediaCodec;
        this.a = mediaCodec;
        this.b = b900Var;
        if (Build.VERSION.SDK_INT < 35 || b900Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = b900Var.c;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        fxc0.z(b900Var.a.add(mediaCodec));
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void a(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void b(int i, tjk tjkVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, tjkVar.i, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void c(final c.e eVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: xsna.epn0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                c.e eVar2 = eVar;
                Handler handler2 = eVar2.b;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                } else {
                    eVar2.a(j);
                }
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void d(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int e(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void f(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void flush() {
        this.a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    @Nullable
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    @Nullable
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void h() {
        this.a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void i(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int j() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void k(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void m(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void release() {
        b900 b900Var = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && b900Var != null) {
                b900Var.a(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && b900Var != null) {
                b900Var.a(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setVideoScalingMode(int i) {
        this.a.setVideoScalingMode(i);
    }
}

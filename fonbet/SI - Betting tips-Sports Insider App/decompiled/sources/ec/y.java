package ec;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.c1;
import io.sentry.b5;
import io.sentry.b6;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9064a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9065b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9066c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9067d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9068e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9069f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9070g;

    /* renamed from: h, reason: collision with root package name */
    public Object f9071h;

    public y(b6 options, io.sentry.android.replay.video.a muxerConfig) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.f9064a = options;
        this.f9065b = muxerConfig;
        gf.l lVar = gf.l.f10028b;
        gf.i a7 = gf.k.a(lVar, io.sentry.android.replay.video.c.f16154e);
        this.f9066c = a7;
        MediaCodec createByCodecName = ((Boolean) a7.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType("video/avc");
        Intrinsics.checkNotNull(createByCodecName);
        this.f9067d = createByCodecName;
        this.f9068e = gf.k.a(lVar, new io.sentry.android.replay.n(3, this));
        this.f9069f = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.f16143a.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.f9070g = new io.sentry.android.replay.video.b(absolutePath, muxerConfig.f16146d);
    }

    public void a(boolean z5) {
        int dequeueOutputBuffer;
        ByteBuffer encodedData;
        io.sentry.android.replay.video.b bVar = (io.sentry.android.replay.video.b) this.f9070g;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.f9069f;
        MediaCodec mediaCodec = (MediaCodec) this.f9067d;
        b6 b6Var = (b6) this.f9064a;
        if (b6Var.getSessionReplay().f16410l) {
            b6Var.getLogger().h(b5.DEBUG, "[Encoder]: drainCodec(" + z5 + ')', new Object[0]);
        }
        if (z5) {
            if (b6Var.getSessionReplay().f16410l) {
                b6Var.getLogger().h(b5.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -1) {
                if (!z5) {
                    return;
                }
                if (b6Var.getSessionReplay().f16410l) {
                    b6Var.getLogger().h(b5.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (dequeueOutputBuffer == -3) {
                outputBuffers = mediaCodec.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                if (bVar.f16150c) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat videoFormat = mediaCodec.getOutputFormat();
                Intrinsics.checkNotNullExpressionValue(videoFormat, "getOutputFormat(...)");
                if (b6Var.getSessionReplay().f16410l) {
                    b6Var.getLogger().h(b5.DEBUG, "[Encoder]: encoder output format changed: " + videoFormat, new Object[0]);
                }
                Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
                MediaMuxer mediaMuxer = bVar.f16149b;
                bVar.f16151d = mediaMuxer.addTrack(videoFormat);
                mediaMuxer.start();
                bVar.f16150c = true;
            } else if (dequeueOutputBuffer < 0) {
                if (b6Var.getSessionReplay().f16410l) {
                    b6Var.getLogger().h(b5.DEBUG, c1.i(dequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                }
            } else {
                if (outputBuffers == null || (encodedData = outputBuffers[dequeueOutputBuffer]) == null) {
                    break;
                }
                if ((bufferInfo.flags & 2) != 0) {
                    if (b6Var.getSessionReplay().f16410l) {
                        b6Var.getLogger().h(b5.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    }
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!bVar.f16150c) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    Intrinsics.checkNotNullParameter(encodedData, "encodedData");
                    Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
                    long j = bVar.f16148a;
                    int i5 = bVar.f16152e;
                    bVar.f16152e = i5 + 1;
                    long j6 = j * i5;
                    bVar.f16153f = j6;
                    bufferInfo.presentationTimeUs = j6;
                    bVar.f16149b.writeSampleData(bVar.f16151d, encodedData, bufferInfo);
                    if (b6Var.getSessionReplay().f16410l) {
                        b6Var.getLogger().h(b5.DEBUG, r4.k.n(new StringBuilder("[Encoder]: sent "), bufferInfo.size, " bytes to muxer"), new Object[0]);
                    }
                }
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (b6Var.getSessionReplay().f16410l) {
                        if (z5) {
                            b6Var.getLogger().h(b5.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                            return;
                        } else {
                            b6Var.getLogger().h(b5.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
            }
        }
        throw new RuntimeException(d9.e.f(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Bitmap image) {
        Canvas lockCanvas;
        Surface surface;
        Intrinsics.checkNotNullParameter(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (!StringsKt.A(MANUFACTURER, "xiaomi", true)) {
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (!StringsKt.A(MANUFACTURER, "motorola", true)) {
                io.sentry.android.replay.util.h hVar = io.sentry.android.replay.util.h.SOC_MANUFACTURER;
                if (!kotlin.text.z.j(io.sentry.android.replay.util.j.a(hVar), "spreadtrum", true) && !kotlin.text.z.j(io.sentry.android.replay.util.j.a(hVar), "unisoc", true)) {
                    Surface surface2 = (Surface) this.f9071h;
                    if (surface2 != null) {
                        lockCanvas = surface2.lockHardwareCanvas();
                        if (lockCanvas != null) {
                            lockCanvas.drawBitmap(image, 0.0f, 0.0f, (Paint) null);
                        }
                        surface = (Surface) this.f9071h;
                        if (surface != null) {
                            surface.unlockCanvasAndPost(lockCanvas);
                        }
                        a(false);
                    }
                    lockCanvas = null;
                    if (lockCanvas != null) {
                    }
                    surface = (Surface) this.f9071h;
                    if (surface != null) {
                    }
                    a(false);
                }
            }
        }
        Surface surface3 = (Surface) this.f9071h;
        if (surface3 != null) {
            lockCanvas = surface3.lockCanvas(null);
            if (lockCanvas != null) {
            }
            surface = (Surface) this.f9071h;
            if (surface != null) {
            }
            a(false);
        }
        lockCanvas = null;
        if (lockCanvas != null) {
        }
        surface = (Surface) this.f9071h;
        if (surface != null) {
        }
        a(false);
    }

    public void c() {
        MediaCodec mediaCodec = (MediaCodec) this.f9067d;
        try {
            a(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = (Surface) this.f9071h;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = ((io.sentry.android.replay.video.b) this.f9070g).f16149b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th2) {
            ((b6) this.f9064a).getLogger().e(b5.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    @Override // b3.a
    public View getRoot() {
        return (LinearLayout) this.f9064a;
    }

    public y(LinearLayout linearLayout, AppCompatImageView appCompatImageView, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout3) {
        this.f9064a = linearLayout;
        this.f9067d = appCompatImageView;
        this.f9068e = textView;
        this.f9065b = linearLayout2;
        this.f9069f = textView2;
        this.f9070g = textView3;
        this.f9071h = textView4;
        this.f9066c = linearLayout3;
    }
}

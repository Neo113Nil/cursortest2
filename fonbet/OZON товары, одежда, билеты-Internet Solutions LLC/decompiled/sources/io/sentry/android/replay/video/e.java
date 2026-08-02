package io.sentry.android.replay.video;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import T7.E;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import io.sentry.I2;
import io.sentry.W2;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import io.sentry.android.replay.util.k;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"UseRequiresApi"})
@TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f67702a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f67703b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f67704c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final MediaCodec f67705d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f67706e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final MediaCodec.BufferInfo f67707f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final b f67708g;

    /* renamed from: h, reason: collision with root package name */
    private Surface f67709h;

    public e(W2 options, a muxerConfig) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.f67702a = options;
        this.f67703b = muxerConfig;
        n nVar = n.NONE;
        InterfaceC4008j a11 = k.a(nVar, c.f67700b);
        this.f67704c = a11;
        MediaCodec createByCodecName = ((Boolean) a11.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType("video/avc");
        Intrinsics.f(createByCodecName);
        this.f67705d = createByCodecName;
        this.f67706e = k.a(nVar, new d(this));
        this.f67707f = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.b().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.f67708g = new b(absolutePath, muxerConfig.c());
    }

    private final void a(boolean z11) {
        int dequeueOutputBuffer;
        ByteBuffer byteBuffer;
        W2 w22 = this.f67702a;
        if (w22.getSessionReplay().u()) {
            w22.getLogger().c(I2.DEBUG, "[Encoder]: drainCodec(" + z11 + ')', new Object[0]);
        }
        MediaCodec mediaCodec = this.f67705d;
        if (z11) {
            if (w22.getSessionReplay().u()) {
                w22.getLogger().c(I2.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            MediaCodec.BufferInfo bufferInfo = this.f67707f;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -1) {
                if (!z11) {
                    return;
                }
                if (w22.getSessionReplay().u()) {
                    w22.getLogger().c(I2.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (dequeueOutputBuffer == -3) {
                outputBuffers = mediaCodec.getOutputBuffers();
            } else {
                b bVar = this.f67708g;
                if (dequeueOutputBuffer == -2) {
                    if (bVar.b()) {
                        throw new RuntimeException("format changed twice");
                    }
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                    if (w22.getSessionReplay().u()) {
                        w22.getLogger().c(I2.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                    }
                    bVar.e(outputFormat);
                } else if (dequeueOutputBuffer < 0) {
                    if (w22.getSessionReplay().u()) {
                        w22.getLogger().c(I2.DEBUG, Ej.b.a(dequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                    }
                } else {
                    if (outputBuffers == null || (byteBuffer = outputBuffers[dequeueOutputBuffer]) == null) {
                        break;
                    }
                    if ((bufferInfo.flags & 2) != 0) {
                        if (w22.getSessionReplay().u()) {
                            w22.getLogger().c(I2.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                        }
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (!bVar.b()) {
                            throw new RuntimeException("muxer hasn't started");
                        }
                        bVar.c(byteBuffer, bufferInfo);
                        if (w22.getSessionReplay().u()) {
                            w22.getLogger().c(I2.DEBUG, K00.b.e(bufferInfo.size, " bytes to muxer", new StringBuilder("[Encoder]: sent ")), new Object[0]);
                        }
                    }
                    mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        if (w22.getSessionReplay().u()) {
                            if (z11) {
                                w22.getLogger().c(I2.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                                return;
                            } else {
                                w22.getLogger().c(I2.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }
        throw new RuntimeException(E.a(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(@NotNull Bitmap image) {
        Canvas lockCanvas;
        Surface surface;
        Intrinsics.checkNotNullParameter(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (!h.t(MANUFACTURER, "xiaomi", true)) {
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (!h.t(MANUFACTURER, "motorola", true)) {
                k.a aVar = k.a.SOC_MANUFACTURER;
                if (!io.sentry.android.replay.util.k.a(aVar).equalsIgnoreCase("spreadtrum") && !io.sentry.android.replay.util.k.a(aVar).equalsIgnoreCase("unisoc")) {
                    Surface surface2 = this.f67709h;
                    if (surface2 != null) {
                        lockCanvas = surface2.lockHardwareCanvas();
                        if (lockCanvas != null) {
                            lockCanvas.drawBitmap(image, 0.0f, 0.0f, (Paint) null);
                        }
                        surface = this.f67709h;
                        if (surface != null) {
                            surface.unlockCanvasAndPost(lockCanvas);
                        }
                        a(false);
                    }
                    lockCanvas = null;
                    if (lockCanvas != null) {
                    }
                    surface = this.f67709h;
                    if (surface != null) {
                    }
                    a(false);
                }
            }
        }
        Surface surface3 = this.f67709h;
        if (surface3 != null) {
            lockCanvas = surface3.lockCanvas(null);
            if (lockCanvas != null) {
            }
            surface = this.f67709h;
            if (surface != null) {
            }
            a(false);
        }
        lockCanvas = null;
        if (lockCanvas != null) {
        }
        surface = this.f67709h;
        if (surface != null) {
        }
        a(false);
    }

    public final long c() {
        return this.f67708g.a();
    }

    @NotNull
    public final MediaCodec d() {
        return this.f67705d;
    }

    @NotNull
    public final a e() {
        return this.f67703b;
    }

    @NotNull
    public final W2 f() {
        return this.f67702a;
    }

    public final void g() {
        MediaCodec mediaCodec = this.f67705d;
        try {
            a(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = this.f67709h;
            if (surface != null) {
                surface.release();
            }
            this.f67708g.d();
        } catch (Throwable th2) {
            this.f67702a.getLogger().a(I2.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void h() {
        MediaFormat mediaFormat = (MediaFormat) this.f67706e.getValue();
        MediaCodec mediaCodec = this.f67705d;
        mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f67709h = mediaCodec.createInputSurface();
        mediaCodec.start();
        a(false);
    }
}

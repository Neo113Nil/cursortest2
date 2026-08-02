package io.sentry.android.replay.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Range;
import android.view.Surface;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.android.replay.util.p;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f51810a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.android.replay.video.a f51811b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f51812c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f51813d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodec f51814e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f51815f;

    /* renamed from: g, reason: collision with root package name */
    public final MediaCodec.BufferInfo f51816g;

    /* renamed from: h, reason: collision with root package name */
    public final io.sentry.android.replay.video.b f51817h;

    /* renamed from: i, reason: collision with root package name */
    public Surface f51818i;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f51819d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z10 = false;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
            int length = codecInfos.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String name = codecInfos[i10].getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.contains$default((CharSequence) name, (CharSequence) "c2.exynos", false, 2, (Object) null)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MediaFormat invoke() {
            int a10 = c.this.g().a();
            try {
                MediaCodecInfo.VideoCapabilities videoCapabilities = c.this.e().getCodecInfo().getCapabilitiesForType(c.this.g().d()).getVideoCapabilities();
                if (!videoCapabilities.getBitrateRange().contains((Range<Integer>) Integer.valueOf(a10))) {
                    c.this.h().getLogger().c(EnumC4788n3.DEBUG, "Encoder doesn't support the provided bitRate: " + a10 + ", the value will be clamped to the closest one", new Object[0]);
                    Integer clamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(a10));
                    Intrinsics.checkNotNullExpressionValue(clamp, "clamp(...)");
                    a10 = clamp.intValue();
                }
            } catch (Throwable th2) {
                c.this.h().getLogger().b(EnumC4788n3.DEBUG, "Could not retrieve MediaCodec info", th2);
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(c.this.g().d(), c.this.g().f(), c.this.g().e());
            Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(...)");
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", a10);
            createVideoFormat.setFloat("frame-rate", c.this.g().c());
            createVideoFormat.setInteger("i-frame-interval", 6);
            return createVideoFormat;
        }
    }

    public c(F3 options, io.sentry.android.replay.video.a muxerConfig, Function0 function0) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.f51810a = options;
        this.f51811b = muxerConfig;
        this.f51812c = function0;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f51813d = LazyKt.lazy(lazyThreadSafetyMode, (Function0) a.f51819d);
        MediaCodec createByCodecName = d() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.d());
        Intrinsics.checkNotNull(createByCodecName);
        this.f51814e = createByCodecName;
        this.f51815f = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new b());
        this.f51816g = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.b().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.f51817h = new io.sentry.android.replay.video.b(absolutePath, muxerConfig.c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e0, code lost:
    
        throw new java.lang.RuntimeException("encoderOutputBuffer " + r2 + " was null");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        ByteBuffer byteBuffer;
        if (this.f51810a.getSessionReplay().C()) {
            this.f51810a.getLogger().c(EnumC4788n3.DEBUG, "[Encoder]: drainCodec(" + z10 + ')', new Object[0]);
        }
        if (z10) {
            if (this.f51810a.getSessionReplay().C()) {
                this.f51810a.getLogger().c(EnumC4788n3.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            this.f51814e.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.f51814e.getOutputBuffers();
        while (true) {
            int dequeueOutputBuffer = this.f51814e.dequeueOutputBuffer(this.f51816g, 100000L);
            if (dequeueOutputBuffer == -1) {
                if (!z10) {
                    return;
                }
                if (this.f51810a.getSessionReplay().C()) {
                    this.f51810a.getLogger().c(EnumC4788n3.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (dequeueOutputBuffer == -3) {
                outputBuffers = this.f51814e.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                if (this.f51817h.b()) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.f51814e.getOutputFormat();
                Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                if (this.f51810a.getSessionReplay().C()) {
                    this.f51810a.getLogger().c(EnumC4788n3.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                }
                this.f51817h.e(outputFormat);
            } else if (dequeueOutputBuffer < 0) {
                if (this.f51810a.getSessionReplay().C()) {
                    this.f51810a.getLogger().c(EnumC4788n3.DEBUG, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer, new Object[0]);
                }
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[dequeueOutputBuffer]) == null) {
                    break;
                }
                if ((this.f51816g.flags & 2) != 0) {
                    if (this.f51810a.getSessionReplay().C()) {
                        this.f51810a.getLogger().c(EnumC4788n3.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    }
                    this.f51816g.size = 0;
                }
                if (this.f51816g.size != 0) {
                    if (!this.f51817h.b()) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    this.f51817h.c(byteBuffer, this.f51816g);
                    if (this.f51810a.getSessionReplay().C()) {
                        this.f51810a.getLogger().c(EnumC4788n3.DEBUG, "[Encoder]: sent " + this.f51816g.size + " bytes to muxer", new Object[0]);
                    }
                }
                this.f51814e.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((this.f51816g.flags & 4) != 0) {
                    if (this.f51810a.getSessionReplay().C()) {
                        if (z10) {
                            this.f51810a.getLogger().c(EnumC4788n3.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                            return;
                        } else {
                            this.f51810a.getLogger().c(EnumC4788n3.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bitmap image) {
        Canvas lockCanvas;
        Surface surface;
        Intrinsics.checkNotNullParameter(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (!StringsKt.contains((CharSequence) MANUFACTURER, (CharSequence) HardwareEarMonitorUtils.MANUFACTURER_XIAOMI, true)) {
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (!StringsKt.contains((CharSequence) MANUFACTURER, (CharSequence) "motorola", true)) {
                p pVar = p.f51789a;
                p.a aVar = p.a.SOC_MANUFACTURER;
                if (!StringsKt.equals(p.b(pVar, aVar, null, 2, null), "spreadtrum", true) && !StringsKt.equals(p.b(pVar, aVar, null, 2, null), "unisoc", true)) {
                    Surface surface2 = this.f51818i;
                    if (surface2 != null) {
                        lockCanvas = surface2.lockHardwareCanvas();
                        if (lockCanvas != null) {
                            lockCanvas.drawBitmap(image, 0.0f, 0.0f, (Paint) null);
                        }
                        surface = this.f51818i;
                        if (surface != null) {
                            surface.unlockCanvasAndPost(lockCanvas);
                        }
                        a(false);
                    }
                    lockCanvas = null;
                    if (lockCanvas != null) {
                    }
                    surface = this.f51818i;
                    if (surface != null) {
                    }
                    a(false);
                }
            }
        }
        Surface surface3 = this.f51818i;
        if (surface3 != null) {
            lockCanvas = surface3.lockCanvas(null);
            if (lockCanvas != null) {
            }
            surface = this.f51818i;
            if (surface != null) {
            }
            a(false);
        }
        lockCanvas = null;
        if (lockCanvas != null) {
        }
        surface = this.f51818i;
        if (surface != null) {
        }
        a(false);
    }

    public final long c() {
        return this.f51817h.a();
    }

    public final boolean d() {
        return ((Boolean) this.f51813d.getValue()).booleanValue();
    }

    public final MediaCodec e() {
        return this.f51814e;
    }

    public final MediaFormat f() {
        return (MediaFormat) this.f51815f.getValue();
    }

    public final io.sentry.android.replay.video.a g() {
        return this.f51811b;
    }

    public final F3 h() {
        return this.f51810a;
    }

    public final void i() {
        try {
            Function0 function0 = this.f51812c;
            if (function0 != null) {
                function0.invoke();
            }
            a(true);
            this.f51814e.stop();
            this.f51814e.release();
            Surface surface = this.f51818i;
            if (surface != null) {
                surface.release();
            }
            this.f51817h.d();
        } catch (Throwable th2) {
            this.f51810a.getLogger().b(EnumC4788n3.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    public final void j() {
        this.f51814e.configure(f(), (Surface) null, (MediaCrypto) null, 1);
        this.f51818i = this.f51814e.createInputSurface();
        this.f51814e.start();
        a(false);
    }

    public /* synthetic */ c(F3 f32, io.sentry.android.replay.video.a aVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f32, aVar, (i10 & 4) != 0 ? null : function0);
    }
}

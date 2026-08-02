package androidx.media3.exoplayer.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.d;
import androidx.media3.exoplayer.video.d.C0069d;
import androidx.media3.exoplayer.video.e;
import androidx.media3.exoplayer.video.g;
import com.google.common.collect.ImmutableList;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.gl.tf.Tensorflow;
import xsna.ahn;
import xsna.d8h;
import xsna.dvf;
import xsna.ewo0;
import xsna.f8x;
import xsna.fih0;
import xsna.fxc0;
import xsna.g8l;
import xsna.ger;
import xsna.gms0;
import xsna.hq10;
import xsna.hr10;
import xsna.io20;
import xsna.jx8;
import xsna.jxj0;
import xsna.kms0;
import xsna.kzm;
import xsna.l3c0;
import xsna.lq10;
import xsna.m0h0;
import xsna.m6g;
import xsna.mms0;
import xsna.n8l;
import xsna.nms0;
import xsna.od6;
import xsna.p8p;
import xsna.qzf;
import xsna.tzf;
import xsna.uct0;
import xsna.ugr;
import xsna.w8s;
import xsna.wyf0;
import xsna.xgt0;
import xsna.y2r0;

/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: classes12.dex */
public class c extends MediaCodecRenderer {
    public static final int[] A1 = {1920, 1600, 1440, CoverVideoUploadTask.y, VideoRecord.DEFAULT_MAX_DIMENSION, 854, 640, 540, 480};
    public static boolean B1;
    public static boolean C1;
    public final Context I0;
    public final boolean J0;
    public final g.a K0;
    public final int L0;
    public final boolean M0;
    public final androidx.media3.exoplayer.video.e N0;
    public final e.a O0;
    public final long P0;

    @Nullable
    public final mms0 Q0;
    public final PriorityQueue<Long> R0;
    public d S0;
    public boolean T0;
    public boolean U0;
    public VideoSink V0;
    public boolean W0;
    public int X0;
    public List<p8p> Y0;

    @Nullable
    public Surface Z0;

    @Nullable
    public PlaceholderSurface a1;
    public jxj0 b1;
    public boolean c1;
    public int d1;
    public int e1;
    public long f1;
    public int g1;
    public int h1;
    public int i1;

    @Nullable
    public fih0 j1;
    public long k1;
    public boolean l1;
    public long m1;
    public int n1;
    public long o1;
    public xgt0 p1;

    @Nullable
    public xgt0 q1;
    public int r1;
    public boolean s1;
    public int t1;

    @Nullable
    public e u1;

    @Nullable
    public gms0 v1;
    public long w1;
    public long x1;
    public boolean y1;
    public int z1;

    /* compiled from: MediaCodecVideoRenderer.java */
    public class a implements VideoSink.b {
        public final /* synthetic */ androidx.media3.exoplayer.mediacodec.c a;
        public final /* synthetic */ int b;

        public a(androidx.media3.exoplayer.mediacodec.c cVar, int i, long j) {
            this.a = cVar;
            this.b = i;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public final void a() {
            Trace.beginSection("dropVideoBuffer");
            this.a.d(this.b);
            Trace.endSection();
            c.this.O0(0, 1);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public final void b(long j) {
            c.this.J0(this.a, this.b, j);
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    public static final class b {
        public static boolean a(Context context) {
            Display.HdrCapabilities hdrCapabilities;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
                return false;
            }
            for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    /* renamed from: androidx.media3.exoplayer.video.c$c, reason: collision with other inner class name */
    public static final class C0068c {
        public final Context a;
        public boolean b;
        public androidx.media3.exoplayer.mediacodec.e c = androidx.media3.exoplayer.mediacodec.e.T6;
        public c.b d;
        public long e;
        public boolean f;

        @Nullable
        public Handler g;

        @Nullable
        public g h;
        public int i;

        public C0068c(Context context) {
            this.a = context;
            this.d = new androidx.media3.exoplayer.mediacodec.b(context);
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;

        public d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    public final class e implements Handler.Callback {
        public final Handler b;

        public e(androidx.media3.exoplayer.mediacodec.c cVar) {
            Handler o = y2r0.o(this);
            this.b = o;
            cVar.c(this, o);
        }

        public final void a(long j) {
            Surface surface;
            c cVar = c.this;
            g.a aVar = cVar.K0;
            if (this != cVar.u1 || cVar.P == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                cVar.v0 = true;
                return;
            }
            try {
                cVar.z0(j);
                xgt0 xgt0Var = cVar.p1;
                if (!xgt0Var.equals(xgt0.d) && !xgt0Var.equals(cVar.q1)) {
                    cVar.q1 = xgt0Var;
                    aVar.a(xgt0Var);
                }
                cVar.x0.e++;
                androidx.media3.exoplayer.video.e eVar = cVar.N0;
                boolean z = eVar.e != 3;
                eVar.e = 3;
                eVar.g = y2r0.S(eVar.l.elapsedRealtime());
                if (z && (surface = cVar.Z0) != null) {
                    Handler handler = aVar.a;
                    if (handler != null) {
                        handler.post(new uct0(aVar, surface, SystemClock.elapsedRealtime()));
                    }
                    cVar.c1 = true;
                }
                cVar.e0(j);
            } catch (ExoPlaybackException e) {
                cVar.w0 = e;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(y2r0.i0(message.arg1, message.arg2));
            return true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(C0068c c0068c) {
        super(r0.getApplicationContext(), 2, c0068c.d, c0068c.c, c0068c.f, 30.0f);
        Context context = c0068c.a;
        Context applicationContext = context.getApplicationContext();
        this.I0 = applicationContext;
        this.L0 = c0068c.i;
        this.V0 = null;
        this.K0 = new g.a(c0068c.g, c0068c.h);
        this.J0 = this.V0 == null;
        this.N0 = new androidx.media3.exoplayer.video.e(applicationContext, this, c0068c.e);
        this.O0 = new e.a();
        this.M0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.b1 = jxj0.c;
        this.d1 = 1;
        this.e1 = 0;
        this.p1 = xgt0.d;
        this.t1 = 0;
        this.q1 = null;
        this.r1 = -1000;
        this.w1 = C.TIME_UNSET;
        this.x1 = C.TIME_UNSET;
        this.R0 = new PriorityQueue<>();
        this.P0 = C.TIME_UNSET;
        this.Q0 = null;
        this.j1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ae, code lost:
    
        if (r1.equals("AFTSO001") == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0(String str) {
        boolean z;
        boolean z2 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (c.class) {
            try {
                if (!B1) {
                    char c = 7;
                    if (Build.VERSION.SDK_INT <= 28) {
                        String str2 = Build.DEVICE;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z = false;
                                    break;
                                }
                                z = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z = 6;
                                    break;
                                }
                                z = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z = 7;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z2 = true;
                                break;
                        }
                        C1 = z2;
                        B1 = true;
                    }
                    String str3 = Build.MODEL;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1798172390:
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                    }
                    C1 = z2;
                    B1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int B0(hq10 hq10Var, androidx.media3.common.a aVar) {
        int i = aVar.u;
        int i2 = aVar.v;
        if (i != -1 && i2 != -1) {
            String str = aVar.n;
            str.getClass();
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair<Integer, Integer> b2 = tzf.b(aVar);
                if (b2 != null) {
                    int intValue = ((Integer) b2.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = MimeTypes.VIDEO_AV1;
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H263)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i * i2) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !hq10Var.g)))) {
                        return ((y2r0.g(i2, 16) * y2r0.g(i, 16)) * Tensorflow.FRAME_HEIGHT) / 4;
                    }
                    break;
                case 6:
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List<hq10> C0(Context context, androidx.media3.exoplayer.mediacodec.e eVar, androidx.media3.common.a aVar, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        String str = aVar.n;
        if (str == null) {
            return com.google.common.collect.g.f;
        }
        if ("video/dolby-vision".equals(str) && !b.a(context)) {
            String c = MediaCodecUtil.c(aVar);
            List<hq10> decoderInfos = c == null ? com.google.common.collect.g.f : eVar.getDecoderInfos(c, z, z2);
            if (!decoderInfos.isEmpty()) {
                return decoderInfos;
            }
        }
        return MediaCodecUtil.g(eVar, aVar, z, z2);
    }

    public static int D0(hq10 hq10Var, androidx.media3.common.a aVar) {
        int i = aVar.o;
        List<byte[]> list = aVar.q;
        if (i == -1) {
            return B0(hq10Var, aVar);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += list.get(i3).length;
        }
        return aVar.o + i2;
    }

    @Override // androidx.media3.exoplayer.a
    public final void A() {
        i.b bVar = this.r;
        if (bVar != null) {
            P0(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final n8l E(hq10 hq10Var, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        int i;
        n8l b2 = hq10Var.b(aVar, aVar2);
        int i2 = b2.e;
        d dVar = this.S0;
        dVar.getClass();
        if (aVar2.u > dVar.a || aVar2.v > dVar.b) {
            i2 |= 256;
        }
        if (D0(hq10Var, aVar2) > dVar.c) {
            i2 |= 64;
        }
        if (this.e1 != Integer.MIN_VALUE) {
            float f = aVar.y;
            if (f != -1.0f) {
                float f2 = aVar2.y;
                if (f2 != -1.0f && Math.abs(f2 - f) > 1.0f && ((i = Build.VERSION.SDK_INT) < 30 || (i == 30 && Build.MODEL.startsWith("MiTV")))) {
                    i2 |= 65536;
                }
            }
        }
        int i3 = i2;
        return new n8l(hq10Var.a, aVar, aVar2, i3 != 0 ? 0 : b2.d, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0057  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface E0(hq10 hq10Var) {
        boolean z;
        PlaceholderSurface.a aVar;
        VideoSink videoSink = this.V0;
        if (videoSink != null) {
            return videoSink.b();
        }
        Surface surface = this.Z0;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && hq10Var.k) {
            return null;
        }
        fxc0.z(M0(hq10Var));
        PlaceholderSurface placeholderSurface = this.a1;
        if (placeholderSurface != null && placeholderSurface.b != hq10Var.g && placeholderSurface != null) {
            placeholderSurface.release();
            this.a1 = null;
        }
        if (this.a1 == null) {
            boolean z2 = hq10Var.g;
            boolean z3 = false;
            if (!z2) {
                int i = PlaceholderSurface.e;
            } else if (!PlaceholderSurface.d()) {
                z = false;
                fxc0.z(z);
                aVar = new PlaceholderSurface.a("ExoPlayer:PlaceholderSurface");
                int i2 = !z2 ? PlaceholderSurface.e : 0;
                aVar.start();
                Handler handler = new Handler(aVar.getLooper(), aVar);
                aVar.c = handler;
                aVar.b = new androidx.media3.common.util.a(handler);
                synchronized (aVar) {
                    aVar.c.obtainMessage(1, i2, 0).sendToTarget();
                    while (aVar.f == null && aVar.e == null && aVar.d == null) {
                        try {
                            aVar.wait();
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = aVar.e;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = aVar.d;
                if (error != null) {
                    throw error;
                }
                PlaceholderSurface placeholderSurface2 = aVar.f;
                placeholderSurface2.getClass();
                this.a1 = placeholderSurface2;
            }
            z = true;
            fxc0.z(z);
            aVar = new PlaceholderSurface.a("ExoPlayer:PlaceholderSurface");
            if (!z2) {
            }
            aVar.start();
            Handler handler2 = new Handler(aVar.getLooper(), aVar);
            aVar.c = handler2;
            aVar.b = new androidx.media3.common.util.a(handler2);
            synchronized (aVar) {
            }
        }
        return this.a1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException F(IllegalStateException illegalStateException, @Nullable hq10 hq10Var) {
        return new MediaCodecVideoDecoderException(illegalStateException, hq10Var, this.Z0);
    }

    public final boolean F0(hq10 hq10Var) {
        if (this.V0 != null) {
            return true;
        }
        Surface surface = this.Z0;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && hq10Var.k) || M0(hq10Var);
        }
        return true;
    }

    public final boolean G0(DecoderInputBuffer decoderInputBuffer) {
        if (hasReadStreamToEnd() || decoderInputBuffer.b(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
            return true;
        }
        long j = this.x1;
        return j == C.TIME_UNSET || j - (decoderInputBuffer.g - this.y0.c) <= 100000;
    }

    public final void H0() {
        if (this.g1 > 0) {
            dvf dvfVar = this.h;
            dvfVar.getClass();
            long elapsedRealtime = dvfVar.elapsedRealtime();
            final long j = elapsedRealtime - this.f1;
            final int i = this.g1;
            final g.a aVar = this.K0;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: xsna.vct0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.video.g gVar = aVar.b;
                        String str = y2r0.a;
                        gVar.onDroppedFrames(i, j);
                    }
                });
            }
            this.g1 = 0;
            this.f1 = elapsedRealtime;
        }
    }

    public final void I0() {
        androidx.media3.exoplayer.mediacodec.c cVar;
        if (this.s1 && (cVar = this.P) != null) {
            this.u1 = new e(cVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                cVar.setParameters(bundle);
            }
        }
    }

    public final void J0(androidx.media3.exoplayer.mediacodec.c cVar, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        cVar.m(i, j);
        Trace.endSection();
        this.x0.e++;
        this.h1 = 0;
        if (this.V0 == null) {
            xgt0 xgt0Var = this.p1;
            boolean equals = xgt0Var.equals(xgt0.d);
            g.a aVar = this.K0;
            if (!equals && !xgt0Var.equals(this.q1)) {
                this.q1 = xgt0Var;
                aVar.a(xgt0Var);
            }
            androidx.media3.exoplayer.video.e eVar = this.N0;
            boolean z = eVar.e != 3;
            eVar.e = 3;
            eVar.g = y2r0.S(eVar.l.elapsedRealtime());
            if (!z || (surface = this.Z0) == null) {
                return;
            }
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new uct0(aVar, surface, SystemClock.elapsedRealtime()));
            }
            this.c1 = true;
        }
    }

    public final void K0(@Nullable Object obj) throws ExoPlaybackException {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.Z0;
        g.a aVar = this.K0;
        if (surface2 == surface) {
            if (surface != null) {
                xgt0 xgt0Var = this.q1;
                if (xgt0Var != null) {
                    aVar.a(xgt0Var);
                }
                Surface surface3 = this.Z0;
                if (surface3 == null || !this.c1 || (handler = aVar.a) == null) {
                    return;
                }
                handler.post(new uct0(aVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.Z0 = surface;
        VideoSink videoSink = this.V0;
        androidx.media3.exoplayer.video.e eVar = this.N0;
        if (videoSink == null) {
            eVar.g(surface);
        }
        this.c1 = false;
        int i = this.i;
        androidx.media3.exoplayer.mediacodec.c cVar = this.P;
        if (cVar != null && this.V0 == null) {
            hq10 hq10Var = this.W;
            hq10Var.getClass();
            if (!F0(hq10Var) || this.T0) {
                k0();
                U();
            } else {
                Surface E0 = E0(hq10Var);
                if (E0 != null) {
                    cVar.i(E0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    cVar.h();
                }
            }
        }
        if (surface != null) {
            xgt0 xgt0Var2 = this.q1;
            if (xgt0Var2 != null) {
                aVar.a(xgt0Var2);
            }
        } else {
            this.q1 = null;
            VideoSink videoSink2 = this.V0;
            if (videoSink2 != null) {
                videoSink2.t();
            }
        }
        if (i == 2) {
            VideoSink videoSink3 = this.V0;
            if (videoSink3 != null) {
                videoSink3.o(true);
            } else {
                eVar.c(true);
            }
        }
        I0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int L(DecoderInputBuffer decoderInputBuffer) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.j1 == null && !this.s1) || decoderInputBuffer.g >= this.m || G0(decoderInputBuffer)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean L0(long j, long j2, boolean z, boolean z2) throws ExoPlaybackException {
        if (this.V0 != null && this.J0) {
            j2 -= -this.w1;
        }
        if (j < -500000 && !z) {
            m0h0 m0h0Var = this.j;
            m0h0Var.getClass();
            int skipData = m0h0Var.skipData(j2 - this.l);
            if (skipData != 0) {
                this.k1 = j2;
                PriorityQueue<Long> priorityQueue = this.R0;
                if (z2) {
                    g8l g8lVar = this.x0;
                    int i = g8lVar.d + skipData;
                    g8lVar.d = i;
                    g8lVar.f += this.i1;
                    g8lVar.d = priorityQueue.size() + i;
                } else {
                    this.x0.j++;
                    O0(priorityQueue.size() + skipData, this.i1);
                }
                if (this.P != null) {
                    if (u0()) {
                        k0();
                        U();
                    } else if (s0()) {
                        J();
                    } else {
                        this.C0 = true;
                    }
                }
                VideoSink videoSink = this.V0;
                if (videoSink != null) {
                    videoSink.u(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float M(float f, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        hq10 hq10Var;
        float f2 = -1.0f;
        for (androidx.media3.common.a aVar2 : aVarArr) {
            float f3 = aVar2.y;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.j1 == null || (hq10Var = this.W) == null) {
            return f4;
        }
        int i = aVar.u;
        int i2 = aVar.v;
        float f5 = -3.4028235E38f;
        if (hq10Var.l) {
            float f6 = hq10Var.o;
            if (f6 != -3.4028235E38f && hq10Var.m == i && hq10Var.n == i2) {
                f5 = f6;
            } else {
                float f7 = 1024.0f;
                if (!hq10Var.h(i, i2, 1024.0f)) {
                    f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (true) {
                        float f8 = f7 - f5;
                        if (Math.abs(f8) <= 5.0f) {
                            break;
                        }
                        float f9 = (f8 / 2.0f) + f5;
                        if (hq10Var.h(i, i2, f9)) {
                            f5 = f9;
                        } else {
                            f7 = f9;
                        }
                    }
                } else {
                    f5 = 1024.0f;
                }
                hq10Var.o = f5;
                hq10Var.m = i;
                hq10Var.n = i2;
            }
        }
        return f4 != -1.0f ? Math.max(f4, f5) : f5;
    }

    public final boolean M0(hq10 hq10Var) {
        if (this.s1 || A0(hq10Var.a)) {
            return false;
        }
        return !hq10Var.g || PlaceholderSurface.d();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList N(androidx.media3.exoplayer.mediacodec.e eVar, androidx.media3.common.a aVar, boolean z) throws MediaCodecUtil.DecoderQueryException {
        boolean z2 = this.s1;
        Context context = this.I0;
        List<hq10> C0 = C0(context, eVar, aVar, z, z2);
        HashMap<MediaCodecUtil.a, List<hq10>> hashMap = MediaCodecUtil.a;
        ArrayList arrayList = new ArrayList(C0);
        Collections.sort(arrayList, new lq10(new f8x(context, aVar)));
        return arrayList;
    }

    public final void N0(androidx.media3.exoplayer.mediacodec.c cVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        cVar.d(i);
        Trace.endSection();
        this.x0.f++;
    }

    public final void O0(int i, int i2) {
        g8l g8lVar = this.x0;
        g8lVar.h += i;
        int i3 = i + i2;
        g8lVar.g += i3;
        this.g1 += i3;
        int i4 = this.h1 + i3;
        this.h1 = i4;
        g8lVar.i = Math.max(i4, g8lVar.i);
        int i5 = this.L0;
        if (i5 <= 0 || this.g1 < i5) {
            return;
        }
        H0();
    }

    public final void P0(i.b bVar) {
        ewo0 ewo0Var = this.q;
        if (ewo0Var.p()) {
            this.x1 = C.TIME_UNSET;
            return;
        }
        int b2 = ewo0Var.b(bVar.a);
        if (b2 == -1) {
            this.x1 = C.TIME_UNSET;
        } else {
            this.x1 = ewo0Var.f(b2, new ewo0.b(), false).d;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final c.a Q(hq10 hq10Var, androidx.media3.common.a aVar, @Nullable MediaCrypto mediaCrypto, float f) {
        m6g m6gVar;
        int i;
        d dVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i2;
        Point point2;
        int i3;
        char c;
        boolean z;
        Pair<Integer, Integer> b2;
        int B0;
        String str = hq10Var.c;
        androidx.media3.common.a[] aVarArr = this.k;
        aVarArr.getClass();
        int i4 = aVar.u;
        float f2 = aVar.y;
        m6g m6gVar2 = aVar.D;
        int i5 = aVar.v;
        int D0 = D0(hq10Var, aVar);
        if (aVarArr.length == 1) {
            if (D0 != -1 && (B0 = B0(hq10Var, aVar)) != -1) {
                D0 = Math.min((int) (D0 * 1.5f), B0);
            }
            dVar = new d(i4, i5, D0);
            m6gVar = m6gVar2;
            i = i5;
        } else {
            int length = aVarArr.length;
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z2 = false;
            while (i8 < length) {
                androidx.media3.common.a aVar2 = aVarArr[i8];
                androidx.media3.common.a[] aVarArr2 = aVarArr;
                if (m6gVar2 != null && aVar2.D == null) {
                    a.C0043a a2 = aVar2.a();
                    a2.C = m6gVar2;
                    aVar2 = new androidx.media3.common.a(a2);
                }
                n8l b3 = hq10Var.b(aVar, aVar2);
                int i9 = length;
                int i10 = aVar2.v;
                if (b3.d != 0) {
                    int i11 = aVar2.u;
                    i3 = i8;
                    c = 65535;
                    z2 |= i11 == -1 || i10 == -1;
                    i6 = Math.max(i6, i11);
                    i7 = Math.max(i7, i10);
                    D0 = Math.max(D0, D0(hq10Var, aVar2));
                } else {
                    i3 = i8;
                    c = 65535;
                }
                length = i9;
                i8 = i3 + 1;
                aVarArr = aVarArr2;
            }
            if (z2) {
                ahn.F("Resolutions unknown. Codec max resolution: " + i6 + "x" + i7);
                boolean z3 = i5 > i4;
                int i12 = z3 ? i5 : i4;
                int i13 = z3 ? i4 : i5;
                boolean z4 = z3;
                float f3 = i13 / i12;
                int i14 = 0;
                while (i14 < 9) {
                    int i15 = A1[i14];
                    int i16 = i14;
                    int i17 = (int) (i15 * f3);
                    if (i15 <= i12 || i17 <= i13) {
                        break;
                    }
                    if (z4) {
                        i15 = i17;
                    }
                    if (z4) {
                        i17 = i15;
                    }
                    int i18 = i12;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = hq10Var.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        m6gVar = m6gVar2;
                        i2 = i13;
                        point2 = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i2 = i13;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        m6gVar = m6gVar2;
                        point2 = new Point(y2r0.g(i15, widthAlignment) * widthAlignment, y2r0.g(i17, heightAlignment) * heightAlignment);
                    }
                    if (point2 != null) {
                        point = point2;
                        i = i5;
                        if (hq10Var.h(point2.x, point2.y, f2)) {
                            break;
                        }
                    } else {
                        i = i5;
                    }
                    i14 = i16 + 1;
                    i5 = i;
                    i12 = i18;
                    m6gVar2 = m6gVar;
                    i13 = i2;
                }
                m6gVar = m6gVar2;
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    a.C0043a a3 = aVar.a();
                    a3.t = i6;
                    a3.u = i7;
                    D0 = Math.max(D0, B0(hq10Var, new androidx.media3.common.a(a3)));
                    ahn.F("Codec max resolution adjusted to: " + i6 + "x" + i7);
                }
            } else {
                m6gVar = m6gVar2;
                i = i5;
            }
            dVar = new d(i6, i7, D0);
        }
        this.S0 = dVar;
        int i19 = this.s1 ? this.t1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i);
        hr10.d(mediaFormat, aVar.q);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        hr10.c(mediaFormat, "rotation-degrees", aVar.z);
        hr10.b(mediaFormat, m6gVar);
        if ("video/dolby-vision".equals(aVar.n) && (b2 = tzf.b(aVar)) != null) {
            hr10.c(mediaFormat, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, ((Integer) b2.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.a);
        mediaFormat.setInteger("max-height", dVar.b);
        hr10.c(mediaFormat, "max-input-size", dVar.c);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.M0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.r1));
        }
        C(mediaFormat);
        Surface E0 = E0(hq10Var);
        if (this.V0 != null && !y2r0.N(this.I0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new c.a(hq10Var, mediaFormat, aVar, E0, mediaCrypto, null);
    }

    public final void Q0(long j) {
        g8l g8lVar = this.x0;
        g8lVar.k += j;
        g8lVar.l++;
        this.m1 += j;
        this.n1++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public final void R(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.U0) {
            ByteBuffer byteBuffer = decoderInputBuffer.h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        androidx.media3.exoplayer.mediacodec.c cVar = this.P;
                        cVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        cVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean W(androidx.media3.common.a aVar) throws ExoPlaybackException {
        VideoSink videoSink = this.V0;
        if (videoSink == null || videoSink.isInitialized()) {
            return true;
        }
        try {
            return this.V0.g(aVar);
        } catch (VideoSink.VideoSinkException e2) {
            throw r(e2, aVar, false, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void X(Exception exc) {
        ahn.o("MediaCodecVideoRenderer", "Video codec error", exc);
        g.a aVar = this.K0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new ugr(6, aVar, exc));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Y(String str, final long j, final long j2) {
        final String str2;
        final g.a aVar = this.K0;
        Handler handler = aVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new Runnable() { // from class: xsna.tct0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.video.g gVar = g.a.this.b;
                    String str3 = y2r0.a;
                    gVar.onVideoDecoderInitialized(str2, j, j2);
                }
            });
        } else {
            str2 = str;
        }
        this.T0 = A0(str2);
        hq10 hq10Var = this.W;
        hq10Var.getClass();
        this.U0 = hq10Var.f();
        I0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Z(qzf qzfVar) {
        g.a aVar = this.K0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new jx8(7, aVar, qzfVar));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void a0(String str) {
        g.a aVar = this.K0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new d8h(7, aVar, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @Nullable
    public final n8l b0(w8s w8sVar) throws ExoPlaybackException {
        n8l b0 = super.b0(w8sVar);
        androidx.media3.common.a aVar = w8sVar.b;
        aVar.getClass();
        g.a aVar2 = this.K0;
        Handler handler = aVar2.a;
        if (handler != null) {
            handler.post(new l3c0(aVar2, aVar, b0, 1));
        }
        mms0 mms0Var = this.Q0;
        if (mms0Var != null) {
            mms0Var.b();
        }
        return b0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void c0(androidx.media3.common.a aVar, @Nullable MediaFormat mediaFormat) {
        int integer;
        int i;
        androidx.media3.exoplayer.mediacodec.c cVar = this.P;
        if (cVar != null) {
            cVar.setVideoScalingMode(this.d1);
        }
        if (this.s1) {
            i = aVar.u;
            integer = aVar.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = aVar.A;
        int i2 = aVar.z;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.p1 = new xgt0(i, integer, f);
        VideoSink videoSink = this.V0;
        if (videoSink == null || !this.y1) {
            this.N0.f(aVar.y);
        } else {
            a.C0043a a2 = aVar.a();
            a2.t = i;
            a2.u = integer;
            a2.z = f;
            androidx.media3.common.a aVar2 = new androidx.media3.common.a(a2);
            int i4 = this.X0;
            List list = this.Y0;
            if (list == null) {
                ImmutableList.b bVar = ImmutableList.c;
                list = com.google.common.collect.g.f;
            }
            videoSink.n(i4, this.y0.b, aVar2, list);
            this.X0 = 2;
        }
        this.y1 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void e0(long j) {
        super.e0(j);
        if (this.s1) {
            return;
        }
        this.i1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void f0() {
        VideoSink videoSink = this.V0;
        if (videoSink != null) {
            videoSink.f();
            if (this.w1 == C.TIME_UNSET) {
                this.w1 = this.y0.b;
            }
            this.V0.m(-this.w1);
        } else {
            this.N0.e(2);
        }
        this.y1 = true;
        I0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void g0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        this.z1 = 0;
        int L = L(decoderInputBuffer);
        if ((Build.VERSION.SDK_INT < 34 || (L & 32) == 0) && !this.s1) {
            this.i1++;
        }
    }

    @Override // androidx.media3.exoplayer.j, androidx.media3.exoplayer.k
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.j
    public final void h() {
        VideoSink videoSink = this.V0;
        if (videoSink == null) {
            androidx.media3.exoplayer.video.e eVar = this.N0;
            if (eVar.e == 0) {
                eVar.e = 1;
                return;
            }
            return;
        }
        int i = this.X0;
        if (i == 0 || i == 1) {
            this.X0 = 0;
        } else {
            videoSink.p();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.a, androidx.media3.exoplayer.i.b
    public final void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 1) {
            K0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            gms0 gms0Var = (gms0) obj;
            this.v1 = gms0Var;
            VideoSink videoSink = this.V0;
            if (videoSink != null) {
                videoSink.l(gms0Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.t1 != intValue) {
                this.t1 = intValue;
                if (this.s1) {
                    k0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.d1 = intValue2;
            androidx.media3.exoplayer.mediacodec.c cVar = this.P;
            if (cVar != null) {
                cVar.setVideoScalingMode(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.e1 = intValue3;
            VideoSink videoSink2 = this.V0;
            if (videoSink2 != null) {
                videoSink2.i(intValue3);
                return;
            }
            nms0 nms0Var = this.N0.b;
            if (nms0Var.j == intValue3) {
                return;
            }
            nms0Var.j = intValue3;
            nms0Var.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List<p8p> list = (List) obj;
            if (list.equals(kms0.a)) {
                VideoSink videoSink3 = this.V0;
                if (videoSink3 == null || !videoSink3.isInitialized()) {
                    return;
                }
                this.V0.c();
                return;
            }
            this.Y0 = list;
            VideoSink videoSink4 = this.V0;
            if (videoSink4 != null) {
                videoSink4.r(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            jxj0 jxj0Var = (jxj0) obj;
            if (jxj0Var.a == 0 || jxj0Var.b == 0) {
                return;
            }
            this.b1 = jxj0Var;
            VideoSink videoSink5 = this.V0;
            if (videoSink5 != null) {
                Surface surface = this.Z0;
                surface.getClass();
                videoSink5.v(surface, jxj0Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.r1 = ((Integer) obj).intValue();
                androidx.media3.exoplayer.mediacodec.c cVar2 = this.P;
                if (cVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.r1));
                    cVar2.setParameters(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.Z0;
                K0(null);
                obj.getClass();
                ((c) obj).handleMessage(1, surface2);
                break;
            case 18:
                boolean z = this.j1 != null;
                fih0 fih0Var = (fih0) obj;
                this.j1 = fih0Var;
                if (z != (fih0Var != null)) {
                    x0(this.Q);
                    break;
                }
                break;
            default:
                super.handleMessage(i, obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean i0(long j, long j2, @Nullable androidx.media3.exoplayer.mediacodec.c cVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar) throws ExoPlaybackException {
        int i4;
        cVar.getClass();
        long j4 = j3 - this.y0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue<Long> priorityQueue = this.R0;
            Long peek = priorityQueue.peek();
            if (peek == null || peek.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        O0(i5, 0);
        VideoSink videoSink = this.V0;
        if (videoSink != null) {
            if (!z || z2) {
                return videoSink.k(j3, new a(cVar, i, j4));
            }
            N0(cVar, i);
            return true;
        }
        int a2 = this.N0.a(j3, j, j2, this.y0.b, z, z2, this.O0);
        e.a aVar2 = this.O0;
        mms0 mms0Var = this.Q0;
        if (mms0Var != null && a2 != 5 && a2 != 4) {
            mms0Var.a(j3, aVar2.a);
        }
        if (a2 == 0) {
            dvf dvfVar = this.h;
            dvfVar.getClass();
            long a3 = dvfVar.a();
            gms0 gms0Var = this.v1;
            if (gms0Var != null) {
                gms0Var.a(j4, a3, aVar, this.R);
            }
            J0(cVar, i, a3);
            Q0(aVar2.a);
            return true;
        }
        if (a2 == 1) {
            long j5 = aVar2.b;
            long j6 = aVar2.a;
            if (j5 == this.o1) {
                N0(cVar, i);
            } else {
                gms0 gms0Var2 = this.v1;
                if (gms0Var2 != null) {
                    i4 = i;
                    gms0Var2.a(j4, j5, aVar, this.R);
                } else {
                    i4 = i;
                }
                J0(cVar, i4, j5);
            }
            Q0(j6);
            this.o1 = j5;
            return true;
        }
        if (a2 == 2) {
            Trace.beginSection("dropVideoBuffer");
            cVar.d(i);
            Trace.endSection();
            O0(0, 1);
            Q0(aVar2.a);
            return true;
        }
        if (a2 == 3) {
            N0(cVar, i);
            Q0(aVar2.a);
            return true;
        }
        if (a2 == 4 || a2 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(a2));
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j
    public final boolean isEnded() {
        if (!this.t0) {
            return false;
        }
        VideoSink videoSink = this.V0;
        return videoSink == null || videoSink.isEnded();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0.elapsedRealtime() < r7.c0) goto L18;
     */
    @Override // androidx.media3.exoplayer.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isReady() {
        boolean isReady;
        boolean z = false;
        if (this.G != null) {
            if (hasReadStreamToEnd()) {
                isReady = this.o;
            } else {
                m0h0 m0h0Var = this.j;
                m0h0Var.getClass();
                isReady = m0h0Var.isReady();
            }
            if (!isReady) {
                if (!(this.e0 >= 0)) {
                    if (this.c0 != C.TIME_UNSET) {
                        dvf dvfVar = this.h;
                        dvfVar.getClass();
                    }
                }
            }
            z = true;
        }
        VideoSink videoSink = this.V0;
        if (videoSink != null) {
            return videoSink.s(z);
        }
        if (z && (this.P == null || this.s1)) {
            return true;
        }
        return this.N0.b(z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void l0() {
        VideoSink videoSink = this.V0;
        if (videoSink != null) {
            videoSink.f();
        }
    }

    @Override // androidx.media3.exoplayer.j
    public final boolean n(long j) {
        if (this.r0 == C.TIME_UNSET || j < this.k1) {
            return false;
        }
        long j2 = this.z0;
        return j2 == C.TIME_UNSET || j > j2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void n0() {
        super.n0();
        this.R0.clear();
        this.i1 = 0;
        this.z1 = 0;
        this.l1 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.j
    public final void q(float f, float f2) throws ExoPlaybackException {
        super.q(f, f2);
        VideoSink videoSink = this.V0;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f);
        } else {
            this.N0.h(f);
        }
        mms0 mms0Var = this.Q0;
        if (mms0Var != null) {
            mms0Var.c(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r0(DecoderInputBuffer decoderInputBuffer) {
        boolean z;
        boolean z2 = false;
        if (!G0(decoderInputBuffer)) {
            boolean z3 = decoderInputBuffer.g < this.m;
            mms0 mms0Var = this.Q0;
            if (mms0Var != null) {
                long j = mms0Var.a == C.TIME_UNSET ? -9223372036854775807L : (long) (((r2 - r6) * mms0Var.c) + mms0Var.b);
                if (j != C.TIME_UNSET && j < this.P0) {
                    z = true;
                    if ((!z3 || z) && !decoderInputBuffer.b(268435456)) {
                        if (decoderInputBuffer.b(67108864)) {
                            decoderInputBuffer.c();
                            z2 = true;
                        }
                        if (z2) {
                            if (z3) {
                                this.x0.d++;
                            } else {
                                this.R0.add(Long.valueOf(decoderInputBuffer.g));
                                this.z1++;
                            }
                        }
                        return z2;
                    }
                }
            }
            z = false;
            if (!z3) {
            }
            if (decoderInputBuffer.b(67108864)) {
            }
            if (z2) {
            }
            return z2;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.j
    public final void render(long j, long j2) throws ExoPlaybackException {
        VideoSink videoSink = this.V0;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
            } catch (VideoSink.VideoSinkException e2) {
                throw r(e2, e2.format, false, 7001);
            }
        }
        super.render(j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.a
    public final void s() {
        g.a aVar = this.K0;
        this.q1 = null;
        this.x1 = C.TIME_UNSET;
        I0();
        this.c1 = false;
        this.u1 = null;
        this.l1 = true;
        try {
            super.s();
            g8l g8lVar = this.x0;
            aVar.getClass();
            synchronized (g8lVar) {
            }
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new od6(8, aVar, g8lVar));
            }
            aVar.a(xgt0.d);
        } catch (Throwable th) {
            g8l g8lVar2 = this.x0;
            aVar.getClass();
            synchronized (g8lVar2) {
                Handler handler2 = aVar.a;
                if (handler2 != null) {
                    handler2.post(new od6(8, aVar, g8lVar2));
                }
                aVar.a(xgt0.d);
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean s0() {
        boolean z;
        androidx.media3.common.a aVar = this.Q;
        long j = this.x1;
        if (j != C.TIME_UNSET) {
            if (this.D0 + 1 + j <= Long.MAX_VALUE - (this.y0.c + j)) {
                z = false;
                return this.j1 == null || this.l1 || this.s1 || (aVar != null && aVar.p > 0) || z || this.y0.e != C.TIME_UNSET;
            }
        }
        z = true;
        if (this.j1 == null) {
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void t(boolean z, boolean z2) throws ExoPlaybackException {
        d.C0069d c0069d;
        this.x0 = new g8l();
        wyf0 wyf0Var = this.e;
        wyf0Var.getClass();
        boolean z3 = wyf0Var.b;
        fxc0.z((z3 && this.t1 == 0) ? false : true);
        if (this.s1 != z3) {
            this.s1 = z3;
            k0();
        }
        g8l g8lVar = this.x0;
        g.a aVar = this.K0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new ger(2, aVar, g8lVar));
        }
        boolean z4 = this.W0;
        androidx.media3.exoplayer.video.e eVar = this.N0;
        if (!z4) {
            if (this.Y0 != null && this.V0 == null) {
                d.b bVar = new d.b(this.I0, eVar);
                bVar.d = true;
                long j = this.P0;
                long j2 = C.TIME_UNSET;
                if (j != C.TIME_UNSET) {
                    j2 = -j;
                }
                bVar.g = j2;
                dvf dvfVar = this.h;
                dvfVar.getClass();
                bVar.e = dvfVar;
                fxc0.z(!bVar.f);
                if (bVar.c == null) {
                    bVar.c = new d.g();
                }
                androidx.media3.exoplayer.video.d dVar = new androidx.media3.exoplayer.video.d(bVar);
                bVar.f = true;
                if (1 >= dVar.z) {
                    dVar.z = 1;
                }
                SparseArray<d.C0069d> sparseArray = dVar.c;
                if (y2r0.l(sparseArray, 0)) {
                    c0069d = sparseArray.get(0);
                } else {
                    d.C0069d c0069d2 = dVar.new C0069d(dVar.a);
                    dVar.h.add(c0069d2);
                    sparseArray.put(0, c0069d2);
                    c0069d = c0069d2;
                }
                this.V0 = c0069d;
            }
            this.W0 = true;
        }
        VideoSink videoSink = this.V0;
        if (videoSink == null) {
            dvf dvfVar2 = this.h;
            dvfVar2.getClass();
            eVar.l = dvfVar2;
            eVar.e(!z2 ? 1 : 0);
            return;
        }
        videoSink.j(new androidx.media3.exoplayer.video.b(this), kzm.INSTANCE);
        gms0 gms0Var = this.v1;
        if (gms0Var != null) {
            this.V0.l(gms0Var);
        }
        if (this.Z0 != null && !this.b1.equals(jxj0.c)) {
            this.V0.v(this.Z0, this.b1);
        }
        this.V0.i(this.e1);
        this.V0.setPlaybackSpeed(this.N);
        List<p8p> list = this.Y0;
        if (list != null) {
            this.V0.r(list);
        }
        this.X0 = !z2 ? 1 : 0;
        this.B0 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean t0(hq10 hq10Var) {
        return F0(hq10Var);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.a
    public final void u(long j, boolean z, boolean z2) throws ExoPlaybackException {
        VideoSink videoSink = this.V0;
        if (videoSink != null && !z) {
            videoSink.u(true);
        }
        if (z2) {
            this.k1 = j;
        }
        super.u(j, z, z2);
        VideoSink videoSink2 = this.V0;
        androidx.media3.exoplayer.video.e eVar = this.N0;
        if (videoSink2 == null) {
            eVar.b.b();
            eVar.h = C.TIME_UNSET;
            eVar.f = C.TIME_UNSET;
            eVar.e = Math.min(eVar.e, 1);
            eVar.i = C.TIME_UNSET;
        }
        mms0 mms0Var = this.Q0;
        if (mms0Var != null) {
            mms0Var.b();
        }
        if (z) {
            VideoSink videoSink3 = this.V0;
            if (videoSink3 != null) {
                videoSink3.o(false);
            } else {
                eVar.c(false);
            }
        }
        I0();
        this.h1 = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean u0() {
        hq10 hq10Var = this.W;
        if (this.V0 != null && hq10Var != null) {
            String str = hq10Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.u0();
    }

    @Override // androidx.media3.exoplayer.a
    public final void v() {
        VideoSink videoSink = this.V0;
        if (videoSink == null || !this.J0) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.a
    public final void w() {
        try {
            try {
                this.h0 = false;
                m0();
                k0();
                DrmSession drmSession = this.J;
                if (drmSession != null) {
                    drmSession.b(null);
                }
                this.J = null;
            } catch (Throwable th) {
                DrmSession drmSession2 = this.J;
                if (drmSession2 != null) {
                    drmSession2.b(null);
                }
                this.J = null;
                throw th;
            }
        } finally {
            this.W0 = false;
            this.w1 = C.TIME_UNSET;
            PlaceholderSurface placeholderSurface = this.a1;
            if (placeholderSurface != null) {
                placeholderSurface.release();
                this.a1 = null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int w0(androidx.media3.exoplayer.mediacodec.e eVar, androidx.media3.common.a aVar) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!io20.p(aVar.n)) {
            return k.f(0, 0, 0, 0);
        }
        boolean z2 = aVar.r != null;
        Context context = this.I0;
        List<hq10> C0 = C0(context, eVar, aVar, z2, false);
        if (z2 && C0.isEmpty()) {
            C0 = C0(context, eVar, aVar, false, false);
        }
        if (C0.isEmpty()) {
            return k.f(1, 0, 0, 0);
        }
        int i2 = aVar.O;
        if (i2 != 0 && i2 != 2) {
            return k.f(2, 0, 0, 0);
        }
        hq10 hq10Var = C0.get(0);
        boolean e2 = hq10Var.e(context, aVar);
        if (!e2) {
            for (int i3 = 1; i3 < C0.size(); i3++) {
                hq10 hq10Var2 = C0.get(i3);
                if (hq10Var2.e(context, aVar)) {
                    z = false;
                    e2 = true;
                    hq10Var = hq10Var2;
                    break;
                }
            }
        }
        z = true;
        int i4 = e2 ? 4 : 3;
        int i5 = hq10Var.g(aVar) ? 16 : 8;
        int i6 = hq10Var.h ? 64 : 0;
        int i7 = z ? 128 : 0;
        if ("video/dolby-vision".equals(aVar.n) && !b.a(context)) {
            i7 = 256;
        }
        if (e2) {
            List<hq10> C02 = C0(context, eVar, aVar, z2, true);
            if (!C02.isEmpty()) {
                HashMap<MediaCodecUtil.a, List<hq10>> hashMap = MediaCodecUtil.a;
                ArrayList arrayList = new ArrayList(C02);
                Collections.sort(arrayList, new lq10(new f8x(context, aVar)));
                hq10 hq10Var3 = (hq10) arrayList.get(0);
                if (hq10Var3.e(context, aVar) && hq10Var3.g(aVar)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // androidx.media3.exoplayer.a
    public final void x() {
        this.g1 = 0;
        dvf dvfVar = this.h;
        dvfVar.getClass();
        this.f1 = dvfVar.elapsedRealtime();
        this.m1 = 0L;
        this.n1 = 0;
        VideoSink videoSink = this.V0;
        if (videoSink != null) {
            videoSink.q();
        } else {
            this.N0.d();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void y() {
        H0();
        final int i = this.n1;
        if (i != 0) {
            final long j = this.m1;
            final g.a aVar = this.K0;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: xsna.wct0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.video.g gVar = aVar.b;
                        String str = y2r0.a;
                        gVar.m(i, j);
                    }
                });
            }
            this.m1 = 0L;
            this.n1 = 0;
        }
        VideoSink videoSink = this.V0;
        if (videoSink != null) {
            videoSink.h();
        } else {
            androidx.media3.exoplayer.video.e eVar = this.N0;
            eVar.d = false;
            eVar.i = C.TIME_UNSET;
            nms0 nms0Var = eVar.b;
            nms0Var.d = false;
            nms0.a aVar2 = nms0Var.c;
            if (aVar2 != null) {
                aVar2.b();
            }
            nms0Var.a();
        }
        mms0 mms0Var = this.Q0;
        if (mms0Var != null) {
            mms0Var.b();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.a
    public final void z(androidx.media3.common.a[] aVarArr, long j, long j2, i.b bVar) throws ExoPlaybackException {
        super.z(aVarArr, j, j2, bVar);
        P0(bVar);
        mms0 mms0Var = this.Q0;
        if (mms0Var != null) {
            mms0Var.b();
        }
    }
}

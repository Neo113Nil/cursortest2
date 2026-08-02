package com.android.grafika;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.view.Surface;
import com.android.grafika.EncoderConfig;
import java.io.IOException;
import ru.ok.gpu.SharedEglContext;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.settings.EncoderSettings;
import ru.ok.media.utils.TimeSampler;
import ru.ok.media.utils.VideoSize;
import xsna.bjs0;
import xsna.hap;
import xsna.ne7;
import xsna.ul9;
import xsna.zrx0;

/* compiled from: VideoEncoderSurface.java */
/* loaded from: classes12.dex */
public final class a extends bjs0 {
    public static String q;
    public final Context h;
    public Surface i;
    public hap j;
    public zrx0 k;
    public boolean l;
    public ul9 m;
    public EGLContext n;
    public volatile TimeSampler o;
    public EncoderConfig p;

    public a(Context context, EncoderSettings encoderSettings, LoggerInterface loggerInterface) {
        super(encoderSettings, loggerInterface);
        this.l = false;
        this.o = new TimeSampler();
        this.h = context;
    }

    public static MediaCodec e() {
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
            if (createEncoderByType != null) {
                q = createEncoderByType.getName() + "/surf";
            }
            return createEncoderByType;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // xsna.bjs0
    public final synchronized void c() {
        super.c();
    }

    @Override // xsna.bjs0
    public final void d() {
        g();
        h();
        Surface surface = this.i;
        if (surface != null) {
            try {
                surface.release();
            } catch (RuntimeException unused) {
            }
            this.i = null;
        }
        super.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (r0.isBitrateModeSupported(3) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if (r0.isBitrateModeSupported(2) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(EncoderConfig encoderConfig) {
        Throwable th;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        int i;
        try {
            try {
                h();
                Surface surface = this.i;
                if (surface != null) {
                    try {
                        try {
                            surface.release();
                        } catch (RuntimeException unused) {
                        }
                        this.i = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                super.d();
                MediaCodec e = e();
                this.e = e;
                e.getCodecInfo().getName();
                this.d = encoderConfig.c;
                int i2 = encoderConfig.a;
                int i3 = encoderConfig.b;
                int i4 = encoderConfig.d;
                int i5 = encoderConfig.e;
                if (i4 > 0 || i5 == 0) {
                    i4 = (int) ((i4 * (100 - i5)) / 100);
                }
                int i6 = i4;
                EncoderConfig.CBRMode cBRMode = encoderConfig.h;
                if ((cBRMode == EncoderConfig.CBRMode.ENFORCED || (cBRMode == EncoderConfig.CBRMode.ENABLED && Build.VERSION.SDK_INT >= 31)) && (capabilitiesForType = this.e.getCodecInfo().getCapabilitiesForType("video/avc")) != null && (r0 = capabilitiesForType.getEncoderCapabilities()) != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        i = 3;
                    }
                    i = 2;
                }
                i = -1;
                MediaFormat a = a(i2, this.e.getName() + "_surf", i3, i6, i, encoderConfig.f, encoderConfig.g);
                this.b.a(Math.min(a.getInteger("width"), a.getInteger("height")), this.e.getName());
                this.e.configure(a, (Surface) null, (MediaCrypto) null, 1);
                this.i = this.e.createInputSurface();
                this.p = encoderConfig;
                this.e.start();
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void g() {
        if (this.k == null && this.m == null && this.j == null) {
            return;
        }
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(SharedEglContext.EGL_DRAW);
        h();
        ul9 ul9Var = this.m;
        if (ul9Var != null) {
            GLES20.glDeleteProgram(ul9Var.e);
            ul9Var.e = -1;
            this.m = null;
        }
        hap hapVar = this.j;
        if (hapVar != null) {
            hapVar.b = EGL14.EGL_NO_DISPLAY;
            hapVar.c = EGL14.EGL_NO_CONTEXT;
            hapVar.d = null;
            this.j = null;
        }
        if (!EGL14.eglMakeCurrent(eglGetDisplay, eglGetCurrentSurface, eglGetCurrentSurface, eglGetCurrentContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void h() {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(SharedEglContext.EGL_DRAW);
        zrx0 zrx0Var = this.k;
        this.k = null;
        if (zrx0Var != null) {
            try {
                hap hapVar = (hap) zrx0Var.a;
                EGLSurface eGLSurface = (EGLSurface) zrx0Var.b;
                EGLDisplay eGLDisplay = (EGLDisplay) hapVar.b;
                EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) hapVar.c)) {
                    throw new RuntimeException("eglMakeCurrent failed");
                }
                EGL14.eglDestroySurface((EGLDisplay) ((hap) zrx0Var.a).b, (EGLSurface) zrx0Var.b);
                zrx0Var.b = EGL14.EGL_NO_SURFACE;
                int eglGetError = EGL14.eglGetError();
                if (eglGetError != 12288) {
                    ne7.n("com.android.grafika.a", "GL error while releasing input surface, : glError 0x" + Integer.toHexString(eglGetError));
                }
            } catch (RuntimeException e) {
                ne7.n("com.android.grafika.a", "Failed with exception " + e + "\n" + Log.getStackTraceString(e));
                if (!"eglMakeCurrent failed".equals(e.getMessage())) {
                    throw e;
                }
            }
        }
        if (!EGL14.EGL_NO_CONTEXT.equals(eglGetCurrentContext) && !EGL14.eglMakeCurrent(eglGetDisplay, eglGetCurrentSurface, eglGetCurrentSurface, eglGetCurrentContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final boolean i(VideoSize videoSize) {
        Range<Double> achievableFrameRatesFor;
        MediaCodec e = e();
        this.e = e;
        boolean z = false;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = e.getCodecInfo().getCapabilitiesForType("video/avc");
            if (capabilitiesForType.getVideoCapabilities().isSizeSupported(videoSize.getWidth(), videoSize.getHeight()) && (achievableFrameRatesFor = capabilitiesForType.getVideoCapabilities().getAchievableFrameRatesFor(videoSize.getWidth(), videoSize.getHeight())) != null) {
                if (achievableFrameRatesFor.getUpper().doubleValue() > 22) {
                    z = true;
                }
            }
        } catch (RuntimeException unused) {
        }
        this.e.release();
        return z;
    }
}

package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import io.agora.base.ColorSpace;
import io.agora.base.internal.Logging;
import io.agora.base.internal.video.EglBase;
import java.util.concurrent.locks.ReadWriteLock;
import lb.C5444x;

@TargetApi(18)
/* loaded from: classes2.dex */
public class EglBase14 implements EglBase {
    private static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    private static final int EGLExt_SDK_VERSION = 18;
    private static final String TAG = "EglBase14";
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private boolean mIsDisplay;
    private int transferID;

    public static class Context implements EglBase.Context {
        private final EGLContext egl14Context;
        private int glesVersion = 2;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Context)) {
                return super.equals(obj);
            }
            Context context = (Context) obj;
            EGLContext eGLContext = this.egl14Context;
            return eGLContext != null ? eGLContext.equals(context.egl14Context) : context.egl14Context == null;
        }

        public EGLContext getEglContext() {
            return this.egl14Context;
        }

        public int getGlesVersion() {
            return this.glesVersion;
        }

        @Override // io.agora.base.internal.video.EglBase.Context
        @TargetApi(21)
        public long getNativeEglContext() {
            return EglBase14.CURRENT_SDK_VERSION >= 21 ? this.egl14Context.getNativeHandle() : this.egl14Context.getHandle();
        }

        public int hashCode() {
            EGLContext eGLContext = this.egl14Context;
            return eGLContext != null ? eGLContext.hashCode() : super.hashCode();
        }

        @Override // io.agora.base.internal.video.EglBase.Context
        public void setGlesVersion(int i10) {
            this.glesVersion = i10;
        }
    }

    public EglBase14(Context context, int[] iArr) {
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        this.transferID = ColorSpace.Transfer.Unspecified.getTransfer();
        Logging.i(TAG, "construct1: " + this);
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig, 0);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    private static EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext;
        if (context != null && context.egl14Context == EGL14.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int glesVersion = context != null ? context.getGlesVersion() : 2;
        if ((HdrUtil.is10BitLumaDepth(i10) || HdrUtil.isNeedTransToHdrVision(i10)) && HdrUtil.isSupportedEGL3()) {
            glesVersion = 3;
        }
        int[] iArr = {12440, glesVersion, 12344};
        EGLContext eGLContext = context == null ? EGL14.EGL_NO_CONTEXT : context.egl14Context;
        synchronized (EglBase.lock) {
            eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new RuntimeException("Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
        }
        checkIsNotReleased();
        if (hasSurface()) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        int[] iArr = {12344};
        if (HdrUtil.isHDRConfig(this.mIsDisplay, this.transferID)) {
            if (this.transferID == ColorSpace.Transfer.SMPTEST2084.getTransfer()) {
                iArr = EglBase.EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            } else if (this.transferID == ColorSpace.Transfer.ARIB_STD_B67.getTransfer()) {
                iArr = EglBase.EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            } else if (HdrUtil.isNeedTransToHdrVision(this.transferID)) {
                iArr = EglBase.EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            }
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, iArr, 0);
        this.eglSurface = eglCreateWindowSurface;
        if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new RuntimeException("Failed to create window surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw new RuntimeException("eglChooseConfig failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        if (iArr2[0] <= 0) {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new RuntimeException("eglChooseConfig returned null");
    }

    private static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("Unable to get EGL14 display: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new RuntimeException("Unable to initialize EGL14: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    public static boolean isEGL14Supported() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SDK version: ");
        int i10 = CURRENT_SDK_VERSION;
        sb2.append(i10);
        sb2.append(". isEGL14Supported: ");
        sb2.append(i10 >= 18);
        Logging.i(TAG, sb2.toString());
        return isEGL14SupportedImpl();
    }

    public static boolean isEGL14SupportedImpl() {
        return CURRENT_SDK_VERSION >= 18;
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createPbufferSurface(int i10, int i11) {
        checkIsNotReleased();
        if (hasSurface()) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        int[] iArr = {12375, i10, 12374, i11, 12344};
        if (HdrUtil.isHDRConfig(this.mIsDisplay, this.transferID)) {
            if (this.transferID == ColorSpace.Transfer.SMPTEST2084.getTransfer()) {
                iArr = new int[]{12375, i10, 12374, i11, EglBase.EGL_GL_COLORSPACE_KHR, EglBase.EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
            } else if (this.transferID == ColorSpace.Transfer.ARIB_STD_B67.getTransfer()) {
                iArr = new int[]{12375, i10, 12374, i11, EglBase.EGL_GL_COLORSPACE_KHR, EglBase.EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
            } else if (HdrUtil.isNeedTransToHdrVision(this.transferID)) {
                iArr = new int[]{12375, i10, 12374, i11, EglBase.EGL_GL_COLORSPACE_KHR, EglBase.EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
            }
        }
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, iArr, 0);
        this.eglSurface = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new RuntimeException("Failed to create pixel buffer surface with size " + i10 + C5444x.f55808b + i11 + ": 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // io.agora.base.internal.video.EglBase
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            try {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public boolean hasSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        return (eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) ? false : true;
    }

    @Override // io.agora.base.internal.video.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't make current");
        }
        synchronized (EglBase.lock) {
            try {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()) + ", eglDisplay: " + this.eglDisplay + ", eglSurface:" + this.eglSurface + ", eglContext:" + this.eglContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public void release() {
        Logging.i(TAG, "release() start " + this);
        checkIsNotReleased();
        releaseSurface();
        ReadWriteLock readWriteLock = EglBase.rwlock;
        readWriteLock.writeLock().lock();
        try {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    Logging.e(TAG, "eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    readWriteLock.writeLock().unlock();
                    return;
                }
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
                readWriteLock.writeLock().unlock();
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.eglDisplay);
                this.eglContext = EGL14.EGL_NO_CONTEXT;
                this.eglDisplay = EGL14.EGL_NO_DISPLAY;
                this.eglConfig = null;
                Logging.i(TAG, "release() done " + this);
            }
        } catch (Throwable th2) {
            EglBase.rwlock.writeLock().unlock();
            throw th2;
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public void setPresentationTime(long j10) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface can't swap buffers");
        }
        EGLExt.eglPresentationTimeANDROID(this.eglDisplay, eGLSurface, j10);
    }

    @Override // io.agora.base.internal.video.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // io.agora.base.internal.video.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // io.agora.base.internal.video.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // io.agora.base.internal.video.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // io.agora.base.internal.video.EglBase
    public void swapBuffers(long j10) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j10);
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    public EglBase14(Context context, int i10, boolean z10, EglBase.EglConfigType eglConfigType) {
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        this.transferID = ColorSpace.Transfer.Unspecified.getTransfer();
        Logging.i(TAG, "construct2: " + this);
        this.transferID = i10;
        this.mIsDisplay = z10;
        int[] eglConfigAttributes = eglConfigType.getEglConfigAttributes();
        if (HdrUtil.isHDRConfig(z10, i10)) {
            if (HdrUtil.isSupportedEGL3()) {
                eglConfigAttributes = EglBase.EGL_CONFIG_ATTRIBUTES_RGBA_1010102_EGL30;
                Logging.d(TAG, "Encoders will use EglBase14 in RGBA_1010102_EGL30");
            } else {
                eglConfigAttributes = EglBase.EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
                Logging.d(TAG, "Encoders will use EglBase14 in RGBA_1010102");
            }
        }
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, eglConfigAttributes);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig, i10);
    }
}

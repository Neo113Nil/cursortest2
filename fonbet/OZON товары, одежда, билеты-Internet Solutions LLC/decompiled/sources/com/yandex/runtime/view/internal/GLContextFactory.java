package com.yandex.runtime.view.internal;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.yandex.runtime.graphics.GLContextVersionBinding;
import com.yandex.runtime.logging.Logger;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes9.dex */
public class GLContextFactory implements GLSurfaceView.EGLContextFactory {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_CONTEXT_FLAGS_KHR = 12540;
    private static final int EGL_CONTEXT_OPENGL_DEBUG_BIT_KHR = 1;
    private final boolean debugEnabled;
    private final GLVersionProvider glVersionProvider;

    public GLContextFactory(boolean z11, GLVersionProvider gLVersionProvider) {
        this.debugEnabled = z11;
        this.glVersionProvider = gLVersionProvider;
    }

    private int[] attributes(int i11, boolean z11) {
        return z11 ? new int[]{EGL_CONTEXT_CLIENT_VERSION, i11, EGL_CONTEXT_FLAGS_KHR, 1, 12344} : new int[]{EGL_CONTEXT_CLIENT_VERSION, i11, 12344};
    }

    private EGLContext tryCreateContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, boolean z11) {
        Logger.info("Creating OpenGl ES context version 3, depth bits " + String.valueOf(this.glVersionProvider.getDepthBits()));
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, attributes(3, z11));
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext;
        boolean z11 = this.debugEnabled;
        EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
        if (z11) {
            Logger.warn("Trying to create debug gl context");
            eGLContext = tryCreateContext(egl10, eGLDisplay, eGLConfig, true);
            if (eGLContext == null || eGLContext == eGLContext2) {
                Logger.warn("Could not create debug gl context; Got EGL error " + egl10.eglGetError());
            }
        } else {
            eGLContext = null;
        }
        if ((eGLContext == null || eGLContext == eGLContext2) && ((eGLContext = tryCreateContext(egl10, eGLDisplay, eGLConfig, false)) == null || eGLContext == eGLContext2)) {
            throw new RuntimeException("eglCreateContext() failed; Got EGL error " + egl10.eglGetError());
        }
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(33308, iArr, 0);
        int i11 = iArr[0];
        int depthBits = this.glVersionProvider.getDepthBits();
        Logger.info("Created OpenGl ES context version 3." + String.valueOf(i11));
        GLContextVersionBinding.setDepthBits(depthBits);
        return eGLContext;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            return;
        }
        throw new RuntimeException("eglDestroyContext() failed; Got EGL error " + egl10.eglGetError());
    }
}

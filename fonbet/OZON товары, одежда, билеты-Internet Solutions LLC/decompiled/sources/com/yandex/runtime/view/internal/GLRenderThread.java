package com.yandex.runtime.view.internal;

import Ve.C4598rp;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes9.dex */
class GLRenderThread extends Thread {
    private EGLConfigChooserImpl configChooser;
    private EGL10 egl;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private boolean forceRender;

    /* renamed from: gl, reason: collision with root package name */
    private GL10 f60754gl;
    private GLContextFactory glContextFactory;
    private Rect newViewport;
    private boolean paused;
    private GLSurfaceView.Renderer renderer;
    private boolean requested;
    private boolean stopped;
    private Object surface;

    GLRenderThread(Object obj, EGLConfigChooserImpl eGLConfigChooserImpl, GLContextFactory gLContextFactory, GLSurfaceView.Renderer renderer) {
        super("YMK_RenderThread");
        this.stopped = false;
        this.requested = false;
        this.paused = false;
        this.forceRender = false;
        this.newViewport = null;
        this.surface = obj;
        this.configChooser = eGLConfigChooserImpl;
        this.glContextFactory = gLContextFactory;
        this.renderer = renderer;
    }

    private void checkEglError(String str) {
        int eglGetError = this.egl.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(C4598rp.c(eglGetError, str, "; Got EGL error "));
        }
    }

    private void finishGL() {
        EGL10 egl10 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        checkEglError("eglMakeCurrent() failed");
        this.glContextFactory.destroyContext(this.egl, this.eglDisplay, this.eglContext);
        this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
        checkEglError("eglDestroySurface() failed");
    }

    private void initGL() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.eglDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay() failed");
        }
        this.egl.eglInitialize(eglGetDisplay, new int[2]);
        checkEglError("eglInitialize() failed");
        EGLConfig chooseConfig = this.configChooser.chooseConfig(this.egl, this.eglDisplay);
        this.eglConfig = chooseConfig;
        this.eglContext = this.glContextFactory.createContext(this.egl, this.eglDisplay, chooseConfig);
        this.eglSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surface, null);
        checkEglError("eglCreateWindowSurface() failed");
        EGL10 egl102 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext);
        checkEglError("eglMakeCurrent() failed");
        this.f60754gl = (GL10) this.eglContext.getGL();
    }

    public synchronized void finish() {
        this.stopped = true;
        notifyAll();
    }

    public synchronized void onPause() {
        this.paused = true;
    }

    public synchronized void onResume() {
        this.paused = false;
        this.requested = true;
        notifyAll();
    }

    public synchronized void onSizeChanged(int i11, int i12) {
        this.newViewport = new Rect(0, 0, i11, i12);
        requestRender();
    }

    public synchronized void requestRender() {
        try {
            if (this.paused) {
                if (this.forceRender) {
                }
            }
            this.requested = true;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[EDGE_INSN: B:17:0x0024->B:18:0x0024 BREAK  A[LOOP:1: B:3:0x000d->B:15:0x000d], SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        boolean z11;
        boolean z12;
        Rect rect;
        initGL();
        this.renderer.onSurfaceCreated(this.f60754gl, this.eglConfig);
        while (true) {
            synchronized (this) {
                while (true) {
                    try {
                        z11 = this.paused;
                        if (z11) {
                            if (this.forceRender) {
                            }
                            if (!this.stopped) {
                                break;
                            } else {
                                try {
                                    wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        if (this.requested) {
                            break;
                        }
                        if (!this.stopped) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.stopped) {
                    finishGL();
                    return;
                }
                this.requested = false;
                if (!z11 && (rect = this.newViewport) != null) {
                    this.renderer.onSurfaceChanged(this.f60754gl, rect.width(), this.newViewport.height());
                    this.newViewport = null;
                }
                z12 = this.paused;
            }
            this.renderer.onDrawFrame(this.f60754gl);
            if (!z12) {
                this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
        }
    }

    public synchronized void setForceRender(boolean z11) {
        this.forceRender = z11;
    }
}

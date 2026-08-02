package org.maplibre.android.maps.renderer.textureview;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.renderer.egl.EGLConfigChooser;

/* loaded from: classes10.dex */
public class GLTextureViewRenderThread extends TextureViewRenderThread {

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    private final EGLHolder f79930n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f79931o;

    private static class EGLHolder {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<TextureView> f79932a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f79933b;

        /* renamed from: c, reason: collision with root package name */
        private EGL10 f79934c;

        /* renamed from: d, reason: collision with root package name */
        private EGLConfig f79935d;

        /* renamed from: e, reason: collision with root package name */
        private EGLDisplay f79936e = EGL10.EGL_NO_DISPLAY;

        /* renamed from: f, reason: collision with root package name */
        private EGLContext f79937f = EGL10.EGL_NO_CONTEXT;

        /* renamed from: g, reason: collision with root package name */
        private EGLSurface f79938g = EGL10.EGL_NO_SURFACE;

        EGLHolder(boolean z11, WeakReference weakReference) {
            this.f79932a = weakReference;
            this.f79933b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            EGLContext eGLContext = this.f79937f;
            EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
            if (eGLContext == eGLContext2) {
                return;
            }
            if (!this.f79934c.eglDestroyContext(this.f79936e, eGLContext)) {
                Logger.w("Mbgl-TextureViewRenderThread", String.format("Could not destroy egl context. Display %s, Context %s", this.f79936e, this.f79937f));
            }
            this.f79937f = eGLContext2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            EGLSurface eGLSurface = this.f79938g;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface == eGLSurface2) {
                return;
            }
            if (!this.f79934c.eglDestroySurface(this.f79936e, eGLSurface)) {
                Logger.w("Mbgl-TextureViewRenderThread", String.format("Could not destroy egl surface. Display %s, Surface %s", this.f79936e, this.f79938g));
            }
            this.f79938g = eGLSurface2;
        }

        final void e() {
            i();
            h();
            EGLDisplay eGLDisplay = this.f79936e;
            EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
            if (eGLDisplay == eGLDisplay2) {
                return;
            }
            if (!this.f79934c.eglTerminate(eGLDisplay)) {
                Logger.w("Mbgl-TextureViewRenderThread", String.format("Could not terminate egl. Display %s", this.f79936e));
            }
            this.f79936e = eGLDisplay2;
        }

        @NonNull
        final void f() {
        }

        final boolean g() {
            i();
            TextureView textureView = this.f79932a.get();
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (textureView == null || textureView.getSurfaceTexture() == null) {
                this.f79938g = eGLSurface;
            } else {
                this.f79938g = this.f79934c.eglCreateWindowSurface(this.f79936e, this.f79935d, textureView.getSurfaceTexture(), new int[]{12344});
            }
            EGLSurface eGLSurface2 = this.f79938g;
            if (eGLSurface2 == null || eGLSurface2 == eGLSurface) {
                if (this.f79934c.eglGetError() == 12299) {
                    Logger.e("Mbgl-TextureViewRenderThread", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f79934c.eglMakeCurrent(this.f79936e, eGLSurface2, eGLSurface2, this.f79937f)) {
                return true;
            }
            Logger.w("Mbgl-TextureViewRenderThread", "eglMakeCurrent: " + this.f79934c.eglGetError());
            return false;
        }

        final void j() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f79934c = egl10;
            EGLDisplay eGLDisplay = this.f79936e;
            EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
            if (eGLDisplay == eGLDisplay2) {
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                this.f79936e = eglGetDisplay;
                if (eglGetDisplay == eGLDisplay2) {
                    throw new RuntimeException("eglGetDisplay failed");
                }
                if (!this.f79934c.eglInitialize(eglGetDisplay, new int[2])) {
                    throw new RuntimeException("eglInitialize failed");
                }
            }
            WeakReference<TextureView> weakReference = this.f79932a;
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (weakReference == null) {
                this.f79935d = null;
                this.f79937f = eGLContext;
            } else if (this.f79937f == eGLContext) {
                EGLConfig chooseConfig = new EGLConfigChooser(this.f79933b).chooseConfig(this.f79934c, this.f79936e);
                this.f79935d = chooseConfig;
                this.f79937f = this.f79934c.eglCreateContext(this.f79936e, chooseConfig, eGLContext, new int[]{12440, 2, 12344});
            }
            if (this.f79937f == eGLContext) {
                throw new RuntimeException("createContext");
            }
        }

        final int k() {
            if (this.f79934c.eglSwapBuffers(this.f79936e, this.f79938g)) {
                return 12288;
            }
            return this.f79934c.eglGetError();
        }
    }

    public GLTextureViewRenderThread(@NonNull TextureView textureView, @NonNull TextureViewMapRenderer textureViewMapRenderer) {
        super(textureView, textureViewMapRenderer);
        this.f79930n = new EGLHolder(textureViewMapRenderer.a(), new WeakReference(textureView));
    }

    @Override // org.maplibre.android.maps.renderer.textureview.TextureViewRenderThread, android.view.TextureView.SurfaceTextureListener
    public final /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i11;
        Runnable remove;
        boolean z11;
        boolean z12;
        int i12;
        while (true) {
            try {
                synchronized (this.f79943b) {
                    while (!this.f79953l) {
                        i11 = -1;
                        if (this.f79944c.isEmpty()) {
                            if (this.f79952k) {
                                this.f79930n.i();
                                this.f79952k = false;
                                this.f79946e = false;
                                this.f79943b.notifyAll();
                            } else if (this.f79931o) {
                                this.f79930n.h();
                                this.f79931o = false;
                            } else if (this.f79945d == null || this.f79951j || !this.f79949h) {
                                this.f79943b.wait();
                            } else {
                                i11 = this.f79947f;
                                int i13 = this.f79948g;
                                if (this.f79930n.f79937f == EGL10.EGL_NO_CONTEXT) {
                                    this.f79946e = true;
                                    z11 = true;
                                    z12 = false;
                                } else if (this.f79930n.f79938g == EGL10.EGL_NO_SURFACE) {
                                    this.f79946e = true;
                                    z12 = true;
                                    z11 = false;
                                } else {
                                    this.f79949h = false;
                                    z11 = false;
                                    z12 = false;
                                }
                                i12 = i13;
                                remove = null;
                            }
                            z11 = false;
                            z12 = false;
                            i12 = -1;
                            remove = null;
                        } else {
                            remove = this.f79944c.remove(0);
                            z11 = false;
                            z12 = false;
                            i12 = -1;
                        }
                    }
                    this.f79930n.e();
                    synchronized (this.f79943b) {
                        this.f79946e = false;
                        this.f79954m = true;
                        this.f79943b.notifyAll();
                    }
                    return;
                }
                if (remove != null) {
                    remove.run();
                } else {
                    this.f79930n.f();
                    if (z11) {
                        this.f79930n.j();
                        synchronized (this.f79943b) {
                            try {
                                if (this.f79930n.g()) {
                                    this.f79942a.onSurfaceCreated(null);
                                    this.f79942a.onSurfaceChanged(i11, i12);
                                } else {
                                    this.f79952k = true;
                                }
                            } finally {
                            }
                        }
                    } else if (z12) {
                        synchronized (this.f79943b) {
                            this.f79930n.g();
                        }
                        this.f79942a.onSurfaceChanged(i11, i12);
                    } else if (this.f79950i) {
                        this.f79942a.onSurfaceChanged(i11, i12);
                        this.f79950i = false;
                    } else if (this.f79930n.f79938g != EGL10.EGL_NO_SURFACE) {
                        this.f79942a.onDrawFrame();
                        int k11 = this.f79930n.k();
                        if (k11 == 12288) {
                            continue;
                        } else if (k11 != 12302) {
                            Logger.w("Mbgl-TextureViewRenderThread", "eglSwapBuffer error: " + k11 + ". Waiting or new surface");
                            synchronized (this.f79943b) {
                                this.f79945d = null;
                                this.f79952k = true;
                            }
                        } else {
                            Logger.w("Mbgl-TextureViewRenderThread", "Context lost. Waiting for re-aquire");
                            synchronized (this.f79943b) {
                                this.f79945d = null;
                                this.f79952k = true;
                                this.f79931o = true;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f79930n.e();
                synchronized (this.f79943b) {
                    this.f79946e = false;
                    this.f79954m = true;
                    this.f79943b.notifyAll();
                    return;
                }
            } catch (Throwable th2) {
                this.f79930n.e();
                synchronized (this.f79943b) {
                    this.f79946e = false;
                    this.f79954m = true;
                    this.f79943b.notifyAll();
                    throw th2;
                }
            }
        }
    }
}

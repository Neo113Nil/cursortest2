package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlUtil;
import java.util.Locale;
import ru.ok.gpu.SharedEglContext;
import xsna.ahn;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class PlaceholderSurface extends Surface {
    public static int e;
    public static boolean f;
    public final boolean b;
    public final a c;
    public boolean d;

    public static class a extends HandlerThread implements Handler.Callback {
        public androidx.media3.common.util.a b;
        public Handler c;

        @Nullable
        public Error d;

        @Nullable
        public RuntimeException e;

        @Nullable
        public PlaceholderSurface f;

        public final void a(int i) throws GlUtil.GlException {
            EGLSurface eglCreatePbufferSurface;
            this.b.getClass();
            androidx.media3.common.util.a aVar = this.b;
            int[] iArr = aVar.c;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.e("eglGetDisplay failed", eglGetDisplay != null);
            int[] iArr2 = new int[2];
            GlUtil.e("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
            aVar.d = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr3 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, androidx.media3.common.util.a.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
            boolean z = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
            String str = y2r0.a;
            GlUtil.e(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(aVar.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, 2, 12344} : new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, 2, 12992, 1, 12344}, 0);
            GlUtil.e("eglCreateContext failed", eglCreateContext != null);
            aVar.e = eglCreateContext;
            EGLDisplay eGLDisplay = aVar.d;
            if (i == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                GlUtil.e("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
            }
            GlUtil.e("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
            aVar.f = eglCreatePbufferSurface;
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.d();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            aVar.g = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(aVar);
            SurfaceTexture surfaceTexture2 = this.b.g;
            surfaceTexture2.getClass();
            this.f = new PlaceholderSurface(this, surfaceTexture2, i != 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            this.b.getClass();
            androidx.media3.common.util.a aVar = this.b;
            aVar.b.removeCallbacks(aVar);
            try {
                SurfaceTexture surfaceTexture = aVar.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, aVar.c, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = aVar.d;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = aVar.d;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = aVar.f;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(aVar.d, aVar.f);
                }
                EGLContext eGLContext = aVar.e;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(aVar.d, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = aVar.d;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(aVar.d);
                }
                aVar.d = null;
                aVar.e = null;
                aVar.f = null;
                aVar.g = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i == 1) {
                    try {
                        a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (GlUtil.GlException e) {
                        ahn.o("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.e = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e2) {
                        ahn.o("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.d = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e3) {
                        ahn.o("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                        this.e = e3;
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i == 2) {
                    try {
                        b();
                        return true;
                    } catch (Throwable th) {
                        try {
                            ahn.o("PlaceholderSurface", "Failed to release placeholder surface", th);
                            return true;
                        } finally {
                            quit();
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public PlaceholderSurface(a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.c = aVar;
        this.b = z;
    }

    public static synchronized boolean d() {
        int i;
        boolean z;
        synchronized (PlaceholderSurface.class) {
            try {
                if (!f) {
                    try {
                    } catch (GlUtil.GlException e2) {
                        ahn.n("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
                    }
                    if (GlUtil.s("EGL_EXT_protected_content")) {
                        i = GlUtil.s("EGL_KHR_surfaceless_context") ? 1 : 2;
                        e = i;
                        f = true;
                    }
                    i = 0;
                    e = i;
                    f = true;
                }
                z = e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.c) {
            try {
                if (!this.d) {
                    a aVar = this.c;
                    aVar.c.getClass();
                    aVar.c.sendEmptyMessage(2);
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package m3;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;
import m3.C8072n;

/* renamed from: m3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8070l implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f74330g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    private final Handler f74331a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f74332b = new int[1];

    /* renamed from: c, reason: collision with root package name */
    private EGLDisplay f74333c;

    /* renamed from: d, reason: collision with root package name */
    private EGLContext f74334d;

    /* renamed from: e, reason: collision with root package name */
    private EGLSurface f74335e;

    /* renamed from: f, reason: collision with root package name */
    private SurfaceTexture f74336f;

    public RunnableC8070l(Handler handler) {
        this.f74331a = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f74336f;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void b(int i11) throws C8072n.a {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        C8072n.c("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        C8072n.c("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        this.f74333c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f74330g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z11 = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i12 = N.f74289a;
        C8072n.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f74333c, eGLConfig, EGL14.EGL_NO_CONTEXT, i11 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        C8072n.c("eglCreateContext failed", eglCreateContext != null);
        this.f74334d = eglCreateContext;
        EGLDisplay eGLDisplay = this.f74333c;
        if (i11 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i11 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            C8072n.c("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        C8072n.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        this.f74335e = eglCreatePbufferSurface;
        int[] iArr3 = this.f74332b;
        GLES20.glGenTextures(1, iArr3, 0);
        C8072n.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f74336f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        this.f74331a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f74336f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f74332b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f74333c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f74333c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f74335e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f74333c, this.f74335e);
            }
            EGLContext eGLContext = this.f74334d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f74333c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f74333c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f74333c);
            }
            this.f74333c = null;
            this.f74334d = null;
            this.f74335e = null;
            this.f74336f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f74331a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f74336f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

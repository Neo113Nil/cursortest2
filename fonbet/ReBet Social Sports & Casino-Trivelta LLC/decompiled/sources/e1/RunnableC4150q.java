package e1;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: e1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4150q implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] EGL_CONFIG_ATTRIBUTES = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f45548a;

    /* renamed from: b, reason: collision with root package name */
    public EGLDisplay f45549b;

    /* renamed from: c, reason: collision with root package name */
    public EGLContext f45550c;

    /* renamed from: d, reason: collision with root package name */
    public EGLSurface f45551d;

    /* renamed from: e, reason: collision with root package name */
    public SurfaceTexture f45552e;
    private final int[] textureIdHolder;

    /* renamed from: e1.q$a */
    public interface a {
    }

    public RunnableC4150q(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, EGL_CONFIG_ATTRIBUTES, 0, eGLConfigArr, 0, 1, iArr, 0);
        AbstractC4151s.e(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, Z.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC4151s.e(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC4151s.e(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        AbstractC4151s.e(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    public static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC4151s.d();
    }

    public static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC4151s.e(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        AbstractC4151s.e(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) AbstractC4134a.e(this.f45552e);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.f45549b = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f45549b, a10, i10);
        this.f45550c = b10;
        this.f45551d = c(this.f45549b, a10, b10, i10);
        e(this.textureIdHolder);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textureIdHolder[0]);
        this.f45552e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f45548a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f45552e;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.textureIdHolder, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f45549b;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f45549b;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f45551d;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f45549b, this.f45551d);
            }
            EGLContext eGLContext = this.f45550c;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f45549b, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f45549b;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f45549b);
            }
            this.f45549b = null;
            this.f45550c = null;
            this.f45551d = null;
            this.f45552e = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f45548a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f45552e;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC4150q(Handler handler, a aVar) {
        this.f45548a = handler;
        this.textureIdHolder = new int[1];
    }

    public final void d() {
    }
}

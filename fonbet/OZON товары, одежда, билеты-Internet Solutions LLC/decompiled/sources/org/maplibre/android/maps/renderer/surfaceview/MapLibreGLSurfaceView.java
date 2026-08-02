package org.maplibre.android.maps.renderer.surfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.maplibre.android.maps.renderer.egl.EGLConfigChooser;
import org.maplibre.android.maps.renderer.egl.EGLContextFactory;
import org.maplibre.android.maps.renderer.egl.EGLWindowSurfaceFactory;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView;

/* loaded from: classes10.dex */
public class MapLibreGLSurfaceView extends MapLibreSurfaceView {

    /* renamed from: f, reason: collision with root package name */
    protected final WeakReference<MapLibreGLSurfaceView> f79887f;

    /* renamed from: g, reason: collision with root package name */
    private EGLConfigChooser f79888g;

    /* renamed from: h, reason: collision with root package name */
    private EGLContextFactory f79889h;

    /* renamed from: i, reason: collision with root package name */
    private EGLWindowSurfaceFactory f79890i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f79891j;

    private static class EglHelper {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<MapLibreGLSurfaceView> f79892a;

        /* renamed from: b, reason: collision with root package name */
        EGL10 f79893b;

        /* renamed from: c, reason: collision with root package name */
        EGLDisplay f79894c;

        /* renamed from: d, reason: collision with root package name */
        EGLSurface f79895d;

        /* renamed from: e, reason: collision with root package name */
        EGLConfig f79896e;

        /* renamed from: f, reason: collision with root package name */
        EGLContext f79897f;

        private EglHelper() {
            throw null;
        }

        EglHelper(WeakReference weakReference) {
            this.f79892a = weakReference;
        }

        private void c() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f79895d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f79893b.eglMakeCurrent(this.f79894c, eGLSurface, eGLSurface, this.f79897f);
            MapLibreGLSurfaceView mapLibreGLSurfaceView = this.f79892a.get();
            if (mapLibreGLSurfaceView != null) {
                GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory = mapLibreGLSurfaceView.f79890i;
                EGL10 egl10 = this.f79893b;
                EGLDisplay eGLDisplay = this.f79894c;
                EGLSurface eGLSurface3 = this.f79895d;
                ((EGLWindowSurfaceFactory) eGLWindowSurfaceFactory).getClass();
                egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
            }
            this.f79895d = null;
        }

        final boolean a() {
            String str;
            if (this.f79893b == null) {
                Log.e("MapLibreSurfaceView", "egl not initialized");
                return false;
            }
            if (this.f79894c == null) {
                Log.e("MapLibreSurfaceView", "eglDisplay not initialized");
                return false;
            }
            if (this.f79896e == null) {
                Log.e("MapLibreSurfaceView", "mEglConfig not initialized");
                return false;
            }
            c();
            MapLibreGLSurfaceView mapLibreGLSurfaceView = this.f79892a.get();
            if (mapLibreGLSurfaceView != null) {
                this.f79895d = ((EGLWindowSurfaceFactory) mapLibreGLSurfaceView.f79890i).createWindowSurface(this.f79893b, this.f79894c, this.f79896e, mapLibreGLSurfaceView.getHolder());
            } else {
                this.f79895d = null;
            }
            EGLSurface eGLSurface = this.f79895d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f79893b.eglGetError() == 12299) {
                    Log.e("MapLibreSurfaceView", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f79893b.eglMakeCurrent(this.f79894c, eGLSurface, eGLSurface, this.f79897f)) {
                return true;
            }
            int eglGetError = this.f79893b.eglGetError();
            StringBuilder sb2 = new StringBuilder("eglMakeCurrent failed: ");
            switch (eglGetError) {
                case 12288:
                    str = "EGL_SUCCESS";
                    break;
                case 12289:
                    str = "EGL_NOT_INITIALIZED";
                    break;
                case 12290:
                    str = "EGL_BAD_ACCESS";
                    break;
                case 12291:
                    str = "EGL_BAD_ALLOC";
                    break;
                case 12292:
                    str = "EGL_BAD_ATTRIBUTE";
                    break;
                case 12293:
                    str = "EGL_BAD_CONFIG";
                    break;
                case 12294:
                    str = "EGL_BAD_CONTEXT";
                    break;
                case 12295:
                    str = "EGL_BAD_CURRENT_SURFACE";
                    break;
                case 12296:
                    str = "EGL_BAD_DISPLAY";
                    break;
                case 12297:
                    str = "EGL_BAD_MATCH";
                    break;
                case 12298:
                    str = "EGL_BAD_NATIVE_PIXMAP";
                    break;
                case 12299:
                    str = "EGL_BAD_NATIVE_WINDOW";
                    break;
                case 12300:
                    str = "EGL_BAD_PARAMETER";
                    break;
                case 12301:
                    str = "EGL_BAD_SURFACE";
                    break;
                case 12302:
                    str = "EGL_CONTEXT_LOST";
                    break;
                default:
                    str = "0x" + Integer.toHexString(eglGetError);
                    break;
            }
            sb2.append(str);
            Log.w("MapLibreSurfaceView", sb2.toString());
            return false;
        }

        final void b() {
            c();
        }

        public final void d() {
            EGLDisplay eGLDisplay = this.f79894c;
            if (eGLDisplay != null) {
                EGL10 egl10 = this.f79893b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            if (this.f79897f != null) {
                MapLibreGLSurfaceView mapLibreGLSurfaceView = this.f79892a.get();
                if (mapLibreGLSurfaceView != null) {
                    ((EGLContextFactory) mapLibreGLSurfaceView.f79889h).destroyContext(this.f79893b, this.f79894c, this.f79897f);
                }
                this.f79897f = null;
            }
            EGLDisplay eGLDisplay2 = this.f79894c;
            if (eGLDisplay2 != null) {
                this.f79893b.eglTerminate(eGLDisplay2);
                this.f79894c = null;
            }
        }

        public final void e() {
            EGLDisplay eglGetDisplay;
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                this.f79893b = egl10;
                eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                this.f79894c = eglGetDisplay;
            } catch (Exception e11) {
                Log.e("MapLibreSurfaceView", "createContext failed: ", e11);
            }
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                Log.e("MapLibreSurfaceView", "eglGetDisplay failed");
                return;
            }
            if (!this.f79893b.eglInitialize(eglGetDisplay, new int[2])) {
                Log.e("MapLibreSurfaceView", "eglInitialize failed");
                return;
            }
            MapLibreGLSurfaceView mapLibreGLSurfaceView = this.f79892a.get();
            if (mapLibreGLSurfaceView == null) {
                this.f79896e = null;
                this.f79897f = null;
            } else {
                EGLConfig chooseConfig = ((EGLConfigChooser) mapLibreGLSurfaceView.f79888g).chooseConfig(this.f79893b, this.f79894c);
                this.f79896e = chooseConfig;
                if (chooseConfig == null) {
                    Log.e("MapLibreSurfaceView", "failed to select an EGL configuration");
                    return;
                } else {
                    this.f79897f = ((EGLContextFactory) mapLibreGLSurfaceView.f79889h).createContext(this.f79893b, this.f79894c, this.f79896e);
                }
            }
            EGLContext eGLContext = this.f79897f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f79897f = null;
                Log.e("MapLibreSurfaceView", "createContext failed");
                return;
            }
            this.f79895d = null;
        }
    }

    static class GLThread extends MapLibreSurfaceView.RenderThread {

        /* renamed from: r, reason: collision with root package name */
        private boolean f79898r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f79899s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f79900t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f79901u;

        /* renamed from: v, reason: collision with root package name */
        private EglHelper f79902v;

        /* renamed from: w, reason: collision with root package name */
        protected WeakReference<MapLibreGLSurfaceView> f79903w;

        GLThread() {
            throw null;
        }

        private void e() {
            if (this.f79899s) {
                this.f79902v.d();
                this.f79899s = false;
                this.f79925p.notifyAll();
            }
        }

        private void f() {
            if (this.f79900t) {
                this.f79900t = false;
                this.f79902v.b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:203:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.RenderThread
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected final void a() throws InterruptedException {
            a aVar;
            boolean z11;
            String str;
            MapLibreGLSurfaceView mapLibreGLSurfaceView;
            this.f79902v = new EglHelper(this.f79903w);
            int i11 = 0;
            this.f79899s = false;
            this.f79900t = false;
            this.f79920k = false;
            boolean z12 = false;
            boolean z13 = false;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            boolean z14 = false;
            int i16 = 0;
            int i17 = 0;
            a aVar2 = null;
            while (true) {
                Runnable runnable = null;
                while (true) {
                    try {
                        synchronized (this.f79925p) {
                            while (!this.f79910a) {
                                if (this.f79922m.isEmpty()) {
                                    boolean z15 = this.f79913d;
                                    boolean z16 = this.f79912c;
                                    if (z15 != z16) {
                                        this.f79913d = z16;
                                        this.f79925p.notifyAll();
                                    } else {
                                        z16 = false;
                                    }
                                    if (z12) {
                                        f();
                                        e();
                                        z12 = false;
                                    }
                                    if (z16 && this.f79900t) {
                                        f();
                                    }
                                    if (z16 && this.f79899s && ((mapLibreGLSurfaceView = this.f79903w.get()) == null || !mapLibreGLSurfaceView.f79891j)) {
                                        e();
                                    }
                                    if (!this.f79914e && !this.f79915f) {
                                        if (this.f79900t) {
                                            f();
                                        }
                                        this.f79915f = true;
                                        this.f79898r = false;
                                        this.f79925p.notifyAll();
                                    }
                                    if (this.f79914e && this.f79915f) {
                                        this.f79915f = false;
                                        this.f79925p.notifyAll();
                                    }
                                    if (z13) {
                                        this.f79920k = false;
                                        this.f79921l = true;
                                        this.f79925p.notifyAll();
                                        z13 = false;
                                    }
                                    a aVar3 = this.f79924o;
                                    if (aVar3 != null) {
                                        this.f79924o = null;
                                        aVar2 = aVar3;
                                    }
                                    if (b()) {
                                        if (!this.f79899s) {
                                            try {
                                                this.f79902v.e();
                                                this.f79899s = true;
                                                this.f79925p.notifyAll();
                                                i12 = 1;
                                            } catch (RuntimeException unused) {
                                                this.f79925p.notifyAll();
                                                synchronized (this.f79925p) {
                                                    f();
                                                    e();
                                                    return;
                                                }
                                            }
                                        }
                                        if (this.f79899s && !this.f79900t) {
                                            this.f79900t = true;
                                            i13 = 1;
                                            i14 = 1;
                                            i15 = 1;
                                        }
                                        if (this.f79900t) {
                                            if (this.f79923n) {
                                                i16 = this.f79916g;
                                                i17 = this.f79917h;
                                                this.f79920k = true;
                                                this.f79923n = false;
                                                i13 = 1;
                                                i15 = 1;
                                            }
                                            i11 = 0;
                                            this.f79919j = false;
                                            this.f79925p.notifyAll();
                                            if (this.f79920k) {
                                                z14 = true;
                                            }
                                        }
                                    } else if (aVar2 != null) {
                                        Log.w("MapLibreSurfaceView", "Warning, !readyToDraw() but waiting for draw finished! Early reporting draw finished.");
                                        aVar2.run();
                                        aVar2 = null;
                                    }
                                    this.f79925p.wait();
                                    i11 = 0;
                                } else {
                                    runnable = this.f79922m.remove(i11);
                                }
                            }
                            synchronized (this.f79925p) {
                                f();
                                e();
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f79925p) {
                        }
                    }
                    if (runnable != null) {
                        break;
                    }
                    if (i13 != 0) {
                        if (this.f79902v.a()) {
                            synchronized (this.f79925p) {
                                this.f79901u = true;
                                this.f79925p.notifyAll();
                            }
                            i13 = i11;
                        } else {
                            synchronized (this.f79925p) {
                                this.f79901u = true;
                                this.f79898r = true;
                                this.f79925p.notifyAll();
                            }
                        }
                        synchronized (this.f79925p) {
                            f();
                            e();
                            throw th2;
                        }
                    }
                    if (i14 != 0) {
                        i14 = i11;
                    }
                    if (i12 != 0) {
                        MapLibreGLSurfaceView mapLibreGLSurfaceView2 = this.f79903w.get();
                        if (mapLibreGLSurfaceView2 != null) {
                            aVar = null;
                            mapLibreGLSurfaceView2.f79905b.onSurfaceCreated(null);
                        } else {
                            aVar = null;
                        }
                        i12 = i11;
                    } else {
                        aVar = null;
                    }
                    if (i15 != 0) {
                        MapLibreGLSurfaceView mapLibreGLSurfaceView3 = this.f79903w.get();
                        if (mapLibreGLSurfaceView3 != null) {
                            mapLibreGLSurfaceView3.f79905b.onSurfaceChanged(i16, i17);
                        }
                        i15 = i11;
                    }
                    MapLibreGLSurfaceView mapLibreGLSurfaceView4 = this.f79903w.get();
                    if (mapLibreGLSurfaceView4 != null) {
                        mapLibreGLSurfaceView4.f79905b.onDrawFrame();
                        if (aVar2 != null) {
                            aVar2.run();
                            aVar2 = aVar;
                        }
                    }
                    EglHelper eglHelper = this.f79902v;
                    int eglGetError = !eglHelper.f79893b.eglSwapBuffers(eglHelper.f79894c, eglHelper.f79895d) ? eglHelper.f79893b.eglGetError() : 12288;
                    if (eglGetError == 12288) {
                        z11 = true;
                    } else if (eglGetError != 12302) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("eglSwapBuffers");
                        sb2.append(" failed: ");
                        switch (eglGetError) {
                            case 12288:
                                str = "EGL_SUCCESS";
                                break;
                            case 12289:
                                str = "EGL_NOT_INITIALIZED";
                                break;
                            case 12290:
                                str = "EGL_BAD_ACCESS";
                                break;
                            case 12291:
                                str = "EGL_BAD_ALLOC";
                                break;
                            case 12292:
                                str = "EGL_BAD_ATTRIBUTE";
                                break;
                            case 12293:
                                str = "EGL_BAD_CONFIG";
                                break;
                            case 12294:
                                str = "EGL_BAD_CONTEXT";
                                break;
                            case 12295:
                                str = "EGL_BAD_CURRENT_SURFACE";
                                break;
                            case 12296:
                                str = "EGL_BAD_DISPLAY";
                                break;
                            case 12297:
                                str = "EGL_BAD_MATCH";
                                break;
                            case 12298:
                                str = "EGL_BAD_NATIVE_PIXMAP";
                                break;
                            case 12299:
                                str = "EGL_BAD_NATIVE_WINDOW";
                                break;
                            case 12300:
                                str = "EGL_BAD_PARAMETER";
                                break;
                            case 12301:
                                str = "EGL_BAD_SURFACE";
                                break;
                            case 12302:
                                str = "EGL_CONTEXT_LOST";
                                break;
                            default:
                                str = "0x" + Integer.toHexString(eglGetError);
                                break;
                        }
                        sb2.append(str);
                        Log.w("MapLibreSurfaceView", sb2.toString());
                        synchronized (this.f79925p) {
                            z11 = true;
                            this.f79898r = true;
                            this.f79925p.notifyAll();
                        }
                    } else {
                        z11 = true;
                        z12 = true;
                    }
                    if (z14) {
                        z13 = z11;
                        z14 = false;
                    }
                    i11 = 0;
                }
                runnable.run();
            }
        }

        @Override // org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.RenderThread
        protected final boolean b() {
            return super.b() && !this.f79898r;
        }

        public final boolean d() {
            return this.f79899s && this.f79900t && b();
        }

        public final void g() {
            synchronized (this.f79925p) {
                this.f79914e = true;
                this.f79901u = false;
                this.f79925p.notifyAll();
                while (this.f79915f && !this.f79901u && !this.f79911b) {
                    try {
                        this.f79925p.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public MapLibreGLSurfaceView(Context context) {
        super(context);
        this.f79887f = new WeakReference<>(this);
    }

    @Override // org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView
    protected final void a() {
        WeakReference<MapLibreGLSurfaceView> weakReference = this.f79887f;
        GLThread gLThread = new GLThread(weakReference.get().f79904a);
        gLThread.f79903w = weakReference;
        this.f79906c = gLThread;
    }

    public final void g(EGLConfigChooser eGLConfigChooser) {
        if (this.f79906c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        this.f79888g = eGLConfigChooser;
    }

    public final void h(EGLContextFactory eGLContextFactory) {
        if (this.f79906c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        this.f79889h = eGLContextFactory;
    }

    public final void i(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        if (this.f79906c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        this.f79890i = eGLWindowSurfaceFactory;
    }

    public final void j() {
        this.f79891j = true;
    }

    public final void k(SurfaceViewMapRenderer surfaceViewMapRenderer) {
        if (this.f79888g == null) {
            throw new IllegalStateException("No eglConfigChooser provided");
        }
        if (this.f79889h == null) {
            throw new IllegalStateException("No eglContextFactory provided");
        }
        if (this.f79890i == null) {
            throw new IllegalStateException("No eglWindowSurfaceFactory provided");
        }
        if (this.f79906c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        this.f79905b = surfaceViewMapRenderer;
        a();
        this.f79906c.start();
    }
}

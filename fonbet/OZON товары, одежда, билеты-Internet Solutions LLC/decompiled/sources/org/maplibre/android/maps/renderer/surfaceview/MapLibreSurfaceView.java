package org.maplibre.android.maps.renderer.surfaceview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView;

/* loaded from: classes10.dex */
public abstract class MapLibreSurfaceView extends SurfaceView implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    protected final RenderThreadManager f79904a;

    /* renamed from: b, reason: collision with root package name */
    protected SurfaceViewMapRenderer f79905b;

    /* renamed from: c, reason: collision with root package name */
    protected MapLibreGLSurfaceView.GLThread f79906c;

    /* renamed from: d, reason: collision with root package name */
    protected OnSurfaceViewDetachedListener f79907d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f79908e;

    public interface OnSurfaceViewDetachedListener {
    }

    static abstract class RenderThread extends Thread {

        /* renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ int f79909q = 0;

        /* renamed from: a, reason: collision with root package name */
        protected boolean f79910a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f79911b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f79912c;

        /* renamed from: d, reason: collision with root package name */
        protected boolean f79913d;

        /* renamed from: e, reason: collision with root package name */
        protected boolean f79914e;

        /* renamed from: f, reason: collision with root package name */
        protected boolean f79915f;

        /* renamed from: l, reason: collision with root package name */
        protected boolean f79921l;

        /* renamed from: p, reason: collision with root package name */
        protected final RenderThreadManager f79925p;

        /* renamed from: m, reason: collision with root package name */
        protected ArrayList<Runnable> f79922m = new ArrayList<>();

        /* renamed from: n, reason: collision with root package name */
        protected boolean f79923n = true;

        /* renamed from: o, reason: collision with root package name */
        protected a f79924o = null;

        /* renamed from: g, reason: collision with root package name */
        protected int f79916g = 0;

        /* renamed from: h, reason: collision with root package name */
        protected int f79917h = 0;

        /* renamed from: j, reason: collision with root package name */
        protected boolean f79919j = true;

        /* renamed from: i, reason: collision with root package name */
        protected MapRenderer.RenderingRefreshMode f79918i = MapRenderer.RenderingRefreshMode.WHEN_DIRTY;

        /* renamed from: k, reason: collision with root package name */
        protected boolean f79920k = false;

        RenderThread(RenderThreadManager renderThreadManager) {
            this.f79925p = renderThreadManager;
        }

        protected abstract void a() throws InterruptedException;

        protected boolean b() {
            if (this.f79913d || !this.f79914e || this.f79916g <= 0 || this.f79917h <= 0) {
                return false;
            }
            return this.f79919j || this.f79918i == MapRenderer.RenderingRefreshMode.CONTINUOUS;
        }

        public final void c() {
            synchronized (this.f79925p) {
                this.f79910a = true;
                this.f79925p.notifyAll();
                while (!this.f79911b && isAlive()) {
                    try {
                        this.f79925p.wait(100L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            RenderThreadManager renderThreadManager = this.f79925p;
            setName("RenderThread " + getId());
            try {
                a();
            } catch (InterruptedException unused) {
            } finally {
                renderThreadManager.a(this);
            }
        }
    }

    protected static class RenderThreadManager {
        protected RenderThreadManager() {
        }

        final synchronized void a(RenderThread renderThread) {
            renderThread.f79911b = true;
            notifyAll();
        }
    }

    public MapLibreSurfaceView(Context context) {
        super(context);
        this.f79904a = new RenderThreadManager();
        SurfaceHolder holder = getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    protected abstract void a();

    public final void b(MapRenderer.RenderingRefreshMode renderingRefreshMode) {
        MapLibreGLSurfaceView.GLThread gLThread = this.f79906c;
        synchronized (gLThread.f79925p) {
            gLThread.f79918i = renderingRefreshMode;
            gLThread.f79925p.notifyAll();
        }
    }

    protected final void finalize() throws Throwable {
        try {
            MapLibreGLSurfaceView.GLThread gLThread = this.f79906c;
            if (gLThread != null && gLThread.isAlive()) {
                this.f79906c.c();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        MapRenderer.RenderingRefreshMode renderingRefreshMode;
        super.onAttachedToWindow();
        if (this.f79908e && this.f79905b != null) {
            MapRenderer.RenderingRefreshMode renderingRefreshMode2 = MapRenderer.RenderingRefreshMode.WHEN_DIRTY;
            MapLibreGLSurfaceView.GLThread gLThread = this.f79906c;
            if (gLThread != null) {
                synchronized (gLThread.f79925p) {
                    renderingRefreshMode = gLThread.f79918i;
                }
            } else {
                renderingRefreshMode = renderingRefreshMode2;
            }
            a();
            if (renderingRefreshMode != renderingRefreshMode2) {
                MapLibreGLSurfaceView.GLThread gLThread2 = this.f79906c;
                synchronized (gLThread2.f79925p) {
                    gLThread2.f79918i = renderingRefreshMode;
                    gLThread2.f79925p.notifyAll();
                }
            }
            this.f79906c.start();
        }
        this.f79908e = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        OnSurfaceViewDetachedListener onSurfaceViewDetachedListener = this.f79907d;
        if (onSurfaceViewDetachedListener != null) {
            SurfaceViewMapRenderer.this.nativeReset();
        }
        MapLibreGLSurfaceView.GLThread gLThread = this.f79906c;
        if (gLThread != null && gLThread.isAlive()) {
            this.f79906c.c();
        }
        this.f79908e = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
        MapLibreGLSurfaceView.GLThread gLThread = this.f79906c;
        synchronized (gLThread.f79925p) {
            try {
                gLThread.f79916g = i12;
                gLThread.f79917h = i13;
                gLThread.f79923n = true;
                gLThread.f79919j = true;
                gLThread.f79921l = false;
                if (Thread.currentThread() == gLThread) {
                    return;
                }
                gLThread.f79925p.notifyAll();
                while (!gLThread.f79911b && !gLThread.f79913d && !gLThread.f79921l && gLThread.d()) {
                    try {
                        gLThread.f79925p.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f79906c.g();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MapLibreGLSurfaceView.GLThread gLThread = this.f79906c;
        synchronized (gLThread.f79925p) {
            gLThread.f79914e = false;
            gLThread.f79925p.notifyAll();
            while (!gLThread.f79911b && !gLThread.f79915f) {
                try {
                    gLThread.f79925p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    @Deprecated
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        MapLibreGLSurfaceView.GLThread gLThread = this.f79906c;
        if (gLThread != null) {
            synchronized (gLThread.f79925p) {
                try {
                    if (Thread.currentThread() == gLThread) {
                        return;
                    }
                    gLThread.f79920k = true;
                    gLThread.f79919j = true;
                    gLThread.f79921l = false;
                    gLThread.f79924o = new a(gLThread.f79924o, runnable);
                    gLThread.f79925p.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}

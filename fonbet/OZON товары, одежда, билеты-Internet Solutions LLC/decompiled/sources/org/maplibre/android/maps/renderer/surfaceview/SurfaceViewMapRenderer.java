package org.maplibre.android.maps.renderer.surfaceview;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView;

/* loaded from: classes10.dex */
public class SurfaceViewMapRenderer extends MapRenderer {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    protected final MapLibreGLSurfaceView f79926a;

    /* renamed from: org.maplibre.android.maps.renderer.surfaceview.SurfaceViewMapRenderer$1, reason: invalid class name */
    class AnonymousClass1 implements MapLibreSurfaceView.OnSurfaceViewDetachedListener {
        AnonymousClass1() {
        }
    }

    public SurfaceViewMapRenderer(Context context, MapLibreGLSurfaceView mapLibreGLSurfaceView, String str) {
        super(context, str);
        this.f79926a = mapLibreGLSurfaceView;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        if (mapLibreGLSurfaceView.f79907d != null) {
            throw new IllegalArgumentException("Detached from window listener has been already set.");
        }
        mapLibreGLSurfaceView.f79907d = anonymousClass1;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final MapRenderer.RenderingRefreshMode getRenderingRefreshMode() {
        MapRenderer.RenderingRefreshMode renderingRefreshMode;
        MapLibreGLSurfaceView.GLThread gLThread = this.f79926a.f79906c;
        synchronized (gLThread.f79925p) {
            renderingRefreshMode = gLThread.f79918i;
        }
        return renderingRefreshMode;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final View getView() {
        return this.f79926a;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onDrawFrame() {
        super.onDrawFrame();
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStart() {
        MapLibreGLSurfaceView.GLThread gLThread = this.f79926a.f79906c;
        synchronized (gLThread.f79925p) {
            gLThread.f79912c = false;
            gLThread.f79919j = true;
            gLThread.f79921l = false;
            gLThread.f79925p.notifyAll();
            while (!gLThread.f79911b && gLThread.f79913d && !gLThread.f79921l) {
                try {
                    gLThread.f79925p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStop() {
        MapLibreGLSurfaceView.GLThread gLThread = this.f79926a.f79906c;
        synchronized (gLThread.f79925p) {
            gLThread.f79912c = true;
            gLThread.f79925p.notifyAll();
            while (!gLThread.f79911b && !gLThread.f79913d) {
                try {
                    gLThread.f79925p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onSurfaceChanged(int i11, int i12) {
        super.onSurfaceChanged(i11, i12);
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public void onSurfaceCreated(Surface surface) {
        super.onSurfaceCreated(surface);
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onSurfaceDestroyed() {
        super.onSurfaceDestroyed();
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void queueEvent(Runnable runnable) {
        MapLibreGLSurfaceView.GLThread gLThread = this.f79926a.f79906c;
        synchronized (gLThread.f79925p) {
            gLThread.f79922m.add(runnable);
            gLThread.f79925p.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void requestRender() {
        MapLibreGLSurfaceView.GLThread gLThread = this.f79926a.f79906c;
        synchronized (gLThread.f79925p) {
            gLThread.f79919j = true;
            gLThread.f79925p.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void setRenderingRefreshMode(MapRenderer.RenderingRefreshMode renderingRefreshMode) {
        this.f79926a.b(renderingRefreshMode);
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void waitForEmpty() {
        MapLibreGLSurfaceView.GLThread gLThread = this.f79926a.f79906c;
        synchronized (gLThread.f79925p) {
            while (!gLThread.f79922m.isEmpty()) {
                try {
                    gLThread.f79925p.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

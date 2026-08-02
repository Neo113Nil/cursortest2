package org.maplibre.android.maps.renderer.textureview;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import org.maplibre.android.maps.renderer.MapRenderer;

/* loaded from: classes10.dex */
public class TextureViewMapRenderer extends MapRenderer {

    /* renamed from: a, reason: collision with root package name */
    private GLTextureViewRenderThread f79939a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f79940b;

    /* renamed from: c, reason: collision with root package name */
    private TextureView f79941c;

    public TextureViewMapRenderer(@NonNull Context context, @NonNull TextureView textureView, String str, boolean z11) {
        super(context, str);
        this.f79941c = textureView;
        this.f79940b = z11;
    }

    public final boolean a() {
        return this.f79940b;
    }

    public final void b(GLTextureViewRenderThread gLTextureViewRenderThread) {
        this.f79939a = gLTextureViewRenderThread;
        gLTextureViewRenderThread.setName("TextureViewRenderer");
        this.f79939a.start();
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final MapRenderer.RenderingRefreshMode getRenderingRefreshMode() {
        throw new RuntimeException("getRenderingRefreshMode is not supported for TextureViewMapRenderer. Use SurfaceViewMapRenderer to set the rendering refresh mode.");
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final View getView() {
        return this.f79941c;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onDestroy() {
        GLTextureViewRenderThread gLTextureViewRenderThread = this.f79939a;
        synchronized (gLTextureViewRenderThread.f79943b) {
            gLTextureViewRenderThread.f79953l = true;
            gLTextureViewRenderThread.f79943b.notifyAll();
            while (!gLTextureViewRenderThread.f79954m) {
                try {
                    gLTextureViewRenderThread.f79943b.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    protected final void onDrawFrame() {
        super.onDrawFrame();
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStart() {
        GLTextureViewRenderThread gLTextureViewRenderThread = this.f79939a;
        synchronized (gLTextureViewRenderThread.f79943b) {
            gLTextureViewRenderThread.f79951j = false;
            gLTextureViewRenderThread.f79943b.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStop() {
        GLTextureViewRenderThread gLTextureViewRenderThread = this.f79939a;
        synchronized (gLTextureViewRenderThread.f79943b) {
            gLTextureViewRenderThread.f79951j = true;
            gLTextureViewRenderThread.f79943b.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    protected final void onSurfaceChanged(int i11, int i12) {
        super.onSurfaceChanged(i11, i12);
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    protected void onSurfaceCreated(Surface surface) {
        super.onSurfaceCreated(surface);
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    protected final void onSurfaceDestroyed() {
        super.onSurfaceDestroyed();
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void queueEvent(Runnable runnable) {
        GLTextureViewRenderThread gLTextureViewRenderThread = this.f79939a;
        if (runnable == null) {
            gLTextureViewRenderThread.getClass();
            throw new IllegalArgumentException("runnable must not be null");
        }
        synchronized (gLTextureViewRenderThread.f79943b) {
            gLTextureViewRenderThread.f79944c.add(runnable);
            gLTextureViewRenderThread.f79943b.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void requestRender() {
        GLTextureViewRenderThread gLTextureViewRenderThread = this.f79939a;
        synchronized (gLTextureViewRenderThread.f79943b) {
            gLTextureViewRenderThread.f79949h = true;
            gLTextureViewRenderThread.f79943b.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void setRenderingRefreshMode(MapRenderer.RenderingRefreshMode renderingRefreshMode) {
        throw new RuntimeException("setRenderingRefreshMode is not supported for TextureViewMapRenderer. Use SurfaceViewMapRenderer to set the rendering refresh mode.");
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void waitForEmpty() {
        GLTextureViewRenderThread gLTextureViewRenderThread = this.f79939a;
        synchronized (gLTextureViewRenderThread.f79943b) {
            while (!gLTextureViewRenderThread.f79944c.isEmpty()) {
                try {
                    gLTextureViewRenderThread.f79943b.wait(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

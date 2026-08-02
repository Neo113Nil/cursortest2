package org.maplibre.android.maps.renderer;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.maps.renderer.egl.EGLConfigChooser;
import org.maplibre.android.maps.renderer.egl.EGLContextFactory;
import org.maplibre.android.maps.renderer.egl.EGLWindowSurfaceFactory;
import org.maplibre.android.maps.renderer.surfaceview.GLSurfaceViewMapRenderer;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView;
import org.maplibre.android.maps.renderer.surfaceview.SurfaceViewMapRenderer;
import org.maplibre.android.maps.renderer.textureview.GLTextureViewRenderThread;
import org.maplibre.android.maps.renderer.textureview.TextureViewMapRenderer;

@Keep
/* loaded from: classes10.dex */
public class MapRendererFactory {
    public static SurfaceViewMapRenderer newSurfaceViewMapRenderer(@NonNull Context context, String str, boolean z11, Runnable runnable) {
        MapLibreGLSurfaceView mapLibreGLSurfaceView = new MapLibreGLSurfaceView(context);
        mapLibreGLSurfaceView.setZOrderMediaOverlay(z11);
        return new GLSurfaceViewMapRenderer(context, mapLibreGLSurfaceView, str, runnable) { // from class: org.maplibre.android.maps.renderer.MapRendererFactory.2

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f79880b;

            {
                this.f79880b = runnable;
                mapLibreGLSurfaceView.h(new EGLContextFactory());
                mapLibreGLSurfaceView.i(new EGLWindowSurfaceFactory());
                mapLibreGLSurfaceView.g(new EGLConfigChooser());
                mapLibreGLSurfaceView.k(this);
                mapLibreGLSurfaceView.b(MapRenderer.RenderingRefreshMode.WHEN_DIRTY);
                mapLibreGLSurfaceView.j();
            }

            @Override // org.maplibre.android.maps.renderer.surfaceview.SurfaceViewMapRenderer, org.maplibre.android.maps.renderer.MapRenderer
            public final void onSurfaceCreated(Surface surface) {
                this.f79880b.run();
                super.onSurfaceCreated(surface);
            }
        };
    }

    public static TextureViewMapRenderer newTextureViewMapRenderer(@NonNull Context context, TextureView textureView, String str, boolean z11, final Runnable runnable) {
        TextureViewMapRenderer textureViewMapRenderer = new TextureViewMapRenderer(context, textureView, str, z11) { // from class: org.maplibre.android.maps.renderer.MapRendererFactory.1
            @Override // org.maplibre.android.maps.renderer.textureview.TextureViewMapRenderer, org.maplibre.android.maps.renderer.MapRenderer
            protected final void onSurfaceCreated(Surface surface) {
                runnable.run();
                super.onSurfaceCreated(surface);
            }
        };
        textureViewMapRenderer.b(new GLTextureViewRenderThread(textureView, textureViewMapRenderer));
        return textureViewMapRenderer;
    }
}

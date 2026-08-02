package org.maplibre.android.maps.renderer;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import org.maplibre.android.a;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapLibreMapOptions;

@Keep
/* loaded from: classes10.dex */
public abstract class MapRenderer implements MapRendererScheduler {
    private static final String TAG = "Mbgl-MapRenderer";
    private MapLibreMap.OnFpsChangedListener onFpsChangedListener;
    private long timeElapsed;
    private long nativePtr = 0;
    private double expectedRenderTime = 0.0d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RenderingRefreshMode {
        private static final /* synthetic */ RenderingRefreshMode[] $VALUES;
        public static final RenderingRefreshMode CONTINUOUS;
        public static final RenderingRefreshMode WHEN_DIRTY;

        static {
            RenderingRefreshMode renderingRefreshMode = new RenderingRefreshMode("WHEN_DIRTY", 0);
            WHEN_DIRTY = renderingRefreshMode;
            RenderingRefreshMode renderingRefreshMode2 = new RenderingRefreshMode("CONTINUOUS", 1);
            CONTINUOUS = renderingRefreshMode2;
            $VALUES = new RenderingRefreshMode[]{renderingRefreshMode, renderingRefreshMode2};
        }

        private RenderingRefreshMode() {
            throw null;
        }

        public static RenderingRefreshMode valueOf(String str) {
            return (RenderingRefreshMode) Enum.valueOf(RenderingRefreshMode.class, str);
        }

        public static RenderingRefreshMode[] values() {
            return (RenderingRefreshMode[]) $VALUES.clone();
        }
    }

    static {
        a.a();
    }

    public MapRenderer(@NonNull Context context, String str) {
        nativeInitialize(this, context.getResources().getDisplayMetrics().density, str);
    }

    public static MapRenderer create(MapLibreMapOptions mapLibreMapOptions, @NonNull Context context, Runnable runnable) {
        String C11 = mapLibreMapOptions.C();
        return mapLibreMapOptions.V() ? MapRendererFactory.newTextureViewMapRenderer(context, new TextureView(context), C11, mapLibreMapOptions.a0(), runnable) : MapRendererFactory.newSurfaceViewMapRenderer(context, C11, mapLibreMapOptions.S(), runnable);
    }

    private native void nativeInitialize(MapRenderer mapRenderer, float f7, String str);

    private native void nativeOnSurfaceChanged(int i11, int i12);

    private native void nativeOnSurfaceCreated(Surface surface);

    private native void nativeOnSurfaceDestroyed();

    private native void nativeRender();

    private native void nativeSetSwapBehaviorFlush(boolean z11);

    private void updateFps() {
        long nanoTime = System.nanoTime();
        if (this.timeElapsed <= 0) {
            this.timeElapsed = nanoTime;
        } else {
            this.onFpsChangedListener.a();
            throw null;
        }
    }

    protected native void finalize() throws Throwable;

    public abstract RenderingRefreshMode getRenderingRefreshMode();

    public abstract View getView();

    /* JADX INFO: Access modifiers changed from: protected */
    public native void nativeReset();

    public void onDestroy() {
    }

    protected void onDrawFrame() {
        long nanoTime = System.nanoTime();
        try {
            nativeRender();
        } catch (Error e11) {
            Logger.e(TAG, e11.getMessage());
        }
        double nanoTime2 = System.nanoTime() - nanoTime;
        double d11 = this.expectedRenderTime;
        if (nanoTime2 < d11) {
            try {
                Thread.sleep((long) ((d11 - nanoTime2) / 1000000.0d));
            } catch (InterruptedException e12) {
                Logger.e(TAG, e12.getMessage());
            }
        }
        if (this.onFpsChangedListener != null) {
            updateFps();
        }
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    protected void onSurfaceChanged(int i11, int i12) {
        nativeOnSurfaceChanged(i11, i12);
    }

    protected void onSurfaceCreated(Surface surface) {
        nativeOnSurfaceCreated(surface);
    }

    protected void onSurfaceDestroyed() {
        nativeOnSurfaceDestroyed();
    }

    void queueEvent(MapRendererRunnable mapRendererRunnable) {
        queueEvent((Runnable) mapRendererRunnable);
    }

    public void setMaximumFps(int i11) {
        if (i11 <= 0) {
            return;
        }
        this.expectedRenderTime = 1.0E9d / i11;
    }

    public void setOnFpsChangedListener(MapLibreMap.OnFpsChangedListener onFpsChangedListener) {
        this.onFpsChangedListener = onFpsChangedListener;
    }

    public abstract void setRenderingRefreshMode(RenderingRefreshMode renderingRefreshMode);

    public void setSwapBehaviorFlush(boolean z11) {
        nativeSetSwapBehaviorFlush(z11);
    }
}

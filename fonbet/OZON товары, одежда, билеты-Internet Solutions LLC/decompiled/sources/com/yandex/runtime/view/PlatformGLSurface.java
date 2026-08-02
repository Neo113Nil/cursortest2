package com.yandex.runtime.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.graphics.GLDebugBinding;
import com.yandex.runtime.view.internal.GLSurface;
import com.yandex.runtime.view.internal.MemoryPressureListener;
import com.yandex.runtime.view.internal.PlatformGLRenderer;
import com.yandex.runtime.view.internal.PlatformViewBinding;
import com.yandex.runtime.view.internal.RenderDelegate;

/* loaded from: classes9.dex */
public class PlatformGLSurface extends GLSurface implements RenderDelegate, PlatformView, PlatformGLRenderer.GLContextListener {
    private Context context;
    boolean glDebugEnabled;
    private int height;
    private MemoryPressureListener memoryPressureListener;
    protected PlatformViewBinding platformViewBinding;
    private int width;

    public PlatformGLSurface(Context context, boolean z11, GLSurfaceView.Renderer renderer) {
        super(z11);
        this.context = context;
        this.glDebugEnabled = z11;
        PlatformGLRenderer platformGLRenderer = new PlatformGLRenderer(this, this, renderer);
        this.platformViewBinding = new PlatformViewBinding(platformGLRenderer, 100, 100);
        setRenderer(platformGLRenderer);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void destroyNativePlatformView() {
        stopRenderThread();
        this.platformViewBinding.destroyNative();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public NativeObject getNativePlatformView() {
        return this.platformViewBinding.getNative();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public View getView() {
        return null;
    }

    @Override // com.yandex.runtime.view.PlatformView
    public boolean isDebugModeEnabled() {
        return false;
    }

    @Override // com.yandex.runtime.view.internal.PlatformGLRenderer.GLContextListener
    public void onContextCreated() {
        if (this.glDebugEnabled) {
            GLDebugBinding.enable();
        }
        this.platformViewBinding.onContextCreated();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void onMemoryWarning() {
        this.platformViewBinding.onMemoryWarning();
    }

    @Override // com.yandex.runtime.view.internal.GLSurface
    public void onSurfaceAvailable(@NonNull android.view.Surface surface, int i11, int i12) {
        super.onSurfaceAvailable(surface, i11, i12);
        this.width = i11;
        this.height = i12;
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void pause() {
        this.platformViewBinding.onPause();
    }

    public void requestRenderNative() {
        this.platformViewBinding.requestRenderNative();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void resume() {
        this.platformViewBinding.onResume();
    }

    @Override // com.yandex.runtime.view.internal.RenderDelegate
    public void setForceRender(boolean z11) {
        throw new UnsupportedOperationException("Method PlatformGLSurface.setForceRender is not implemented");
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void setNoninteractive(boolean z11) {
        this.platformViewBinding.setNoninteractive(z11);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void setOffscreenBufferEnabled(boolean z11) {
        this.platformViewBinding.setOffscreenBufferEnabled(z11);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void start() {
        if (this.memoryPressureListener == null) {
            MemoryPressureListener memoryPressureListener = new MemoryPressureListener(this);
            this.memoryPressureListener = memoryPressureListener;
            this.context.registerComponentCallbacks(memoryPressureListener);
        }
        onResume();
        this.platformViewBinding.onStart(this.width, this.height);
        this.platformViewBinding.onSizeChanged(this.width, this.height);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void stop() {
        MemoryPressureListener memoryPressureListener = this.memoryPressureListener;
        if (memoryPressureListener != null) {
            this.context.unregisterComponentCallbacks(memoryPressureListener);
            this.memoryPressureListener = null;
        }
        this.platformViewBinding.onStop();
        onPause();
    }
}

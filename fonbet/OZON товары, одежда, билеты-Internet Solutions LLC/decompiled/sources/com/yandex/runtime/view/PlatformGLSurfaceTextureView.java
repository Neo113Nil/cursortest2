package com.yandex.runtime.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.graphics.GLDebugBinding;
import com.yandex.runtime.view.internal.GLTextureView;
import com.yandex.runtime.view.internal.MemoryPressureListener;
import com.yandex.runtime.view.internal.PlatformGLRenderer;
import com.yandex.runtime.view.internal.PlatformViewBinding;

/* loaded from: classes9.dex */
public class PlatformGLSurfaceTextureView extends GLTextureView implements PlatformView, PlatformGLRenderer.GLContextListener {
    protected Context context;
    protected boolean glDebugEnabled;
    protected int height;
    protected MemoryPressureListener memoryPressureListener;
    protected PlatformViewBinding platformViewBinding;
    protected PlatformGLRenderer renderer;
    protected int width;

    public PlatformGLSurfaceTextureView(Context context, boolean z11) {
        super(z11);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        init(context, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    private void init(Context context, int i11, int i12) {
        this.context = context;
        this.width = i11;
        this.height = i12;
        PlatformGLRenderer createRenderer = createRenderer();
        this.renderer = createRenderer;
        this.platformViewBinding = new PlatformViewBinding(createRenderer, i11, i12);
    }

    protected PlatformGLRenderer createRenderer() {
        return new PlatformGLRenderer(this, this);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void destroyNativePlatformView() {
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

    @Override // com.yandex.runtime.view.internal.GLTextureView
    public void onSizeChanged(int i11, int i12) {
        super.onSizeChanged(i11, i12);
        this.width = i11;
        this.height = i12;
        this.platformViewBinding.onSizeChanged(i11, i12);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.platformViewBinding.onTouchEvent(motionEvent);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void pause() {
        this.platformViewBinding.onPause();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void resume() {
        this.platformViewBinding.onResume();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void setNoninteractive(boolean z11) {
        this.platformViewBinding.setNoninteractive(z11);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void setOffscreenBufferEnabled(boolean z11) {
        this.platformViewBinding.setOffscreenBufferEnabled(z11);
    }

    public void setTexture(SurfaceTexture surfaceTexture, int i11, int i12) {
        this.width = i11;
        this.height = i12;
        setRenderer(surfaceTexture, i11, i12, this.renderer);
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

    public void setTexture(SurfaceTexture surfaceTexture) {
        setTexture(surfaceTexture, this.width, this.height);
    }

    public PlatformGLSurfaceTextureView(Context context, int i11, int i12, boolean z11) {
        super(z11);
        init(context, i11, i12);
    }
}

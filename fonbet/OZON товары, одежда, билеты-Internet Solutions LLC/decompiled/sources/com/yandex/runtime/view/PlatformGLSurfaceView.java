package com.yandex.runtime.view;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.graphics.GLDebugBinding;
import com.yandex.runtime.view.internal.EGLConfigChooserImpl;
import com.yandex.runtime.view.internal.GLContextFactory;
import com.yandex.runtime.view.internal.MemoryPressureListener;
import com.yandex.runtime.view.internal.PlatformGLRenderer;
import com.yandex.runtime.view.internal.PlatformViewBinding;
import com.yandex.runtime.view.internal.RenderDelegate;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes9.dex */
public class PlatformGLSurfaceView extends GLSurfaceView implements RenderDelegate, PlatformView, PlatformGLRenderer.GLContextListener {
    private static final String LOG_TAG = "PlatformGLSurfaceView";
    private boolean glDebugEnabled;
    private int height;
    private MemoryPressureListener memoryPressureListener;
    protected PlatformViewBinding platformViewBinding;
    protected PlatformGLRenderer renderer;
    private int width;

    public PlatformGLSurfaceView(Context context) {
        this(context, null, 0, false);
    }

    private void handlePreserveEGLContextOnPause() {
        String glGetString = GLES20.glGetString(7936);
        if (glGetString == null || !glGetString.toUpperCase().contains("NVIDIA")) {
            try {
                GLSurfaceView.class.getMethod("setPreserveEGLContextOnPause", Boolean.TYPE).invoke(this, Boolean.TRUE);
            } catch (IllegalAccessException e11) {
                Log.e(LOG_TAG, "error of calling setPreserveEGLContextOnPause", e11);
            } catch (IllegalArgumentException e12) {
                Log.e(LOG_TAG, "error of calling setPreserveEGLContextOnPause", e12);
            } catch (NoSuchMethodException e13) {
                Log.e(LOG_TAG, "error of calling setPreserveEGLContextOnPause", e13);
            } catch (SecurityException e14) {
                Log.e(LOG_TAG, "error of calling setPreserveEGLContextOnPause", e14);
            } catch (InvocationTargetException e15) {
                Log.e(LOG_TAG, "error of calling setPreserveEGLContextOnPause", e15);
            }
        }
    }

    protected PlatformGLRenderer createRenderer() {
        return new PlatformGLRenderer(this, this);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void destroyNativePlatformView() {
        this.platformViewBinding.destroyNative();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.platformViewBinding.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public NativeObject getNativePlatformView() {
        return this.platformViewBinding.getNative();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public View getView() {
        return this;
    }

    @Override // com.yandex.runtime.view.PlatformView
    public boolean isDebugModeEnabled() {
        return false;
    }

    @Override // com.yandex.runtime.view.internal.PlatformGLRenderer.GLContextListener
    public void onContextCreated() {
        handlePreserveEGLContextOnPause();
        if (this.glDebugEnabled) {
            GLDebugBinding.enable();
        }
        this.platformViewBinding.onContextCreated();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void onMemoryWarning() {
        this.platformViewBinding.onMemoryWarning();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        this.width = i11;
        this.height = i12;
        super.onSizeChanged(i11, i12, i13, i14);
        this.platformViewBinding.onSizeChanged(this.width, this.height);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void pause() {
        this.platformViewBinding.onPause();
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
            this.memoryPressureListener = new MemoryPressureListener(this);
            getContext().registerComponentCallbacks(this.memoryPressureListener);
        }
        onResume();
        this.platformViewBinding.onStart(this.width, this.height);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void stop() {
        if (this.memoryPressureListener != null) {
            getContext().unregisterComponentCallbacks(this.memoryPressureListener);
            this.memoryPressureListener = null;
        }
        this.platformViewBinding.onStop();
        onPause();
    }

    public PlatformGLSurfaceView(Context context, boolean z11) {
        this(context, null, 0, z11);
    }

    public PlatformGLSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
    }

    public PlatformGLSurfaceView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, false);
    }

    public PlatformGLSurfaceView(Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet);
        this.glDebugEnabled = z11;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.width = displayMetrics.widthPixels;
        this.height = displayMetrics.heightPixels;
        EGLConfigChooserImpl eGLConfigChooserImpl = new EGLConfigChooserImpl();
        setEGLConfigChooser(eGLConfigChooserImpl);
        setEGLContextFactory(new GLContextFactory(z11, eGLConfigChooserImpl));
        PlatformGLRenderer createRenderer = createRenderer();
        this.renderer = createRenderer;
        this.platformViewBinding = new PlatformViewBinding(createRenderer, this.width, this.height);
        setRenderer(this.renderer);
        setRenderMode(0);
    }
}

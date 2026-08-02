package com.yandex.runtime.view.internal;

import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.os.Process;
import com.yandex.runtime.NativeObject;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes9.dex */
public class PlatformGLRenderer implements GLSurfaceView.Renderer {
    private GLContextListener glContextListener;
    private boolean hasSurface;
    private boolean isContextLost;
    private NativeObject nativeObject;
    private GLSurfaceView.Renderer overlayRenderer;
    private Rect viewport;

    public interface GLContextListener {
        void onContextCreated();
    }

    public PlatformGLRenderer(RenderDelegate renderDelegate) {
        this(renderDelegate, null);
    }

    private static native NativeObject createNative(RenderDelegate renderDelegate);

    private native void renderImpl(boolean z11, int i11, int i12, int i13, int i14);

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        boolean z11 = this.isContextLost;
        Rect rect = this.viewport;
        renderImpl(z11, rect.left, rect.top, rect.width(), this.viewport.height());
        GLSurfaceView.Renderer renderer = this.overlayRenderer;
        if (renderer != null) {
            renderer.onDrawFrame(gl10);
        }
        if (this.isContextLost) {
            this.isContextLost = false;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        this.viewport = new Rect(0, 0, i11, i12);
        GLSurfaceView.Renderer renderer = this.overlayRenderer;
        if (renderer != null) {
            renderer.onSurfaceChanged(gl10, i11, i12);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Process.setThreadPriority(-8);
        if (this.hasSurface) {
            this.isContextLost = true;
        }
        this.hasSurface = true;
        GLContextListener gLContextListener = this.glContextListener;
        if (gLContextListener != null) {
            gLContextListener.onContextCreated();
            this.glContextListener = null;
        }
        GLSurfaceView.Renderer renderer = this.overlayRenderer;
        if (renderer != null) {
            renderer.onSurfaceCreated(gl10, eGLConfig);
        }
    }

    public PlatformGLRenderer(RenderDelegate renderDelegate, GLContextListener gLContextListener) {
        this(renderDelegate, gLContextListener, null);
    }

    public PlatformGLRenderer(RenderDelegate renderDelegate, GLContextListener gLContextListener, GLSurfaceView.Renderer renderer) {
        this.viewport = null;
        this.isContextLost = false;
        this.hasSurface = false;
        this.nativeObject = null;
        this.glContextListener = null;
        this.overlayRenderer = null;
        this.nativeObject = createNative(renderDelegate);
        this.glContextListener = gLContextListener;
        this.overlayRenderer = renderer;
    }
}

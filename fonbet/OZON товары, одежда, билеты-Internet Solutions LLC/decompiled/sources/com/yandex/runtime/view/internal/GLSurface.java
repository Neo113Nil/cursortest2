package com.yandex.runtime.view.internal;

import android.opengl.GLSurfaceView;
import android.view.Surface;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class GLSurface {
    private EGLConfigChooserImpl configChooser;
    private GLContextFactory glContextFactory;
    private boolean initialized = false;
    private GLRenderThread renderThread;
    private GLSurfaceView.Renderer renderer;

    public GLSurface(boolean z11) {
        EGLConfigChooserImpl eGLConfigChooserImpl = new EGLConfigChooserImpl();
        this.configChooser = eGLConfigChooserImpl;
        this.glContextFactory = new GLContextFactory(z11, eGLConfigChooserImpl);
    }

    public void onPause() {
        if (this.initialized) {
            this.renderThread.onPause();
        }
    }

    public void onResume() {
        if (this.initialized) {
            this.renderThread.onResume();
        }
    }

    public void onSurfaceAvailable(@NonNull Surface surface, int i11, int i12) {
        GLRenderThread gLRenderThread = new GLRenderThread(surface, this.configChooser, this.glContextFactory, this.renderer);
        this.renderThread = gLRenderThread;
        gLRenderThread.onSizeChanged(i11, i12);
        this.renderThread.start();
        this.initialized = true;
    }

    public boolean onSurfaceDestroyed(Surface surface) {
        if (!this.initialized) {
            return true;
        }
        stopRenderThread();
        return true;
    }

    public void onSurfaceSizeChanged(Surface surface, int i11, int i12) {
        if (this.initialized) {
            this.renderThread.onSizeChanged(i11, i12);
        }
    }

    public void onSurfaceUpdated(Surface surface) {
    }

    public void requestRender() {
        if (this.initialized) {
            this.renderThread.requestRender();
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        this.renderer = renderer;
    }

    protected void stopRenderThread() {
        this.renderThread.finish();
        try {
            this.renderThread.join();
        } catch (InterruptedException unused) {
        }
        this.initialized = false;
    }
}

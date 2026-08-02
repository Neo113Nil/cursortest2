package com.yandex.runtime.view.internal;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;

/* loaded from: classes9.dex */
public class GLTextureView implements RenderDelegate {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private EGLConfigChooserImpl eglConfigChooser;
    private GLContextFactory glContextFactory;
    private GLRenderThread renderThread;

    public GLTextureView(boolean z11) {
        EGLConfigChooserImpl eGLConfigChooserImpl = new EGLConfigChooserImpl();
        this.eglConfigChooser = eGLConfigChooserImpl;
        this.glContextFactory = new GLContextFactory(z11, eGLConfigChooserImpl);
    }

    private boolean isInitialized() {
        return this.renderThread != null;
    }

    protected void onPause() {
        if (isInitialized()) {
            this.renderThread.onPause();
        }
    }

    protected void onResume() {
        if (isInitialized()) {
            this.renderThread.onResume();
        }
    }

    protected void onSizeChanged(int i11, int i12) {
        if (isInitialized()) {
            this.renderThread.onSizeChanged(i11, i12);
        }
    }

    public void onTextureDestroyed() {
        if (isInitialized()) {
            this.renderThread.finish();
            try {
                this.renderThread.join();
            } catch (InterruptedException unused) {
            }
            this.renderThread = null;
        }
    }

    @Override // com.yandex.runtime.view.internal.RenderDelegate
    public void requestRender() {
        if (isInitialized()) {
            this.renderThread.requestRender();
        }
    }

    @Override // com.yandex.runtime.view.internal.RenderDelegate
    public void setForceRender(boolean z11) {
        if (isInitialized()) {
            this.renderThread.setForceRender(z11);
        }
    }

    protected void setRenderer(SurfaceTexture surfaceTexture, int i11, int i12, GLSurfaceView.Renderer renderer) {
        surfaceTexture.setDefaultBufferSize(i11, i12);
        GLRenderThread gLRenderThread = new GLRenderThread(surfaceTexture, this.eglConfigChooser, this.glContextFactory, renderer);
        this.renderThread = gLRenderThread;
        gLRenderThread.onSizeChanged(i11, i12);
        this.renderThread.start();
    }
}

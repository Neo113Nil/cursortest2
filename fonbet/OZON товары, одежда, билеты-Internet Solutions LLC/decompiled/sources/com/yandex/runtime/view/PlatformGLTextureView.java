package com.yandex.runtime.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;

/* loaded from: classes9.dex */
public class PlatformGLTextureView extends PlatformGLSurfaceTextureView implements TextureView.SurfaceTextureListener {
    private TextureViewImpl textureView;

    private class TextureViewImpl extends TextureView {
        TextureViewImpl(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            setSurfaceTextureListener(PlatformGLTextureView.this);
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (PlatformGLTextureView.this.onTouchEvent(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.TextureView, android.view.View
        public void onSizeChanged(int i11, int i12, int i13, int i14) {
            super.onSizeChanged(i11, i12, i13, i14);
            PlatformGLTextureView.this.onSizeChanged(i11, i12);
        }
    }

    public PlatformGLTextureView(Context context) {
        this(context, null, 0, false);
    }

    public Bitmap getBitmap() {
        return this.textureView.getBitmap();
    }

    @Override // com.yandex.runtime.view.PlatformGLSurfaceTextureView, com.yandex.runtime.view.PlatformView
    public View getView() {
        return this.textureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        setTexture(surfaceTexture, i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        onTextureDestroyed();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        onSizeChanged(i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
    }

    public PlatformGLTextureView(Context context, boolean z11) {
        this(context, null, 0, z11);
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, false);
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, z11);
        this.textureView = new TextureViewImpl(context, attributeSet);
    }
}

package com.vk.photo.editor.features.collage.gl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import xsna.m2t;

/* compiled from: GLCollageView.kt */
/* loaded from: classes4.dex */
public final class GLCollageView extends m2t {
    public GLCollageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new m2t.b(8, 16));
    }

    @Override // xsna.m2t
    public void setRenderer(GLSurfaceView.Renderer renderer) {
        super.setRenderer(renderer);
        setRenderMode(0);
    }
}

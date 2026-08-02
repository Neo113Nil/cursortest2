package com.vk.media.render;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.vk.media.render.RenderBase;
import xsna.soo0;

/* compiled from: RenderBase.java */
/* loaded from: classes3.dex */
public final class a implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ RenderBase.g b;

    public a(RenderBase.g gVar) {
        this.b = gVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        soo0 soo0Var = this.b.k;
        if (soo0Var != null) {
            soo0Var.a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        soo0 soo0Var = this.b.k;
        if (soo0Var == null) {
            return false;
        }
        soo0Var.b();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}

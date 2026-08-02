package com.journeyapps.barcodescanner;

import N9.m;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes9.dex */
final class b implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f60270a;

    b(c cVar) {
        this.f60270a = cVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        onSurfaceTextureSizeChanged(surfaceTexture, i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        m mVar = new m(i11, i12);
        c cVar = this.f60270a;
        cVar.f60287p = mVar;
        cVar.x();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

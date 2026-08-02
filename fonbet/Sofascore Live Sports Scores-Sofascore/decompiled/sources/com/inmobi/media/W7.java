package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class W7 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ X7 a;

    public W7(X7 x7) {
        this.a = x7;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        InterfaceC3451gk interfaceC3451gk = this.a.e;
        if (interfaceC3451gk != null) {
            interfaceC3451gk.a(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        InterfaceC3451gk interfaceC3451gk = this.a.e;
        if (interfaceC3451gk == null) {
            return true;
        }
        interfaceC3451gk.a();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }
}

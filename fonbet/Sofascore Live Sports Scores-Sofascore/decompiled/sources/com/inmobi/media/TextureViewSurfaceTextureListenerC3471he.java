package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class TextureViewSurfaceTextureListenerC3471he implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C3497ie a;

    public TextureViewSurfaceTextureListenerC3471he(C3497ie c3497ie) {
        this.a = c3497ie;
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

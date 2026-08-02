package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Nn implements InterfaceC3451gk {
    public final /* synthetic */ On a;

    public Nn(On on) {
        this.a = on;
    }

    @Override // com.inmobi.media.InterfaceC3451gk
    public final void a(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        Surface surface = new Surface(surfaceTexture);
        On on = this.a;
        on.g = surface;
        MediaPlayer mediaPlayer = on.b;
        mediaPlayer.getClass();
        try {
            mediaPlayer.setSurface(surface);
        } catch (IllegalStateException unused) {
        }
        this.a.a();
        InterfaceC3477hk interfaceC3477hk = this.a.h;
        if (interfaceC3477hk != null) {
            interfaceC3477hk.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC3451gk
    public final void a() {
        Surface surface = this.a.g;
        if (surface != null) {
            surface.release();
        }
        On on = this.a;
        on.g = null;
        MediaPlayer mediaPlayer = on.b;
        mediaPlayer.getClass();
        try {
            mediaPlayer.setSurface(null);
        } catch (IllegalStateException unused) {
        }
        this.a.a();
    }
}

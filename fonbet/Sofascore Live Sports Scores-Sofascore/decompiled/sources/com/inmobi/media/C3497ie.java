package com.inmobi.media;

import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import defpackage.dmi;
import defpackage.q2m;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ie, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3497ie {
    public final C3669p5 a;
    public final RelativeLayout b;
    public final MediaPlayer c;
    public final C3906y9 d;
    public InterfaceC3451gk e;

    public C3497ie(C3669p5 c3669p5, RelativeLayout relativeLayout, MediaPlayer mediaPlayer, C3906y9 c3906y9) {
        c3669p5.getClass();
        relativeLayout.getClass();
        mediaPlayer.getClass();
        this.a = c3669p5;
        this.b = relativeLayout;
        this.c = mediaPlayer;
        this.d = c3906y9;
    }

    public final void a(InterfaceC3451gk interfaceC3451gk) {
        interfaceC3451gk.getClass();
        this.e = interfaceC3451gk;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.b.addView(this.a, layoutParams);
        a();
        int videoWidth = this.c.getVideoWidth();
        int videoHeight = this.c.getVideoHeight();
        C3669p5 c3669p5 = this.a;
        if (videoHeight == 0) {
            c3669p5.setAspectRatio(1.0f);
        } else {
            c3669p5.setAspectRatio(videoWidth / videoHeight);
        }
        this.a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC3471he(this));
    }

    public final void a() {
        this.c.setOnVideoSizeChangedListener(new q2m(this, 1));
    }

    public static final void a(C3497ie c3497ie, MediaPlayer mediaPlayer, int i, int i2) {
        C3906y9 c3906y9 = c3497ie.d;
        if (c3906y9 != null) {
            c3906y9.a("NativePlayerTextureManager", dmi.k(i, i2, "Video Size Changed: ", " x "));
        }
        int videoWidth = c3497ie.c.getVideoWidth();
        int videoHeight = c3497ie.c.getVideoHeight();
        C3669p5 c3669p5 = c3497ie.a;
        if (videoHeight == 0) {
            c3669p5.setAspectRatio(1.0f);
        } else {
            c3669p5.setAspectRatio(videoWidth / videoHeight);
        }
    }
}

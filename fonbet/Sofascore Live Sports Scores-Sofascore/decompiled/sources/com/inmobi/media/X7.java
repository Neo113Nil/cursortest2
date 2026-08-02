package com.inmobi.media;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.dmi;
import defpackage.vg6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class X7 {
    public final C3669p5 a;
    public final K1 b;
    public final ExoPlayer c;
    public final InterfaceC3880x9 d;
    public InterfaceC3451gk e;

    public X7(C3669p5 c3669p5, K1 k1, ExoPlayer exoPlayer, InterfaceC3880x9 interfaceC3880x9) {
        c3669p5.getClass();
        k1.getClass();
        exoPlayer.getClass();
        this.a = c3669p5;
        this.b = k1;
        this.c = exoPlayer;
        this.d = interfaceC3880x9;
    }

    public final void a(InterfaceC3451gk interfaceC3451gk) {
        interfaceC3451gk.getClass();
        this.e = interfaceC3451gk;
        this.b.addView(this.a, new FrameLayout.LayoutParams(-1, -1));
        vg6 vg6Var = (vg6) this.c;
        vg6Var.j0();
        int i = vg6Var.j0.a;
        vg6 vg6Var2 = (vg6) this.c;
        vg6Var2.j0();
        int i2 = vg6Var2.j0.b;
        C3669p5 c3669p5 = this.a;
        if (i2 == 0) {
            c3669p5.setAspectRatio(1.0f);
        } else {
            c3669p5.setAspectRatio(i / i2);
        }
        this.a.setSurfaceTextureListener(new W7(this));
    }

    public final void a(int i, int i2) {
        InterfaceC3880x9 interfaceC3880x9 = this.d;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("HtmlPlayerTextureManager", dmi.k(i, i2, "Video Size Changed: ", " x "));
        }
        vg6 vg6Var = (vg6) this.c;
        vg6Var.j0();
        int i3 = vg6Var.j0.a;
        vg6 vg6Var2 = (vg6) this.c;
        vg6Var2.j0();
        int i4 = vg6Var2.j0.b;
        C3669p5 c3669p5 = this.a;
        if (i4 == 0) {
            c3669p5.setAspectRatio(1.0f);
        } else {
            c3669p5.setAspectRatio(i3 / i4);
        }
    }
}

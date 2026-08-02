package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import defpackage.fdi;
import defpackage.ku3;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class On {
    public final ku3 a;
    public final MediaPlayer b;
    public final C3906y9 c;
    public final AtomicBoolean d;
    public final ArrayList e;
    public final C3497ie f;
    public Surface g;
    public InterfaceC3477hk h;
    public final C3842vn i;
    public final Nn j;

    public On(ku3 ku3Var, MediaPlayer mediaPlayer, RelativeLayout relativeLayout, C3687pn c3687pn, C3906y9 c3906y9) {
        ku3Var.getClass();
        mediaPlayer.getClass();
        relativeLayout.getClass();
        c3687pn.getClass();
        this.a = ku3Var;
        this.b = mediaPlayer;
        this.c = c3906y9;
        this.d = new AtomicBoolean(false);
        this.e = new ArrayList();
        Context context = relativeLayout.getContext();
        context.getClass();
        C3669p5 c3669p5 = new C3669p5(context);
        this.f = new C3497ie(c3669p5, relativeLayout, mediaPlayer, c3906y9);
        this.i = new C3842vn(ku3Var, c3669p5, c3687pn.e);
        this.j = new Nn(this);
    }

    public final void a() {
        if (this.g != null && this.d.get()) {
            Ng ng = (Ng) this.i.d.getValue();
            ng.f.set(false);
            ng.a();
            return;
        }
        Ng ng2 = (Ng) this.i.d.getValue();
        ((fdi) ng2.b).l(EnumC3610mo.HIDDEN);
        ng2.f.set(true);
        P6.a(ng2.e);
        ng2.e = null;
    }

    public final void b() {
        X4.a(this.e);
        C3497ie c3497ie = this.f;
        c3497ie.e = null;
        c3497ie.a.setSurfaceTextureListener(null);
        c3497ie.c.setOnVideoSizeChangedListener(null);
        Ng ng = (Ng) this.i.d.getValue();
        ng.f.set(true);
        P6.a(ng.e);
        ng.e = null;
        Surface surface = this.g;
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.h = null;
    }
}

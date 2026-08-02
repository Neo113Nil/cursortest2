package com.inmobi.media;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.ku3;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.w8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3853w8 {
    public final ku3 a;
    public final ExoPlayer b;
    public final ArrayList c;
    public final X7 d;
    public Surface e;
    public InterfaceC3477hk f;
    public boolean g;
    public final C3827v8 h;

    public C3853w8(ku3 ku3Var, ExoPlayer exoPlayer, K1 k1, InterfaceC3880x9 interfaceC3880x9) {
        ku3Var.getClass();
        exoPlayer.getClass();
        k1.getClass();
        this.a = ku3Var;
        this.b = exoPlayer;
        this.c = new ArrayList();
        Context context = k1.getContext();
        context.getClass();
        this.d = new X7(new C3669p5(context), k1, exoPlayer, interfaceC3880x9);
        this.h = new C3827v8(this);
    }

    public final void a() {
        X4.a(this.c);
        X7 x7 = this.d;
        x7.e = null;
        x7.a.setSurfaceTextureListener(null);
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.e = null;
        this.f = null;
    }
}

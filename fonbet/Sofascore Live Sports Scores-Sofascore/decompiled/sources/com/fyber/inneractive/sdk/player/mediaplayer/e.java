package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.SurfaceHolder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e implements Runnable {
    public final /* synthetic */ SurfaceHolder a;
    public final /* synthetic */ p b;

    public e(p pVar, SurfaceHolder surfaceHolder) {
        this.b = pVar;
        this.a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.b, this.a);
    }
}

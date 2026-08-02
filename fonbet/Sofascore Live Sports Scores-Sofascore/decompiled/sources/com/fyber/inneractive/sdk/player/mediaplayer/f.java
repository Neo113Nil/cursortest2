package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f implements Runnable {
    public final /* synthetic */ Surface a;
    public final /* synthetic */ p b;

    public f(p pVar, Surface surface) {
        this.b = pVar;
        this.a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.b, this.a);
    }
}

package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* loaded from: classes12.dex */
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

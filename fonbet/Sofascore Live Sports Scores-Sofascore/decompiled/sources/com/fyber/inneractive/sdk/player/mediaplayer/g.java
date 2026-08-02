package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g implements Runnable {
    public final /* synthetic */ p a;

    public g(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.a);
        p pVar = this.a;
        Handler handler = pVar.o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            pVar = this.a;
            pVar.o = null;
        }
        pVar.n = null;
        Looper.myLooper().quit();
    }
}

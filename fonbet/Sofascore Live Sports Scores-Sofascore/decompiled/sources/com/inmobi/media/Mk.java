package com.inmobi.media;

import java.util.TimerTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Mk extends TimerTask {
    public final /* synthetic */ Nk a;
    public final /* synthetic */ byte b;

    public Mk(Nk nk, byte b) {
        this.a = nk;
        this.b = b;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}

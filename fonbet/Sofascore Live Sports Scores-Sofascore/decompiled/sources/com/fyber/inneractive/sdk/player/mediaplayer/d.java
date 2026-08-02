package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d implements Runnable {
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b a;
    public final /* synthetic */ p b;

    public d(p pVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.b = pVar;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.b.i;
        if (nVar != null) {
            ((q) nVar).a(this.a);
        }
    }
}

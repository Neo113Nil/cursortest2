package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;

/* loaded from: classes12.dex */
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

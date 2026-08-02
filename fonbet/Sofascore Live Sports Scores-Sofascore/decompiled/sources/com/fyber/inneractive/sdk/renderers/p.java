package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p implements Runnable {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.a;
        if (rVar.t != null) {
            IAlog.a("%sIdle state reached!", IAlog.a(rVar));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.a.k;
            if (bVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.s) bVar).j(true);
            }
            this.a.t = null;
        }
    }
}

package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements Runnable {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%s : remote UI failed task executed", "RemoteUIWebviewController");
        d dVar = this.a;
        if (dVar.h) {
            return;
        }
        dVar.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_LOAD_TIMEOUT, "Loading remote UI timed out", true, null);
    }
}

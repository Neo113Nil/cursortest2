package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.m5k;

/* loaded from: classes12.dex */
public final class c implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ d b;

    public c(d dVar, String str) {
        this.b = dVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.b.a;
        String str = this.a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.a;
        if (aVar != null) {
            try {
                aVar.loadDataWithBaseURL(null, str, "text/html", C.UTF8_NAME, null);
            } catch (Throwable th) {
                if (fVar.e != null) {
                    fVar.e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, m5k.b(th, new StringBuilder("Unable to load data: ")), "");
                }
            }
        }
    }
}

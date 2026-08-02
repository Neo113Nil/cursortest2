package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
                    fVar.e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, bf3.o(new StringBuilder("Unable to load data: "), th), "");
                }
            }
        }
    }
}

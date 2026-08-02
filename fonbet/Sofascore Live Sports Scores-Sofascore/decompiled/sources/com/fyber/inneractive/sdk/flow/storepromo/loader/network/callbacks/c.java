package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.appsflyer.internal.i;
import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.util.IAlog;
import defpackage.dmi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements f0 {
    public final g a;
    public boolean b = false;
    public final String c;

    public c(g gVar, String str) {
        this.a = gVar;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if ((r2 - r3) < 2) goto L21;
     */
    @Override // com.fyber.inneractive.sdk.network.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        boolean z2 = false;
        if (this.b) {
            IAlog.a("StorePromoTemplateCallback: onNetworkResult: the cached response was applied and this one being cached", new Object[0]);
            return;
        }
        IAlog.a(i.j("StorePromoTemplateCallback: onNetworkResult: fromCache: ", z), new Object[0]);
        this.b = true;
        if (str != null && exc == null) {
            g gVar = this.a;
            gVar.getClass();
            IAlog.a("StorePromoResourcesLoader: onTemplateDownloaded", new Object[0]);
            gVar.d.c = str;
            gVar.a(null, false, null, null);
            return;
        }
        String q = dmi.q("Unable download store promo template, error: ", exc != null ? exc.getMessage() != null ? exc.getMessage() : exc.toString() : "");
        g gVar2 = this.a;
        com.fyber.inneractive.sdk.flow.storepromo.events.a aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
        String str2 = this.c;
        if (com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.TEMPLATE_FAILURE == com.fyber.inneractive.sdk.flow.storepromo.loader.network.b.SCREENSHOT_FAILURE) {
            int i = gVar2.f;
            int i2 = gVar2.g + 1;
            gVar2.g = i2;
        }
        z2 = true;
        gVar2.a(aVar, z2, q, str2);
    }
}

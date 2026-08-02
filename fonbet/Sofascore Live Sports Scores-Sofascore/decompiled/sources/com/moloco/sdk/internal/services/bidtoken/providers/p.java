package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p implements j {
    public final com.appsflyer.c a;
    public o b = d();

    public p(com.appsflyer.c cVar) {
        this.a = cVar;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        o d = d();
        boolean z = !d.equals(this.b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "[Ilrd] needsRefresh: " + z + ", with current: " + d + ", cached: " + this.b, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "IlrdSignalProvider";
    }

    public final o d() {
        o d;
        try {
            com.moloco.sdk.internal.ilrd.n nVar = (com.moloco.sdk.internal.ilrd.n) this.a.invoke();
            if (nVar != null && (d = nVar.d()) != null) {
                return d;
            }
            return new o("", -1L, -1L, -1, -1, -1, -1, -1);
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "Error retrieving ILRD signal", e, false, 8, null);
            return new o("", -1L, -1L, -1, -1, -1, -1, -1);
        }
    }
}

package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import defpackage.kql;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class m {
    public com.fyber.inneractive.sdk.flow.o a;
    public volatile boolean b = false;
    public final com.fyber.inneractive.sdk.config.global.r c;
    public final String d;

    public m(com.fyber.inneractive.sdk.config.global.r rVar, String str, com.fyber.inneractive.sdk.flow.o oVar) {
        this.a = oVar;
        this.c = rVar;
        this.d = str;
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        com.fyber.inneractive.sdk.flow.o oVar;
        com.fyber.inneractive.sdk.flow.x xVar;
        if (this.a == null) {
            return;
        }
        if (this.b) {
            IAlog.e("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.config.r0 a = com.fyber.inneractive.sdk.config.a.a(eVar.m);
        if (inneractiveAdRequest != null) {
            inneractiveAdRequest.setSelectedUnitConfig(a);
        }
        com.fyber.inneractive.sdk.config.global.e eVar2 = new com.fyber.inneractive.sdk.config.global.e();
        ImpressionData impressionData = eVar.r;
        eVar2.a = impressionData != null ? impressionData.getDemandId() : null;
        try {
            eVar2.b = Long.valueOf(IAConfigManager.N.d);
        } catch (NumberFormatException unused) {
            IAlog.a("invalid publisherId", new Object[0]);
        }
        this.c.a(eVar2);
        InneractiveErrorCode a2 = a == null ? InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH : eVar.a(inneractiveAdRequest, this.c);
        if (a2 != null) {
            com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.CONTENT_ERROR_UNSPECIFIED;
            if (a == null || a2 == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
                iVar = com.fyber.inneractive.sdk.flow.i.NO_APP_CONFIG_AVAILABLE;
                IAlog.b("%sGot configuration mismatch!", IAlog.a(this));
                IAConfigManager.a();
            }
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(a2, iVar);
            Exception exc = eVar.w;
            if (exc != null) {
                inneractiveInfrastructureError.setCause(exc);
            }
            com.fyber.inneractive.sdk.response.a a3 = com.fyber.inneractive.sdk.response.a.a(eVar.g);
            if (a3 != null) {
                Exception exc2 = eVar.w;
                if (exc2 != null) {
                    inneractiveInfrastructureError.setCause(exc2);
                }
                com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(eVar, inneractiveAdRequest, a3 == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", this.c.b()), inneractiveInfrastructureError));
            }
            com.fyber.inneractive.sdk.config.global.r rVar = this.c;
            if (rVar == null) {
                InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(this.d);
                rVar = (spot == null || spot.getAdContent() == null) ? null : spot.getAdContent().c;
            }
            com.fyber.inneractive.sdk.flow.a.a(inneractiveAdRequest, inneractiveInfrastructureError, null, eVar, rVar != null ? rVar.b() : null);
            if (this.b || (oVar = this.a) == null) {
                return;
            }
            oVar.a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
            return;
        }
        com.fyber.inneractive.sdk.flow.o oVar2 = this.a;
        if (oVar2.f) {
            IAlog.e("IAAdSourceBase: load cancelled: ignoring response. Previous load request was cancelled", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVar2 = oVar2.c;
        IAlog.e("%sonAdDataAvailable: got response data: %s", oVar2.d(), eVar);
        if (eVar.a()) {
            com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.N.D;
            if (hVar.f) {
                hVar.a((kql) null);
            }
        }
        com.fyber.inneractive.sdk.response.a a4 = com.fyber.inneractive.sdk.response.a.a(eVar.g);
        com.fyber.inneractive.sdk.interfaces.c cVar = oVar2.a;
        if (cVar != null && (xVar = ((com.fyber.inneractive.sdk.flow.k) cVar).c) != null) {
            xVar.destroy();
        }
        com.fyber.inneractive.sdk.factories.e eVar3 = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.a.a.get(a4);
        com.fyber.inneractive.sdk.interfaces.c a5 = eVar3 != null ? eVar3.a() : null;
        oVar2.a = a5;
        if (a5 == null) {
            IAlog.f("%sonAdDataAvailable: Cannot find content handler for ad type: %s", oVar2.d(), a4);
            com.fyber.inneractive.sdk.flow.n nVar = oVar2.b;
            if (nVar != null) {
                ((com.fyber.inneractive.sdk.flow.e0) nVar).a(inneractiveAdRequest, eVar, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.NO_CONTENT_LOADER_AVAILABLE));
            }
        } else {
            IAlog.e("%sonAdDataAvailable: found response loader: %s", oVar2.d(), oVar2.a);
        }
        com.fyber.inneractive.sdk.interfaces.c cVar2 = oVar2.a;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.k) cVar2).a(inneractiveAdRequest, eVar, rVar2, oVar2, oVar2);
        } else {
            z.a("NullPointerException prevented", "mAdContentLoader is null", inneractiveAdRequest, eVar);
        }
    }

    public String b() {
        return null;
    }

    public void a() {
        this.b = true;
        this.a = null;
    }
}

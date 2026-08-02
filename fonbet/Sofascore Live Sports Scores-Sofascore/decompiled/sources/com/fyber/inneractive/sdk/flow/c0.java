package com.fyber.inneractive.sdk.flow;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c0 {
    public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.y a;
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r b;
    public final /* synthetic */ String c;
    public final /* synthetic */ h0 d;

    public c0(h0 h0Var, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        this.d = h0Var;
        this.a = yVar;
        this.b = rVar;
        this.c = str;
    }

    public final void a(Exception exc, InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.response.e... eVarArr) {
        boolean z = this.d.n.get();
        h0 h0Var = this.d;
        if (z) {
            IAlog.a("%s : onResponseDataError: spot is already destroyed won't continue", h0.a(h0Var));
            h0 h0Var2 = this.d;
            p pVar = h0Var2.l;
            h0Var2.a(h0Var2.e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl data error", h0.a(h0Var));
        com.fyber.inneractive.sdk.response.e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
        this.d.getClass();
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a ? i.NATIVE_AD_PARSING_ERROR : i.ADM_FETCH_FAILED);
        e0 e0Var = this.d.d;
        if (e0Var != null) {
            e0Var.a(null, eVar, inneractiveInfrastructureError);
        }
        p pVar2 = this.d.l;
        if (pVar2 != null) {
            IAlog.e("%sgot handleFailedLoading! with: %s", pVar2.d(), inneractiveInfrastructureError);
            n nVar = pVar2.b;
            if (nVar != null) {
                ((e0) nVar).a(null, eVar, inneractiveInfrastructureError);
            }
            if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
                pVar2.a(null, eVar);
            }
        }
        h0 h0Var3 = this.d;
        String str = this.c;
        com.fyber.inneractive.sdk.config.global.r rVar = this.b;
        h0Var3.getClass();
        int i = f0.a[inneractiveErrorCode.ordinal()];
        com.fyber.inneractive.sdk.network.t tVar = (i == 1 || i == 2) ? com.fyber.inneractive.sdk.network.t.FATAL_ADM_MARKUP_FETCHING_ERROR : i != 3 ? com.fyber.inneractive.sdk.network.t.FATAL_ADM_PARSING_ERROR : com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_INVALID_NATIVE_RESPONSE;
        if (eVar != null) {
            eVar.A = false;
        }
        String name = exc.getClass().getName();
        if (exc instanceof k1) {
            name = "NetworkStackException";
        }
        JSONArray b = rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.b = tVar;
        wVar.a = null;
        wVar.d = b;
        com.fyber.inneractive.sdk.network.x xVar = new com.fyber.inneractive.sdk.network.x();
        xVar.a(name, "exception").a(exc.getLocalizedMessage() != null ? exc.getLocalizedMessage() : exc, PglCryptUtils.KEY_MESSAGE);
        InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD;
        if (inneractiveErrorCode == inneractiveErrorCode2 && exc.getCause() != null && exc.getCause().getCause() != null) {
            xVar.a(exc.getCause().getCause().getMessage(), "reason");
        } else if (inneractiveErrorCode != inneractiveErrorCode2) {
            xVar.a(str, "admPayload");
        }
        wVar.f.put(xVar.a);
        wVar.a((String) null);
    }

    public final void a() {
        com.fyber.inneractive.sdk.config.global.b bVar;
        com.fyber.inneractive.sdk.config.global.k kVar;
        com.fyber.inneractive.sdk.config.global.l lVar;
        IAlog.a("%s : InneractiveAdSpotImpl markup data available", h0.a(this.d));
        if (this.d.n.get()) {
            h0 h0Var = this.d;
            p pVar = h0Var.l;
            h0Var.a(h0Var.e);
            return;
        }
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.a.a;
        if (admParametersOuterClass$AdmParameters != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.b;
            List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
            rVar.getClass();
            com.fyber.inneractive.sdk.config.global.a aVar = IAConfigManager.N.y;
            aVar.getClass();
            for (com.fyber.inneractive.sdk.config.global.features.i iVar : rVar.b.values()) {
                if (iVar != null && (lVar = aVar.a) != null) {
                    com.fyber.inneractive.sdk.config.global.q qVar = (com.fyber.inneractive.sdk.config.global.q) lVar.a.get(iVar.b);
                    if (qVar != null) {
                        iVar.a = qVar.a;
                    }
                }
            }
            if (abExperimentsList == null || abExperimentsList.size() <= 0) {
                return;
            }
            com.fyber.inneractive.sdk.config.global.a aVar2 = IAConfigManager.N.y;
            aVar2.b = rVar;
            for (com.fyber.inneractive.sdk.config.global.features.i iVar2 : rVar.b.values()) {
                for (AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                    String identifier = experiment.getIdentifier();
                    String variant = experiment.getVariant();
                    com.fyber.inneractive.sdk.config.global.l lVar2 = aVar2.a;
                    if (lVar2 != null) {
                        com.fyber.inneractive.sdk.config.global.q qVar2 = (com.fyber.inneractive.sdk.config.global.q) lVar2.a.get(iVar2.b);
                        if (qVar2 != null && (bVar = (com.fyber.inneractive.sdk.config.global.b) qVar2.c.get(identifier)) != null) {
                            Iterator it = bVar.c.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    kVar = (com.fyber.inneractive.sdk.config.global.k) it.next();
                                    if (kVar.b.equals(variant)) {
                                        break;
                                    }
                                } else {
                                    kVar = null;
                                    break;
                                }
                            }
                            iVar2.c.put(bVar.a, bVar);
                            if (kVar != null) {
                                iVar2.d.put(bVar.a, kVar);
                            }
                        }
                    }
                }
            }
        }
    }
}

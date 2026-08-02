package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b {
    public final t0 a;
    public n b;

    public b(t0 t0Var) {
        this.a = t0Var;
    }

    public final a a() {
        com.fyber.inneractive.sdk.measurement.e eVar;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        UnitDisplayType unitDisplayType;
        n nVar = this.b;
        if (nVar != null) {
            return nVar;
        }
        Application application = com.fyber.inneractive.sdk.util.o.a;
        t0 t0Var2 = this.a;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var2.b;
        s0 s0Var = t0Var2.d;
        InneractiveAdRequest inneractiveAdRequest = t0Var2.a;
        if (s0Var != null) {
            IAConfigManager iAConfigManager = IAConfigManager.N;
            Boolean c = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.L.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c(com.ironsource.mediationsdk.metadata.a.k);
            boolean booleanValue = c != null ? c.booleanValue() : false;
            IAlog.a("OMSDK AB %s", String.valueOf(booleanValue));
            if (booleanValue && (t0Var = ((r0) this.a.d).f) != null && ((unitDisplayType = t0Var.j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)) {
                eVar = iAConfigManager.J;
                n nVar2 = new n(application, gVar, s0Var, inneractiveAdRequest, t0Var2, eVar);
                this.b = nVar2;
                return nVar2;
            }
        }
        eVar = null;
        n nVar22 = new n(application, gVar, s0Var, inneractiveAdRequest, t0Var2, eVar);
        this.b = nVar22;
        return nVar22;
    }
}

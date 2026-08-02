package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f extends f0 {
    public f(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.a;
        if (zVar != null) {
            return zVar;
        }
        Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        com.fyber.inneractive.sdk.player.controller.g gVar = new com.fyber.inneractive.sdk.player.controller.g(this.c, this.b, inneractiveAdSpot.getAdContent().d, t0Var.c, selectedUnitController instanceof u0 ? ((u0) selectedUnitController).isOverlayOutside() : false, IAConfigManager.N.k || t0Var.f, a());
        this.a = gVar;
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void b() {
        this.c.getClass();
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.player.ui.s sVar = this.b;
        if (sVar != null) {
            return sVar;
        }
        com.fyber.inneractive.sdk.player.ui.i iVar = new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.f(), this.c, rVar, a());
        this.b = iVar;
        return iVar;
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
        this.c.getClass();
        eVar.a();
    }
}

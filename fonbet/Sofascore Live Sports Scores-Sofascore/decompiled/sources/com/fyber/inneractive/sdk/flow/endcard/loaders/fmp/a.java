package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import com.fyber.inneractive.sdk.flow.endcard.j;
import com.fyber.inneractive.sdk.flow.endcard.o;
import com.fyber.inneractive.sdk.flow.y0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a {
    public final y0 a;
    public final j b;
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b c;
    public o d;

    public a(j jVar, y0 y0Var, com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar) {
        this.b = jVar;
        this.a = y0Var;
        this.c = bVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar = this.c;
        o oVar = this.d;
        bVar.getClass();
        if (oVar != null) {
            IAlog.a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", oVar.i());
            bVar.d.a(oVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a(String str) {
        this.c.getClass();
        IAlog.a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
    }
}

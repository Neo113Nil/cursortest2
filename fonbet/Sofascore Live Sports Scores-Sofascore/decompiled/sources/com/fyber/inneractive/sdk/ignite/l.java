package com.fyber.inneractive.sdk.ignite;

import android.content.Context;
import defpackage.de0;
import defpackage.dr9;
import defpackage.ebm;
import defpackage.hpo;
import defpackage.o8m;
import defpackage.pdm;
import defpackage.vgm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l extends dr9 {
    public l(Context context, k kVar, com.fyber.inneractive.sdk.ignite.events.wrappers.a aVar, boolean z, boolean z2, boolean z3, h hVar) {
        l lVar;
        ebm vgmVar;
        hpo.c.a = kVar;
        de0.g.b = aVar;
        o8m o8mVar = new o8m(context);
        if (z && z2) {
            pdm pdmVar = new pdm(o8mVar, hVar, 0);
            lVar = this;
            vgmVar = new vgm(pdmVar, true, z3, hVar, lVar);
        } else {
            lVar = this;
            vgmVar = z ? new vgm(o8mVar, false, z3, hVar, lVar) : z2 ? new pdm(o8mVar, hVar, 0) : new pdm(o8mVar, hVar, 1);
        }
        lVar.a = vgmVar;
    }
}

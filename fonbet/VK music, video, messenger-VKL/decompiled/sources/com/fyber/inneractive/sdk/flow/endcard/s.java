package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q0;

/* loaded from: classes12.dex */
public final class s implements com.fyber.inneractive.sdk.web.g {
    public final /* synthetic */ u a;

    public s(u uVar) {
        this.a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        IAlog.a("%s End-Card loaded", this.a.a);
        this.a.h.set(false);
        u uVar = this.a;
        uVar.getClass();
        boolean z = iVar != null;
        uVar.f = z;
        com.fyber.inneractive.sdk.web.m mVar = z ? iVar.b : null;
        String str = IAConfigManager.N.E.e;
        if (!uVar.f() || mVar == null || TextUtils.isEmpty(str)) {
            uVar.b.m();
        } else {
            q0.a(mVar, str, uVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.f("%s End-Card failed to load!", this.a.a);
        this.a.h.set(false);
        u uVar = this.a;
        uVar.f = false;
        uVar.b.a(inneractiveInfrastructureError);
    }
}

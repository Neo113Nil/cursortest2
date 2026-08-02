package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w extends f {
    public w(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        boolean equals = "true".equals(this.b.get("shouldUseCustomClose"));
        if (InneractiveAdManager.isCurrentUserAChild()) {
            equals = false;
        }
        i0 i0Var = this.c;
        i0Var.X = equals;
        j1 j1Var = i0Var.g;
        if (j1Var != null) {
            ((com.fyber.inneractive.sdk.web.b0) j1Var).b(equals);
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return false;
    }
}

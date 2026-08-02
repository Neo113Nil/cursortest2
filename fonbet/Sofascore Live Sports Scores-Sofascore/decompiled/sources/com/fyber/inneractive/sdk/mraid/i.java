package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i extends e {
    public i(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        int a = a("w");
        int a2 = a(com.mbridge.msdk.foundation.same.report.h.b);
        this.c.a((String) this.b.get("url"), a <= 0 ? -1 : a, a2 <= 0 ? -1 : a2, "true".equals(this.b.get("shouldUseCustomClose")), "true".equals(this.b.get("lockOrientation")));
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return (String) this.b.get("url");
    }
}

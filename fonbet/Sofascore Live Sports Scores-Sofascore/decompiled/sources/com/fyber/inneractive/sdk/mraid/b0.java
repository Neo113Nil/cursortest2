package com.fyber.inneractive.sdk.mraid;

import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b0 extends y {
    public final com.fyber.inneractive.sdk.web.c0 a;

    public b0(com.fyber.inneractive.sdk.web.c0 c0Var) {
        this.a = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        return "placementType: '" + this.a.toString().toLowerCase(Locale.US) + "'";
    }
}

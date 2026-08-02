package com.fyber.inneractive.sdk.mraid;

import java.util.Locale;

/* loaded from: classes12.dex */
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

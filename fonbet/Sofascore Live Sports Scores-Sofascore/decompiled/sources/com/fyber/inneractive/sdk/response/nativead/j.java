package com.fyber.inneractive.sdk.response.nativead;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j extends com.fyber.inneractive.sdk.response.g {
    public final k S = new k();

    @Override // com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar) {
        InneractiveErrorCode a = this.S.d() ? com.fyber.inneractive.sdk.flow.vast.j.a(inneractiveAdRequest, this, rVar) : null;
        if (a != null) {
            return a;
        }
        this.S.getClass();
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode b() {
        return a(null, null);
    }
}

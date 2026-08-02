package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import com.fyber.inneractive.sdk.network.f0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t implements f0 {
    public final com.fyber.inneractive.sdk.response.nativead.f a;
    public final s b;

    public t(com.fyber.inneractive.sdk.response.nativead.f fVar, s sVar) {
        this.a = fVar;
        this.b = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        Uri uri = (Uri) obj;
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        if (exc != null || uri == null) {
            this.b.a(null, exc, this.a);
            return;
        }
        s sVar = this.b;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.a;
        sVar.a(new g(fVar.a, uri), null, fVar);
    }
}

package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import com.fyber.inneractive.sdk.network.f0;

/* loaded from: classes12.dex */
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

package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.c;
import xsna.cv90;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzbt {
    public final cv90<Object> getSpatulaHeader(c cVar) {
        exc0.i(cVar);
        return cVar.b(new zzbs(this, cVar));
    }

    public final cv90<Object> performProxyRequest(c cVar, ProxyRequest proxyRequest) {
        exc0.i(cVar);
        exc0.i(proxyRequest);
        return cVar.b(new zzbq(this, cVar, proxyRequest));
    }
}

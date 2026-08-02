package com.google.android.gms.internal.auth;

import B9.a;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class zzbt implements a {
    public final h getSpatulaHeader(f fVar) {
        AbstractC3191o.m(fVar);
        return fVar.h(new zzbs(this, fVar));
    }

    public final h performProxyRequest(f fVar, ProxyRequest proxyRequest) {
        AbstractC3191o.m(fVar);
        AbstractC3191o.m(proxyRequest);
        return fVar.h(new zzbq(this, fVar, proxyRequest));
    }
}

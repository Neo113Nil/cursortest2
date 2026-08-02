package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.Api;
import defpackage.d3n;
import defpackage.l3n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class Auth {
    public static final Api a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        d3n d3nVar = new d3n();
        l3n l3nVar = new l3n();
        Api api = AuthProxy.a;
        new Api("Auth.CREDENTIALS_API", d3nVar, clientKey);
        a = new Api("Auth.GOOGLE_SIGN_IN_API", l3nVar, clientKey2);
        Api api2 = AuthProxy.a;
        new com.google.android.gms.internal.p000authapi.zbd();
        new com.google.android.gms.auth.api.signin.internal.zbd();
    }

    private Auth() {
    }
}

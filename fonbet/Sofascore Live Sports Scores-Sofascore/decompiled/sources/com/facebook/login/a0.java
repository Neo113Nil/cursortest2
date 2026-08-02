package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.o0;
import com.facebook.login.LoginClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a0 implements o0 {
    public final /* synthetic */ WebViewLoginMethodHandler a;
    public final /* synthetic */ LoginClient.Request b;

    public a0(WebViewLoginMethodHandler webViewLoginMethodHandler, LoginClient.Request request) {
        this.a = webViewLoginMethodHandler;
        this.b = request;
    }

    @Override // com.facebook.internal.o0
    public final void a(Bundle bundle, com.facebook.q qVar) {
        LoginClient.Request request = this.b;
        request.getClass();
        this.a.s(request, bundle, qVar);
    }
}

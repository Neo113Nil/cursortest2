package com.unity3d.services.core.network.core;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import xsna.myc0;
import xsna.spj;
import xsna.zcl;

/* compiled from: LegacyHttpClient.kt */
/* loaded from: classes14.dex */
public final class LegacyHttpClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String NETWORK_CLIENT_LEGACY = "legacy";
    private final ISDKDispatchers dispatchers;

    /* compiled from: LegacyHttpClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public LegacyHttpClient(ISDKDispatchers iSDKDispatchers) {
        this.dispatchers = iSDKDispatchers;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, boolean z, spj<? super HttpResponse> spjVar) {
        return myc0.k(this.dispatchers.getIo(), new LegacyHttpClient$execute$2(httpRequest, z, null), spjVar);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        return (HttpResponse) myc0.i(this.dispatchers.getIo(), new LegacyHttpClient$executeBlocking$1(this, httpRequest, null));
    }
}

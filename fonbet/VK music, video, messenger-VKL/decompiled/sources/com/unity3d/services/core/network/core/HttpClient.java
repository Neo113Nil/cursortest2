package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import xsna.spj;

/* compiled from: HttpClient.kt */
/* loaded from: classes14.dex */
public interface HttpClient {

    /* compiled from: HttpClient.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object execute$default(HttpClient httpClient, HttpRequest httpRequest, boolean z, spj spjVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return httpClient.execute(httpRequest, z, spjVar);
        }
    }

    Object execute(HttpRequest httpRequest, boolean z, spj<? super HttpResponse> spjVar);

    HttpResponse executeBlocking(HttpRequest httpRequest) throws Exception;
}

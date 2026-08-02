package com.unity3d.services.core.network.model;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import defpackage.lm5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0004¨\u0006\u0005"}, d2 = {"isSuccessful", "", "Lcom/unity3d/services/core/network/model/HttpResponse;", "toHttpResponse", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpResponseKt {
    public static final boolean isSuccessful(@NotNull HttpResponse httpResponse) {
        httpResponse.getClass();
        int statusCode = httpResponse.getStatusCode();
        return 200 <= statusCode && statusCode < 300;
    }

    @NotNull
    public static final HttpResponse toHttpResponse(@NotNull UnityAdsNetworkException unityAdsNetworkException) {
        unityAdsNetworkException.getClass();
        Integer code = unityAdsNetworkException.getCode();
        int intValue = code != null ? code.intValue() : IronSourceError.ERROR_NO_INTERNET_CONNECTION;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        String url = unityAdsNetworkException.getUrl();
        if (url == null) {
            url = "";
        }
        String protocol = unityAdsNetworkException.getProtocol();
        if (protocol == null) {
            protocol = "";
        }
        String client = unityAdsNetworkException.getClient();
        if (client == null) {
            client = "unknown";
        }
        return new HttpResponse("", intValue, lm5Var, url, protocol, client, 0L, 64, null);
    }
}

package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.request.WebRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toWebRequest", "Lcom/unity3d/services/core/request/WebRequest;", "Lcom/unity3d/services/core/network/model/HttpRequest;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRequestToWebRequestKt {
    @NotNull
    public static final WebRequest toWebRequest(@NotNull HttpRequest httpRequest) {
        httpRequest.getClass();
        WebRequest webRequest = new WebRequest(httpRequest.getBaseURL(), httpRequest.getMethod().toString(), httpRequest.getHeaders(), httpRequest.getConnectTimeout(), httpRequest.getReadTimeout());
        Object body = httpRequest.getBody();
        if (body instanceof String) {
            webRequest.setBody((String) httpRequest.getBody());
            return webRequest;
        }
        if (body instanceof byte[]) {
            webRequest.setBody((byte[]) httpRequest.getBody());
        }
        return webRequest;
    }
}

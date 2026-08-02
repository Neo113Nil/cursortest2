package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.request.WebRequest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toHttpRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "Lcom/unity3d/services/core/request/WebRequest;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebRequestToHttpRequestKt {
    @NotNull
    public static final HttpRequest toHttpRequest(@NotNull WebRequest webRequest) {
        webRequest.getClass();
        String url = webRequest.getUrl().toString();
        url.getClass();
        String requestType = webRequest.getRequestType();
        requestType.getClass();
        RequestType valueOf = RequestType.valueOf(requestType);
        Map<String, List<String>> headers = webRequest.getHeaders();
        headers.getClass();
        return new HttpRequest(url, null, valueOf, webRequest.getBody(), headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131042, null);
    }
}

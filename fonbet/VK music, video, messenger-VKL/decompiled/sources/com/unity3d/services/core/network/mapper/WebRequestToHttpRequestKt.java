package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.request.WebRequest;

/* compiled from: WebRequestToHttpRequest.kt */
/* loaded from: classes14.dex */
public final class WebRequestToHttpRequestKt {
    public static final HttpRequest toHttpRequest(WebRequest webRequest) {
        return new HttpRequest(webRequest.getUrl().toString(), null, RequestType.valueOf(webRequest.getRequestType()), webRequest.getBody(), webRequest.getHeaders(), null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131042, null);
    }
}

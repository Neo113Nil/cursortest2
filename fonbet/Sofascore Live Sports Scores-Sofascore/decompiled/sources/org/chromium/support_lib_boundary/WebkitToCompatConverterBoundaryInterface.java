package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface WebkitToCompatConverterBoundaryInterface {
    InvocationHandler convertCookieManager(Object obj);

    Object convertSafeBrowsingResponse(InvocationHandler invocationHandler);

    InvocationHandler convertSafeBrowsingResponse(Object obj);

    Object convertServiceWorkerSettings(InvocationHandler invocationHandler);

    InvocationHandler convertServiceWorkerSettings(Object obj);

    InvocationHandler convertSettings(WebSettings webSettings);

    Object convertWebMessagePort(InvocationHandler invocationHandler);

    InvocationHandler convertWebMessagePort(Object obj);

    Object convertWebResourceError(InvocationHandler invocationHandler);

    InvocationHandler convertWebResourceError(Object obj);

    InvocationHandler convertWebResourceRequest(WebResourceRequest webResourceRequest);
}

package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface WebViewProviderFactoryBoundaryInterface {
    InvocationHandler createWebView(WebView webView);

    InvocationHandler getDropDataProvider();

    InvocationHandler getProfileStore();

    InvocationHandler getProxyController();

    InvocationHandler getServiceWorkerController();

    InvocationHandler getStatics();

    String[] getSupportedFeatures();

    InvocationHandler getTracingController();

    InvocationHandler getWebkitToCompatConverter();
}

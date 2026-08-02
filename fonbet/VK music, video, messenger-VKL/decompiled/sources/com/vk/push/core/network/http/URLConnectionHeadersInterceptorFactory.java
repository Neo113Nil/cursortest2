package com.vk.push.core.network.http;

import java.net.HttpURLConnection;
import java.util.Map;

/* compiled from: URLConnectionHeadersInterceptorFactory.kt */
/* loaded from: classes5.dex */
public final class URLConnectionHeadersInterceptorFactory {
    public static final URLConnectionHeadersInterceptorFactory INSTANCE = new URLConnectionHeadersInterceptorFactory();

    public final URLConnectionInterceptor create(final Map<String, String> map) {
        return new URLConnectionInterceptor() { // from class: com.vk.push.core.network.http.URLConnectionHeadersInterceptorFactory$create$1
            @Override // com.vk.push.core.network.http.URLConnectionInterceptor
            public void intercept(HttpURLConnection httpURLConnection, HttpRequest httpRequest) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
        };
    }
}

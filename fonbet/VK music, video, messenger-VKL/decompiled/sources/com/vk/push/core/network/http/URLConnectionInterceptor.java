package com.vk.push.core.network.http;

import java.net.HttpURLConnection;

/* compiled from: URLConnectionInterceptor.kt */
/* loaded from: classes5.dex */
public interface URLConnectionInterceptor {
    void intercept(HttpURLConnection httpURLConnection, HttpRequest httpRequest);
}

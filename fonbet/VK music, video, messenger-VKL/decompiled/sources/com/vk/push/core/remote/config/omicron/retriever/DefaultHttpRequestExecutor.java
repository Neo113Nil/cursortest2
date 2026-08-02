package com.vk.push.core.remote.config.omicron.retriever;

import androidx.annotation.NonNull;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;

/* loaded from: classes.dex */
public final class DefaultHttpRequestExecutor implements RequestExecutor {
    public final HttpClient a;

    public DefaultHttpRequestExecutor(@NonNull HttpClient httpClient) {
        this.a = httpClient;
    }

    @Override // com.vk.push.core.remote.config.omicron.retriever.RequestExecutor
    @NonNull
    public HttpResponse execute(@NonNull HttpRequest httpRequest) {
        return this.a.executeRequestUnsafe(httpRequest);
    }
}

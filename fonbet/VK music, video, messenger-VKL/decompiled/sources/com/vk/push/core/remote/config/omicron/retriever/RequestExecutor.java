package com.vk.push.core.remote.config.omicron.retriever;

import androidx.annotation.NonNull;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;

/* loaded from: classes.dex */
public interface RequestExecutor {
    @NonNull
    HttpResponse execute(@NonNull HttpRequest httpRequest) throws Throwable;
}

package com.plaid.internal;

import android.webkit.WebResourceResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class C7 {
    @NotNull
    public static final String a(@NotNull WebResourceResponse webResourceResponse) {
        Intrinsics.checkNotNullParameter(webResourceResponse, "<this>");
        return "WebResourceResponse{, MimeType='" + webResourceResponse.getMimeType() + "', Encoding='" + webResourceResponse.getEncoding() + "', StatusCode=" + webResourceResponse.getStatusCode() + ", ReasonPhrase='" + webResourceResponse.getReasonPhrase() + "', ResponseHeaders=" + webResourceResponse.getResponseHeaders() + ", data=" + webResourceResponse.getData() + "}";
    }
}

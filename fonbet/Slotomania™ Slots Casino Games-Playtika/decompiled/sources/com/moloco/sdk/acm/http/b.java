package com.moloco.sdk.acm.http;

import io.ktor.client.HttpClient;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b {
    public static HttpClient b;
    public static String c;
    public static final b a = new b();
    public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.acm.http.b$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.b();
        }
    });

    public static final f b() {
        HttpClient httpClient = b;
        String str = null;
        if (httpClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("httpClient");
            httpClient = null;
        }
        String str2 = c;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apiUrl");
        } else {
            str = str2;
        }
        return new f(httpClient, str);
    }

    public final void a(HttpClient httpClient, String apiUrl) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        if (b == null) {
            b = httpClient;
            c = apiUrl;
        }
    }

    public final e a() {
        return (e) d.getValue();
    }
}

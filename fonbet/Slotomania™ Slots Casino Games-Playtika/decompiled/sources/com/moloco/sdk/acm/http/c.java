package com.moloco.sdk.acm.http;

import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientJvmKt;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.plugins.UserAgentKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.acm.http.c$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.a();
        }
    });

    public static final HttpClient a() {
        return HttpClientJvmKt.HttpClient(new Function1() { // from class: com.moloco.sdk.acm.http.c$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.a((HttpClientConfig) obj);
            }
        });
    }

    public static final HttpClient b() {
        return (HttpClient) a.getValue();
    }

    public static final HttpClient c() {
        return b();
    }

    public static final Unit a(HttpClientConfig HttpClient) {
        Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
        HttpClientConfig.install$default(HttpClient, UserAgentKt.getUserAgent(), null, 2, null);
        HttpClientConfig.install$default(HttpClient, HttpTimeoutKt.getHttpTimeout(), null, 2, null);
        return Unit.INSTANCE;
    }
}

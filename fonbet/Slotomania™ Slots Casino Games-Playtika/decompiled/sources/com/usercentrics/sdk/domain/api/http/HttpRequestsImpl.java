package com.usercentrics.sdk.domain.api.http;

import com.google.common.net.HttpHeaders;
import com.usercentrics.sdk.AssertionsKt;
import com.usercentrics.sdk.ui.userAgent.UserAgentProvider;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: HttpRequestsImpl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002JN\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J&\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J,\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0096@¢\u0006\u0002\u0010\u0017JV\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J.\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/usercentrics/sdk/domain/api/http/HttpRequestsImpl;", "Lcom/usercentrics/sdk/domain/api/http/HttpRequests;", "httpClient", "Lcom/usercentrics/sdk/domain/api/http/HttpClient;", "userAgentProvider", "Lcom/usercentrics/sdk/ui/userAgent/UserAgentProvider;", "disptacher", "Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;", "(Lcom/usercentrics/sdk/domain/api/http/HttpClient;Lcom/usercentrics/sdk/ui/userAgent/UserAgentProvider;Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;)V", "appendUserAgent", "", "", "headers", "get", "", "url", "onSuccess", "Lkotlin/Function1;", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;", "onError", "", "getSync", "getSync2", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", "bodyData", "postSync", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpRequestsImpl implements HttpRequests {
    private final Dispatcher disptacher;
    private final HttpClient httpClient;
    private final UserAgentProvider userAgentProvider;

    public HttpRequestsImpl(HttpClient httpClient, UserAgentProvider userAgentProvider, Dispatcher disptacher) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(disptacher, "disptacher");
        this.httpClient = httpClient;
        this.userAgentProvider = userAgentProvider;
        this.disptacher = disptacher;
    }

    @Override // com.usercentrics.sdk.domain.api.http.HttpRequests
    public void get(String url, Map<String, String> headers, final Function1<? super HttpResponse, Unit> onSuccess, final Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.disptacher.dispatch(new HttpRequestsImpl$get$1(this, url, headers, null)).onSuccess(new Function1<HttpResponse, Unit>() { // from class: com.usercentrics.sdk.domain.api.http.HttpRequestsImpl$get$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpResponse httpResponse) {
                invoke2(httpResponse);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                onSuccess.invoke(it);
            }
        }).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.domain.api.http.HttpRequestsImpl$get$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                onError.invoke(it);
            }
        });
    }

    @Override // com.usercentrics.sdk.domain.api.http.HttpRequests
    public void post(String url, String bodyData, Map<String, String> headers, final Function1<? super String, Unit> onSuccess, final Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bodyData, "bodyData");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.disptacher.dispatch(new HttpRequestsImpl$post$1(this, url, bodyData, headers, null)).onSuccess(new Function1<String, Unit>() { // from class: com.usercentrics.sdk.domain.api.http.HttpRequestsImpl$post$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                onSuccess.invoke(it);
            }
        }).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.domain.api.http.HttpRequestsImpl$post$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                onError.invoke(it);
            }
        });
    }

    @Override // com.usercentrics.sdk.domain.api.http.HttpRequests
    public HttpResponse getSync(String url, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        AssertionsKt.assertNotUIThread();
        return this.httpClient.get(url, appendUserAgent(headers));
    }

    @Override // com.usercentrics.sdk.domain.api.http.HttpRequests
    public Object getSync2(String str, Map<String, String> map, Continuation<? super HttpResponse> continuation) {
        AssertionsKt.assertNotUIThread();
        return CoroutineScopeKt.coroutineScope(new HttpRequestsImpl$getSync2$2(this, str, map, null), continuation);
    }

    @Override // com.usercentrics.sdk.domain.api.http.HttpRequests
    public String postSync(String url, String bodyData, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bodyData, "bodyData");
        AssertionsKt.assertNotUIThread();
        return this.httpClient.post(url, appendUserAgent(headers), bodyData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> appendUserAgent(Map<String, String> headers) {
        Map<String, String> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(HttpHeaders.USER_AGENT, this.userAgentProvider.provide().encode()));
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                mutableMapOf.put(entry.getKey(), entry.getValue());
            }
        }
        return mutableMapOf;
    }
}

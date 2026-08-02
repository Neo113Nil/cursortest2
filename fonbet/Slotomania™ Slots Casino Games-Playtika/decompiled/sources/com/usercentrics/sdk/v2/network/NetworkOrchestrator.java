package com.usercentrics.sdk.v2.network;

import com.usercentrics.sdk.core.application.INetworkStrategy;
import com.usercentrics.sdk.core.time.DateTime;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import com.usercentrics.sdk.v2.etag.repository.EtagRepository;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkOrchestrator.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b \u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0014\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ6\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086@¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ6\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0086@¢\u0006\u0002\u0010\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/usercentrics/sdk/v2/network/NetworkOrchestrator;", "Lcom/usercentrics/sdk/v2/etag/repository/EtagRepository;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "etagCacheStorage", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "networkStrategy", "Lcom/usercentrics/sdk/core/application/INetworkStrategy;", "(Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;Lcom/usercentrics/sdk/core/application/INetworkStrategy;)V", "httpResponseFromCache", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;", "processResponse", "response", "resolveHttp", "apiRequest", "Lkotlin/Function0;", "resolveHttp2", "bypassCache", "", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveHttpBody", "", "resolveHttpBody2", "shouldFetchResponseFromCache", "shouldLoadFromApi", "responseCode", "", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NetworkOrchestrator extends EtagRepository {
    private final INetworkStrategy networkStrategy;

    public final boolean shouldLoadFromApi(int responseCode) {
        return responseCode == 200;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkOrchestrator(UsercentricsLogger logger, IEtagCacheStorage etagCacheStorage, INetworkStrategy networkStrategy) {
        super(logger, etagCacheStorage);
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(etagCacheStorage, "etagCacheStorage");
        Intrinsics.checkNotNullParameter(networkStrategy, "networkStrategy");
        this.networkStrategy = networkStrategy;
    }

    public final String resolveHttpBody(Function0<HttpResponse> apiRequest) {
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        return resolveHttp(apiRequest).getBody();
    }

    public static /* synthetic */ Object resolveHttpBody2$default(NetworkOrchestrator networkOrchestrator, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveHttpBody2");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return networkOrchestrator.resolveHttpBody2(z, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolveHttpBody2(boolean z, Function1<? super Continuation<? super HttpResponse>, ? extends Object> function1, Continuation<? super String> continuation) {
        NetworkOrchestrator$resolveHttpBody2$1 networkOrchestrator$resolveHttpBody2$1;
        int i;
        if (continuation instanceof NetworkOrchestrator$resolveHttpBody2$1) {
            networkOrchestrator$resolveHttpBody2$1 = (NetworkOrchestrator$resolveHttpBody2$1) continuation;
            if ((networkOrchestrator$resolveHttpBody2$1.label & Integer.MIN_VALUE) != 0) {
                networkOrchestrator$resolveHttpBody2$1.label -= Integer.MIN_VALUE;
                Object obj = networkOrchestrator$resolveHttpBody2$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkOrchestrator$resolveHttpBody2$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    networkOrchestrator$resolveHttpBody2$1.label = 1;
                    obj = resolveHttp2(z, function1, networkOrchestrator$resolveHttpBody2$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((HttpResponse) obj).getBody();
            }
        }
        networkOrchestrator$resolveHttpBody2$1 = new NetworkOrchestrator$resolveHttpBody2$1(this, continuation);
        Object obj2 = networkOrchestrator$resolveHttpBody2$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkOrchestrator$resolveHttpBody2$1.label;
        if (i != 0) {
        }
        return ((HttpResponse) obj2).getBody();
    }

    public final HttpResponse resolveHttp(Function0<HttpResponse> apiRequest) {
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        if (this.networkStrategy.getIsOfflineFlag()) {
            return httpResponseFromCache();
        }
        return processResponse(apiRequest.invoke());
    }

    public static /* synthetic */ Object resolveHttp2$default(NetworkOrchestrator networkOrchestrator, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveHttp2");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return networkOrchestrator.resolveHttp2(z, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolveHttp2(boolean z, Function1<? super Continuation<? super HttpResponse>, ? extends Object> function1, Continuation<? super HttpResponse> continuation) {
        NetworkOrchestrator$resolveHttp2$1 networkOrchestrator$resolveHttp2$1;
        int i;
        NetworkOrchestrator networkOrchestrator;
        NetworkOrchestrator networkOrchestrator2;
        if (continuation instanceof NetworkOrchestrator$resolveHttp2$1) {
            networkOrchestrator$resolveHttp2$1 = (NetworkOrchestrator$resolveHttp2$1) continuation;
            if ((networkOrchestrator$resolveHttp2$1.label & Integer.MIN_VALUE) != 0) {
                networkOrchestrator$resolveHttp2$1.label -= Integer.MIN_VALUE;
                Object obj = networkOrchestrator$resolveHttp2$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkOrchestrator$resolveHttp2$1.label;
                if (i == 0) {
                    if (i == 1) {
                        networkOrchestrator2 = (NetworkOrchestrator) networkOrchestrator$resolveHttp2$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return networkOrchestrator2.processResponse((HttpResponse) obj);
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    networkOrchestrator = (NetworkOrchestrator) networkOrchestrator$resolveHttp2$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return networkOrchestrator.processResponse((HttpResponse) obj);
                }
                ResultKt.throwOnFailure(obj);
                if (z) {
                    networkOrchestrator$resolveHttp2$1.L$0 = this;
                    networkOrchestrator$resolveHttp2$1.label = 1;
                    obj = function1.invoke(networkOrchestrator$resolveHttp2$1);
                    if (obj != coroutine_suspended) {
                        networkOrchestrator2 = this;
                        return networkOrchestrator2.processResponse((HttpResponse) obj);
                    }
                } else {
                    if (shouldFetchResponseFromCache()) {
                        return httpResponseFromCache();
                    }
                    networkOrchestrator$resolveHttp2$1.L$0 = this;
                    networkOrchestrator$resolveHttp2$1.label = 2;
                    obj = function1.invoke(networkOrchestrator$resolveHttp2$1);
                    if (obj != coroutine_suspended) {
                        networkOrchestrator = this;
                        return networkOrchestrator.processResponse((HttpResponse) obj);
                    }
                }
                return coroutine_suspended;
            }
        }
        networkOrchestrator$resolveHttp2$1 = new NetworkOrchestrator$resolveHttp2$1(this, continuation);
        Object obj2 = networkOrchestrator$resolveHttp2$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkOrchestrator$resolveHttp2$1.label;
        if (i == 0) {
        }
    }

    private final boolean shouldFetchResponseFromCache() {
        return this.networkStrategy.getIsOfflineFlag() || getCacheControlValueFromEtagFile() > new DateTime().timestamp();
    }

    private final HttpResponse processResponse(HttpResponse response) {
        String apiBody;
        int statusCode = response.getStatusCode();
        if (statusCode == 200) {
            apiBody = getApiBody(response, response.parseCacheControl());
        } else if (statusCode == 304) {
            apiBody = getEtagFile();
        } else {
            throw new UsercentricsException("Invalid Network Response", null, 2, null);
        }
        return new HttpResponse(response.getHeaders(), apiBody, response.getStatusCode());
    }

    private final HttpResponse httpResponseFromCache() {
        return new HttpResponse(MapsKt.emptyMap(), getEtagFile(), 304);
    }
}

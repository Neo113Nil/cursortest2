package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* compiled from: HttpClientEngine.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8BX\u0082\u0004¨\u0006\""}, d2 = {"Lio/ktor/client/engine/HttpClientEngine;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/request/HttpRequestData;", "data", "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/HttpClient;", "client", "", "install", "(Lio/ktor/client/HttpClient;)V", "requestData", "executeWithinCallContext", "(Lio/ktor/client/request/HttpRequestData;)Lio/ktor/client/request/HttpResponseData;", "checkExtensions", "(Lio/ktor/client/request/HttpRequestData;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "config", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getSupportedCapabilities", "()Ljava/util/Set;", "supportedCapabilities", "", "closed", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface HttpClientEngine extends CoroutineScope, Closeable {
    Object execute(HttpRequestData httpRequestData, Continuation<? super HttpResponseData> continuation);

    HttpClientEngineConfig getConfig();

    CoroutineDispatcher getDispatcher();

    Set<HttpClientEngineCapability<?>> getSupportedCapabilities();

    void install(HttpClient client);

    /* compiled from: HttpClientEngine.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Set<HttpClientEngineCapability<?>> getSupportedCapabilities(HttpClientEngine httpClientEngine) {
            return SetsKt.emptySet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean getClosed(HttpClientEngine httpClientEngine) {
            return !(((Job) httpClientEngine.getCoroutineContext().get(Job.INSTANCE)) != null ? r1.isActive() : false);
        }

        public static void install(HttpClientEngine httpClientEngine, HttpClient client) {
            Intrinsics.checkNotNullParameter(client, "client");
            client.getSendPipeline().intercept(HttpSendPipeline.INSTANCE.getEngine(), new HttpClientEngine$install$1(client, httpClientEngine, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        
            if (r12 == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object executeWithinCallContext(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData, Continuation<? super HttpResponseData> continuation) {
            HttpClientEngine$executeWithinCallContext$1 httpClientEngine$executeWithinCallContext$1;
            int i;
            Deferred async$default;
            if (continuation instanceof HttpClientEngine$executeWithinCallContext$1) {
                httpClientEngine$executeWithinCallContext$1 = (HttpClientEngine$executeWithinCallContext$1) continuation;
                if ((httpClientEngine$executeWithinCallContext$1.label & Integer.MIN_VALUE) != 0) {
                    httpClientEngine$executeWithinCallContext$1.label -= Integer.MIN_VALUE;
                    Object obj = httpClientEngine$executeWithinCallContext$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpClientEngine$executeWithinCallContext$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Job executionContext = httpRequestData.getExecutionContext();
                        httpClientEngine$executeWithinCallContext$1.L$0 = httpClientEngine;
                        httpClientEngine$executeWithinCallContext$1.L$1 = httpRequestData;
                        httpClientEngine$executeWithinCallContext$1.label = 1;
                        obj = HttpClientEngineKt.createCallContext(httpClientEngine, executionContext, httpClientEngine$executeWithinCallContext$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        httpRequestData = (HttpRequestData) httpClientEngine$executeWithinCallContext$1.L$1;
                        httpClientEngine = (HttpClientEngine) httpClientEngine$executeWithinCallContext$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    CoroutineContext coroutineContext = (CoroutineContext) obj;
                    async$default = BuildersKt__Builders_commonKt.async$default(httpClientEngine, coroutineContext.plus(new KtorCallContextElement(coroutineContext)), null, new HttpClientEngine$executeWithinCallContext$2(httpClientEngine, httpRequestData, null), 2, null);
                    httpClientEngine$executeWithinCallContext$1.L$0 = null;
                    httpClientEngine$executeWithinCallContext$1.L$1 = null;
                    httpClientEngine$executeWithinCallContext$1.label = 2;
                    Object await = async$default.await(httpClientEngine$executeWithinCallContext$1);
                    return await != coroutine_suspended ? coroutine_suspended : await;
                }
            }
            httpClientEngine$executeWithinCallContext$1 = new HttpClientEngine$executeWithinCallContext$1(continuation);
            Object obj2 = httpClientEngine$executeWithinCallContext$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = httpClientEngine$executeWithinCallContext$1.label;
            if (i != 0) {
            }
            CoroutineContext coroutineContext2 = (CoroutineContext) obj2;
            async$default = BuildersKt__Builders_commonKt.async$default(httpClientEngine, coroutineContext2.plus(new KtorCallContextElement(coroutineContext2)), null, new HttpClientEngine$executeWithinCallContext$2(httpClientEngine, httpRequestData, null), 2, null);
            httpClientEngine$executeWithinCallContext$1.L$0 = null;
            httpClientEngine$executeWithinCallContext$1.L$1 = null;
            httpClientEngine$executeWithinCallContext$1.label = 2;
            Object await2 = async$default.await(httpClientEngine$executeWithinCallContext$1);
            if (await2 != coroutine_suspended2) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void checkExtensions(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData) {
            for (HttpClientEngineCapability<?> httpClientEngineCapability : httpRequestData.getRequiredCapabilities$ktor_client_core()) {
                if (!httpClientEngine.getSupportedCapabilities().contains(httpClientEngineCapability)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + httpClientEngineCapability).toString());
                }
            }
        }
    }
}

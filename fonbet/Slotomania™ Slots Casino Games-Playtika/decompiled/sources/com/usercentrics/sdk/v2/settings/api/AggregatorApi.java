package com.usercentrics.sdk.v2.settings.api;

import com.usercentrics.sdk.domain.api.http.HttpRequests;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.models.api.ApiErrors;
import com.usercentrics.sdk.services.api.NetworkResolver;
import com.usercentrics.sdk.v2.settings.data.BasicConsentTemplate;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AggregatorApi.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J8\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0012H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/api/AggregatorApi;", "Lcom/usercentrics/sdk/v2/settings/api/IAggregatorApi;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "networkResolver", "Lcom/usercentrics/sdk/services/api/NetworkResolver;", "restClient", "Lcom/usercentrics/sdk/domain/api/http/HttpRequests;", "(Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/services/api/NetworkResolver;Lcom/usercentrics/sdk/domain/api/http/HttpRequests;)V", "createAggregatorJsonUrl", "", Device.JsonKeys.LANGUAGE, "services", "", "Lcom/usercentrics/sdk/v2/settings/data/BasicConsentTemplate;", "getServices", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;", "headers", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AggregatorApi implements IAggregatorApi {
    private final UsercentricsLogger logger;
    private final NetworkResolver networkResolver;
    private final HttpRequests restClient;

    public AggregatorApi(UsercentricsLogger logger, NetworkResolver networkResolver, HttpRequests restClient) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(networkResolver, "networkResolver");
        Intrinsics.checkNotNullParameter(restClient, "restClient");
        this.logger = logger;
        this.networkResolver = networkResolver;
        this.restClient = restClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.settings.api.IAggregatorApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getServices(String str, List<BasicConsentTemplate> list, Map<String, String> map, Continuation<? super HttpResponse> continuation) {
        AggregatorApi$getServices$1 aggregatorApi$getServices$1;
        int i;
        AggregatorApi aggregatorApi;
        if (continuation instanceof AggregatorApi$getServices$1) {
            aggregatorApi$getServices$1 = (AggregatorApi$getServices$1) continuation;
            if ((aggregatorApi$getServices$1.label & Integer.MIN_VALUE) != 0) {
                aggregatorApi$getServices$1.label -= Integer.MIN_VALUE;
                Object obj = aggregatorApi$getServices$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aggregatorApi$getServices$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String createAggregatorJsonUrl = createAggregatorJsonUrl(str, list);
                    try {
                        HttpRequests httpRequests = this.restClient;
                        aggregatorApi$getServices$1.L$0 = this;
                        aggregatorApi$getServices$1.label = 1;
                        Object sync2 = httpRequests.getSync2(createAggregatorJsonUrl, map, aggregatorApi$getServices$1);
                        return sync2 == coroutine_suspended ? coroutine_suspended : sync2;
                    } catch (Exception e) {
                        e = e;
                        aggregatorApi = this;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aggregatorApi = (AggregatorApi) aggregatorApi$getServices$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                Exception exc = e;
                aggregatorApi.logger.error("Failed while fetching services", exc);
                throw new UsercentricsException(ApiErrors.FETCH_DATA_PROCESSING_SERVICES, exc);
            }
        }
        aggregatorApi$getServices$1 = new AggregatorApi$getServices$1(this, continuation);
        Object obj2 = aggregatorApi$getServices$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aggregatorApi$getServices$1.label;
        if (i != 0) {
        }
        Exception exc2 = e;
        aggregatorApi.logger.error("Failed while fetching services", exc2);
        throw new UsercentricsException(ApiErrors.FETCH_DATA_PROCESSING_SERVICES, exc2);
    }

    private final String createAggregatorJsonUrl(String language, List<BasicConsentTemplate> services) {
        return this.networkResolver.aggregatorBaseUrl() + "/aggregate/" + language + "?templates=" + CollectionsKt.joinToString$default(services, ",", null, null, 0, null, new Function1<BasicConsentTemplate, CharSequence>() { // from class: com.usercentrics.sdk.v2.settings.api.AggregatorApi$createAggregatorJsonUrl$templatesValue$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(BasicConsentTemplate it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getTemplateId() + "@" + it.getVersion();
            }
        }, 30, null);
    }
}

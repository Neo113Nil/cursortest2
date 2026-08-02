package com.usercentrics.sdk.v2.settings.repository;

import com.usercentrics.sdk.core.application.INetworkStrategy;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.services.api.NewServiceTemplates;
import com.usercentrics.sdk.services.tcf.Constants;
import com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import com.usercentrics.sdk.v2.network.NetworkOrchestrator;
import com.usercentrics.sdk.v2.settings.api.IAggregatorApi;
import com.usercentrics.sdk.v2.settings.data.BasicConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.UsercentricsService;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

/* compiled from: AggregatorRepository.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u000fH\u0014J2\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/repository/AggregatorRepository;", "Lcom/usercentrics/sdk/v2/network/NetworkOrchestrator;", "Lcom/usercentrics/sdk/v2/settings/repository/IAggregatorRepository;", "api", "Lcom/usercentrics/sdk/v2/settings/api/IAggregatorApi;", "json", "Lcom/usercentrics/sdk/core/json/JsonParser;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "etagCacheStorage", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "networkStrategy", "Lcom/usercentrics/sdk/core/application/INetworkStrategy;", "(Lcom/usercentrics/sdk/v2/settings/api/IAggregatorApi;Lcom/usercentrics/sdk/core/json/JsonParser;Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;Lcom/usercentrics/sdk/core/application/INetworkStrategy;)V", "currentLanguage", "", "etagKey", "fetchServices", "", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;", Device.JsonKeys.LANGUAGE, "services", "Lcom/usercentrics/sdk/v2/settings/data/BasicConsentTemplate;", "bypassCache", "", "(Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseJson", "Lcom/usercentrics/sdk/services/api/NewServiceTemplates;", "responseBody", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AggregatorRepository extends NetworkOrchestrator implements IAggregatorRepository {
    private final IAggregatorApi api;
    private String currentLanguage;
    private final JsonParser json;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregatorRepository(IAggregatorApi api, JsonParser json, UsercentricsLogger logger, IEtagCacheStorage etagCacheStorage, INetworkStrategy networkStrategy) {
        super(logger, etagCacheStorage, networkStrategy);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(etagCacheStorage, "etagCacheStorage");
        Intrinsics.checkNotNullParameter(networkStrategy, "networkStrategy");
        this.api = api;
        this.json = json;
        this.currentLanguage = Constants.FALLBACK_LANGUAGE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.settings.repository.IAggregatorRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchServices(String str, List<BasicConsentTemplate> list, boolean z, Continuation<? super List<UsercentricsService>> continuation) {
        AggregatorRepository$fetchServices$1 aggregatorRepository$fetchServices$1;
        int i;
        AggregatorRepository aggregatorRepository;
        if (continuation instanceof AggregatorRepository$fetchServices$1) {
            aggregatorRepository$fetchServices$1 = (AggregatorRepository$fetchServices$1) continuation;
            if ((aggregatorRepository$fetchServices$1.label & Integer.MIN_VALUE) != 0) {
                aggregatorRepository$fetchServices$1.label -= Integer.MIN_VALUE;
                Object obj = aggregatorRepository$fetchServices$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aggregatorRepository$fetchServices$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.currentLanguage = str;
                    AggregatorRepository$fetchServices$response$1 aggregatorRepository$fetchServices$response$1 = new AggregatorRepository$fetchServices$response$1(this, str, list, null);
                    aggregatorRepository$fetchServices$1.L$0 = this;
                    aggregatorRepository$fetchServices$1.label = 1;
                    obj = resolveHttpBody2(z, aggregatorRepository$fetchServices$response$1, aggregatorRepository$fetchServices$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aggregatorRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aggregatorRepository = (AggregatorRepository) aggregatorRepository$fetchServices$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return aggregatorRepository.parseJson((String) obj).getTemplates();
            }
        }
        aggregatorRepository$fetchServices$1 = new AggregatorRepository$fetchServices$1(this, continuation);
        Object obj2 = aggregatorRepository$fetchServices$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aggregatorRepository$fetchServices$1.label;
        if (i != 0) {
        }
        return aggregatorRepository.parseJson((String) obj2).getTemplates();
    }

    @Override // com.usercentrics.sdk.v2.etag.repository.EtagRepository
    protected String etagKey() {
        return EtagCacheStorage.aggregatorDir + this.currentLanguage;
    }

    private final NewServiceTemplates parseJson(String responseBody) {
        Json json;
        json = JsonParserKt.json;
        Json json2 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(NewServiceTemplates.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (NewServiceTemplates) json2.decodeFromString(serializer, responseBody);
    }
}

package com.usercentrics.sdk.acm.repository;

import com.usercentrics.sdk.AdTechProvider;
import com.usercentrics.sdk.acm.api.AdditionalConsentModeApi;
import com.usercentrics.sdk.acm.data.AdditionalConsentModeListResponse;
import com.usercentrics.sdk.core.application.INetworkStrategy;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import com.usercentrics.sdk.v2.network.NetworkOrchestrator;
import io.sentry.SentryEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

/* compiled from: AdditionalConsentModeRemoteRepositoryImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0096@¢\u0006\u0002\u0010\u0016J2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/usercentrics/sdk/acm/repository/AdditionalConsentModeRemoteRepositoryImpl;", "Lcom/usercentrics/sdk/v2/network/NetworkOrchestrator;", "Lcom/usercentrics/sdk/acm/repository/AdditionalConsentModeRemoteRepository;", "api", "Lcom/usercentrics/sdk/acm/api/AdditionalConsentModeApi;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "etagCacheStorage", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "networkStrategy", "Lcom/usercentrics/sdk/core/application/INetworkStrategy;", "(Lcom/usercentrics/sdk/acm/api/AdditionalConsentModeApi;Lcom/usercentrics/sdk/core/json/JsonParser;Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;Lcom/usercentrics/sdk/core/application/INetworkStrategy;)V", "etagKey", "", "loadAdTechProviderList", "", "Lcom/usercentrics/sdk/AdTechProvider;", "selectedIds", "", "consentedIds", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapAndFilterSelectedProviders", "listResponse", "Lcom/usercentrics/sdk/acm/data/AdditionalConsentModeListResponse;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalConsentModeRemoteRepositoryImpl extends NetworkOrchestrator implements AdditionalConsentModeRemoteRepository {
    private final AdditionalConsentModeApi api;
    private final JsonParser jsonParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalConsentModeRemoteRepositoryImpl(AdditionalConsentModeApi api, JsonParser jsonParser, UsercentricsLogger logger, IEtagCacheStorage etagCacheStorage, INetworkStrategy networkStrategy) {
        super(logger, etagCacheStorage, networkStrategy);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(etagCacheStorage, "etagCacheStorage");
        Intrinsics.checkNotNullParameter(networkStrategy, "networkStrategy");
        this.api = api;
        this.jsonParser = jsonParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.usercentrics.sdk.acm.repository.AdditionalConsentModeRemoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAdTechProviderList(List<Integer> list, List<Integer> list2, Continuation<? super List<AdTechProvider>> continuation) {
        AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1 additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1;
        int i;
        AdditionalConsentModeRemoteRepositoryImpl additionalConsentModeRemoteRepositoryImpl;
        Json json;
        if (continuation instanceof AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1) {
            additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1 = (AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1) continuation;
            if ((additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1.label & Integer.MIN_VALUE) != 0) {
                additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1.label -= Integer.MIN_VALUE;
                AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1 additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12 = additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1;
                Object obj = additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1 additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1 = new AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1(this, null);
                    additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12.L$0 = this;
                    additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12.L$1 = list;
                    additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12.L$2 = list2;
                    additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12.label = 1;
                    obj = NetworkOrchestrator.resolveHttp2$default(this, false, additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1, additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    additionalConsentModeRemoteRepositoryImpl = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12.L$2;
                    list = (List) additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12.L$1;
                    additionalConsentModeRemoteRepositoryImpl = (AdditionalConsentModeRemoteRepositoryImpl) additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                JsonParser jsonParser = additionalConsentModeRemoteRepositoryImpl.jsonParser;
                String body = ((HttpResponse) obj).getBody();
                json = JsonParserKt.json;
                Json json2 = json;
                KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(AdditionalConsentModeListResponse.class));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return additionalConsentModeRemoteRepositoryImpl.mapAndFilterSelectedProviders((AdditionalConsentModeListResponse) json2.decodeFromString(serializer, body), list, list2);
            }
        }
        additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1 = new AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1(this, continuation);
        AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1 additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$122 = additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1;
        Object obj2 = additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = additionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$122.label;
        if (i != 0) {
        }
        JsonParser jsonParser2 = additionalConsentModeRemoteRepositoryImpl.jsonParser;
        String body2 = ((HttpResponse) obj2).getBody();
        json = JsonParserKt.json;
        Json json22 = json;
        KSerializer<Object> serializer2 = SerializersKt.serializer(json22.getSerializersModule(), Reflection.typeOf(AdditionalConsentModeListResponse.class));
        Intrinsics.checkNotNull(serializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return additionalConsentModeRemoteRepositoryImpl.mapAndFilterSelectedProviders((AdditionalConsentModeListResponse) json22.decodeFromString(serializer2, body2), list, list2);
    }

    @Override // com.usercentrics.sdk.v2.etag.repository.EtagRepository
    protected String etagKey() {
        return EtagCacheStorage.additionalConsentModeDir;
    }

    private final List<AdTechProvider> mapAndFilterSelectedProviders(AdditionalConsentModeListResponse listResponse, List<Integer> selectedIds, List<Integer> consentedIds) {
        Map<String, List<String>> providers = listResponse.getProviders();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : providers.entrySet()) {
            Integer intOrNull = StringsKt.toIntOrNull(entry.getKey());
            AdTechProvider adTechProvider = (intOrNull == null || !selectedIds.contains(intOrNull)) ? null : new AdTechProvider(intOrNull.intValue(), entry.getValue().get(0), entry.getValue().get(1), consentedIds.contains(intOrNull));
            if (adTechProvider != null) {
                arrayList.add(adTechProvider);
            }
        }
        return arrayList;
    }
}

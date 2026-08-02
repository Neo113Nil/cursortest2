package com.usercentrics.sdk.v2.language.repository;

import com.usercentrics.sdk.core.application.INetworkStrategy;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import com.usercentrics.sdk.v2.language.api.ILanguageApi;
import com.usercentrics.sdk.v2.language.data.LanguageData;
import com.usercentrics.sdk.v2.location.data.LocationAwareResponse;
import com.usercentrics.sdk.v2.network.NetworkOrchestrator;
import io.sentry.SentryEvent;
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

/* compiled from: LanguageRepository.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J2\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/usercentrics/sdk/v2/language/repository/LanguageRepository;", "Lcom/usercentrics/sdk/v2/network/NetworkOrchestrator;", "Lcom/usercentrics/sdk/v2/language/repository/ILanguageRepository;", "languageApi", "Lcom/usercentrics/sdk/v2/language/api/ILanguageApi;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "etagCacheStorage", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "networkStrategy", "Lcom/usercentrics/sdk/core/application/INetworkStrategy;", "(Lcom/usercentrics/sdk/v2/language/api/ILanguageApi;Lcom/usercentrics/sdk/core/json/JsonParser;Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;Lcom/usercentrics/sdk/core/application/INetworkStrategy;)V", "etagKey", "", "fetchAvailableLanguages", "Lcom/usercentrics/sdk/v2/location/data/LocationAwareResponse;", "", "settingsId", "version", "bypassCache", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseJson", "Lcom/usercentrics/sdk/v2/language/data/LanguageData;", "responseBody", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LanguageRepository extends NetworkOrchestrator implements ILanguageRepository {
    private final JsonParser jsonParser;
    private final ILanguageApi languageApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepository(ILanguageApi languageApi, JsonParser jsonParser, UsercentricsLogger logger, IEtagCacheStorage etagCacheStorage, INetworkStrategy networkStrategy) {
        super(logger, etagCacheStorage, networkStrategy);
        Intrinsics.checkNotNullParameter(languageApi, "languageApi");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(etagCacheStorage, "etagCacheStorage");
        Intrinsics.checkNotNullParameter(networkStrategy, "networkStrategy");
        this.languageApi = languageApi;
        this.jsonParser = jsonParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.language.repository.ILanguageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchAvailableLanguages(String str, String str2, boolean z, Continuation<? super LocationAwareResponse<List<String>>> continuation) {
        LanguageRepository$fetchAvailableLanguages$1 languageRepository$fetchAvailableLanguages$1;
        int i;
        LanguageRepository languageRepository;
        if (continuation instanceof LanguageRepository$fetchAvailableLanguages$1) {
            languageRepository$fetchAvailableLanguages$1 = (LanguageRepository$fetchAvailableLanguages$1) continuation;
            if ((languageRepository$fetchAvailableLanguages$1.label & Integer.MIN_VALUE) != 0) {
                languageRepository$fetchAvailableLanguages$1.label -= Integer.MIN_VALUE;
                Object obj = languageRepository$fetchAvailableLanguages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = languageRepository$fetchAvailableLanguages$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LanguageRepository$fetchAvailableLanguages$response$1 languageRepository$fetchAvailableLanguages$response$1 = new LanguageRepository$fetchAvailableLanguages$response$1(this, str, str2, null);
                    languageRepository$fetchAvailableLanguages$1.L$0 = this;
                    languageRepository$fetchAvailableLanguages$1.Z$0 = z;
                    languageRepository$fetchAvailableLanguages$1.label = 1;
                    obj = resolveHttp2(z, languageRepository$fetchAvailableLanguages$response$1, languageRepository$fetchAvailableLanguages$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    languageRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = languageRepository$fetchAvailableLanguages$1.Z$0;
                    languageRepository = (LanguageRepository) languageRepository$fetchAvailableLanguages$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                HttpResponse httpResponse = (HttpResponse) obj;
                return new LocationAwareResponse(languageRepository.parseJson(httpResponse.getBody()).getLanguagesAvailable(), httpResponse.parseLocation(), z ? true : languageRepository.shouldLoadFromApi(httpResponse.getStatusCode()));
            }
        }
        languageRepository$fetchAvailableLanguages$1 = new LanguageRepository$fetchAvailableLanguages$1(this, continuation);
        Object obj2 = languageRepository$fetchAvailableLanguages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = languageRepository$fetchAvailableLanguages$1.label;
        if (i != 0) {
        }
        HttpResponse httpResponse2 = (HttpResponse) obj2;
        return new LocationAwareResponse(languageRepository.parseJson(httpResponse2.getBody()).getLanguagesAvailable(), httpResponse2.parseLocation(), z ? true : languageRepository.shouldLoadFromApi(httpResponse2.getStatusCode()));
    }

    @Override // com.usercentrics.sdk.v2.etag.repository.EtagRepository
    protected String etagKey() {
        return EtagCacheStorage.languagesDir;
    }

    private final LanguageData parseJson(String responseBody) {
        Json json;
        json = JsonParserKt.json;
        Json json2 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(LanguageData.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (LanguageData) json2.decodeFromString(serializer, responseBody);
    }
}

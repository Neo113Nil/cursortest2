package com.usercentrics.sdk.v2.translation.repository;

import com.usercentrics.sdk.core.application.INetworkStrategy;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.services.tcf.Constants;
import com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import com.usercentrics.sdk.v2.network.NetworkOrchestrator;
import com.usercentrics.sdk.v2.translation.api.ITranslationApi;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

/* compiled from: TranslationRepository.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/usercentrics/sdk/v2/translation/repository/TranslationRepository;", "Lcom/usercentrics/sdk/v2/network/NetworkOrchestrator;", "Lcom/usercentrics/sdk/v2/translation/repository/ITranslationRepository;", "api", "Lcom/usercentrics/sdk/v2/translation/api/ITranslationApi;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "etagCacheStorage", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "networkStrategy", "Lcom/usercentrics/sdk/core/application/INetworkStrategy;", "(Lcom/usercentrics/sdk/v2/translation/api/ITranslationApi;Lcom/usercentrics/sdk/core/json/JsonParser;Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;Lcom/usercentrics/sdk/core/application/INetworkStrategy;)V", "currentLanguage", "", "etagKey", "fetchTranslations", "Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;", Device.JsonKeys.LANGUAGE, "bypassCache", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseJson", "responseBody", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TranslationRepository extends NetworkOrchestrator implements ITranslationRepository {
    private final ITranslationApi api;
    private String currentLanguage;
    private final JsonParser jsonParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationRepository(ITranslationApi api, JsonParser jsonParser, UsercentricsLogger logger, IEtagCacheStorage etagCacheStorage, INetworkStrategy networkStrategy) {
        super(logger, etagCacheStorage, networkStrategy);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(etagCacheStorage, "etagCacheStorage");
        Intrinsics.checkNotNullParameter(networkStrategy, "networkStrategy");
        this.api = api;
        this.jsonParser = jsonParser;
        this.currentLanguage = Constants.FALLBACK_LANGUAGE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.translation.repository.ITranslationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchTranslations(String str, boolean z, Continuation<? super LegalBasisLocalization> continuation) {
        TranslationRepository$fetchTranslations$1 translationRepository$fetchTranslations$1;
        int i;
        TranslationRepository translationRepository;
        if (continuation instanceof TranslationRepository$fetchTranslations$1) {
            translationRepository$fetchTranslations$1 = (TranslationRepository$fetchTranslations$1) continuation;
            if ((translationRepository$fetchTranslations$1.label & Integer.MIN_VALUE) != 0) {
                translationRepository$fetchTranslations$1.label -= Integer.MIN_VALUE;
                Object obj = translationRepository$fetchTranslations$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = translationRepository$fetchTranslations$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.currentLanguage = str;
                    TranslationRepository$fetchTranslations$response$1 translationRepository$fetchTranslations$response$1 = new TranslationRepository$fetchTranslations$response$1(this, str, null);
                    translationRepository$fetchTranslations$1.L$0 = this;
                    translationRepository$fetchTranslations$1.label = 1;
                    obj = resolveHttpBody2(z, translationRepository$fetchTranslations$response$1, translationRepository$fetchTranslations$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    translationRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    translationRepository = (TranslationRepository) translationRepository$fetchTranslations$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return translationRepository.parseJson((String) obj);
            }
        }
        translationRepository$fetchTranslations$1 = new TranslationRepository$fetchTranslations$1(this, continuation);
        Object obj2 = translationRepository$fetchTranslations$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = translationRepository$fetchTranslations$1.label;
        if (i != 0) {
        }
        return translationRepository.parseJson((String) obj2);
    }

    @Override // com.usercentrics.sdk.v2.etag.repository.EtagRepository
    protected String etagKey() {
        return EtagCacheStorage.translationsDir + this.currentLanguage;
    }

    private final LegalBasisLocalization parseJson(String responseBody) {
        Json json;
        json = JsonParserKt.json;
        Json json2 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(LegalBasisLocalization.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (LegalBasisLocalization) json2.decodeFromString(serializer, responseBody);
    }
}

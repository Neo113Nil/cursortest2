package com.usercentrics.sdk.v2.settings.repository;

import com.usercentrics.sdk.core.application.INetworkStrategy;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.services.tcf.Constants;
import com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import com.usercentrics.sdk.v2.network.NetworkOrchestrator;
import com.usercentrics.sdk.v2.settings.api.ISettingsApi;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

/* compiled from: SettingsRepository.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0016\u001a\u00020\u000fH\u0014J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/repository/SettingsRepository;", "Lcom/usercentrics/sdk/v2/network/NetworkOrchestrator;", "Lcom/usercentrics/sdk/v2/settings/repository/ISettingsRepository;", "api", "Lcom/usercentrics/sdk/v2/settings/api/ISettingsApi;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "etagCacheStorage", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "networkStrategy", "Lcom/usercentrics/sdk/core/application/INetworkStrategy;", "(Lcom/usercentrics/sdk/v2/settings/api/ISettingsApi;Lcom/usercentrics/sdk/core/json/JsonParser;Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;Lcom/usercentrics/sdk/core/application/INetworkStrategy;)V", "currentLanguage", "", "settingsEtagChanged", "", "getSettingsEtagChanged", "()Z", "setSettingsEtagChanged", "(Z)V", "etagKey", "fetchSettings", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "settingsInitializationParameters", "Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;", "(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseJson", "responseBody", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SettingsRepository extends NetworkOrchestrator implements ISettingsRepository {
    private final ISettingsApi api;
    private String currentLanguage;
    private final JsonParser jsonParser;
    private boolean settingsEtagChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRepository(ISettingsApi api, JsonParser jsonParser, UsercentricsLogger logger, IEtagCacheStorage etagCacheStorage, INetworkStrategy networkStrategy) {
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

    @Override // com.usercentrics.sdk.v2.settings.repository.ISettingsRepository
    public boolean getSettingsEtagChanged() {
        return this.settingsEtagChanged;
    }

    @Override // com.usercentrics.sdk.v2.settings.repository.ISettingsRepository
    public void setSettingsEtagChanged(boolean z) {
        this.settingsEtagChanged = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.settings.repository.ISettingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchSettings(SettingsInitializationParameters settingsInitializationParameters, Continuation<? super UsercentricsSettings> continuation) {
        SettingsRepository$fetchSettings$1 settingsRepository$fetchSettings$1;
        int i;
        boolean z;
        SettingsRepository settingsRepository;
        if (continuation instanceof SettingsRepository$fetchSettings$1) {
            settingsRepository$fetchSettings$1 = (SettingsRepository$fetchSettings$1) continuation;
            if ((settingsRepository$fetchSettings$1.label & Integer.MIN_VALUE) != 0) {
                settingsRepository$fetchSettings$1.label -= Integer.MIN_VALUE;
                Object obj = settingsRepository$fetchSettings$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsRepository$fetchSettings$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.currentLanguage = settingsInitializationParameters.getJsonFileLanguage();
                    boolean languageEtagChanged = settingsInitializationParameters.getLanguageEtagChanged();
                    SettingsRepository$fetchSettings$response$1 settingsRepository$fetchSettings$response$1 = new SettingsRepository$fetchSettings$response$1(this, settingsInitializationParameters.getSettingsId(), settingsInitializationParameters.getJsonFileVersion(), null);
                    settingsRepository$fetchSettings$1.L$0 = this;
                    settingsRepository$fetchSettings$1.Z$0 = languageEtagChanged;
                    settingsRepository$fetchSettings$1.label = 1;
                    Object resolveHttp2 = resolveHttp2(languageEtagChanged, settingsRepository$fetchSettings$response$1, settingsRepository$fetchSettings$1);
                    if (resolveHttp2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = resolveHttp2;
                    z = languageEtagChanged;
                    settingsRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = settingsRepository$fetchSettings$1.Z$0;
                    settingsRepository = (SettingsRepository) settingsRepository$fetchSettings$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                HttpResponse httpResponse = (HttpResponse) obj;
                settingsRepository.setSettingsEtagChanged(z ? true : settingsRepository.shouldLoadFromApi(httpResponse.getStatusCode()));
                return settingsRepository.parseJson(httpResponse.getBody());
            }
        }
        settingsRepository$fetchSettings$1 = new SettingsRepository$fetchSettings$1(this, continuation);
        Object obj2 = settingsRepository$fetchSettings$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsRepository$fetchSettings$1.label;
        if (i != 0) {
        }
        HttpResponse httpResponse2 = (HttpResponse) obj2;
        settingsRepository.setSettingsEtagChanged(z ? true : settingsRepository.shouldLoadFromApi(httpResponse2.getStatusCode()));
        return settingsRepository.parseJson(httpResponse2.getBody());
    }

    @Override // com.usercentrics.sdk.v2.etag.repository.EtagRepository
    protected String etagKey() {
        return EtagCacheStorage.settingsDir + this.currentLanguage;
    }

    private final UsercentricsSettings parseJson(String responseBody) {
        Json json;
        json = JsonParserKt.json;
        Json json2 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(UsercentricsSettings.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (UsercentricsSettings) json2.decodeFromString(serializer, responseBody);
    }
}

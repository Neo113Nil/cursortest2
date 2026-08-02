package com.usercentrics.sdk.v2.tcf.repository;

import com.usercentrics.sdk.core.application.INetworkStrategy;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.services.tcf.Constants;
import com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import com.usercentrics.sdk.v2.network.NetworkOrchestrator;
import com.usercentrics.sdk.v2.tcf.api.ITCFDeclarationsApi;
import com.usercentrics.tcf.core.model.gvl.Declarations;
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

/* compiled from: TCFDeclarationsRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000fH\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/usercentrics/sdk/v2/tcf/repository/TCFDeclarationsRepository;", "Lcom/usercentrics/sdk/v2/network/NetworkOrchestrator;", "Lcom/usercentrics/sdk/v2/tcf/repository/ITCFDeclarationsRepository;", "tcfDeclarationsApi", "Lcom/usercentrics/sdk/v2/tcf/api/ITCFDeclarationsApi;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "etagCacheStorage", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "networkStrategy", "Lcom/usercentrics/sdk/core/application/INetworkStrategy;", "(Lcom/usercentrics/sdk/v2/tcf/api/ITCFDeclarationsApi;Lcom/usercentrics/sdk/core/json/JsonParser;Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;Lcom/usercentrics/sdk/core/application/INetworkStrategy;)V", "currentLanguage", "", "etagKey", "fetchDeclarations", "Lcom/usercentrics/tcf/core/model/gvl/Declarations;", Device.JsonKeys.LANGUAGE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseJson", "responseBody", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TCFDeclarationsRepository extends NetworkOrchestrator implements ITCFDeclarationsRepository {
    private String currentLanguage;
    private final JsonParser jsonParser;
    private final ITCFDeclarationsApi tcfDeclarationsApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCFDeclarationsRepository(ITCFDeclarationsApi tcfDeclarationsApi, JsonParser jsonParser, UsercentricsLogger logger, IEtagCacheStorage etagCacheStorage, INetworkStrategy networkStrategy) {
        super(logger, etagCacheStorage, networkStrategy);
        Intrinsics.checkNotNullParameter(tcfDeclarationsApi, "tcfDeclarationsApi");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(etagCacheStorage, "etagCacheStorage");
        Intrinsics.checkNotNullParameter(networkStrategy, "networkStrategy");
        this.tcfDeclarationsApi = tcfDeclarationsApi;
        this.jsonParser = jsonParser;
        this.currentLanguage = Constants.FALLBACK_LANGUAGE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.usercentrics.sdk.v2.tcf.repository.ITCFDeclarationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchDeclarations(String str, Continuation<? super Declarations> continuation) {
        TCFDeclarationsRepository$fetchDeclarations$1 tCFDeclarationsRepository$fetchDeclarations$1;
        int i;
        TCFDeclarationsRepository tCFDeclarationsRepository;
        if (continuation instanceof TCFDeclarationsRepository$fetchDeclarations$1) {
            tCFDeclarationsRepository$fetchDeclarations$1 = (TCFDeclarationsRepository$fetchDeclarations$1) continuation;
            if ((tCFDeclarationsRepository$fetchDeclarations$1.label & Integer.MIN_VALUE) != 0) {
                tCFDeclarationsRepository$fetchDeclarations$1.label -= Integer.MIN_VALUE;
                TCFDeclarationsRepository$fetchDeclarations$1 tCFDeclarationsRepository$fetchDeclarations$12 = tCFDeclarationsRepository$fetchDeclarations$1;
                Object obj = tCFDeclarationsRepository$fetchDeclarations$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tCFDeclarationsRepository$fetchDeclarations$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.currentLanguage = str;
                    TCFDeclarationsRepository$fetchDeclarations$response$1 tCFDeclarationsRepository$fetchDeclarations$response$1 = new TCFDeclarationsRepository$fetchDeclarations$response$1(this, str, null);
                    tCFDeclarationsRepository$fetchDeclarations$12.L$0 = this;
                    tCFDeclarationsRepository$fetchDeclarations$12.label = 1;
                    obj = NetworkOrchestrator.resolveHttpBody2$default(this, false, tCFDeclarationsRepository$fetchDeclarations$response$1, tCFDeclarationsRepository$fetchDeclarations$12, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tCFDeclarationsRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tCFDeclarationsRepository = (TCFDeclarationsRepository) tCFDeclarationsRepository$fetchDeclarations$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return tCFDeclarationsRepository.parseJson((String) obj);
            }
        }
        tCFDeclarationsRepository$fetchDeclarations$1 = new TCFDeclarationsRepository$fetchDeclarations$1(this, continuation);
        TCFDeclarationsRepository$fetchDeclarations$1 tCFDeclarationsRepository$fetchDeclarations$122 = tCFDeclarationsRepository$fetchDeclarations$1;
        Object obj2 = tCFDeclarationsRepository$fetchDeclarations$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCFDeclarationsRepository$fetchDeclarations$122.label;
        if (i != 0) {
        }
        return tCFDeclarationsRepository.parseJson((String) obj2);
    }

    @Override // com.usercentrics.sdk.v2.etag.repository.EtagRepository
    protected String etagKey() {
        return EtagCacheStorage.tcfDeclarationsDir + this.currentLanguage;
    }

    private final Declarations parseJson(String responseBody) {
        Json json;
        json = JsonParserKt.json;
        Json json2 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(Declarations.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (Declarations) json2.decodeFromString(serializer, responseBody);
    }
}

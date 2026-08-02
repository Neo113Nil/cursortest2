package com.usercentrics.sdk.v2.ruleset.repository;

import com.usercentrics.sdk.core.application.INetworkStrategy;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import com.usercentrics.sdk.v2.network.NetworkOrchestrator;
import com.usercentrics.sdk.v2.ruleset.api.IRuleSetApi;
import com.usercentrics.sdk.v2.ruleset.data.RuleSet;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

/* compiled from: RuleSetRepository.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J*\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/usercentrics/sdk/v2/ruleset/repository/RuleSetRepository;", "Lcom/usercentrics/sdk/v2/network/NetworkOrchestrator;", "Lcom/usercentrics/sdk/v2/ruleset/repository/IRuleSetRepository;", "ruleSetApi", "Lcom/usercentrics/sdk/v2/ruleset/api/IRuleSetApi;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "etagCacheStorage", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "networkStrategy", "Lcom/usercentrics/sdk/core/application/INetworkStrategy;", "(Lcom/usercentrics/sdk/v2/ruleset/api/IRuleSetApi;Lcom/usercentrics/sdk/core/json/JsonParser;Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;Lcom/usercentrics/sdk/core/application/INetworkStrategy;)V", "etagKey", "", "fetchRuleSet", "Lkotlin/Pair;", "Lcom/usercentrics/sdk/v2/ruleset/data/RuleSet;", "Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;", "id", "bypassCache", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseJson", "response", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RuleSetRepository extends NetworkOrchestrator implements IRuleSetRepository {
    private final JsonParser jsonParser;
    private final IRuleSetApi ruleSetApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuleSetRepository(IRuleSetApi ruleSetApi, JsonParser jsonParser, UsercentricsLogger logger, IEtagCacheStorage etagCacheStorage, INetworkStrategy networkStrategy) {
        super(logger, etagCacheStorage, networkStrategy);
        Intrinsics.checkNotNullParameter(ruleSetApi, "ruleSetApi");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(etagCacheStorage, "etagCacheStorage");
        Intrinsics.checkNotNullParameter(networkStrategy, "networkStrategy");
        this.ruleSetApi = ruleSetApi;
        this.jsonParser = jsonParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.ruleset.repository.IRuleSetRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchRuleSet(String str, boolean z, Continuation<? super Pair<RuleSet, UsercentricsLocation>> continuation) {
        RuleSetRepository$fetchRuleSet$1 ruleSetRepository$fetchRuleSet$1;
        int i;
        RuleSetRepository ruleSetRepository;
        if (continuation instanceof RuleSetRepository$fetchRuleSet$1) {
            ruleSetRepository$fetchRuleSet$1 = (RuleSetRepository$fetchRuleSet$1) continuation;
            if ((ruleSetRepository$fetchRuleSet$1.label & Integer.MIN_VALUE) != 0) {
                ruleSetRepository$fetchRuleSet$1.label -= Integer.MIN_VALUE;
                Object obj = ruleSetRepository$fetchRuleSet$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ruleSetRepository$fetchRuleSet$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RuleSetRepository$fetchRuleSet$response$1 ruleSetRepository$fetchRuleSet$response$1 = new RuleSetRepository$fetchRuleSet$response$1(this, str, null);
                    ruleSetRepository$fetchRuleSet$1.L$0 = this;
                    ruleSetRepository$fetchRuleSet$1.label = 1;
                    obj = resolveHttp2(z, ruleSetRepository$fetchRuleSet$response$1, ruleSetRepository$fetchRuleSet$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ruleSetRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ruleSetRepository = (RuleSetRepository) ruleSetRepository$fetchRuleSet$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                HttpResponse httpResponse = (HttpResponse) obj;
                return new Pair(ruleSetRepository.parseJson(httpResponse), httpResponse.parseLocation());
            }
        }
        ruleSetRepository$fetchRuleSet$1 = new RuleSetRepository$fetchRuleSet$1(this, continuation);
        Object obj2 = ruleSetRepository$fetchRuleSet$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ruleSetRepository$fetchRuleSet$1.label;
        if (i != 0) {
        }
        HttpResponse httpResponse2 = (HttpResponse) obj2;
        return new Pair(ruleSetRepository.parseJson(httpResponse2), httpResponse2.parseLocation());
    }

    @Override // com.usercentrics.sdk.v2.etag.repository.EtagRepository
    protected String etagKey() {
        return EtagCacheStorage.ruleSetDir;
    }

    private final RuleSet parseJson(HttpResponse response) {
        Json json;
        String body = response.getBody();
        json = JsonParserKt.json;
        Json json2 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(RuleSet.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (RuleSet) json2.decodeFromString(serializer, body);
    }
}

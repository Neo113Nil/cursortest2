package com.usercentrics.sdk.v2.tcf.repository;

import com.usercentrics.sdk.core.application.INetworkStrategy;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import com.usercentrics.sdk.v2.network.NetworkOrchestrator;
import com.usercentrics.sdk.v2.tcf.api.ITCFVendorListApi;
import com.usercentrics.tcf.core.model.gvl.VendorList;
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

/* compiled from: TCFVendorListRepository.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u000e\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/usercentrics/sdk/v2/tcf/repository/TCFVendorListRepository;", "Lcom/usercentrics/sdk/v2/network/NetworkOrchestrator;", "Lcom/usercentrics/sdk/v2/tcf/repository/ITCFVendorListRepository;", "tcfVendorListApi", "Lcom/usercentrics/sdk/v2/tcf/api/ITCFVendorListApi;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "etagCacheStorage", "Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;", "networkStrategy", "Lcom/usercentrics/sdk/core/application/INetworkStrategy;", "(Lcom/usercentrics/sdk/v2/tcf/api/ITCFVendorListApi;Lcom/usercentrics/sdk/core/json/JsonParser;Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/etag/cache/IEtagCacheStorage;Lcom/usercentrics/sdk/core/application/INetworkStrategy;)V", "etagKey", "", "fetchVendorList", "Lcom/usercentrics/tcf/core/model/gvl/VendorList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseJson", "responseBody", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TCFVendorListRepository extends NetworkOrchestrator implements ITCFVendorListRepository {
    private final JsonParser jsonParser;
    private final ITCFVendorListApi tcfVendorListApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCFVendorListRepository(ITCFVendorListApi tcfVendorListApi, JsonParser jsonParser, UsercentricsLogger logger, IEtagCacheStorage etagCacheStorage, INetworkStrategy networkStrategy) {
        super(logger, etagCacheStorage, networkStrategy);
        Intrinsics.checkNotNullParameter(tcfVendorListApi, "tcfVendorListApi");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(etagCacheStorage, "etagCacheStorage");
        Intrinsics.checkNotNullParameter(networkStrategy, "networkStrategy");
        this.tcfVendorListApi = tcfVendorListApi;
        this.jsonParser = jsonParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.usercentrics.sdk.v2.tcf.repository.ITCFVendorListRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchVendorList(Continuation<? super VendorList> continuation) {
        TCFVendorListRepository$fetchVendorList$1 tCFVendorListRepository$fetchVendorList$1;
        int i;
        TCFVendorListRepository tCFVendorListRepository;
        if (continuation instanceof TCFVendorListRepository$fetchVendorList$1) {
            tCFVendorListRepository$fetchVendorList$1 = (TCFVendorListRepository$fetchVendorList$1) continuation;
            if ((tCFVendorListRepository$fetchVendorList$1.label & Integer.MIN_VALUE) != 0) {
                tCFVendorListRepository$fetchVendorList$1.label -= Integer.MIN_VALUE;
                TCFVendorListRepository$fetchVendorList$1 tCFVendorListRepository$fetchVendorList$12 = tCFVendorListRepository$fetchVendorList$1;
                Object obj = tCFVendorListRepository$fetchVendorList$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tCFVendorListRepository$fetchVendorList$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    TCFVendorListRepository$fetchVendorList$response$1 tCFVendorListRepository$fetchVendorList$response$1 = new TCFVendorListRepository$fetchVendorList$response$1(this, null);
                    tCFVendorListRepository$fetchVendorList$12.L$0 = this;
                    tCFVendorListRepository$fetchVendorList$12.label = 1;
                    obj = NetworkOrchestrator.resolveHttpBody2$default(this, false, tCFVendorListRepository$fetchVendorList$response$1, tCFVendorListRepository$fetchVendorList$12, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tCFVendorListRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tCFVendorListRepository = (TCFVendorListRepository) tCFVendorListRepository$fetchVendorList$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return tCFVendorListRepository.parseJson((String) obj);
            }
        }
        tCFVendorListRepository$fetchVendorList$1 = new TCFVendorListRepository$fetchVendorList$1(this, continuation);
        TCFVendorListRepository$fetchVendorList$1 tCFVendorListRepository$fetchVendorList$122 = tCFVendorListRepository$fetchVendorList$1;
        Object obj2 = tCFVendorListRepository$fetchVendorList$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCFVendorListRepository$fetchVendorList$122.label;
        if (i != 0) {
        }
        return tCFVendorListRepository.parseJson((String) obj2);
    }

    @Override // com.usercentrics.sdk.v2.etag.repository.EtagRepository
    protected String etagKey() {
        return EtagCacheStorage.tcfVendorListDir;
    }

    private final VendorList parseJson(String responseBody) {
        Json json;
        json = JsonParserKt.json;
        Json json2 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(VendorList.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (VendorList) json2.decodeFromString(serializer, responseBody);
    }
}

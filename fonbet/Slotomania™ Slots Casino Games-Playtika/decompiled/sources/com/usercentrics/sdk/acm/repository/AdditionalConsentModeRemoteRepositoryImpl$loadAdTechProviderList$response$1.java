package com.usercentrics.sdk.acm.repository;

import com.usercentrics.sdk.acm.api.AdditionalConsentModeApi;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: AdditionalConsentModeRemoteRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.acm.repository.AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1", f = "AdditionalConsentModeRemoteRepositoryImpl.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1 extends SuspendLambda implements Function1<Continuation<? super HttpResponse>, Object> {
    int label;
    final /* synthetic */ AdditionalConsentModeRemoteRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1(AdditionalConsentModeRemoteRepositoryImpl additionalConsentModeRemoteRepositoryImpl, Continuation<? super AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1> continuation) {
        super(1, continuation);
        this.this$0 = additionalConsentModeRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super HttpResponse> continuation) {
        return ((AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdditionalConsentModeApi additionalConsentModeApi;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        additionalConsentModeApi = this.this$0.api;
        this.label = 1;
        Object loadAdTechProviderList = additionalConsentModeApi.loadAdTechProviderList(this.this$0.getApiHeaders(), this);
        return loadAdTechProviderList == coroutine_suspended ? coroutine_suspended : loadAdTechProviderList;
    }
}

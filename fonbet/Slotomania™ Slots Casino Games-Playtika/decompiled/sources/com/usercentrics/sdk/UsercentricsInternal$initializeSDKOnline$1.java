package com.usercentrics.sdk;

import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;

/* compiled from: UsercentricsInternal.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.UsercentricsInternal$initializeSDKOnline$1", f = "UsercentricsInternal.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class UsercentricsInternal$initializeSDKOnline$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IEtagCacheStorage $cacheStorage;
    final /* synthetic */ UsercentricsSDK $usercentrics;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsercentricsInternal$initializeSDKOnline$1(IEtagCacheStorage iEtagCacheStorage, UsercentricsSDK usercentricsSDK, Continuation<? super UsercentricsInternal$initializeSDKOnline$1> continuation) {
        super(2, continuation);
        this.$cacheStorage = iEtagCacheStorage;
        this.$usercentrics = usercentricsSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UsercentricsInternal$initializeSDKOnline$1(this.$cacheStorage, this.$usercentrics, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((UsercentricsInternal$initializeSDKOnline$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mo10585initializegIAlus$usercentrics_release;
        UsercentricsException wrapAsUsercentricsException;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$cacheStorage.saveOfflineStaging();
            this.label = 1;
            mo10585initializegIAlus$usercentrics_release = this.$usercentrics.mo10585initializegIAlus$usercentrics_release(false, this);
            if (mo10585initializegIAlus$usercentrics_release == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            mo10585initializegIAlus$usercentrics_release = ((Result) obj).getValue();
        }
        boolean isCancelled = JobKt.getJob(get$context()).isCancelled();
        if (Result.m11187isSuccessimpl(mo10585initializegIAlus$usercentrics_release) && !isCancelled) {
            UsercentricsInternal usercentricsInternal = UsercentricsInternal.INSTANCE;
            Result.Companion companion = Result.INSTANCE;
            usercentricsInternal.finishInitialization(Result.m11180constructorimpl(this.$usercentrics));
            this.$cacheStorage.removeOfflineStaging();
            return Unit.INSTANCE;
        }
        UsercentricsInternal usercentricsInternal2 = UsercentricsInternal.INSTANCE;
        wrapAsUsercentricsException = UsercentricsInternal.INSTANCE.wrapAsUsercentricsException(Result.m11183exceptionOrNullimpl(mo10585initializegIAlus$usercentrics_release));
        usercentricsInternal2.onFailureInitializingSDKOnline(wrapAsUsercentricsException);
        return Unit.INSTANCE;
    }
}

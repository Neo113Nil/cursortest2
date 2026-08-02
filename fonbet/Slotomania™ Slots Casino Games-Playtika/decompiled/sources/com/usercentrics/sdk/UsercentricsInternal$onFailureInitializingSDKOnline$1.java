package com.usercentrics.sdk;

import com.usercentrics.sdk.core.application.Application;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: UsercentricsInternal.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.UsercentricsInternal$onFailureInitializingSDKOnline$1", f = "UsercentricsInternal.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class UsercentricsInternal$onFailureInitializingSDKOnline$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Application $application;
    final /* synthetic */ UsercentricsException $exception;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsercentricsInternal$onFailureInitializingSDKOnline$1(Application application, UsercentricsException usercentricsException, Continuation<? super UsercentricsInternal$onFailureInitializingSDKOnline$1> continuation) {
        super(2, continuation);
        this.$application = application;
        this.$exception = usercentricsException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UsercentricsInternal$onFailureInitializingSDKOnline$1(this.$application, this.$exception, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((UsercentricsInternal$onFailureInitializingSDKOnline$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object initializeSDKOffline;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$application.getEtagCacheStorage().getValue().restoreOfflineStaging();
            this.label = 1;
            initializeSDKOffline = UsercentricsInternal.INSTANCE.initializeSDKOffline(this.$exception, this);
            if (initializeSDKOffline == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

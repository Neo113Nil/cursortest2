package com.usercentrics.sdk;

import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: UsercentricsSDKImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.UsercentricsSDKImpl$clearUserSession$1", f = "UsercentricsSDKImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class UsercentricsSDKImpl$clearUserSession$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UsercentricsSDKImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsercentricsSDKImpl$clearUserSession$1(UsercentricsSDKImpl usercentricsSDKImpl, Continuation<? super UsercentricsSDKImpl$clearUserSession$1> continuation) {
        super(2, continuation);
        this.this$0 = usercentricsSDKImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UsercentricsSDKImpl$clearUserSession$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((UsercentricsSDKImpl$clearUserSession$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AssertionsKt.assertNotUIThread();
        this.this$0.invokeClearUserSession();
        return Unit.INSTANCE;
    }
}

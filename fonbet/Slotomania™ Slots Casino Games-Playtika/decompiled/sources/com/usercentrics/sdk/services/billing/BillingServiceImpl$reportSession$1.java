package com.usercentrics.sdk.services.billing;

import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: BillingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.services.billing.BillingServiceImpl$reportSession$1", f = "BillingService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BillingServiceImpl$reportSession$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $settingsId;
    final /* synthetic */ long $timestamp;
    int label;
    final /* synthetic */ BillingServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BillingServiceImpl$reportSession$1(BillingServiceImpl billingServiceImpl, long j, String str, Continuation<? super BillingServiceImpl$reportSession$1> continuation) {
        super(2, continuation);
        this.this$0 = billingServiceImpl;
        this.$timestamp = j;
        this.$settingsId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingServiceImpl$reportSession$1(this.this$0, this.$timestamp, this.$settingsId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((BillingServiceImpl$reportSession$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeviceStorage deviceStorage;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            deviceStorage = this.this$0.storageInstance;
            deviceStorage.addSessionToBuffer(this.$timestamp, this.$settingsId);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

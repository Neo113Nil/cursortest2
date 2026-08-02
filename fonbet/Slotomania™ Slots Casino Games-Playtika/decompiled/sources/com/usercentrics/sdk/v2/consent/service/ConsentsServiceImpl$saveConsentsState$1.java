package com.usercentrics.sdk.v2.consent.service;

import com.usercentrics.sdk.models.settings.UsercentricsConsentAction;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import com.usercentrics.sdk.v2.consent.data.SaveConsentsData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: ConsentsServiceImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.consent.service.ConsentsServiceImpl$saveConsentsState$1", f = "ConsentsServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ConsentsServiceImpl$saveConsentsState$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UsercentricsConsentAction $cause;
    int label;
    final /* synthetic */ ConsentsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConsentsServiceImpl$saveConsentsState$1(ConsentsServiceImpl consentsServiceImpl, UsercentricsConsentAction usercentricsConsentAction, Continuation<? super ConsentsServiceImpl$saveConsentsState$1> continuation) {
        super(2, continuation);
        this.this$0 = consentsServiceImpl;
        this.$cause = usercentricsConsentAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConsentsServiceImpl$saveConsentsState$1(this.this$0, this.$cause, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((ConsentsServiceImpl$saveConsentsState$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SaveConsentsData createState;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            createState = this.this$0.createState(this.$cause);
            this.this$0.doSaveConsents(createState);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

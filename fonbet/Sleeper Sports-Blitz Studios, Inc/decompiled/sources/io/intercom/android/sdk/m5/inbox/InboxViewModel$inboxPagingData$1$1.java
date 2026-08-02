package io.intercom.android.sdk.m5.inbox;

import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/intercom/android/sdk/models/EmptyState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$inboxPagingData$1$1", f = "InboxViewModel.kt", i = {0}, l = {55}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class InboxViewModel$inboxPagingData$1$1 extends SuspendLambda implements Function2<EmptyState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InboxViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboxViewModel$inboxPagingData$1$1(InboxViewModel inboxViewModel, Continuation<? super InboxViewModel$inboxPagingData$1$1> continuation) {
        super(2, continuation);
        this.this$0 = inboxViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InboxViewModel$inboxPagingData$1$1 inboxViewModel$inboxPagingData$1$1 = new InboxViewModel$inboxPagingData$1$1(this.this$0, continuation);
        inboxViewModel$inboxPagingData$1$1.L$0 = obj;
        return inboxViewModel$inboxPagingData$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EmptyState emptyState, Continuation<? super Unit> continuation) {
        return ((InboxViewModel$inboxPagingData$1$1) create(emptyState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EmptyState emptyState;
        InboxViewModel inboxViewModel;
        CommonRepository commonRepository;
        InboxViewModel inboxViewModel2;
        EmptyState copy$default;
        OpenMessengerResponse.NewConversationData newConversationData;
        OpenMessengerResponse.NewConversationData.Cta cta;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            emptyState = (EmptyState) this.L$0;
            inboxViewModel = this.this$0;
            if (!Intrinsics.areEqual(emptyState, EmptyState.INSTANCE.getNULL())) {
                commonRepository = this.this$0.commonRepository;
                this.L$0 = emptyState;
                this.L$1 = inboxViewModel;
                this.label = 1;
                Object openMessenger = commonRepository.openMessenger(this);
                if (openMessenger == coroutine_suspended) {
                    return coroutine_suspended;
                }
                inboxViewModel2 = inboxViewModel;
                obj = openMessenger;
            }
            inboxViewModel.emptyState = emptyState;
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        inboxViewModel2 = (InboxViewModel) this.L$1;
        emptyState = (EmptyState) this.L$0;
        ResultKt.throwOnFailure(obj);
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        String text = (openMessengerResponse == null || (newConversationData = openMessengerResponse.getNewConversationData()) == null || (cta = newConversationData.getCta()) == null) ? null : cta.getText();
        if (text != null && (copy$default = EmptyState.copy$default(emptyState, null, null, EmptyState.Action.copy$default(emptyState.getAction(), null, text, null, 5, null), 3, null)) != null) {
            emptyState = copy$default;
        }
        inboxViewModel = inboxViewModel2;
        inboxViewModel.emptyState = emptyState;
        return Unit.INSTANCE;
    }
}

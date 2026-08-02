package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: ShowAdminIsTypingUseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086B¢\u0006\u0002\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/ShowAdminIsTypingUseCase;", "", "<init>", "()V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "isBot", "", "showAvatar", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lio/intercom/android/sdk/models/Avatar;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAdminIndicator", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ShowAdminIsTypingUseCase {
    public static final int $stable = 0;

    public static /* synthetic */ Object invoke$default(ShowAdminIsTypingUseCase showAdminIsTypingUseCase, MutableStateFlow mutableStateFlow, Avatar avatar, boolean z, boolean z2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return showAdminIsTypingUseCase.invoke(mutableStateFlow, avatar, z3, z2, continuation);
    }

    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, Avatar avatar, boolean z, boolean z2, Continuation<? super Unit> continuation) {
        Object sendAdminIndicator = sendAdminIndicator(mutableStateFlow, avatar, z, z2 && !z, continuation);
        return sendAdminIndicator == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendAdminIndicator : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAdminIndicator(MutableStateFlow<ConversationClientState> mutableStateFlow, Avatar avatar, boolean z, boolean z2, Continuation<? super Unit> continuation) {
        ShowAdminIsTypingUseCase$sendAdminIndicator$1 showAdminIsTypingUseCase$sendAdminIndicator$1;
        int i;
        ConversationClientState value;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        ConversationClientState value2;
        MutableStateFlow<ConversationClientState> mutableStateFlow3 = mutableStateFlow;
        if (continuation instanceof ShowAdminIsTypingUseCase$sendAdminIndicator$1) {
            showAdminIsTypingUseCase$sendAdminIndicator$1 = (ShowAdminIsTypingUseCase$sendAdminIndicator$1) continuation;
            if ((showAdminIsTypingUseCase$sendAdminIndicator$1.label & Integer.MIN_VALUE) != 0) {
                showAdminIsTypingUseCase$sendAdminIndicator$1.label -= Integer.MIN_VALUE;
                Object obj = showAdminIsTypingUseCase$sendAdminIndicator$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = showAdminIsTypingUseCase$sendAdminIndicator$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (mutableStateFlow3.getValue().getCurrentlyTypingState().getUserType() != TypingIndicatorType.NONE) {
                        return Unit.INSTANCE;
                    }
                    do {
                        value = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, new CurrentlyTypingState(new AvatarWrapper(avatar, z), z2, null, TypingIndicatorType.ADMIN, 4, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194295, null)));
                    showAdminIsTypingUseCase$sendAdminIndicator$1.L$0 = mutableStateFlow3;
                    showAdminIsTypingUseCase$sendAdminIndicator$1.label = 1;
                    if (DelayKt.delay(5000L, showAdminIsTypingUseCase$sendAdminIndicator$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableStateFlow3 = (MutableStateFlow) showAdminIsTypingUseCase$sendAdminIndicator$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableStateFlow2 = mutableStateFlow3;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, ConversationClientState.copy$default(value2, null, null, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194295, null)));
                return Unit.INSTANCE;
            }
        }
        showAdminIsTypingUseCase$sendAdminIndicator$1 = new ShowAdminIsTypingUseCase$sendAdminIndicator$1(this, continuation);
        Object obj2 = showAdminIsTypingUseCase$sendAdminIndicator$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = showAdminIsTypingUseCase$sendAdminIndicator$1.label;
        if (i != 0) {
        }
        mutableStateFlow2 = mutableStateFlow3;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, ConversationClientState.copy$default(value2, null, null, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194295, null)));
        return Unit.INSTANCE;
    }
}

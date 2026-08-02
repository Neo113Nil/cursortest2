package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: OpenConversationUseCase.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086B¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/OpenConversationUseCase;", "", "refreshConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "refreshUnreadConversationsCountUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase;", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase;Lio/intercom/android/sdk/m5/data/CommonRepository;)V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "getConversationReason", "Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OpenConversationUseCase {
    public static final int $stable = 8;
    private final CommonRepository commonRepository;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;

    public OpenConversationUseCase(RefreshConversationUseCase refreshConversationUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, CommonRepository commonRepository) {
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        Intrinsics.checkNotNullParameter(refreshUnreadConversationsCountUseCase, "refreshUnreadConversationsCountUseCase");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase;
        this.commonRepository = commonRepository;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OpenConversationUseCase(RefreshConversationUseCase refreshConversationUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, CommonRepository commonRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(refreshConversationUseCase, refreshUnreadConversationsCountUseCase, commonRepository);
        if ((i & 4) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
            IntercomDataLayer dataLayer = Injector.get().getDataLayer();
            Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
            commonRepository = new CommonRepository(messengerApi, dataLayer);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f5, code lost:
    
        if (r1.invoke(r4, r2) != r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, GetConversationReason getConversationReason, Continuation<? super Unit> continuation) {
        OpenConversationUseCase$invoke$1 openConversationUseCase$invoke$1;
        Object coroutine_suspended;
        int i;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        GetConversationReason getConversationReason2;
        OpenConversationUseCase openConversationUseCase;
        OpenMessengerResponse openMessengerResponse;
        ConversationClientState value;
        RefreshConversationUseCase refreshConversationUseCase;
        OpenConversationUseCase openConversationUseCase2;
        if (continuation instanceof OpenConversationUseCase$invoke$1) {
            openConversationUseCase$invoke$1 = (OpenConversationUseCase$invoke$1) continuation;
            if ((openConversationUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                openConversationUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = openConversationUseCase$invoke$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = openConversationUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CommonRepository commonRepository = this.commonRepository;
                    openConversationUseCase$invoke$1.L$0 = this;
                    mutableStateFlow2 = mutableStateFlow;
                    openConversationUseCase$invoke$1.L$1 = mutableStateFlow2;
                    getConversationReason2 = getConversationReason;
                    openConversationUseCase$invoke$1.L$2 = getConversationReason2;
                    openConversationUseCase$invoke$1.label = 1;
                    obj = commonRepository.openMessenger(openConversationUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        openConversationUseCase = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    GetConversationReason getConversationReason3 = (GetConversationReason) openConversationUseCase$invoke$1.L$2;
                    MutableStateFlow<ConversationClientState> mutableStateFlow3 = (MutableStateFlow) openConversationUseCase$invoke$1.L$1;
                    OpenConversationUseCase openConversationUseCase3 = (OpenConversationUseCase) openConversationUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    getConversationReason2 = getConversationReason3;
                    mutableStateFlow2 = mutableStateFlow3;
                    openConversationUseCase = openConversationUseCase3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    mutableStateFlow2 = (MutableStateFlow) openConversationUseCase$invoke$1.L$1;
                    openConversationUseCase2 = (OpenConversationUseCase) openConversationUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase = openConversationUseCase2.refreshUnreadConversationsCountUseCase;
                    openConversationUseCase$invoke$1.L$0 = null;
                    openConversationUseCase$invoke$1.L$1 = null;
                    openConversationUseCase$invoke$1.label = 3;
                }
                openMessengerResponse = (OpenMessengerResponse) obj;
                if (mutableStateFlow2.getValue().getLastNetworkCall() == null && !(mutableStateFlow2.getValue().getLastNetworkCall() instanceof NetworkResponse.Success)) {
                    return Unit.INSTANCE;
                }
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, openMessengerResponse, 0, 0, null, null, false, false, null, null, 4185983, null)));
                refreshConversationUseCase = openConversationUseCase.refreshConversationUseCase;
                openConversationUseCase$invoke$1.L$0 = openConversationUseCase;
                openConversationUseCase$invoke$1.L$1 = mutableStateFlow2;
                openConversationUseCase$invoke$1.L$2 = null;
                openConversationUseCase$invoke$1.label = 2;
                if (refreshConversationUseCase.invoke(mutableStateFlow2, getConversationReason2, openConversationUseCase$invoke$1) != coroutine_suspended) {
                    openConversationUseCase2 = openConversationUseCase;
                    RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase2 = openConversationUseCase2.refreshUnreadConversationsCountUseCase;
                    openConversationUseCase$invoke$1.L$0 = null;
                    openConversationUseCase$invoke$1.L$1 = null;
                    openConversationUseCase$invoke$1.label = 3;
                }
                return coroutine_suspended;
            }
        }
        openConversationUseCase$invoke$1 = new OpenConversationUseCase$invoke$1(this, continuation);
        Object obj2 = openConversationUseCase$invoke$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = openConversationUseCase$invoke$1.label;
        if (i != 0) {
        }
        openMessengerResponse = (OpenMessengerResponse) obj2;
        if (mutableStateFlow2.getValue().getLastNetworkCall() == null) {
        }
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, openMessengerResponse, 0, 0, null, null, false, false, null, null, 4185983, null)));
        refreshConversationUseCase = openConversationUseCase.refreshConversationUseCase;
        openConversationUseCase$invoke$1.L$0 = openConversationUseCase;
        openConversationUseCase$invoke$1.L$1 = mutableStateFlow2;
        openConversationUseCase$invoke$1.L$2 = null;
        openConversationUseCase$invoke$1.label = 2;
        if (refreshConversationUseCase.invoke(mutableStateFlow2, getConversationReason2, openConversationUseCase$invoke$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ Object invoke$default(OpenConversationUseCase openConversationUseCase, MutableStateFlow mutableStateFlow, GetConversationReason getConversationReason, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            getConversationReason = GetConversationReason.OPEN_CONVERSATION;
        }
        return openConversationUseCase.invoke(mutableStateFlow, getConversationReason, continuation);
    }
}

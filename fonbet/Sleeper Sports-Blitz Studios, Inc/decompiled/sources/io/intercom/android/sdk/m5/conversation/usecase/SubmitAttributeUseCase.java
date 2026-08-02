package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Conversation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SubmitAttributeUseCase.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086B¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SubmitAttributeUseCase;", "", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;)V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "attribute", "Lio/intercom/android/sdk/models/Attribute;", "partId", "", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lio/intercom/android/sdk/models/Attribute;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubmitAttributeUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    public SubmitAttributeUseCase(ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.conversationRepository = conversationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ff A[LOOP:0: B:12:0x00ff->B:40:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, Attribute attribute, String str, Continuation<? super Unit> continuation) {
        SubmitAttributeUseCase$invoke$1 submitAttributeUseCase$invoke$1;
        int i;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        List plus;
        ArrayList arrayList;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        Attribute attribute2;
        NetworkResponse networkResponse;
        ConversationClientState value2;
        ConversationClientState conversationClientState2;
        List plus2;
        ArrayList arrayList2;
        ConversationClientState value3;
        ConversationClientState conversationClientState3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (continuation instanceof SubmitAttributeUseCase$invoke$1) {
            submitAttributeUseCase$invoke$1 = (SubmitAttributeUseCase$invoke$1) continuation;
            if ((submitAttributeUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                submitAttributeUseCase$invoke$1.label -= Integer.MIN_VALUE;
                SubmitAttributeUseCase$invoke$1 submitAttributeUseCase$invoke$12 = submitAttributeUseCase$invoke$1;
                Object obj = submitAttributeUseCase$invoke$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = submitAttributeUseCase$invoke$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Conversation conversation = mutableStateFlow.getValue().getConversation();
                    if (conversation == null) {
                        return Unit.INSTANCE;
                    }
                    do {
                        value = mutableStateFlow.getValue();
                        conversationClientState = value;
                        plus = CollectionsKt.plus((Collection<? extends String>) conversationClientState.getLoadingAttributeIdentifiers(), attribute.getIdentifier());
                        List<String> failedAttributeIdentifiers = conversationClientState.getFailedAttributeIdentifiers();
                        arrayList = new ArrayList();
                        for (Object obj2 : failedAttributeIdentifiers) {
                            if (!Intrinsics.areEqual((String) obj2, attribute.getIdentifier())) {
                                arrayList.add(obj2);
                            }
                        }
                    } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, null, null, null, null, null, null, null, null, null, null, arrayList, plus, null, null, 0, 0, null, null, false, false, null, null, 4191231, null)));
                    ConversationRepository conversationRepository = this.conversationRepository;
                    String id = conversation.getId();
                    String identifier = attribute.getIdentifier();
                    String value4 = attribute.getValue();
                    if (value4 == null) {
                        value4 = "";
                    }
                    String type = attribute.getType();
                    submitAttributeUseCase$invoke$12.L$0 = mutableStateFlow;
                    submitAttributeUseCase$invoke$12.L$1 = attribute;
                    submitAttributeUseCase$invoke$12.label = 1;
                    obj = conversationRepository.submitForm(id, str, identifier, value4, type, submitAttributeUseCase$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableStateFlow2 = mutableStateFlow;
                    attribute2 = attribute;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Attribute attribute3 = (Attribute) submitAttributeUseCase$invoke$12.L$1;
                    MutableStateFlow<ConversationClientState> mutableStateFlow3 = (MutableStateFlow) submitAttributeUseCase$invoke$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    attribute2 = attribute3;
                    mutableStateFlow2 = mutableStateFlow3;
                }
                networkResponse = (NetworkResponse) obj;
                if (networkResponse instanceof NetworkResponse.Success) {
                    if (!(networkResponse instanceof NetworkResponse.ClientError) && !(networkResponse instanceof NetworkResponse.NetworkError) && !(networkResponse instanceof NetworkResponse.ServerError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    do {
                        value2 = mutableStateFlow2.getValue();
                        conversationClientState2 = value2;
                        plus2 = CollectionsKt.plus((Collection<? extends String>) conversationClientState2.getFailedAttributeIdentifiers(), attribute2.getIdentifier());
                        List<String> loadingAttributeIdentifiers = conversationClientState2.getLoadingAttributeIdentifiers();
                        arrayList2 = new ArrayList();
                        for (Object obj3 : loadingAttributeIdentifiers) {
                            if (!Intrinsics.areEqual((String) obj3, attribute2.getIdentifier())) {
                                arrayList2.add(obj3);
                            }
                        }
                    } while (!mutableStateFlow2.compareAndSet(value2, ConversationClientState.copy$default(conversationClientState2, null, null, null, null, null, null, null, null, null, null, plus2, arrayList2, null, null, 0, 0, null, null, false, false, null, null, 4191231, null)));
                } else {
                    do {
                        value3 = mutableStateFlow2.getValue();
                        conversationClientState3 = value3;
                        List<String> failedAttributeIdentifiers2 = conversationClientState3.getFailedAttributeIdentifiers();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : failedAttributeIdentifiers2) {
                            if (!Intrinsics.areEqual((String) obj4, attribute2.getIdentifier())) {
                                arrayList5.add(obj4);
                            }
                        }
                        arrayList3 = arrayList5;
                        List<String> loadingAttributeIdentifiers2 = conversationClientState3.getLoadingAttributeIdentifiers();
                        arrayList4 = new ArrayList();
                        for (Object obj5 : loadingAttributeIdentifiers2) {
                            if (!Intrinsics.areEqual((String) obj5, attribute2.getIdentifier())) {
                                arrayList4.add(obj5);
                            }
                        }
                    } while (!mutableStateFlow2.compareAndSet(value3, ConversationClientState.copy$default(conversationClientState3, null, (Conversation) ((NetworkResponse.Success) networkResponse).getBody(), null, null, null, null, null, null, null, null, arrayList3, arrayList4, null, null, 0, 0, null, null, false, false, null, null, 4191229, null)));
                }
                return Unit.INSTANCE;
            }
        }
        submitAttributeUseCase$invoke$1 = new SubmitAttributeUseCase$invoke$1(this, continuation);
        SubmitAttributeUseCase$invoke$1 submitAttributeUseCase$invoke$122 = submitAttributeUseCase$invoke$1;
        Object obj6 = submitAttributeUseCase$invoke$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = submitAttributeUseCase$invoke$122.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj6;
        if (networkResponse instanceof NetworkResponse.Success) {
        }
        return Unit.INSTANCE;
    }
}

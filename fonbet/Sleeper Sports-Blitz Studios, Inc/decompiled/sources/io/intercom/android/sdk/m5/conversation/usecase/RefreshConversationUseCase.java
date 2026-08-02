package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: RefreshConversationUseCase.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086B¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "trackLastReceivedPartsUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;", "recordOpenedInteractionUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;)V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "getConversationReason", "Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RefreshConversationUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;

    public RefreshConversationUseCase(ConversationRepository conversationRepository, IntercomDataLayer intercomDataLayer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(trackLastReceivedPartsUseCase, "trackLastReceivedPartsUseCase");
        Intrinsics.checkNotNullParameter(recordOpenedInteractionUseCase, "recordOpenedInteractionUseCase");
        this.conversationRepository = conversationRepository;
        this.intercomDataLayer = intercomDataLayer;
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
    }

    public /* synthetic */ RefreshConversationUseCase(ConversationRepository conversationRepository, IntercomDataLayer intercomDataLayer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository, (i & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, trackLastReceivedPartsUseCase, recordOpenedInteractionUseCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x027b A[LOOP:6: B:104:0x027b->B:107:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, GetConversationReason getConversationReason, Continuation<? super Unit> continuation) {
        RefreshConversationUseCase$invoke$1 refreshConversationUseCase$invoke$1;
        int i;
        RefreshConversationUseCase refreshConversationUseCase;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        NetworkResponse networkResponse;
        FinStreamingData finStreamingData;
        Pair calculateJumpToBottomButtonState;
        RefreshConversationUseCase refreshConversationUseCase2;
        Conversation conversation;
        if (continuation instanceof RefreshConversationUseCase$invoke$1) {
            refreshConversationUseCase$invoke$1 = (RefreshConversationUseCase$invoke$1) continuation;
            if ((refreshConversationUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                refreshConversationUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = refreshConversationUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = refreshConversationUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String conversationId = mutableStateFlow.getValue().getConversationId();
                    if (conversationId != null) {
                        ConversationRepository conversationRepository = this.conversationRepository;
                        refreshConversationUseCase$invoke$1.L$0 = this;
                        refreshConversationUseCase$invoke$1.L$1 = mutableStateFlow;
                        refreshConversationUseCase$invoke$1.label = 1;
                        obj = conversationRepository.getConversation(conversationId, getConversationReason, refreshConversationUseCase$invoke$1);
                        if (obj != coroutine_suspended) {
                            refreshConversationUseCase = this;
                            mutableStateFlow2 = mutableStateFlow;
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    conversation = (Conversation) refreshConversationUseCase$invoke$1.L$1;
                    refreshConversationUseCase2 = (RefreshConversationUseCase) refreshConversationUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    refreshConversationUseCase2.conversationRepository.nexusEventsRepository().markAsSeen(conversation.getId());
                    refreshConversationUseCase2.intercomDataLayer.markConversationAsRead(conversation.getId());
                    return Unit.INSTANCE;
                }
                mutableStateFlow2 = (MutableStateFlow) refreshConversationUseCase$invoke$1.L$1;
                refreshConversationUseCase = (RefreshConversationUseCase) refreshConversationUseCase$invoke$1.L$0;
                ResultKt.throwOnFailure(obj);
                networkResponse = (NetworkResponse) obj;
                ConversationClientState value = mutableStateFlow2.getValue();
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    Conversation conversation2 = (Conversation) ((NetworkResponse.Success) networkResponse).getBody();
                    refreshConversationUseCase.trackLastReceivedPartsUseCase.invoke(conversation2);
                    Map<String, PendingMessage> pendingMessages = value.getPendingMessages();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, PendingMessage> entry : pendingMessages.entrySet()) {
                        List<Part> parts = conversation2.parts();
                        if (!(parts instanceof Collection) || !parts.isEmpty()) {
                            for (Part part : parts) {
                                if (!Intrinsics.areEqual(part.getUuid(), entry.getValue().getPart().getUuid()) && !Intrinsics.areEqual(part.getId(), entry.getValue().getPart().getId())) {
                                }
                            }
                        }
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                    List<Part> parts2 = conversation2.parts();
                    if (!(parts2 instanceof Collection) || !parts2.isEmpty()) {
                        for (Part part2 : parts2) {
                            String uuid = part2.getUuid();
                            Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                            if (!StringsKt.isBlank(uuid) && Intrinsics.areEqual(part2.getUuid(), value.getFinStreamingData().getClientAssignedUUID())) {
                                finStreamingData = new FinStreamingData(false, CollectionsKt.emptyList(), "", 0);
                                break;
                            }
                        }
                    }
                    finStreamingData = value.getFinStreamingData();
                    FinStreamingData finStreamingData2 = finStreamingData;
                    List<Part> parts3 = conversation2.parts();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : parts3) {
                        Part part3 = (Part) obj2;
                        if (!part3.isUser()) {
                            Conversation conversation3 = value.getConversation();
                            List<Part> parts4 = conversation3 != null ? conversation3.parts() : null;
                            if (parts4 == null) {
                                parts4 = CollectionsKt.emptyList();
                            }
                            List<Part> list = parts4;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    if (Intrinsics.areEqual(((Part) it.next()).getId(), part3.getId())) {
                                        break;
                                    }
                                }
                            }
                            arrayList.add(obj2);
                        }
                    }
                    calculateJumpToBottomButtonState = RefreshConversationUseCaseKt.calculateJumpToBottomButtonState(value, conversation2, arrayList);
                    while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), ConversationClientState.copy$default(value, linkedHashMap, conversation2, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, networkResponse, null, null, null, null, finStreamingData2, null, 0, 0, (FloatingIndicatorState) calculateJumpToBottomButtonState.component1(), (String) calculateJumpToBottomButtonState.component2(), false, false, null, null, 3993460, null))) {
                    }
                    IntercomDataLayer intercomDataLayer = refreshConversationUseCase.intercomDataLayer;
                    Ticket ticket = conversation2.getTicket();
                    if (ticket == null) {
                        ticket = Ticket.INSTANCE.getNULL();
                    }
                    intercomDataLayer.updateTicket(ticket);
                    refreshConversationUseCase.intercomDataLayer.fetchConversationSuccess(conversation2);
                    refreshConversationUseCase.recordOpenedInteractionUseCase.invoke(conversation2);
                    if (!conversation2.isRead()) {
                        ConversationRepository conversationRepository2 = refreshConversationUseCase.conversationRepository;
                        String id = conversation2.getId();
                        refreshConversationUseCase$invoke$1.L$0 = refreshConversationUseCase;
                        refreshConversationUseCase$invoke$1.L$1 = conversation2;
                        refreshConversationUseCase$invoke$1.label = 2;
                        if (conversationRepository2.markAsRead(id, refreshConversationUseCase$invoke$1) != coroutine_suspended) {
                            refreshConversationUseCase2 = refreshConversationUseCase;
                            conversation = conversation2;
                            refreshConversationUseCase2.conversationRepository.nexusEventsRepository().markAsSeen(conversation.getId());
                            refreshConversationUseCase2.intercomDataLayer.markConversationAsRead(conversation.getId());
                        }
                        return coroutine_suspended;
                    }
                } else {
                    while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), ConversationClientState.copy$default(value, null, null, null, null, null, null, null, networkResponse, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194175, null))) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        refreshConversationUseCase$invoke$1 = new RefreshConversationUseCase$invoke$1(this, continuation);
        Object obj3 = refreshConversationUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = refreshConversationUseCase$invoke$1.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj3;
        ConversationClientState value2 = mutableStateFlow2.getValue();
        if (!(networkResponse instanceof NetworkResponse.Success)) {
        }
        return Unit.INSTANCE;
    }
}

package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* compiled from: RefreshConversationUseCase.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¨\u0006\u000b"}, d2 = {"calculateJumpToBottomButtonState", "Lkotlin/Pair;", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "", "currentClientState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "newConversation", "Lio/intercom/android/sdk/models/Conversation;", "newAdminMessages", "", "Lio/intercom/android/sdk/models/Part;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RefreshConversationUseCaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<FloatingIndicatorState, String> calculateJumpToBottomButtonState(ConversationClientState conversationClientState, Conversation conversation, List<? extends Part> list) {
        if (conversationClientState.getFloatingIndicatorState() instanceof FloatingIndicatorState.JumpToBottomIndicator) {
            String newMessageId = conversationClientState.getNewMessageId();
            if (newMessageId == null) {
                Part part = (Part) CollectionsKt.firstOrNull((List) list);
                if (part != null) {
                    r1 = part.getId();
                }
            } else {
                r1 = newMessageId;
            }
            return TuplesKt.to(new FloatingIndicatorState.JumpToBottomIndicator(JumpToBottomButtonState.copy$default(((FloatingIndicatorState.JumpToBottomIndicator) conversationClientState.getFloatingIndicatorState()).getJumpToBottomButtonState(), ((FloatingIndicatorState.JumpToBottomIndicator) conversationClientState.getFloatingIndicatorState()).getJumpToBottomButtonState().getUnreadMessages() + list.size(), 0, 0, 6, null)), r1);
        }
        Conversation conversation2 = conversationClientState.getConversation();
        List<Part> parts = conversation2 != null ? conversation2.parts() : null;
        if (parts == null) {
            parts = CollectionsKt.emptyList();
        }
        return TuplesKt.to(conversationClientState.getFloatingIndicatorState(), parts.size() == conversation.parts().size() ? conversationClientState.getNewMessageId() : null);
    }
}

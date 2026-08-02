package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecordOpenedInteractionUseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;", "", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;)V", "invoke", "", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "shouldRecordOpenedInteraction", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RecordOpenedInteractionUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    public RecordOpenedInteractionUseCase(ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.conversationRepository = conversationRepository;
    }

    public final void invoke(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        if (shouldRecordOpenedInteraction(conversation)) {
            this.conversationRepository.recordInteractions(conversation.getId(), new String[]{"opened"});
        }
    }

    private final boolean shouldRecordOpenedInteraction(Conversation conversation) {
        return CollectionsKt.listOf((Object[]) new String[]{NotificationStatuses.DELIVERED_STATUS, NotificationStatuses.RENOTIFYING_STATUS}).contains(conversation.getNotificationStatus());
    }
}

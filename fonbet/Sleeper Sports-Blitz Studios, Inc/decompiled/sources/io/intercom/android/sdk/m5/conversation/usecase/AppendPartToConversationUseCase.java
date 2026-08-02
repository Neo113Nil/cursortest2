package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: AppendPartToConversationUseCase.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/AppendPartToConversationUseCase;", "", "trackLastReceivedPartsUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;", "recordOpenedInteractionUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;)V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "partBuilder", "Lio/intercom/android/sdk/models/Part$Builder;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppendPartToConversationUseCase {
    public static final int $stable = 8;
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;

    public AppendPartToConversationUseCase(TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase) {
        Intrinsics.checkNotNullParameter(trackLastReceivedPartsUseCase, "trackLastReceivedPartsUseCase");
        Intrinsics.checkNotNullParameter(recordOpenedInteractionUseCase, "recordOpenedInteractionUseCase");
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
    }

    public final void invoke(MutableStateFlow<ConversationClientState> clientStateFlow, Part.Builder partBuilder) {
        Intrinsics.checkNotNullParameter(clientStateFlow, "clientStateFlow");
        Intrinsics.checkNotNullParameter(partBuilder, "partBuilder");
        Conversation conversation = clientStateFlow.getValue().getConversation();
        if (conversation == null) {
            return;
        }
        Conversation copy$default = Conversation.copy$default(conversation, null, false, null, CollectionsKt.plus((Collection<? extends Part.Builder>) conversation.getPartBuilderList(), partBuilder), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048567, null);
        Part part = (Part) CollectionsKt.last((List) copy$default.parts());
        List<Part> parts = conversation.parts();
        if (!(parts instanceof Collection) || !parts.isEmpty()) {
            for (Part part2 : parts) {
                if (Intrinsics.areEqual(part2.getId(), part.getId())) {
                    return;
                }
                String uuid = part.getUuid();
                Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                if (uuid.length() > 0 && Intrinsics.areEqual(part2.getUuid(), part.getUuid())) {
                    return;
                }
            }
        }
        this.trackLastReceivedPartsUseCase.invoke(copy$default);
        this.recordOpenedInteractionUseCase.invoke(copy$default);
        while (true) {
            ConversationClientState value = clientStateFlow.getValue();
            Conversation conversation2 = copy$default;
            if (clientStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, conversation2, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194293, null))) {
                return;
            } else {
                copy$default = conversation2;
            }
        }
    }
}

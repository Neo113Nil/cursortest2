package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: UpdateFloatingIndicatorUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0086\u0002¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/UpdateFloatingIndicatorUseCase;", "", "<init>", "()V", "invoke", "", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "conversationScrolledState", "Lio/intercom/android/sdk/m5/conversation/usecase/ConversationScrolledState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UpdateFloatingIndicatorUseCase {
    public static final int $stable = 0;

    public final void invoke(MutableStateFlow<ConversationClientState> clientState, ConversationScrolledState conversationScrolledState) {
        ConversationClientState value;
        ConversationClientState value2;
        ConversationClientState value3;
        ConversationClientState conversationClientState;
        String title;
        String subtitle;
        ArrayList emptyList;
        List<Avatar.Builder> avatars;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(conversationScrolledState, "conversationScrolledState");
        boolean scrolled = conversationScrolledState.getScrolled();
        Conversation conversation = clientState.getValue().getConversation();
        FooterNotice footerNotice = conversation != null ? conversation.getFooterNotice() : null;
        if (footerNotice != null && !conversationScrolledState.isLandscape() && !conversationScrolledState.isLargeFont()) {
            if (scrolled && !(clientState.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.FooterNoticeIndicator)) {
                do {
                    value3 = clientState.getValue();
                    conversationClientState = value3;
                    title = footerNotice.getTitle();
                    subtitle = footerNotice.getSubtitle();
                    if (subtitle == null) {
                        subtitle = "";
                    }
                    AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
                    if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        List<Avatar.Builder> list = avatars;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Avatar build = ((Avatar.Builder) it.next()).build();
                            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                            arrayList.add(new AvatarWrapper(build, false, 2, null));
                        }
                        emptyList = arrayList;
                    }
                } while (!clientState.compareAndSet(value3, ConversationClientState.copy$default(conversationClientState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, new FloatingIndicatorState.FooterNoticeIndicator(new FooterNoticeState(title, subtitle, emptyList)), null, false, false, null, null, 4128767, null)));
            }
        } else if (scrolled && !(clientState.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.JumpToBottomIndicator)) {
            do {
                value = clientState.getValue();
            } while (!clientState.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, new FloatingIndicatorState.JumpToBottomIndicator(new JumpToBottomButtonState(0, conversationScrolledState.getScrollToPosition(), conversationScrolledState.getLastSeenItemIndex(), 1, null)), null, false, false, null, null, 4128767, null)));
        }
        if (scrolled || (clientState.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.None)) {
            return;
        }
        do {
            value2 = clientState.getValue();
        } while (!clientState.compareAndSet(value2, ConversationClientState.copy$default(value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, FloatingIndicatorState.None.INSTANCE, null, false, false, null, null, 4128767, null)));
    }
}

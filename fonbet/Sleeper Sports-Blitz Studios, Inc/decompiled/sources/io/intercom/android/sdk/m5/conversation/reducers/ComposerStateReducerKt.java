package io.intercom.android.sdk.m5.conversation.reducers;

import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.PrivacyNotice;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposerStateReducer.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a8\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¨\u0006\u0014"}, d2 = {"reduceComposerState", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "clientState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/intercom/android/sdk/identity/AppConfig;", "isNewConversation", "", "reduceTextInputButtons", "", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "reduceBottomBadge", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "reduceTextInput", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "currentState", "placeholder", "", "isDisabled", "buttons", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposerStateReducerKt {

    /* compiled from: ComposerStateReducer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationEndedButton.Reason.values().length];
            try {
                iArr[ConversationEndedButton.Reason.MERGED_INTO_CONVERSATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final BottomBarUiState reduceComposerState(ConversationClientState clientState, AppConfig config, boolean z) {
        ComposerState.ConversationEnded.ConversationEndedCta conversationEndedCta;
        ComposerState.Hidden hidden;
        ComposerState.ConversationEnded copy$default;
        OpenMessengerResponse.NewConversationData newConversationData;
        io.intercom.android.sdk.models.ComposerState composerState;
        ComposerSuggestions composerSuggestions;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(config, "config");
        Conversation conversation = clientState.getConversation();
        boolean z2 = false;
        r3 = null;
        String str = null;
        if (conversation == null) {
            OpenMessengerResponse openMessengerResponse = clientState.getOpenMessengerResponse();
            if (openMessengerResponse != null && (composerSuggestions = openMessengerResponse.getComposerSuggestions()) != null && composerSuggestions.isComposerDisabled()) {
                hidden = new ComposerState.Hidden(false, 1, null);
            } else {
                ComposerState composerState2 = clientState.getComposerState();
                OpenMessengerResponse openMessengerResponse2 = clientState.getOpenMessengerResponse();
                if (openMessengerResponse2 != null && (composerState = openMessengerResponse2.getComposerState()) != null) {
                    str = composerState.getPlaceholder();
                }
                hidden = reduceTextInput(composerState2, z, str, false, reduceTextInputButtons(config));
            }
        } else {
            Object[] objArr = AppConfigExtensionsKt.canStartNewConversation(config) && !conversation.getInboundConversationsDisabled();
            OpenMessengerResponse openMessengerResponse3 = clientState.getOpenMessengerResponse();
            OpenMessengerResponse.NewConversationData.Cta cta = (openMessengerResponse3 == null || (newConversationData = openMessengerResponse3.getNewConversationData()) == null) ? null : newConversationData.getCta();
            if (!objArr == true || cta == null) {
                conversationEndedCta = null;
            } else {
                StringProvider.ActualString actualString = new StringProvider.ActualString(cta.getText());
                Integer icon = cta.getIcon().getIcon();
                conversationEndedCta = new ComposerState.ConversationEnded.ConversationEndedCta(actualString, icon != null ? icon.intValue() : R.drawable.intercom_send_message_icon, null, 4, null);
            }
            boolean isNull = ReactionReply.isNull(conversation.lastPart().getReactionReply());
            if (conversation.getPreventEndUserReplies()) {
                ComposerState.ConversationEnded conversationEnded = new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), conversationEndedCta);
                ConversationEndedButton conversationEndedButton = conversation.getConversationEndedButton();
                if (conversationEndedButton != null) {
                    if (WhenMappings.$EnumSwitchMapping$0[conversationEndedButton.getReason().ordinal()] == 1) {
                        copy$default = conversationEnded.copy(new StringProvider.ActualString(conversationEndedButton.getMessage()), conversationEndedButton.getMetadata() != null ? new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString(conversationEndedButton.getCtaTitle()), R.drawable.intercom_send_message_icon, conversationEndedButton.getMetadata().getMergedIntoConversationId()) : null);
                    } else {
                        copy$default = ComposerState.ConversationEnded.copy$default(conversationEnded, new StringProvider.ActualString(conversationEndedButton.getMessage()), null, 2, null);
                    }
                    if (copy$default != null) {
                        conversationEnded = copy$default;
                    }
                }
                hidden = conversationEnded;
            } else if (conversation.getComposerState().isVisible() && isNull) {
                hidden = reduceTextInput(clientState.getComposerState(), z, conversation.getComposerState().getPlaceholder(), conversation.getComposerState().isDisabled(), reduceTextInputButtons(config));
            } else if (!isNull) {
                ReactionReply reactionReply = conversation.lastPart().getReactionReply();
                Intrinsics.checkNotNullExpressionValue(reactionReply, "getReactionReply(...)");
                String id = conversation.lastPart().getId();
                Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                hidden = new ComposerState.Reactions(reactionReply, id, conversation.getId());
            } else {
                List<Part> parts = conversation.parts();
                if (!(parts instanceof Collection) || !parts.isEmpty()) {
                    Iterator<T> it = parts.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((Part) it.next()).getMessageStyle() == MessageStyle.ATTRIBUTE_COLLECTOR) {
                            z2 = true;
                            break;
                        }
                    }
                }
                hidden = new ComposerState.Hidden(!z2);
            }
        }
        return new BottomBarUiState(hidden, clientState.getCurrentlyTypingState(), new InputTypeState(config.getAttachmentSettings().getMediaEnabled(), config.getAttachmentSettings().getGifsEnabled(), config.getAttachmentSettings().getCameraEnabled(), config.getAttachmentSettings().getFilesEnabled(), config.getAttachmentSettings().getTrustedFileExtensions()), reduceBottomBadge(clientState));
    }

    private static final List<BottomBarUiState.BottomBarButton> reduceTextInputButtons(AppConfig appConfig) {
        List createListBuilder = CollectionsKt.createListBuilder();
        if (appConfig.getAttachmentSettings().getGifsEnabled()) {
            createListBuilder.add(BottomBarUiState.BottomBarButton.GifInsert.INSTANCE);
        }
        if (appConfig.getAttachmentSettings().getVoiceNotesEnabled()) {
            createListBuilder.add(BottomBarUiState.BottomBarButton.VoiceNotesInsert.INSTANCE);
        }
        if (appConfig.getAttachmentSettings().getMediaEnabled() || appConfig.getAttachmentSettings().getCameraEnabled() || appConfig.getAttachmentSettings().getFilesEnabled()) {
            createListBuilder.add(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE);
        }
        return CollectionsKt.build(createListBuilder);
    }

    private static final BottomBarUiState.BottomBadgeState reduceBottomBadge(ConversationClientState conversationClientState) {
        PoweredBy poweredBy;
        if (conversationClientState.getConversation() == null) {
            OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
            poweredBy = openMessengerResponse != null ? openMessengerResponse.getPoweredBy() : null;
        } else {
            poweredBy = conversationClientState.getConversation().getPoweredBy();
        }
        OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
        PrivacyNotice privacyNotice = openMessengerResponse2 != null ? openMessengerResponse2.getPrivacyNotice() : null;
        if (privacyNotice != null && !privacyNotice.isDismissed() && !conversationClientState.hasUserSentAMessage$intercom_sdk_base_release() && !conversationClientState.getDismissedPrivacyNotice()) {
            return new BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState(privacyNotice.getText());
        }
        if (poweredBy != null) {
            return new BottomBarUiState.BottomBadgeState.PoweredByBadgeState(poweredBy);
        }
        return BottomBarUiState.BottomBadgeState.None.INSTANCE;
    }

    private static final ComposerState reduceTextInput(ComposerState composerState, boolean z, String str, boolean z2, List<? extends BottomBarUiState.BottomBarButton> list) {
        StringProvider.StringRes stringRes;
        if (!(composerState instanceof ComposerState.TextInput)) {
            return composerState;
        }
        ComposerState.TextInput textInput = (ComposerState.TextInput) composerState;
        if (str != null) {
            stringRes = new StringProvider.ActualString(str);
        } else {
            stringRes = new StringProvider.StringRes(R.string.intercom_message_placeholder, null, 2, null);
        }
        return ComposerState.TextInput.copy$default(textInput, z ? textInput.getInitialMessage() : "", stringRes, z2, list, null, 16, null);
    }
}

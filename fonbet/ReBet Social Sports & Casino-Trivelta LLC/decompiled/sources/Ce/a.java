package Ce;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Ce.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0038a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[De.a.values().length];
            try {
                iArr[De.a.IsLoggerEnabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[De.a.AndroidChannel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[De.a.AppKey.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[De.a.AccessKey.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[De.a.VisitorName.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[De.a.VisitorEmail.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[De.a.VisitorPhone.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[De.a.CVUID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[De.a.ServerTime.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[De.a.SessionId.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[De.a.AnnonId.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[De.a.InstallationId.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[De.a.PnsKey.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[De.a.FcmToken.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[De.a.JwtRefreshToken.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[De.a.JwtAccessToken.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[De.a.JwtAccessTokenExpiryTime.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[De.a.JwtRefreshExpiryTime.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[De.a.ShowFeedbackAfterSkip.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[De.a.FeedbackValidityDuration.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[De.a.EnableDragDismissing.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[De.a.LauncherVisibilityMode.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[De.a.CustomLauncherVisibilityMode.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[De.a.KnowledgeBaseRecentlyViewedLimit.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[De.a.NotificationClickActionSource.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[De.a.DatabaseEncryptionPassPhrase.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[De.a.IsEncryptedSharedPreferenceFailureAcknowledged.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[De.a.JwtVisitorUniqueId.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[De.a.ChatComponentEndChat.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[De.a.ChatComponentEndChatWhenInQueue.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[De.a.ChatComponentEndChatWithBot.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[De.a.ChatComponentEndChatWithAgent.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[De.a.ChatComponentReopenChat.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[De.a.ChatComponentQueuePosition.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[De.a.ChatComponentCall.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[De.a.ChatComponentVoiceNoteWhenBotConnected.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[De.a.ChatComponentFileSharingWhenBotConnected.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[De.a.ChatComponentTakePhoto.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[De.a.ChatComponentRecordVideo.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[De.a.ChatComponentGallery.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[De.a.AppOnlinePreChatFormSyncTime.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[De.a.AppOfflinePreChatFormSyncTime.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[De.a.AppCallOnlinePreChatFormSyncTime.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[De.a.AppCallOfflinePreChatFormSyncTime.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[De.a.AppCallStatus.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[De.a.AppChatStatus.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[De.a.CallRecordingConsentAccepted.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[De.a.ConversationConsentAccepted.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[De.a.OngoingConversationContextAcknowledgementKey.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[De.a.OngoingConversationContextAppStatus.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[De.a.OngoingConversationContextRequestedMessages.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[De.a.IsOngoingConversationContextAutoReplyOn.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[De.a.ChatsPreChatForm.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[De.a.CallsPreChatForm.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[De.a.CallsQueuePosition.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[De.a.CallsOperatorImageVisibility.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[De.a.CallsOperatorNameVisibility.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[De.a.IsCampaignSuggestionsSubscribed.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[De.a.AppChatStatusSyncTime.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[De.a.AppCallStatusSyncTime.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[De.a.TriggerEncryptedVisitorInfo.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[De.a.TriggersAlarmsData.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[De.a.WidgetInteractionTriggerData.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(De.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (C0038a.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                return "is_logger_enabled";
            case 2:
                return "android_channel";
            case 3:
                return "salesiq_app_key";
            case 4:
                return "salesiq_access_key";
            case 5:
                return "unique_visitor_name";
            case 6:
                return "visitor_email";
            case 7:
                return "visitor_phone";
            case 8:
                return "cvuid";
            case 9:
                return "stime";
            case 10:
                return "sid";
            case 11:
                return "annonid";
            case 12:
                return "insid";
            case 13:
                return "pnskey";
            case 14:
                return "fcm_token";
            case 15:
                return "jwt_refresh_token";
            case 16:
                return "jwt_access_token";
            case 17:
                return "jwt_access_token_expiry_time";
            case 18:
                return "jwt_refresh_token_expiry";
            case 19:
                return "show_feedback_after_skip";
            case 20:
                return "feedback_validity_duration";
            case 21:
                return "enable_launcher_drag_dismissing";
            case 22:
                return "launcher_visibility_mode";
            case 23:
                return "custom_launcher_visibility_mode";
            case 24:
                return "knowledge_base_recently_viewed_limit";
            case 25:
                return "notification_click_action_source";
            case 26:
                return "database_passphrase";
            case 27:
                return "is_encrypted_shared_preference_failure_acknowledged";
            case 28:
                return "jwt_visitor_unique_id";
            case 29:
                return "chat_component_end_chat";
            case 30:
                return "chat_component_end_chat_when_in_queue";
            case 31:
                return "chat_component_end_chat_with_bot";
            case 32:
                return "chat_component_end_chat_with_agent";
            case 33:
            case 34:
                return "chat_component_reopen_chat";
            case 35:
                return "chat_component_call";
            case 36:
                return "chat_component_voice_note";
            case 37:
                return "chat_component_file_sharing";
            case 38:
                return "chat_component_take_photo";
            case 39:
                return "chat_component_record_video";
            case 40:
                return "chat_component_gallery";
            case 41:
                return "app_online_pre_chat_form_sync_time";
            case 42:
                return "app_offline_pre_chat_form_sync_time";
            case 43:
                return "app_call_online_pre_chat_form_sync_time";
            case 44:
                return "app_call_offline_pre_chat_form_sync_time";
            case 45:
                return "app_call_status";
            case 46:
                return "app_chat_status";
            case 47:
                return "call_recording_consent_accepted";
            case 48:
                return "chat_gdpr_consent";
            case 49:
                return "ongoing_conversation_context_acknowledgement_key";
            case 50:
                return "ongoing_conversation_context_app_status";
            case 51:
                return "ongoing_conversation_context_requested_messages";
            case 52:
                return "is_ongoing_conversation_context_auto_reply_on";
            case 53:
                return "prechat_form";
            case 54:
                return "calls_pre_chat_form";
            case 55:
                return "calls_queue_position";
            case 56:
                return "calls_operator_image_visibility";
            case 57:
                return "calls_operator_name_visibility";
            case 58:
                return "is_campaign_suggestions_subscribed";
            case 59:
                return "app_chat_status_sync_time";
            case 60:
                return "app_call_status_sync_time";
            case 61:
                return "trigger_encrypted_visitor_info";
            case 62:
                return "trigger_alarms_data";
            case 63:
                return "widget_interaction_trigger_data";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

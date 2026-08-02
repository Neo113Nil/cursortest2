package De;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a IsLoggerEnabled = new a("IsLoggerEnabled", 0);
    public static final a AndroidChannel = new a("AndroidChannel", 1);
    public static final a AppKey = new a("AppKey", 2);
    public static final a AccessKey = new a("AccessKey", 3);
    public static final a VisitorName = new a("VisitorName", 4);
    public static final a VisitorEmail = new a("VisitorEmail", 5);
    public static final a VisitorPhone = new a("VisitorPhone", 6);
    public static final a CVUID = new a("CVUID", 7);
    public static final a ServerTime = new a("ServerTime", 8);
    public static final a SessionId = new a("SessionId", 9);
    public static final a AnnonId = new a("AnnonId", 10);
    public static final a InstallationId = new a("InstallationId", 11);
    public static final a PnsKey = new a("PnsKey", 12);
    public static final a FcmToken = new a("FcmToken", 13);
    public static final a JwtRefreshToken = new a("JwtRefreshToken", 14);
    public static final a JwtAccessToken = new a("JwtAccessToken", 15);
    public static final a JwtAccessTokenExpiryTime = new a("JwtAccessTokenExpiryTime", 16);
    public static final a JwtRefreshExpiryTime = new a("JwtRefreshExpiryTime", 17);
    public static final a JwtVisitorUniqueId = new a("JwtVisitorUniqueId", 18);
    public static final a ShowFeedbackAfterSkip = new a("ShowFeedbackAfterSkip", 19);
    public static final a FeedbackValidityDuration = new a("FeedbackValidityDuration", 20);
    public static final a EnableDragDismissing = new a("EnableDragDismissing", 21);
    public static final a LauncherVisibilityMode = new a("LauncherVisibilityMode", 22);
    public static final a CustomLauncherVisibilityMode = new a("CustomLauncherVisibilityMode", 23);
    public static final a KnowledgeBaseRecentlyViewedLimit = new a("KnowledgeBaseRecentlyViewedLimit", 24);
    public static final a NotificationClickActionSource = new a("NotificationClickActionSource", 25);
    public static final a DatabaseEncryptionPassPhrase = new a("DatabaseEncryptionPassPhrase", 26);
    public static final a IsEncryptedSharedPreferenceFailureAcknowledged = new a("IsEncryptedSharedPreferenceFailureAcknowledged", 27);
    public static final a ChatComponentEndChat = new a("ChatComponentEndChat", 28);
    public static final a ChatComponentEndChatWhenInQueue = new a("ChatComponentEndChatWhenInQueue", 29);
    public static final a ChatComponentEndChatWithBot = new a("ChatComponentEndChatWithBot", 30);
    public static final a ChatComponentEndChatWithAgent = new a("ChatComponentEndChatWithAgent", 31);
    public static final a ChatComponentReopenChat = new a("ChatComponentReopenChat", 32);
    public static final a ChatComponentQueuePosition = new a("ChatComponentQueuePosition", 33);
    public static final a ChatComponentCall = new a("ChatComponentCall", 34);
    public static final a ChatComponentFileSharingWhenBotConnected = new a("ChatComponentFileSharingWhenBotConnected", 35);
    public static final a ChatComponentVoiceNoteWhenBotConnected = new a("ChatComponentVoiceNoteWhenBotConnected", 36);
    public static final a ChatComponentTakePhoto = new a("ChatComponentTakePhoto", 37);
    public static final a ChatComponentRecordVideo = new a("ChatComponentRecordVideo", 38);
    public static final a ChatComponentGallery = new a("ChatComponentGallery", 39);
    public static final a AppOnlinePreChatFormSyncTime = new a("AppOnlinePreChatFormSyncTime", 40);
    public static final a AppOfflinePreChatFormSyncTime = new a("AppOfflinePreChatFormSyncTime", 41);
    public static final a AppCallOnlinePreChatFormSyncTime = new a("AppCallOnlinePreChatFormSyncTime", 42);
    public static final a AppCallOfflinePreChatFormSyncTime = new a("AppCallOfflinePreChatFormSyncTime", 43);
    public static final a AppCallStatus = new a("AppCallStatus", 44);
    public static final a AppChatStatus = new a("AppChatStatus", 45);
    public static final a ConversationConsentAccepted = new a("ConversationConsentAccepted", 46);
    public static final a CallRecordingConsentAccepted = new a("CallRecordingConsentAccepted", 47);
    public static final a OngoingConversationContextAcknowledgementKey = new a("OngoingConversationContextAcknowledgementKey", 48);
    public static final a OngoingConversationContextAppStatus = new a("OngoingConversationContextAppStatus", 49);
    public static final a OngoingConversationContextRequestedMessages = new a("OngoingConversationContextRequestedMessages", 50);
    public static final a IsOngoingConversationContextAutoReplyOn = new a("IsOngoingConversationContextAutoReplyOn", 51);
    public static final a ChatsPreChatForm = new a("ChatsPreChatForm", 52);
    public static final a CallsPreChatForm = new a("CallsPreChatForm", 53);
    public static final a CallsQueuePosition = new a("CallsQueuePosition", 54);
    public static final a CallsOperatorImageVisibility = new a("CallsOperatorImageVisibility", 55);
    public static final a CallsOperatorNameVisibility = new a("CallsOperatorNameVisibility", 56);
    public static final a IsCampaignSuggestionsSubscribed = new a("IsCampaignSuggestionsSubscribed", 57);
    public static final a AppChatStatusSyncTime = new a("AppChatStatusSyncTime", 58);
    public static final a AppCallStatusSyncTime = new a("AppCallStatusSyncTime", 59);
    public static final a TriggerEncryptedVisitorInfo = new a("TriggerEncryptedVisitorInfo", 60);
    public static final a TriggersAlarmsData = new a("TriggersAlarmsData", 61);
    public static final a WidgetInteractionTriggerData = new a("WidgetInteractionTriggerData", 62);

    private static final /* synthetic */ a[] $values() {
        return new a[]{IsLoggerEnabled, AndroidChannel, AppKey, AccessKey, VisitorName, VisitorEmail, VisitorPhone, CVUID, ServerTime, SessionId, AnnonId, InstallationId, PnsKey, FcmToken, JwtRefreshToken, JwtAccessToken, JwtAccessTokenExpiryTime, JwtRefreshExpiryTime, JwtVisitorUniqueId, ShowFeedbackAfterSkip, FeedbackValidityDuration, EnableDragDismissing, LauncherVisibilityMode, CustomLauncherVisibilityMode, KnowledgeBaseRecentlyViewedLimit, NotificationClickActionSource, DatabaseEncryptionPassPhrase, IsEncryptedSharedPreferenceFailureAcknowledged, ChatComponentEndChat, ChatComponentEndChatWhenInQueue, ChatComponentEndChatWithBot, ChatComponentEndChatWithAgent, ChatComponentReopenChat, ChatComponentQueuePosition, ChatComponentCall, ChatComponentFileSharingWhenBotConnected, ChatComponentVoiceNoteWhenBotConnected, ChatComponentTakePhoto, ChatComponentRecordVideo, ChatComponentGallery, AppOnlinePreChatFormSyncTime, AppOfflinePreChatFormSyncTime, AppCallOnlinePreChatFormSyncTime, AppCallOfflinePreChatFormSyncTime, AppCallStatus, AppChatStatus, ConversationConsentAccepted, CallRecordingConsentAccepted, OngoingConversationContextAcknowledgementKey, OngoingConversationContextAppStatus, OngoingConversationContextRequestedMessages, IsOngoingConversationContextAutoReplyOn, ChatsPreChatForm, CallsPreChatForm, CallsQueuePosition, CallsOperatorImageVisibility, CallsOperatorNameVisibility, IsCampaignSuggestionsSubscribed, AppChatStatusSyncTime, AppCallStatusSyncTime, TriggerEncryptedVisitorInfo, TriggersAlarmsData, WidgetInteractionTriggerData};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private a(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}

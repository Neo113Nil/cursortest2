package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationClientState.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bG\b\u0081\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010)\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010T\u001a\u00020%H\u0000¢\u0006\u0002\bUJ\u0015\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010Y\u001a\u00020\nHÆ\u0003J\t\u0010Z\u001a\u00020\fHÆ\u0003J\t\u0010[\u001a\u00020\u000eHÆ\u0003J\t\u0010\\\u001a\u00020\u0010HÆ\u0003J\u0011\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010_\u001a\u00020\u0016HÆ\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018HÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018HÆ\u0003J\t\u0010b\u001a\u00020\u001bHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010d\u001a\u00020\u001fHÆ\u0003J\t\u0010e\u001a\u00020\u001fHÆ\u0003J\t\u0010f\u001a\u00020\"HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010h\u001a\u00020%HÆ\u0003J\t\u0010i\u001a\u00020%HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010(HÆ\u0003J\t\u0010k\u001a\u00020*HÆ\u0003J\u0091\u0002\u0010l\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020*HÇ\u0001J\u0013\u0010m\u001a\u00020%2\b\u0010n\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010o\u001a\u00020\u001fH×\u0001J\t\u0010p\u001a\u00020\u0004H×\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010 \u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010IR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b$\u0010NR\u0011\u0010&\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bO\u0010NR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bR\u0010S¨\u0006q"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "", "pendingMessages", "", "", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "conversationId", "currentlyTypingState", "Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "composerState", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "bottomSheetState", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "launchMode", "Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "lastNetworkCall", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "networkState", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "failedAttributeIdentifiers", "", "loadingAttributeIdentifiers", "finStreamingData", "Lio/intercom/android/sdk/m5/conversation/states/FinStreamingData;", "openMessengerResponse", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "unreadConversationsCount", "", "unreadTicketsCount", "floatingIndicatorState", "Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "newMessageId", "isConversationScrolled", "", "dismissedPrivacyNotice", "pushNotificationsBannerState", "Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;", "voiceTranscriptionState", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "<init>", "(Ljava/util/Map;Lio/intercom/android/sdk/models/Conversation;Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;Lio/intercom/android/sdk/m5/conversation/states/ComposerState;Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/m5/conversation/states/NetworkState;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/m5/conversation/states/FinStreamingData;Lio/intercom/android/sdk/models/OpenMessengerResponse;IILio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;Ljava/lang/String;ZZLio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;)V", "getPendingMessages", "()Ljava/util/Map;", "getConversation", "()Lio/intercom/android/sdk/models/Conversation;", "getConversationId", "()Ljava/lang/String;", "getCurrentlyTypingState", "()Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "getComposerState", "()Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "getBottomSheetState", "()Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "getLaunchMode", "()Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "getLastNetworkCall", "()Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "getArticleMetadata", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "getNetworkState", "()Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "getFailedAttributeIdentifiers", "()Ljava/util/List;", "getLoadingAttributeIdentifiers", "getFinStreamingData", "()Lio/intercom/android/sdk/m5/conversation/states/FinStreamingData;", "getOpenMessengerResponse", "()Lio/intercom/android/sdk/models/OpenMessengerResponse;", "getUnreadConversationsCount", "()I", "getUnreadTicketsCount", "getFloatingIndicatorState", "()Lio/intercom/android/sdk/m5/conversation/states/FloatingIndicatorState;", "getNewMessageId", "()Z", "getDismissedPrivacyNotice", "getPushNotificationsBannerState", "()Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;", "getVoiceTranscriptionState", "()Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "hasUserSentAMessage", "hasUserSentAMessage$intercom_sdk_base_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ConversationClientState {
    public static final int $stable = 8;
    private final ArticleMetadata articleMetadata;
    private final BottomSheetState bottomSheetState;
    private final ComposerState composerState;
    private final Conversation conversation;
    private final String conversationId;
    private final CurrentlyTypingState currentlyTypingState;
    private final boolean dismissedPrivacyNotice;
    private final List<String> failedAttributeIdentifiers;
    private final FinStreamingData finStreamingData;
    private final FloatingIndicatorState floatingIndicatorState;
    private final boolean isConversationScrolled;
    private final NetworkResponse<Object> lastNetworkCall;
    private final LaunchMode launchMode;
    private final List<String> loadingAttributeIdentifiers;
    private final NetworkState networkState;
    private final String newMessageId;
    private final OpenMessengerResponse openMessengerResponse;
    private final Map<String, PendingMessage> pendingMessages;
    private final PushNotificationsBannerState pushNotificationsBannerState;
    private final int unreadConversationsCount;
    private final int unreadTicketsCount;
    private final VoiceTranscriptionState voiceTranscriptionState;

    public ConversationClientState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194303, null);
    }

    public static /* synthetic */ ConversationClientState copy$default(ConversationClientState conversationClientState, Map map, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List list, List list2, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i, int i2, FloatingIndicatorState floatingIndicatorState, String str2, boolean z, boolean z2, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState, int i3, Object obj) {
        VoiceTranscriptionState voiceTranscriptionState2;
        PushNotificationsBannerState pushNotificationsBannerState2;
        Map map2 = (i3 & 1) != 0 ? conversationClientState.pendingMessages : map;
        Conversation conversation2 = (i3 & 2) != 0 ? conversationClientState.conversation : conversation;
        String str3 = (i3 & 4) != 0 ? conversationClientState.conversationId : str;
        CurrentlyTypingState currentlyTypingState2 = (i3 & 8) != 0 ? conversationClientState.currentlyTypingState : currentlyTypingState;
        ComposerState composerState2 = (i3 & 16) != 0 ? conversationClientState.composerState : composerState;
        BottomSheetState bottomSheetState2 = (i3 & 32) != 0 ? conversationClientState.bottomSheetState : bottomSheetState;
        LaunchMode launchMode2 = (i3 & 64) != 0 ? conversationClientState.launchMode : launchMode;
        NetworkResponse networkResponse2 = (i3 & 128) != 0 ? conversationClientState.lastNetworkCall : networkResponse;
        ArticleMetadata articleMetadata2 = (i3 & 256) != 0 ? conversationClientState.articleMetadata : articleMetadata;
        NetworkState networkState2 = (i3 & 512) != 0 ? conversationClientState.networkState : networkState;
        List list3 = (i3 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : list;
        List list4 = (i3 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : list2;
        FinStreamingData finStreamingData2 = (i3 & 4096) != 0 ? conversationClientState.finStreamingData : finStreamingData;
        OpenMessengerResponse openMessengerResponse2 = (i3 & 8192) != 0 ? conversationClientState.openMessengerResponse : openMessengerResponse;
        Map map3 = map2;
        int i4 = (i3 & 16384) != 0 ? conversationClientState.unreadConversationsCount : i;
        int i5 = (i3 & 32768) != 0 ? conversationClientState.unreadTicketsCount : i2;
        FloatingIndicatorState floatingIndicatorState2 = (i3 & 65536) != 0 ? conversationClientState.floatingIndicatorState : floatingIndicatorState;
        String str4 = (i3 & 131072) != 0 ? conversationClientState.newMessageId : str2;
        boolean z3 = (i3 & 262144) != 0 ? conversationClientState.isConversationScrolled : z;
        boolean z4 = (i3 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : z2;
        PushNotificationsBannerState pushNotificationsBannerState3 = (i3 & 1048576) != 0 ? conversationClientState.pushNotificationsBannerState : pushNotificationsBannerState;
        if ((i3 & 2097152) != 0) {
            pushNotificationsBannerState2 = pushNotificationsBannerState3;
            voiceTranscriptionState2 = conversationClientState.voiceTranscriptionState;
        } else {
            voiceTranscriptionState2 = voiceTranscriptionState;
            pushNotificationsBannerState2 = pushNotificationsBannerState3;
        }
        return conversationClientState.copy(map3, conversation2, str3, currentlyTypingState2, composerState2, bottomSheetState2, launchMode2, networkResponse2, articleMetadata2, networkState2, list3, list4, finStreamingData2, openMessengerResponse2, i4, i5, floatingIndicatorState2, str4, z3, z4, pushNotificationsBannerState2, voiceTranscriptionState2);
    }

    public final Map<String, PendingMessage> component1() {
        return this.pendingMessages;
    }

    /* renamed from: component10, reason: from getter */
    public final NetworkState getNetworkState() {
        return this.networkState;
    }

    public final List<String> component11() {
        return this.failedAttributeIdentifiers;
    }

    public final List<String> component12() {
        return this.loadingAttributeIdentifiers;
    }

    /* renamed from: component13, reason: from getter */
    public final FinStreamingData getFinStreamingData() {
        return this.finStreamingData;
    }

    /* renamed from: component14, reason: from getter */
    public final OpenMessengerResponse getOpenMessengerResponse() {
        return this.openMessengerResponse;
    }

    /* renamed from: component15, reason: from getter */
    public final int getUnreadConversationsCount() {
        return this.unreadConversationsCount;
    }

    /* renamed from: component16, reason: from getter */
    public final int getUnreadTicketsCount() {
        return this.unreadTicketsCount;
    }

    /* renamed from: component17, reason: from getter */
    public final FloatingIndicatorState getFloatingIndicatorState() {
        return this.floatingIndicatorState;
    }

    /* renamed from: component18, reason: from getter */
    public final String getNewMessageId() {
        return this.newMessageId;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsConversationScrolled() {
        return this.isConversationScrolled;
    }

    /* renamed from: component2, reason: from getter */
    public final Conversation getConversation() {
        return this.conversation;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getDismissedPrivacyNotice() {
        return this.dismissedPrivacyNotice;
    }

    /* renamed from: component21, reason: from getter */
    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    /* renamed from: component22, reason: from getter */
    public final VoiceTranscriptionState getVoiceTranscriptionState() {
        return this.voiceTranscriptionState;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component4, reason: from getter */
    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    /* renamed from: component5, reason: from getter */
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    /* renamed from: component6, reason: from getter */
    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* renamed from: component7, reason: from getter */
    public final LaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final NetworkResponse<Object> component8() {
        return this.lastNetworkCall;
    }

    /* renamed from: component9, reason: from getter */
    public final ArticleMetadata getArticleMetadata() {
        return this.articleMetadata;
    }

    public final ConversationClientState copy(Map<String, PendingMessage> pendingMessages, Conversation conversation, String conversationId, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse<? extends Object> lastNetworkCall, ArticleMetadata articleMetadata, NetworkState networkState, List<String> failedAttributeIdentifiers, List<String> loadingAttributeIdentifiers, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int unreadConversationsCount, int unreadTicketsCount, FloatingIndicatorState floatingIndicatorState, String newMessageId, boolean isConversationScrolled, boolean dismissedPrivacyNotice, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState) {
        Intrinsics.checkNotNullParameter(pendingMessages, "pendingMessages");
        Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(networkState, "networkState");
        Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(finStreamingData, "finStreamingData");
        Intrinsics.checkNotNullParameter(floatingIndicatorState, "floatingIndicatorState");
        Intrinsics.checkNotNullParameter(voiceTranscriptionState, "voiceTranscriptionState");
        return new ConversationClientState(pendingMessages, conversation, conversationId, currentlyTypingState, composerState, bottomSheetState, launchMode, lastNetworkCall, articleMetadata, networkState, failedAttributeIdentifiers, loadingAttributeIdentifiers, finStreamingData, openMessengerResponse, unreadConversationsCount, unreadTicketsCount, floatingIndicatorState, newMessageId, isConversationScrolled, dismissedPrivacyNotice, pushNotificationsBannerState, voiceTranscriptionState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationClientState)) {
            return false;
        }
        ConversationClientState conversationClientState = (ConversationClientState) other;
        return Intrinsics.areEqual(this.pendingMessages, conversationClientState.pendingMessages) && Intrinsics.areEqual(this.conversation, conversationClientState.conversation) && Intrinsics.areEqual(this.conversationId, conversationClientState.conversationId) && Intrinsics.areEqual(this.currentlyTypingState, conversationClientState.currentlyTypingState) && Intrinsics.areEqual(this.composerState, conversationClientState.composerState) && Intrinsics.areEqual(this.bottomSheetState, conversationClientState.bottomSheetState) && this.launchMode == conversationClientState.launchMode && Intrinsics.areEqual(this.lastNetworkCall, conversationClientState.lastNetworkCall) && Intrinsics.areEqual(this.articleMetadata, conversationClientState.articleMetadata) && Intrinsics.areEqual(this.networkState, conversationClientState.networkState) && Intrinsics.areEqual(this.failedAttributeIdentifiers, conversationClientState.failedAttributeIdentifiers) && Intrinsics.areEqual(this.loadingAttributeIdentifiers, conversationClientState.loadingAttributeIdentifiers) && Intrinsics.areEqual(this.finStreamingData, conversationClientState.finStreamingData) && Intrinsics.areEqual(this.openMessengerResponse, conversationClientState.openMessengerResponse) && this.unreadConversationsCount == conversationClientState.unreadConversationsCount && this.unreadTicketsCount == conversationClientState.unreadTicketsCount && Intrinsics.areEqual(this.floatingIndicatorState, conversationClientState.floatingIndicatorState) && Intrinsics.areEqual(this.newMessageId, conversationClientState.newMessageId) && this.isConversationScrolled == conversationClientState.isConversationScrolled && this.dismissedPrivacyNotice == conversationClientState.dismissedPrivacyNotice && Intrinsics.areEqual(this.pushNotificationsBannerState, conversationClientState.pushNotificationsBannerState) && Intrinsics.areEqual(this.voiceTranscriptionState, conversationClientState.voiceTranscriptionState);
    }

    public int hashCode() {
        int hashCode = this.pendingMessages.hashCode() * 31;
        Conversation conversation = this.conversation;
        int hashCode2 = (hashCode + (conversation == null ? 0 : conversation.hashCode())) * 31;
        String str = this.conversationId;
        int hashCode3 = (((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.currentlyTypingState.hashCode()) * 31) + this.composerState.hashCode()) * 31) + this.bottomSheetState.hashCode()) * 31) + this.launchMode.hashCode()) * 31;
        NetworkResponse<Object> networkResponse = this.lastNetworkCall;
        int hashCode4 = (hashCode3 + (networkResponse == null ? 0 : networkResponse.hashCode())) * 31;
        ArticleMetadata articleMetadata = this.articleMetadata;
        int hashCode5 = (((((((((hashCode4 + (articleMetadata == null ? 0 : articleMetadata.hashCode())) * 31) + this.networkState.hashCode()) * 31) + this.failedAttributeIdentifiers.hashCode()) * 31) + this.loadingAttributeIdentifiers.hashCode()) * 31) + this.finStreamingData.hashCode()) * 31;
        OpenMessengerResponse openMessengerResponse = this.openMessengerResponse;
        int hashCode6 = (((((((hashCode5 + (openMessengerResponse == null ? 0 : openMessengerResponse.hashCode())) * 31) + Integer.hashCode(this.unreadConversationsCount)) * 31) + Integer.hashCode(this.unreadTicketsCount)) * 31) + this.floatingIndicatorState.hashCode()) * 31;
        String str2 = this.newMessageId;
        int hashCode7 = (((((hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isConversationScrolled)) * 31) + Boolean.hashCode(this.dismissedPrivacyNotice)) * 31;
        PushNotificationsBannerState pushNotificationsBannerState = this.pushNotificationsBannerState;
        return ((hashCode7 + (pushNotificationsBannerState != null ? pushNotificationsBannerState.hashCode() : 0)) * 31) + this.voiceTranscriptionState.hashCode();
    }

    public String toString() {
        return "ConversationClientState(pendingMessages=" + this.pendingMessages + ", conversation=" + this.conversation + ", conversationId=" + this.conversationId + ", currentlyTypingState=" + this.currentlyTypingState + ", composerState=" + this.composerState + ", bottomSheetState=" + this.bottomSheetState + ", launchMode=" + this.launchMode + ", lastNetworkCall=" + this.lastNetworkCall + ", articleMetadata=" + this.articleMetadata + ", networkState=" + this.networkState + ", failedAttributeIdentifiers=" + this.failedAttributeIdentifiers + ", loadingAttributeIdentifiers=" + this.loadingAttributeIdentifiers + ", finStreamingData=" + this.finStreamingData + ", openMessengerResponse=" + this.openMessengerResponse + ", unreadConversationsCount=" + this.unreadConversationsCount + ", unreadTicketsCount=" + this.unreadTicketsCount + ", floatingIndicatorState=" + this.floatingIndicatorState + ", newMessageId=" + this.newMessageId + ", isConversationScrolled=" + this.isConversationScrolled + ", dismissedPrivacyNotice=" + this.dismissedPrivacyNotice + ", pushNotificationsBannerState=" + this.pushNotificationsBannerState + ", voiceTranscriptionState=" + this.voiceTranscriptionState + ')';
    }

    public ConversationClientState(Map<String, PendingMessage> pendingMessages, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse<? extends Object> networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List<String> failedAttributeIdentifiers, List<String> loadingAttributeIdentifiers, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i, int i2, FloatingIndicatorState floatingIndicatorState, String str2, boolean z, boolean z2, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState) {
        Intrinsics.checkNotNullParameter(pendingMessages, "pendingMessages");
        Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(networkState, "networkState");
        Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(finStreamingData, "finStreamingData");
        Intrinsics.checkNotNullParameter(floatingIndicatorState, "floatingIndicatorState");
        Intrinsics.checkNotNullParameter(voiceTranscriptionState, "voiceTranscriptionState");
        this.pendingMessages = pendingMessages;
        this.conversation = conversation;
        this.conversationId = str;
        this.currentlyTypingState = currentlyTypingState;
        this.composerState = composerState;
        this.bottomSheetState = bottomSheetState;
        this.launchMode = launchMode;
        this.lastNetworkCall = networkResponse;
        this.articleMetadata = articleMetadata;
        this.networkState = networkState;
        this.failedAttributeIdentifiers = failedAttributeIdentifiers;
        this.loadingAttributeIdentifiers = loadingAttributeIdentifiers;
        this.finStreamingData = finStreamingData;
        this.openMessengerResponse = openMessengerResponse;
        this.unreadConversationsCount = i;
        this.unreadTicketsCount = i2;
        this.floatingIndicatorState = floatingIndicatorState;
        this.newMessageId = str2;
        this.isConversationScrolled = z;
        this.dismissedPrivacyNotice = z2;
        this.pushNotificationsBannerState = pushNotificationsBannerState;
        this.voiceTranscriptionState = voiceTranscriptionState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConversationClientState(Map map, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List list, List list2, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i, int i2, FloatingIndicatorState floatingIndicatorState, String str2, boolean z, boolean z2, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r46, r2, r4, r6, r5, r7, r8, r9, r10, r11, r12, r13, r14, (i3 & 8192) != 0 ? null : openMessengerResponse, (i3 & 16384) != 0 ? 0 : i, (i3 & 32768) != 0 ? 0 : i2, (i3 & 65536) != 0 ? FloatingIndicatorState.None.INSTANCE : floatingIndicatorState, (i3 & 131072) != 0 ? null : str2, (i3 & 262144) != 0 ? false : z, (i3 & 524288) == 0 ? z2 : false, (i3 & 1048576) != 0 ? null : pushNotificationsBannerState, (i3 & 2097152) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState);
        Map map2;
        FinStreamingData finStreamingData2;
        Map emptyMap = (i3 & 1) != 0 ? MapsKt.emptyMap() : map;
        Conversation conversation2 = (i3 & 2) != 0 ? null : conversation;
        String str3 = (i3 & 4) != 0 ? null : str;
        CurrentlyTypingState currentlyTypingState2 = (i3 & 8) != 0 ? new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null) : currentlyTypingState;
        ComposerState.TextInput textInput = (i3 & 16) != 0 ? new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, null, 28, null) : composerState;
        BottomSheetState.Empty empty = (i3 & 32) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState;
        LaunchMode launchMode2 = (i3 & 64) != 0 ? LaunchMode.CLASSIC : launchMode;
        NetworkResponse networkResponse2 = (i3 & 128) != 0 ? null : networkResponse;
        ArticleMetadata articleMetadata2 = (i3 & 256) != 0 ? null : articleMetadata;
        NetworkState.Connected connected = (i3 & 512) != 0 ? NetworkState.Connected.INSTANCE : networkState;
        List emptyList = (i3 & 1024) != 0 ? CollectionsKt.emptyList() : list;
        List emptyList2 = (i3 & 2048) != 0 ? CollectionsKt.emptyList() : list2;
        if ((i3 & 4096) != 0) {
            map2 = emptyMap;
            finStreamingData2 = new FinStreamingData(false, CollectionsKt.emptyList(), "", 0);
        } else {
            map2 = emptyMap;
            finStreamingData2 = finStreamingData;
        }
    }

    public final Map<String, PendingMessage> getPendingMessages() {
        return this.pendingMessages;
    }

    public final Conversation getConversation() {
        return this.conversation;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final LaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final NetworkResponse<Object> getLastNetworkCall() {
        return this.lastNetworkCall;
    }

    public final ArticleMetadata getArticleMetadata() {
        return this.articleMetadata;
    }

    public final NetworkState getNetworkState() {
        return this.networkState;
    }

    public final List<String> getFailedAttributeIdentifiers() {
        return this.failedAttributeIdentifiers;
    }

    public final List<String> getLoadingAttributeIdentifiers() {
        return this.loadingAttributeIdentifiers;
    }

    public final FinStreamingData getFinStreamingData() {
        return this.finStreamingData;
    }

    public final OpenMessengerResponse getOpenMessengerResponse() {
        return this.openMessengerResponse;
    }

    public final int getUnreadConversationsCount() {
        return this.unreadConversationsCount;
    }

    public final int getUnreadTicketsCount() {
        return this.unreadTicketsCount;
    }

    public final FloatingIndicatorState getFloatingIndicatorState() {
        return this.floatingIndicatorState;
    }

    public final String getNewMessageId() {
        return this.newMessageId;
    }

    public final boolean isConversationScrolled() {
        return this.isConversationScrolled;
    }

    public final boolean getDismissedPrivacyNotice() {
        return this.dismissedPrivacyNotice;
    }

    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    public final VoiceTranscriptionState getVoiceTranscriptionState() {
        return this.voiceTranscriptionState;
    }

    public final boolean hasUserSentAMessage$intercom_sdk_base_release() {
        List<Part> parts;
        if (!this.pendingMessages.isEmpty()) {
            return true;
        }
        Conversation conversation = this.conversation;
        if (conversation != null && (parts = conversation.parts()) != null) {
            List<Part> list = parts;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Part) it.next()).isUser()) {
                    return true;
                }
            }
        }
        return false;
    }
}

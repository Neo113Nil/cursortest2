package io.intercom.android.sdk.models;

import androidx.media3.common.C;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.nexus.NexusConfig;
import io.sentry.SentryEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Config.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b*\b\u0081\b\u0018\u0000 |2\u00020\u0001:\u0001|Bã\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020\u000b\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u000bHÆ\u0003J\t\u0010^\u001a\u00020\u000bHÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u000bHÆ\u0003J\t\u0010a\u001a\u00020\u000bHÆ\u0003J\t\u0010b\u001a\u00020\u000bHÆ\u0003J\t\u0010c\u001a\u00020\u000bHÆ\u0003J\t\u0010d\u001a\u00020\u0013HÂ\u0003J\t\u0010e\u001a\u00020\u0015HÆ\u0003J\t\u0010f\u001a\u00020\u0013HÂ\u0003J\t\u0010g\u001a\u00020\u0013HÂ\u0003J\t\u0010h\u001a\u00020\u0013HÂ\u0003J\t\u0010i\u001a\u00020\u001aHÂ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dHÆ\u0003J\t\u0010m\u001a\u00020\u000bHÆ\u0003J\t\u0010n\u001a\u00020\u000bHÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\t\u0010p\u001a\u00020\u000bHÆ\u0003J\t\u0010q\u001a\u00020\u000bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010%HÆ\u0003J\t\u0010s\u001a\u00020'HÆ\u0003J\t\u0010t\u001a\u00020\u000bHÆ\u0003J\t\u0010u\u001a\u00020*HÆ\u0003J\t\u0010v\u001a\u00020\u000bHÆ\u0003Jå\u0002\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\u000bHÇ\u0001J\u0013\u0010x\u001a\u00020\u000b2\b\u0010y\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010z\u001a\u00020\u0015H×\u0001J\t\u0010{\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u00106R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u00106R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u00106R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u00106R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u00106R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u00106R\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u00106R\u0010\u0010\u0012\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0010\u0010\u0016\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0016\u0010\u001f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0016\u0010 \u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0016\u0010!\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0016\u0010\"\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00106R\u0016\u0010#\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0018\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010&\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010(\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u00106R\u0016\u0010)\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0016\u0010+\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0011\u0010I\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010L\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0011\u0010N\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bO\u0010KR\u0011\u0010P\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bQ\u0010KR\u0011\u0010R\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006}"}, d2 = {"Lio/intercom/android/sdk/models/Config;", "", "name", "", "primaryColor", "secondaryColor", "locale", "helpCenterLocale", "launcherLogoUrl", "teamGreeting", "isFirstRequest", "", "isInboundMessages", "isAudioEnabled", "isMetricsEnabled", "isBackgroundRequestsEnabled", "isPrimaryColorRenderDarkText", "isSecondaryColorRenderDarkText", "_rateLimitPeriodSeconds", "", "rateLimitCount", "", "_userUpdateCacheMaxAgeSeconds", "_softResetTimeoutSeconds", "_newSessionThresholdSeconds", "_realTimeConfigBuilder", "Lio/intercom/android/nexus/NexusConfig$Builder;", "helpCenterUrl", "helpCenterUrls", "", "features", "identityVerificationEnabled", "accessToTeammateEnabled", "helpCenterRequireSearch", "preventMultipleInboundConversationsEnabled", "hasOpenConversations", SentryEvent.JsonKeys.MODULES, "Lio/intercom/android/sdk/models/ConfigModules;", "attachmentSettings", "Lio/intercom/android/sdk/models/AttachmentSettings;", "isArticleAutoReactionEnabled", "conversationStateSyncSettings", "Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "askUsersToAllowNotifications", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZJIJJJLio/intercom/android/nexus/NexusConfig$Builder;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;ZZZZZLio/intercom/android/sdk/models/ConfigModules;Lio/intercom/android/sdk/models/AttachmentSettings;ZLio/intercom/android/sdk/models/ConversationStateSyncSettings;Z)V", "getName", "()Ljava/lang/String;", "getPrimaryColor", "getSecondaryColor", "getLocale", "getHelpCenterLocale", "getLauncherLogoUrl", "getTeamGreeting", "()Z", "getRateLimitCount", "()I", "getHelpCenterUrl", "getHelpCenterUrls", "()Ljava/util/Set;", "getFeatures", "getIdentityVerificationEnabled", "getAccessToTeammateEnabled", "getHelpCenterRequireSearch", "getPreventMultipleInboundConversationsEnabled", "getHasOpenConversations", "getModules", "()Lio/intercom/android/sdk/models/ConfigModules;", "getAttachmentSettings", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "getConversationStateSyncSettings", "()Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "getAskUsersToAllowNotifications", "rateLimitPeriod", "getRateLimitPeriod", "()J", "userUpdateCacheMaxAge", "getUserUpdateCacheMaxAge", "softResetTimeout", "getSoftResetTimeout", "newSessionThreshold", "getNewSessionThreshold", "realTimeConfig", "Lio/intercom/android/nexus/NexusConfig;", "getRealTimeConfig", "()Lio/intercom/android/nexus/NexusConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Config {
    public static final long DEFAULT_CACHE_MAX_AGE_SECONDS = 300;
    public static final int DEFAULT_RATE_LIMIT_COUNT = 100;
    public static final long DEFAULT_RATE_LIMIT_PERIOD_SECONDS = 60;
    public static final long DEFAULT_SESSION_TIMEOUT_SECONDS = 20;
    public static final long DEFAULT_SOFT_RESET_TIMEOUT_SECONDS = 1;

    @SerializedName("new_session_threshold")
    private final long _newSessionThresholdSeconds;

    @SerializedName("local_rate_limit_period")
    private final long _rateLimitPeriodSeconds;

    @SerializedName("real_time_config")
    private final NexusConfig.Builder _realTimeConfigBuilder;

    @SerializedName("soft_reset_timeout")
    private final long _softResetTimeoutSeconds;

    @SerializedName("user_update_dup_cache_max_age")
    private final long _userUpdateCacheMaxAgeSeconds;

    @SerializedName("access_to_teammate_enabled")
    private final boolean accessToTeammateEnabled;

    @SerializedName("ask_users_to_allow_notifications_android")
    private final boolean askUsersToAllowNotifications;

    @SerializedName("attachment_settings")
    private final AttachmentSettings attachmentSettings;

    @SerializedName("conversation_state_sync_settings")
    private final ConversationStateSyncSettings conversationStateSyncSettings;

    @SerializedName("features")
    private final Set<String> features;

    @SerializedName("has_open_conversations")
    private final boolean hasOpenConversations;

    @SerializedName("help_center_locale")
    private final String helpCenterLocale;

    @SerializedName("help_center_require_search")
    private final boolean helpCenterRequireSearch;

    @SerializedName("help_center_url")
    private final String helpCenterUrl;

    @SerializedName("help_center_urls")
    private final Set<String> helpCenterUrls;

    @SerializedName("identity_verification_enabled")
    private final boolean identityVerificationEnabled;

    @SerializedName("article_auto_reaction_enabled")
    private final boolean isArticleAutoReactionEnabled;

    @SerializedName("audio_enabled")
    private final boolean isAudioEnabled;

    @SerializedName("background_requests_enabled")
    private final boolean isBackgroundRequestsEnabled;

    @SerializedName("is_first_request")
    private final boolean isFirstRequest;

    @SerializedName("inbound_messages")
    private final boolean isInboundMessages;

    @SerializedName("metrics_enabled")
    private final boolean isMetricsEnabled;

    @SerializedName("primary_color_render_dark_text")
    private final boolean isPrimaryColorRenderDarkText;

    @SerializedName("secondary_color_render_dark_text")
    private final boolean isSecondaryColorRenderDarkText;

    @SerializedName("launcher_logo_url")
    private final String launcherLogoUrl;
    private final String locale;

    @SerializedName(SentryEvent.JsonKeys.MODULES)
    private final ConfigModules modules;
    private final String name;

    @SerializedName("prevent_multiple_inbound_conversations_enabled")
    private final boolean preventMultipleInboundConversationsEnabled;

    @SerializedName("base_color")
    private final String primaryColor;

    @SerializedName("local_rate_limit")
    private final int rateLimitCount;

    @SerializedName("secondary_color")
    private final String secondaryColor;

    @SerializedName("team_greeting")
    private final String teamGreeting;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Config NULL = new Config(null, null, null, null, null, null, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, null, null, null, null, false, false, false, false, false, null, null, false, null, false, -1, 1, null);

    public Config() {
        this(null, null, null, null, null, null, null, false, false, false, false, false, false, false, 0L, 0, 0L, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, false, null, false, -1, 1, null);
    }

    /* renamed from: component15, reason: from getter */
    private final long get_rateLimitPeriodSeconds() {
        return this._rateLimitPeriodSeconds;
    }

    /* renamed from: component17, reason: from getter */
    private final long get_userUpdateCacheMaxAgeSeconds() {
        return this._userUpdateCacheMaxAgeSeconds;
    }

    /* renamed from: component18, reason: from getter */
    private final long get_softResetTimeoutSeconds() {
        return this._softResetTimeoutSeconds;
    }

    /* renamed from: component19, reason: from getter */
    private final long get_newSessionThresholdSeconds() {
        return this._newSessionThresholdSeconds;
    }

    /* renamed from: component20, reason: from getter */
    private final NexusConfig.Builder get_realTimeConfigBuilder() {
        return this._realTimeConfigBuilder;
    }

    public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, int i, long j2, long j3, long j4, NexusConfig.Builder builder, String str8, Set set, Set set2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, int i2, int i3, Object obj) {
        boolean z15;
        ConversationStateSyncSettings conversationStateSyncSettings2;
        String str9 = (i2 & 1) != 0 ? config.name : str;
        String str10 = (i2 & 2) != 0 ? config.primaryColor : str2;
        String str11 = (i2 & 4) != 0 ? config.secondaryColor : str3;
        String str12 = (i2 & 8) != 0 ? config.locale : str4;
        String str13 = (i2 & 16) != 0 ? config.helpCenterLocale : str5;
        String str14 = (i2 & 32) != 0 ? config.launcherLogoUrl : str6;
        String str15 = (i2 & 64) != 0 ? config.teamGreeting : str7;
        boolean z16 = (i2 & 128) != 0 ? config.isFirstRequest : z;
        boolean z17 = (i2 & 256) != 0 ? config.isInboundMessages : z2;
        boolean z18 = (i2 & 512) != 0 ? config.isAudioEnabled : z3;
        boolean z19 = (i2 & 1024) != 0 ? config.isMetricsEnabled : z4;
        boolean z20 = (i2 & 2048) != 0 ? config.isBackgroundRequestsEnabled : z5;
        boolean z21 = (i2 & 4096) != 0 ? config.isPrimaryColorRenderDarkText : z6;
        boolean z22 = (i2 & 8192) != 0 ? config.isSecondaryColorRenderDarkText : z7;
        String str16 = str9;
        long j5 = (i2 & 16384) != 0 ? config._rateLimitPeriodSeconds : j;
        int i4 = (i2 & 32768) != 0 ? config.rateLimitCount : i;
        long j6 = (i2 & 65536) != 0 ? config._userUpdateCacheMaxAgeSeconds : j2;
        long j7 = (i2 & 131072) != 0 ? config._softResetTimeoutSeconds : j3;
        long j8 = (i2 & 262144) != 0 ? config._newSessionThresholdSeconds : j4;
        NexusConfig.Builder builder2 = (i2 & 524288) != 0 ? config._realTimeConfigBuilder : builder;
        String str17 = (i2 & 1048576) != 0 ? config.helpCenterUrl : str8;
        NexusConfig.Builder builder3 = builder2;
        Set set3 = (i2 & 2097152) != 0 ? config.helpCenterUrls : set;
        Set set4 = (i2 & 4194304) != 0 ? config.features : set2;
        boolean z23 = (i2 & 8388608) != 0 ? config.identityVerificationEnabled : z8;
        boolean z24 = (i2 & 16777216) != 0 ? config.accessToTeammateEnabled : z9;
        boolean z25 = (i2 & 33554432) != 0 ? config.helpCenterRequireSearch : z10;
        boolean z26 = (i2 & 67108864) != 0 ? config.preventMultipleInboundConversationsEnabled : z11;
        boolean z27 = (i2 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? config.hasOpenConversations : z12;
        ConfigModules configModules2 = (i2 & 268435456) != 0 ? config.modules : configModules;
        AttachmentSettings attachmentSettings2 = (i2 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? config.attachmentSettings : attachmentSettings;
        boolean z28 = (i2 & 1073741824) != 0 ? config.isArticleAutoReactionEnabled : z13;
        ConversationStateSyncSettings conversationStateSyncSettings3 = (i2 & Integer.MIN_VALUE) != 0 ? config.conversationStateSyncSettings : conversationStateSyncSettings;
        if ((i3 & 1) != 0) {
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
            z15 = config.askUsersToAllowNotifications;
        } else {
            z15 = z14;
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
        }
        return config.copy(str16, str10, str11, str12, str13, str14, str15, z16, z17, z18, z19, z20, z21, z22, j5, i4, j6, j7, j8, builder3, str17, set3, set4, z23, z24, z25, z26, z27, configModules2, attachmentSettings2, z28, conversationStateSyncSettings2, z15);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsAudioEnabled() {
        return this.isAudioEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    /* renamed from: component16, reason: from getter */
    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    /* renamed from: component21, reason: from getter */
    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> component22() {
        return this.helpCenterUrls;
    }

    public final Set<String> component23() {
        return this.features;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIdentityVerificationEnabled() {
        return this.identityVerificationEnabled;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getAccessToTeammateEnabled() {
        return this.accessToTeammateEnabled;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getHelpCenterRequireSearch() {
        return this.helpCenterRequireSearch;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getPreventMultipleInboundConversationsEnabled() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    /* renamed from: component29, reason: from getter */
    public final ConfigModules getModules() {
        return this.modules;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    /* renamed from: component30, reason: from getter */
    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsArticleAutoReactionEnabled() {
        return this.isArticleAutoReactionEnabled;
    }

    /* renamed from: component32, reason: from getter */
    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsFirstRequest() {
        return this.isFirstRequest;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsInboundMessages() {
        return this.isInboundMessages;
    }

    public final Config copy(String name, String primaryColor, String secondaryColor, String locale, String helpCenterLocale, String launcherLogoUrl, String teamGreeting, boolean isFirstRequest, boolean isInboundMessages, boolean isAudioEnabled, boolean isMetricsEnabled, boolean isBackgroundRequestsEnabled, boolean isPrimaryColorRenderDarkText, boolean isSecondaryColorRenderDarkText, long _rateLimitPeriodSeconds, int rateLimitCount, long _userUpdateCacheMaxAgeSeconds, long _softResetTimeoutSeconds, long _newSessionThresholdSeconds, NexusConfig.Builder _realTimeConfigBuilder, String helpCenterUrl, Set<String> helpCenterUrls, Set<String> features, boolean identityVerificationEnabled, boolean accessToTeammateEnabled, boolean helpCenterRequireSearch, boolean preventMultipleInboundConversationsEnabled, boolean hasOpenConversations, ConfigModules modules, AttachmentSettings attachmentSettings, boolean isArticleAutoReactionEnabled, ConversationStateSyncSettings conversationStateSyncSettings, boolean askUsersToAllowNotifications) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(helpCenterLocale, "helpCenterLocale");
        Intrinsics.checkNotNullParameter(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.checkNotNullParameter(teamGreeting, "teamGreeting");
        Intrinsics.checkNotNullParameter(_realTimeConfigBuilder, "_realTimeConfigBuilder");
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        Intrinsics.checkNotNullParameter(conversationStateSyncSettings, "conversationStateSyncSettings");
        return new Config(name, primaryColor, secondaryColor, locale, helpCenterLocale, launcherLogoUrl, teamGreeting, isFirstRequest, isInboundMessages, isAudioEnabled, isMetricsEnabled, isBackgroundRequestsEnabled, isPrimaryColorRenderDarkText, isSecondaryColorRenderDarkText, _rateLimitPeriodSeconds, rateLimitCount, _userUpdateCacheMaxAgeSeconds, _softResetTimeoutSeconds, _newSessionThresholdSeconds, _realTimeConfigBuilder, helpCenterUrl, helpCenterUrls, features, identityVerificationEnabled, accessToTeammateEnabled, helpCenterRequireSearch, preventMultipleInboundConversationsEnabled, hasOpenConversations, modules, attachmentSettings, isArticleAutoReactionEnabled, conversationStateSyncSettings, askUsersToAllowNotifications);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return Intrinsics.areEqual(this.name, config.name) && Intrinsics.areEqual(this.primaryColor, config.primaryColor) && Intrinsics.areEqual(this.secondaryColor, config.secondaryColor) && Intrinsics.areEqual(this.locale, config.locale) && Intrinsics.areEqual(this.helpCenterLocale, config.helpCenterLocale) && Intrinsics.areEqual(this.launcherLogoUrl, config.launcherLogoUrl) && Intrinsics.areEqual(this.teamGreeting, config.teamGreeting) && this.isFirstRequest == config.isFirstRequest && this.isInboundMessages == config.isInboundMessages && this.isAudioEnabled == config.isAudioEnabled && this.isMetricsEnabled == config.isMetricsEnabled && this.isBackgroundRequestsEnabled == config.isBackgroundRequestsEnabled && this.isPrimaryColorRenderDarkText == config.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == config.isSecondaryColorRenderDarkText && this._rateLimitPeriodSeconds == config._rateLimitPeriodSeconds && this.rateLimitCount == config.rateLimitCount && this._userUpdateCacheMaxAgeSeconds == config._userUpdateCacheMaxAgeSeconds && this._softResetTimeoutSeconds == config._softResetTimeoutSeconds && this._newSessionThresholdSeconds == config._newSessionThresholdSeconds && Intrinsics.areEqual(this._realTimeConfigBuilder, config._realTimeConfigBuilder) && Intrinsics.areEqual(this.helpCenterUrl, config.helpCenterUrl) && Intrinsics.areEqual(this.helpCenterUrls, config.helpCenterUrls) && Intrinsics.areEqual(this.features, config.features) && this.identityVerificationEnabled == config.identityVerificationEnabled && this.accessToTeammateEnabled == config.accessToTeammateEnabled && this.helpCenterRequireSearch == config.helpCenterRequireSearch && this.preventMultipleInboundConversationsEnabled == config.preventMultipleInboundConversationsEnabled && this.hasOpenConversations == config.hasOpenConversations && Intrinsics.areEqual(this.modules, config.modules) && Intrinsics.areEqual(this.attachmentSettings, config.attachmentSettings) && this.isArticleAutoReactionEnabled == config.isArticleAutoReactionEnabled && Intrinsics.areEqual(this.conversationStateSyncSettings, config.conversationStateSyncSettings) && this.askUsersToAllowNotifications == config.askUsersToAllowNotifications;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.primaryColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryColor;
        int hashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.locale.hashCode()) * 31) + this.helpCenterLocale.hashCode()) * 31) + this.launcherLogoUrl.hashCode()) * 31) + this.teamGreeting.hashCode()) * 31) + Boolean.hashCode(this.isFirstRequest)) * 31) + Boolean.hashCode(this.isInboundMessages)) * 31) + Boolean.hashCode(this.isAudioEnabled)) * 31) + Boolean.hashCode(this.isMetricsEnabled)) * 31) + Boolean.hashCode(this.isBackgroundRequestsEnabled)) * 31) + Boolean.hashCode(this.isPrimaryColorRenderDarkText)) * 31) + Boolean.hashCode(this.isSecondaryColorRenderDarkText)) * 31) + Long.hashCode(this._rateLimitPeriodSeconds)) * 31) + Integer.hashCode(this.rateLimitCount)) * 31) + Long.hashCode(this._userUpdateCacheMaxAgeSeconds)) * 31) + Long.hashCode(this._softResetTimeoutSeconds)) * 31) + Long.hashCode(this._newSessionThresholdSeconds)) * 31) + this._realTimeConfigBuilder.hashCode()) * 31) + this.helpCenterUrl.hashCode()) * 31) + this.helpCenterUrls.hashCode()) * 31) + this.features.hashCode()) * 31) + Boolean.hashCode(this.identityVerificationEnabled)) * 31) + Boolean.hashCode(this.accessToTeammateEnabled)) * 31) + Boolean.hashCode(this.helpCenterRequireSearch)) * 31) + Boolean.hashCode(this.preventMultipleInboundConversationsEnabled)) * 31) + Boolean.hashCode(this.hasOpenConversations)) * 31;
        ConfigModules configModules = this.modules;
        return ((((((((hashCode3 + (configModules != null ? configModules.hashCode() : 0)) * 31) + this.attachmentSettings.hashCode()) * 31) + Boolean.hashCode(this.isArticleAutoReactionEnabled)) * 31) + this.conversationStateSyncSettings.hashCode()) * 31) + Boolean.hashCode(this.askUsersToAllowNotifications);
    }

    public String toString() {
        return "Config(name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", locale=" + this.locale + ", helpCenterLocale=" + this.helpCenterLocale + ", launcherLogoUrl=" + this.launcherLogoUrl + ", teamGreeting=" + this.teamGreeting + ", isFirstRequest=" + this.isFirstRequest + ", isInboundMessages=" + this.isInboundMessages + ", isAudioEnabled=" + this.isAudioEnabled + ", isMetricsEnabled=" + this.isMetricsEnabled + ", isBackgroundRequestsEnabled=" + this.isBackgroundRequestsEnabled + ", isPrimaryColorRenderDarkText=" + this.isPrimaryColorRenderDarkText + ", isSecondaryColorRenderDarkText=" + this.isSecondaryColorRenderDarkText + ", _rateLimitPeriodSeconds=" + this._rateLimitPeriodSeconds + ", rateLimitCount=" + this.rateLimitCount + ", _userUpdateCacheMaxAgeSeconds=" + this._userUpdateCacheMaxAgeSeconds + ", _softResetTimeoutSeconds=" + this._softResetTimeoutSeconds + ", _newSessionThresholdSeconds=" + this._newSessionThresholdSeconds + ", _realTimeConfigBuilder=" + this._realTimeConfigBuilder + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterUrls=" + this.helpCenterUrls + ", features=" + this.features + ", identityVerificationEnabled=" + this.identityVerificationEnabled + ", accessToTeammateEnabled=" + this.accessToTeammateEnabled + ", helpCenterRequireSearch=" + this.helpCenterRequireSearch + ", preventMultipleInboundConversationsEnabled=" + this.preventMultipleInboundConversationsEnabled + ", hasOpenConversations=" + this.hasOpenConversations + ", modules=" + this.modules + ", attachmentSettings=" + this.attachmentSettings + ", isArticleAutoReactionEnabled=" + this.isArticleAutoReactionEnabled + ", conversationStateSyncSettings=" + this.conversationStateSyncSettings + ", askUsersToAllowNotifications=" + this.askUsersToAllowNotifications + ')';
    }

    public Config(String name, String str, String str2, String locale, String helpCenterLocale, String launcherLogoUrl, String teamGreeting, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, int i, long j2, long j3, long j4, NexusConfig.Builder _realTimeConfigBuilder, String helpCenterUrl, Set<String> helpCenterUrls, Set<String> features, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(helpCenterLocale, "helpCenterLocale");
        Intrinsics.checkNotNullParameter(launcherLogoUrl, "launcherLogoUrl");
        Intrinsics.checkNotNullParameter(teamGreeting, "teamGreeting");
        Intrinsics.checkNotNullParameter(_realTimeConfigBuilder, "_realTimeConfigBuilder");
        Intrinsics.checkNotNullParameter(helpCenterUrl, "helpCenterUrl");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        Intrinsics.checkNotNullParameter(conversationStateSyncSettings, "conversationStateSyncSettings");
        this.name = name;
        this.primaryColor = str;
        this.secondaryColor = str2;
        this.locale = locale;
        this.helpCenterLocale = helpCenterLocale;
        this.launcherLogoUrl = launcherLogoUrl;
        this.teamGreeting = teamGreeting;
        this.isFirstRequest = z;
        this.isInboundMessages = z2;
        this.isAudioEnabled = z3;
        this.isMetricsEnabled = z4;
        this.isBackgroundRequestsEnabled = z5;
        this.isPrimaryColorRenderDarkText = z6;
        this.isSecondaryColorRenderDarkText = z7;
        this._rateLimitPeriodSeconds = j;
        this.rateLimitCount = i;
        this._userUpdateCacheMaxAgeSeconds = j2;
        this._softResetTimeoutSeconds = j3;
        this._newSessionThresholdSeconds = j4;
        this._realTimeConfigBuilder = _realTimeConfigBuilder;
        this.helpCenterUrl = helpCenterUrl;
        this.helpCenterUrls = helpCenterUrls;
        this.features = features;
        this.identityVerificationEnabled = z8;
        this.accessToTeammateEnabled = z9;
        this.helpCenterRequireSearch = z10;
        this.preventMultipleInboundConversationsEnabled = z11;
        this.hasOpenConversations = z12;
        this.modules = configModules;
        this.attachmentSettings = attachmentSettings;
        this.isArticleAutoReactionEnabled = z13;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
        this.askUsersToAllowNotifications = z14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, int i, long j2, long j3, long j4, NexusConfig.Builder builder, String str8, Set set, Set set2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r15, r4, (i2 & 4096) != 0 ? false : z6, (i2 & 8192) != 0 ? false : z7, (i2 & 16384) != 0 ? 60L : j, (32768 & i2) != 0 ? 100 : i, (i2 & 65536) != 0 ? 300L : j2, (i2 & 131072) != 0 ? 1L : j3, (i2 & 262144) != 0 ? 20L : j4, (i2 & 524288) != 0 ? new NexusConfig.Builder() : builder, (i2 & 1048576) == 0 ? str8 : "", (i2 & 2097152) != 0 ? SetsKt.emptySet() : set, (i2 & 4194304) != 0 ? SetsKt.emptySet() : set2, (i2 & 8388608) != 0 ? false : z8, (i2 & 16777216) != 0 ? true : z9, (i2 & 33554432) != 0 ? false : z10, (i2 & 67108864) != 0 ? false : z11, (i2 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? false : z12, (i2 & 268435456) != 0 ? null : configModules, (i2 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? AttachmentSettings.INSTANCE.getDEFAULT() : attachmentSettings, (i2 & 1073741824) != 0 ? true : z13, (i2 & Integer.MIN_VALUE) != 0 ? ConversationStateSyncSettings.INSTANCE.getDEFAULT() : conversationStateSyncSettings, (i3 & 1) != 0 ? false : z14);
        String str9 = (i2 & 1) != 0 ? "" : str;
        String str10 = (i2 & 2) != 0 ? null : str2;
        String str11 = (i2 & 4) != 0 ? null : str3;
        String str12 = (i2 & 8) != 0 ? "" : str4;
        String str13 = (i2 & 16) != 0 ? "" : str5;
        String str14 = (i2 & 32) != 0 ? "" : str6;
        String str15 = (i2 & 64) != 0 ? "" : str7;
        boolean z15 = (i2 & 128) != 0 ? false : z;
        boolean z16 = (i2 & 256) != 0 ? false : z2;
        boolean z17 = (i2 & 512) != 0 ? true : z3;
        boolean z18 = (i2 & 1024) != 0 ? true : z4;
        boolean z19 = (i2 & 2048) != 0 ? true : z5;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final boolean isFirstRequest() {
        return this.isFirstRequest;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final Set<String> getFeatures() {
        return this.features;
    }

    public final boolean getIdentityVerificationEnabled() {
        return this.identityVerificationEnabled;
    }

    public final boolean getAccessToTeammateEnabled() {
        return this.accessToTeammateEnabled;
    }

    public final boolean getHelpCenterRequireSearch() {
        return this.helpCenterRequireSearch;
    }

    public final boolean getPreventMultipleInboundConversationsEnabled() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    public final ConfigModules getModules() {
        return this.modules;
    }

    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final boolean isArticleAutoReactionEnabled() {
        return this.isArticleAutoReactionEnabled;
    }

    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    public final long getRateLimitPeriod() {
        return TimeUnit.SECONDS.toMillis(this._rateLimitPeriodSeconds);
    }

    public final long getUserUpdateCacheMaxAge() {
        return TimeUnit.SECONDS.toMillis(this._userUpdateCacheMaxAgeSeconds);
    }

    public final long getSoftResetTimeout() {
        return TimeUnit.SECONDS.toMillis(this._softResetTimeoutSeconds);
    }

    public final long getNewSessionThreshold() {
        return TimeUnit.SECONDS.toMillis(this._newSessionThresholdSeconds);
    }

    public final NexusConfig getRealTimeConfig() {
        NexusConfig build = this._realTimeConfigBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* compiled from: Config.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/models/Config$Companion;", "", "<init>", "()V", "DEFAULT_RATE_LIMIT_COUNT", "", "DEFAULT_RATE_LIMIT_PERIOD_SECONDS", "", "DEFAULT_CACHE_MAX_AGE_SECONDS", "DEFAULT_SESSION_TIMEOUT_SECONDS", "DEFAULT_SOFT_RESET_TIMEOUT_SECONDS", "NULL", "Lio/intercom/android/sdk/models/Config;", "getNULL", "()Lio/intercom/android/sdk/models/Config;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Config getNULL() {
            return Config.NULL;
        }
    }
}

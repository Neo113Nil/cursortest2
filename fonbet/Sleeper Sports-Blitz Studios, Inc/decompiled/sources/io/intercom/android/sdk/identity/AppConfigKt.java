package io.intercom.android.sdk.identity;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppConfig.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\b2\u0006\u0010\r\u001a\u00020\u0001H\u0000\"\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"getAppConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "Lio/intercom/android/sdk/models/Config;", "defaultColor", "", "getConfigColor", "color", "", "Landroid/content/SharedPreferences;", "realTimeConfig", "Lio/intercom/android/nexus/NexusConfig;", "setAppConfig", "", "newAppConfig", "APP_NAME", "APP_INBOUND_MESSAGES", "APP_PRIMARY_COLOR", "APP_SECONDARY_COLOR", "APP_PRIMARY_COLOR_RENDER_DARK_TEXT", "APP_SECONDARY_COLOR_RENDER_DARK_TEXT", "APP_USER_UPDATE_CACHE_MAX_AGE_MS", "APP_RATE_LIMIT_PERIOD_MS", "APP_SOFT_RESET_TIMEOUT_MS", "APP_NEW_SESSION_THRESHOLD_MS", "APP_RATE_LIMIT_COUNT", "APP_AUDIO_ENABLED", "APP_METRICS_ENABLED", "APP_LOCALE", "APP_HELP_CENTER_LOCALE", "APP_RECEIVED_FROM_SERVER", "APP_BACKGROUND_REQUESTS_ENABLED", "APP_HELP_CENTER_URL", "APP_HELP_CENTER_URLS", "APP_FEATURES", "APP_LAUNCHER_LOGO_URL", "APP_TEAM_GREETING", "APP_IDENTITY_VERIFICATION_ENABLED", "APP_ACCESS_TEAMMATE_ENABLED", "APP_HELP_CENTER_REQUIRE_SEARCH", "APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED", "APP_HAS_OPEN_CONVERSATIONS", "APP_HUB_HEADER_CONFIG", "APP_ATTACHMENT_SETTINGS", "APP_ARTICLE_AUTO_REACTION_ENABLED", "APP_ASK_USERS_TO_ALLOW_NOTIFICATIONS", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppConfigKt {
    private static final String APP_ACCESS_TEAMMATE_ENABLED = "access_to_teammate_enabled";
    private static final String APP_ARTICLE_AUTO_REACTION_ENABLED = "article_auto_reaction_enabled";
    private static final String APP_ASK_USERS_TO_ALLOW_NOTIFICATIONS = "ask_users_to_allow_notifications";
    private static final String APP_ATTACHMENT_SETTINGS = "app_attachment_settings";
    private static final String APP_AUDIO_ENABLED = "app_audio_enabled";
    private static final String APP_BACKGROUND_REQUESTS_ENABLED = "app_background_requests_enabled";
    private static final String APP_FEATURES = "features";
    private static final String APP_HAS_OPEN_CONVERSATIONS = "has_open_conversations";
    private static final String APP_HELP_CENTER_LOCALE = "help_center_locale";
    private static final String APP_HELP_CENTER_REQUIRE_SEARCH = "help_center_require_search";
    private static final String APP_HELP_CENTER_URL = "help_center_url";
    private static final String APP_HELP_CENTER_URLS = "help_center_urls";
    private static final String APP_HUB_HEADER_CONFIG = "hub_config";
    private static final String APP_IDENTITY_VERIFICATION_ENABLED = "app_identity_verification_enabled";
    private static final String APP_INBOUND_MESSAGES = "app_inbound_messages";
    private static final String APP_LAUNCHER_LOGO_URL = "app_launcher_logo_url";
    private static final String APP_LOCALE = "app_locale";
    private static final String APP_METRICS_ENABLED = "app_metrics_enabled";
    private static final String APP_NAME = "app_name";
    private static final String APP_NEW_SESSION_THRESHOLD_MS = "new_session_threshold_ms";
    private static final String APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED = "prevent_multiple_inbound_conversations_enabled";
    private static final String APP_PRIMARY_COLOR = "app_primary_color";
    private static final String APP_PRIMARY_COLOR_RENDER_DARK_TEXT = "app_primary_color_render_dark_text";
    private static final String APP_RATE_LIMIT_COUNT = "app_rate_limit_count";
    private static final String APP_RATE_LIMIT_PERIOD_MS = "app_rate_limit_period_ms";
    private static final String APP_RECEIVED_FROM_SERVER = "app_received_from_server";
    private static final String APP_SECONDARY_COLOR = "app_secondary_color";
    private static final String APP_SECONDARY_COLOR_RENDER_DARK_TEXT = "app_secondary_color_render_dark_text";
    private static final String APP_SOFT_RESET_TIMEOUT_MS = "app_soft_reset_timeout_ms";
    private static final String APP_TEAM_GREETING = "app_team_greeting";
    private static final String APP_USER_UPDATE_CACHE_MAX_AGE_MS = "app_user_update_cache_max_age_ms";

    public static final AppConfig getAppConfig(Config config, int i) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        int configColor = getConfigColor(config.getPrimaryColor(), i);
        int configColor2 = getConfigColor(config.getSecondaryColor(), i);
        return new AppConfig(config.getName(), configColor, configColor2, ColorUtils.darkenColor(configColor2), config.isPrimaryColorRenderDarkText(), config.isSecondaryColorRenderDarkText(), config.isInboundMessages(), config.getRateLimitCount(), config.getRateLimitPeriod(), config.getUserUpdateCacheMaxAge(), config.getNewSessionThreshold(), config.getSoftResetTimeout(), config.isMetricsEnabled(), config.isAudioEnabled(), config.getLocale(), config.getHelpCenterLocale(), true, config.isBackgroundRequestsEnabled(), config.getHelpCenterUrl(), config.getHelpCenterUrls(), config.getFeatures(), config.getLauncherLogoUrl(), config.getTeamGreeting(), config.getIdentityVerificationEnabled(), config.getAccessToTeammateEnabled(), config.getHelpCenterRequireSearch(), config.getPreventMultipleInboundConversationsEnabled(), config.getHasOpenConversations(), config.getModules(), config.getRealTimeConfig(), config.getAttachmentSettings(), config.isArticleAutoReactionEnabled(), config.getConversationStateSyncSettings(), config.getAskUsersToAllowNotifications());
    }

    private static final int getConfigColor(String str, int i) {
        return str == null ? i : ColorUtils.parseColor(str);
    }

    public static final AppConfig getAppConfig(SharedPreferences sharedPreferences, int i, NexusConfig realTimeConfig) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(realTimeConfig, "realTimeConfig");
        int i2 = sharedPreferences.getInt(APP_PRIMARY_COLOR, i);
        int i3 = sharedPreferences.getInt(APP_SECONDARY_COLOR, i2);
        Gson gson = new Gson();
        String string = sharedPreferences.getString("app_name", "");
        if (string == null) {
            string = "";
        }
        int darkenColor = ColorUtils.darkenColor(i3);
        boolean z = sharedPreferences.getBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, false);
        boolean z2 = sharedPreferences.getBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, false);
        boolean z3 = sharedPreferences.getBoolean(APP_INBOUND_MESSAGES, false);
        int i4 = sharedPreferences.getInt(APP_RATE_LIMIT_COUNT, 100);
        long j = sharedPreferences.getLong(APP_RATE_LIMIT_PERIOD_MS, TimeUnit.SECONDS.toMillis(60L));
        long j2 = sharedPreferences.getLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, TimeUnit.SECONDS.toMillis(300L));
        String str = string;
        long j3 = sharedPreferences.getLong(APP_NEW_SESSION_THRESHOLD_MS, TimeUnit.SECONDS.toMillis(20L));
        long j4 = sharedPreferences.getLong(APP_SOFT_RESET_TIMEOUT_MS, TimeUnit.SECONDS.toMillis(1L));
        boolean z4 = sharedPreferences.getBoolean(APP_METRICS_ENABLED, true);
        boolean z5 = sharedPreferences.getBoolean(APP_AUDIO_ENABLED, true);
        String string2 = sharedPreferences.getString(APP_LOCALE, "");
        String str2 = string2 == null ? "" : string2;
        String string3 = sharedPreferences.getString(APP_HELP_CENTER_LOCALE, "");
        String str3 = string3 == null ? "" : string3;
        boolean z6 = sharedPreferences.getBoolean(APP_RECEIVED_FROM_SERVER, false);
        boolean z7 = sharedPreferences.getBoolean(APP_BACKGROUND_REQUESTS_ENABLED, true);
        String string4 = sharedPreferences.getString(APP_HELP_CENTER_URL, "");
        String str4 = string4 == null ? "" : string4;
        Set<String> stringSet = sharedPreferences.getStringSet(APP_HELP_CENTER_URLS, SetsKt.emptySet());
        if (stringSet == null) {
            stringSet = SetsKt.emptySet();
        }
        Set<String> set = stringSet;
        Set<String> stringSet2 = sharedPreferences.getStringSet(APP_FEATURES, SetsKt.emptySet());
        if (stringSet2 == null) {
            stringSet2 = SetsKt.emptySet();
        }
        String string5 = sharedPreferences.getString(APP_LAUNCHER_LOGO_URL, "");
        if (string5 == null) {
            string5 = "";
        }
        Set<String> set2 = stringSet2;
        String string6 = sharedPreferences.getString(APP_TEAM_GREETING, "");
        String str5 = string6 != null ? string6 : "";
        String str6 = string5;
        boolean z8 = sharedPreferences.getBoolean(APP_IDENTITY_VERIFICATION_ENABLED, false);
        boolean z9 = sharedPreferences.getBoolean(APP_ACCESS_TEAMMATE_ENABLED, true);
        boolean z10 = sharedPreferences.getBoolean(APP_HELP_CENTER_REQUIRE_SEARCH, false);
        boolean z11 = sharedPreferences.getBoolean(APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED, false);
        boolean z12 = sharedPreferences.getBoolean(APP_HAS_OPEN_CONVERSATIONS, false);
        ConfigModules configModules = (ConfigModules) gson.fromJson(sharedPreferences.getString(APP_HUB_HEADER_CONFIG, null), ConfigModules.class);
        Object fromJson = gson.fromJson(sharedPreferences.getString(APP_ATTACHMENT_SETTINGS, gson.toJson(AttachmentSettings.INSTANCE.getDEFAULT())), (Class<Object>) AttachmentSettings.class);
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
        return new AppConfig(str, i2, i3, darkenColor, z, z2, z3, i4, j, j2, j3, j4, z4, z5, str2, str3, z6, z7, str4, set, set2, str6, str5, z8, z9, z10, z11, z12, configModules, realTimeConfig, (AttachmentSettings) fromJson, sharedPreferences.getBoolean(APP_ARTICLE_AUTO_REACTION_ENABLED, true), ConversationStateSyncSettings.INSTANCE.getDEFAULT(), sharedPreferences.getBoolean(APP_ASK_USERS_TO_ALLOW_NOTIFICATIONS, false));
    }

    public static final void setAppConfig(SharedPreferences sharedPreferences, AppConfig newAppConfig) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(newAppConfig, "newAppConfig");
        Gson gson = new Gson();
        sharedPreferences.edit().putString("app_name", newAppConfig.getName()).putString(APP_LOCALE, newAppConfig.getLocale()).putString(APP_HELP_CENTER_LOCALE, newAppConfig.getHelpCenterLocale()).putString(APP_LAUNCHER_LOGO_URL, newAppConfig.getLauncherLogoUrl()).putString(APP_TEAM_GREETING, newAppConfig.getTeamGreeting()).putInt(APP_PRIMARY_COLOR, newAppConfig.getPrimaryColor()).putInt(APP_SECONDARY_COLOR, newAppConfig.getSecondaryColor()).putInt(APP_RATE_LIMIT_COUNT, newAppConfig.getRateLimitCount()).putLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, newAppConfig.getUserUpdateCacheMaxAgeMs()).putLong(APP_RATE_LIMIT_PERIOD_MS, newAppConfig.getRateLimitPeriodMs()).putLong(APP_NEW_SESSION_THRESHOLD_MS, newAppConfig.getNewSessionThresholdMs()).putLong(APP_SOFT_RESET_TIMEOUT_MS, newAppConfig.getSoftResetTimeoutMs()).putBoolean(APP_INBOUND_MESSAGES, newAppConfig.isInboundMessages()).putBoolean(APP_AUDIO_ENABLED, newAppConfig.isAudioEnabled()).putBoolean(APP_METRICS_ENABLED, newAppConfig.isMetricsEnabled()).putBoolean(APP_RECEIVED_FROM_SERVER, newAppConfig.isReceivedFromServer()).putBoolean(APP_BACKGROUND_REQUESTS_ENABLED, newAppConfig.isBackgroundRequestsEnabled()).putBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, newAppConfig.isPrimaryColorRenderDarkText()).putBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, newAppConfig.isSecondaryColorRenderDarkText()).putString(APP_HELP_CENTER_URL, newAppConfig.getHelpCenterUrl()).putStringSet(APP_HELP_CENTER_URLS, newAppConfig.getHelpCenterUrls()).putStringSet(APP_FEATURES, newAppConfig.getFeatures()).putBoolean(APP_ACCESS_TEAMMATE_ENABLED, newAppConfig.isAccessToTeammateEnabled()).putBoolean(APP_HELP_CENTER_REQUIRE_SEARCH, newAppConfig.isHelpCenterRequireSearchEnabled()).putBoolean(APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED, newAppConfig.isPreventMultipleInboundConversationsEnabled()).putBoolean(APP_HAS_OPEN_CONVERSATIONS, newAppConfig.getHasOpenConversations()).putString(APP_HUB_HEADER_CONFIG, gson.toJson(newAppConfig.getConfigModules())).putString(APP_ATTACHMENT_SETTINGS, gson.toJson(newAppConfig.getAttachmentSettings())).putBoolean(APP_ARTICLE_AUTO_REACTION_ENABLED, newAppConfig.getArticleAutoReactionEnabled()).putBoolean(APP_ASK_USERS_TO_ALLOW_NOTIFICATIONS, newAppConfig.getAskUsersToAllowNotifications()).apply();
    }
}

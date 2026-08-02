package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeConversationItem implements SchemeStat$TypeAction.b, SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("app_widget_item")
    private final MobileOfficialAppsMarusiaStat$TypeAppWidgetItem appWidgetItem;

    @pmi0("chat_screenshot_share_item")
    private final SchemeStat$TypeShareItem chatScreenshotShareItem;

    @pmi0("chat_screenshot_source")
    private final ChatScreenshotSource chatScreenshotSource;

    @pmi0("entry_point")
    private final MobileOfficialAppsCoreNavStat$EventScreen entryPoint;

    @pmi0("gradient_entry_point")
    private final GradientEntryPoint gradientEntryPoint;

    @pmi0(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK)
    private final String intent;

    @pmi0("kws_setting_enabled")
    private final Boolean kwsSettingEnabled;

    @pmi0("link")
    private final String link;

    @pmi0("message")
    private final MobileOfficialAppsMarusiaStat$TypeMessageItem message;

    @pmi0("sdk_initialization_item")
    private final MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem sdkInitializationItem;

    @pmi0("skill")
    private final String skill;

    @pmi0("suggests_item")
    private final MobileOfficialAppsMarusiaStat$TypeSuggestsItem suggestsItem;

    @pmi0("type")
    private final Type type;

    @pmi0("universal_widget_item")
    private final MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem universalWidgetItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class ChatScreenshotSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChatScreenshotSource[] $VALUES;

        @pmi0("navbar")
        public static final ChatScreenshotSource NAVBAR;

        @pmi0("system")
        public static final ChatScreenshotSource SYSTEM;

        static {
            ChatScreenshotSource chatScreenshotSource = new ChatScreenshotSource("SYSTEM", 0);
            SYSTEM = chatScreenshotSource;
            ChatScreenshotSource chatScreenshotSource2 = new ChatScreenshotSource("NAVBAR", 1);
            NAVBAR = chatScreenshotSource2;
            ChatScreenshotSource[] chatScreenshotSourceArr = {chatScreenshotSource, chatScreenshotSource2};
            $VALUES = chatScreenshotSourceArr;
            $ENTRIES = new asp(chatScreenshotSourceArr);
        }

        private ChatScreenshotSource(String str, int i) {
        }

        public static ChatScreenshotSource valueOf(String str) {
            return (ChatScreenshotSource) Enum.valueOf(ChatScreenshotSource.class, str);
        }

        public static ChatScreenshotSource[] values() {
            return (ChatScreenshotSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class GradientEntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GradientEntryPoint[] $VALUES;

        @pmi0("music_kws")
        public static final GradientEntryPoint MUSIC_KWS;

        @pmi0("music_navbar")
        public static final GradientEntryPoint MUSIC_NAVBAR;

        @pmi0("search_kws")
        public static final GradientEntryPoint SEARCH_KWS;

        @pmi0("search_navbar")
        public static final GradientEntryPoint SEARCH_NAVBAR;

        @pmi0("superapp_kws")
        public static final GradientEntryPoint SUPERAPP_KWS;

        @pmi0("system_assistant")
        public static final GradientEntryPoint SYSTEM_ASSISTANT;

        static {
            GradientEntryPoint gradientEntryPoint = new GradientEntryPoint("MUSIC_NAVBAR", 0);
            MUSIC_NAVBAR = gradientEntryPoint;
            GradientEntryPoint gradientEntryPoint2 = new GradientEntryPoint("MUSIC_KWS", 1);
            MUSIC_KWS = gradientEntryPoint2;
            GradientEntryPoint gradientEntryPoint3 = new GradientEntryPoint("SEARCH_NAVBAR", 2);
            SEARCH_NAVBAR = gradientEntryPoint3;
            GradientEntryPoint gradientEntryPoint4 = new GradientEntryPoint("SEARCH_KWS", 3);
            SEARCH_KWS = gradientEntryPoint4;
            GradientEntryPoint gradientEntryPoint5 = new GradientEntryPoint("SUPERAPP_KWS", 4);
            SUPERAPP_KWS = gradientEntryPoint5;
            GradientEntryPoint gradientEntryPoint6 = new GradientEntryPoint("SYSTEM_ASSISTANT", 5);
            SYSTEM_ASSISTANT = gradientEntryPoint6;
            GradientEntryPoint[] gradientEntryPointArr = {gradientEntryPoint, gradientEntryPoint2, gradientEntryPoint3, gradientEntryPoint4, gradientEntryPoint5, gradientEntryPoint6};
            $VALUES = gradientEntryPointArr;
            $ENTRIES = new asp(gradientEntryPointArr);
        }

        private GradientEntryPoint(String str, int i) {
        }

        public static GradientEntryPoint valueOf(String str) {
            return (GradientEntryPoint) Enum.valueOf(GradientEntryPoint.class, str);
        }

        public static GradientEntryPoint[] values() {
            return (GradientEntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("app_widget")
        public static final Type APP_WIDGET;

        @pmi0("chat_open")
        public static final Type CHAT_OPEN;

        @pmi0("chat_screenshot")
        public static final Type CHAT_SCREENSHOT;

        @pmi0("global_search")
        public static final Type GLOBAL_SEARCH;

        @pmi0("hint")
        public static final Type HINT;

        @pmi0("keyboard")
        public static final Type KEYBOARD;

        @pmi0("kws_setting")
        public static final Type KWS_SETTING;

        @pmi0("link")
        public static final Type LINK;

        @pmi0("music_search")
        public static final Type MUSIC_SEARCH;

        @pmi0("permission")
        public static final Type PERMISSION;

        @pmi0("qr_desktop_added")
        public static final Type QR_DESKTOP_ADDED;

        @pmi0("qr_desktop_click")
        public static final Type QR_DESKTOP_CLICK;

        @pmi0("qr_desktop_removed")
        public static final Type QR_DESKTOP_REMOVED;

        @pmi0("qr_desktop_shown")
        public static final Type QR_DESKTOP_SHOWN;

        @pmi0("qr_vk_saved")
        public static final Type QR_VK_SAVED;

        @pmi0("qr_vk_shown")
        public static final Type QR_VK_SHOWN;

        @pmi0("sdk_initialization")
        public static final Type SDK_INITIALIZATION;

        @pmi0("suggests")
        public static final Type SUGGESTS;

        @pmi0("system_assistant")
        public static final Type SYSTEM_ASSISTANT;

        @pmi0("universal_widget")
        public static final Type UNIVERSAL_WIDGET;

        static {
            Type type = new Type("CHAT_OPEN", 0);
            CHAT_OPEN = type;
            Type type2 = new Type("HINT", 1);
            HINT = type2;
            Type type3 = new Type("LINK", 2);
            LINK = type3;
            Type type4 = new Type("KEYBOARD", 3);
            KEYBOARD = type4;
            Type type5 = new Type("SUGGESTS", 4);
            SUGGESTS = type5;
            Type type6 = new Type("QR_VK_SAVED", 5);
            QR_VK_SAVED = type6;
            Type type7 = new Type("QR_VK_SHOWN", 6);
            QR_VK_SHOWN = type7;
            Type type8 = new Type("QR_DESKTOP_ADDED", 7);
            QR_DESKTOP_ADDED = type8;
            Type type9 = new Type("QR_DESKTOP_REMOVED", 8);
            QR_DESKTOP_REMOVED = type9;
            Type type10 = new Type("QR_DESKTOP_SHOWN", 9);
            QR_DESKTOP_SHOWN = type10;
            Type type11 = new Type("QR_DESKTOP_CLICK", 10);
            QR_DESKTOP_CLICK = type11;
            Type type12 = new Type("MUSIC_SEARCH", 11);
            MUSIC_SEARCH = type12;
            Type type13 = new Type("GLOBAL_SEARCH", 12);
            GLOBAL_SEARCH = type13;
            Type type14 = new Type("CHAT_SCREENSHOT", 13);
            CHAT_SCREENSHOT = type14;
            Type type15 = new Type("KWS_SETTING", 14);
            KWS_SETTING = type15;
            Type type16 = new Type("PERMISSION", 15);
            PERMISSION = type16;
            Type type17 = new Type("APP_WIDGET", 16);
            APP_WIDGET = type17;
            Type type18 = new Type("SDK_INITIALIZATION", 17);
            SDK_INITIALIZATION = type18;
            Type type19 = new Type("UNIVERSAL_WIDGET", 18);
            UNIVERSAL_WIDGET = type19;
            Type type20 = new Type("SYSTEM_ASSISTANT", 19);
            SYSTEM_ASSISTANT = type20;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsMarusiaStat$TypeConversationItem(Type type, String str, MobileOfficialAppsMarusiaStat$TypeSuggestsItem mobileOfficialAppsMarusiaStat$TypeSuggestsItem, String str2, String str3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, GradientEntryPoint gradientEntryPoint, MobileOfficialAppsMarusiaStat$TypeMessageItem mobileOfficialAppsMarusiaStat$TypeMessageItem, ChatScreenshotSource chatScreenshotSource, SchemeStat$TypeShareItem schemeStat$TypeShareItem, Boolean bool, MobileOfficialAppsMarusiaStat$TypeAppWidgetItem mobileOfficialAppsMarusiaStat$TypeAppWidgetItem, MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem mobileOfficialAppsMarusiaStat$TypeSdkInitializationItem, MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem) {
        this.type = type;
        this.link = str;
        this.suggestsItem = mobileOfficialAppsMarusiaStat$TypeSuggestsItem;
        this.skill = str2;
        this.intent = str3;
        this.entryPoint = mobileOfficialAppsCoreNavStat$EventScreen;
        this.gradientEntryPoint = gradientEntryPoint;
        this.message = mobileOfficialAppsMarusiaStat$TypeMessageItem;
        this.chatScreenshotSource = chatScreenshotSource;
        this.chatScreenshotShareItem = schemeStat$TypeShareItem;
        this.kwsSettingEnabled = bool;
        this.appWidgetItem = mobileOfficialAppsMarusiaStat$TypeAppWidgetItem;
        this.sdkInitializationItem = mobileOfficialAppsMarusiaStat$TypeSdkInitializationItem;
        this.universalWidgetItem = mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarusiaStat$TypeConversationItem)) {
            return false;
        }
        MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem = (MobileOfficialAppsMarusiaStat$TypeConversationItem) obj;
        return this.type == mobileOfficialAppsMarusiaStat$TypeConversationItem.type && epx.f(this.link, mobileOfficialAppsMarusiaStat$TypeConversationItem.link) && epx.f(this.suggestsItem, mobileOfficialAppsMarusiaStat$TypeConversationItem.suggestsItem) && epx.f(this.skill, mobileOfficialAppsMarusiaStat$TypeConversationItem.skill) && epx.f(this.intent, mobileOfficialAppsMarusiaStat$TypeConversationItem.intent) && this.entryPoint == mobileOfficialAppsMarusiaStat$TypeConversationItem.entryPoint && this.gradientEntryPoint == mobileOfficialAppsMarusiaStat$TypeConversationItem.gradientEntryPoint && epx.f(this.message, mobileOfficialAppsMarusiaStat$TypeConversationItem.message) && this.chatScreenshotSource == mobileOfficialAppsMarusiaStat$TypeConversationItem.chatScreenshotSource && epx.f(this.chatScreenshotShareItem, mobileOfficialAppsMarusiaStat$TypeConversationItem.chatScreenshotShareItem) && epx.f(this.kwsSettingEnabled, mobileOfficialAppsMarusiaStat$TypeConversationItem.kwsSettingEnabled) && epx.f(this.appWidgetItem, mobileOfficialAppsMarusiaStat$TypeConversationItem.appWidgetItem) && epx.f(this.sdkInitializationItem, mobileOfficialAppsMarusiaStat$TypeConversationItem.sdkInitializationItem) && epx.f(this.universalWidgetItem, mobileOfficialAppsMarusiaStat$TypeConversationItem.universalWidgetItem);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.link;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeSuggestsItem mobileOfficialAppsMarusiaStat$TypeSuggestsItem = this.suggestsItem;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsMarusiaStat$TypeSuggestsItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeSuggestsItem.hashCode())) * 31;
        String str2 = this.skill;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.intent;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.entryPoint;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        GradientEntryPoint gradientEntryPoint = this.gradientEntryPoint;
        int hashCode7 = (hashCode6 + (gradientEntryPoint == null ? 0 : gradientEntryPoint.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeMessageItem mobileOfficialAppsMarusiaStat$TypeMessageItem = this.message;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsMarusiaStat$TypeMessageItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeMessageItem.hashCode())) * 31;
        ChatScreenshotSource chatScreenshotSource = this.chatScreenshotSource;
        int hashCode9 = (hashCode8 + (chatScreenshotSource == null ? 0 : chatScreenshotSource.hashCode())) * 31;
        SchemeStat$TypeShareItem schemeStat$TypeShareItem = this.chatScreenshotShareItem;
        int hashCode10 = (hashCode9 + (schemeStat$TypeShareItem == null ? 0 : schemeStat$TypeShareItem.hashCode())) * 31;
        Boolean bool = this.kwsSettingEnabled;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeAppWidgetItem mobileOfficialAppsMarusiaStat$TypeAppWidgetItem = this.appWidgetItem;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsMarusiaStat$TypeAppWidgetItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeAppWidgetItem.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem mobileOfficialAppsMarusiaStat$TypeSdkInitializationItem = this.sdkInitializationItem;
        int hashCode13 = (hashCode12 + (mobileOfficialAppsMarusiaStat$TypeSdkInitializationItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeSdkInitializationItem.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem = this.universalWidgetItem;
        return hashCode13 + (mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem != null ? mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeConversationItem(type=" + this.type + ", link=" + this.link + ", suggestsItem=" + this.suggestsItem + ", skill=" + this.skill + ", intent=" + this.intent + ", entryPoint=" + this.entryPoint + ", gradientEntryPoint=" + this.gradientEntryPoint + ", message=" + this.message + ", chatScreenshotSource=" + this.chatScreenshotSource + ", chatScreenshotShareItem=" + this.chatScreenshotShareItem + ", kwsSettingEnabled=" + this.kwsSettingEnabled + ", appWidgetItem=" + this.appWidgetItem + ", sdkInitializationItem=" + this.sdkInitializationItem + ", universalWidgetItem=" + this.universalWidgetItem + ')';
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeConversationItem(Type type, String str, MobileOfficialAppsMarusiaStat$TypeSuggestsItem mobileOfficialAppsMarusiaStat$TypeSuggestsItem, String str2, String str3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, GradientEntryPoint gradientEntryPoint, MobileOfficialAppsMarusiaStat$TypeMessageItem mobileOfficialAppsMarusiaStat$TypeMessageItem, ChatScreenshotSource chatScreenshotSource, SchemeStat$TypeShareItem schemeStat$TypeShareItem, Boolean bool, MobileOfficialAppsMarusiaStat$TypeAppWidgetItem mobileOfficialAppsMarusiaStat$TypeAppWidgetItem, MobileOfficialAppsMarusiaStat$TypeSdkInitializationItem mobileOfficialAppsMarusiaStat$TypeSdkInitializationItem, MobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeSuggestsItem, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 64) != 0 ? null : gradientEntryPoint, (i & 128) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeMessageItem, (i & 256) != 0 ? null : chatScreenshotSource, (i & 512) != 0 ? null : schemeStat$TypeShareItem, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeAppWidgetItem, (i & 4096) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeSdkInitializationItem, (i & 8192) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeUniversalWidgetItem);
    }
}

package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ClipUploadSettingItem {

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("name")
    private final Name name;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("action_button_open_channel")
        public static final Name ACTION_BUTTON_OPEN_CHANNEL;

        @pmi0("allow_comments")
        public static final Name ALLOW_COMMENTS;

        @pmi0("allow_duets")
        public static final Name ALLOW_DUETS;

        @pmi0("is_delayed")
        public static final Name IS_DELAYED;

        @pmi0("is_market_market_link_enabled")
        public static final Name IS_MARKET_MARKET_LINK_ENABLED;

        @pmi0("is_market_message_to_bc_enabled")
        public static final Name IS_MARKET_MESSAGE_TO_BC_ENABLED;

        @pmi0("is_market_online_booking_enabled")
        public static final Name IS_MARKET_ONLINE_BOOKING_ENABLED;

        @pmi0("is_vk_ticket_enabled")
        public static final Name IS_VK_TICKET_ENABLED;

        @pmi0("post_on_wall")
        public static final Name POST_ON_WALL;

        @pmi0("repost_in_story")
        public static final Name REPOST_IN_STORY;

        @pmi0("use_for_templates")
        public static final Name USE_FOR_TEMPLATES;

        static {
            Name name = new Name("USE_FOR_TEMPLATES", 0);
            USE_FOR_TEMPLATES = name;
            Name name2 = new Name("IS_MARKET_ONLINE_BOOKING_ENABLED", 1);
            IS_MARKET_ONLINE_BOOKING_ENABLED = name2;
            Name name3 = new Name("IS_MARKET_MESSAGE_TO_BC_ENABLED", 2);
            IS_MARKET_MESSAGE_TO_BC_ENABLED = name3;
            Name name4 = new Name("IS_MARKET_MARKET_LINK_ENABLED", 3);
            IS_MARKET_MARKET_LINK_ENABLED = name4;
            Name name5 = new Name("IS_VK_TICKET_ENABLED", 4);
            IS_VK_TICKET_ENABLED = name5;
            Name name6 = new Name("REPOST_IN_STORY", 5);
            REPOST_IN_STORY = name6;
            Name name7 = new Name("POST_ON_WALL", 6);
            POST_ON_WALL = name7;
            Name name8 = new Name("ALLOW_DUETS", 7);
            ALLOW_DUETS = name8;
            Name name9 = new Name("ALLOW_COMMENTS", 8);
            ALLOW_COMMENTS = name9;
            Name name10 = new Name("IS_DELAYED", 9);
            IS_DELAYED = name10;
            Name name11 = new Name("ACTION_BUTTON_OPEN_CHANNEL", 10);
            ACTION_BUTTON_OPEN_CHANNEL = name11;
            Name[] nameArr = {name, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11};
            $VALUES = nameArr;
            $ENTRIES = new asp(nameArr);
        }

        private Name(String str, int i) {
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$ClipUploadSettingItem(Name name, boolean z) {
        this.name = name;
        this.isEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ClipUploadSettingItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ClipUploadSettingItem mobileOfficialAppsClipsStat$ClipUploadSettingItem = (MobileOfficialAppsClipsStat$ClipUploadSettingItem) obj;
        return this.name == mobileOfficialAppsClipsStat$ClipUploadSettingItem.name && this.isEnabled == mobileOfficialAppsClipsStat$ClipUploadSettingItem.isEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isEnabled) + (this.name.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploadSettingItem(name=");
        sb.append(this.name);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.isEnabled, ')');
    }
}

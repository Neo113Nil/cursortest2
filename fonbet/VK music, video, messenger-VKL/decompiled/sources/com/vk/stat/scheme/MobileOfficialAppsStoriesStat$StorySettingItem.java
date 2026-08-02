package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsStoriesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStoriesStat$StorySettingItem {

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("name")
    private final Name name;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStoriesStat.kt */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("animated_stickers")
        public static final Name ANIMATED_STICKERS;

        @pmi0("camera_grid")
        public static final Name CAMERA_GRID;

        @pmi0("main_share_live_post")
        public static final Name MAIN_SHARE_LIVE_POST;

        @pmi0("main_share_live_story")
        public static final Name MAIN_SHARE_LIVE_STORY;

        @pmi0("privacy_comments_live")
        public static final Name PRIVACY_COMMENTS_LIVE;

        @pmi0("privacy_comments_live_group")
        public static final Name PRIVACY_COMMENTS_LIVE_GROUP;

        @pmi0("privacy_reply_stories")
        public static final Name PRIVACY_REPLY_STORIES;

        @pmi0("privacy_see_lives")
        public static final Name PRIVACY_SEE_LIVES;

        @pmi0("privacy_see_stories")
        public static final Name PRIVACY_SEE_STORIES;

        @pmi0("save_stories")
        public static final Name SAVE_STORIES;

        static {
            Name name = new Name("SAVE_STORIES", 0);
            SAVE_STORIES = name;
            Name name2 = new Name("PRIVACY_SEE_STORIES", 1);
            PRIVACY_SEE_STORIES = name2;
            Name name3 = new Name("PRIVACY_REPLY_STORIES", 2);
            PRIVACY_REPLY_STORIES = name3;
            Name name4 = new Name("PRIVACY_SEE_LIVES", 3);
            PRIVACY_SEE_LIVES = name4;
            Name name5 = new Name("PRIVACY_COMMENTS_LIVE", 4);
            PRIVACY_COMMENTS_LIVE = name5;
            Name name6 = new Name("PRIVACY_COMMENTS_LIVE_GROUP", 5);
            PRIVACY_COMMENTS_LIVE_GROUP = name6;
            Name name7 = new Name("MAIN_SHARE_LIVE_POST", 6);
            MAIN_SHARE_LIVE_POST = name7;
            Name name8 = new Name("MAIN_SHARE_LIVE_STORY", 7);
            MAIN_SHARE_LIVE_STORY = name8;
            Name name9 = new Name("ANIMATED_STICKERS", 8);
            ANIMATED_STICKERS = name9;
            Name name10 = new Name("CAMERA_GRID", 9);
            CAMERA_GRID = name10;
            Name[] nameArr = {name, name2, name3, name4, name5, name6, name7, name8, name9, name10};
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

    public MobileOfficialAppsStoriesStat$StorySettingItem(Name name, boolean z) {
        this.name = name;
        this.isEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStoriesStat$StorySettingItem)) {
            return false;
        }
        MobileOfficialAppsStoriesStat$StorySettingItem mobileOfficialAppsStoriesStat$StorySettingItem = (MobileOfficialAppsStoriesStat$StorySettingItem) obj;
        return this.name == mobileOfficialAppsStoriesStat$StorySettingItem.name && this.isEnabled == mobileOfficialAppsStoriesStat$StorySettingItem.isEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isEnabled) + (this.name.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorySettingItem(name=");
        sb.append(this.name);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.isEnabled, ')');
    }
}

package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePushesStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePushesStat$PushChannelItem {

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("name")
    private final Name name;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePushesStat.kt */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("vkdating_like")
        public static final Name VKDATING_LIKE;

        @pmi0("vkdating_match")
        public static final Name VKDATING_MATCH;

        @pmi0("vkdating_message")
        public static final Name VKDATING_MESSAGE;

        @pmi0("vkdating_message_reaction")
        public static final Name VKDATING_MESSAGE_REACTION;

        @pmi0("vkdating_news_and_updates")
        public static final Name VKDATING_NEWS_AND_UPDATES;

        @pmi0("vkdating_service")
        public static final Name VKDATING_SERVICE;

        @pmi0("vkdating_superlike")
        public static final Name VKDATING_SUPERLIKE;

        @pmi0("wldating_compliment")
        public static final Name WLDATING_COMPLIMENT;

        @pmi0("wldating_like")
        public static final Name WLDATING_LIKE;

        @pmi0("wldating_match")
        public static final Name WLDATING_MATCH;

        @pmi0("wldating_message")
        public static final Name WLDATING_MESSAGE;

        @pmi0("wldating_message_reaction")
        public static final Name WLDATING_MESSAGE_REACTION;

        @pmi0("wldating_news_and_updates")
        public static final Name WLDATING_NEWS_AND_UPDATES;

        @pmi0("wldating_service")
        public static final Name WLDATING_SERVICE;

        static {
            Name name = new Name("VKDATING_LIKE", 0);
            VKDATING_LIKE = name;
            Name name2 = new Name("VKDATING_SUPERLIKE", 1);
            VKDATING_SUPERLIKE = name2;
            Name name3 = new Name("VKDATING_MATCH", 2);
            VKDATING_MATCH = name3;
            Name name4 = new Name("VKDATING_MESSAGE", 3);
            VKDATING_MESSAGE = name4;
            Name name5 = new Name("VKDATING_MESSAGE_REACTION", 4);
            VKDATING_MESSAGE_REACTION = name5;
            Name name6 = new Name("VKDATING_SERVICE", 5);
            VKDATING_SERVICE = name6;
            Name name7 = new Name("VKDATING_NEWS_AND_UPDATES", 6);
            VKDATING_NEWS_AND_UPDATES = name7;
            Name name8 = new Name("WLDATING_LIKE", 7);
            WLDATING_LIKE = name8;
            Name name9 = new Name("WLDATING_COMPLIMENT", 8);
            WLDATING_COMPLIMENT = name9;
            Name name10 = new Name("WLDATING_MATCH", 9);
            WLDATING_MATCH = name10;
            Name name11 = new Name("WLDATING_MESSAGE", 10);
            WLDATING_MESSAGE = name11;
            Name name12 = new Name("WLDATING_MESSAGE_REACTION", 11);
            WLDATING_MESSAGE_REACTION = name12;
            Name name13 = new Name("WLDATING_SERVICE", 12);
            WLDATING_SERVICE = name13;
            Name name14 = new Name("WLDATING_NEWS_AND_UPDATES", 13);
            WLDATING_NEWS_AND_UPDATES = name14;
            Name[] nameArr = {name, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14};
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

    public MobileOfficialAppsCorePushesStat$PushChannelItem(boolean z, Name name) {
        this.isEnabled = z;
        this.name = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePushesStat$PushChannelItem)) {
            return false;
        }
        MobileOfficialAppsCorePushesStat$PushChannelItem mobileOfficialAppsCorePushesStat$PushChannelItem = (MobileOfficialAppsCorePushesStat$PushChannelItem) obj;
        return this.isEnabled == mobileOfficialAppsCorePushesStat$PushChannelItem.isEnabled && this.name == mobileOfficialAppsCorePushesStat$PushChannelItem.name;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Name name = this.name;
        return hashCode + (name == null ? 0 : name.hashCode());
    }

    public final String toString() {
        return "PushChannelItem(isEnabled=" + this.isEnabled + ", name=" + this.name + ')';
    }

    public /* synthetic */ MobileOfficialAppsCorePushesStat$PushChannelItem(boolean z, Name name, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : name);
    }
}

package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$OwnerWallSettingsItem {

    @pmi0("name")
    private final Name name;

    @pmi0("privacy")
    private final SchemeStat$PrivacyItem privacy;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("can_comment")
        public static final Name CAN_COMMENT;

        @pmi0("can_post")
        public static final Name CAN_POST;

        @pmi0("view_comments")
        public static final Name VIEW_COMMENTS;

        @pmi0("view_other_user_post")
        public static final Name VIEW_OTHER_USER_POST;

        static {
            Name name = new Name("VIEW_OTHER_USER_POST", 0);
            VIEW_OTHER_USER_POST = name;
            Name name2 = new Name("CAN_POST", 1);
            CAN_POST = name2;
            Name name3 = new Name("VIEW_COMMENTS", 2);
            VIEW_COMMENTS = name3;
            Name name4 = new Name("CAN_COMMENT", 3);
            CAN_COMMENT = name4;
            Name[] nameArr = {name, name2, name3, name4};
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

    public SchemeStat$OwnerWallSettingsItem(Name name, SchemeStat$PrivacyItem schemeStat$PrivacyItem) {
        this.name = name;
        this.privacy = schemeStat$PrivacyItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$OwnerWallSettingsItem)) {
            return false;
        }
        SchemeStat$OwnerWallSettingsItem schemeStat$OwnerWallSettingsItem = (SchemeStat$OwnerWallSettingsItem) obj;
        return this.name == schemeStat$OwnerWallSettingsItem.name && epx.f(this.privacy, schemeStat$OwnerWallSettingsItem.privacy);
    }

    public final int hashCode() {
        return this.privacy.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "OwnerWallSettingsItem(name=" + this.name + ", privacy=" + this.privacy + ')';
    }
}

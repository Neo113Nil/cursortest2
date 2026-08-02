package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$UserMenuEvent {

    @pmi0("user_menu_event_type")
    private final UserMenuEventType userMenuEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class UserMenuEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserMenuEventType[] $VALUES;

        @pmi0("click_to_archive")
        public static final UserMenuEventType CLICK_TO_ARCHIVE;

        @pmi0("click_to_change_cover")
        public static final UserMenuEventType CLICK_TO_CHANGE_COVER;

        @pmi0("click_to_change_profile")
        public static final UserMenuEventType CLICK_TO_CHANGE_PROFILE;

        @pmi0("click_to_dots")
        public static final UserMenuEventType CLICK_TO_DOTS;

        @pmi0("click_to_help")
        public static final UserMenuEventType CLICK_TO_HELP;

        @pmi0("click_to_memories")
        public static final UserMenuEventType CLICK_TO_MEMORIES;

        @pmi0("click_to_settings")
        public static final UserMenuEventType CLICK_TO_SETTINGS;

        @pmi0("click_to_stats")
        public static final UserMenuEventType CLICK_TO_STATS;

        @pmi0("click_to_vk_donut")
        public static final UserMenuEventType CLICK_TO_VK_DONUT;

        @pmi0("copy_link")
        public static final UserMenuEventType COPY_LINK;

        @pmi0("show_qr")
        public static final UserMenuEventType SHOW_QR;

        static {
            UserMenuEventType userMenuEventType = new UserMenuEventType("CLICK_TO_DOTS", 0);
            CLICK_TO_DOTS = userMenuEventType;
            UserMenuEventType userMenuEventType2 = new UserMenuEventType("CLICK_TO_CHANGE_PROFILE", 1);
            CLICK_TO_CHANGE_PROFILE = userMenuEventType2;
            UserMenuEventType userMenuEventType3 = new UserMenuEventType("CLICK_TO_CHANGE_COVER", 2);
            CLICK_TO_CHANGE_COVER = userMenuEventType3;
            UserMenuEventType userMenuEventType4 = new UserMenuEventType("COPY_LINK", 3);
            COPY_LINK = userMenuEventType4;
            UserMenuEventType userMenuEventType5 = new UserMenuEventType("SHOW_QR", 4);
            SHOW_QR = userMenuEventType5;
            UserMenuEventType userMenuEventType6 = new UserMenuEventType("CLICK_TO_ARCHIVE", 5);
            CLICK_TO_ARCHIVE = userMenuEventType6;
            UserMenuEventType userMenuEventType7 = new UserMenuEventType("CLICK_TO_MEMORIES", 6);
            CLICK_TO_MEMORIES = userMenuEventType7;
            UserMenuEventType userMenuEventType8 = new UserMenuEventType("CLICK_TO_STATS", 7);
            CLICK_TO_STATS = userMenuEventType8;
            UserMenuEventType userMenuEventType9 = new UserMenuEventType("CLICK_TO_HELP", 8);
            CLICK_TO_HELP = userMenuEventType9;
            UserMenuEventType userMenuEventType10 = new UserMenuEventType("CLICK_TO_SETTINGS", 9);
            CLICK_TO_SETTINGS = userMenuEventType10;
            UserMenuEventType userMenuEventType11 = new UserMenuEventType("CLICK_TO_VK_DONUT", 10);
            CLICK_TO_VK_DONUT = userMenuEventType11;
            UserMenuEventType[] userMenuEventTypeArr = {userMenuEventType, userMenuEventType2, userMenuEventType3, userMenuEventType4, userMenuEventType5, userMenuEventType6, userMenuEventType7, userMenuEventType8, userMenuEventType9, userMenuEventType10, userMenuEventType11};
            $VALUES = userMenuEventTypeArr;
            $ENTRIES = new asp(userMenuEventTypeArr);
        }

        private UserMenuEventType(String str, int i) {
        }

        public static UserMenuEventType valueOf(String str) {
            return (UserMenuEventType) Enum.valueOf(UserMenuEventType.class, str);
        }

        public static UserMenuEventType[] values() {
            return (UserMenuEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$UserMenuEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsProfileStat$UserMenuEvent) && this.userMenuEventType == ((MobileOfficialAppsProfileStat$UserMenuEvent) obj).userMenuEventType;
    }

    public final int hashCode() {
        UserMenuEventType userMenuEventType = this.userMenuEventType;
        if (userMenuEventType == null) {
            return 0;
        }
        return userMenuEventType.hashCode();
    }

    public final String toString() {
        return "UserMenuEvent(userMenuEventType=" + this.userMenuEventType + ')';
    }

    public MobileOfficialAppsProfileStat$UserMenuEvent(UserMenuEventType userMenuEventType) {
        this.userMenuEventType = userMenuEventType;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$UserMenuEvent(UserMenuEventType userMenuEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userMenuEventType);
    }
}

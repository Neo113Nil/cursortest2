package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent {

    @pmi0("another_user_profile_menu_event_type")
    private final AnotherUserProfileMenuEventType anotherUserProfileMenuEventType;

    @pmi0("service_item")
    private final MobileOfficialAppsProfileStat$ServiceItem serviceItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class AnotherUserProfileMenuEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnotherUserProfileMenuEventType[] $VALUES;

        @pmi0("add_to_best_friends")
        public static final AnotherUserProfileMenuEventType ADD_TO_BEST_FRIENDS;

        @pmi0("add_to_bookmarks")
        public static final AnotherUserProfileMenuEventType ADD_TO_BOOKMARKS;

        @pmi0("add_to_chat")
        public static final AnotherUserProfileMenuEventType ADD_TO_CHAT;

        @pmi0("block")
        public static final AnotherUserProfileMenuEventType BLOCK;

        @pmi0("claim")
        public static final AnotherUserProfileMenuEventType CLAIM;

        @pmi0("click_to_app_button")
        public static final AnotherUserProfileMenuEventType CLICK_TO_APP_BUTTON;

        @pmi0("click_to_gifts")
        public static final AnotherUserProfileMenuEventType CLICK_TO_GIFTS;

        @pmi0("click_to_money")
        public static final AnotherUserProfileMenuEventType CLICK_TO_MONEY;

        @pmi0("click_to_third_party_button")
        public static final AnotherUserProfileMenuEventType CLICK_TO_THIRD_PARTY_BUTTON;

        @pmi0("remove_from_best_friends")
        public static final AnotherUserProfileMenuEventType REMOVE_FROM_BEST_FRIENDS;

        @pmi0("remove_from_bookmarks")
        public static final AnotherUserProfileMenuEventType REMOVE_FROM_BOOKMARKS;

        @pmi0("share_page")
        public static final AnotherUserProfileMenuEventType SHARE_PAGE;

        static {
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType = new AnotherUserProfileMenuEventType("ADD_TO_BEST_FRIENDS", 0);
            ADD_TO_BEST_FRIENDS = anotherUserProfileMenuEventType;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType2 = new AnotherUserProfileMenuEventType("REMOVE_FROM_BEST_FRIENDS", 1);
            REMOVE_FROM_BEST_FRIENDS = anotherUserProfileMenuEventType2;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType3 = new AnotherUserProfileMenuEventType("ADD_TO_BOOKMARKS", 2);
            ADD_TO_BOOKMARKS = anotherUserProfileMenuEventType3;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType4 = new AnotherUserProfileMenuEventType("REMOVE_FROM_BOOKMARKS", 3);
            REMOVE_FROM_BOOKMARKS = anotherUserProfileMenuEventType4;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType5 = new AnotherUserProfileMenuEventType("SHARE_PAGE", 4);
            SHARE_PAGE = anotherUserProfileMenuEventType5;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType6 = new AnotherUserProfileMenuEventType("CLAIM", 5);
            CLAIM = anotherUserProfileMenuEventType6;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType7 = new AnotherUserProfileMenuEventType("BLOCK", 6);
            BLOCK = anotherUserProfileMenuEventType7;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType8 = new AnotherUserProfileMenuEventType("ADD_TO_CHAT", 7);
            ADD_TO_CHAT = anotherUserProfileMenuEventType8;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType9 = new AnotherUserProfileMenuEventType("CLICK_TO_MONEY", 8);
            CLICK_TO_MONEY = anotherUserProfileMenuEventType9;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType10 = new AnotherUserProfileMenuEventType("CLICK_TO_GIFTS", 9);
            CLICK_TO_GIFTS = anotherUserProfileMenuEventType10;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType11 = new AnotherUserProfileMenuEventType("CLICK_TO_APP_BUTTON", 10);
            CLICK_TO_APP_BUTTON = anotherUserProfileMenuEventType11;
            AnotherUserProfileMenuEventType anotherUserProfileMenuEventType12 = new AnotherUserProfileMenuEventType("CLICK_TO_THIRD_PARTY_BUTTON", 11);
            CLICK_TO_THIRD_PARTY_BUTTON = anotherUserProfileMenuEventType12;
            AnotherUserProfileMenuEventType[] anotherUserProfileMenuEventTypeArr = {anotherUserProfileMenuEventType, anotherUserProfileMenuEventType2, anotherUserProfileMenuEventType3, anotherUserProfileMenuEventType4, anotherUserProfileMenuEventType5, anotherUserProfileMenuEventType6, anotherUserProfileMenuEventType7, anotherUserProfileMenuEventType8, anotherUserProfileMenuEventType9, anotherUserProfileMenuEventType10, anotherUserProfileMenuEventType11, anotherUserProfileMenuEventType12};
            $VALUES = anotherUserProfileMenuEventTypeArr;
            $ENTRIES = new asp(anotherUserProfileMenuEventTypeArr);
        }

        private AnotherUserProfileMenuEventType(String str, int i) {
        }

        public static AnotherUserProfileMenuEventType valueOf(String str) {
            return (AnotherUserProfileMenuEventType) Enum.valueOf(AnotherUserProfileMenuEventType.class, str);
        }

        public static AnotherUserProfileMenuEventType[] values() {
            return (AnotherUserProfileMenuEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent)) {
            return false;
        }
        MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent = (MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent) obj;
        return this.anotherUserProfileMenuEventType == mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.anotherUserProfileMenuEventType && epx.f(this.serviceItem, mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.serviceItem);
    }

    public final int hashCode() {
        AnotherUserProfileMenuEventType anotherUserProfileMenuEventType = this.anotherUserProfileMenuEventType;
        int hashCode = (anotherUserProfileMenuEventType == null ? 0 : anotherUserProfileMenuEventType.hashCode()) * 31;
        MobileOfficialAppsProfileStat$ServiceItem mobileOfficialAppsProfileStat$ServiceItem = this.serviceItem;
        return hashCode + (mobileOfficialAppsProfileStat$ServiceItem != null ? mobileOfficialAppsProfileStat$ServiceItem.hashCode() : 0);
    }

    public final String toString() {
        return "AnotherUserProfileMenuEvent(anotherUserProfileMenuEventType=" + this.anotherUserProfileMenuEventType + ", serviceItem=" + this.serviceItem + ')';
    }

    public MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent(AnotherUserProfileMenuEventType anotherUserProfileMenuEventType, MobileOfficialAppsProfileStat$ServiceItem mobileOfficialAppsProfileStat$ServiceItem) {
        this.anotherUserProfileMenuEventType = anotherUserProfileMenuEventType;
        this.serviceItem = mobileOfficialAppsProfileStat$ServiceItem;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent(AnotherUserProfileMenuEventType anotherUserProfileMenuEventType, MobileOfficialAppsProfileStat$ServiceItem mobileOfficialAppsProfileStat$ServiceItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : anotherUserProfileMenuEventType, (i & 2) != 0 ? null : mobileOfficialAppsProfileStat$ServiceItem);
    }
}

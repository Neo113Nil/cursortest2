package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$ClickEvent implements MobileOfficialAppsGroupsStat$TypeGroupsEventItem.b {

    @pmi0("click_event_type")
    private final ClickEventType clickEventType;

    @pmi0("event_data")
    private final String eventData;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class ClickEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickEventType[] $VALUES;

        @pmi0("action_menu_comments")
        public static final ClickEventType ACTION_MENU_COMMENTS;

        @pmi0("action_menu_gim")
        public static final ClickEventType ACTION_MENU_GIM;

        @pmi0("click_ads_promotion_button")
        public static final ClickEventType CLICK_ADS_PROMOTION_BUTTON;

        @pmi0("click_avito_account_link")
        public static final ClickEventType CLICK_AVITO_ACCOUNT_LINK;

        @pmi0("click_community_page_navbar")
        public static final ClickEventType CLICK_COMMUNITY_PAGE_NAVBAR;

        @pmi0("click_menu_item")
        public static final ClickEventType CLICK_MENU_ITEM;

        @pmi0("click_to_add_content")
        public static final ClickEventType CLICK_TO_ADD_CONTENT;

        @pmi0("click_to_avatar")
        public static final ClickEventType CLICK_TO_AVATAR;

        @pmi0("click_to_change_avatar")
        public static final ClickEventType CLICK_TO_CHANGE_AVATAR;

        @pmi0("click_to_channel_button")
        public static final ClickEventType CLICK_TO_CHANNEL_BUTTON;

        @pmi0("click_to_channel_posting_button")
        public static final ClickEventType CLICK_TO_CHANNEL_POSTING_BUTTON;

        @pmi0("click_to_create_story")
        public static final ClickEventType CLICK_TO_CREATE_STORY;

        @pmi0("click_to_more_content")
        public static final ClickEventType CLICK_TO_MORE_CONTENT;

        @pmi0("click_to_open_photo")
        public static final ClickEventType CLICK_TO_OPEN_PHOTO;

        @pmi0("click_to_ozon_invite_banner_adb_button")
        public static final ClickEventType CLICK_TO_OZON_INVITE_BANNER_ADB_BUTTON;

        @pmi0("click_to_section")
        public static final ClickEventType CLICK_TO_SECTION;

        @pmi0("click_to_tab")
        public static final ClickEventType CLICK_TO_TAB;

        @pmi0("click_to_user_close_ozon_invite_banner_adb")
        public static final ClickEventType CLICK_TO_USER_CLOSE_OZON_INVITE_BANNER_ADB;

        @pmi0("click_to_view_story")
        public static final ClickEventType CLICK_TO_VIEW_STORY;

        @pmi0("click_website")
        public static final ClickEventType CLICK_WEBSITE;

        @pmi0("complain_about_community")
        public static final ClickEventType COMPLAIN_ABOUT_COMMUNITY;

        @pmi0("disable_community_messages")
        public static final ClickEventType DISABLE_COMMUNITY_MESSAGES;

        @pmi0("enable_community_messages")
        public static final ClickEventType ENABLE_COMMUNITY_MESSAGES;

        @pmi0("modal_sharing_open")
        public static final ClickEventType MODAL_SHARING_OPEN;

        @pmi0("open_info")
        public static final ClickEventType OPEN_INFO;

        @pmi0("open_info_settings")
        public static final ClickEventType OPEN_INFO_SETTINGS;

        @pmi0("open_invitation_friend_list")
        public static final ClickEventType OPEN_INVITATION_FRIEND_LIST;

        @pmi0("open_messages")
        public static final ClickEventType OPEN_MESSAGES;

        @pmi0("open_musician_card")
        public static final ClickEventType OPEN_MUSICIAN_CARD;

        @pmi0("open_original_creator_fund_settings")
        public static final ClickEventType OPEN_ORIGINAL_CREATOR_FUND_SETTINGS;

        @pmi0("open_purchase_info")
        public static final ClickEventType OPEN_PURCHASE_INFO;

        @pmi0("open_similar_groups")
        public static final ClickEventType OPEN_SIMILAR_GROUPS;

        @pmi0("open_subscribed_dons_list")
        public static final ClickEventType OPEN_SUBSCRIBED_DONS_LIST;

        @pmi0("open_subscribed_friends_list")
        public static final ClickEventType OPEN_SUBSCRIBED_FRIENDS_LIST;

        @pmi0("open_subscribed_list")
        public static final ClickEventType OPEN_SUBSCRIBED_LIST;

        @pmi0("open_tabs_settings")
        public static final ClickEventType OPEN_TABS_SETTINGS;

        @pmi0("share_to_message")
        public static final ClickEventType SHARE_TO_MESSAGE;

        static {
            ClickEventType clickEventType = new ClickEventType("CLICK_COMMUNITY_PAGE_NAVBAR", 0);
            CLICK_COMMUNITY_PAGE_NAVBAR = clickEventType;
            ClickEventType clickEventType2 = new ClickEventType("ENABLE_COMMUNITY_MESSAGES", 1);
            ENABLE_COMMUNITY_MESSAGES = clickEventType2;
            ClickEventType clickEventType3 = new ClickEventType("DISABLE_COMMUNITY_MESSAGES", 2);
            DISABLE_COMMUNITY_MESSAGES = clickEventType3;
            ClickEventType clickEventType4 = new ClickEventType("CLICK_ADS_PROMOTION_BUTTON", 3);
            CLICK_ADS_PROMOTION_BUTTON = clickEventType4;
            ClickEventType clickEventType5 = new ClickEventType("OPEN_TABS_SETTINGS", 4);
            OPEN_TABS_SETTINGS = clickEventType5;
            ClickEventType clickEventType6 = new ClickEventType("OPEN_SUBSCRIBED_LIST", 5);
            OPEN_SUBSCRIBED_LIST = clickEventType6;
            ClickEventType clickEventType7 = new ClickEventType("OPEN_SUBSCRIBED_FRIENDS_LIST", 6);
            OPEN_SUBSCRIBED_FRIENDS_LIST = clickEventType7;
            ClickEventType clickEventType8 = new ClickEventType("OPEN_SUBSCRIBED_DONS_LIST", 7);
            OPEN_SUBSCRIBED_DONS_LIST = clickEventType8;
            ClickEventType clickEventType9 = new ClickEventType("OPEN_MUSICIAN_CARD", 8);
            OPEN_MUSICIAN_CARD = clickEventType9;
            ClickEventType clickEventType10 = new ClickEventType("CLICK_AVITO_ACCOUNT_LINK", 9);
            CLICK_AVITO_ACCOUNT_LINK = clickEventType10;
            ClickEventType clickEventType11 = new ClickEventType("COMPLAIN_ABOUT_COMMUNITY", 10);
            COMPLAIN_ABOUT_COMMUNITY = clickEventType11;
            ClickEventType clickEventType12 = new ClickEventType("OPEN_INFO_SETTINGS", 11);
            OPEN_INFO_SETTINGS = clickEventType12;
            ClickEventType clickEventType13 = new ClickEventType("OPEN_SIMILAR_GROUPS", 12);
            OPEN_SIMILAR_GROUPS = clickEventType13;
            ClickEventType clickEventType14 = new ClickEventType("OPEN_INVITATION_FRIEND_LIST", 13);
            OPEN_INVITATION_FRIEND_LIST = clickEventType14;
            ClickEventType clickEventType15 = new ClickEventType("CLICK_TO_CHANNEL_BUTTON", 14);
            CLICK_TO_CHANNEL_BUTTON = clickEventType15;
            ClickEventType clickEventType16 = new ClickEventType("CLICK_TO_CHANNEL_POSTING_BUTTON", 15);
            CLICK_TO_CHANNEL_POSTING_BUTTON = clickEventType16;
            ClickEventType clickEventType17 = new ClickEventType("OPEN_ORIGINAL_CREATOR_FUND_SETTINGS", 16);
            OPEN_ORIGINAL_CREATOR_FUND_SETTINGS = clickEventType17;
            ClickEventType clickEventType18 = new ClickEventType("CLICK_TO_AVATAR", 17);
            CLICK_TO_AVATAR = clickEventType18;
            ClickEventType clickEventType19 = new ClickEventType("CLICK_TO_OPEN_PHOTO", 18);
            CLICK_TO_OPEN_PHOTO = clickEventType19;
            ClickEventType clickEventType20 = new ClickEventType("CLICK_TO_CHANGE_AVATAR", 19);
            CLICK_TO_CHANGE_AVATAR = clickEventType20;
            ClickEventType clickEventType21 = new ClickEventType("CLICK_TO_VIEW_STORY", 20);
            CLICK_TO_VIEW_STORY = clickEventType21;
            ClickEventType clickEventType22 = new ClickEventType("CLICK_TO_TAB", 21);
            CLICK_TO_TAB = clickEventType22;
            ClickEventType clickEventType23 = new ClickEventType("CLICK_TO_MORE_CONTENT", 22);
            CLICK_TO_MORE_CONTENT = clickEventType23;
            ClickEventType clickEventType24 = new ClickEventType("CLICK_MENU_ITEM", 23);
            CLICK_MENU_ITEM = clickEventType24;
            ClickEventType clickEventType25 = new ClickEventType("CLICK_WEBSITE", 24);
            CLICK_WEBSITE = clickEventType25;
            ClickEventType clickEventType26 = new ClickEventType("ACTION_MENU_GIM", 25);
            ACTION_MENU_GIM = clickEventType26;
            ClickEventType clickEventType27 = new ClickEventType("CLICK_TO_ADD_CONTENT", 26);
            CLICK_TO_ADD_CONTENT = clickEventType27;
            ClickEventType clickEventType28 = new ClickEventType("ACTION_MENU_COMMENTS", 27);
            ACTION_MENU_COMMENTS = clickEventType28;
            ClickEventType clickEventType29 = new ClickEventType("OPEN_MESSAGES", 28);
            OPEN_MESSAGES = clickEventType29;
            ClickEventType clickEventType30 = new ClickEventType("OPEN_PURCHASE_INFO", 29);
            OPEN_PURCHASE_INFO = clickEventType30;
            ClickEventType clickEventType31 = new ClickEventType("CLICK_TO_CREATE_STORY", 30);
            CLICK_TO_CREATE_STORY = clickEventType31;
            ClickEventType clickEventType32 = new ClickEventType("CLICK_TO_OZON_INVITE_BANNER_ADB_BUTTON", 31);
            CLICK_TO_OZON_INVITE_BANNER_ADB_BUTTON = clickEventType32;
            ClickEventType clickEventType33 = new ClickEventType("CLICK_TO_USER_CLOSE_OZON_INVITE_BANNER_ADB", 32);
            CLICK_TO_USER_CLOSE_OZON_INVITE_BANNER_ADB = clickEventType33;
            ClickEventType clickEventType34 = new ClickEventType("OPEN_INFO", 33);
            OPEN_INFO = clickEventType34;
            ClickEventType clickEventType35 = new ClickEventType("MODAL_SHARING_OPEN", 34);
            MODAL_SHARING_OPEN = clickEventType35;
            ClickEventType clickEventType36 = new ClickEventType("SHARE_TO_MESSAGE", 35);
            SHARE_TO_MESSAGE = clickEventType36;
            ClickEventType clickEventType37 = new ClickEventType("CLICK_TO_SECTION", 36);
            CLICK_TO_SECTION = clickEventType37;
            ClickEventType[] clickEventTypeArr = {clickEventType, clickEventType2, clickEventType3, clickEventType4, clickEventType5, clickEventType6, clickEventType7, clickEventType8, clickEventType9, clickEventType10, clickEventType11, clickEventType12, clickEventType13, clickEventType14, clickEventType15, clickEventType16, clickEventType17, clickEventType18, clickEventType19, clickEventType20, clickEventType21, clickEventType22, clickEventType23, clickEventType24, clickEventType25, clickEventType26, clickEventType27, clickEventType28, clickEventType29, clickEventType30, clickEventType31, clickEventType32, clickEventType33, clickEventType34, clickEventType35, clickEventType36, clickEventType37};
            $VALUES = clickEventTypeArr;
            $ENTRIES = new asp(clickEventTypeArr);
        }

        private ClickEventType(String str, int i) {
        }

        public static ClickEventType valueOf(String str) {
            return (ClickEventType) Enum.valueOf(ClickEventType.class, str);
        }

        public static ClickEventType[] values() {
            return (ClickEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("block_header_community")
        public static final Source BLOCK_HEADER_COMMUNITY;

        @pmi0("community_navbar")
        public static final Source COMMUNITY_NAVBAR;

        @pmi0("market")
        public static final Source MARKET;

        @pmi0("marketplace")
        public static final Source MARKETPLACE;

        @pmi0("ozon_invite_banner_adb")
        public static final Source OZON_INVITE_BANNER_ADB;

        @pmi0("title_dropdown")
        public static final Source TITLE_DROPDOWN;

        static {
            Source source = new Source("TITLE_DROPDOWN", 0);
            TITLE_DROPDOWN = source;
            Source source2 = new Source("BLOCK_HEADER_COMMUNITY", 1);
            BLOCK_HEADER_COMMUNITY = source2;
            Source source3 = new Source("MARKETPLACE", 2);
            MARKETPLACE = source3;
            Source source4 = new Source("MARKET", 3);
            MARKET = source4;
            Source source5 = new Source("COMMUNITY_NAVBAR", 4);
            COMMUNITY_NAVBAR = source5;
            Source source6 = new Source("OZON_INVITE_BANNER_ADB", 5);
            OZON_INVITE_BANNER_ADB = source6;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public CommonCommunitiesStat$ClickEvent(ClickEventType clickEventType, Source source, String str) {
        this.clickEventType = clickEventType;
        this.source = source;
        this.eventData = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$ClickEvent)) {
            return false;
        }
        CommonCommunitiesStat$ClickEvent commonCommunitiesStat$ClickEvent = (CommonCommunitiesStat$ClickEvent) obj;
        return this.clickEventType == commonCommunitiesStat$ClickEvent.clickEventType && this.source == commonCommunitiesStat$ClickEvent.source && epx.f(this.eventData, commonCommunitiesStat$ClickEvent.eventData);
    }

    public final int hashCode() {
        int hashCode = this.clickEventType.hashCode() * 31;
        Source source = this.source;
        int hashCode2 = (hashCode + (source == null ? 0 : source.hashCode())) * 31;
        String str = this.eventData;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickEvent(clickEventType=");
        sb.append(this.clickEventType);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", eventData=");
        return ho8.a(sb, this.eventData, ')');
    }

    public /* synthetic */ CommonCommunitiesStat$ClickEvent(ClickEventType clickEventType, Source source, String str, int i, zcl zclVar) {
        this(clickEventType, (i & 2) != 0 ? null : source, (i & 4) != 0 ? null : str);
    }
}

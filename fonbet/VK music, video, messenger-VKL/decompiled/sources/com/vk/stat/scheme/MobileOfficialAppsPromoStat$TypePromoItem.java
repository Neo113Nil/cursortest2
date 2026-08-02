package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsPromoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsPromoStat$TypePromoItem {

    @pmi0("component_type")
    private final ComponentType componentType;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("name")
    private final MobileOfficialAppsPromoStat$TypePromoName name;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsPromoStat.kt */
    public static final class ComponentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ComponentType[] $VALUES;

        @pmi0("banner")
        public static final ComponentType BANNER;

        @pmi0("modal_card")
        public static final ComponentType MODAL_CARD;

        @pmi0("snackbar")
        public static final ComponentType SNACKBAR;

        static {
            ComponentType componentType = new ComponentType("SNACKBAR", 0);
            SNACKBAR = componentType;
            ComponentType componentType2 = new ComponentType("MODAL_CARD", 1);
            MODAL_CARD = componentType2;
            ComponentType componentType3 = new ComponentType("BANNER", 2);
            BANNER = componentType3;
            ComponentType[] componentTypeArr = {componentType, componentType2, componentType3};
            $VALUES = componentTypeArr;
            $ENTRIES = new asp(componentTypeArr);
        }

        private ComponentType(String str, int i) {
        }

        public static ComponentType valueOf(String str) {
            return (ComponentType) Enum.valueOf(ComponentType.class, str);
        }

        public static ComponentType[] values() {
            return (ComponentType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsPromoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("from_bell_notification")
        public static final EventSubtype FROM_BELL_NOTIFICATION;

        @pmi0("from_bookmarks_all")
        public static final EventSubtype FROM_BOOKMARKS_ALL;

        @pmi0("from_bookmarks_video")
        public static final EventSubtype FROM_BOOKMARKS_VIDEO;

        @pmi0("from_search_all_video")
        public static final EventSubtype FROM_SEARCH_ALL_VIDEO;

        @pmi0("from_search_all_video_recommendation")
        public static final EventSubtype FROM_SEARCH_ALL_VIDEO_RECOMMENDATION;

        @pmi0("from_search_for_video")
        public static final EventSubtype FROM_SEARCH_FOR_VIDEO;

        @pmi0("from_search_music_show_all")
        public static final EventSubtype FROM_SEARCH_MUSIC_SHOW_ALL;

        @pmi0("from_search_music_video")
        public static final EventSubtype FROM_SEARCH_MUSIC_VIDEO;

        @pmi0("from_search_video_recommendation")
        public static final EventSubtype FROM_SEARCH_VIDEO_RECOMMENDATION;

        @pmi0("from_video_all_video")
        public static final EventSubtype FROM_VIDEO_ALL_VIDEO;

        @pmi0("from_video_recommendation_feed")
        public static final EventSubtype FROM_VIDEO_RECOMMENDATION_FEED;

        @pmi0("from_video_recommendation_show_more")
        public static final EventSubtype FROM_VIDEO_RECOMMENDATION_SHOW_MORE;

        @pmi0("from_vk_video_menu")
        public static final EventSubtype FROM_VK_VIDEO_MENU;

        @pmi0("from_vk_video_tabbar")
        public static final EventSubtype FROM_VK_VIDEO_TABBAR;

        @pmi0("from_watch_full_video")
        public static final EventSubtype FROM_WATCH_FULL_VIDEO;

        static {
            EventSubtype eventSubtype = new EventSubtype("FROM_VK_VIDEO_TABBAR", 0);
            FROM_VK_VIDEO_TABBAR = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("FROM_VK_VIDEO_MENU", 1);
            FROM_VK_VIDEO_MENU = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("FROM_VIDEO_ALL_VIDEO", 2);
            FROM_VIDEO_ALL_VIDEO = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("FROM_VIDEO_RECOMMENDATION_SHOW_MORE", 3);
            FROM_VIDEO_RECOMMENDATION_SHOW_MORE = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("FROM_VIDEO_RECOMMENDATION_FEED", 4);
            FROM_VIDEO_RECOMMENDATION_FEED = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("FROM_SEARCH_ALL_VIDEO", 5);
            FROM_SEARCH_ALL_VIDEO = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("FROM_SEARCH_ALL_VIDEO_RECOMMENDATION", 6);
            FROM_SEARCH_ALL_VIDEO_RECOMMENDATION = eventSubtype7;
            EventSubtype eventSubtype8 = new EventSubtype("FROM_SEARCH_VIDEO_RECOMMENDATION", 7);
            FROM_SEARCH_VIDEO_RECOMMENDATION = eventSubtype8;
            EventSubtype eventSubtype9 = new EventSubtype("FROM_SEARCH_MUSIC_VIDEO", 8);
            FROM_SEARCH_MUSIC_VIDEO = eventSubtype9;
            EventSubtype eventSubtype10 = new EventSubtype("FROM_SEARCH_MUSIC_SHOW_ALL", 9);
            FROM_SEARCH_MUSIC_SHOW_ALL = eventSubtype10;
            EventSubtype eventSubtype11 = new EventSubtype("FROM_SEARCH_FOR_VIDEO", 10);
            FROM_SEARCH_FOR_VIDEO = eventSubtype11;
            EventSubtype eventSubtype12 = new EventSubtype("FROM_BOOKMARKS_ALL", 11);
            FROM_BOOKMARKS_ALL = eventSubtype12;
            EventSubtype eventSubtype13 = new EventSubtype("FROM_BOOKMARKS_VIDEO", 12);
            FROM_BOOKMARKS_VIDEO = eventSubtype13;
            EventSubtype eventSubtype14 = new EventSubtype("FROM_WATCH_FULL_VIDEO", 13);
            FROM_WATCH_FULL_VIDEO = eventSubtype14;
            EventSubtype eventSubtype15 = new EventSubtype("FROM_BELL_NOTIFICATION", 14);
            FROM_BELL_NOTIFICATION = eventSubtype15;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7, eventSubtype8, eventSubtype9, eventSubtype10, eventSubtype11, eventSubtype12, eventSubtype13, eventSubtype14, eventSubtype15};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsPromoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("vk_video_promo_enter")
        public static final EventType VK_VIDEO_PROMO_ENTER;

        @pmi0("vk_video_promo_tooltip_close")
        public static final EventType VK_VIDEO_PROMO_TOOLTIP_CLOSE;

        @pmi0("vk_video_promo_tooltip_download")
        public static final EventType VK_VIDEO_PROMO_TOOLTIP_DOWNLOAD;

        @pmi0("vk_video_promo_tooltip_not_interested")
        public static final EventType VK_VIDEO_PROMO_TOOLTIP_NOT_INTERESTED;

        @pmi0("vk_video_promo_tooltip_show")
        public static final EventType VK_VIDEO_PROMO_TOOLTIP_SHOW;

        static {
            EventType eventType = new EventType("VK_VIDEO_PROMO_TOOLTIP_SHOW", 0);
            VK_VIDEO_PROMO_TOOLTIP_SHOW = eventType;
            EventType eventType2 = new EventType("VK_VIDEO_PROMO_TOOLTIP_DOWNLOAD", 1);
            VK_VIDEO_PROMO_TOOLTIP_DOWNLOAD = eventType2;
            EventType eventType3 = new EventType("VK_VIDEO_PROMO_TOOLTIP_NOT_INTERESTED", 2);
            VK_VIDEO_PROMO_TOOLTIP_NOT_INTERESTED = eventType3;
            EventType eventType4 = new EventType("VK_VIDEO_PROMO_TOOLTIP_CLOSE", 3);
            VK_VIDEO_PROMO_TOOLTIP_CLOSE = eventType4;
            EventType eventType5 = new EventType("VK_VIDEO_PROMO_ENTER", 4);
            VK_VIDEO_PROMO_ENTER = eventType5;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsPromoStat$TypePromoItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsPromoStat$TypePromoItem)) {
            return false;
        }
        MobileOfficialAppsPromoStat$TypePromoItem mobileOfficialAppsPromoStat$TypePromoItem = (MobileOfficialAppsPromoStat$TypePromoItem) obj;
        return this.name == mobileOfficialAppsPromoStat$TypePromoItem.name && this.eventType == mobileOfficialAppsPromoStat$TypePromoItem.eventType && this.eventSubtype == mobileOfficialAppsPromoStat$TypePromoItem.eventSubtype && this.componentType == mobileOfficialAppsPromoStat$TypePromoItem.componentType;
    }

    public final int hashCode() {
        MobileOfficialAppsPromoStat$TypePromoName mobileOfficialAppsPromoStat$TypePromoName = this.name;
        int hashCode = (mobileOfficialAppsPromoStat$TypePromoName == null ? 0 : mobileOfficialAppsPromoStat$TypePromoName.hashCode()) * 31;
        EventType eventType = this.eventType;
        int hashCode2 = (hashCode + (eventType == null ? 0 : eventType.hashCode())) * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode3 = (hashCode2 + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        ComponentType componentType = this.componentType;
        return hashCode3 + (componentType != null ? componentType.hashCode() : 0);
    }

    public final String toString() {
        return "TypePromoItem(name=" + this.name + ", eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", componentType=" + this.componentType + ')';
    }

    public MobileOfficialAppsPromoStat$TypePromoItem(MobileOfficialAppsPromoStat$TypePromoName mobileOfficialAppsPromoStat$TypePromoName, EventType eventType, EventSubtype eventSubtype, ComponentType componentType) {
        this.name = mobileOfficialAppsPromoStat$TypePromoName;
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.componentType = componentType;
    }

    public /* synthetic */ MobileOfficialAppsPromoStat$TypePromoItem(MobileOfficialAppsPromoStat$TypePromoName mobileOfficialAppsPromoStat$TypePromoName, EventType eventType, EventSubtype eventSubtype, ComponentType componentType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsPromoStat$TypePromoName, (i & 2) != 0 ? null : eventType, (i & 4) != 0 ? null : eventSubtype, (i & 8) != 0 ? null : componentType);
    }
}

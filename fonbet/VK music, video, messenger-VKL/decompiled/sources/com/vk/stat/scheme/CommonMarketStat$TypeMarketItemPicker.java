package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketItemPicker implements MobileOfficialAppsMarketStat$TypeMarketClick.b, MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("content_owner_id")
    private final Long contentOwnerId;

    @pmi0("creation_session_id")
    private final Integer creationSessionId;

    @pmi0("event_name")
    private final EventName eventName;

    @pmi0("item_owner_id")
    private final Long itemOwnerId;

    @pmi0("ref_source")
    private final CommonMarketStat$TypeRefSource refSource;

    @pmi0("tab_name")
    private final TabName tabName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class EventName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventName[] $VALUES;

        @pmi0("click_change_market_visibility")
        public static final EventName CLICK_CHANGE_MARKET_VISIBILITY;

        @pmi0("click_close_item_picker")
        public static final EventName CLICK_CLOSE_ITEM_PICKER;

        @pmi0("click_product_creation")
        public static final EventName CLICK_PRODUCT_CREATION;

        @pmi0("click_search_product")
        public static final EventName CLICK_SEARCH_PRODUCT;

        @pmi0("view_product_tab")
        public static final EventName VIEW_PRODUCT_TAB;

        static {
            EventName eventName = new EventName("CLICK_PRODUCT_CREATION", 0);
            CLICK_PRODUCT_CREATION = eventName;
            EventName eventName2 = new EventName("CLICK_SEARCH_PRODUCT", 1);
            CLICK_SEARCH_PRODUCT = eventName2;
            EventName eventName3 = new EventName("CLICK_CLOSE_ITEM_PICKER", 2);
            CLICK_CLOSE_ITEM_PICKER = eventName3;
            EventName eventName4 = new EventName("CLICK_CHANGE_MARKET_VISIBILITY", 3);
            CLICK_CHANGE_MARKET_VISIBILITY = eventName4;
            EventName eventName5 = new EventName("VIEW_PRODUCT_TAB", 4);
            VIEW_PRODUCT_TAB = eventName5;
            EventName[] eventNameArr = {eventName, eventName2, eventName3, eventName4, eventName5};
            $VALUES = eventNameArr;
            $ENTRIES = new asp(eventNameArr);
        }

        private EventName(String str, int i) {
        }

        public static EventName valueOf(String str) {
            return (EventName) Enum.valueOf(EventName.class, str);
        }

        public static EventName[] values() {
            return (EventName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class TabName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TabName[] $VALUES;

        @pmi0("bookmarks")
        public static final TabName BOOKMARKS;

        @pmi0("community")
        public static final TabName COMMUNITY;

        static {
            TabName tabName = new TabName("COMMUNITY", 0);
            COMMUNITY = tabName;
            TabName tabName2 = new TabName("BOOKMARKS", 1);
            BOOKMARKS = tabName2;
            TabName[] tabNameArr = {tabName, tabName2};
            $VALUES = tabNameArr;
            $ENTRIES = new asp(tabNameArr);
        }

        private TabName(String str, int i) {
        }

        public static TabName valueOf(String str) {
            return (TabName) Enum.valueOf(TabName.class, str);
        }

        public static TabName[] values() {
            return (TabName[]) $VALUES.clone();
        }
    }

    public CommonMarketStat$TypeMarketItemPicker(EventName eventName, Long l, TabName tabName, Long l2, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        this.eventName = eventName;
        this.contentOwnerId = l;
        this.tabName = tabName;
        this.itemOwnerId = l2;
        this.creationSessionId = num;
        this.refSource = commonMarketStat$TypeRefSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketItemPicker)) {
            return false;
        }
        CommonMarketStat$TypeMarketItemPicker commonMarketStat$TypeMarketItemPicker = (CommonMarketStat$TypeMarketItemPicker) obj;
        return this.eventName == commonMarketStat$TypeMarketItemPicker.eventName && epx.f(this.contentOwnerId, commonMarketStat$TypeMarketItemPicker.contentOwnerId) && this.tabName == commonMarketStat$TypeMarketItemPicker.tabName && epx.f(this.itemOwnerId, commonMarketStat$TypeMarketItemPicker.itemOwnerId) && epx.f(this.creationSessionId, commonMarketStat$TypeMarketItemPicker.creationSessionId) && this.refSource == commonMarketStat$TypeMarketItemPicker.refSource;
    }

    public final int hashCode() {
        int hashCode = this.eventName.hashCode() * 31;
        Long l = this.contentOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        TabName tabName = this.tabName;
        int hashCode3 = (hashCode2 + (tabName == null ? 0 : tabName.hashCode())) * 31;
        Long l2 = this.itemOwnerId;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.creationSessionId;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.refSource;
        return hashCode5 + (commonMarketStat$TypeRefSource != null ? commonMarketStat$TypeRefSource.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketItemPicker(eventName=" + this.eventName + ", contentOwnerId=" + this.contentOwnerId + ", tabName=" + this.tabName + ", itemOwnerId=" + this.itemOwnerId + ", creationSessionId=" + this.creationSessionId + ", refSource=" + this.refSource + ')';
    }

    public /* synthetic */ CommonMarketStat$TypeMarketItemPicker(EventName eventName, Long l, TabName tabName, Long l2, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, int i, zcl zclVar) {
        this(eventName, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : tabName, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : commonMarketStat$TypeRefSource);
    }
}

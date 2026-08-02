package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("filter_value")
    private final FilterValue filterValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("filter_date")
        public static final EventType FILTER_DATE;

        @pmi0("filter_duration")
        public static final EventType FILTER_DURATION;

        @pmi0("sort_by_date")
        public static final EventType SORT_BY_DATE;

        @pmi0("sort_by_duration")
        public static final EventType SORT_BY_DURATION;

        @pmi0("sort_by_relevance")
        public static final EventType SORT_BY_RELEVANCE;

        static {
            EventType eventType = new EventType("FILTER_DURATION", 0);
            FILTER_DURATION = eventType;
            EventType eventType2 = new EventType("FILTER_DATE", 1);
            FILTER_DATE = eventType2;
            EventType eventType3 = new EventType("SORT_BY_RELEVANCE", 2);
            SORT_BY_RELEVANCE = eventType3;
            EventType eventType4 = new EventType("SORT_BY_DATE", 3);
            SORT_BY_DATE = eventType4;
            EventType eventType5 = new EventType("SORT_BY_DURATION", 4);
            SORT_BY_DURATION = eventType5;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class FilterValue {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FilterValue[] $VALUES;

        @pmi0("any")
        public static final FilterValue ANY;

        @pmi0("day")
        public static final FilterValue DAY;

        @pmi0("long")
        public static final FilterValue LONG;

        @pmi0("month")
        public static final FilterValue MONTH;

        @pmi0("short")
        public static final FilterValue SHORT;

        @pmi0("week")
        public static final FilterValue WEEK;

        @pmi0("year")
        public static final FilterValue YEAR;

        static {
            FilterValue filterValue = new FilterValue("ANY", 0);
            ANY = filterValue;
            FilterValue filterValue2 = new FilterValue("SHORT", 1);
            SHORT = filterValue2;
            FilterValue filterValue3 = new FilterValue("LONG", 2);
            LONG = filterValue3;
            FilterValue filterValue4 = new FilterValue("DAY", 3);
            DAY = filterValue4;
            FilterValue filterValue5 = new FilterValue("WEEK", 4);
            WEEK = filterValue5;
            FilterValue filterValue6 = new FilterValue("MONTH", 5);
            MONTH = filterValue6;
            FilterValue filterValue7 = new FilterValue("YEAR", 6);
            YEAR = filterValue7;
            FilterValue[] filterValueArr = {filterValue, filterValue2, filterValue3, filterValue4, filterValue5, filterValue6, filterValue7};
            $VALUES = filterValueArr;
            $ENTRIES = new asp(filterValueArr);
        }

        private FilterValue(String str, int i) {
        }

        public static FilterValue valueOf(String str) {
            return (FilterValue) Enum.valueOf(FilterValue.class, str);
        }

        public static FilterValue[] values() {
            return (FilterValue[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick(EventType eventType, FilterValue filterValue) {
        this.eventType = eventType;
        this.filterValue = filterValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick = (MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick.eventType && this.filterValue == mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick.filterValue;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        FilterValue filterValue = this.filterValue;
        return hashCode + (filterValue == null ? 0 : filterValue.hashCode());
    }

    public final String toString() {
        return "TypeVideoPlaylistAddItemSearchClick(eventType=" + this.eventType + ", filterValue=" + this.filterValue + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick(EventType eventType, FilterValue filterValue, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : filterValue);
    }
}

package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("sort_latest")
        public static final EventType SORT_LATEST;

        @pmi0("sort_oldest")
        public static final EventType SORT_OLDEST;

        @pmi0("sort_popular")
        public static final EventType SORT_POPULAR;

        static {
            EventType eventType = new EventType("SORT_LATEST", 0);
            SORT_LATEST = eventType;
            EventType eventType2 = new EventType("SORT_POPULAR", 1);
            SORT_POPULAR = eventType2;
            EventType eventType3 = new EventType("SORT_OLDEST", 2);
            SORT_OLDEST = eventType3;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3};
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

    public MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.eventType = eventType;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick = (MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick.eventType && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick.screenMode;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        return hashCode + (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode());
    }

    public final String toString() {
        return "TypeVideoSortCommentsClick(eventType=" + this.eventType + ", screenMode=" + this.screenMode + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}

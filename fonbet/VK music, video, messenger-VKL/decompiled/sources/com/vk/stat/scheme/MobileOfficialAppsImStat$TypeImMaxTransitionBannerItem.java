package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem implements SchemeStat$TypeView.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click")
        public static final EventType CLICK;

        @pmi0("show")
        public static final EventType SHOW;

        static {
            EventType eventType = new EventType("SHOW", 0);
            SHOW = eventType;
            EventType eventType2 = new EventType("CLICK", 1);
            CLICK = eventType2;
            EventType[] eventTypeArr = {eventType, eventType2};
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

    public MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem(CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, EventType eventType) {
        this.trackCode = commonStat$TypeTrackCodeItem;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem = (MobileOfficialAppsImStat$TypeImMaxTransitionBannerItem) obj;
        return epx.f(this.trackCode, mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem.trackCode) && this.eventType == mobileOfficialAppsImStat$TypeImMaxTransitionBannerItem.eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode() + (this.trackCode.a.hashCode() * 31);
    }

    public final String toString() {
        return "TypeImMaxTransitionBannerItem(trackCode=" + this.trackCode + ", eventType=" + this.eventType + ')';
    }
}

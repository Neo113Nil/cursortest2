package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoCardLongtap implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("video_card_longtap")
        public static final EventType VIDEO_CARD_LONGTAP;

        @pmi0("video_card_longtap_onboarding_show")
        public static final EventType VIDEO_CARD_LONGTAP_ONBOARDING_SHOW;

        static {
            EventType eventType = new EventType("VIDEO_CARD_LONGTAP", 0);
            VIDEO_CARD_LONGTAP = eventType;
            EventType eventType2 = new EventType("VIDEO_CARD_LONGTAP_ONBOARDING_SHOW", 1);
            VIDEO_CARD_LONGTAP_ONBOARDING_SHOW = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoCardLongtap(EventType eventType) {
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoCardLongtap) && this.eventType == ((MobileOfficialAppsVideoStat$TypeVideoCardLongtap) obj).eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return "TypeVideoCardLongtap(eventType=" + this.eventType + ')';
    }
}

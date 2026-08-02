package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoLikeClick implements SchemeStat$TypeClick.b {

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

        @pmi0("like")
        public static final EventType LIKE;

        @pmi0("unlike")
        public static final EventType UNLIKE;

        static {
            EventType eventType = new EventType("LIKE", 0);
            LIKE = eventType;
            EventType eventType2 = new EventType("UNLIKE", 1);
            UNLIKE = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoLikeClick(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.eventType = eventType;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoLikeClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoLikeClick mobileOfficialAppsVideoStat$TypeVideoLikeClick = (MobileOfficialAppsVideoStat$TypeVideoLikeClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoLikeClick.eventType && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoLikeClick.screenMode;
    }

    public final int hashCode() {
        return this.screenMode.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoLikeClick(eventType=" + this.eventType + ", screenMode=" + this.screenMode + ')';
    }
}

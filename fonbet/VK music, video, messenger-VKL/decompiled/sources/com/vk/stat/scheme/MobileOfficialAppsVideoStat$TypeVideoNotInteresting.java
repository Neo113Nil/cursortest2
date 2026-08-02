package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoNotInteresting implements SchemeStat$TypeClick.b {

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

        @pmi0("dislike")
        public static final EventType DISLIKE;

        @pmi0("undo_dislike")
        public static final EventType UNDO_DISLIKE;

        static {
            EventType eventType = new EventType("DISLIKE", 0);
            DISLIKE = eventType;
            EventType eventType2 = new EventType("UNDO_DISLIKE", 1);
            UNDO_DISLIKE = eventType2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeVideoNotInteresting() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoNotInteresting)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoNotInteresting mobileOfficialAppsVideoStat$TypeVideoNotInteresting = (MobileOfficialAppsVideoStat$TypeVideoNotInteresting) obj;
        return this.screenMode == mobileOfficialAppsVideoStat$TypeVideoNotInteresting.screenMode && this.eventType == mobileOfficialAppsVideoStat$TypeVideoNotInteresting.eventType;
    }

    public final int hashCode() {
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        int hashCode = (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode()) * 31;
        EventType eventType = this.eventType;
        return hashCode + (eventType != null ? eventType.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoNotInteresting(screenMode=" + this.screenMode + ", eventType=" + this.eventType + ')';
    }

    public MobileOfficialAppsVideoStat$TypeVideoNotInteresting(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, EventType eventType) {
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.eventType = eventType;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoNotInteresting(MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, EventType eventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode, (i & 2) != 0 ? null : eventType);
    }
}

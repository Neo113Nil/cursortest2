package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeDeleteItemClick implements SchemeStat$TypeClick.b {

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

        @pmi0("delete")
        public static final EventType DELETE;

        @pmi0("undo_delete")
        public static final EventType UNDO_DELETE;

        static {
            EventType eventType = new EventType("DELETE", 0);
            DELETE = eventType;
            EventType eventType2 = new EventType("UNDO_DELETE", 1);
            UNDO_DELETE = eventType2;
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
    public MobileOfficialAppsVideoStat$TypeDeleteItemClick() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeDeleteItemClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeDeleteItemClick mobileOfficialAppsVideoStat$TypeDeleteItemClick = (MobileOfficialAppsVideoStat$TypeDeleteItemClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeDeleteItemClick.eventType && this.screenMode == mobileOfficialAppsVideoStat$TypeDeleteItemClick.screenMode;
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        return hashCode + (mobileOfficialAppsVideoStat$TypeScreenMode != null ? mobileOfficialAppsVideoStat$TypeScreenMode.hashCode() : 0);
    }

    public final String toString() {
        return "TypeDeleteItemClick(eventType=" + this.eventType + ", screenMode=" + this.screenMode + ')';
    }

    public MobileOfficialAppsVideoStat$TypeDeleteItemClick(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.eventType = eventType;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeDeleteItemClick(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}

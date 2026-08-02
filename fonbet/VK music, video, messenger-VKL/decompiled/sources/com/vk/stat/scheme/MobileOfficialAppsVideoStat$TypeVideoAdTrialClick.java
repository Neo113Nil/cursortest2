package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAdTrialClick implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final MobileOfficialAppsVideoStat$TypeVideoAdTrialUi eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_value")
    private final String objectValue;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("banner_click")
        public static final EventType BANNER_CLICK;

        @pmi0("close_anywhere")
        public static final EventType CLOSE_ANYWHERE;

        @pmi0("close_cross")
        public static final EventType CLOSE_CROSS;

        static {
            EventType eventType = new EventType("BANNER_CLICK", 0);
            BANNER_CLICK = eventType;
            EventType eventType2 = new EventType("CLOSE_CROSS", 1);
            CLOSE_CROSS = eventType2;
            EventType eventType3 = new EventType("CLOSE_ANYWHERE", 2);
            CLOSE_ANYWHERE = eventType3;
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

    public MobileOfficialAppsVideoStat$TypeVideoAdTrialClick(EventType eventType, MobileOfficialAppsVideoStat$TypeVideoAdTrialUi mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.eventType = eventType;
        this.eventSubtype = mobileOfficialAppsVideoStat$TypeVideoAdTrialUi;
        this.objectValue = str;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAdTrialClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAdTrialClick mobileOfficialAppsVideoStat$TypeVideoAdTrialClick = (MobileOfficialAppsVideoStat$TypeVideoAdTrialClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoAdTrialClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoAdTrialClick.eventSubtype && epx.f(this.objectValue, mobileOfficialAppsVideoStat$TypeVideoAdTrialClick.objectValue) && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoAdTrialClick.screenMode;
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        MobileOfficialAppsVideoStat$TypeVideoAdTrialUi mobileOfficialAppsVideoStat$TypeVideoAdTrialUi = this.eventSubtype;
        int hashCode2 = (hashCode + (mobileOfficialAppsVideoStat$TypeVideoAdTrialUi == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdTrialUi.hashCode())) * 31;
        String str = this.objectValue;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        return hashCode3 + (mobileOfficialAppsVideoStat$TypeScreenMode != null ? mobileOfficialAppsVideoStat$TypeScreenMode.hashCode() : 0);
    }

    public final String toString() {
        return "TypeVideoAdTrialClick(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", objectValue=" + this.objectValue + ", screenMode=" + this.screenMode + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoAdTrialClick(EventType eventType, MobileOfficialAppsVideoStat$TypeVideoAdTrialUi mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}

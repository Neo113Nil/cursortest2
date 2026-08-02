package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAdTrialShow implements SchemeStat$TypeView.b {

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

        @pmi0("offer")
        public static final EventType OFFER;

        @pmi0("success")
        public static final EventType SUCCESS;

        static {
            EventType eventType = new EventType("OFFER", 0);
            OFFER = eventType;
            EventType eventType2 = new EventType("SUCCESS", 1);
            SUCCESS = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoAdTrialShow(EventType eventType, MobileOfficialAppsVideoStat$TypeVideoAdTrialUi mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.eventType = eventType;
        this.eventSubtype = mobileOfficialAppsVideoStat$TypeVideoAdTrialUi;
        this.objectValue = str;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoAdTrialShow)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoAdTrialShow mobileOfficialAppsVideoStat$TypeVideoAdTrialShow = (MobileOfficialAppsVideoStat$TypeVideoAdTrialShow) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoAdTrialShow.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoAdTrialShow.eventSubtype && epx.f(this.objectValue, mobileOfficialAppsVideoStat$TypeVideoAdTrialShow.objectValue) && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoAdTrialShow.screenMode;
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
        return "TypeVideoAdTrialShow(eventType=" + this.eventType + ", eventSubtype=" + this.eventSubtype + ", objectValue=" + this.objectValue + ", screenMode=" + this.screenMode + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoAdTrialShow(EventType eventType, MobileOfficialAppsVideoStat$TypeVideoAdTrialUi mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, String str, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}

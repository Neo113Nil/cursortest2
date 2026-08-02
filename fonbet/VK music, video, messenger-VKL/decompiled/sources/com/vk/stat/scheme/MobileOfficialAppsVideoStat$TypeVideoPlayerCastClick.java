package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick implements SchemeStat$TypeClick.b {

    @pmi0("event_source")
    private final MobileOfficialAppsVideoStat$VideoEventSource eventSource;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("position_sec")
    private final Integer positionSec;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("vsid")
    private final CommonVideoStat$TypeVsidItem vsid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("cast_connect_device")
        public static final EventSubtype CAST_CONNECT_DEVICE;

        @pmi0("cast_connect_device_via_code")
        public static final EventSubtype CAST_CONNECT_DEVICE_VIA_CODE;

        @pmi0("cast_disconnect_device")
        public static final EventSubtype CAST_DISCONNECT_DEVICE;

        @pmi0("cast_find_device_auto")
        public static final EventSubtype CAST_FIND_DEVICE_AUTO;

        @pmi0("cast_find_device_auto_no_permission")
        public static final EventSubtype CAST_FIND_DEVICE_AUTO_NO_PERMISSION;

        @pmi0("cast_open_airplay_bluetooth")
        public static final EventSubtype CAST_OPEN_AIRPLAY_BLUETOOTH;

        @pmi0("cast_show_installation_guide")
        public static final EventSubtype CAST_SHOW_INSTALLATION_GUIDE;

        static {
            EventSubtype eventSubtype = new EventSubtype("CAST_CONNECT_DEVICE", 0);
            CAST_CONNECT_DEVICE = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("CAST_DISCONNECT_DEVICE", 1);
            CAST_DISCONNECT_DEVICE = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("CAST_FIND_DEVICE_AUTO", 2);
            CAST_FIND_DEVICE_AUTO = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("CAST_FIND_DEVICE_AUTO_NO_PERMISSION", 3);
            CAST_FIND_DEVICE_AUTO_NO_PERMISSION = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("CAST_OPEN_AIRPLAY_BLUETOOTH", 4);
            CAST_OPEN_AIRPLAY_BLUETOOTH = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("CAST_SHOW_INSTALLATION_GUIDE", 5);
            CAST_SHOW_INSTALLATION_GUIDE = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("CAST_CONNECT_DEVICE_VIA_CODE", 6);
            CAST_CONNECT_DEVICE_VIA_CODE = eventSubtype7;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click_to_cast_action")
        public static final EventType CLICK_TO_CAST_ACTION;

        static {
            EventType eventType = new EventType("CLICK_TO_CAST_ACTION", 0);
            CLICK_TO_CAST_ACTION = eventType;
            EventType[] eventTypeArr = {eventType};
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

    public MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick(EventType eventType, EventSubtype eventSubtype, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, Integer num) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.vsid = commonVideoStat$TypeVsidItem;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.eventSource = mobileOfficialAppsVideoStat$VideoEventSource;
        this.positionSec = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick = (MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick.eventSubtype && epx.f(this.vsid, mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick.vsid) && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick.screenMode && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick.eventSource && epx.f(this.positionSec, mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick.positionSec);
    }

    public final int hashCode() {
        int hashCode = (this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem = this.vsid;
        int hashCode2 = (hashCode + (commonVideoStat$TypeVsidItem == null ? 0 : commonVideoStat$TypeVsidItem.a.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode())) * 31;
        MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource = this.eventSource;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsVideoStat$VideoEventSource == null ? 0 : mobileOfficialAppsVideoStat$VideoEventSource.hashCode())) * 31;
        Integer num = this.positionSec;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoPlayerCastClick(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", vsid=");
        sb.append(this.vsid);
        sb.append(", screenMode=");
        sb.append(this.screenMode);
        sb.append(", eventSource=");
        sb.append(this.eventSource);
        sb.append(", positionSec=");
        return uqi.b(sb, this.positionSec, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick(EventType eventType, EventSubtype eventSubtype, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, Integer num, int i, zcl zclVar) {
        this(eventType, eventSubtype, (i & 4) != 0 ? null : commonVideoStat$TypeVsidItem, (i & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode, (i & 16) != 0 ? null : mobileOfficialAppsVideoStat$VideoEventSource, (i & 32) != 0 ? null : num);
    }
}

package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeExternalDeviceAction implements SchemeStat$TypeAction.b {

    @pmi0("broadcast_device_ids")
    private final List<String> broadcastDeviceIds;

    @pmi0("broadcast_device_names")
    private final List<String> broadcastDeviceNames;

    @pmi0("broadcast_user_id")
    private final Long broadcastUserId;

    @pmi0("event_source")
    private final MobileOfficialAppsVideoStat$VideoEventSource eventSource;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("airplay")
        public static final EventSubtype AIRPLAY;

        @pmi0("chromecast")
        public static final EventSubtype CHROMECAST;

        @pmi0("dlna")
        public static final EventSubtype DLNA;

        @pmi0("screencast")
        public static final EventSubtype SCREENCAST;

        @pmi0("ssap")
        public static final EventSubtype SSAP;

        static {
            EventSubtype eventSubtype = new EventSubtype("AIRPLAY", 0);
            AIRPLAY = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("CHROMECAST", 1);
            CHROMECAST = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("DLNA", 2);
            DLNA = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("SSAP", 3);
            SSAP = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("SCREENCAST", 4);
            SCREENCAST = eventSubtype5;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5};
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

        @pmi0("external_device_connection_ended")
        public static final EventType EXTERNAL_DEVICE_CONNECTION_ENDED;

        @pmi0("external_device_connection_established")
        public static final EventType EXTERNAL_DEVICE_CONNECTION_ESTABLISHED;

        @pmi0("external_device_connection_failed")
        public static final EventType EXTERNAL_DEVICE_CONNECTION_FAILED;

        @pmi0("external_device_found")
        public static final EventType EXTERNAL_DEVICE_FOUND;

        @pmi0("external_device_not_found")
        public static final EventType EXTERNAL_DEVICE_NOT_FOUND;

        static {
            EventType eventType = new EventType("EXTERNAL_DEVICE_FOUND", 0);
            EXTERNAL_DEVICE_FOUND = eventType;
            EventType eventType2 = new EventType("EXTERNAL_DEVICE_NOT_FOUND", 1);
            EXTERNAL_DEVICE_NOT_FOUND = eventType2;
            EventType eventType3 = new EventType("EXTERNAL_DEVICE_CONNECTION_ESTABLISHED", 2);
            EXTERNAL_DEVICE_CONNECTION_ESTABLISHED = eventType3;
            EventType eventType4 = new EventType("EXTERNAL_DEVICE_CONNECTION_FAILED", 3);
            EXTERNAL_DEVICE_CONNECTION_FAILED = eventType4;
            EventType eventType5 = new EventType("EXTERNAL_DEVICE_CONNECTION_ENDED", 4);
            EXTERNAL_DEVICE_CONNECTION_ENDED = eventType5;
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

    public MobileOfficialAppsVideoStat$TypeExternalDeviceAction(EventType eventType, EventSubtype eventSubtype, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, List<String> list, List<String> list2, Long l) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.eventSource = mobileOfficialAppsVideoStat$VideoEventSource;
        this.broadcastDeviceIds = list;
        this.broadcastDeviceNames = list2;
        this.broadcastUserId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeExternalDeviceAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeExternalDeviceAction mobileOfficialAppsVideoStat$TypeExternalDeviceAction = (MobileOfficialAppsVideoStat$TypeExternalDeviceAction) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeExternalDeviceAction.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeExternalDeviceAction.eventSubtype && this.eventSource == mobileOfficialAppsVideoStat$TypeExternalDeviceAction.eventSource && epx.f(this.broadcastDeviceIds, mobileOfficialAppsVideoStat$TypeExternalDeviceAction.broadcastDeviceIds) && epx.f(this.broadcastDeviceNames, mobileOfficialAppsVideoStat$TypeExternalDeviceAction.broadcastDeviceNames) && epx.f(this.broadcastUserId, mobileOfficialAppsVideoStat$TypeExternalDeviceAction.broadcastUserId);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode2 = (hashCode + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource = this.eventSource;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsVideoStat$VideoEventSource == null ? 0 : mobileOfficialAppsVideoStat$VideoEventSource.hashCode())) * 31;
        List<String> list = this.broadcastDeviceIds;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.broadcastDeviceNames;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.broadcastUserId;
        return hashCode5 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeExternalDeviceAction(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", eventSource=");
        sb.append(this.eventSource);
        sb.append(", broadcastDeviceIds=");
        sb.append(this.broadcastDeviceIds);
        sb.append(", broadcastDeviceNames=");
        sb.append(this.broadcastDeviceNames);
        sb.append(", broadcastUserId=");
        return iq.b(sb, this.broadcastUserId, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeExternalDeviceAction(EventType eventType, EventSubtype eventSubtype, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, List list, List list2, Long l, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : eventSubtype, (i & 4) != 0 ? null : mobileOfficialAppsVideoStat$VideoEventSource, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : l);
    }
}

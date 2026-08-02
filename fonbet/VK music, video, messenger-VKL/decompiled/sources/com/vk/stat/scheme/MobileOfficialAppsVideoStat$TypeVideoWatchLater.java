package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoWatchLater implements SchemeStat$TypeClick.b {

    @pmi0("client_time")
    private final Long clientTime;

    @pmi0("event_source")
    private final MobileOfficialAppsVideoStat$VideoEventSource eventSource;

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

        @pmi0("add")
        public static final EventType ADD;

        @pmi0(SignalingProtocol.KEY_REMOVE)
        public static final EventType REMOVE;

        static {
            EventType eventType = new EventType("ADD", 0);
            ADD = eventType;
            EventType eventType2 = new EventType(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 1);
            REMOVE = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeVideoWatchLater(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, Long l) {
        this.eventType = eventType;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.eventSource = mobileOfficialAppsVideoStat$VideoEventSource;
        this.clientTime = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoWatchLater)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoWatchLater mobileOfficialAppsVideoStat$TypeVideoWatchLater = (MobileOfficialAppsVideoStat$TypeVideoWatchLater) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeVideoWatchLater.eventType && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoWatchLater.screenMode && this.eventSource == mobileOfficialAppsVideoStat$TypeVideoWatchLater.eventSource && epx.f(this.clientTime, mobileOfficialAppsVideoStat$TypeVideoWatchLater.clientTime);
    }

    public final int hashCode() {
        int hashCode = (this.eventSource.hashCode() + ((this.screenMode.hashCode() + (this.eventType.hashCode() * 31)) * 31)) * 31;
        Long l = this.clientTime;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoWatchLater(eventType=");
        sb.append(this.eventType);
        sb.append(", screenMode=");
        sb.append(this.screenMode);
        sb.append(", eventSource=");
        sb.append(this.eventSource);
        sb.append(", clientTime=");
        return iq.b(sb, this.clientTime, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoWatchLater(EventType eventType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource, Long l, int i, zcl zclVar) {
        this(eventType, mobileOfficialAppsVideoStat$TypeScreenMode, mobileOfficialAppsVideoStat$VideoEventSource, (i & 8) != 0 ? null : l);
    }
}

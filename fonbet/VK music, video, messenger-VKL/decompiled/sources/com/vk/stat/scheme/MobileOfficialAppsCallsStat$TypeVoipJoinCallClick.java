package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipJoinCallClick implements SchemeStat$TypeClick.b {

    @pmi0(StatCustomFieldKey.CALL_TYPE)
    private final MobileOfficialAppsCallsStat$CallType callType;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("source")
    private final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("group_call_joined_click")
        public static final EventType GROUP_CALL_JOINED_CLICK;

        static {
            EventType eventType = new EventType("GROUP_CALL_JOINED_CLICK", 0);
            GROUP_CALL_JOINED_CLICK = eventType;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("im_join_popup")
        public static final Source IM_JOIN_POPUP;

        static {
            Source source = new Source("IM_JOIN_POPUP", 0);
            IM_JOIN_POPUP = source;
            Source[] sourceArr = {source};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCallsStat$TypeVoipJoinCallClick(EventType eventType, Source source, MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType) {
        this.eventType = eventType;
        this.source = source;
        this.callType = mobileOfficialAppsCallsStat$CallType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipJoinCallClick)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipJoinCallClick mobileOfficialAppsCallsStat$TypeVoipJoinCallClick = (MobileOfficialAppsCallsStat$TypeVoipJoinCallClick) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipJoinCallClick.eventType && this.source == mobileOfficialAppsCallsStat$TypeVoipJoinCallClick.source && this.callType == mobileOfficialAppsCallsStat$TypeVoipJoinCallClick.callType;
    }

    public final int hashCode() {
        return this.callType.hashCode() + ((this.source.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeVoipJoinCallClick(eventType=" + this.eventType + ", source=" + this.source + ", callType=" + this.callType + ')';
    }
}

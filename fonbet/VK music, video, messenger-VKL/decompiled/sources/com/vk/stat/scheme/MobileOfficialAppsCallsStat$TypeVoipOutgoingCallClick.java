package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick implements SchemeStat$TypeClick.b {

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

        @pmi0("max_call_click")
        public static final EventType MAX_CALL_CLICK;

        @pmi0("outgoing_call_click")
        public static final EventType OUTGOING_CALL_CLICK;

        @pmi0("outgoing_call_started_audio_click")
        public static final EventType OUTGOING_CALL_STARTED_AUDIO_CLICK;

        @pmi0("outgoing_call_started_audio_contact_click")
        public static final EventType OUTGOING_CALL_STARTED_AUDIO_CONTACT_CLICK;

        @pmi0("outgoing_call_started_audio_main_click")
        public static final EventType OUTGOING_CALL_STARTED_AUDIO_MAIN_CLICK;

        @pmi0("outgoing_call_started_click")
        public static final EventType OUTGOING_CALL_STARTED_CLICK;

        @pmi0("outgoing_call_started_video_click")
        public static final EventType OUTGOING_CALL_STARTED_VIDEO_CLICK;

        static {
            EventType eventType = new EventType("OUTGOING_CALL_STARTED_AUDIO_CLICK", 0);
            OUTGOING_CALL_STARTED_AUDIO_CLICK = eventType;
            EventType eventType2 = new EventType("OUTGOING_CALL_STARTED_AUDIO_MAIN_CLICK", 1);
            OUTGOING_CALL_STARTED_AUDIO_MAIN_CLICK = eventType2;
            EventType eventType3 = new EventType("OUTGOING_CALL_STARTED_VIDEO_CLICK", 2);
            OUTGOING_CALL_STARTED_VIDEO_CLICK = eventType3;
            EventType eventType4 = new EventType("OUTGOING_CALL_STARTED_AUDIO_CONTACT_CLICK", 3);
            OUTGOING_CALL_STARTED_AUDIO_CONTACT_CLICK = eventType4;
            EventType eventType5 = new EventType("OUTGOING_CALL_CLICK", 4);
            OUTGOING_CALL_CLICK = eventType5;
            EventType eventType6 = new EventType("OUTGOING_CALL_STARTED_CLICK", 5);
            OUTGOING_CALL_STARTED_CLICK = eventType6;
            EventType eventType7 = new EventType("MAX_CALL_CLICK", 6);
            MAX_CALL_CLICK = eventType7;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7};
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

        @pmi0("calls_services")
        public static final Source CALLS_SERVICES;

        @pmi0("calls_services_empty_search")
        public static final Source CALLS_SERVICES_EMPTY_SEARCH;

        @pmi0("calls_services_long_ago")
        public static final Source CALLS_SERVICES_LONG_AGO;

        @pmi0("calls_services_other")
        public static final Source CALLS_SERVICES_OTHER;

        @pmi0("friends_list")
        public static final Source FRIENDS_LIST;

        @pmi0("history_friends_list_services")
        public static final Source HISTORY_FRIENDS_LIST_SERVICES;

        @pmi0("history_friends_list_services_other")
        public static final Source HISTORY_FRIENDS_LIST_SERVICES_OTHER;

        @pmi0("im_header")
        public static final Source IM_HEADER;

        @pmi0("im_profile")
        public static final Source IM_PROFILE;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final Source PROFILE;

        static {
            Source source = new Source("CALLS_SERVICES", 0);
            CALLS_SERVICES = source;
            Source source2 = new Source("CALLS_SERVICES_OTHER", 1);
            CALLS_SERVICES_OTHER = source2;
            Source source3 = new Source("CALLS_SERVICES_LONG_AGO", 2);
            CALLS_SERVICES_LONG_AGO = source3;
            Source source4 = new Source("HISTORY_FRIENDS_LIST_SERVICES", 3);
            HISTORY_FRIENDS_LIST_SERVICES = source4;
            Source source5 = new Source("HISTORY_FRIENDS_LIST_SERVICES_OTHER", 4);
            HISTORY_FRIENDS_LIST_SERVICES_OTHER = source5;
            Source source6 = new Source("IM_PROFILE", 5);
            IM_PROFILE = source6;
            Source source7 = new Source("IM_HEADER", 6);
            IM_HEADER = source7;
            Source source8 = new Source("FRIENDS_LIST", 7);
            FRIENDS_LIST = source8;
            Source source9 = new Source("PROFILE", 8);
            PROFILE = source9;
            Source source10 = new Source("CALLS_SERVICES_EMPTY_SEARCH", 9);
            CALLS_SERVICES_EMPTY_SEARCH = source10;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7, source8, source9, source10};
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

    public MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick(EventType eventType, Source source, MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType) {
        this.eventType = eventType;
        this.source = source;
        this.callType = mobileOfficialAppsCallsStat$CallType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick = (MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.eventType && this.source == mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.source && this.callType == mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.callType;
    }

    public final int hashCode() {
        int hashCode = (this.source.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType = this.callType;
        return hashCode + (mobileOfficialAppsCallsStat$CallType == null ? 0 : mobileOfficialAppsCallsStat$CallType.hashCode());
    }

    public final String toString() {
        return "TypeVoipOutgoingCallClick(eventType=" + this.eventType + ", source=" + this.source + ", callType=" + this.callType + ')';
    }

    public /* synthetic */ MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick(EventType eventType, Source source, MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType, int i, zcl zclVar) {
        this(eventType, source, (i & 4) != 0 ? null : mobileOfficialAppsCallsStat$CallType);
    }
}

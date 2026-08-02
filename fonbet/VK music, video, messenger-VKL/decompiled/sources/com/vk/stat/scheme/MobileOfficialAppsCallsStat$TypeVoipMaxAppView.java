package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.stat.scheme.SchemeStat$TypeView;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipMaxAppView implements SchemeStat$TypeView.b {

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

        @pmi0("max_show")
        public static final EventType MAX_SHOW;

        static {
            EventType eventType = new EventType("MAX_SHOW", 0);
            MAX_SHOW = eventType;
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

        @pmi0("calls_services_other")
        public static final Source CALLS_SERVICES_OTHER;

        @pmi0("friends_list")
        public static final Source FRIENDS_LIST;

        @pmi0("history_friends_list_services_other")
        public static final Source HISTORY_FRIENDS_LIST_SERVICES_OTHER;

        @pmi0("im_header")
        public static final Source IM_HEADER;

        @pmi0("im_profile")
        public static final Source IM_PROFILE;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final Source PROFILE;

        static {
            Source source = new Source("CALLS_SERVICES_OTHER", 0);
            CALLS_SERVICES_OTHER = source;
            Source source2 = new Source("PROFILE", 1);
            PROFILE = source2;
            Source source3 = new Source("HISTORY_FRIENDS_LIST_SERVICES_OTHER", 2);
            HISTORY_FRIENDS_LIST_SERVICES_OTHER = source3;
            Source source4 = new Source("IM_PROFILE", 3);
            IM_PROFILE = source4;
            Source source5 = new Source("IM_HEADER", 4);
            IM_HEADER = source5;
            Source source6 = new Source("FRIENDS_LIST", 5);
            FRIENDS_LIST = source6;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6};
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

    public MobileOfficialAppsCallsStat$TypeVoipMaxAppView(EventType eventType, Source source, MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType) {
        this.eventType = eventType;
        this.source = source;
        this.callType = mobileOfficialAppsCallsStat$CallType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipMaxAppView)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipMaxAppView mobileOfficialAppsCallsStat$TypeVoipMaxAppView = (MobileOfficialAppsCallsStat$TypeVoipMaxAppView) obj;
        return this.eventType == mobileOfficialAppsCallsStat$TypeVoipMaxAppView.eventType && this.source == mobileOfficialAppsCallsStat$TypeVoipMaxAppView.source && this.callType == mobileOfficialAppsCallsStat$TypeVoipMaxAppView.callType;
    }

    public final int hashCode() {
        int hashCode = (this.source.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType = this.callType;
        return hashCode + (mobileOfficialAppsCallsStat$CallType == null ? 0 : mobileOfficialAppsCallsStat$CallType.hashCode());
    }

    public final String toString() {
        return "TypeVoipMaxAppView(eventType=" + this.eventType + ", source=" + this.source + ", callType=" + this.callType + ')';
    }

    public /* synthetic */ MobileOfficialAppsCallsStat$TypeVoipMaxAppView(EventType eventType, Source source, MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType, int i, zcl zclVar) {
        this(eventType, source, (i & 4) != 0 ? null : mobileOfficialAppsCallsStat$CallType);
    }
}

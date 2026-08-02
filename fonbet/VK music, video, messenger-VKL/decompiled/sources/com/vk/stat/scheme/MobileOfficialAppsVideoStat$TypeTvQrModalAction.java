package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeTvQrModalAction implements SchemeStat$TypeView.b, SchemeStat$TypeClick.b {

    @pmi0("action_id")
    private final String actionId;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("kid_profile_update_show")
        public static final EventType KID_PROFILE_UPDATE_SHOW;

        @pmi0("kid_profile_update_skip")
        public static final EventType KID_PROFILE_UPDATE_SKIP;

        static {
            EventType eventType = new EventType("KID_PROFILE_UPDATE_SHOW", 0);
            KID_PROFILE_UPDATE_SHOW = eventType;
            EventType eventType2 = new EventType("KID_PROFILE_UPDATE_SKIP", 1);
            KID_PROFILE_UPDATE_SKIP = eventType2;
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

    public MobileOfficialAppsVideoStat$TypeTvQrModalAction(String str, EventType eventType) {
        this.actionId = str;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeTvQrModalAction)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeTvQrModalAction mobileOfficialAppsVideoStat$TypeTvQrModalAction = (MobileOfficialAppsVideoStat$TypeTvQrModalAction) obj;
        return epx.f(this.actionId, mobileOfficialAppsVideoStat$TypeTvQrModalAction.actionId) && this.eventType == mobileOfficialAppsVideoStat$TypeTvQrModalAction.eventType;
    }

    public final int hashCode() {
        int hashCode = this.actionId.hashCode() * 31;
        EventType eventType = this.eventType;
        return hashCode + (eventType == null ? 0 : eventType.hashCode());
    }

    public final String toString() {
        return "TypeTvQrModalAction(actionId=" + this.actionId + ", eventType=" + this.eventType + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeTvQrModalAction(String str, EventType eventType, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : eventType);
    }
}

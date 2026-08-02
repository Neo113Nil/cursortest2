package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImInvitationCardRejectAction implements SchemeStat$TypeAction.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("user2_id")
    private final long user2Id;

    @pmi0("user_id")
    private final long userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("reject_request_dialog_back")
        public static final EventType REJECT_REQUEST_DIALOG_BACK;

        @pmi0("reject_request_dialog_confirm")
        public static final EventType REJECT_REQUEST_DIALOG_CONFIRM;

        static {
            EventType eventType = new EventType("REJECT_REQUEST_DIALOG_CONFIRM", 0);
            REJECT_REQUEST_DIALOG_CONFIRM = eventType;
            EventType eventType2 = new EventType("REJECT_REQUEST_DIALOG_BACK", 1);
            REJECT_REQUEST_DIALOG_BACK = eventType2;
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

    public MobileOfficialAppsImStat$TypeImInvitationCardRejectAction(long j, long j2, EventType eventType) {
        this.userId = j;
        this.user2Id = j2;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImInvitationCardRejectAction)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImInvitationCardRejectAction mobileOfficialAppsImStat$TypeImInvitationCardRejectAction = (MobileOfficialAppsImStat$TypeImInvitationCardRejectAction) obj;
        return this.userId == mobileOfficialAppsImStat$TypeImInvitationCardRejectAction.userId && this.user2Id == mobileOfficialAppsImStat$TypeImInvitationCardRejectAction.user2Id && this.eventType == mobileOfficialAppsImStat$TypeImInvitationCardRejectAction.eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode() + bh10.a(Long.hashCode(this.userId) * 31, 31, this.user2Id);
    }

    public final String toString() {
        return "TypeImInvitationCardRejectAction(userId=" + this.userId + ", user2Id=" + this.user2Id + ", eventType=" + this.eventType + ')';
    }
}

package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsImStat$TypeImOpenInvitationCardItem implements SchemeStat$TypeView.b {

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

        @pmi0("approved_request_dialog")
        public static final EventType APPROVED_REQUEST_DIALOG;

        @pmi0("input_request_dialog")
        public static final EventType INPUT_REQUEST_DIALOG;

        @pmi0("sent_request_dialog")
        public static final EventType SENT_REQUEST_DIALOG;

        static {
            EventType eventType = new EventType("SENT_REQUEST_DIALOG", 0);
            SENT_REQUEST_DIALOG = eventType;
            EventType eventType2 = new EventType("APPROVED_REQUEST_DIALOG", 1);
            APPROVED_REQUEST_DIALOG = eventType2;
            EventType eventType3 = new EventType("INPUT_REQUEST_DIALOG", 2);
            INPUT_REQUEST_DIALOG = eventType3;
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

    public MobileOfficialAppsImStat$TypeImOpenInvitationCardItem(EventType eventType, long j, long j2) {
        this.eventType = eventType;
        this.userId = j;
        this.user2Id = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImOpenInvitationCardItem)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImOpenInvitationCardItem mobileOfficialAppsImStat$TypeImOpenInvitationCardItem = (MobileOfficialAppsImStat$TypeImOpenInvitationCardItem) obj;
        return this.eventType == mobileOfficialAppsImStat$TypeImOpenInvitationCardItem.eventType && this.userId == mobileOfficialAppsImStat$TypeImOpenInvitationCardItem.userId && this.user2Id == mobileOfficialAppsImStat$TypeImOpenInvitationCardItem.user2Id;
    }

    public final int hashCode() {
        return Long.hashCode(this.user2Id) + bh10.a(this.eventType.hashCode() * 31, 31, this.userId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeImOpenInvitationCardItem(eventType=");
        sb.append(this.eventType);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", user2Id=");
        return vu5.a(')', this.user2Id, sb);
    }
}

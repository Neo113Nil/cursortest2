package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ChangeVideoAttachment {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("video_id")
    private final String videoId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add")
        public static final EventType ADD;

        @pmi0("delete")
        public static final EventType DELETE;

        @pmi0("edit")
        public static final EventType EDIT;

        static {
            EventType eventType = new EventType("ADD", 0);
            ADD = eventType;
            EventType eventType2 = new EventType("DELETE", 1);
            DELETE = eventType2;
            EventType eventType3 = new EventType("EDIT", 2);
            EDIT = eventType3;
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClipsStat$ChangeVideoAttachment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$ChangeVideoAttachment)) {
            return false;
        }
        MobileOfficialAppsClipsStat$ChangeVideoAttachment mobileOfficialAppsClipsStat$ChangeVideoAttachment = (MobileOfficialAppsClipsStat$ChangeVideoAttachment) obj;
        return this.eventType == mobileOfficialAppsClipsStat$ChangeVideoAttachment.eventType && epx.f(this.videoId, mobileOfficialAppsClipsStat$ChangeVideoAttachment.videoId);
    }

    public final int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType == null ? 0 : eventType.hashCode()) * 31;
        String str = this.videoId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeVideoAttachment(eventType=");
        sb.append(this.eventType);
        sb.append(", videoId=");
        return ho8.a(sb, this.videoId, ')');
    }

    public MobileOfficialAppsClipsStat$ChangeVideoAttachment(EventType eventType, String str) {
        this.eventType = eventType;
        this.videoId = str;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$ChangeVideoAttachment(EventType eventType, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : eventType, (i & 2) != 0 ? null : str);
    }
}

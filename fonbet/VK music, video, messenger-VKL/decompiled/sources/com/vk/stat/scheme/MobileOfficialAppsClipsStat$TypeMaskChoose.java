package com.vk.stat.scheme;

import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeMaskChoose {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("section")
    private final int section;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("mask_off")
        public static final EventType MASK_OFF;

        @pmi0("mask_on")
        public static final EventType MASK_ON;

        static {
            EventType eventType = new EventType("MASK_ON", 0);
            MASK_ON = eventType;
            EventType eventType2 = new EventType("MASK_OFF", 1);
            MASK_OFF = eventType2;
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

    public MobileOfficialAppsClipsStat$TypeMaskChoose(EventType eventType, int i, long j, int i2) {
        this.eventType = eventType;
        this.id = i;
        this.ownerId = j;
        this.section = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeMaskChoose)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeMaskChoose mobileOfficialAppsClipsStat$TypeMaskChoose = (MobileOfficialAppsClipsStat$TypeMaskChoose) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeMaskChoose.eventType && this.id == mobileOfficialAppsClipsStat$TypeMaskChoose.id && this.ownerId == mobileOfficialAppsClipsStat$TypeMaskChoose.ownerId && this.section == mobileOfficialAppsClipsStat$TypeMaskChoose.section;
    }

    public final int hashCode() {
        return Integer.hashCode(this.section) + bh10.a(shy.a(this.id, this.eventType.hashCode() * 31, 31), 31, this.ownerId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMaskChoose(eventType=");
        sb.append(this.eventType);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", section=");
        return vu5.b(sb, this.section, ')');
    }
}

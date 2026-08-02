package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeVolumeItem {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("volume")
    private final Integer volume;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("manual")
        public static final EventSubtype MANUAL;

        @pmi0("off")
        public static final EventSubtype OFF;

        @pmi0("on")
        public static final EventSubtype ON;

        static {
            EventSubtype eventSubtype = new EventSubtype("MANUAL", 0);
            MANUAL = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("OFF", 1);
            OFF = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("ON", 2);
            ON = eventSubtype3;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3};
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

    public MobileOfficialAppsClipsStat$TypeVolumeItem(EventSubtype eventSubtype, Integer num) {
        this.eventSubtype = eventSubtype;
        this.volume = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeVolumeItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeVolumeItem mobileOfficialAppsClipsStat$TypeVolumeItem = (MobileOfficialAppsClipsStat$TypeVolumeItem) obj;
        return this.eventSubtype == mobileOfficialAppsClipsStat$TypeVolumeItem.eventSubtype && epx.f(this.volume, mobileOfficialAppsClipsStat$TypeVolumeItem.volume);
    }

    public final int hashCode() {
        int hashCode = this.eventSubtype.hashCode() * 31;
        Integer num = this.volume;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVolumeItem(eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", volume=");
        return uqi.b(sb, this.volume, ')');
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeVolumeItem(EventSubtype eventSubtype, Integer num, int i, zcl zclVar) {
        this(eventSubtype, (i & 2) != 0 ? null : num);
    }
}

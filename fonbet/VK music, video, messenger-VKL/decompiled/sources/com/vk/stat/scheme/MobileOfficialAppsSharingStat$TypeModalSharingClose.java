package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSharingStat$TypeModalSharingClose implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("sharing_item_type")
    private final MobileOfficialAppsSharingStat$SharingItemType sharingItemType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSharingStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("modal_sharing_close")
        public static final Event MODAL_SHARING_CLOSE;

        static {
            Event event = new Event("MODAL_SHARING_CLOSE", 0);
            MODAL_SHARING_CLOSE = event;
            Event[] eventArr = {event};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsSharingStat$TypeModalSharingClose(Event event, MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType) {
        this.event = event;
        this.sharingItemType = mobileOfficialAppsSharingStat$SharingItemType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSharingStat$TypeModalSharingClose)) {
            return false;
        }
        MobileOfficialAppsSharingStat$TypeModalSharingClose mobileOfficialAppsSharingStat$TypeModalSharingClose = (MobileOfficialAppsSharingStat$TypeModalSharingClose) obj;
        return this.event == mobileOfficialAppsSharingStat$TypeModalSharingClose.event && this.sharingItemType == mobileOfficialAppsSharingStat$TypeModalSharingClose.sharingItemType;
    }

    public final int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType = this.sharingItemType;
        return hashCode + (mobileOfficialAppsSharingStat$SharingItemType == null ? 0 : mobileOfficialAppsSharingStat$SharingItemType.hashCode());
    }

    public final String toString() {
        return "TypeModalSharingClose(event=" + this.event + ", sharingItemType=" + this.sharingItemType + ')';
    }

    public /* synthetic */ MobileOfficialAppsSharingStat$TypeModalSharingClose(Event event, MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType, int i, zcl zclVar) {
        this(event, (i & 2) != 0 ? null : mobileOfficialAppsSharingStat$SharingItemType);
    }
}

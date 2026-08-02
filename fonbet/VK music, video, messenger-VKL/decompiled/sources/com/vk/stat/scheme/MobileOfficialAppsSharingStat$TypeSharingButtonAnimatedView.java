package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView implements SchemeStat$TypeView.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSharingStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("sharing_button_animated")
        public static final Event SHARING_BUTTON_ANIMATED;

        static {
            Event event = new Event("SHARING_BUTTON_ANIMATED", 0);
            SHARING_BUTTON_ANIMATED = event;
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

    public MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView(Event event) {
        this.event = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView) && this.event == ((MobileOfficialAppsSharingStat$TypeSharingButtonAnimatedView) obj).event;
    }

    public final int hashCode() {
        return this.event.hashCode();
    }

    public final String toString() {
        return "TypeSharingButtonAnimatedView(event=" + this.event + ')';
    }
}

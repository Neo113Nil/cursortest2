package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo implements SchemeStat$TypeNavgo.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("user_goto_landing_ozon_invite_banner_adb")
        public static final Event USER_GOTO_LANDING_OZON_INVITE_BANNER_ADB;

        static {
            Event event = new Event("USER_GOTO_LANDING_OZON_INVITE_BANNER_ADB", 0);
            USER_GOTO_LANDING_OZON_INVITE_BANNER_ADB = event;
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

    public CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo(Event event) {
        this.event = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo) && this.event == ((CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbNavgo) obj).event;
    }

    public final int hashCode() {
        return this.event.hashCode();
    }

    public final String toString() {
        return "TypeCommunitiesOzonInviteBannerAdbNavgo(event=" + this.event + ')';
    }
}

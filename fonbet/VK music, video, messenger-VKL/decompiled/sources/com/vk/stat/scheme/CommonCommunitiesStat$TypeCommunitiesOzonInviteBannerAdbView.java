package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView implements SchemeStat$TypeView.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("owner_id")
    private final long ownerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("show_ozon_invite_banner_adb")
        public static final Event SHOW_OZON_INVITE_BANNER_ADB;

        static {
            Event event = new Event("SHOW_OZON_INVITE_BANNER_ADB", 0);
            SHOW_OZON_INVITE_BANNER_ADB = event;
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

    public CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView(Event event, long j) {
        this.event = event;
        this.ownerId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView = (CommonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView) obj;
        return this.event == commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView.event && this.ownerId == commonCommunitiesStat$TypeCommunitiesOzonInviteBannerAdbView.ownerId;
    }

    public final int hashCode() {
        return Long.hashCode(this.ownerId) + (this.event.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCommunitiesOzonInviteBannerAdbView(event=");
        sb.append(this.event);
        sb.append(", ownerId=");
        return vu5.a(')', this.ownerId, sb);
    }
}

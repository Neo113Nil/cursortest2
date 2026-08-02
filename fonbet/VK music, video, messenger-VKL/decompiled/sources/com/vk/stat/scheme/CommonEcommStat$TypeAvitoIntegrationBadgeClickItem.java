package com.vk.stat.scheme;

import com.vk.stat.scheme.CommonEcommStat$TypeAvitoIntegrationClickItem;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeAvitoIntegrationBadgeClickItem implements CommonEcommStat$TypeAvitoIntegrationClickItem.b {

    @pmi0("banner_id")
    private final String bannerId;

    @pmi0("banner_name")
    private final String bannerName;

    @pmi0("event_type")
    private final EventType eventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonEcommStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final EventType ACTIVE;

        @pmi0("broken")
        public static final EventType BROKEN;

        @pmi0("pending")
        public static final EventType PENDING;

        static {
            EventType eventType = new EventType(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = eventType;
            EventType eventType2 = new EventType("PENDING", 1);
            PENDING = eventType2;
            EventType eventType3 = new EventType("BROKEN", 2);
            BROKEN = eventType3;
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

    public CommonEcommStat$TypeAvitoIntegrationBadgeClickItem(EventType eventType, String str, String str2) {
        this.eventType = eventType;
        this.bannerName = str;
        this.bannerId = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeAvitoIntegrationBadgeClickItem)) {
            return false;
        }
        CommonEcommStat$TypeAvitoIntegrationBadgeClickItem commonEcommStat$TypeAvitoIntegrationBadgeClickItem = (CommonEcommStat$TypeAvitoIntegrationBadgeClickItem) obj;
        return this.eventType == commonEcommStat$TypeAvitoIntegrationBadgeClickItem.eventType && epx.f(this.bannerName, commonEcommStat$TypeAvitoIntegrationBadgeClickItem.bannerName) && epx.f(this.bannerId, commonEcommStat$TypeAvitoIntegrationBadgeClickItem.bannerId);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.bannerName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bannerId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAvitoIntegrationBadgeClickItem(eventType=");
        sb.append(this.eventType);
        sb.append(", bannerName=");
        sb.append(this.bannerName);
        sb.append(", bannerId=");
        return ho8.a(sb, this.bannerId, ')');
    }

    public /* synthetic */ CommonEcommStat$TypeAvitoIntegrationBadgeClickItem(EventType eventType, String str, String str2, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}

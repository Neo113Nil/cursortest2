package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose implements SchemeStat$TypeAction.b {

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_id")
    private final long objectId;

    @pmi0("position_in_block")
    private final Integer positionInBlock;

    @pmi0("video_id")
    private final Long videoId;

    @pmi0("video_owner_id")
    private final Long videoOwnerId;

    @pmi0("video_type")
    private final String videoType;

    @pmi0("vsid")
    private final CommonVideoStat$TypeVsidItem vsid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("bag")
        public static final EventSubtype BAG;

        @pmi0("old_action")
        public static final EventSubtype OLD_ACTION;

        @pmi0("product_card")
        public static final EventSubtype PRODUCT_CARD;

        static {
            EventSubtype eventSubtype = new EventSubtype("OLD_ACTION", 0);
            OLD_ACTION = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("PRODUCT_CARD", 1);
            PRODUCT_CARD = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("BAG", 2);
            BAG = eventSubtype3;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("overlay_live_product_card_close")
        public static final EventType OVERLAY_LIVE_PRODUCT_CARD_CLOSE;

        static {
            EventType eventType = new EventType("OVERLAY_LIVE_PRODUCT_CARD_CLOSE", 0);
            OVERLAY_LIVE_PRODUCT_CARD_CLOSE = eventType;
            EventType[] eventTypeArr = {eventType};
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

    public MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose(EventType eventType, EventSubtype eventSubtype, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, long j, String str, Integer num, Long l, Long l2) {
        this.eventType = eventType;
        this.eventSubtype = eventSubtype;
        this.vsid = commonVideoStat$TypeVsidItem;
        this.objectId = j;
        this.videoType = str;
        this.positionInBlock = num;
        this.videoId = l;
        this.videoOwnerId = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose = (MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.eventSubtype && epx.f(this.vsid, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.vsid) && this.objectId == mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.objectId && epx.f(this.videoType, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.videoType) && epx.f(this.positionInBlock, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.positionInBlock) && epx.f(this.videoId, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.videoId) && epx.f(this.videoOwnerId, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.videoOwnerId);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(urd0.a((this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31, 31, this.vsid.a), 31, this.objectId), 31, this.videoType);
        Integer num = this.positionInBlock;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.videoId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.videoOwnerId;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOverlayLiveProductCardClose(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", vsid=");
        sb.append(this.vsid);
        sb.append(", objectId=");
        sb.append(this.objectId);
        sb.append(", videoType=");
        sb.append(this.videoType);
        sb.append(", positionInBlock=");
        sb.append(this.positionInBlock);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", videoOwnerId=");
        return iq.b(sb, this.videoOwnerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose(EventType eventType, EventSubtype eventSubtype, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, long j, String str, Integer num, Long l, Long l2, int i, zcl zclVar) {
        this(eventType, eventSubtype, commonVideoStat$TypeVsidItem, j, str, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : l2);
    }
}

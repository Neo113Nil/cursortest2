package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
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
public final class MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("object_id")
    private final long objectId;

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
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("overlay_live_product_close_click")
        public static final EventType OVERLAY_LIVE_PRODUCT_CLOSE_CLICK;

        static {
            EventType eventType = new EventType("OVERLAY_LIVE_PRODUCT_CLOSE_CLICK", 0);
            OVERLAY_LIVE_PRODUCT_CLOSE_CLICK = eventType;
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

    public MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick(EventType eventType, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, long j, String str, Long l, Long l2) {
        this.eventType = eventType;
        this.vsid = commonVideoStat$TypeVsidItem;
        this.objectId = j;
        this.videoType = str;
        this.videoId = l;
        this.videoOwnerId = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick = (MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick.eventType && epx.f(this.vsid, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick.vsid) && this.objectId == mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick.objectId && epx.f(this.videoType, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick.videoType) && epx.f(this.videoId, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick.videoId) && epx.f(this.videoOwnerId, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick.videoOwnerId);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(urd0.a(this.eventType.hashCode() * 31, 31, this.vsid.a), 31, this.objectId), 31, this.videoType);
        Long l = this.videoId;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.videoOwnerId;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOverlayLiveProductCloseClick(eventType=");
        sb.append(this.eventType);
        sb.append(", vsid=");
        sb.append(this.vsid);
        sb.append(", objectId=");
        sb.append(this.objectId);
        sb.append(", videoType=");
        sb.append(this.videoType);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", videoOwnerId=");
        return iq.b(sb, this.videoOwnerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick(EventType eventType, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, long j, String str, Long l, Long l2, int i, zcl zclVar) {
        this(eventType, commonVideoStat$TypeVsidItem, j, str, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2);
    }
}

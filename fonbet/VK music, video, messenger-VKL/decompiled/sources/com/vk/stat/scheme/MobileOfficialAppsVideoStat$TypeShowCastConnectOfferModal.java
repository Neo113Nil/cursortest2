package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal implements SchemeStat$TypeView.b {

    @pmi0("event_subtype")
    private final MobileOfficialAppsVideoStat$CastConnectOfferModalType eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("position_sec")
    private final Integer positionSec;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    @pmi0("vsid")
    private final CommonVideoStat$TypeVsidItem vsid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("show_cast_connect_offer_modal")
        public static final EventType SHOW_CAST_CONNECT_OFFER_MODAL;

        static {
            EventType eventType = new EventType("SHOW_CAST_CONNECT_OFFER_MODAL", 0);
            SHOW_CAST_CONNECT_OFFER_MODAL = eventType;
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

    public MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal(EventType eventType, MobileOfficialAppsVideoStat$CastConnectOfferModalType mobileOfficialAppsVideoStat$CastConnectOfferModalType, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Integer num) {
        this.eventType = eventType;
        this.eventSubtype = mobileOfficialAppsVideoStat$CastConnectOfferModalType;
        this.vsid = commonVideoStat$TypeVsidItem;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
        this.positionSec = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal = (MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal) obj;
        return this.eventType == mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal.eventType && this.eventSubtype == mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal.eventSubtype && epx.f(this.vsid, mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal.vsid) && this.screenMode == mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal.screenMode && epx.f(this.positionSec, mobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal.positionSec);
    }

    public final int hashCode() {
        int hashCode = (this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem = this.vsid;
        int hashCode2 = (hashCode + (commonVideoStat$TypeVsidItem == null ? 0 : commonVideoStat$TypeVsidItem.a.hashCode())) * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode())) * 31;
        Integer num = this.positionSec;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeShowCastConnectOfferModal(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", vsid=");
        sb.append(this.vsid);
        sb.append(", screenMode=");
        sb.append(this.screenMode);
        sb.append(", positionSec=");
        return uqi.b(sb, this.positionSec, ')');
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeShowCastConnectOfferModal(EventType eventType, MobileOfficialAppsVideoStat$CastConnectOfferModalType mobileOfficialAppsVideoStat$CastConnectOfferModalType, CommonVideoStat$TypeVsidItem commonVideoStat$TypeVsidItem, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, Integer num, int i, zcl zclVar) {
        this(eventType, mobileOfficialAppsVideoStat$CastConnectOfferModalType, (i & 4) != 0 ? null : commonVideoStat$TypeVsidItem, (i & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode, (i & 16) != 0 ? null : num);
    }
}

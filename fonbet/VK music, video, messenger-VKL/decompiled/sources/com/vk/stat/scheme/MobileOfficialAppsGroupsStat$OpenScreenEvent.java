package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGroupsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGroupsStat$OpenScreenEvent implements MobileOfficialAppsGroupsStat$TypeGroupsEventItem.b {

    @pmi0("cta_button_position_type")
    private final CommonMarketStat$TypeCtaButtonPositionType ctaButtonPositionType;

    @pmi0("open_screen_event_type")
    private final OpenScreenEventType openScreenEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class OpenScreenEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OpenScreenEventType[] $VALUES;

        @pmi0("open_messages")
        public static final OpenScreenEventType OPEN_MESSAGES;

        @pmi0("open_purchase_info")
        public static final OpenScreenEventType OPEN_PURCHASE_INFO;

        static {
            OpenScreenEventType openScreenEventType = new OpenScreenEventType("OPEN_MESSAGES", 0);
            OPEN_MESSAGES = openScreenEventType;
            OpenScreenEventType openScreenEventType2 = new OpenScreenEventType("OPEN_PURCHASE_INFO", 1);
            OPEN_PURCHASE_INFO = openScreenEventType2;
            OpenScreenEventType[] openScreenEventTypeArr = {openScreenEventType, openScreenEventType2};
            $VALUES = openScreenEventTypeArr;
            $ENTRIES = new asp(openScreenEventTypeArr);
        }

        private OpenScreenEventType(String str, int i) {
        }

        public static OpenScreenEventType valueOf(String str) {
            return (OpenScreenEventType) Enum.valueOf(OpenScreenEventType.class, str);
        }

        public static OpenScreenEventType[] values() {
            return (OpenScreenEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsGroupsStat$OpenScreenEvent(OpenScreenEventType openScreenEventType, CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType) {
        this.openScreenEventType = openScreenEventType;
        this.ctaButtonPositionType = commonMarketStat$TypeCtaButtonPositionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGroupsStat$OpenScreenEvent)) {
            return false;
        }
        MobileOfficialAppsGroupsStat$OpenScreenEvent mobileOfficialAppsGroupsStat$OpenScreenEvent = (MobileOfficialAppsGroupsStat$OpenScreenEvent) obj;
        return this.openScreenEventType == mobileOfficialAppsGroupsStat$OpenScreenEvent.openScreenEventType && this.ctaButtonPositionType == mobileOfficialAppsGroupsStat$OpenScreenEvent.ctaButtonPositionType;
    }

    public final int hashCode() {
        int hashCode = this.openScreenEventType.hashCode() * 31;
        CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType = this.ctaButtonPositionType;
        return hashCode + (commonMarketStat$TypeCtaButtonPositionType == null ? 0 : commonMarketStat$TypeCtaButtonPositionType.hashCode());
    }

    public final String toString() {
        return "OpenScreenEvent(openScreenEventType=" + this.openScreenEventType + ", ctaButtonPositionType=" + this.ctaButtonPositionType + ')';
    }

    public /* synthetic */ MobileOfficialAppsGroupsStat$OpenScreenEvent(OpenScreenEventType openScreenEventType, CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType, int i, zcl zclVar) {
        this(openScreenEventType, (i & 2) != 0 ? null : commonMarketStat$TypeCtaButtonPositionType);
    }
}

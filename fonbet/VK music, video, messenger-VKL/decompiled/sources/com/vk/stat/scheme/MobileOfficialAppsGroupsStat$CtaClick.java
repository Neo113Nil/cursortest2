package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGroupsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGroupsStat$CtaClick implements MobileOfficialAppsGroupsStat$TypeGroupsEventItem.b {

    @pmi0("cta_button_position_type")
    private final CommonMarketStat$TypeCtaButtonPositionType ctaButtonPositionType;

    @pmi0("cta_button_type")
    private final CtaButtonType ctaButtonType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class CtaButtonType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CtaButtonType[] $VALUES;

        @pmi0("call_phone")
        public static final CtaButtonType CALL_PHONE;

        @pmi0("call_vk")
        public static final CtaButtonType CALL_VK;

        @pmi0("open_app")
        public static final CtaButtonType OPEN_APP;

        @pmi0("open_group_app")
        public static final CtaButtonType OPEN_GROUP_APP;

        @pmi0("open_url")
        public static final CtaButtonType OPEN_URL;

        @pmi0("post_youla_ad")
        public static final CtaButtonType POST_YOULA_AD;

        @pmi0("send_email")
        public static final CtaButtonType SEND_EMAIL;

        static {
            CtaButtonType ctaButtonType = new CtaButtonType("OPEN_URL", 0);
            OPEN_URL = ctaButtonType;
            CtaButtonType ctaButtonType2 = new CtaButtonType("OPEN_APP", 1);
            OPEN_APP = ctaButtonType2;
            CtaButtonType ctaButtonType3 = new CtaButtonType("OPEN_GROUP_APP", 2);
            OPEN_GROUP_APP = ctaButtonType3;
            CtaButtonType ctaButtonType4 = new CtaButtonType("POST_YOULA_AD", 3);
            POST_YOULA_AD = ctaButtonType4;
            CtaButtonType ctaButtonType5 = new CtaButtonType("CALL_PHONE", 4);
            CALL_PHONE = ctaButtonType5;
            CtaButtonType ctaButtonType6 = new CtaButtonType("CALL_VK", 5);
            CALL_VK = ctaButtonType6;
            CtaButtonType ctaButtonType7 = new CtaButtonType("SEND_EMAIL", 6);
            SEND_EMAIL = ctaButtonType7;
            CtaButtonType[] ctaButtonTypeArr = {ctaButtonType, ctaButtonType2, ctaButtonType3, ctaButtonType4, ctaButtonType5, ctaButtonType6, ctaButtonType7};
            $VALUES = ctaButtonTypeArr;
            $ENTRIES = new asp(ctaButtonTypeArr);
        }

        private CtaButtonType(String str, int i) {
        }

        public static CtaButtonType valueOf(String str) {
            return (CtaButtonType) Enum.valueOf(CtaButtonType.class, str);
        }

        public static CtaButtonType[] values() {
            return (CtaButtonType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsGroupsStat$CtaClick(CtaButtonType ctaButtonType, CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType) {
        this.ctaButtonType = ctaButtonType;
        this.ctaButtonPositionType = commonMarketStat$TypeCtaButtonPositionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGroupsStat$CtaClick)) {
            return false;
        }
        MobileOfficialAppsGroupsStat$CtaClick mobileOfficialAppsGroupsStat$CtaClick = (MobileOfficialAppsGroupsStat$CtaClick) obj;
        return this.ctaButtonType == mobileOfficialAppsGroupsStat$CtaClick.ctaButtonType && this.ctaButtonPositionType == mobileOfficialAppsGroupsStat$CtaClick.ctaButtonPositionType;
    }

    public final int hashCode() {
        int hashCode = this.ctaButtonType.hashCode() * 31;
        CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType = this.ctaButtonPositionType;
        return hashCode + (commonMarketStat$TypeCtaButtonPositionType == null ? 0 : commonMarketStat$TypeCtaButtonPositionType.hashCode());
    }

    public final String toString() {
        return "CtaClick(ctaButtonType=" + this.ctaButtonType + ", ctaButtonPositionType=" + this.ctaButtonPositionType + ')';
    }

    public /* synthetic */ MobileOfficialAppsGroupsStat$CtaClick(CtaButtonType ctaButtonType, CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType, int i, zcl zclVar) {
        this(ctaButtonType, (i & 2) != 0 ? null : commonMarketStat$TypeCtaButtonPositionType);
    }
}

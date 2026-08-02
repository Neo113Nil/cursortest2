package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem {

    @pmi0("cta_type")
    private final CtaType ctaType;

    @pmi0("step_num")
    private final int stepNum;

    @pmi0("to_step_num")
    private final Integer toStepNum;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class CtaType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CtaType[] $VALUES;

        @pmi0("cta_add_goods")
        public static final CtaType CTA_ADD_GOODS;

        @pmi0("cta_add_services")
        public static final CtaType CTA_ADD_SERVICES;

        @pmi0("cta_ads")
        public static final CtaType CTA_ADS;

        @pmi0("cta_business_id")
        public static final CtaType CTA_BUSINESS_ID;

        @pmi0("cta_business_subscription")
        public static final CtaType CTA_BUSINESS_SUBSCRIPTION;

        static {
            CtaType ctaType = new CtaType("CTA_BUSINESS_SUBSCRIPTION", 0);
            CTA_BUSINESS_SUBSCRIPTION = ctaType;
            CtaType ctaType2 = new CtaType("CTA_ADD_SERVICES", 1);
            CTA_ADD_SERVICES = ctaType2;
            CtaType ctaType3 = new CtaType("CTA_ADD_GOODS", 2);
            CTA_ADD_GOODS = ctaType3;
            CtaType ctaType4 = new CtaType("CTA_BUSINESS_ID", 3);
            CTA_BUSINESS_ID = ctaType4;
            CtaType ctaType5 = new CtaType("CTA_ADS", 4);
            CTA_ADS = ctaType5;
            CtaType[] ctaTypeArr = {ctaType, ctaType2, ctaType3, ctaType4, ctaType5};
            $VALUES = ctaTypeArr;
            $ENTRIES = new asp(ctaTypeArr);
        }

        private CtaType(String str, int i) {
        }

        public static CtaType valueOf(String str) {
            return (CtaType) Enum.valueOf(CtaType.class, str);
        }

        public static CtaType[] values() {
            return (CtaType[]) $VALUES.clone();
        }
    }

    public CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem(int i, CtaType ctaType, Integer num) {
        this.stepNum = i;
        this.ctaType = ctaType;
        this.toStepNum = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem = (CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem) obj;
        return this.stepNum == commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem.stepNum && this.ctaType == commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem.ctaType && epx.f(this.toStepNum, commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem.toStepNum);
    }

    public final int hashCode() {
        int hashCode = (this.ctaType.hashCode() + (Integer.hashCode(this.stepNum) * 31)) * 31;
        Integer num = this.toStepNum;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCommunityOnboardingWizardCrossSaleClickItem(stepNum=");
        sb.append(this.stepNum);
        sb.append(", ctaType=");
        sb.append(this.ctaType);
        sb.append(", toStepNum=");
        return uqi.b(sb, this.toStepNum, ')');
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem(int i, CtaType ctaType, Integer num, int i2, zcl zclVar) {
        this(i, ctaType, (i2 & 4) != 0 ? null : num);
    }
}

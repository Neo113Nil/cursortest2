package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityOnboardingClick implements SchemeStat$TypeClick.b {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("type")
    private final Type type;

    @pmi0("type_community_onboarding_tooltip_click")
    private final CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem typeCommunityOnboardingTooltipClick;

    @pmi0("type_community_onboarding_wizard_banner_click")
    private final CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem typeCommunityOnboardingWizardBannerClick;

    @pmi0("type_community_onboarding_wizard_cross_sale_click")
    private final CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem typeCommunityOnboardingWizardCrossSaleClick;

    @pmi0("type_community_onboarding_wizard_get_geo_click")
    private final CommonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem typeCommunityOnboardingWizardGetGeoClick;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_community_onboarding_tooltip_click")
        public static final Type TYPE_COMMUNITY_ONBOARDING_TOOLTIP_CLICK;

        @pmi0("type_community_onboarding_wizard_banner_click")
        public static final Type TYPE_COMMUNITY_ONBOARDING_WIZARD_BANNER_CLICK;

        @pmi0("type_community_onboarding_wizard_cross_sale_click")
        public static final Type TYPE_COMMUNITY_ONBOARDING_WIZARD_CROSS_SALE_CLICK;

        @pmi0("type_community_onboarding_wizard_get_geo_click")
        public static final Type TYPE_COMMUNITY_ONBOARDING_WIZARD_GET_GEO_CLICK;

        static {
            Type type = new Type("TYPE_COMMUNITY_ONBOARDING_TOOLTIP_CLICK", 0);
            TYPE_COMMUNITY_ONBOARDING_TOOLTIP_CLICK = type;
            Type type2 = new Type("TYPE_COMMUNITY_ONBOARDING_WIZARD_BANNER_CLICK", 1);
            TYPE_COMMUNITY_ONBOARDING_WIZARD_BANNER_CLICK = type2;
            Type type3 = new Type("TYPE_COMMUNITY_ONBOARDING_WIZARD_CROSS_SALE_CLICK", 2);
            TYPE_COMMUNITY_ONBOARDING_WIZARD_CROSS_SALE_CLICK = type3;
            Type type4 = new Type("TYPE_COMMUNITY_ONBOARDING_WIZARD_GET_GEO_CLICK", 3);
            TYPE_COMMUNITY_ONBOARDING_WIZARD_GET_GEO_CLICK = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    private CommonCommunitiesStat$TypeCommunityOnboardingClick(Type type, long j, CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem, CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem, CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem, CommonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem) {
        this.type = type;
        this.communityId = j;
        this.typeCommunityOnboardingTooltipClick = commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem;
        this.typeCommunityOnboardingWizardBannerClick = commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem;
        this.typeCommunityOnboardingWizardCrossSaleClick = commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem;
        this.typeCommunityOnboardingWizardGetGeoClick = commonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityOnboardingClick)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityOnboardingClick commonCommunitiesStat$TypeCommunityOnboardingClick = (CommonCommunitiesStat$TypeCommunityOnboardingClick) obj;
        return this.type == commonCommunitiesStat$TypeCommunityOnboardingClick.type && this.communityId == commonCommunitiesStat$TypeCommunityOnboardingClick.communityId && epx.f(this.typeCommunityOnboardingTooltipClick, commonCommunitiesStat$TypeCommunityOnboardingClick.typeCommunityOnboardingTooltipClick) && epx.f(this.typeCommunityOnboardingWizardBannerClick, commonCommunitiesStat$TypeCommunityOnboardingClick.typeCommunityOnboardingWizardBannerClick) && epx.f(this.typeCommunityOnboardingWizardCrossSaleClick, commonCommunitiesStat$TypeCommunityOnboardingClick.typeCommunityOnboardingWizardCrossSaleClick) && epx.f(this.typeCommunityOnboardingWizardGetGeoClick, commonCommunitiesStat$TypeCommunityOnboardingClick.typeCommunityOnboardingWizardGetGeoClick);
    }

    public final int hashCode() {
        int a = bh10.a(this.type.hashCode() * 31, 31, this.communityId);
        CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem = this.typeCommunityOnboardingTooltipClick;
        int hashCode = (a + (commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem == null ? 0 : commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem = this.typeCommunityOnboardingWizardBannerClick;
        int hashCode2 = (hashCode + (commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem == null ? 0 : commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem = this.typeCommunityOnboardingWizardCrossSaleClick;
        int hashCode3 = (hashCode2 + (commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem == null ? 0 : commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem = this.typeCommunityOnboardingWizardGetGeoClick;
        return hashCode3 + (commonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem != null ? commonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeCommunityOnboardingClick(type=" + this.type + ", communityId=" + this.communityId + ", typeCommunityOnboardingTooltipClick=" + this.typeCommunityOnboardingTooltipClick + ", typeCommunityOnboardingWizardBannerClick=" + this.typeCommunityOnboardingWizardBannerClick + ", typeCommunityOnboardingWizardCrossSaleClick=" + this.typeCommunityOnboardingWizardCrossSaleClick + ", typeCommunityOnboardingWizardGetGeoClick=" + this.typeCommunityOnboardingWizardGetGeoClick + ')';
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityOnboardingClick(Type type, long j, CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem, CommonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem, CommonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem, CommonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem commonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem, int i, zcl zclVar) {
        this(type, j, (i & 4) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem, (i & 8) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingWizardBannerClickItem, (i & 16) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingWizardCrossSaleClickItem, (i & 32) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingWizardGetGeoClickItem);
    }
}

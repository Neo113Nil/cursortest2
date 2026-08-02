package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.X3;
import xsna.asp;
import xsna.epx;
import xsna.kig;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem {

    @pmi0("step_name")
    private final StepName stepName;

    @pmi0("type")
    private final Type type;

    @pmi0("type_community_onboarding_tooltip_close_click")
    private final CommonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem typeCommunityOnboardingTooltipCloseClick;

    @pmi0("type_community_onboarding_tooltip_item_click")
    private final kig typeCommunityOnboardingTooltipItemClick;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class StepName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StepName[] $VALUES;

        @pmi0("avatar")
        public static final StepName AVATAR;

        @pmi0("cover")
        public static final StepName COVER;

        @pmi0(X3.i.G0)
        public static final StepName CTA;

        @pmi0("goods")
        public static final StepName GOODS;

        @pmi0("posts")
        public static final StepName POSTS;

        @pmi0("services")
        public static final StepName SERVICES;

        @pmi0("trigger_posts")
        public static final StepName TRIGGER_POSTS;

        static {
            StepName stepName = new StepName("AVATAR", 0);
            AVATAR = stepName;
            StepName stepName2 = new StepName(NativeAdContent.ViewTag.CTA, 1);
            CTA = stepName2;
            StepName stepName3 = new StepName("COVER", 2);
            COVER = stepName3;
            StepName stepName4 = new StepName("GOODS", 3);
            GOODS = stepName4;
            StepName stepName5 = new StepName("SERVICES", 4);
            SERVICES = stepName5;
            StepName stepName6 = new StepName("POSTS", 5);
            POSTS = stepName6;
            StepName stepName7 = new StepName("TRIGGER_POSTS", 6);
            TRIGGER_POSTS = stepName7;
            StepName[] stepNameArr = {stepName, stepName2, stepName3, stepName4, stepName5, stepName6, stepName7};
            $VALUES = stepNameArr;
            $ENTRIES = new asp(stepNameArr);
        }

        private StepName(String str, int i) {
        }

        public static StepName valueOf(String str) {
            return (StepName) Enum.valueOf(StepName.class, str);
        }

        public static StepName[] values() {
            return (StepName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_community_onboarding_tooltip_close_click")
        public static final Type TYPE_COMMUNITY_ONBOARDING_TOOLTIP_CLOSE_CLICK;

        @pmi0("type_community_onboarding_tooltip_item_click")
        public static final Type TYPE_COMMUNITY_ONBOARDING_TOOLTIP_ITEM_CLICK;

        static {
            Type type = new Type("TYPE_COMMUNITY_ONBOARDING_TOOLTIP_ITEM_CLICK", 0);
            TYPE_COMMUNITY_ONBOARDING_TOOLTIP_ITEM_CLICK = type;
            Type type2 = new Type("TYPE_COMMUNITY_ONBOARDING_TOOLTIP_CLOSE_CLICK", 1);
            TYPE_COMMUNITY_ONBOARDING_TOOLTIP_CLOSE_CLICK = type2;
            Type[] typeArr = {type, type2};
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

    private CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem(StepName stepName, Type type, CommonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem commonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem, kig kigVar) {
        this.stepName = stepName;
        this.type = type;
        this.typeCommunityOnboardingTooltipCloseClick = commonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem = (CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem) obj;
        return this.stepName == commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem.stepName && this.type == commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem.type && epx.f(this.typeCommunityOnboardingTooltipCloseClick, commonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem.typeCommunityOnboardingTooltipCloseClick);
    }

    public final int hashCode() {
        int hashCode = this.stepName.hashCode() * 31;
        Type type = this.type;
        int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem commonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem = this.typeCommunityOnboardingTooltipCloseClick;
        return (hashCode2 + (commonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem != null ? commonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "TypeCommunityOnboardingTooltipClickItem(stepName=" + this.stepName + ", type=" + this.type + ", typeCommunityOnboardingTooltipCloseClick=" + this.typeCommunityOnboardingTooltipCloseClick + ", typeCommunityOnboardingTooltipItemClick=null)";
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityOnboardingTooltipClickItem(StepName stepName, Type type, CommonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem commonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem, kig kigVar, int i, zcl zclVar) {
        this(stepName, (i & 2) != 0 ? null : type, (i & 4) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingTooltipCloseClickItem, (i & 8) != 0 ? null : kigVar);
    }
}

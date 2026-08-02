package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem {

    @pmi0("step_name")
    private final StepName stepName;

    @pmi0("type")
    private final Type type;

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

        @pmi0("type_community_onboarding_tooltip_success")
        public static final Type TYPE_COMMUNITY_ONBOARDING_TOOLTIP_SUCCESS;

        static {
            Type type = new Type("TYPE_COMMUNITY_ONBOARDING_TOOLTIP_SUCCESS", 0);
            TYPE_COMMUNITY_ONBOARDING_TOOLTIP_SUCCESS = type;
            Type[] typeArr = {type};
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

    public CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem(Type type, StepName stepName) {
        this.type = type;
        this.stepName = stepName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem = (CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem) obj;
        return this.type == commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem.type && this.stepName == commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem.stepName;
    }

    public final int hashCode() {
        return this.stepName.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "TypeCommunityOnboardingTooltipActionItem(type=" + this.type + ", stepName=" + this.stepName + ')';
    }
}

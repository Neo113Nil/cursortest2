package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityOnboardingAction implements SchemeStat$TypeAction.b {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("type")
    private final Type type;

    @pmi0("type_community_onboarding_tooltip_action")
    private final CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem typeCommunityOnboardingTooltipAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_community_onboarding_tooltip_action")
        public static final Type TYPE_COMMUNITY_ONBOARDING_TOOLTIP_ACTION;

        static {
            Type type = new Type("TYPE_COMMUNITY_ONBOARDING_TOOLTIP_ACTION", 0);
            TYPE_COMMUNITY_ONBOARDING_TOOLTIP_ACTION = type;
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

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityOnboardingAction(Type type, long j, CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem, zcl zclVar) {
        this(type, j, commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityOnboardingAction)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityOnboardingAction commonCommunitiesStat$TypeCommunityOnboardingAction = (CommonCommunitiesStat$TypeCommunityOnboardingAction) obj;
        return this.type == commonCommunitiesStat$TypeCommunityOnboardingAction.type && this.communityId == commonCommunitiesStat$TypeCommunityOnboardingAction.communityId && epx.f(this.typeCommunityOnboardingTooltipAction, commonCommunitiesStat$TypeCommunityOnboardingAction.typeCommunityOnboardingTooltipAction);
    }

    public final int hashCode() {
        int a = bh10.a(this.type.hashCode() * 31, 31, this.communityId);
        CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem = this.typeCommunityOnboardingTooltipAction;
        return a + (commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem == null ? 0 : commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem.hashCode());
    }

    public final String toString() {
        return "TypeCommunityOnboardingAction(type=" + this.type + ", communityId=" + this.communityId + ", typeCommunityOnboardingTooltipAction=" + this.typeCommunityOnboardingTooltipAction + ')';
    }

    private CommonCommunitiesStat$TypeCommunityOnboardingAction(Type type, long j, CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem) {
        this.type = type;
        this.communityId = j;
        this.typeCommunityOnboardingTooltipAction = commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem;
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityOnboardingAction(Type type, long j, CommonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem, int i, zcl zclVar) {
        this(type, j, (i & 4) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingTooltipActionItem);
    }
}

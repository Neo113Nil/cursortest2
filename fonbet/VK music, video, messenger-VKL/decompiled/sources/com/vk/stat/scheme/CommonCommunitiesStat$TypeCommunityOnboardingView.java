package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityOnboardingView implements SchemeStat$TypeView.b {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("type")
    private final Type type;

    @pmi0("type_community_onboarding_invitation_friends_view")
    private final CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem typeCommunityOnboardingInvitationFriendsView;

    @pmi0("type_community_onboarding_tooltip_view")
    private final CommonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem typeCommunityOnboardingTooltipView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_community_onboarding_invitation_friends_view")
        public static final Type TYPE_COMMUNITY_ONBOARDING_INVITATION_FRIENDS_VIEW;

        @pmi0("type_community_onboarding_tooltip_view")
        public static final Type TYPE_COMMUNITY_ONBOARDING_TOOLTIP_VIEW;

        static {
            Type type = new Type("TYPE_COMMUNITY_ONBOARDING_TOOLTIP_VIEW", 0);
            TYPE_COMMUNITY_ONBOARDING_TOOLTIP_VIEW = type;
            Type type2 = new Type("TYPE_COMMUNITY_ONBOARDING_INVITATION_FRIENDS_VIEW", 1);
            TYPE_COMMUNITY_ONBOARDING_INVITATION_FRIENDS_VIEW = type2;
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

    private CommonCommunitiesStat$TypeCommunityOnboardingView(Type type, long j, CommonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem commonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem, CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem commonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem) {
        this.type = type;
        this.communityId = j;
        this.typeCommunityOnboardingTooltipView = commonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem;
        this.typeCommunityOnboardingInvitationFriendsView = commonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityOnboardingView)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityOnboardingView commonCommunitiesStat$TypeCommunityOnboardingView = (CommonCommunitiesStat$TypeCommunityOnboardingView) obj;
        return this.type == commonCommunitiesStat$TypeCommunityOnboardingView.type && this.communityId == commonCommunitiesStat$TypeCommunityOnboardingView.communityId && epx.f(this.typeCommunityOnboardingTooltipView, commonCommunitiesStat$TypeCommunityOnboardingView.typeCommunityOnboardingTooltipView) && epx.f(this.typeCommunityOnboardingInvitationFriendsView, commonCommunitiesStat$TypeCommunityOnboardingView.typeCommunityOnboardingInvitationFriendsView);
    }

    public final int hashCode() {
        int a = bh10.a(this.type.hashCode() * 31, 31, this.communityId);
        CommonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem commonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem = this.typeCommunityOnboardingTooltipView;
        int hashCode = (a + (commonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem == null ? 0 : commonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem commonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem = this.typeCommunityOnboardingInvitationFriendsView;
        return hashCode + (commonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem != null ? commonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeCommunityOnboardingView(type=" + this.type + ", communityId=" + this.communityId + ", typeCommunityOnboardingTooltipView=" + this.typeCommunityOnboardingTooltipView + ", typeCommunityOnboardingInvitationFriendsView=" + this.typeCommunityOnboardingInvitationFriendsView + ')';
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityOnboardingView(Type type, long j, CommonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem commonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem, CommonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem commonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem, int i, zcl zclVar) {
        this(type, j, (i & 4) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingTooltipViewItem, (i & 8) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingInvitationFriendsViewItem);
    }
}

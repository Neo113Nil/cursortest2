package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunitiesClick implements SchemeStat$TypeClick.b {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("source")
    private final Source source;

    @pmi0("type")
    private final Type type;

    @pmi0("type_communities_creation_onboarding_click")
    private final CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem typeCommunitiesCreationOnboardingClick;

    @pmi0("type_communities_invitation_click")
    private final CommonCommunitiesStat$TypeCommunitiesInvitationClickItem typeCommunitiesInvitationClick;

    @pmi0("type_communities_navbar_click")
    private final CommonCommunitiesStat$TypeCommunitiesNavbarClickItem typeCommunitiesNavbarClick;

    @pmi0("type_communities_trust_marks_click")
    private final CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem typeCommunitiesTrustMarksClick;

    @pmi0("type_statistic_dashboard_click")
    private final CommonCommunitiesStat$TypeStatisticDashboardClickItem typeStatisticDashboardClick;

    @pmi0("type_video_profile_swipe_click")
    private final CommonCommunitiesStat$TypeVideoProfileSwipeClickItem typeVideoProfileSwipeClick;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("business_tools")
        public static final Source BUSINESS_TOOLS;

        @pmi0("clips_block")
        public static final Source CLIPS_BLOCK;

        @pmi0("community_header_block")
        public static final Source COMMUNITY_HEADER_BLOCK;

        @pmi0("creation_onboarding_block")
        public static final Source CREATION_ONBOARDING_BLOCK;

        @pmi0("group")
        public static final Source GROUP;

        @pmi0("other")
        public static final Source OTHER;

        @pmi0("statistic_dashboard")
        public static final Source STATISTIC_DASHBOARD;

        static {
            Source source = new Source("COMMUNITY_HEADER_BLOCK", 0);
            COMMUNITY_HEADER_BLOCK = source;
            Source source2 = new Source("CREATION_ONBOARDING_BLOCK", 1);
            CREATION_ONBOARDING_BLOCK = source2;
            Source source3 = new Source("CLIPS_BLOCK", 2);
            CLIPS_BLOCK = source3;
            Source source4 = new Source("STATISTIC_DASHBOARD", 3);
            STATISTIC_DASHBOARD = source4;
            Source source5 = new Source("GROUP", 4);
            GROUP = source5;
            Source source6 = new Source("BUSINESS_TOOLS", 5);
            BUSINESS_TOOLS = source6;
            Source source7 = new Source(NativeAdContent.ViewTag.OTHER, 6);
            OTHER = source7;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_communities_creation_onboarding_click")
        public static final Type TYPE_COMMUNITIES_CREATION_ONBOARDING_CLICK;

        @pmi0("type_communities_invitation_click")
        public static final Type TYPE_COMMUNITIES_INVITATION_CLICK;

        @pmi0("type_communities_navbar_click")
        public static final Type TYPE_COMMUNITIES_NAVBAR_CLICK;

        @pmi0("type_communities_trust_marks_click")
        public static final Type TYPE_COMMUNITIES_TRUST_MARKS_CLICK;

        @pmi0("type_statistic_dashboard_click")
        public static final Type TYPE_STATISTIC_DASHBOARD_CLICK;

        @pmi0("type_video_profile_swipe_click")
        public static final Type TYPE_VIDEO_PROFILE_SWIPE_CLICK;

        static {
            Type type = new Type("TYPE_COMMUNITIES_CREATION_ONBOARDING_CLICK", 0);
            TYPE_COMMUNITIES_CREATION_ONBOARDING_CLICK = type;
            Type type2 = new Type("TYPE_COMMUNITIES_INVITATION_CLICK", 1);
            TYPE_COMMUNITIES_INVITATION_CLICK = type2;
            Type type3 = new Type("TYPE_COMMUNITIES_NAVBAR_CLICK", 2);
            TYPE_COMMUNITIES_NAVBAR_CLICK = type3;
            Type type4 = new Type("TYPE_COMMUNITIES_TRUST_MARKS_CLICK", 3);
            TYPE_COMMUNITIES_TRUST_MARKS_CLICK = type4;
            Type type5 = new Type("TYPE_VIDEO_PROFILE_SWIPE_CLICK", 4);
            TYPE_VIDEO_PROFILE_SWIPE_CLICK = type5;
            Type type6 = new Type("TYPE_STATISTIC_DASHBOARD_CLICK", 5);
            TYPE_STATISTIC_DASHBOARD_CLICK = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
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

    /* compiled from: CommonCommunitiesStat.kt */
    public static final class a {
        public static CommonCommunitiesStat$TypeCommunitiesClick a(long j, Source source, b bVar) {
            if (bVar instanceof CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem) {
                return new CommonCommunitiesStat$TypeCommunitiesClick(Type.TYPE_COMMUNITIES_CREATION_ONBOARDING_CLICK, j, source, (CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem) bVar, null, null, null, null, null, 496, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunitiesInvitationClickItem) {
                return new CommonCommunitiesStat$TypeCommunitiesClick(Type.TYPE_COMMUNITIES_INVITATION_CLICK, j, source, null, (CommonCommunitiesStat$TypeCommunitiesInvitationClickItem) bVar, null, null, null, null, 488, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunitiesNavbarClickItem) {
                return new CommonCommunitiesStat$TypeCommunitiesClick(Type.TYPE_COMMUNITIES_NAVBAR_CLICK, j, source, null, null, (CommonCommunitiesStat$TypeCommunitiesNavbarClickItem) bVar, null, null, null, 472, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem) {
                return new CommonCommunitiesStat$TypeCommunitiesClick(Type.TYPE_COMMUNITIES_TRUST_MARKS_CLICK, j, source, null, null, null, (CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem) bVar, null, null, 440, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeVideoProfileSwipeClickItem) {
                return new CommonCommunitiesStat$TypeCommunitiesClick(Type.TYPE_VIDEO_PROFILE_SWIPE_CLICK, j, source, null, null, null, null, (CommonCommunitiesStat$TypeVideoProfileSwipeClickItem) bVar, null, 376, null);
            }
            if (!(bVar instanceof CommonCommunitiesStat$TypeStatisticDashboardClickItem)) {
                throw new IllegalArgumentException("payload must be one of(TypeCommunitiesCreationOnboardingClickItem, TypeCommunitiesInvitationClickItem, TypeCommunitiesNavbarClickItem, TypeCommunitiesTrustMarksClickItem, TypeVideoProfileSwipeClickItem, TypeStatisticDashboardClickItem)");
            }
            return new CommonCommunitiesStat$TypeCommunitiesClick(Type.TYPE_STATISTIC_DASHBOARD_CLICK, j, source, null, null, null, null, null, (CommonCommunitiesStat$TypeStatisticDashboardClickItem) bVar, 248, null);
        }
    }

    /* compiled from: CommonCommunitiesStat.kt */
    public interface b {
    }

    private CommonCommunitiesStat$TypeCommunitiesClick(Type type, long j, Source source, CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem, CommonCommunitiesStat$TypeCommunitiesInvitationClickItem commonCommunitiesStat$TypeCommunitiesInvitationClickItem, CommonCommunitiesStat$TypeCommunitiesNavbarClickItem commonCommunitiesStat$TypeCommunitiesNavbarClickItem, CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem, CommonCommunitiesStat$TypeVideoProfileSwipeClickItem commonCommunitiesStat$TypeVideoProfileSwipeClickItem, CommonCommunitiesStat$TypeStatisticDashboardClickItem commonCommunitiesStat$TypeStatisticDashboardClickItem) {
        this.type = type;
        this.communityId = j;
        this.source = source;
        this.typeCommunitiesCreationOnboardingClick = commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem;
        this.typeCommunitiesInvitationClick = commonCommunitiesStat$TypeCommunitiesInvitationClickItem;
        this.typeCommunitiesNavbarClick = commonCommunitiesStat$TypeCommunitiesNavbarClickItem;
        this.typeCommunitiesTrustMarksClick = commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem;
        this.typeVideoProfileSwipeClick = commonCommunitiesStat$TypeVideoProfileSwipeClickItem;
        this.typeStatisticDashboardClick = commonCommunitiesStat$TypeStatisticDashboardClickItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunitiesClick)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunitiesClick commonCommunitiesStat$TypeCommunitiesClick = (CommonCommunitiesStat$TypeCommunitiesClick) obj;
        return this.type == commonCommunitiesStat$TypeCommunitiesClick.type && this.communityId == commonCommunitiesStat$TypeCommunitiesClick.communityId && this.source == commonCommunitiesStat$TypeCommunitiesClick.source && epx.f(this.typeCommunitiesCreationOnboardingClick, commonCommunitiesStat$TypeCommunitiesClick.typeCommunitiesCreationOnboardingClick) && epx.f(this.typeCommunitiesInvitationClick, commonCommunitiesStat$TypeCommunitiesClick.typeCommunitiesInvitationClick) && epx.f(this.typeCommunitiesNavbarClick, commonCommunitiesStat$TypeCommunitiesClick.typeCommunitiesNavbarClick) && epx.f(this.typeCommunitiesTrustMarksClick, commonCommunitiesStat$TypeCommunitiesClick.typeCommunitiesTrustMarksClick) && epx.f(this.typeVideoProfileSwipeClick, commonCommunitiesStat$TypeCommunitiesClick.typeVideoProfileSwipeClick) && epx.f(this.typeStatisticDashboardClick, commonCommunitiesStat$TypeCommunitiesClick.typeStatisticDashboardClick);
    }

    public final int hashCode() {
        int hashCode = (this.source.hashCode() + bh10.a(this.type.hashCode() * 31, 31, this.communityId)) * 31;
        CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem = this.typeCommunitiesCreationOnboardingClick;
        int hashCode2 = (hashCode + (commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem == null ? 0 : commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunitiesInvitationClickItem commonCommunitiesStat$TypeCommunitiesInvitationClickItem = this.typeCommunitiesInvitationClick;
        int hashCode3 = (hashCode2 + (commonCommunitiesStat$TypeCommunitiesInvitationClickItem == null ? 0 : commonCommunitiesStat$TypeCommunitiesInvitationClickItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunitiesNavbarClickItem commonCommunitiesStat$TypeCommunitiesNavbarClickItem = this.typeCommunitiesNavbarClick;
        int hashCode4 = (hashCode3 + (commonCommunitiesStat$TypeCommunitiesNavbarClickItem == null ? 0 : commonCommunitiesStat$TypeCommunitiesNavbarClickItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem = this.typeCommunitiesTrustMarksClick;
        int hashCode5 = (hashCode4 + (commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem == null ? 0 : commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeVideoProfileSwipeClickItem commonCommunitiesStat$TypeVideoProfileSwipeClickItem = this.typeVideoProfileSwipeClick;
        int hashCode6 = (hashCode5 + (commonCommunitiesStat$TypeVideoProfileSwipeClickItem == null ? 0 : commonCommunitiesStat$TypeVideoProfileSwipeClickItem.hashCode())) * 31;
        CommonCommunitiesStat$TypeStatisticDashboardClickItem commonCommunitiesStat$TypeStatisticDashboardClickItem = this.typeStatisticDashboardClick;
        return hashCode6 + (commonCommunitiesStat$TypeStatisticDashboardClickItem != null ? commonCommunitiesStat$TypeStatisticDashboardClickItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeCommunitiesClick(type=" + this.type + ", communityId=" + this.communityId + ", source=" + this.source + ", typeCommunitiesCreationOnboardingClick=" + this.typeCommunitiesCreationOnboardingClick + ", typeCommunitiesInvitationClick=" + this.typeCommunitiesInvitationClick + ", typeCommunitiesNavbarClick=" + this.typeCommunitiesNavbarClick + ", typeCommunitiesTrustMarksClick=" + this.typeCommunitiesTrustMarksClick + ", typeVideoProfileSwipeClick=" + this.typeVideoProfileSwipeClick + ", typeStatisticDashboardClick=" + this.typeStatisticDashboardClick + ')';
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunitiesClick(Type type, long j, Source source, CommonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem, CommonCommunitiesStat$TypeCommunitiesInvitationClickItem commonCommunitiesStat$TypeCommunitiesInvitationClickItem, CommonCommunitiesStat$TypeCommunitiesNavbarClickItem commonCommunitiesStat$TypeCommunitiesNavbarClickItem, CommonCommunitiesStat$TypeCommunitiesTrustMarksClickItem commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem, CommonCommunitiesStat$TypeVideoProfileSwipeClickItem commonCommunitiesStat$TypeVideoProfileSwipeClickItem, CommonCommunitiesStat$TypeStatisticDashboardClickItem commonCommunitiesStat$TypeStatisticDashboardClickItem, int i, zcl zclVar) {
        this(type, j, source, (i & 8) != 0 ? null : commonCommunitiesStat$TypeCommunitiesCreationOnboardingClickItem, (i & 16) != 0 ? null : commonCommunitiesStat$TypeCommunitiesInvitationClickItem, (i & 32) != 0 ? null : commonCommunitiesStat$TypeCommunitiesNavbarClickItem, (i & 64) != 0 ? null : commonCommunitiesStat$TypeCommunitiesTrustMarksClickItem, (i & 128) != 0 ? null : commonCommunitiesStat$TypeVideoProfileSwipeClickItem, (i & 256) != 0 ? null : commonCommunitiesStat$TypeStatisticDashboardClickItem);
    }
}

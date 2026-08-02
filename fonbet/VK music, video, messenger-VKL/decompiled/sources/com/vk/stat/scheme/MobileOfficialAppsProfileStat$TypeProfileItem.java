package com.vk.stat.scheme;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$TypeProfileItem implements SchemeStat$TypeClick.b {

    @pmi0("another_user_profile_event")
    private final MobileOfficialAppsProfileStat$AnotherUserProfileEvent anotherUserProfileEvent;

    @pmi0("another_user_profile_menu_event")
    private final MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent anotherUserProfileMenuEvent;

    @pmi0("avatar_event")
    private final MobileOfficialAppsProfileStat$AvatarEvent avatarEvent;

    @pmi0("content_tabs_event")
    private final CommonProfileStat$ContentTabsEvent contentTabsEvent;

    @pmi0("cover_event")
    private final MobileOfficialAppsProfileStat$CoverEvent coverEvent;

    @pmi0("edit_profile_event")
    private final MobileOfficialAppsProfileStat$EditProfileEvent editProfileEvent;

    @pmi0("emoji_status")
    private final Integer emojiStatus;

    @pmi0("has_avatar")
    private final boolean hasAvatar;

    @pmi0("has_cover")
    private final boolean hasCover;

    @pmi0("has_short_info")
    private final Boolean hasShortInfo;

    @pmi0("is_closed_profile")
    private final boolean isClosedProfile;

    @pmi0("is_onboarding")
    private final boolean isOnboarding;

    @pmi0("is_users_friend")
    private final IsUsersFriend isUsersFriend;

    @pmi0("is_verified")
    private final boolean isVerified;

    @pmi0("onboarding_event")
    private final MobileOfficialAppsProfileStat$OnboardingEvent onboardingEvent;

    @pmi0("project_buttons")
    private final List<Long> projectButtons;

    @pmi0("promo_buttons")
    private final List<Long> promoButtons;

    @pmi0("publishing_event")
    private final MobileOfficialAppsProfileStat$PublishingEvent publishingEvent;

    @pmi0("qr_profile_event")
    private final MobileOfficialAppsProfileStat$QrProfileEvent qrProfileEvent;

    @pmi0("services_event")
    private final MobileOfficialAppsProfileStat$ServicesEvent servicesEvent;

    @pmi0("stories_event")
    private final MobileOfficialAppsProfileStat$StoriesEvent storiesEvent;

    @pmi0("user_detail_info_event")
    private final MobileOfficialAppsProfileStat$UserDetailInfoEvent userDetailInfoEvent;

    @pmi0("user_menu_event")
    private final MobileOfficialAppsProfileStat$UserMenuEvent userMenuEvent;

    @pmi0("user_profile_id")
    private final long userProfileId;

    @pmi0("watching_content_event")
    private final CommonProfileStat$WatchingContentEvent watchingContentEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class IsUsersFriend {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IsUsersFriend[] $VALUES;

        @pmi0("friend")
        public static final IsUsersFriend FRIEND;

        @pmi0("none")
        public static final IsUsersFriend NONE;

        @pmi0("receive_request")
        public static final IsUsersFriend RECEIVE_REQUEST;

        @pmi0("send_request")
        public static final IsUsersFriend SEND_REQUEST;

        static {
            IsUsersFriend isUsersFriend = new IsUsersFriend("FRIEND", 0);
            FRIEND = isUsersFriend;
            IsUsersFriend isUsersFriend2 = new IsUsersFriend("SEND_REQUEST", 1);
            SEND_REQUEST = isUsersFriend2;
            IsUsersFriend isUsersFriend3 = new IsUsersFriend("RECEIVE_REQUEST", 2);
            RECEIVE_REQUEST = isUsersFriend3;
            IsUsersFriend isUsersFriend4 = new IsUsersFriend("NONE", 3);
            NONE = isUsersFriend4;
            IsUsersFriend[] isUsersFriendArr = {isUsersFriend, isUsersFriend2, isUsersFriend3, isUsersFriend4};
            $VALUES = isUsersFriendArr;
            $ENTRIES = new asp(isUsersFriendArr);
        }

        private IsUsersFriend(String str, int i) {
        }

        public static IsUsersFriend valueOf(String str) {
            return (IsUsersFriend) Enum.valueOf(IsUsersFriend.class, str);
        }

        public static IsUsersFriend[] values() {
            return (IsUsersFriend[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsProfileStat$TypeProfileItem(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, Boolean bool, IsUsersFriend isUsersFriend, List<Long> list, List<Long> list2, MobileOfficialAppsProfileStat$CoverEvent mobileOfficialAppsProfileStat$CoverEvent, MobileOfficialAppsProfileStat$OnboardingEvent mobileOfficialAppsProfileStat$OnboardingEvent, MobileOfficialAppsProfileStat$UserMenuEvent mobileOfficialAppsProfileStat$UserMenuEvent, MobileOfficialAppsProfileStat$QrProfileEvent mobileOfficialAppsProfileStat$QrProfileEvent, MobileOfficialAppsProfileStat$EditProfileEvent mobileOfficialAppsProfileStat$EditProfileEvent, MobileOfficialAppsProfileStat$AvatarEvent mobileOfficialAppsProfileStat$AvatarEvent, MobileOfficialAppsProfileStat$ServicesEvent mobileOfficialAppsProfileStat$ServicesEvent, MobileOfficialAppsProfileStat$PublishingEvent mobileOfficialAppsProfileStat$PublishingEvent, MobileOfficialAppsProfileStat$AnotherUserProfileEvent mobileOfficialAppsProfileStat$AnotherUserProfileEvent, MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent, CommonProfileStat$WatchingContentEvent commonProfileStat$WatchingContentEvent, CommonProfileStat$ContentTabsEvent commonProfileStat$ContentTabsEvent, MobileOfficialAppsProfileStat$UserDetailInfoEvent mobileOfficialAppsProfileStat$UserDetailInfoEvent, MobileOfficialAppsProfileStat$StoriesEvent mobileOfficialAppsProfileStat$StoriesEvent) {
        this.userProfileId = j;
        this.hasCover = z;
        this.isVerified = z2;
        this.hasAvatar = z3;
        this.isClosedProfile = z4;
        this.isOnboarding = z5;
        this.emojiStatus = num;
        this.hasShortInfo = bool;
        this.isUsersFriend = isUsersFriend;
        this.promoButtons = list;
        this.projectButtons = list2;
        this.coverEvent = mobileOfficialAppsProfileStat$CoverEvent;
        this.onboardingEvent = mobileOfficialAppsProfileStat$OnboardingEvent;
        this.userMenuEvent = mobileOfficialAppsProfileStat$UserMenuEvent;
        this.qrProfileEvent = mobileOfficialAppsProfileStat$QrProfileEvent;
        this.editProfileEvent = mobileOfficialAppsProfileStat$EditProfileEvent;
        this.avatarEvent = mobileOfficialAppsProfileStat$AvatarEvent;
        this.servicesEvent = mobileOfficialAppsProfileStat$ServicesEvent;
        this.publishingEvent = mobileOfficialAppsProfileStat$PublishingEvent;
        this.anotherUserProfileEvent = mobileOfficialAppsProfileStat$AnotherUserProfileEvent;
        this.anotherUserProfileMenuEvent = mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent;
        this.watchingContentEvent = commonProfileStat$WatchingContentEvent;
        this.contentTabsEvent = commonProfileStat$ContentTabsEvent;
        this.userDetailInfoEvent = mobileOfficialAppsProfileStat$UserDetailInfoEvent;
        this.storiesEvent = mobileOfficialAppsProfileStat$StoriesEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$TypeProfileItem)) {
            return false;
        }
        MobileOfficialAppsProfileStat$TypeProfileItem mobileOfficialAppsProfileStat$TypeProfileItem = (MobileOfficialAppsProfileStat$TypeProfileItem) obj;
        return this.userProfileId == mobileOfficialAppsProfileStat$TypeProfileItem.userProfileId && this.hasCover == mobileOfficialAppsProfileStat$TypeProfileItem.hasCover && this.isVerified == mobileOfficialAppsProfileStat$TypeProfileItem.isVerified && this.hasAvatar == mobileOfficialAppsProfileStat$TypeProfileItem.hasAvatar && this.isClosedProfile == mobileOfficialAppsProfileStat$TypeProfileItem.isClosedProfile && this.isOnboarding == mobileOfficialAppsProfileStat$TypeProfileItem.isOnboarding && epx.f(this.emojiStatus, mobileOfficialAppsProfileStat$TypeProfileItem.emojiStatus) && epx.f(this.hasShortInfo, mobileOfficialAppsProfileStat$TypeProfileItem.hasShortInfo) && this.isUsersFriend == mobileOfficialAppsProfileStat$TypeProfileItem.isUsersFriend && epx.f(this.promoButtons, mobileOfficialAppsProfileStat$TypeProfileItem.promoButtons) && epx.f(this.projectButtons, mobileOfficialAppsProfileStat$TypeProfileItem.projectButtons) && epx.f(this.coverEvent, mobileOfficialAppsProfileStat$TypeProfileItem.coverEvent) && epx.f(this.onboardingEvent, mobileOfficialAppsProfileStat$TypeProfileItem.onboardingEvent) && epx.f(this.userMenuEvent, mobileOfficialAppsProfileStat$TypeProfileItem.userMenuEvent) && epx.f(this.qrProfileEvent, mobileOfficialAppsProfileStat$TypeProfileItem.qrProfileEvent) && epx.f(this.editProfileEvent, mobileOfficialAppsProfileStat$TypeProfileItem.editProfileEvent) && epx.f(this.avatarEvent, mobileOfficialAppsProfileStat$TypeProfileItem.avatarEvent) && epx.f(this.servicesEvent, mobileOfficialAppsProfileStat$TypeProfileItem.servicesEvent) && epx.f(this.publishingEvent, mobileOfficialAppsProfileStat$TypeProfileItem.publishingEvent) && epx.f(this.anotherUserProfileEvent, mobileOfficialAppsProfileStat$TypeProfileItem.anotherUserProfileEvent) && epx.f(this.anotherUserProfileMenuEvent, mobileOfficialAppsProfileStat$TypeProfileItem.anotherUserProfileMenuEvent) && epx.f(this.watchingContentEvent, mobileOfficialAppsProfileStat$TypeProfileItem.watchingContentEvent) && epx.f(this.contentTabsEvent, mobileOfficialAppsProfileStat$TypeProfileItem.contentTabsEvent) && epx.f(this.userDetailInfoEvent, mobileOfficialAppsProfileStat$TypeProfileItem.userDetailInfoEvent) && epx.f(this.storiesEvent, mobileOfficialAppsProfileStat$TypeProfileItem.storiesEvent);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Long.hashCode(this.userProfileId) * 31, 31, this.hasCover), 31, this.isVerified), 31, this.hasAvatar), 31, this.isClosedProfile), 31, this.isOnboarding);
        Integer num = this.emojiStatus;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasShortInfo;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        IsUsersFriend isUsersFriend = this.isUsersFriend;
        int hashCode3 = (hashCode2 + (isUsersFriend == null ? 0 : isUsersFriend.hashCode())) * 31;
        List<Long> list = this.promoButtons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.projectButtons;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MobileOfficialAppsProfileStat$CoverEvent mobileOfficialAppsProfileStat$CoverEvent = this.coverEvent;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsProfileStat$CoverEvent == null ? 0 : mobileOfficialAppsProfileStat$CoverEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$OnboardingEvent mobileOfficialAppsProfileStat$OnboardingEvent = this.onboardingEvent;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsProfileStat$OnboardingEvent == null ? 0 : mobileOfficialAppsProfileStat$OnboardingEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$UserMenuEvent mobileOfficialAppsProfileStat$UserMenuEvent = this.userMenuEvent;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsProfileStat$UserMenuEvent == null ? 0 : mobileOfficialAppsProfileStat$UserMenuEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$QrProfileEvent mobileOfficialAppsProfileStat$QrProfileEvent = this.qrProfileEvent;
        int hashCode9 = (hashCode8 + (mobileOfficialAppsProfileStat$QrProfileEvent == null ? 0 : mobileOfficialAppsProfileStat$QrProfileEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$EditProfileEvent mobileOfficialAppsProfileStat$EditProfileEvent = this.editProfileEvent;
        int hashCode10 = (hashCode9 + (mobileOfficialAppsProfileStat$EditProfileEvent == null ? 0 : mobileOfficialAppsProfileStat$EditProfileEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$AvatarEvent mobileOfficialAppsProfileStat$AvatarEvent = this.avatarEvent;
        int hashCode11 = (hashCode10 + (mobileOfficialAppsProfileStat$AvatarEvent == null ? 0 : mobileOfficialAppsProfileStat$AvatarEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$ServicesEvent mobileOfficialAppsProfileStat$ServicesEvent = this.servicesEvent;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsProfileStat$ServicesEvent == null ? 0 : mobileOfficialAppsProfileStat$ServicesEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$PublishingEvent mobileOfficialAppsProfileStat$PublishingEvent = this.publishingEvent;
        int hashCode13 = (hashCode12 + (mobileOfficialAppsProfileStat$PublishingEvent == null ? 0 : mobileOfficialAppsProfileStat$PublishingEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$AnotherUserProfileEvent mobileOfficialAppsProfileStat$AnotherUserProfileEvent = this.anotherUserProfileEvent;
        int hashCode14 = (hashCode13 + (mobileOfficialAppsProfileStat$AnotherUserProfileEvent == null ? 0 : mobileOfficialAppsProfileStat$AnotherUserProfileEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent = this.anotherUserProfileMenuEvent;
        int hashCode15 = (hashCode14 + (mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent == null ? 0 : mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.hashCode())) * 31;
        CommonProfileStat$WatchingContentEvent commonProfileStat$WatchingContentEvent = this.watchingContentEvent;
        int hashCode16 = (hashCode15 + (commonProfileStat$WatchingContentEvent == null ? 0 : commonProfileStat$WatchingContentEvent.hashCode())) * 31;
        CommonProfileStat$ContentTabsEvent commonProfileStat$ContentTabsEvent = this.contentTabsEvent;
        int hashCode17 = (hashCode16 + (commonProfileStat$ContentTabsEvent == null ? 0 : commonProfileStat$ContentTabsEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$UserDetailInfoEvent mobileOfficialAppsProfileStat$UserDetailInfoEvent = this.userDetailInfoEvent;
        int hashCode18 = (hashCode17 + (mobileOfficialAppsProfileStat$UserDetailInfoEvent == null ? 0 : mobileOfficialAppsProfileStat$UserDetailInfoEvent.hashCode())) * 31;
        MobileOfficialAppsProfileStat$StoriesEvent mobileOfficialAppsProfileStat$StoriesEvent = this.storiesEvent;
        return hashCode18 + (mobileOfficialAppsProfileStat$StoriesEvent != null ? mobileOfficialAppsProfileStat$StoriesEvent.hashCode() : 0);
    }

    public final String toString() {
        return "TypeProfileItem(userProfileId=" + this.userProfileId + ", hasCover=" + this.hasCover + ", isVerified=" + this.isVerified + ", hasAvatar=" + this.hasAvatar + ", isClosedProfile=" + this.isClosedProfile + ", isOnboarding=" + this.isOnboarding + ", emojiStatus=" + this.emojiStatus + ", hasShortInfo=" + this.hasShortInfo + ", isUsersFriend=" + this.isUsersFriend + ", promoButtons=" + this.promoButtons + ", projectButtons=" + this.projectButtons + ", coverEvent=" + this.coverEvent + ", onboardingEvent=" + this.onboardingEvent + ", userMenuEvent=" + this.userMenuEvent + ", qrProfileEvent=" + this.qrProfileEvent + ", editProfileEvent=" + this.editProfileEvent + ", avatarEvent=" + this.avatarEvent + ", servicesEvent=" + this.servicesEvent + ", publishingEvent=" + this.publishingEvent + ", anotherUserProfileEvent=" + this.anotherUserProfileEvent + ", anotherUserProfileMenuEvent=" + this.anotherUserProfileMenuEvent + ", watchingContentEvent=" + this.watchingContentEvent + ", contentTabsEvent=" + this.contentTabsEvent + ", userDetailInfoEvent=" + this.userDetailInfoEvent + ", storiesEvent=" + this.storiesEvent + ')';
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$TypeProfileItem(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, Boolean bool, IsUsersFriend isUsersFriend, List list, List list2, MobileOfficialAppsProfileStat$CoverEvent mobileOfficialAppsProfileStat$CoverEvent, MobileOfficialAppsProfileStat$OnboardingEvent mobileOfficialAppsProfileStat$OnboardingEvent, MobileOfficialAppsProfileStat$UserMenuEvent mobileOfficialAppsProfileStat$UserMenuEvent, MobileOfficialAppsProfileStat$QrProfileEvent mobileOfficialAppsProfileStat$QrProfileEvent, MobileOfficialAppsProfileStat$EditProfileEvent mobileOfficialAppsProfileStat$EditProfileEvent, MobileOfficialAppsProfileStat$AvatarEvent mobileOfficialAppsProfileStat$AvatarEvent, MobileOfficialAppsProfileStat$ServicesEvent mobileOfficialAppsProfileStat$ServicesEvent, MobileOfficialAppsProfileStat$PublishingEvent mobileOfficialAppsProfileStat$PublishingEvent, MobileOfficialAppsProfileStat$AnotherUserProfileEvent mobileOfficialAppsProfileStat$AnotherUserProfileEvent, MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent, CommonProfileStat$WatchingContentEvent commonProfileStat$WatchingContentEvent, CommonProfileStat$ContentTabsEvent commonProfileStat$ContentTabsEvent, MobileOfficialAppsProfileStat$UserDetailInfoEvent mobileOfficialAppsProfileStat$UserDetailInfoEvent, MobileOfficialAppsProfileStat$StoriesEvent mobileOfficialAppsProfileStat$StoriesEvent, int i, zcl zclVar) {
        this(j, z, z2, z3, z4, z5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : isUsersFriend, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : mobileOfficialAppsProfileStat$CoverEvent, (i & 4096) != 0 ? null : mobileOfficialAppsProfileStat$OnboardingEvent, (i & 8192) != 0 ? null : mobileOfficialAppsProfileStat$UserMenuEvent, (i & 16384) != 0 ? null : mobileOfficialAppsProfileStat$QrProfileEvent, (32768 & i) != 0 ? null : mobileOfficialAppsProfileStat$EditProfileEvent, (65536 & i) != 0 ? null : mobileOfficialAppsProfileStat$AvatarEvent, (131072 & i) != 0 ? null : mobileOfficialAppsProfileStat$ServicesEvent, (262144 & i) != 0 ? null : mobileOfficialAppsProfileStat$PublishingEvent, (524288 & i) != 0 ? null : mobileOfficialAppsProfileStat$AnotherUserProfileEvent, (1048576 & i) != 0 ? null : mobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent, (2097152 & i) != 0 ? null : commonProfileStat$WatchingContentEvent, (4194304 & i) != 0 ? null : commonProfileStat$ContentTabsEvent, (8388608 & i) != 0 ? null : mobileOfficialAppsProfileStat$UserDetailInfoEvent, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsProfileStat$StoriesEvent);
    }
}

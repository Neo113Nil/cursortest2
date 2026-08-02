package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingClient;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupDonutBlockDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutBlockDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutBlockDto> CREATOR = new a();

    @pmi0("goals")
    private final GroupsGroupDonutGoalsDto goals;

    @pmi0("levels_admin_onboarding_banner")
    private final GroupsGroupDonutLevelsAdminOnboardingBannerDto levelsAdminOnboardingBanner;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    private final GroupsGroupDonutSubscriptionsDto subscriptions;

    /* compiled from: GroupsGroupDonutBlockDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutBlockDto createFromParcel(Parcel parcel) {
            return new GroupsGroupDonutBlockDto(parcel.readInt() == 0 ? null : GroupsGroupDonutSubscriptionsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsGroupDonutGoalsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupsGroupDonutLevelsAdminOnboardingBannerDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutBlockDto[] newArray(int i) {
            return new GroupsGroupDonutBlockDto[i];
        }
    }

    public GroupsGroupDonutBlockDto() {
        this(null, null, null, 7, null);
    }

    public final GroupsGroupDonutGoalsDto d() {
        return this.goals;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsGroupDonutSubscriptionsDto e() {
        return this.subscriptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDonutBlockDto)) {
            return false;
        }
        GroupsGroupDonutBlockDto groupsGroupDonutBlockDto = (GroupsGroupDonutBlockDto) obj;
        return epx.f(this.subscriptions, groupsGroupDonutBlockDto.subscriptions) && epx.f(this.goals, groupsGroupDonutBlockDto.goals) && epx.f(this.levelsAdminOnboardingBanner, groupsGroupDonutBlockDto.levelsAdminOnboardingBanner);
    }

    public final int hashCode() {
        GroupsGroupDonutSubscriptionsDto groupsGroupDonutSubscriptionsDto = this.subscriptions;
        int hashCode = (groupsGroupDonutSubscriptionsDto == null ? 0 : groupsGroupDonutSubscriptionsDto.hashCode()) * 31;
        GroupsGroupDonutGoalsDto groupsGroupDonutGoalsDto = this.goals;
        int hashCode2 = (hashCode + (groupsGroupDonutGoalsDto == null ? 0 : groupsGroupDonutGoalsDto.hashCode())) * 31;
        GroupsGroupDonutLevelsAdminOnboardingBannerDto groupsGroupDonutLevelsAdminOnboardingBannerDto = this.levelsAdminOnboardingBanner;
        return hashCode2 + (groupsGroupDonutLevelsAdminOnboardingBannerDto != null ? groupsGroupDonutLevelsAdminOnboardingBannerDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsGroupDonutBlockDto(subscriptions=" + this.subscriptions + ", goals=" + this.goals + ", levelsAdminOnboardingBanner=" + this.levelsAdminOnboardingBanner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsGroupDonutSubscriptionsDto groupsGroupDonutSubscriptionsDto = this.subscriptions;
        if (groupsGroupDonutSubscriptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupDonutSubscriptionsDto.writeToParcel(parcel, i);
        }
        GroupsGroupDonutGoalsDto groupsGroupDonutGoalsDto = this.goals;
        if (groupsGroupDonutGoalsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupDonutGoalsDto.writeToParcel(parcel, i);
        }
        GroupsGroupDonutLevelsAdminOnboardingBannerDto groupsGroupDonutLevelsAdminOnboardingBannerDto = this.levelsAdminOnboardingBanner;
        if (groupsGroupDonutLevelsAdminOnboardingBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupDonutLevelsAdminOnboardingBannerDto.writeToParcel(parcel, i);
        }
    }

    public GroupsGroupDonutBlockDto(GroupsGroupDonutSubscriptionsDto groupsGroupDonutSubscriptionsDto, GroupsGroupDonutGoalsDto groupsGroupDonutGoalsDto, GroupsGroupDonutLevelsAdminOnboardingBannerDto groupsGroupDonutLevelsAdminOnboardingBannerDto) {
        this.subscriptions = groupsGroupDonutSubscriptionsDto;
        this.goals = groupsGroupDonutGoalsDto;
        this.levelsAdminOnboardingBanner = groupsGroupDonutLevelsAdminOnboardingBannerDto;
    }

    public /* synthetic */ GroupsGroupDonutBlockDto(GroupsGroupDonutSubscriptionsDto groupsGroupDonutSubscriptionsDto, GroupsGroupDonutGoalsDto groupsGroupDonutGoalsDto, GroupsGroupDonutLevelsAdminOnboardingBannerDto groupsGroupDonutLevelsAdminOnboardingBannerDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsGroupDonutSubscriptionsDto, (i & 2) != 0 ? null : groupsGroupDonutGoalsDto, (i & 4) != 0 ? null : groupsGroupDonutLevelsAdminOnboardingBannerDto);
    }
}

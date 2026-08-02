package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsGroupDonutLevelsAdminOnboardingBannerDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDonutLevelsAdminOnboardingBannerDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDonutLevelsAdminOnboardingBannerDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    /* compiled from: GroupsGroupDonutLevelsAdminOnboardingBannerDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDonutLevelsAdminOnboardingBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutLevelsAdminOnboardingBannerDto createFromParcel(Parcel parcel) {
            return new GroupsGroupDonutLevelsAdminOnboardingBannerDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDonutLevelsAdminOnboardingBannerDto[] newArray(int i) {
            return new GroupsGroupDonutLevelsAdminOnboardingBannerDto[i];
        }
    }

    public GroupsGroupDonutLevelsAdminOnboardingBannerDto(String str) {
        this.link = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsGroupDonutLevelsAdminOnboardingBannerDto) && epx.f(this.link, ((GroupsGroupDonutLevelsAdminOnboardingBannerDto) obj).link);
    }

    public final int hashCode() {
        return this.link.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("GroupsGroupDonutLevelsAdminOnboardingBannerDto(link="), this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.link);
    }
}

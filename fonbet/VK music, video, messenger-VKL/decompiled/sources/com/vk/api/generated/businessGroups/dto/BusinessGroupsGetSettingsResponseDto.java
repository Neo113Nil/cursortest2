package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsBusinessProfileLinkDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BusinessGroupsGetSettingsResponseDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsGetSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<BusinessGroupsGetSettingsResponseDto> CREATOR = new a();

    @pmi0("business_profile")
    private final GroupsBusinessProfileLinkDto businessProfile;

    /* compiled from: BusinessGroupsGetSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsGetSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsGetSettingsResponseDto createFromParcel(Parcel parcel) {
            return new BusinessGroupsGetSettingsResponseDto(parcel.readInt() == 0 ? null : GroupsBusinessProfileLinkDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsGetSettingsResponseDto[] newArray(int i) {
            return new BusinessGroupsGetSettingsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BusinessGroupsGetSettingsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BusinessGroupsGetSettingsResponseDto) && epx.f(this.businessProfile, ((BusinessGroupsGetSettingsResponseDto) obj).businessProfile);
    }

    public final int hashCode() {
        GroupsBusinessProfileLinkDto groupsBusinessProfileLinkDto = this.businessProfile;
        if (groupsBusinessProfileLinkDto == null) {
            return 0;
        }
        return groupsBusinessProfileLinkDto.hashCode();
    }

    public final String toString() {
        return "BusinessGroupsGetSettingsResponseDto(businessProfile=" + this.businessProfile + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsBusinessProfileLinkDto groupsBusinessProfileLinkDto = this.businessProfile;
        if (groupsBusinessProfileLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsBusinessProfileLinkDto.writeToParcel(parcel, i);
        }
    }

    public BusinessGroupsGetSettingsResponseDto(GroupsBusinessProfileLinkDto groupsBusinessProfileLinkDto) {
        this.businessProfile = groupsBusinessProfileLinkDto;
    }

    public /* synthetic */ BusinessGroupsGetSettingsResponseDto(GroupsBusinessProfileLinkDto groupsBusinessProfileLinkDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsBusinessProfileLinkDto);
    }
}

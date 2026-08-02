package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseAPlusMarkDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsVideoChannelDataDto.kt */
/* loaded from: classes14.dex */
public final class GroupsVideoChannelDataDto implements Parcelable {
    public static final Parcelable.Creator<GroupsVideoChannelDataDto> CREATOR = new a();

    @pmi0("a_plus_mark")
    private final BaseAPlusMarkDto aPlusMark;

    @pmi0("onboarding")
    private final GroupsVideoChannelOnboardingDto onboarding;

    /* compiled from: GroupsVideoChannelDataDto.kt */
    public static final class a implements Parcelable.Creator<GroupsVideoChannelDataDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsVideoChannelDataDto createFromParcel(Parcel parcel) {
            return new GroupsVideoChannelDataDto(GroupsVideoChannelOnboardingDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BaseAPlusMarkDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsVideoChannelDataDto[] newArray(int i) {
            return new GroupsVideoChannelDataDto[i];
        }
    }

    public GroupsVideoChannelDataDto(GroupsVideoChannelOnboardingDto groupsVideoChannelOnboardingDto, BaseAPlusMarkDto baseAPlusMarkDto) {
        this.onboarding = groupsVideoChannelOnboardingDto;
        this.aPlusMark = baseAPlusMarkDto;
    }

    public final BaseAPlusMarkDto d() {
        return this.aPlusMark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsVideoChannelOnboardingDto e() {
        return this.onboarding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsVideoChannelDataDto)) {
            return false;
        }
        GroupsVideoChannelDataDto groupsVideoChannelDataDto = (GroupsVideoChannelDataDto) obj;
        return epx.f(this.onboarding, groupsVideoChannelDataDto.onboarding) && epx.f(this.aPlusMark, groupsVideoChannelDataDto.aPlusMark);
    }

    public final int hashCode() {
        int hashCode = this.onboarding.hashCode() * 31;
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        return hashCode + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode());
    }

    public final String toString() {
        return "GroupsVideoChannelDataDto(onboarding=" + this.onboarding + ", aPlusMark=" + this.aPlusMark + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.onboarding.writeToParcel(parcel, i);
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        if (baseAPlusMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseAPlusMarkDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsVideoChannelDataDto(GroupsVideoChannelOnboardingDto groupsVideoChannelOnboardingDto, BaseAPlusMarkDto baseAPlusMarkDto, int i, zcl zclVar) {
        this(groupsVideoChannelOnboardingDto, (i & 2) != 0 ? null : baseAPlusMarkDto);
    }
}

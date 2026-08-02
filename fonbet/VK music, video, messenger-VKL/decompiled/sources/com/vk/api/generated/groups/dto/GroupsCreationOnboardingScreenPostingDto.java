package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsCreationOnboardingScreenPostingDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreationOnboardingScreenPostingDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreationOnboardingScreenPostingDto> CREATOR = new a();

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("tooltip")
    private final GroupsCreationOnboardingScreenTooltipDto tooltip;

    @pmi0("value")
    private final GroupsCreationOnboardingScreenValueObjectDto value;

    /* compiled from: GroupsCreationOnboardingScreenPostingDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreationOnboardingScreenPostingDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenPostingDto createFromParcel(Parcel parcel) {
            return new GroupsCreationOnboardingScreenPostingDto(parcel.readString(), parcel.readString(), GroupsCreationOnboardingScreenValueObjectDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsCreationOnboardingScreenTooltipDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreationOnboardingScreenPostingDto[] newArray(int i) {
            return new GroupsCreationOnboardingScreenPostingDto[i];
        }
    }

    public GroupsCreationOnboardingScreenPostingDto(String str, String str2, GroupsCreationOnboardingScreenValueObjectDto groupsCreationOnboardingScreenValueObjectDto, GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto) {
        this.title = str;
        this.subtitle = str2;
        this.value = groupsCreationOnboardingScreenValueObjectDto;
        this.tooltip = groupsCreationOnboardingScreenTooltipDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreationOnboardingScreenPostingDto)) {
            return false;
        }
        GroupsCreationOnboardingScreenPostingDto groupsCreationOnboardingScreenPostingDto = (GroupsCreationOnboardingScreenPostingDto) obj;
        return epx.f(this.title, groupsCreationOnboardingScreenPostingDto.title) && epx.f(this.subtitle, groupsCreationOnboardingScreenPostingDto.subtitle) && epx.f(this.value, groupsCreationOnboardingScreenPostingDto.value) && epx.f(this.tooltip, groupsCreationOnboardingScreenPostingDto.tooltip);
    }

    public final int hashCode() {
        int hashCode = (this.value.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.subtitle)) * 31;
        GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto = this.tooltip;
        return hashCode + (groupsCreationOnboardingScreenTooltipDto == null ? 0 : groupsCreationOnboardingScreenTooltipDto.hashCode());
    }

    public final String toString() {
        return "GroupsCreationOnboardingScreenPostingDto(title=" + this.title + ", subtitle=" + this.subtitle + ", value=" + this.value + ", tooltip=" + this.tooltip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        this.value.writeToParcel(parcel, i);
        GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto = this.tooltip;
        if (groupsCreationOnboardingScreenTooltipDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsCreationOnboardingScreenTooltipDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsCreationOnboardingScreenPostingDto(String str, String str2, GroupsCreationOnboardingScreenValueObjectDto groupsCreationOnboardingScreenValueObjectDto, GroupsCreationOnboardingScreenTooltipDto groupsCreationOnboardingScreenTooltipDto, int i, zcl zclVar) {
        this(str, str2, groupsCreationOnboardingScreenValueObjectDto, (i & 8) != 0 ? null : groupsCreationOnboardingScreenTooltipDto);
    }
}

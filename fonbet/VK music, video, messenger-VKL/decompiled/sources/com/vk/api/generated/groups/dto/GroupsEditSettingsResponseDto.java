package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsEditSettingsResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsEditSettingsResponseDto> CREATOR = new a();

    @pmi0("action_button")
    private final GroupsEditSettingsActionButtonDto actionButton;

    /* compiled from: GroupsEditSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsResponseDto createFromParcel(Parcel parcel) {
            return new GroupsEditSettingsResponseDto(parcel.readInt() == 0 ? null : GroupsEditSettingsActionButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsResponseDto[] newArray(int i) {
            return new GroupsEditSettingsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsEditSettingsResponseDto() {
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
        return (obj instanceof GroupsEditSettingsResponseDto) && epx.f(this.actionButton, ((GroupsEditSettingsResponseDto) obj).actionButton);
    }

    public final int hashCode() {
        GroupsEditSettingsActionButtonDto groupsEditSettingsActionButtonDto = this.actionButton;
        if (groupsEditSettingsActionButtonDto == null) {
            return 0;
        }
        return groupsEditSettingsActionButtonDto.hashCode();
    }

    public final String toString() {
        return "GroupsEditSettingsResponseDto(actionButton=" + this.actionButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsEditSettingsActionButtonDto groupsEditSettingsActionButtonDto = this.actionButton;
        if (groupsEditSettingsActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsEditSettingsActionButtonDto.writeToParcel(parcel, i);
        }
    }

    public GroupsEditSettingsResponseDto(GroupsEditSettingsActionButtonDto groupsEditSettingsActionButtonDto) {
        this.actionButton = groupsEditSettingsActionButtonDto;
    }

    public /* synthetic */ GroupsEditSettingsResponseDto(GroupsEditSettingsActionButtonDto groupsEditSettingsActionButtonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsEditSettingsActionButtonDto);
    }
}

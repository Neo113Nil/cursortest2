package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsPrimaryBlockSettingsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsPrimaryBlockSettingsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsPrimaryBlockSettingsDto> CREATOR = new a();

    @pmi0("tab")
    private final GroupsTabSettingsDto tab;

    @pmi0("view_settings")
    private final GroupsViewSettingsDto viewSettings;

    /* compiled from: GroupsPrimaryBlockSettingsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsPrimaryBlockSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsPrimaryBlockSettingsDto createFromParcel(Parcel parcel) {
            return new GroupsPrimaryBlockSettingsDto(GroupsTabSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupsViewSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsPrimaryBlockSettingsDto[] newArray(int i) {
            return new GroupsPrimaryBlockSettingsDto[i];
        }
    }

    public GroupsPrimaryBlockSettingsDto(GroupsTabSettingsDto groupsTabSettingsDto, GroupsViewSettingsDto groupsViewSettingsDto) {
        this.tab = groupsTabSettingsDto;
        this.viewSettings = groupsViewSettingsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsPrimaryBlockSettingsDto)) {
            return false;
        }
        GroupsPrimaryBlockSettingsDto groupsPrimaryBlockSettingsDto = (GroupsPrimaryBlockSettingsDto) obj;
        return epx.f(this.tab, groupsPrimaryBlockSettingsDto.tab) && epx.f(this.viewSettings, groupsPrimaryBlockSettingsDto.viewSettings);
    }

    public final int hashCode() {
        int hashCode = this.tab.hashCode() * 31;
        GroupsViewSettingsDto groupsViewSettingsDto = this.viewSettings;
        return hashCode + (groupsViewSettingsDto == null ? 0 : groupsViewSettingsDto.hashCode());
    }

    public final String toString() {
        return "GroupsPrimaryBlockSettingsDto(tab=" + this.tab + ", viewSettings=" + this.viewSettings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.tab.writeToParcel(parcel, i);
        GroupsViewSettingsDto groupsViewSettingsDto = this.viewSettings;
        if (groupsViewSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsViewSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsPrimaryBlockSettingsDto(GroupsTabSettingsDto groupsTabSettingsDto, GroupsViewSettingsDto groupsViewSettingsDto, int i, zcl zclVar) {
        this(groupsTabSettingsDto, (i & 2) != 0 ? null : groupsViewSettingsDto);
    }
}

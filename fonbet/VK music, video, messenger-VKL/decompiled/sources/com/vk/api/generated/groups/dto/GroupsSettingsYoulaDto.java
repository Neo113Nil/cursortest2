package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.youla.dto.YoulaCategoryDto;
import com.vk.api.generated.youla.dto.YoulaGroupSettingsDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: GroupsSettingsYoulaDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSettingsYoulaDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSettingsYoulaDto> CREATOR = new a();

    @pmi0("category_tree")
    private final YoulaCategoryDto categoryTree;

    @pmi0("group_settings")
    private final YoulaGroupSettingsDto groupSettings;

    /* compiled from: GroupsSettingsYoulaDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSettingsYoulaDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsYoulaDto createFromParcel(Parcel parcel) {
            return new GroupsSettingsYoulaDto(YoulaCategoryDto.CREATOR.createFromParcel(parcel), YoulaGroupSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsYoulaDto[] newArray(int i) {
            return new GroupsSettingsYoulaDto[i];
        }
    }

    public GroupsSettingsYoulaDto(YoulaCategoryDto youlaCategoryDto, YoulaGroupSettingsDto youlaGroupSettingsDto) {
        this.categoryTree = youlaCategoryDto;
        this.groupSettings = youlaGroupSettingsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSettingsYoulaDto)) {
            return false;
        }
        GroupsSettingsYoulaDto groupsSettingsYoulaDto = (GroupsSettingsYoulaDto) obj;
        return epx.f(this.categoryTree, groupsSettingsYoulaDto.categoryTree) && epx.f(this.groupSettings, groupsSettingsYoulaDto.groupSettings);
    }

    public final int hashCode() {
        return this.groupSettings.hashCode() + (this.categoryTree.hashCode() * 31);
    }

    public final String toString() {
        return "GroupsSettingsYoulaDto(categoryTree=" + this.categoryTree + ", groupSettings=" + this.groupSettings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.categoryTree.writeToParcel(parcel, i);
        this.groupSettings.writeToParcel(parcel, i);
    }
}

package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsRecommendedTipsListImagesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsRecommendedTipsListImagesDto implements Parcelable {
    public static final Parcelable.Creator<GroupsRecommendedTipsListImagesDto> CREATOR = new a();

    @pmi0("dark")
    private final GroupsRecommendedTipsListImageObjectsDto dark;

    @pmi0("light")
    private final GroupsRecommendedTipsListImageObjectsDto light;

    /* compiled from: GroupsRecommendedTipsListImagesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsRecommendedTipsListImagesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsListImagesDto createFromParcel(Parcel parcel) {
            return new GroupsRecommendedTipsListImagesDto(parcel.readInt() == 0 ? null : GroupsRecommendedTipsListImageObjectsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GroupsRecommendedTipsListImageObjectsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsRecommendedTipsListImagesDto[] newArray(int i) {
            return new GroupsRecommendedTipsListImagesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsRecommendedTipsListImagesDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final GroupsRecommendedTipsListImageObjectsDto d() {
        return this.dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsRecommendedTipsListImageObjectsDto e() {
        return this.light;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsRecommendedTipsListImagesDto)) {
            return false;
        }
        GroupsRecommendedTipsListImagesDto groupsRecommendedTipsListImagesDto = (GroupsRecommendedTipsListImagesDto) obj;
        return epx.f(this.light, groupsRecommendedTipsListImagesDto.light) && epx.f(this.dark, groupsRecommendedTipsListImagesDto.dark);
    }

    public final int hashCode() {
        GroupsRecommendedTipsListImageObjectsDto groupsRecommendedTipsListImageObjectsDto = this.light;
        int hashCode = (groupsRecommendedTipsListImageObjectsDto == null ? 0 : groupsRecommendedTipsListImageObjectsDto.hashCode()) * 31;
        GroupsRecommendedTipsListImageObjectsDto groupsRecommendedTipsListImageObjectsDto2 = this.dark;
        return hashCode + (groupsRecommendedTipsListImageObjectsDto2 != null ? groupsRecommendedTipsListImageObjectsDto2.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsRecommendedTipsListImagesDto(light=" + this.light + ", dark=" + this.dark + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GroupsRecommendedTipsListImageObjectsDto groupsRecommendedTipsListImageObjectsDto = this.light;
        if (groupsRecommendedTipsListImageObjectsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsRecommendedTipsListImageObjectsDto.writeToParcel(parcel, i);
        }
        GroupsRecommendedTipsListImageObjectsDto groupsRecommendedTipsListImageObjectsDto2 = this.dark;
        if (groupsRecommendedTipsListImageObjectsDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsRecommendedTipsListImageObjectsDto2.writeToParcel(parcel, i);
        }
    }

    public GroupsRecommendedTipsListImagesDto(GroupsRecommendedTipsListImageObjectsDto groupsRecommendedTipsListImageObjectsDto, GroupsRecommendedTipsListImageObjectsDto groupsRecommendedTipsListImageObjectsDto2) {
        this.light = groupsRecommendedTipsListImageObjectsDto;
        this.dark = groupsRecommendedTipsListImageObjectsDto2;
    }

    public /* synthetic */ GroupsRecommendedTipsListImagesDto(GroupsRecommendedTipsListImageObjectsDto groupsRecommendedTipsListImageObjectsDto, GroupsRecommendedTipsListImageObjectsDto groupsRecommendedTipsListImageObjectsDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsRecommendedTipsListImageObjectsDto, (i & 2) != 0 ? null : groupsRecommendedTipsListImageObjectsDto2);
    }
}

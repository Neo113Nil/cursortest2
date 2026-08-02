package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: GroupsPhotoSizeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsPhotoSizeDto implements Parcelable {
    public static final Parcelable.Creator<GroupsPhotoSizeDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("width")
    private final int width;

    /* compiled from: GroupsPhotoSizeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsPhotoSizeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsPhotoSizeDto createFromParcel(Parcel parcel) {
            return new GroupsPhotoSizeDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsPhotoSizeDto[] newArray(int i) {
            return new GroupsPhotoSizeDto[i];
        }
    }

    public GroupsPhotoSizeDto(int i, int i2) {
        this.height = i;
        this.width = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsPhotoSizeDto)) {
            return false;
        }
        GroupsPhotoSizeDto groupsPhotoSizeDto = (GroupsPhotoSizeDto) obj;
        return this.height == groupsPhotoSizeDto.height && this.width == groupsPhotoSizeDto.width;
    }

    public final int hashCode() {
        return Integer.hashCode(this.width) + (Integer.hashCode(this.height) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsPhotoSizeDto(height=");
        sb.append(this.height);
        sb.append(", width=");
        return vu5.b(sb, this.width, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}

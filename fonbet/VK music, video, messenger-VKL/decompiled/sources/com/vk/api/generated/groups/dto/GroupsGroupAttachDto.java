package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: GroupsGroupAttachDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupAttachDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupAttachDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("is_favorite")
    private final boolean isFavorite;

    @pmi0("size")
    private final int size;

    @pmi0("status")
    private final String status;

    @pmi0("text")
    private final String text;

    /* compiled from: GroupsGroupAttachDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupAttachDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupAttachDto createFromParcel(Parcel parcel) {
            return new GroupsGroupAttachDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupAttachDto[] newArray(int i) {
            return new GroupsGroupAttachDto[i];
        }
    }

    public GroupsGroupAttachDto(int i, String str, String str2, int i2, boolean z) {
        this.id = i;
        this.text = str;
        this.status = str2;
        this.size = i2;
        this.isFavorite = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupAttachDto)) {
            return false;
        }
        GroupsGroupAttachDto groupsGroupAttachDto = (GroupsGroupAttachDto) obj;
        return this.id == groupsGroupAttachDto.id && epx.f(this.text, groupsGroupAttachDto.text) && epx.f(this.status, groupsGroupAttachDto.status) && this.size == groupsGroupAttachDto.size && this.isFavorite == groupsGroupAttachDto.isFavorite;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isFavorite) + shy.a(this.size, urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.text), 31, this.status), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupAttachDto(id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", isFavorite=");
        return q0.a(sb, this.isFavorite, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.text);
        parcel.writeString(this.status);
        parcel.writeInt(this.size);
        parcel.writeInt(this.isFavorite ? 1 : 0);
    }
}

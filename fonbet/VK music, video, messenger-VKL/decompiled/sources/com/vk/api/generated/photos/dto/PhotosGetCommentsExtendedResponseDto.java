package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: PhotosGetCommentsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetCommentsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetCommentsExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("real_offset")
    private final Integer realOffset;

    /* compiled from: PhotosGetCommentsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetCommentsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetCommentsExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(PhotosGetCommentsExtendedResponseDto.class, parcel, arrayList, i, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = bo.b(PhotosGetCommentsExtendedResponseDto.class, parcel, arrayList2, i2, 1);
            }
            int readInt4 = parcel.readInt();
            int i3 = 0;
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (i3 != readInt4) {
                i3 = bo.b(PhotosGetCommentsExtendedResponseDto.class, parcel, arrayList3, i3, 1);
            }
            return new PhotosGetCommentsExtendedResponseDto(readInt, arrayList, arrayList2, arrayList3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetCommentsExtendedResponseDto[] newArray(int i) {
            return new PhotosGetCommentsExtendedResponseDto[i];
        }
    }

    public PhotosGetCommentsExtendedResponseDto(int i, List<WallWallCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.realOffset = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetCommentsExtendedResponseDto)) {
            return false;
        }
        PhotosGetCommentsExtendedResponseDto photosGetCommentsExtendedResponseDto = (PhotosGetCommentsExtendedResponseDto) obj;
        return this.count == photosGetCommentsExtendedResponseDto.count && epx.f(this.items, photosGetCommentsExtendedResponseDto.items) && epx.f(this.profiles, photosGetCommentsExtendedResponseDto.profiles) && epx.f(this.groups, photosGetCommentsExtendedResponseDto.groups) && epx.f(this.realOffset, photosGetCommentsExtendedResponseDto.realOffset);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles), 31, this.groups);
        Integer num = this.realOffset;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosGetCommentsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", realOffset=");
        return uqi.b(sb, this.realOffset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.groups);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        Integer num = this.realOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ PhotosGetCommentsExtendedResponseDto(int i, List list, List list2, List list3, Integer num, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : num);
    }
}

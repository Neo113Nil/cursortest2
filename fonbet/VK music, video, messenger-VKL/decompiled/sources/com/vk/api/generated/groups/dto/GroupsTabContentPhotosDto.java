package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsTabContentPhotosDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentPhotosDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentPhotosDto> CREATOR = new a();

    @pmi0("albums")
    private final List<PhotosPhotoAlbumFullDto> albums;

    @pmi0("albums_next_from")
    private final String albumsNextFrom;

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("content_types")
    private final List<GroupsTabContentTypesDto> contentTypes;

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsTabContentPhotosDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentPhotosDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentPhotosDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(GroupsTabContentPhotosDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(PhotosPhotoAlbumFullDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(GroupsTabContentTypesDto.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new GroupsTabContentPhotosDto(z, arrayList, arrayList2, readString, arrayList3, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentPhotosDto[] newArray(int i) {
            return new GroupsTabContentPhotosDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsTabContentPhotosDto(boolean z, List<PhotosPhotoDto> list, List<PhotosPhotoAlbumFullDto> list2, String str, List<? extends GroupsTabContentTypesDto> list3, Integer num, String str2) {
        this.canAdd = z;
        this.items = list;
        this.albums = list2;
        this.albumsNextFrom = str;
        this.contentTypes = list3;
        this.count = num;
        this.nextFrom = str2;
    }

    public final List<PhotosPhotoAlbumFullDto> d() {
        return this.albums;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.albumsNextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabContentPhotosDto)) {
            return false;
        }
        GroupsTabContentPhotosDto groupsTabContentPhotosDto = (GroupsTabContentPhotosDto) obj;
        return this.canAdd == groupsTabContentPhotosDto.canAdd && epx.f(this.items, groupsTabContentPhotosDto.items) && epx.f(this.albums, groupsTabContentPhotosDto.albums) && epx.f(this.albumsNextFrom, groupsTabContentPhotosDto.albumsNextFrom) && epx.f(this.contentTypes, groupsTabContentPhotosDto.contentTypes) && epx.f(this.count, groupsTabContentPhotosDto.count) && epx.f(this.nextFrom, groupsTabContentPhotosDto.nextFrom);
    }

    public final Integer f() {
        return this.count;
    }

    public final List<PhotosPhotoDto> g() {
        return this.items;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.canAdd) * 31;
        List<PhotosPhotoDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PhotosPhotoAlbumFullDto> list2 = this.albums;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.albumsNextFrom;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<GroupsTabContentTypesDto> list3 = this.contentTypes;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.count;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.nextFrom;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentPhotosDto(canAdd=");
        sb.append(this.canAdd);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", albums=");
        sb.append(this.albums);
        sb.append(", albumsNextFrom=");
        sb.append(this.albumsNextFrom);
        sb.append(", contentTypes=");
        sb.append(this.contentTypes);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canAdd ? 1 : 0);
        List<PhotosPhotoDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<PhotosPhotoAlbumFullDto> list2 = this.albums;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((PhotosPhotoAlbumFullDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.albumsNextFrom);
        List<GroupsTabContentTypesDto> list3 = this.contentTypes;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((GroupsTabContentTypesDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentPhotosDto(boolean z, List list, List list2, String str, List list3, Integer num, String str2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str2);
    }
}

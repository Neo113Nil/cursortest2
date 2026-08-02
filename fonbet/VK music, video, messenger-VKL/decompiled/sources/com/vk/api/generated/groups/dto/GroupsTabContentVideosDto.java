package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
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

/* compiled from: GroupsTabContentVideosDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentVideosDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentVideosDto> CREATOR = new a();

    @pmi0("albums")
    private final List<VideoVideoAlbumFullDto> albums;

    @pmi0("albums_next_from")
    private final String albumsNextFrom;

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("content_types")
    private final List<GroupsTabContentTypesDto> contentTypes;

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("items_album_id")
    private final Integer itemsAlbumId;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsTabContentVideosDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentVideosDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentVideosDto createFromParcel(Parcel parcel) {
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
                    i2 = bo.b(GroupsTabContentVideosDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(GroupsTabContentVideosDto.class, parcel, arrayList2, i3, 1);
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
            return new GroupsTabContentVideosDto(z, arrayList, arrayList2, readString, arrayList3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentVideosDto[] newArray(int i) {
            return new GroupsTabContentVideosDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsTabContentVideosDto(boolean z, List<VideoVideoFullDto> list, List<VideoVideoAlbumFullDto> list2, String str, List<? extends GroupsTabContentTypesDto> list3, Integer num, Integer num2, String str2) {
        this.canAdd = z;
        this.items = list;
        this.albums = list2;
        this.albumsNextFrom = str;
        this.contentTypes = list3;
        this.itemsAlbumId = num;
        this.count = num2;
        this.nextFrom = str2;
    }

    public final List<VideoVideoAlbumFullDto> d() {
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
        if (!(obj instanceof GroupsTabContentVideosDto)) {
            return false;
        }
        GroupsTabContentVideosDto groupsTabContentVideosDto = (GroupsTabContentVideosDto) obj;
        return this.canAdd == groupsTabContentVideosDto.canAdd && epx.f(this.items, groupsTabContentVideosDto.items) && epx.f(this.albums, groupsTabContentVideosDto.albums) && epx.f(this.albumsNextFrom, groupsTabContentVideosDto.albumsNextFrom) && epx.f(this.contentTypes, groupsTabContentVideosDto.contentTypes) && epx.f(this.itemsAlbumId, groupsTabContentVideosDto.itemsAlbumId) && epx.f(this.count, groupsTabContentVideosDto.count) && epx.f(this.nextFrom, groupsTabContentVideosDto.nextFrom);
    }

    public final List<VideoVideoFullDto> f() {
        return this.items;
    }

    public final String g() {
        return this.nextFrom;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.canAdd) * 31;
        List<VideoVideoFullDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoVideoAlbumFullDto> list2 = this.albums;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.albumsNextFrom;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<GroupsTabContentTypesDto> list3 = this.contentTypes;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.itemsAlbumId;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.count;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentVideosDto(canAdd=");
        sb.append(this.canAdd);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", albums=");
        sb.append(this.albums);
        sb.append(", albumsNextFrom=");
        sb.append(this.albumsNextFrom);
        sb.append(", contentTypes=");
        sb.append(this.contentTypes);
        sb.append(", itemsAlbumId=");
        sb.append(this.itemsAlbumId);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canAdd ? 1 : 0);
        List<VideoVideoFullDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<VideoVideoAlbumFullDto> list2 = this.albums;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
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
        Integer num = this.itemsAlbumId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.count;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentVideosDto(boolean z, List list, List list2, String str, List list3, Integer num, Integer num2, String str2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str2);
    }
}

package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: GroupsTabContentShortVideosDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentShortVideosDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentShortVideosDto> CREATOR = new a();

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("playlists")
    private final List<ShortVideoPlaylistFullDto> playlists;

    @pmi0("playlists_next_from")
    private final String playlistsNextFrom;

    /* compiled from: GroupsTabContentShortVideosDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentShortVideosDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentShortVideosDto createFromParcel(Parcel parcel) {
            Integer num;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(GroupsTabContentShortVideosDto.class, parcel, arrayList2, i2, 1);
            }
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                num = null;
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(ShortVideoPlaylistFullDto.CREATOR, parcel, arrayList3, i, 1);
                }
                num = null;
                arrayList = arrayList3;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new GroupsTabContentShortVideosDto(arrayList2, z, arrayList, readString, num, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentShortVideosDto[] newArray(int i) {
            return new GroupsTabContentShortVideosDto[i];
        }
    }

    public GroupsTabContentShortVideosDto(List<VideoVideoFullDto> list, boolean z, List<ShortVideoPlaylistFullDto> list2, String str, Integer num, String str2) {
        this.items = list;
        this.canAdd = z;
        this.playlists = list2;
        this.playlistsNextFrom = str;
        this.count = num;
        this.nextFrom = str2;
    }

    public final List<VideoVideoFullDto> d() {
        return this.items;
    }

    public final List<ShortVideoPlaylistFullDto> d0() {
        return this.playlists;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabContentShortVideosDto)) {
            return false;
        }
        GroupsTabContentShortVideosDto groupsTabContentShortVideosDto = (GroupsTabContentShortVideosDto) obj;
        return epx.f(this.items, groupsTabContentShortVideosDto.items) && this.canAdd == groupsTabContentShortVideosDto.canAdd && epx.f(this.playlists, groupsTabContentShortVideosDto.playlists) && epx.f(this.playlistsNextFrom, groupsTabContentShortVideosDto.playlistsNextFrom) && epx.f(this.count, groupsTabContentShortVideosDto.count) && epx.f(this.nextFrom, groupsTabContentShortVideosDto.nextFrom);
    }

    public final String f() {
        return this.playlistsNextFrom;
    }

    public final int hashCode() {
        int b = qoy.b(this.items.hashCode() * 31, 31, this.canAdd);
        List<ShortVideoPlaylistFullDto> list = this.playlists;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.playlistsNextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.count;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentShortVideosDto(items=");
        sb.append(this.items);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", playlists=");
        sb.append(this.playlists);
        sb.append(", playlistsNextFrom=");
        sb.append(this.playlistsNextFrom);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.canAdd ? 1 : 0);
        List<ShortVideoPlaylistFullDto> list = this.playlists;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ShortVideoPlaylistFullDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.playlistsNextFrom);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentShortVideosDto(List list, boolean z, List list2, String str, Integer num, String str2, int i, zcl zclVar) {
        this(list, z, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str2);
    }
}

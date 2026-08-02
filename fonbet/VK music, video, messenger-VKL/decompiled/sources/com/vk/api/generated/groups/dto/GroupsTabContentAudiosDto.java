package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
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

/* compiled from: GroupsTabContentAudiosDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentAudiosDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentAudiosDto> CREATOR = new a();

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("content_types")
    private final List<GroupsTabContentTypesDto> contentTypes;

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<AudioAudioDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("playlists")
    private final List<AudioPlaylistDto> playlists;

    @pmi0("playlists_next_from")
    private final String playlistsNextFrom;

    /* compiled from: GroupsTabContentAudiosDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentAudiosDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentAudiosDto createFromParcel(Parcel parcel) {
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
                    i2 = bo.b(GroupsTabContentAudiosDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(GroupsTabContentAudiosDto.class, parcel, arrayList2, i3, 1);
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
            return new GroupsTabContentAudiosDto(z, arrayList, arrayList2, readString, arrayList3, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentAudiosDto[] newArray(int i) {
            return new GroupsTabContentAudiosDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsTabContentAudiosDto(boolean z, List<AudioAudioDto> list, List<AudioPlaylistDto> list2, String str, List<? extends GroupsTabContentTypesDto> list3, Integer num, String str2) {
        this.canAdd = z;
        this.items = list;
        this.playlists = list2;
        this.playlistsNextFrom = str;
        this.contentTypes = list3;
        this.count = num;
        this.nextFrom = str2;
    }

    public final List<AudioAudioDto> d() {
        return this.items;
    }

    public final List<AudioPlaylistDto> d0() {
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
        if (!(obj instanceof GroupsTabContentAudiosDto)) {
            return false;
        }
        GroupsTabContentAudiosDto groupsTabContentAudiosDto = (GroupsTabContentAudiosDto) obj;
        return this.canAdd == groupsTabContentAudiosDto.canAdd && epx.f(this.items, groupsTabContentAudiosDto.items) && epx.f(this.playlists, groupsTabContentAudiosDto.playlists) && epx.f(this.playlistsNextFrom, groupsTabContentAudiosDto.playlistsNextFrom) && epx.f(this.contentTypes, groupsTabContentAudiosDto.contentTypes) && epx.f(this.count, groupsTabContentAudiosDto.count) && epx.f(this.nextFrom, groupsTabContentAudiosDto.nextFrom);
    }

    public final String f() {
        return this.playlistsNextFrom;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.canAdd) * 31;
        List<AudioAudioDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AudioPlaylistDto> list2 = this.playlists;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.playlistsNextFrom;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<GroupsTabContentTypesDto> list3 = this.contentTypes;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.count;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentAudiosDto(canAdd=");
        sb.append(this.canAdd);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", playlists=");
        sb.append(this.playlists);
        sb.append(", playlistsNextFrom=");
        sb.append(this.playlistsNextFrom);
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
        List<AudioAudioDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<AudioPlaylistDto> list2 = this.playlists;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.playlistsNextFrom);
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

    public /* synthetic */ GroupsTabContentAudiosDto(boolean z, List list, List list2, String str, List list3, Integer num, String str2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str2);
    }
}

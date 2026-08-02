package com.vk.api.generated.places.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallWallpostDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PlacesGetPostsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class PlacesGetPostsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<PlacesGetPostsExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<WallWallpostDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: PlacesGetPostsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<PlacesGetPostsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesGetPostsExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(WallWallpostDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            String readString = parcel.readString();
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(PlacesGetPostsExtendedResponseDto.class, parcel, arrayList5, i3, 1);
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(PlacesGetPostsExtendedResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList4, i, 1);
                }
            }
            return new PlacesGetPostsExtendedResponseDto(readInt, arrayList3, readString, arrayList, arrayList2, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesGetPostsExtendedResponseDto[] newArray(int i) {
            return new PlacesGetPostsExtendedResponseDto[i];
        }
    }

    public PlacesGetPostsExtendedResponseDto(int i, List<WallWallpostDto> list, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<LikesReactionSetDto> list4) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
        this.profiles = list2;
        this.groups = list3;
        this.reactionSets = list4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesGetPostsExtendedResponseDto)) {
            return false;
        }
        PlacesGetPostsExtendedResponseDto placesGetPostsExtendedResponseDto = (PlacesGetPostsExtendedResponseDto) obj;
        return this.count == placesGetPostsExtendedResponseDto.count && epx.f(this.items, placesGetPostsExtendedResponseDto.items) && epx.f(this.nextFrom, placesGetPostsExtendedResponseDto.nextFrom) && epx.f(this.profiles, placesGetPostsExtendedResponseDto.profiles) && epx.f(this.groups, placesGetPostsExtendedResponseDto.groups) && epx.f(this.reactionSets, placesGetPostsExtendedResponseDto.reactionSets);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<LikesReactionSetDto> list3 = this.reactionSets;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesGetPostsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", reactionSets=");
        return ms9.a(')', sb, this.reactionSets);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((WallWallpostDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<LikesReactionSetDto> list3 = this.reactionSets;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((LikesReactionSetDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PlacesGetPostsExtendedResponseDto(int i, List list, String str, List list2, List list3, List list4, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : list4);
    }
}

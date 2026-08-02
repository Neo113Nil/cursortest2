package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
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

/* compiled from: FaveGetExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class FaveGetExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<FaveGetExtendedResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    @pmi0("items")
    private final List<FaveBookmarkDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: FaveGetExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<FaveGetExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveGetExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(FaveBookmarkDto.CREATOR, parcel, arrayList4, i2, 1);
            }
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(FaveGetExtendedResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(FaveGetExtendedResponseDto.class, parcel, arrayList6, i4, 1);
                }
                arrayList2 = arrayList6;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList3, i5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList7, i, 1);
                }
                arrayList5 = arrayList7;
            }
            return new FaveGetExtendedResponseDto(readInt, arrayList4, arrayList, arrayList2, readString, arrayList3, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final FaveGetExtendedResponseDto[] newArray(int i) {
            return new FaveGetExtendedResponseDto[i];
        }
    }

    public FaveGetExtendedResponseDto(int i, List<FaveBookmarkDto> list, List<UsersUserFullDto> list2, List<GroupsGroupDto> list3, String str, List<LikesReactionSetDto> list4, List<BadgesBadgeDto> list5) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.nextFrom = str;
        this.reactionSets = list4;
        this.badges = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveGetExtendedResponseDto)) {
            return false;
        }
        FaveGetExtendedResponseDto faveGetExtendedResponseDto = (FaveGetExtendedResponseDto) obj;
        return this.count == faveGetExtendedResponseDto.count && epx.f(this.items, faveGetExtendedResponseDto.items) && epx.f(this.profiles, faveGetExtendedResponseDto.profiles) && epx.f(this.groups, faveGetExtendedResponseDto.groups) && epx.f(this.nextFrom, faveGetExtendedResponseDto.nextFrom) && epx.f(this.reactionSets, faveGetExtendedResponseDto.reactionSets) && epx.f(this.badges, faveGetExtendedResponseDto.badges);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.nextFrom;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<LikesReactionSetDto> list3 = this.reactionSets;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BadgesBadgeDto> list4 = this.badges;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveGetExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", reactionSets=");
        sb.append(this.reactionSets);
        sb.append(", badges=");
        return ms9.a(')', sb, this.badges);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((FaveBookmarkDto) a2.next()).writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.nextFrom);
        List<LikesReactionSetDto> list3 = this.reactionSets;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((LikesReactionSetDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<BadgesBadgeDto> list4 = this.badges;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            ((BadgesBadgeDto) f4.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FaveGetExtendedResponseDto(int i, List list, List list2, List list3, String str, List list4, List list5, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : list4, (i2 & 64) != 0 ? null : list5);
    }
}

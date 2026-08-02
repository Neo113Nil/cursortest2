package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
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

/* compiled from: WallSearchExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallSearchExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallSearchExtendedResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<WallWallItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: WallSearchExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallSearchExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallSearchExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(WallSearchExtendedResponseDto.class, parcel, arrayList2, i, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = bo.b(WallSearchExtendedResponseDto.class, parcel, arrayList3, i2, 1);
            }
            int readInt4 = parcel.readInt();
            int i3 = 0;
            ArrayList arrayList4 = new ArrayList(readInt4);
            int i4 = 0;
            while (i4 != readInt4) {
                i4 = bo.b(WallSearchExtendedResponseDto.class, parcel, arrayList4, i4, 1);
            }
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList, i5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList5 = new ArrayList(readInt6);
                while (i3 != readInt6) {
                    i3 = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList5, i3, 1);
                }
            }
            return new WallSearchExtendedResponseDto(readInt, arrayList2, arrayList3, arrayList4, arrayList, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final WallSearchExtendedResponseDto[] newArray(int i) {
            return new WallSearchExtendedResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallSearchExtendedResponseDto(int i, List<? extends WallWallItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<LikesReactionSetDto> list4, List<BadgesBadgeDto> list5) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
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
        if (!(obj instanceof WallSearchExtendedResponseDto)) {
            return false;
        }
        WallSearchExtendedResponseDto wallSearchExtendedResponseDto = (WallSearchExtendedResponseDto) obj;
        return this.count == wallSearchExtendedResponseDto.count && epx.f(this.items, wallSearchExtendedResponseDto.items) && epx.f(this.profiles, wallSearchExtendedResponseDto.profiles) && epx.f(this.groups, wallSearchExtendedResponseDto.groups) && epx.f(this.reactionSets, wallSearchExtendedResponseDto.reactionSets) && epx.f(this.badges, wallSearchExtendedResponseDto.badges);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles), 31, this.groups);
        List<LikesReactionSetDto> list = this.reactionSets;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BadgesBadgeDto> list2 = this.badges;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallSearchExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
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
        List<LikesReactionSetDto> list = this.reactionSets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((LikesReactionSetDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<BadgesBadgeDto> list2 = this.badges;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((BadgesBadgeDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallSearchExtendedResponseDto(int i, List list, List list2, List list3, List list4, List list5, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : list4, (i2 & 32) != 0 ? null : list5);
    }
}

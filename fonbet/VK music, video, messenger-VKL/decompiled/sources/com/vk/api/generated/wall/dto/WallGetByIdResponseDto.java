package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallGetByIdResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetByIdResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("items")
    private final List<WallWallItemDto> items;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: WallGetByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetByIdResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(WallGetByIdResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new WallGetByIdResponseDto(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetByIdResponseDto[] newArray(int i) {
            return new WallGetByIdResponseDto[i];
        }
    }

    public WallGetByIdResponseDto() {
        this(null, null, null, 7, null);
    }

    public final List<BadgesBadgeDto> d() {
        return this.badges;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<WallWallItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetByIdResponseDto)) {
            return false;
        }
        WallGetByIdResponseDto wallGetByIdResponseDto = (WallGetByIdResponseDto) obj;
        return epx.f(this.items, wallGetByIdResponseDto.items) && epx.f(this.reactionSets, wallGetByIdResponseDto.reactionSets) && epx.f(this.badges, wallGetByIdResponseDto.badges);
    }

    public final List<LikesReactionSetDto> f() {
        return this.reactionSets;
    }

    public final int hashCode() {
        List<WallWallItemDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<LikesReactionSetDto> list2 = this.reactionSets;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BadgesBadgeDto> list3 = this.badges;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallGetByIdResponseDto(items=");
        sb.append(this.items);
        sb.append(", reactionSets=");
        sb.append(this.reactionSets);
        sb.append(", badges=");
        return ms9.a(')', sb, this.badges);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<WallWallItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<LikesReactionSetDto> list2 = this.reactionSets;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((LikesReactionSetDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<BadgesBadgeDto> list3 = this.badges;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((BadgesBadgeDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallGetByIdResponseDto(List<? extends WallWallItemDto> list, List<LikesReactionSetDto> list2, List<BadgesBadgeDto> list3) {
        this.items = list;
        this.reactionSets = list2;
        this.badges = list3;
    }

    public /* synthetic */ WallGetByIdResponseDto(List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}

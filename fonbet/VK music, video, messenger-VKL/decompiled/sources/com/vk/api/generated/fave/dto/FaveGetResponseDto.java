package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FaveGetResponseDto.kt */
/* loaded from: classes14.dex */
public final class FaveGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<FaveGetResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<FaveBookmarkDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: FaveGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<FaveGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveGetResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(FaveBookmarkDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new FaveGetResponseDto(readInt, arrayList2, arrayList, arrayList3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaveGetResponseDto[] newArray(int i) {
            return new FaveGetResponseDto[i];
        }
    }

    public FaveGetResponseDto(int i, List<FaveBookmarkDto> list, List<LikesReactionSetDto> list2, List<BadgesBadgeDto> list3, String str) {
        this.count = i;
        this.items = list;
        this.reactionSets = list2;
        this.badges = list3;
        this.nextFrom = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveGetResponseDto)) {
            return false;
        }
        FaveGetResponseDto faveGetResponseDto = (FaveGetResponseDto) obj;
        return this.count == faveGetResponseDto.count && epx.f(this.items, faveGetResponseDto.items) && epx.f(this.reactionSets, faveGetResponseDto.reactionSets) && epx.f(this.badges, faveGetResponseDto.badges) && epx.f(this.nextFrom, faveGetResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<LikesReactionSetDto> list = this.reactionSets;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BadgesBadgeDto> list2 = this.badges;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", reactionSets=");
        sb.append(this.reactionSets);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((FaveBookmarkDto) a2.next()).writeToParcel(parcel, i);
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
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((BadgesBadgeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ FaveGetResponseDto(int i, List list, List list2, List list3, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : str);
    }
}

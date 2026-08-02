package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.wall.dto.WallWallpostFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: NewsfeedSearchResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedSearchResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedSearchResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<WallWallpostFullDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    @pmi0("suggested_queries")
    private final List<String> suggestedQueries;

    @pmi0("total_count")
    private final Integer totalCount;

    /* compiled from: NewsfeedSearchResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedSearchResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedSearchResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(WallWallpostFullDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            int readInt2 = parcel.readInt();
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
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new NewsfeedSearchResponseDto(arrayList3, readInt2, arrayList, arrayList2, parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedSearchResponseDto[] newArray(int i) {
            return new NewsfeedSearchResponseDto[i];
        }
    }

    public NewsfeedSearchResponseDto(List<WallWallpostFullDto> list, int i, List<LikesReactionSetDto> list2, List<BadgesBadgeDto> list3, List<String> list4, String str, Integer num) {
        this.items = list;
        this.count = i;
        this.reactionSets = list2;
        this.badges = list3;
        this.suggestedQueries = list4;
        this.nextFrom = str;
        this.totalCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedSearchResponseDto)) {
            return false;
        }
        NewsfeedSearchResponseDto newsfeedSearchResponseDto = (NewsfeedSearchResponseDto) obj;
        return epx.f(this.items, newsfeedSearchResponseDto.items) && this.count == newsfeedSearchResponseDto.count && epx.f(this.reactionSets, newsfeedSearchResponseDto.reactionSets) && epx.f(this.badges, newsfeedSearchResponseDto.badges) && epx.f(this.suggestedQueries, newsfeedSearchResponseDto.suggestedQueries) && epx.f(this.nextFrom, newsfeedSearchResponseDto.nextFrom) && epx.f(this.totalCount, newsfeedSearchResponseDto.totalCount);
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, this.items.hashCode() * 31, 31);
        List<LikesReactionSetDto> list = this.reactionSets;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BadgesBadgeDto> list2 = this.badges;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.suggestedQueries;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.nextFrom;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.totalCount;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedSearchResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", reactionSets=");
        sb.append(this.reactionSets);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", suggestedQueries=");
        sb.append(this.suggestedQueries);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", totalCount=");
        return uqi.b(sb, this.totalCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((WallWallpostFullDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
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
        parcel.writeStringList(this.suggestedQueries);
        parcel.writeString(this.nextFrom);
        Integer num = this.totalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ NewsfeedSearchResponseDto(List list, int i, List list2, List list3, List list4, String str, Integer num, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : num);
    }
}

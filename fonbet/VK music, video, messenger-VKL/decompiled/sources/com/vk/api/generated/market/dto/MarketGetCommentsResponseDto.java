package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketGetCommentsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCommentsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCommentsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("real_offset")
    private final Integer realOffset;

    /* compiled from: MarketGetCommentsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCommentsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCommentsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(MarketGetCommentsResponseDto.class, parcel, arrayList3, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MarketGetCommentsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MarketGetCommentsResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new MarketGetCommentsResponseDto(readInt, arrayList3, arrayList, arrayList2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCommentsResponseDto[] newArray(int i) {
            return new MarketGetCommentsResponseDto[i];
        }
    }

    public MarketGetCommentsResponseDto(int i, List<WallWallCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.realOffset = num;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<WallWallCommentDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCommentsResponseDto)) {
            return false;
        }
        MarketGetCommentsResponseDto marketGetCommentsResponseDto = (MarketGetCommentsResponseDto) obj;
        return this.count == marketGetCommentsResponseDto.count && epx.f(this.items, marketGetCommentsResponseDto.items) && epx.f(this.profiles, marketGetCommentsResponseDto.profiles) && epx.f(this.groups, marketGetCommentsResponseDto.groups) && epx.f(this.realOffset, marketGetCommentsResponseDto.realOffset);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.realOffset;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetCommentsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", realOffset=");
        return uqi.b(sb, this.realOffset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
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
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Integer num = this.realOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MarketGetCommentsResponseDto(int i, List list, List list2, List list3, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : num);
    }
}

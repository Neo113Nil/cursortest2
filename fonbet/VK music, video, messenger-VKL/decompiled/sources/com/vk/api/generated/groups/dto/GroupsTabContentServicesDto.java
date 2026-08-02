package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketServicesViewTypeDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: GroupsTabContentServicesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentServicesDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentServicesDto> CREATOR = new a();

    @pmi0("albums")
    private final List<MarketMarketAlbumDto> albums;

    @pmi0("albums_count")
    private final Integer albumsCount;

    @pmi0("albums_next_from")
    private final String albumsNextFrom;

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("count")
    private final Integer count;

    @pmi0("is_skip_items_count")
    private final boolean isSkipItemsCount;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("view_type")
    private final MarketServicesViewTypeDto viewType;

    /* compiled from: GroupsTabContentServicesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentServicesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentServicesDto createFromParcel(Parcel parcel) {
            boolean z;
            Class cls;
            boolean z2;
            int i;
            ArrayList arrayList;
            Integer valueOf;
            Integer num;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                z = true;
                if (i3 == readInt) {
                    break;
                }
                i3 = bo.b(GroupsTabContentServicesDto.class, parcel, arrayList2, i3, 1);
            }
            MarketServicesViewTypeDto createFromParcel = MarketServicesViewTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                cls = GroupsTabContentServicesDto.class;
                z2 = true;
            } else {
                cls = GroupsTabContentServicesDto.class;
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i2 != readInt2) {
                    i2 = bo.b(cls, parcel, arrayList3, i2, i);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                num = null;
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new GroupsTabContentServicesDto(arrayList2, createFromParcel, z2, z, arrayList, valueOf, readString, num, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentServicesDto[] newArray(int i) {
            return new GroupsTabContentServicesDto[i];
        }
    }

    public GroupsTabContentServicesDto(List<MarketMarketItemDto> list, MarketServicesViewTypeDto marketServicesViewTypeDto, boolean z, boolean z2, List<MarketMarketAlbumDto> list2, Integer num, String str, Integer num2, String str2) {
        this.items = list;
        this.viewType = marketServicesViewTypeDto;
        this.isSkipItemsCount = z;
        this.canAdd = z2;
        this.albums = list2;
        this.albumsCount = num;
        this.albumsNextFrom = str;
        this.count = num2;
        this.nextFrom = str2;
    }

    public final List<MarketMarketAlbumDto> d() {
        return this.albums;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketMarketItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabContentServicesDto)) {
            return false;
        }
        GroupsTabContentServicesDto groupsTabContentServicesDto = (GroupsTabContentServicesDto) obj;
        return epx.f(this.items, groupsTabContentServicesDto.items) && this.viewType == groupsTabContentServicesDto.viewType && this.isSkipItemsCount == groupsTabContentServicesDto.isSkipItemsCount && this.canAdd == groupsTabContentServicesDto.canAdd && epx.f(this.albums, groupsTabContentServicesDto.albums) && epx.f(this.albumsCount, groupsTabContentServicesDto.albumsCount) && epx.f(this.albumsNextFrom, groupsTabContentServicesDto.albumsNextFrom) && epx.f(this.count, groupsTabContentServicesDto.count) && epx.f(this.nextFrom, groupsTabContentServicesDto.nextFrom);
    }

    public final String f() {
        return this.nextFrom;
    }

    public final MarketServicesViewTypeDto g() {
        return this.viewType;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((this.viewType.hashCode() + (this.items.hashCode() * 31)) * 31, 31, this.isSkipItemsCount), 31, this.canAdd);
        List<MarketMarketAlbumDto> list = this.albums;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.albumsCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.albumsNextFrom;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.count;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean i9() {
        return this.canAdd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentServicesDto(items=");
        sb.append(this.items);
        sb.append(", viewType=");
        sb.append(this.viewType);
        sb.append(", isSkipItemsCount=");
        sb.append(this.isSkipItemsCount);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", albums=");
        sb.append(this.albums);
        sb.append(", albumsCount=");
        sb.append(this.albumsCount);
        sb.append(", albumsNextFrom=");
        sb.append(this.albumsNextFrom);
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
        this.viewType.writeToParcel(parcel, i);
        parcel.writeInt(this.isSkipItemsCount ? 1 : 0);
        parcel.writeInt(this.canAdd ? 1 : 0);
        List<MarketMarketAlbumDto> list = this.albums;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.albumsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.albumsNextFrom);
        Integer num2 = this.count;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentServicesDto(List list, MarketServicesViewTypeDto marketServicesViewTypeDto, boolean z, boolean z2, List list2, Integer num, String str, Integer num2, String str2, int i, zcl zclVar) {
        this(list, marketServicesViewTypeDto, z, z2, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str2);
    }
}

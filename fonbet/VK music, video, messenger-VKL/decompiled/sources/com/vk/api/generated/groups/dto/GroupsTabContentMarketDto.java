package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsInfoBlockDto;
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

/* compiled from: GroupsTabContentMarketDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentMarketDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentMarketDto> CREATOR = new a();

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

    @pmi0("info_block")
    private final MarketIntegrationsInfoBlockDto infoBlock;

    @pmi0("is_skip_items_count")
    private final boolean isSkipItemsCount;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsTabContentMarketDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentMarketDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentMarketDto createFromParcel(Parcel parcel) {
            Class cls;
            boolean z;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(GroupsTabContentMarketDto.class, parcel, arrayList2, i2, 1);
            }
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                cls = GroupsTabContentMarketDto.class;
                z = true;
            } else {
                cls = GroupsTabContentMarketDto.class;
                z = false;
            }
            MarketIntegrationsInfoBlockDto createFromParcel = parcel.readInt() == 0 ? null : MarketIntegrationsInfoBlockDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(cls, parcel, arrayList, i, 1);
                }
            }
            return new GroupsTabContentMarketDto(arrayList2, z2, z, createFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentMarketDto[] newArray(int i) {
            return new GroupsTabContentMarketDto[i];
        }
    }

    public GroupsTabContentMarketDto(List<MarketMarketItemDto> list, boolean z, boolean z2, MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto, List<MarketMarketAlbumDto> list2, Integer num, String str, Integer num2, String str2) {
        this.items = list;
        this.isSkipItemsCount = z;
        this.canAdd = z2;
        this.infoBlock = marketIntegrationsInfoBlockDto;
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

    public final Integer e() {
        return this.albumsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabContentMarketDto)) {
            return false;
        }
        GroupsTabContentMarketDto groupsTabContentMarketDto = (GroupsTabContentMarketDto) obj;
        return epx.f(this.items, groupsTabContentMarketDto.items) && this.isSkipItemsCount == groupsTabContentMarketDto.isSkipItemsCount && this.canAdd == groupsTabContentMarketDto.canAdd && epx.f(this.infoBlock, groupsTabContentMarketDto.infoBlock) && epx.f(this.albums, groupsTabContentMarketDto.albums) && epx.f(this.albumsCount, groupsTabContentMarketDto.albumsCount) && epx.f(this.albumsNextFrom, groupsTabContentMarketDto.albumsNextFrom) && epx.f(this.count, groupsTabContentMarketDto.count) && epx.f(this.nextFrom, groupsTabContentMarketDto.nextFrom);
    }

    public final MarketIntegrationsInfoBlockDto f() {
        return this.infoBlock;
    }

    public final List<MarketMarketItemDto> g() {
        return this.items;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(this.items.hashCode() * 31, 31, this.isSkipItemsCount), 31, this.canAdd);
        MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto = this.infoBlock;
        int hashCode = (b + (marketIntegrationsInfoBlockDto == null ? 0 : marketIntegrationsInfoBlockDto.hashCode())) * 31;
        List<MarketMarketAlbumDto> list = this.albums;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.albumsCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.albumsNextFrom;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.count;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.nextFrom;
    }

    public final boolean i9() {
        return this.canAdd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentMarketDto(items=");
        sb.append(this.items);
        sb.append(", isSkipItemsCount=");
        sb.append(this.isSkipItemsCount);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", infoBlock=");
        sb.append(this.infoBlock);
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
        parcel.writeInt(this.isSkipItemsCount ? 1 : 0);
        parcel.writeInt(this.canAdd ? 1 : 0);
        MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto = this.infoBlock;
        if (marketIntegrationsInfoBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketIntegrationsInfoBlockDto.writeToParcel(parcel, i);
        }
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

    public /* synthetic */ GroupsTabContentMarketDto(List list, boolean z, boolean z2, MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto, List list2, Integer num, String str, Integer num2, String str2, int i, zcl zclVar) {
        this(list, z, z2, (i & 8) != 0 ? null : marketIntegrationsInfoBlockDto, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str2);
    }
}

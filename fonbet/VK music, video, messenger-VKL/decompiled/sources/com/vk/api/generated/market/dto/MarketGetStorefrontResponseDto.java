package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsUserXtrRoleDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsInfoBlockDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetStorefrontResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetStorefrontResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetStorefrontResponseDto> CREATOR = new a();

    @pmi0("admin")
    private final UsersUserFullDto admin;

    @pmi0("albums")
    private final List<MarketMarketAlbumDto> albums;

    @pmi0("albums_count")
    private final Integer albumsCount;

    @pmi0("bookmarks_count")
    private final Integer bookmarksCount;

    @pmi0("cart_total_price")
    private final MarketPriceDto cartTotalPrice;

    @pmi0("edit_url")
    private final String editUrl;

    @pmi0("filters")
    private final MarketCatalogFilterDto filters;

    @pmi0("friends")
    private final List<GroupsUserXtrRoleDto> friends;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("info_block")
    private final MarketIntegrationsInfoBlockDto infoBlock;

    @pmi0("integration_settings")
    private final MarketIntegrationSettingsDto integrationSettings;

    @pmi0("is_skip_items_count")
    private final boolean isSkipItemsCount;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("items_count")
    private final Integer itemsCount;

    @pmi0("items_in_cart_count")
    private final Integer itemsInCartCount;

    @pmi0("market_settings")
    private final MarketSettingsDto marketSettings;

    @pmi0("sorting")
    private final MarketCatalogSortingDto sorting;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("viewed_products")
    private final MarketStorefrontViewedProductsDto viewedProducts;

    /* compiled from: MarketGetStorefrontResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetStorefrontResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetStorefrontResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Integer num;
            ArrayList arrayList3;
            boolean z = parcel.readInt() != 0;
            GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) parcel.readParcelable(MarketGetStorefrontResponseDto.class.getClassLoader());
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketGetStorefrontResponseDto.class, parcel, arrayList4, i, 1);
                }
                arrayList = arrayList4;
            }
            MarketCatalogFilterDto createFromParcel = parcel.readInt() == 0 ? null : MarketCatalogFilterDto.CREATOR.createFromParcel(parcel);
            MarketCatalogSortingDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketCatalogSortingDto.CREATOR.createFromParcel(parcel);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(MarketGetStorefrontResponseDto.class, parcel, arrayList5, i2, 1);
                }
                arrayList2 = arrayList5;
            }
            String readString = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MarketGetStorefrontResponseDto.class.getClassLoader());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                num = valueOf;
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt3);
                num = valueOf;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MarketGetStorefrontResponseDto.class, parcel, arrayList6, i3, 1);
                }
                arrayList3 = arrayList6;
            }
            return new MarketGetStorefrontResponseDto(z, groupsGroupFullDto, num, arrayList, createFromParcel, createFromParcel2, valueOf2, arrayList2, readString, valueOf3, marketPriceDto, valueOf4, arrayList3, parcel.readInt() == 0 ? null : MarketSettingsDto.CREATOR.createFromParcel(parcel), (UsersUserFullDto) parcel.readParcelable(MarketGetStorefrontResponseDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : MarketStorefrontViewedProductsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketIntegrationsInfoBlockDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketIntegrationSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetStorefrontResponseDto[] newArray(int i) {
            return new MarketGetStorefrontResponseDto[i];
        }
    }

    public MarketGetStorefrontResponseDto(boolean z, GroupsGroupFullDto groupsGroupFullDto, Integer num, List<MarketMarketItemDto> list, MarketCatalogFilterDto marketCatalogFilterDto, MarketCatalogSortingDto marketCatalogSortingDto, Integer num2, List<MarketMarketAlbumDto> list2, String str, Integer num3, MarketPriceDto marketPriceDto, Integer num4, List<GroupsUserXtrRoleDto> list3, MarketSettingsDto marketSettingsDto, UsersUserFullDto usersUserFullDto, String str2, Integer num5, MarketStorefrontViewedProductsDto marketStorefrontViewedProductsDto, MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto, MarketIntegrationSettingsDto marketIntegrationSettingsDto) {
        this.isSkipItemsCount = z;
        this.group = groupsGroupFullDto;
        this.itemsCount = num;
        this.items = list;
        this.filters = marketCatalogFilterDto;
        this.sorting = marketCatalogSortingDto;
        this.albumsCount = num2;
        this.albums = list2;
        this.editUrl = str;
        this.itemsInCartCount = num3;
        this.cartTotalPrice = marketPriceDto;
        this.friendsCount = num4;
        this.friends = list3;
        this.marketSettings = marketSettingsDto;
        this.admin = usersUserFullDto;
        this.trackCode = str2;
        this.bookmarksCount = num5;
        this.viewedProducts = marketStorefrontViewedProductsDto;
        this.infoBlock = marketIntegrationsInfoBlockDto;
        this.integrationSettings = marketIntegrationSettingsDto;
    }

    public final MarketCatalogSortingDto B() {
        return this.sorting;
    }

    public final MarketStorefrontViewedProductsDto C() {
        return this.viewedProducts;
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
        if (!(obj instanceof MarketGetStorefrontResponseDto)) {
            return false;
        }
        MarketGetStorefrontResponseDto marketGetStorefrontResponseDto = (MarketGetStorefrontResponseDto) obj;
        return this.isSkipItemsCount == marketGetStorefrontResponseDto.isSkipItemsCount && epx.f(this.group, marketGetStorefrontResponseDto.group) && epx.f(this.itemsCount, marketGetStorefrontResponseDto.itemsCount) && epx.f(this.items, marketGetStorefrontResponseDto.items) && epx.f(this.filters, marketGetStorefrontResponseDto.filters) && epx.f(this.sorting, marketGetStorefrontResponseDto.sorting) && epx.f(this.albumsCount, marketGetStorefrontResponseDto.albumsCount) && epx.f(this.albums, marketGetStorefrontResponseDto.albums) && epx.f(this.editUrl, marketGetStorefrontResponseDto.editUrl) && epx.f(this.itemsInCartCount, marketGetStorefrontResponseDto.itemsInCartCount) && epx.f(this.cartTotalPrice, marketGetStorefrontResponseDto.cartTotalPrice) && epx.f(this.friendsCount, marketGetStorefrontResponseDto.friendsCount) && epx.f(this.friends, marketGetStorefrontResponseDto.friends) && epx.f(this.marketSettings, marketGetStorefrontResponseDto.marketSettings) && epx.f(this.admin, marketGetStorefrontResponseDto.admin) && epx.f(this.trackCode, marketGetStorefrontResponseDto.trackCode) && epx.f(this.bookmarksCount, marketGetStorefrontResponseDto.bookmarksCount) && epx.f(this.viewedProducts, marketGetStorefrontResponseDto.viewedProducts) && epx.f(this.infoBlock, marketGetStorefrontResponseDto.infoBlock) && epx.f(this.integrationSettings, marketGetStorefrontResponseDto.integrationSettings);
    }

    public final String f() {
        return this.editUrl;
    }

    public final MarketCatalogFilterDto g() {
        return this.filters;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isSkipItemsCount) * 31;
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode2 = (hashCode + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        Integer num = this.itemsCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<MarketMarketItemDto> list = this.items;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        MarketCatalogFilterDto marketCatalogFilterDto = this.filters;
        int hashCode5 = (hashCode4 + (marketCatalogFilterDto == null ? 0 : marketCatalogFilterDto.hashCode())) * 31;
        MarketCatalogSortingDto marketCatalogSortingDto = this.sorting;
        int hashCode6 = (hashCode5 + (marketCatalogSortingDto == null ? 0 : marketCatalogSortingDto.hashCode())) * 31;
        Integer num2 = this.albumsCount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<MarketMarketAlbumDto> list2 = this.albums;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.editUrl;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.itemsInCartCount;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.cartTotalPrice;
        int hashCode11 = (hashCode10 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        Integer num4 = this.friendsCount;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<GroupsUserXtrRoleDto> list3 = this.friends;
        int hashCode13 = (hashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MarketSettingsDto marketSettingsDto = this.marketSettings;
        int hashCode14 = (hashCode13 + (marketSettingsDto == null ? 0 : marketSettingsDto.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.admin;
        int hashCode15 = (hashCode14 + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.bookmarksCount;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        MarketStorefrontViewedProductsDto marketStorefrontViewedProductsDto = this.viewedProducts;
        int hashCode18 = (hashCode17 + (marketStorefrontViewedProductsDto == null ? 0 : marketStorefrontViewedProductsDto.hashCode())) * 31;
        MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto = this.infoBlock;
        int hashCode19 = (hashCode18 + (marketIntegrationsInfoBlockDto == null ? 0 : marketIntegrationsInfoBlockDto.hashCode())) * 31;
        MarketIntegrationSettingsDto marketIntegrationSettingsDto = this.integrationSettings;
        return hashCode19 + (marketIntegrationSettingsDto != null ? marketIntegrationSettingsDto.hashCode() : 0);
    }

    public final List<GroupsUserXtrRoleDto> i() {
        return this.friends;
    }

    public final Integer j() {
        return this.friendsCount;
    }

    public final GroupsGroupFullDto k() {
        return this.group;
    }

    public final MarketIntegrationsInfoBlockDto l() {
        return this.infoBlock;
    }

    public final MarketIntegrationSettingsDto n() {
        return this.integrationSettings;
    }

    public final List<MarketMarketItemDto> o() {
        return this.items;
    }

    public final Integer p() {
        return this.itemsCount;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "MarketGetStorefrontResponseDto(isSkipItemsCount=" + this.isSkipItemsCount + ", group=" + this.group + ", itemsCount=" + this.itemsCount + ", items=" + this.items + ", filters=" + this.filters + ", sorting=" + this.sorting + ", albumsCount=" + this.albumsCount + ", albums=" + this.albums + ", editUrl=" + this.editUrl + ", itemsInCartCount=" + this.itemsInCartCount + ", cartTotalPrice=" + this.cartTotalPrice + ", friendsCount=" + this.friendsCount + ", friends=" + this.friends + ", marketSettings=" + this.marketSettings + ", admin=" + this.admin + ", trackCode=" + this.trackCode + ", bookmarksCount=" + this.bookmarksCount + ", viewedProducts=" + this.viewedProducts + ", infoBlock=" + this.infoBlock + ", integrationSettings=" + this.integrationSettings + ')';
    }

    public final Integer u() {
        return this.itemsInCartCount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isSkipItemsCount ? 1 : 0);
        parcel.writeParcelable(this.group, i);
        Integer num = this.itemsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<MarketMarketItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        MarketCatalogFilterDto marketCatalogFilterDto = this.filters;
        if (marketCatalogFilterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCatalogFilterDto.writeToParcel(parcel, i);
        }
        MarketCatalogSortingDto marketCatalogSortingDto = this.sorting;
        if (marketCatalogSortingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCatalogSortingDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.albumsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<MarketMarketAlbumDto> list2 = this.albums;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.editUrl);
        Integer num3 = this.itemsInCartCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.cartTotalPrice, i);
        Integer num4 = this.friendsCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        List<GroupsUserXtrRoleDto> list3 = this.friends;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        MarketSettingsDto marketSettingsDto = this.marketSettings;
        if (marketSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.admin, i);
        parcel.writeString(this.trackCode);
        Integer num5 = this.bookmarksCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        MarketStorefrontViewedProductsDto marketStorefrontViewedProductsDto = this.viewedProducts;
        if (marketStorefrontViewedProductsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketStorefrontViewedProductsDto.writeToParcel(parcel, i);
        }
        MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto = this.infoBlock;
        if (marketIntegrationsInfoBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketIntegrationsInfoBlockDto.writeToParcel(parcel, i);
        }
        MarketIntegrationSettingsDto marketIntegrationSettingsDto = this.integrationSettings;
        if (marketIntegrationSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketIntegrationSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketGetStorefrontResponseDto(boolean z, GroupsGroupFullDto groupsGroupFullDto, Integer num, List list, MarketCatalogFilterDto marketCatalogFilterDto, MarketCatalogSortingDto marketCatalogSortingDto, Integer num2, List list2, String str, Integer num3, MarketPriceDto marketPriceDto, Integer num4, List list3, MarketSettingsDto marketSettingsDto, UsersUserFullDto usersUserFullDto, String str2, Integer num5, MarketStorefrontViewedProductsDto marketStorefrontViewedProductsDto, MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto, MarketIntegrationSettingsDto marketIntegrationSettingsDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : groupsGroupFullDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : marketCatalogFilterDto, (i & 32) != 0 ? null : marketCatalogSortingDto, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : marketPriceDto, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : list3, (i & 8192) != 0 ? null : marketSettingsDto, (i & 16384) != 0 ? null : usersUserFullDto, (i & 32768) != 0 ? null : str2, (i & 65536) != 0 ? null : num5, (i & 131072) != 0 ? null : marketStorefrontViewedProductsDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : marketIntegrationsInfoBlockDto, (i & 524288) != 0 ? null : marketIntegrationSettingsDto);
    }
}

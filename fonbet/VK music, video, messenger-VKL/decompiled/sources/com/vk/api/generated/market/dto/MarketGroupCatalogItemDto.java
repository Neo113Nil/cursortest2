package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGroupCatalogItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketGroupCatalogItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketGroupCatalogItemDto> CREATOR = new a();

    @pmi0("body")
    private final CatalogCatalogLinkDto body;

    @pmi0("community_rating")
    private final MarketCommunityRatingDto communityRating;

    @pmi0("csrf_hashes")
    private final String csrfHashes;

    @pmi0("header")
    private final CatalogCatalogLinkDto header;

    @pmi0("id")
    private final String id;

    @pmi0("images")
    private final List<CatalogCatalogLinkDto> images;

    @pmi0("market_item_ids")
    private final List<String> marketItemIds;

    @pmi0("url")
    private final String url;

    @pmi0("users")
    private final List<CatalogCatalogLinkDto> users;

    /* compiled from: MarketGroupCatalogItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketGroupCatalogItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGroupCatalogItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            Parcelable.Creator<CatalogCatalogLinkDto> creator = CatalogCatalogLinkDto.CREATOR;
            CatalogCatalogLinkDto createFromParcel = creator.createFromParcel(parcel);
            String readString2 = parcel.readString();
            ArrayList arrayList2 = null;
            CatalogCatalogLinkDto createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(CatalogCatalogLinkDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(CatalogCatalogLinkDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new MarketGroupCatalogItemDto(readString, createFromParcel, readString2, createFromParcel2, arrayList, arrayList2, parcel.readString(), parcel.createStringArrayList(), (MarketCommunityRatingDto) parcel.readParcelable(MarketGroupCatalogItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGroupCatalogItemDto[] newArray(int i) {
            return new MarketGroupCatalogItemDto[i];
        }
    }

    public MarketGroupCatalogItemDto(String str, CatalogCatalogLinkDto catalogCatalogLinkDto, String str2, CatalogCatalogLinkDto catalogCatalogLinkDto2, List<CatalogCatalogLinkDto> list, List<CatalogCatalogLinkDto> list2, String str3, List<String> list3, MarketCommunityRatingDto marketCommunityRatingDto) {
        this.id = str;
        this.header = catalogCatalogLinkDto;
        this.url = str2;
        this.body = catalogCatalogLinkDto2;
        this.images = list;
        this.users = list2;
        this.csrfHashes = str3;
        this.marketItemIds = list3;
        this.communityRating = marketCommunityRatingDto;
    }

    public final CatalogCatalogLinkDto d() {
        return this.body;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CatalogCatalogLinkDto e() {
        return this.header;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGroupCatalogItemDto)) {
            return false;
        }
        MarketGroupCatalogItemDto marketGroupCatalogItemDto = (MarketGroupCatalogItemDto) obj;
        return epx.f(this.id, marketGroupCatalogItemDto.id) && epx.f(this.header, marketGroupCatalogItemDto.header) && epx.f(this.url, marketGroupCatalogItemDto.url) && epx.f(this.body, marketGroupCatalogItemDto.body) && epx.f(this.images, marketGroupCatalogItemDto.images) && epx.f(this.users, marketGroupCatalogItemDto.users) && epx.f(this.csrfHashes, marketGroupCatalogItemDto.csrfHashes) && epx.f(this.marketItemIds, marketGroupCatalogItemDto.marketItemIds) && epx.f(this.communityRating, marketGroupCatalogItemDto.communityRating);
    }

    public final List<CatalogCatalogLinkDto> f() {
        return this.images;
    }

    public final List<CatalogCatalogLinkDto> g() {
        return this.users;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = (this.header.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CatalogCatalogLinkDto catalogCatalogLinkDto = this.body;
        int hashCode3 = (hashCode2 + (catalogCatalogLinkDto == null ? 0 : catalogCatalogLinkDto.hashCode())) * 31;
        List<CatalogCatalogLinkDto> list = this.images;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<CatalogCatalogLinkDto> list2 = this.users;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.csrfHashes;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list3 = this.marketItemIds;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MarketCommunityRatingDto marketCommunityRatingDto = this.communityRating;
        return hashCode7 + (marketCommunityRatingDto != null ? marketCommunityRatingDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketGroupCatalogItemDto(id=" + this.id + ", header=" + this.header + ", url=" + this.url + ", body=" + this.body + ", images=" + this.images + ", users=" + this.users + ", csrfHashes=" + this.csrfHashes + ", marketItemIds=" + this.marketItemIds + ", communityRating=" + this.communityRating + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.header.writeToParcel(parcel, i);
        parcel.writeString(this.url);
        CatalogCatalogLinkDto catalogCatalogLinkDto = this.body;
        if (catalogCatalogLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogCatalogLinkDto.writeToParcel(parcel, i);
        }
        List<CatalogCatalogLinkDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CatalogCatalogLinkDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogCatalogLinkDto> list2 = this.users;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((CatalogCatalogLinkDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.csrfHashes);
        parcel.writeStringList(this.marketItemIds);
        parcel.writeParcelable(this.communityRating, i);
    }

    public /* synthetic */ MarketGroupCatalogItemDto(String str, CatalogCatalogLinkDto catalogCatalogLinkDto, String str2, CatalogCatalogLinkDto catalogCatalogLinkDto2, List list, List list2, String str3, List list3, MarketCommunityRatingDto marketCommunityRatingDto, int i, zcl zclVar) {
        this(str, catalogCatalogLinkDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : catalogCatalogLinkDto2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : marketCommunityRatingDto);
    }
}

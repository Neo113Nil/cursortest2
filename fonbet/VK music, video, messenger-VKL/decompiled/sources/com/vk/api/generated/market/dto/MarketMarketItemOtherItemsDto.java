package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketMarketItemOtherItemsDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketItemOtherItemsDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketItemOtherItemsDto> CREATOR = new a();

    @pmi0("item_ids")
    private final List<String> itemIds;

    @pmi0("link")
    private final String link;

    @pmi0("referrer_item_type")
    private final ReferrerItemTypeDto referrerItemType;

    @pmi0("title")
    private final String title;

    @pmi0("view_type")
    private final MarketServicesViewTypeDto viewType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketMarketItemOtherItemsDto.kt */
    public static final class ReferrerItemTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ReferrerItemTypeDto[] $VALUES;
        public static final Parcelable.Creator<ReferrerItemTypeDto> CREATOR;

        @pmi0("other_goods")
        public static final ReferrerItemTypeDto OTHER_GOODS;

        @pmi0("recommended_goods")
        public static final ReferrerItemTypeDto RECOMMENDED_GOODS;
        private final String value;

        /* compiled from: MarketMarketItemOtherItemsDto.kt */
        public static final class a implements Parcelable.Creator<ReferrerItemTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ReferrerItemTypeDto createFromParcel(Parcel parcel) {
                return ReferrerItemTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ReferrerItemTypeDto[] newArray(int i) {
                return new ReferrerItemTypeDto[i];
            }
        }

        static {
            ReferrerItemTypeDto referrerItemTypeDto = new ReferrerItemTypeDto("OTHER_GOODS", 0, "other_goods");
            OTHER_GOODS = referrerItemTypeDto;
            ReferrerItemTypeDto referrerItemTypeDto2 = new ReferrerItemTypeDto("RECOMMENDED_GOODS", 1, "recommended_goods");
            RECOMMENDED_GOODS = referrerItemTypeDto2;
            ReferrerItemTypeDto[] referrerItemTypeDtoArr = {referrerItemTypeDto, referrerItemTypeDto2};
            $VALUES = referrerItemTypeDtoArr;
            $ENTRIES = new asp(referrerItemTypeDtoArr);
            CREATOR = new a();
        }

        private ReferrerItemTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ReferrerItemTypeDto valueOf(String str) {
            return (ReferrerItemTypeDto) Enum.valueOf(ReferrerItemTypeDto.class, str);
        }

        public static ReferrerItemTypeDto[] values() {
            return (ReferrerItemTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MarketMarketItemOtherItemsDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketItemOtherItemsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemOtherItemsDto createFromParcel(Parcel parcel) {
            return new MarketMarketItemOtherItemsDto(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : MarketServicesViewTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ReferrerItemTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemOtherItemsDto[] newArray(int i) {
            return new MarketMarketItemOtherItemsDto[i];
        }
    }

    public MarketMarketItemOtherItemsDto(String str, List<String> list, MarketServicesViewTypeDto marketServicesViewTypeDto, String str2, ReferrerItemTypeDto referrerItemTypeDto) {
        this.title = str;
        this.itemIds = list;
        this.viewType = marketServicesViewTypeDto;
        this.link = str2;
        this.referrerItemType = referrerItemTypeDto;
    }

    public final List<String> d() {
        return this.itemIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItemOtherItemsDto)) {
            return false;
        }
        MarketMarketItemOtherItemsDto marketMarketItemOtherItemsDto = (MarketMarketItemOtherItemsDto) obj;
        return epx.f(this.title, marketMarketItemOtherItemsDto.title) && epx.f(this.itemIds, marketMarketItemOtherItemsDto.itemIds) && this.viewType == marketMarketItemOtherItemsDto.viewType && epx.f(this.link, marketMarketItemOtherItemsDto.link) && this.referrerItemType == marketMarketItemOtherItemsDto.referrerItemType;
    }

    public final ReferrerItemTypeDto f() {
        return this.referrerItemType;
    }

    public final MarketServicesViewTypeDto g() {
        return this.viewType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.title.hashCode() * 31, 31, this.itemIds);
        MarketServicesViewTypeDto marketServicesViewTypeDto = this.viewType;
        int hashCode = (a2 + (marketServicesViewTypeDto == null ? 0 : marketServicesViewTypeDto.hashCode())) * 31;
        String str = this.link;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ReferrerItemTypeDto referrerItemTypeDto = this.referrerItemType;
        return hashCode2 + (referrerItemTypeDto != null ? referrerItemTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketMarketItemOtherItemsDto(title=" + this.title + ", itemIds=" + this.itemIds + ", viewType=" + this.viewType + ", link=" + this.link + ", referrerItemType=" + this.referrerItemType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeStringList(this.itemIds);
        MarketServicesViewTypeDto marketServicesViewTypeDto = this.viewType;
        if (marketServicesViewTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketServicesViewTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.link);
        ReferrerItemTypeDto referrerItemTypeDto = this.referrerItemType;
        if (referrerItemTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            referrerItemTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketMarketItemOtherItemsDto(String str, List list, MarketServicesViewTypeDto marketServicesViewTypeDto, String str2, ReferrerItemTypeDto referrerItemTypeDto, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : marketServicesViewTypeDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : referrerItemTypeDto);
    }
}

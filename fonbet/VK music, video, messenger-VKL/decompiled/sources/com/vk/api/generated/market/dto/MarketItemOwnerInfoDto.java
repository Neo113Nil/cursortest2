package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketItemOwnerInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemOwnerInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemOwnerInfoDto> CREATOR = new a();

    @pmi0("avatar")
    private final List<BaseImageDto> avatar;

    @pmi0("category")
    private final String category;

    @pmi0("category_url")
    private final String categoryUrl;

    @pmi0("is_corporated_market")
    private final Boolean isCorporatedMarket;

    @pmi0("market_type")
    private final MarketOwnerTypeDto marketType;

    @pmi0("name")
    private final String name;

    @pmi0("verified")
    private final Boolean verified;

    /* compiled from: MarketItemOwnerInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemOwnerInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemOwnerInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketItemOwnerInfoDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarketOwnerTypeDto createFromParcel = parcel.readInt() == 0 ? null : MarketOwnerTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketItemOwnerInfoDto(arrayList, readString, readString2, readString3, valueOf, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemOwnerInfoDto[] newArray(int i) {
            return new MarketItemOwnerInfoDto[i];
        }
    }

    public MarketItemOwnerInfoDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final String d() {
        return this.category;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemOwnerInfoDto)) {
            return false;
        }
        MarketItemOwnerInfoDto marketItemOwnerInfoDto = (MarketItemOwnerInfoDto) obj;
        return epx.f(this.avatar, marketItemOwnerInfoDto.avatar) && epx.f(this.name, marketItemOwnerInfoDto.name) && epx.f(this.category, marketItemOwnerInfoDto.category) && epx.f(this.categoryUrl, marketItemOwnerInfoDto.categoryUrl) && epx.f(this.isCorporatedMarket, marketItemOwnerInfoDto.isCorporatedMarket) && this.marketType == marketItemOwnerInfoDto.marketType && epx.f(this.verified, marketItemOwnerInfoDto.verified);
    }

    public final Boolean f() {
        return this.verified;
    }

    public final int hashCode() {
        List<BaseImageDto> list = this.avatar;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isCorporatedMarket;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarketOwnerTypeDto marketOwnerTypeDto = this.marketType;
        int hashCode6 = (hashCode5 + (marketOwnerTypeDto == null ? 0 : marketOwnerTypeDto.hashCode())) * 31;
        Boolean bool2 = this.verified;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemOwnerInfoDto(avatar=");
        sb.append(this.avatar);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", categoryUrl=");
        sb.append(this.categoryUrl);
        sb.append(", isCorporatedMarket=");
        sb.append(this.isCorporatedMarket);
        sb.append(", marketType=");
        sb.append(this.marketType);
        sb.append(", verified=");
        return tn.a(sb, this.verified, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BaseImageDto> list = this.avatar;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.name);
        parcel.writeString(this.category);
        parcel.writeString(this.categoryUrl);
        Boolean bool = this.isCorporatedMarket;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        MarketOwnerTypeDto marketOwnerTypeDto = this.marketType;
        if (marketOwnerTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOwnerTypeDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.verified;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public MarketItemOwnerInfoDto(List<BaseImageDto> list, String str, String str2, String str3, Boolean bool, MarketOwnerTypeDto marketOwnerTypeDto, Boolean bool2) {
        this.avatar = list;
        this.name = str;
        this.category = str2;
        this.categoryUrl = str3;
        this.isCorporatedMarket = bool;
        this.marketType = marketOwnerTypeDto;
        this.verified = bool2;
    }

    public /* synthetic */ MarketItemOwnerInfoDto(List list, String str, String str2, String str3, Boolean bool, MarketOwnerTypeDto marketOwnerTypeDto, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : marketOwnerTypeDto, (i & 64) != 0 ? null : bool2);
    }
}

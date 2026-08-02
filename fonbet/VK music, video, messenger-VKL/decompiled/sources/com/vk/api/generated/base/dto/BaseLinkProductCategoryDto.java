package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseLinkProductCategoryDto.kt */
/* loaded from: classes.dex */
public abstract class BaseLinkProductCategoryDto implements Parcelable {

    /* compiled from: BaseLinkProductCategoryDto.kt */
    public static final class Deserializer implements a9y<BaseLinkProductCategoryDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            if (b9yVar instanceof x9y) {
                return (BaseLinkProductCategoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, MarketMarketCategoryNestedDto.class);
            }
            hay i = b9yVar.i();
            if (i.b instanceof String) {
                return new StringWrapper(i.k());
            }
            throw new IllegalStateException("no primitive mapping");
        }
    }

    /* compiled from: BaseLinkProductCategoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class MarketMarketCategoryNestedDto extends BaseLinkProductCategoryDto implements Parcelable {
        public static final Parcelable.Creator<MarketMarketCategoryNestedDto> CREATOR = new a();

        @pmi0("id")
        private final int id;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_v2")
        private final Boolean isV2;

        @pmi0("name")
        private final String name;

        @pmi0("parent")
        private final com.vk.api.generated.market.dto.MarketMarketCategoryNestedDto parent;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BaseLinkProductCategoryDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("market_market_category_nested")
            public static final InnerTypeDto MARKET_MARKET_CATEGORY_NESTED;
            private final String value;

            /* compiled from: BaseLinkProductCategoryDto.kt */
            public static final class a implements Parcelable.Creator<InnerTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto createFromParcel(Parcel parcel) {
                    return InnerTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto[] newArray(int i) {
                    return new InnerTypeDto[i];
                }
            }

            static {
                InnerTypeDto innerTypeDto = new InnerTypeDto("MARKET_MARKET_CATEGORY_NESTED", 0, "market_market_category_nested");
                MARKET_MARKET_CATEGORY_NESTED = innerTypeDto;
                InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
                $VALUES = innerTypeDtoArr;
                $ENTRIES = new asp(innerTypeDtoArr);
                CREATOR = new a();
            }

            private InnerTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static InnerTypeDto valueOf(String str) {
                return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
            }

            public static InnerTypeDto[] values() {
                return (InnerTypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: BaseLinkProductCategoryDto.kt */
        public static final class a implements Parcelable.Creator<MarketMarketCategoryNestedDto> {
            @Override // android.os.Parcelable.Creator
            public final MarketMarketCategoryNestedDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new MarketMarketCategoryNestedDto(createFromParcel, readInt, readString, valueOf, parcel.readInt() != 0 ? com.vk.api.generated.market.dto.MarketMarketCategoryNestedDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final MarketMarketCategoryNestedDto[] newArray(int i) {
                return new MarketMarketCategoryNestedDto[i];
            }
        }

        public /* synthetic */ MarketMarketCategoryNestedDto(InnerTypeDto innerTypeDto, int i, String str, Boolean bool, com.vk.api.generated.market.dto.MarketMarketCategoryNestedDto marketMarketCategoryNestedDto, int i2, zcl zclVar) {
            this(innerTypeDto, i, str, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : marketMarketCategoryNestedDto);
        }

        public final String d() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final com.vk.api.generated.market.dto.MarketMarketCategoryNestedDto e() {
            return this.parent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketMarketCategoryNestedDto)) {
                return false;
            }
            MarketMarketCategoryNestedDto marketMarketCategoryNestedDto = (MarketMarketCategoryNestedDto) obj;
            return this.innerType == marketMarketCategoryNestedDto.innerType && this.id == marketMarketCategoryNestedDto.id && epx.f(this.name, marketMarketCategoryNestedDto.name) && epx.f(this.isV2, marketMarketCategoryNestedDto.isV2) && epx.f(this.parent, marketMarketCategoryNestedDto.parent);
        }

        public final int getId() {
            return this.id;
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.id, this.innerType.hashCode() * 31, 31), 31, this.name);
            Boolean bool = this.isV2;
            int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
            com.vk.api.generated.market.dto.MarketMarketCategoryNestedDto marketMarketCategoryNestedDto = this.parent;
            return hashCode + (marketMarketCategoryNestedDto != null ? marketMarketCategoryNestedDto.hashCode() : 0);
        }

        public final String toString() {
            return "MarketMarketCategoryNestedDto(innerType=" + this.innerType + ", id=" + this.id + ", name=" + this.name + ", isV2=" + this.isV2 + ", parent=" + this.parent + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.innerType.writeToParcel(parcel, i);
            parcel.writeInt(this.id);
            parcel.writeString(this.name);
            Boolean bool = this.isV2;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            com.vk.api.generated.market.dto.MarketMarketCategoryNestedDto marketMarketCategoryNestedDto = this.parent;
            if (marketMarketCategoryNestedDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                marketMarketCategoryNestedDto.writeToParcel(parcel, i);
            }
        }

        public MarketMarketCategoryNestedDto(InnerTypeDto innerTypeDto, int i, String str, Boolean bool, com.vk.api.generated.market.dto.MarketMarketCategoryNestedDto marketMarketCategoryNestedDto) {
            super(null);
            this.innerType = innerTypeDto;
            this.id = i;
            this.name = str;
            this.isV2 = bool;
            this.parent = marketMarketCategoryNestedDto;
        }
    }

    /* compiled from: BaseLinkProductCategoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class StringWrapper extends BaseLinkProductCategoryDto implements Parcelable {
        public static final Parcelable.Creator<StringWrapper> CREATOR = new a();
        public final String b;

        /* compiled from: BaseLinkProductCategoryDto.kt */
        public static final class a implements Parcelable.Creator<StringWrapper> {
            @Override // android.os.Parcelable.Creator
            public final StringWrapper createFromParcel(Parcel parcel) {
                return new StringWrapper(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StringWrapper[] newArray(int i) {
                return new StringWrapper[i];
            }
        }

        public StringWrapper(String str) {
            super(null);
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    public /* synthetic */ BaseLinkProductCategoryDto(zcl zclVar) {
        this();
    }

    private BaseLinkProductCategoryDto() {
    }
}

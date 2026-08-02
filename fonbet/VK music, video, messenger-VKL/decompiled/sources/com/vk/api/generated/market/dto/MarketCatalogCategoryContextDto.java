package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketCatalogCategoryContextDto.kt */
/* loaded from: classes15.dex */
public final class MarketCatalogCategoryContextDto implements Parcelable {
    public static final Parcelable.Creator<MarketCatalogCategoryContextDto> CREATOR = new a();

    @pmi0("catalog_context")
    private final String catalogContext;

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("category_tree_id")
    private final Integer categoryTreeId;

    @pmi0("root_category_id")
    private final Integer rootCategoryId;

    /* compiled from: MarketCatalogCategoryContextDto.kt */
    public static final class a implements Parcelable.Creator<MarketCatalogCategoryContextDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCatalogCategoryContextDto createFromParcel(Parcel parcel) {
            return new MarketCatalogCategoryContextDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCatalogCategoryContextDto[] newArray(int i) {
            return new MarketCatalogCategoryContextDto[i];
        }
    }

    public MarketCatalogCategoryContextDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.catalogContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.categoryId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCatalogCategoryContextDto)) {
            return false;
        }
        MarketCatalogCategoryContextDto marketCatalogCategoryContextDto = (MarketCatalogCategoryContextDto) obj;
        return epx.f(this.catalogContext, marketCatalogCategoryContextDto.catalogContext) && epx.f(this.categoryTreeId, marketCatalogCategoryContextDto.categoryTreeId) && epx.f(this.rootCategoryId, marketCatalogCategoryContextDto.rootCategoryId) && epx.f(this.categoryId, marketCatalogCategoryContextDto.categoryId);
    }

    public final Integer f() {
        return this.categoryTreeId;
    }

    public final Integer g() {
        return this.rootCategoryId;
    }

    public final int hashCode() {
        String str = this.catalogContext;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.categoryTreeId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rootCategoryId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.categoryId;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCatalogCategoryContextDto(catalogContext=");
        sb.append(this.catalogContext);
        sb.append(", categoryTreeId=");
        sb.append(this.categoryTreeId);
        sb.append(", rootCategoryId=");
        sb.append(this.rootCategoryId);
        sb.append(", categoryId=");
        return uqi.b(sb, this.categoryId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.catalogContext);
        Integer num = this.categoryTreeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.rootCategoryId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.categoryId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public MarketCatalogCategoryContextDto(String str, Integer num, Integer num2, Integer num3) {
        this.catalogContext = str;
        this.categoryTreeId = num;
        this.rootCategoryId = num2;
        this.categoryId = num3;
    }

    public /* synthetic */ MarketCatalogCategoryContextDto(String str, Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}

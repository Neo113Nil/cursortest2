package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetRelatedCategoriesBlockResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetRelatedCategoriesBlockResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetRelatedCategoriesBlockResponseObjectDto> CREATOR = new a();

    @pmi0("related_categories_block")
    private final MarketRelatedCategoriesBlockDto relatedCategoriesBlock;

    /* compiled from: MarketGetRelatedCategoriesBlockResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetRelatedCategoriesBlockResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetRelatedCategoriesBlockResponseObjectDto createFromParcel(Parcel parcel) {
            return new MarketGetRelatedCategoriesBlockResponseObjectDto(parcel.readInt() == 0 ? null : MarketRelatedCategoriesBlockDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetRelatedCategoriesBlockResponseObjectDto[] newArray(int i) {
            return new MarketGetRelatedCategoriesBlockResponseObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetRelatedCategoriesBlockResponseObjectDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final MarketRelatedCategoriesBlockDto d() {
        return this.relatedCategoriesBlock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetRelatedCategoriesBlockResponseObjectDto) && epx.f(this.relatedCategoriesBlock, ((MarketGetRelatedCategoriesBlockResponseObjectDto) obj).relatedCategoriesBlock);
    }

    public final int hashCode() {
        MarketRelatedCategoriesBlockDto marketRelatedCategoriesBlockDto = this.relatedCategoriesBlock;
        if (marketRelatedCategoriesBlockDto == null) {
            return 0;
        }
        return marketRelatedCategoriesBlockDto.hashCode();
    }

    public final String toString() {
        return "MarketGetRelatedCategoriesBlockResponseObjectDto(relatedCategoriesBlock=" + this.relatedCategoriesBlock + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketRelatedCategoriesBlockDto marketRelatedCategoriesBlockDto = this.relatedCategoriesBlock;
        if (marketRelatedCategoriesBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketRelatedCategoriesBlockDto.writeToParcel(parcel, i);
        }
    }

    public MarketGetRelatedCategoriesBlockResponseObjectDto(MarketRelatedCategoriesBlockDto marketRelatedCategoriesBlockDto) {
        this.relatedCategoriesBlock = marketRelatedCategoriesBlockDto;
    }

    public /* synthetic */ MarketGetRelatedCategoriesBlockResponseObjectDto(MarketRelatedCategoriesBlockDto marketRelatedCategoriesBlockDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketRelatedCategoriesBlockDto);
    }
}

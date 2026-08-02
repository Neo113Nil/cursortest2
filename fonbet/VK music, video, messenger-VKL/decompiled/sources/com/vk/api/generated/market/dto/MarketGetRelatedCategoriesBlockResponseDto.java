package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetRelatedCategoriesBlockResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetRelatedCategoriesBlockResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetRelatedCategoriesBlockResponseDto> CREATOR = new a();

    @pmi0("related_categories_block")
    private final MarketRelatedCategoriesBlockDto relatedCategoriesBlock;

    /* compiled from: MarketGetRelatedCategoriesBlockResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetRelatedCategoriesBlockResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetRelatedCategoriesBlockResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetRelatedCategoriesBlockResponseDto(parcel.readInt() == 0 ? null : MarketRelatedCategoriesBlockDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetRelatedCategoriesBlockResponseDto[] newArray(int i) {
            return new MarketGetRelatedCategoriesBlockResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetRelatedCategoriesBlockResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetRelatedCategoriesBlockResponseDto) && epx.f(this.relatedCategoriesBlock, ((MarketGetRelatedCategoriesBlockResponseDto) obj).relatedCategoriesBlock);
    }

    public final int hashCode() {
        MarketRelatedCategoriesBlockDto marketRelatedCategoriesBlockDto = this.relatedCategoriesBlock;
        if (marketRelatedCategoriesBlockDto == null) {
            return 0;
        }
        return marketRelatedCategoriesBlockDto.hashCode();
    }

    public final String toString() {
        return "MarketGetRelatedCategoriesBlockResponseDto(relatedCategoriesBlock=" + this.relatedCategoriesBlock + ')';
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

    public MarketGetRelatedCategoriesBlockResponseDto(MarketRelatedCategoriesBlockDto marketRelatedCategoriesBlockDto) {
        this.relatedCategoriesBlock = marketRelatedCategoriesBlockDto;
    }

    public /* synthetic */ MarketGetRelatedCategoriesBlockResponseDto(MarketRelatedCategoriesBlockDto marketRelatedCategoriesBlockDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketRelatedCategoriesBlockDto);
    }
}

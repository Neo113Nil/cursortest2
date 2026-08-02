package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MarketSearchQueryClassifierSuggestionDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchQueryClassifierSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<MarketSearchQueryClassifierSuggestionDto> CREATOR = new a();

    @pmi0("category")
    private final MarketMarketCategoryDto category;

    @pmi0("is_used_in_query")
    private final boolean isUsedInQuery;

    @pmi0("probability")
    private final float probability;

    /* compiled from: MarketSearchQueryClassifierSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchQueryClassifierSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchQueryClassifierSuggestionDto createFromParcel(Parcel parcel) {
            return new MarketSearchQueryClassifierSuggestionDto((MarketMarketCategoryDto) parcel.readParcelable(MarketSearchQueryClassifierSuggestionDto.class.getClassLoader()), parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchQueryClassifierSuggestionDto[] newArray(int i) {
            return new MarketSearchQueryClassifierSuggestionDto[i];
        }
    }

    public MarketSearchQueryClassifierSuggestionDto(MarketMarketCategoryDto marketMarketCategoryDto, float f, boolean z) {
        this.category = marketMarketCategoryDto;
        this.probability = f;
        this.isUsedInQuery = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSearchQueryClassifierSuggestionDto)) {
            return false;
        }
        MarketSearchQueryClassifierSuggestionDto marketSearchQueryClassifierSuggestionDto = (MarketSearchQueryClassifierSuggestionDto) obj;
        return epx.f(this.category, marketSearchQueryClassifierSuggestionDto.category) && Float.compare(this.probability, marketSearchQueryClassifierSuggestionDto.probability) == 0 && this.isUsedInQuery == marketSearchQueryClassifierSuggestionDto.isUsedInQuery;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isUsedInQuery) + b.a(this.probability, this.category.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSearchQueryClassifierSuggestionDto(category=");
        sb.append(this.category);
        sb.append(", probability=");
        sb.append(this.probability);
        sb.append(", isUsedInQuery=");
        return q0.a(sb, this.isUsedInQuery, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.category, i);
        parcel.writeFloat(this.probability);
        parcel.writeInt(this.isUsedInQuery ? 1 : 0);
    }
}

package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketGetItemReviewCreateConfigResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemReviewCreateConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetItemReviewCreateConfigResponseDto> CREATOR = new a();

    @pmi0("faq_url")
    private final String faqUrl;

    @pmi0("type_hint_configs")
    private final MarketItemReviewCreateTypeHintConfigsDto typeHintConfigs;

    /* compiled from: MarketGetItemReviewCreateConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemReviewCreateConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemReviewCreateConfigResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetItemReviewCreateConfigResponseDto(MarketItemReviewCreateTypeHintConfigsDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemReviewCreateConfigResponseDto[] newArray(int i) {
            return new MarketGetItemReviewCreateConfigResponseDto[i];
        }
    }

    public MarketGetItemReviewCreateConfigResponseDto(MarketItemReviewCreateTypeHintConfigsDto marketItemReviewCreateTypeHintConfigsDto, String str) {
        this.typeHintConfigs = marketItemReviewCreateTypeHintConfigsDto;
        this.faqUrl = str;
    }

    public final String d() {
        return this.faqUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketItemReviewCreateTypeHintConfigsDto e() {
        return this.typeHintConfigs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetItemReviewCreateConfigResponseDto)) {
            return false;
        }
        MarketGetItemReviewCreateConfigResponseDto marketGetItemReviewCreateConfigResponseDto = (MarketGetItemReviewCreateConfigResponseDto) obj;
        return epx.f(this.typeHintConfigs, marketGetItemReviewCreateConfigResponseDto.typeHintConfigs) && epx.f(this.faqUrl, marketGetItemReviewCreateConfigResponseDto.faqUrl);
    }

    public final int hashCode() {
        return this.faqUrl.hashCode() + (this.typeHintConfigs.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetItemReviewCreateConfigResponseDto(typeHintConfigs=");
        sb.append(this.typeHintConfigs);
        sb.append(", faqUrl=");
        return ho8.a(sb, this.faqUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.typeHintConfigs.writeToParcel(parcel, i);
        parcel.writeString(this.faqUrl);
    }
}

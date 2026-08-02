package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketGetCommunityReviewCreateConfigResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCommunityReviewCreateConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCommunityReviewCreateConfigResponseDto> CREATOR = new a();

    @pmi0("faq_url")
    private final String faqUrl;

    @pmi0("type_hint_configs")
    private final MarketCommunityReviewCreateTypeHintConfigsDto typeHintConfigs;

    /* compiled from: MarketGetCommunityReviewCreateConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCommunityReviewCreateConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityReviewCreateConfigResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetCommunityReviewCreateConfigResponseDto(MarketCommunityReviewCreateTypeHintConfigsDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityReviewCreateConfigResponseDto[] newArray(int i) {
            return new MarketGetCommunityReviewCreateConfigResponseDto[i];
        }
    }

    public MarketGetCommunityReviewCreateConfigResponseDto(MarketCommunityReviewCreateTypeHintConfigsDto marketCommunityReviewCreateTypeHintConfigsDto, String str) {
        this.typeHintConfigs = marketCommunityReviewCreateTypeHintConfigsDto;
        this.faqUrl = str;
    }

    public final String d() {
        return this.faqUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketCommunityReviewCreateTypeHintConfigsDto e() {
        return this.typeHintConfigs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCommunityReviewCreateConfigResponseDto)) {
            return false;
        }
        MarketGetCommunityReviewCreateConfigResponseDto marketGetCommunityReviewCreateConfigResponseDto = (MarketGetCommunityReviewCreateConfigResponseDto) obj;
        return epx.f(this.typeHintConfigs, marketGetCommunityReviewCreateConfigResponseDto.typeHintConfigs) && epx.f(this.faqUrl, marketGetCommunityReviewCreateConfigResponseDto.faqUrl);
    }

    public final int hashCode() {
        return this.faqUrl.hashCode() + (this.typeHintConfigs.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetCommunityReviewCreateConfigResponseDto(typeHintConfigs=");
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

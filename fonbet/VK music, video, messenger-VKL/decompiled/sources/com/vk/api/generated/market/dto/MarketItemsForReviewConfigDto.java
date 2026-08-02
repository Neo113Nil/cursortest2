package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: MarketItemsForReviewConfigDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemsForReviewConfigDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemsForReviewConfigDto> CREATOR = new a();

    @pmi0("community_main_delay")
    private final int communityMainDelay;

    @pmi0("market_main_delay")
    private final int marketMainDelay;

    @pmi0("requests_delay")
    private final int requestsDelay;

    /* compiled from: MarketItemsForReviewConfigDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemsForReviewConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemsForReviewConfigDto createFromParcel(Parcel parcel) {
            return new MarketItemsForReviewConfigDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemsForReviewConfigDto[] newArray(int i) {
            return new MarketItemsForReviewConfigDto[i];
        }
    }

    public MarketItemsForReviewConfigDto(int i, int i2, int i3) {
        this.requestsDelay = i;
        this.marketMainDelay = i2;
        this.communityMainDelay = i3;
    }

    public final int d() {
        return this.communityMainDelay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.requestsDelay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemsForReviewConfigDto)) {
            return false;
        }
        MarketItemsForReviewConfigDto marketItemsForReviewConfigDto = (MarketItemsForReviewConfigDto) obj;
        return this.requestsDelay == marketItemsForReviewConfigDto.requestsDelay && this.marketMainDelay == marketItemsForReviewConfigDto.marketMainDelay && this.communityMainDelay == marketItemsForReviewConfigDto.communityMainDelay;
    }

    public final int hashCode() {
        return Integer.hashCode(this.communityMainDelay) + shy.a(this.marketMainDelay, Integer.hashCode(this.requestsDelay) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemsForReviewConfigDto(requestsDelay=");
        sb.append(this.requestsDelay);
        sb.append(", marketMainDelay=");
        sb.append(this.marketMainDelay);
        sb.append(", communityMainDelay=");
        return vu5.b(sb, this.communityMainDelay, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requestsDelay);
        parcel.writeInt(this.marketMainDelay);
        parcel.writeInt(this.communityMainDelay);
    }
}

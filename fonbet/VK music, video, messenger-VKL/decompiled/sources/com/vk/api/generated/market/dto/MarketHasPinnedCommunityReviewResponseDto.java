package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: MarketHasPinnedCommunityReviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketHasPinnedCommunityReviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketHasPinnedCommunityReviewResponseDto> CREATOR = new a();

    @pmi0("has_pinned")
    private final boolean hasPinned;

    /* compiled from: MarketHasPinnedCommunityReviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketHasPinnedCommunityReviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketHasPinnedCommunityReviewResponseDto createFromParcel(Parcel parcel) {
            return new MarketHasPinnedCommunityReviewResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketHasPinnedCommunityReviewResponseDto[] newArray(int i) {
            return new MarketHasPinnedCommunityReviewResponseDto[i];
        }
    }

    public MarketHasPinnedCommunityReviewResponseDto(boolean z) {
        this.hasPinned = z;
    }

    public final boolean d() {
        return this.hasPinned;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketHasPinnedCommunityReviewResponseDto) && this.hasPinned == ((MarketHasPinnedCommunityReviewResponseDto) obj).hasPinned;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasPinned);
    }

    public final String toString() {
        return q0.a(new StringBuilder("MarketHasPinnedCommunityReviewResponseDto(hasPinned="), this.hasPinned, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasPinned ? 1 : 0);
    }
}

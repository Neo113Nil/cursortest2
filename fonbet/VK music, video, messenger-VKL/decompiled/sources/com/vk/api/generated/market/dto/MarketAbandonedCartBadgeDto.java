package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketAbandonedCartBadgeDto.kt */
/* loaded from: classes15.dex */
public final class MarketAbandonedCartBadgeDto implements Parcelable {
    public static final Parcelable.Creator<MarketAbandonedCartBadgeDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    /* compiled from: MarketAbandonedCartBadgeDto.kt */
    public static final class a implements Parcelable.Creator<MarketAbandonedCartBadgeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketAbandonedCartBadgeDto createFromParcel(Parcel parcel) {
            return new MarketAbandonedCartBadgeDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketAbandonedCartBadgeDto[] newArray(int i) {
            return new MarketAbandonedCartBadgeDto[i];
        }
    }

    public MarketAbandonedCartBadgeDto(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketAbandonedCartBadgeDto) && epx.f(this.title, ((MarketAbandonedCartBadgeDto) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketAbandonedCartBadgeDto(title="), this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
    }
}

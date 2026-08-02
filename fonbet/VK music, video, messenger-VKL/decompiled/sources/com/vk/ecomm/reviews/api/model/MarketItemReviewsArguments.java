package com.vk.ecomm.reviews.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;

/* compiled from: MarketItemReviewsArguments.kt */
/* loaded from: classes18.dex */
public final class MarketItemReviewsArguments implements Parcelable {
    public static final Parcelable.Creator<MarketItemReviewsArguments> CREATOR = new a();
    public final long b;
    public final UserId c;
    public final MarketCtaButtonAnalyticsParams d;
    public final String e;

    /* compiled from: MarketItemReviewsArguments.kt */
    public static final class a implements Parcelable.Creator<MarketItemReviewsArguments> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewsArguments createFromParcel(Parcel parcel) {
            return new MarketItemReviewsArguments(parcel.readLong(), (UserId) parcel.readParcelable(MarketItemReviewsArguments.class.getClassLoader()), (MarketCtaButtonAnalyticsParams) parcel.readParcelable(MarketItemReviewsArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewsArguments[] newArray(int i) {
            return new MarketItemReviewsArguments[i];
        }
    }

    public MarketItemReviewsArguments(long j, UserId userId, MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams, String str) {
        this.b = j;
        this.c = userId;
        this.d = marketCtaButtonAnalyticsParams;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemReviewsArguments)) {
            return false;
        }
        MarketItemReviewsArguments marketItemReviewsArguments = (MarketItemReviewsArguments) obj;
        return this.b == marketItemReviewsArguments.b && epx.f(this.c, marketItemReviewsArguments.c) && epx.f(this.d, marketItemReviewsArguments.d) && epx.f(this.e, marketItemReviewsArguments.e);
    }

    public final int hashCode() {
        int a2 = bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
        MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams = this.d;
        int hashCode = (a2 + (marketCtaButtonAnalyticsParams == null ? 0 : marketCtaButtonAnalyticsParams.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewsArguments(productId=");
        sb.append(this.b);
        sb.append(", communityId=");
        sb.append(this.c);
        sb.append(", analyticsParams=");
        sb.append(this.d);
        sb.append(", adsLabel=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }
}

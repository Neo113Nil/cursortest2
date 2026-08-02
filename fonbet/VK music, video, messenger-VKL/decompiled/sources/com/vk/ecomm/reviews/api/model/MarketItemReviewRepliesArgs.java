package com.vk.ecomm.reviews.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.vu5;

/* compiled from: MarketItemReviewRepliesArgs.kt */
/* loaded from: classes18.dex */
public final class MarketItemReviewRepliesArgs implements Parcelable {
    public static final Parcelable.Creator<MarketItemReviewRepliesArgs> CREATOR = new a();
    public final UserId b;
    public final long c;
    public final int d;

    /* compiled from: MarketItemReviewRepliesArgs.kt */
    public static final class a implements Parcelable.Creator<MarketItemReviewRepliesArgs> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewRepliesArgs createFromParcel(Parcel parcel) {
            return new MarketItemReviewRepliesArgs((UserId) parcel.readParcelable(MarketItemReviewRepliesArgs.class.getClassLoader()), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewRepliesArgs[] newArray(int i) {
            return new MarketItemReviewRepliesArgs[i];
        }
    }

    public MarketItemReviewRepliesArgs(UserId userId, long j, int i) {
        this.b = userId;
        this.c = j;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemReviewRepliesArgs)) {
            return false;
        }
        MarketItemReviewRepliesArgs marketItemReviewRepliesArgs = (MarketItemReviewRepliesArgs) obj;
        return epx.f(this.b, marketItemReviewRepliesArgs.b) && this.c == marketItemReviewRepliesArgs.c && this.d == marketItemReviewRepliesArgs.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewRepliesArgs(communityId=");
        sb.append(this.b);
        sb.append(", marketItemId=");
        sb.append(this.c);
        sb.append(", reviewId=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
    }
}

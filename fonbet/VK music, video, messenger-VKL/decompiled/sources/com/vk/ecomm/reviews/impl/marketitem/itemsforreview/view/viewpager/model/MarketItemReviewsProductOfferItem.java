package com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.urd0;

/* compiled from: MarketItemsForReviewItem.kt */
/* loaded from: classes18.dex */
public final class MarketItemReviewsProductOfferItem extends MarketItemReviewsOfferItem {
    public static final Parcelable.Creator<MarketItemReviewsProductOfferItem> CREATOR = new a();
    public final long b;
    public final UserId c;
    public final List<BaseImageDto> d;
    public final String e;
    public final String f;
    public final float g;
    public final boolean h;

    /* compiled from: MarketItemsForReviewItem.kt */
    public static final class a implements Parcelable.Creator<MarketItemReviewsProductOfferItem> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewsProductOfferItem createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            UserId userId = (UserId) parcel.readParcelable(MarketItemReviewsProductOfferItem.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (true) {
                if (i == readInt) {
                    break;
                }
                i = bo.b(MarketItemReviewsProductOfferItem.class, parcel, arrayList, i, 1);
            }
            return new MarketItemReviewsProductOfferItem(readLong, userId, arrayList, parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewsProductOfferItem[] newArray(int i) {
            return new MarketItemReviewsProductOfferItem[i];
        }
    }

    public MarketItemReviewsProductOfferItem(long j, UserId userId, List<BaseImageDto> list, String str, String str2, float f, boolean z) {
        this.b = j;
        this.c = userId;
        this.d = list;
        this.e = str;
        this.f = str2;
        this.g = f;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemReviewsProductOfferItem)) {
            return false;
        }
        MarketItemReviewsProductOfferItem marketItemReviewsProductOfferItem = (MarketItemReviewsProductOfferItem) obj;
        return this.b == marketItemReviewsProductOfferItem.b && epx.f(this.c, marketItemReviewsProductOfferItem.c) && epx.f(this.d, marketItemReviewsProductOfferItem.d) && epx.f(this.e, marketItemReviewsProductOfferItem.e) && epx.f(this.f, marketItemReviewsProductOfferItem.f) && Float.compare(this.g, marketItemReviewsProductOfferItem.g) == 0 && this.h == marketItemReviewsProductOfferItem.h;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.h) + b.a(this.g, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewsProductOfferItem(itemId=");
        sb.append(this.b);
        sb.append(", communityId=");
        sb.append(this.c);
        sb.append(", icons=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", rating=");
        sb.append(this.g);
        sb.append(", isReviewed=");
        return q0.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeFloat(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}

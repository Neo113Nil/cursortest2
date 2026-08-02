package com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MarketItemsForReviewItem.kt */
/* loaded from: classes18.dex */
public final class MarketItemReviewsDoneOfferItem extends MarketItemReviewsOfferItem {
    public static final Parcelable.Creator<MarketItemReviewsDoneOfferItem> CREATOR = new a();

    /* compiled from: MarketItemsForReviewItem.kt */
    public static final class a implements Parcelable.Creator<MarketItemReviewsDoneOfferItem> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewsDoneOfferItem createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new MarketItemReviewsDoneOfferItem();
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewsDoneOfferItem[] newArray(int i) {
            return new MarketItemReviewsDoneOfferItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}

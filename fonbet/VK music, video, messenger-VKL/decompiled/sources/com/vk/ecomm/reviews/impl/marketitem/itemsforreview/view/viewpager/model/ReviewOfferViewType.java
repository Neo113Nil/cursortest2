package com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.viewpager.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketItemsForReviewItem.kt */
/* loaded from: classes18.dex */
public final class ReviewOfferViewType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReviewOfferViewType[] $VALUES;
    public static final ReviewOfferViewType COMMUNITY_MAIN;
    public static final Parcelable.Creator<ReviewOfferViewType> CREATOR;
    public static final ReviewOfferViewType MARKET_MAIN;
    public static final ReviewOfferViewType ORDER;
    private final String value;

    /* compiled from: MarketItemsForReviewItem.kt */
    public static final class a implements Parcelable.Creator<ReviewOfferViewType> {
        @Override // android.os.Parcelable.Creator
        public final ReviewOfferViewType createFromParcel(Parcel parcel) {
            return ReviewOfferViewType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewOfferViewType[] newArray(int i) {
            return new ReviewOfferViewType[i];
        }
    }

    static {
        ReviewOfferViewType reviewOfferViewType = new ReviewOfferViewType("COMMUNITY_MAIN", 0, "community_main");
        COMMUNITY_MAIN = reviewOfferViewType;
        ReviewOfferViewType reviewOfferViewType2 = new ReviewOfferViewType("MARKET_MAIN", 1, "market_main");
        MARKET_MAIN = reviewOfferViewType2;
        ReviewOfferViewType reviewOfferViewType3 = new ReviewOfferViewType("ORDER", 2, C4504q2.u);
        ORDER = reviewOfferViewType3;
        ReviewOfferViewType[] reviewOfferViewTypeArr = {reviewOfferViewType, reviewOfferViewType2, reviewOfferViewType3};
        $VALUES = reviewOfferViewTypeArr;
        $ENTRIES = new asp(reviewOfferViewTypeArr);
        CREATOR = new a();
    }

    public ReviewOfferViewType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ReviewOfferViewType valueOf(String str) {
        return (ReviewOfferViewType) Enum.valueOf(ReviewOfferViewType.class, str);
    }

    public static ReviewOfferViewType[] values() {
        return (ReviewOfferViewType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

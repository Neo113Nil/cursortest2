package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketItemReviewsBottomButtonDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemReviewsBottomButtonDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemReviewsBottomButtonDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    @pmi0("text")
    private final String text;

    /* compiled from: MarketItemReviewsBottomButtonDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemReviewsBottomButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewsBottomButtonDto createFromParcel(Parcel parcel) {
            return new MarketItemReviewsBottomButtonDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemReviewsBottomButtonDto[] newArray(int i) {
            return new MarketItemReviewsBottomButtonDto[i];
        }
    }

    public MarketItemReviewsBottomButtonDto(String str, String str2) {
        this.text = str;
        this.link = str2;
    }

    public final String d() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemReviewsBottomButtonDto)) {
            return false;
        }
        MarketItemReviewsBottomButtonDto marketItemReviewsBottomButtonDto = (MarketItemReviewsBottomButtonDto) obj;
        return epx.f(this.text, marketItemReviewsBottomButtonDto.text) && epx.f(this.link, marketItemReviewsBottomButtonDto.link);
    }

    public final int hashCode() {
        return this.link.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewsBottomButtonDto(text=");
        sb.append(this.text);
        sb.append(", link=");
        return ho8.a(sb, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.link);
    }
}

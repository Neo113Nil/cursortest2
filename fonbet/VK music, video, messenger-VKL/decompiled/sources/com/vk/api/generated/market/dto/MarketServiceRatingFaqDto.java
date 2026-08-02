package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketServiceRatingFaqDto.kt */
/* loaded from: classes15.dex */
public final class MarketServiceRatingFaqDto implements Parcelable {
    public static final Parcelable.Creator<MarketServiceRatingFaqDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: MarketServiceRatingFaqDto.kt */
    public static final class a implements Parcelable.Creator<MarketServiceRatingFaqDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingFaqDto createFromParcel(Parcel parcel) {
            return new MarketServiceRatingFaqDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingFaqDto[] newArray(int i) {
            return new MarketServiceRatingFaqDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketServiceRatingFaqDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServiceRatingFaqDto)) {
            return false;
        }
        MarketServiceRatingFaqDto marketServiceRatingFaqDto = (MarketServiceRatingFaqDto) obj;
        return epx.f(this.title, marketServiceRatingFaqDto.title) && epx.f(this.url, marketServiceRatingFaqDto.url);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServiceRatingFaqDto(title=");
        sb.append(this.title);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }

    public MarketServiceRatingFaqDto(String str, String str2) {
        this.title = str;
        this.url = str2;
    }

    public /* synthetic */ MarketServiceRatingFaqDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketServiceRatingWarningButtonDto.kt */
/* loaded from: classes15.dex */
public final class MarketServiceRatingWarningButtonDto implements Parcelable {
    public static final Parcelable.Creator<MarketServiceRatingWarningButtonDto> CREATOR = new a();

    @pmi0("mobile_link")
    private final String mobileLink;

    @pmi0("slug")
    private final String slug;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketServiceRatingWarningButtonDto.kt */
    public static final class a implements Parcelable.Creator<MarketServiceRatingWarningButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingWarningButtonDto createFromParcel(Parcel parcel) {
            return new MarketServiceRatingWarningButtonDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingWarningButtonDto[] newArray(int i) {
            return new MarketServiceRatingWarningButtonDto[i];
        }
    }

    public MarketServiceRatingWarningButtonDto(String str, String str2, String str3) {
        this.title = str;
        this.slug = str2;
        this.mobileLink = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServiceRatingWarningButtonDto)) {
            return false;
        }
        MarketServiceRatingWarningButtonDto marketServiceRatingWarningButtonDto = (MarketServiceRatingWarningButtonDto) obj;
        return epx.f(this.title, marketServiceRatingWarningButtonDto.title) && epx.f(this.slug, marketServiceRatingWarningButtonDto.slug) && epx.f(this.mobileLink, marketServiceRatingWarningButtonDto.mobileLink);
    }

    public final int hashCode() {
        return this.mobileLink.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.slug);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServiceRatingWarningButtonDto(title=");
        sb.append(this.title);
        sb.append(", slug=");
        sb.append(this.slug);
        sb.append(", mobileLink=");
        return ho8.a(sb, this.mobileLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.slug);
        parcel.writeString(this.mobileLink);
    }
}

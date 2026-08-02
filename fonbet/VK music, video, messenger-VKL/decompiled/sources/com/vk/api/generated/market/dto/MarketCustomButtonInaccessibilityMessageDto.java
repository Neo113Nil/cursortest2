package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketCustomButtonInaccessibilityMessageDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonInaccessibilityMessageDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonInaccessibilityMessageDto> CREATOR = new a();

    @pmi0("sub_title")
    private final String subTitle;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCustomButtonInaccessibilityMessageDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonInaccessibilityMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonInaccessibilityMessageDto createFromParcel(Parcel parcel) {
            return new MarketCustomButtonInaccessibilityMessageDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonInaccessibilityMessageDto[] newArray(int i) {
            return new MarketCustomButtonInaccessibilityMessageDto[i];
        }
    }

    public MarketCustomButtonInaccessibilityMessageDto(String str, String str2) {
        this.title = str;
        this.subTitle = str2;
    }

    public final String d() {
        return this.subTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonInaccessibilityMessageDto)) {
            return false;
        }
        MarketCustomButtonInaccessibilityMessageDto marketCustomButtonInaccessibilityMessageDto = (MarketCustomButtonInaccessibilityMessageDto) obj;
        return epx.f(this.title, marketCustomButtonInaccessibilityMessageDto.title) && epx.f(this.subTitle, marketCustomButtonInaccessibilityMessageDto.subTitle);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.subTitle.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonInaccessibilityMessageDto(title=");
        sb.append(this.title);
        sb.append(", subTitle=");
        return ho8.a(sb, this.subTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
    }
}

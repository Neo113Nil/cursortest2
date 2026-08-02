package com.vk.api.generated.marketCarousel.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCarouselBlockPanelDto.kt */
/* loaded from: classes15.dex */
public final class MarketCarouselBlockPanelDto implements Parcelable {
    public static final Parcelable.Creator<MarketCarouselBlockPanelDto> CREATOR = new a();

    @pmi0("photo_124")
    private final String photo124;

    @pmi0("photo_186")
    private final String photo186;

    @pmi0("photo_62")
    private final String photo62;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCarouselBlockPanelDto.kt */
    public static final class a implements Parcelable.Creator<MarketCarouselBlockPanelDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCarouselBlockPanelDto createFromParcel(Parcel parcel) {
            return new MarketCarouselBlockPanelDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCarouselBlockPanelDto[] newArray(int i) {
            return new MarketCarouselBlockPanelDto[i];
        }
    }

    public MarketCarouselBlockPanelDto(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.subtitle = str2;
        this.photo62 = str3;
        this.photo124 = str4;
        this.photo186 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCarouselBlockPanelDto)) {
            return false;
        }
        MarketCarouselBlockPanelDto marketCarouselBlockPanelDto = (MarketCarouselBlockPanelDto) obj;
        return epx.f(this.title, marketCarouselBlockPanelDto.title) && epx.f(this.subtitle, marketCarouselBlockPanelDto.subtitle) && epx.f(this.photo62, marketCarouselBlockPanelDto.photo62) && epx.f(this.photo124, marketCarouselBlockPanelDto.photo124) && epx.f(this.photo186, marketCarouselBlockPanelDto.photo186);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo62;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo124;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo186;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCarouselBlockPanelDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", photo62=");
        sb.append(this.photo62);
        sb.append(", photo124=");
        sb.append(this.photo124);
        sb.append(", photo186=");
        return ho8.a(sb, this.photo186, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.photo62);
        parcel.writeString(this.photo124);
        parcel.writeString(this.photo186);
    }

    public /* synthetic */ MarketCarouselBlockPanelDto(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}

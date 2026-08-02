package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketServiceRatingBenefitItemPopupDto.kt */
/* loaded from: classes15.dex */
public final class MarketServiceRatingBenefitItemPopupDto implements Parcelable {
    public static final Parcelable.Creator<MarketServiceRatingBenefitItemPopupDto> CREATOR = new a();

    @pmi0("button_link")
    private final String buttonLink;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("description")
    private final String description;

    @pmi0("img")
    private final String img;

    @pmi0("img_100")
    private final String img100;

    @pmi0("img_50")
    private final String img50;

    @pmi0("img_dark_100")
    private final String imgDark100;

    @pmi0("img_dark_50")
    private final String imgDark50;

    /* compiled from: MarketServiceRatingBenefitItemPopupDto.kt */
    public static final class a implements Parcelable.Creator<MarketServiceRatingBenefitItemPopupDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingBenefitItemPopupDto createFromParcel(Parcel parcel) {
            return new MarketServiceRatingBenefitItemPopupDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingBenefitItemPopupDto[] newArray(int i) {
            return new MarketServiceRatingBenefitItemPopupDto[i];
        }
    }

    public MarketServiceRatingBenefitItemPopupDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServiceRatingBenefitItemPopupDto)) {
            return false;
        }
        MarketServiceRatingBenefitItemPopupDto marketServiceRatingBenefitItemPopupDto = (MarketServiceRatingBenefitItemPopupDto) obj;
        return epx.f(this.description, marketServiceRatingBenefitItemPopupDto.description) && epx.f(this.img, marketServiceRatingBenefitItemPopupDto.img) && epx.f(this.img50, marketServiceRatingBenefitItemPopupDto.img50) && epx.f(this.img100, marketServiceRatingBenefitItemPopupDto.img100) && epx.f(this.imgDark50, marketServiceRatingBenefitItemPopupDto.imgDark50) && epx.f(this.imgDark100, marketServiceRatingBenefitItemPopupDto.imgDark100) && epx.f(this.buttonText, marketServiceRatingBenefitItemPopupDto.buttonText) && epx.f(this.buttonLink, marketServiceRatingBenefitItemPopupDto.buttonLink);
    }

    public final int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.img;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img50;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.img100;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imgDark50;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imgDark100;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.buttonText;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.buttonLink;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServiceRatingBenefitItemPopupDto(description=");
        sb.append(this.description);
        sb.append(", img=");
        sb.append(this.img);
        sb.append(", img50=");
        sb.append(this.img50);
        sb.append(", img100=");
        sb.append(this.img100);
        sb.append(", imgDark50=");
        sb.append(this.imgDark50);
        sb.append(", imgDark100=");
        sb.append(this.imgDark100);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", buttonLink=");
        return ho8.a(sb, this.buttonLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        parcel.writeString(this.img);
        parcel.writeString(this.img50);
        parcel.writeString(this.img100);
        parcel.writeString(this.imgDark50);
        parcel.writeString(this.imgDark100);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.buttonLink);
    }

    public MarketServiceRatingBenefitItemPopupDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.description = str;
        this.img = str2;
        this.img50 = str3;
        this.img100 = str4;
        this.imgDark50 = str5;
        this.imgDark100 = str6;
        this.buttonText = str7;
        this.buttonLink = str8;
    }

    public /* synthetic */ MarketServiceRatingBenefitItemPopupDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}

package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MarketServiceRatingBenefitItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketServiceRatingBenefitItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketServiceRatingBenefitItemDto> CREATOR = new a();

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

    @pmi0("is_achieved")
    private final Boolean isAchieved;

    @pmi0("popup")
    private final MarketServiceRatingBenefitItemPopupDto popup;

    @pmi0("slug")
    private final String slug;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketServiceRatingBenefitItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketServiceRatingBenefitItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingBenefitItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            MarketServiceRatingBenefitItemPopupDto marketServiceRatingBenefitItemPopupDto;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                marketServiceRatingBenefitItemPopupDto = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
                marketServiceRatingBenefitItemPopupDto = null;
            }
            return new MarketServiceRatingBenefitItemDto(readString, readString2, readString3, valueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? marketServiceRatingBenefitItemPopupDto : MarketServiceRatingBenefitItemPopupDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingBenefitItemDto[] newArray(int i) {
            return new MarketServiceRatingBenefitItemDto[i];
        }
    }

    public MarketServiceRatingBenefitItemDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServiceRatingBenefitItemDto)) {
            return false;
        }
        MarketServiceRatingBenefitItemDto marketServiceRatingBenefitItemDto = (MarketServiceRatingBenefitItemDto) obj;
        return epx.f(this.slug, marketServiceRatingBenefitItemDto.slug) && epx.f(this.title, marketServiceRatingBenefitItemDto.title) && epx.f(this.description, marketServiceRatingBenefitItemDto.description) && epx.f(this.isAchieved, marketServiceRatingBenefitItemDto.isAchieved) && epx.f(this.img, marketServiceRatingBenefitItemDto.img) && epx.f(this.img50, marketServiceRatingBenefitItemDto.img50) && epx.f(this.img100, marketServiceRatingBenefitItemDto.img100) && epx.f(this.imgDark50, marketServiceRatingBenefitItemDto.imgDark50) && epx.f(this.imgDark100, marketServiceRatingBenefitItemDto.imgDark100) && epx.f(this.popup, marketServiceRatingBenefitItemDto.popup);
    }

    public final int hashCode() {
        String str = this.slug;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isAchieved;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.img;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.img50;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.img100;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.imgDark50;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.imgDark100;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        MarketServiceRatingBenefitItemPopupDto marketServiceRatingBenefitItemPopupDto = this.popup;
        return hashCode9 + (marketServiceRatingBenefitItemPopupDto != null ? marketServiceRatingBenefitItemPopupDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketServiceRatingBenefitItemDto(slug=" + this.slug + ", title=" + this.title + ", description=" + this.description + ", isAchieved=" + this.isAchieved + ", img=" + this.img + ", img50=" + this.img50 + ", img100=" + this.img100 + ", imgDark50=" + this.imgDark50 + ", imgDark100=" + this.imgDark100 + ", popup=" + this.popup + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.slug);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Boolean bool = this.isAchieved;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.img);
        parcel.writeString(this.img50);
        parcel.writeString(this.img100);
        parcel.writeString(this.imgDark50);
        parcel.writeString(this.imgDark100);
        MarketServiceRatingBenefitItemPopupDto marketServiceRatingBenefitItemPopupDto = this.popup;
        if (marketServiceRatingBenefitItemPopupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketServiceRatingBenefitItemPopupDto.writeToParcel(parcel, i);
        }
    }

    public MarketServiceRatingBenefitItemDto(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, MarketServiceRatingBenefitItemPopupDto marketServiceRatingBenefitItemPopupDto) {
        this.slug = str;
        this.title = str2;
        this.description = str3;
        this.isAchieved = bool;
        this.img = str4;
        this.img50 = str5;
        this.img100 = str6;
        this.imgDark50 = str7;
        this.imgDark100 = str8;
        this.popup = marketServiceRatingBenefitItemPopupDto;
    }

    public /* synthetic */ MarketServiceRatingBenefitItemDto(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, MarketServiceRatingBenefitItemPopupDto marketServiceRatingBenefitItemPopupDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : marketServiceRatingBenefitItemPopupDto);
    }
}

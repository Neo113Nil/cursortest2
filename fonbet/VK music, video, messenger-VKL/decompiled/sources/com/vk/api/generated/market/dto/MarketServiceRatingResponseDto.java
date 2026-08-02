package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketServiceRatingResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketServiceRatingResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketServiceRatingResponseDto> CREATOR = new a();

    @pmi0("benefits")
    private final MarketServiceRatingBenefitsDto benefits;

    @pmi0("criteria")
    private final List<MarketServiceRatingCriteriaDto> criteria;

    @pmi0("description")
    private final String description;

    @pmi0("faq")
    private final MarketServiceRatingFaqDto faq;

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

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final float rating;

    @pmi0("title")
    private final String title;

    @pmi0("warning")
    private final MarketServiceRatingWarningDto warning;

    /* compiled from: MarketServiceRatingResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketServiceRatingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingResponseDto createFromParcel(Parcel parcel) {
            float readFloat = parcel.readFloat();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            MarketServiceRatingFaqDto createFromParcel = MarketServiceRatingFaqDto.CREATOR.createFromParcel(parcel);
            MarketServiceRatingBenefitsDto createFromParcel2 = MarketServiceRatingBenefitsDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketServiceRatingCriteriaDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketServiceRatingResponseDto(readFloat, readString, readString2, readString3, createFromParcel, createFromParcel2, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MarketServiceRatingWarningDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingResponseDto[] newArray(int i) {
            return new MarketServiceRatingResponseDto[i];
        }
    }

    public MarketServiceRatingResponseDto(float f, String str, String str2, String str3, MarketServiceRatingFaqDto marketServiceRatingFaqDto, MarketServiceRatingBenefitsDto marketServiceRatingBenefitsDto, List<MarketServiceRatingCriteriaDto> list, String str4, String str5, String str6, String str7, MarketServiceRatingWarningDto marketServiceRatingWarningDto) {
        this.rating = f;
        this.title = str;
        this.description = str2;
        this.img = str3;
        this.faq = marketServiceRatingFaqDto;
        this.benefits = marketServiceRatingBenefitsDto;
        this.criteria = list;
        this.img50 = str4;
        this.img100 = str5;
        this.imgDark50 = str6;
        this.imgDark100 = str7;
        this.warning = marketServiceRatingWarningDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServiceRatingResponseDto)) {
            return false;
        }
        MarketServiceRatingResponseDto marketServiceRatingResponseDto = (MarketServiceRatingResponseDto) obj;
        return Float.compare(this.rating, marketServiceRatingResponseDto.rating) == 0 && epx.f(this.title, marketServiceRatingResponseDto.title) && epx.f(this.description, marketServiceRatingResponseDto.description) && epx.f(this.img, marketServiceRatingResponseDto.img) && epx.f(this.faq, marketServiceRatingResponseDto.faq) && epx.f(this.benefits, marketServiceRatingResponseDto.benefits) && epx.f(this.criteria, marketServiceRatingResponseDto.criteria) && epx.f(this.img50, marketServiceRatingResponseDto.img50) && epx.f(this.img100, marketServiceRatingResponseDto.img100) && epx.f(this.imgDark50, marketServiceRatingResponseDto.imgDark50) && epx.f(this.imgDark100, marketServiceRatingResponseDto.imgDark100) && epx.f(this.warning, marketServiceRatingResponseDto.warning);
    }

    public final int hashCode() {
        int a2 = fw3.a((this.benefits.hashCode() + ((this.faq.hashCode() + urd0.a(urd0.a(urd0.a(Float.hashCode(this.rating) * 31, 31, this.title), 31, this.description), 31, this.img)) * 31)) * 31, 31, this.criteria);
        String str = this.img50;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.img100;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imgDark50;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imgDark100;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MarketServiceRatingWarningDto marketServiceRatingWarningDto = this.warning;
        return hashCode4 + (marketServiceRatingWarningDto != null ? marketServiceRatingWarningDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketServiceRatingResponseDto(rating=" + this.rating + ", title=" + this.title + ", description=" + this.description + ", img=" + this.img + ", faq=" + this.faq + ", benefits=" + this.benefits + ", criteria=" + this.criteria + ", img50=" + this.img50 + ", img100=" + this.img100 + ", imgDark50=" + this.imgDark50 + ", imgDark100=" + this.imgDark100 + ", warning=" + this.warning + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.rating);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.img);
        this.faq.writeToParcel(parcel, i);
        this.benefits.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.criteria);
        while (a2.hasNext()) {
            ((MarketServiceRatingCriteriaDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.img50);
        parcel.writeString(this.img100);
        parcel.writeString(this.imgDark50);
        parcel.writeString(this.imgDark100);
        MarketServiceRatingWarningDto marketServiceRatingWarningDto = this.warning;
        if (marketServiceRatingWarningDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketServiceRatingWarningDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketServiceRatingResponseDto(float f, String str, String str2, String str3, MarketServiceRatingFaqDto marketServiceRatingFaqDto, MarketServiceRatingBenefitsDto marketServiceRatingBenefitsDto, List list, String str4, String str5, String str6, String str7, MarketServiceRatingWarningDto marketServiceRatingWarningDto, int i, zcl zclVar) {
        this(f, str, str2, str3, marketServiceRatingFaqDto, marketServiceRatingBenefitsDto, list, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : marketServiceRatingWarningDto);
    }
}

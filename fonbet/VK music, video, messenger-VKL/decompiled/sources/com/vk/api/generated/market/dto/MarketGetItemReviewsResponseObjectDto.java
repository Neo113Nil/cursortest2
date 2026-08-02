package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketGetItemReviewsResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemReviewsResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetItemReviewsResponseObjectDto> CREATOR = new a();

    @pmi0("bottom_button")
    private final MarketItemReviewsBottomButtonDto bottomButton;

    @pmi0("faq_link")
    private final String faqLink;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final MarketItemRatingDto rating;

    @pmi0("rating_description")
    private final String ratingDescription;

    @pmi0("review_thumbs")
    private final List<List<BaseImageDto>> reviewThumbs;

    @pmi0("reviews")
    private final List<MarketItemSkuReviewDto> reviews;

    @pmi0("show_admin_description")
    private final boolean showAdminDescription;

    @pmi0("show_sort")
    private final boolean showSort;

    /* compiled from: MarketGetItemReviewsResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemReviewsResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemReviewsResponseObjectDto createFromParcel(Parcel parcel) {
            MarketItemRatingDto createFromParcel = MarketItemRatingDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketItemSkuReviewDto.CREATOR, parcel, arrayList, i, 1);
            }
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String readString2 = parcel.readString();
            ArrayList arrayList2 = null;
            MarketItemReviewsBottomButtonDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketItemReviewsBottomButtonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = bo.b(MarketGetItemReviewsResponseObjectDto.class, parcel, arrayList4, i3, 1);
                    }
                    arrayList3.add(arrayList4);
                }
                arrayList2 = arrayList3;
            }
            return new MarketGetItemReviewsResponseObjectDto(createFromParcel, arrayList, readString, z, z2, readString2, createFromParcel2, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemReviewsResponseObjectDto[] newArray(int i) {
            return new MarketGetItemReviewsResponseObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetItemReviewsResponseObjectDto(MarketItemRatingDto marketItemRatingDto, List<MarketItemSkuReviewDto> list, String str, boolean z, boolean z2, String str2, MarketItemReviewsBottomButtonDto marketItemReviewsBottomButtonDto, List<? extends List<BaseImageDto>> list2) {
        this.rating = marketItemRatingDto;
        this.reviews = list;
        this.faqLink = str;
        this.showSort = z;
        this.showAdminDescription = z2;
        this.ratingDescription = str2;
        this.bottomButton = marketItemReviewsBottomButtonDto;
        this.reviewThumbs = list2;
    }

    public final List<List<BaseImageDto>> d() {
        return this.reviewThumbs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetItemReviewsResponseObjectDto)) {
            return false;
        }
        MarketGetItemReviewsResponseObjectDto marketGetItemReviewsResponseObjectDto = (MarketGetItemReviewsResponseObjectDto) obj;
        return epx.f(this.rating, marketGetItemReviewsResponseObjectDto.rating) && epx.f(this.reviews, marketGetItemReviewsResponseObjectDto.reviews) && epx.f(this.faqLink, marketGetItemReviewsResponseObjectDto.faqLink) && this.showSort == marketGetItemReviewsResponseObjectDto.showSort && this.showAdminDescription == marketGetItemReviewsResponseObjectDto.showAdminDescription && epx.f(this.ratingDescription, marketGetItemReviewsResponseObjectDto.ratingDescription) && epx.f(this.bottomButton, marketGetItemReviewsResponseObjectDto.bottomButton) && epx.f(this.reviewThumbs, marketGetItemReviewsResponseObjectDto.reviewThumbs);
    }

    public final int hashCode() {
        int a2 = urd0.a(qoy.b(qoy.b(urd0.a(fw3.a(this.rating.hashCode() * 31, 31, this.reviews), 31, this.faqLink), 31, this.showSort), 31, this.showAdminDescription), 31, this.ratingDescription);
        MarketItemReviewsBottomButtonDto marketItemReviewsBottomButtonDto = this.bottomButton;
        int hashCode = (a2 + (marketItemReviewsBottomButtonDto == null ? 0 : marketItemReviewsBottomButtonDto.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.reviewThumbs;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetItemReviewsResponseObjectDto(rating=");
        sb.append(this.rating);
        sb.append(", reviews=");
        sb.append(this.reviews);
        sb.append(", faqLink=");
        sb.append(this.faqLink);
        sb.append(", showSort=");
        sb.append(this.showSort);
        sb.append(", showAdminDescription=");
        sb.append(this.showAdminDescription);
        sb.append(", ratingDescription=");
        sb.append(this.ratingDescription);
        sb.append(", bottomButton=");
        sb.append(this.bottomButton);
        sb.append(", reviewThumbs=");
        return ms9.a(')', sb, this.reviewThumbs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.rating.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.reviews);
        while (a2.hasNext()) {
            ((MarketItemSkuReviewDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.faqLink);
        parcel.writeInt(this.showSort ? 1 : 0);
        parcel.writeInt(this.showAdminDescription ? 1 : 0);
        parcel.writeString(this.ratingDescription);
        MarketItemReviewsBottomButtonDto marketItemReviewsBottomButtonDto = this.bottomButton;
        if (marketItemReviewsBottomButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemReviewsBottomButtonDto.writeToParcel(parcel, i);
        }
        List<List<BaseImageDto>> list = this.reviewThumbs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            Iterator a3 = ao.a(parcel, (List) f.next());
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
        }
    }

    public /* synthetic */ MarketGetItemReviewsResponseObjectDto(MarketItemRatingDto marketItemRatingDto, List list, String str, boolean z, boolean z2, String str2, MarketItemReviewsBottomButtonDto marketItemReviewsBottomButtonDto, List list2, int i, zcl zclVar) {
        this(marketItemRatingDto, list, str, z, z2, str2, (i & 64) != 0 ? null : marketItemReviewsBottomButtonDto, (i & 128) != 0 ? null : list2);
    }
}

package com.vk.api.generated.marketCarousel.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCarouselItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketCarouselItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketCarouselItemDto> CREATOR = new a();

    @pmi0("action_button")
    private final BaseLinkButtonDto actionButton;

    @pmi0("delivery_date_text")
    private final String deliveryDateText;

    @pmi0("details_button")
    private final BaseLinkButtonDto detailsButton;

    @pmi0("discount_text")
    private final String discountText;

    @pmi0("group_info")
    private final MarketCarouselGroupInfoDto groupInfo;

    @pmi0("id")
    private final String id;

    @pmi0("is_favorite")
    private final boolean isFavorite;

    @pmi0("label")
    private final String label;

    @pmi0("orders_count")
    private final Integer ordersCount;

    @pmi0("owner_id")
    private final String ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("seo_slug")
    private final String seoSlug;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: MarketCarouselItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketCarouselItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCarouselItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            return new MarketCarouselItemDto(readString, readString2, z, parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(MarketCarouselItemDto.class.getClassLoader()), parcel.readString(), (MarketPriceDto) parcel.readParcelable(MarketCarouselItemDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BaseLinkButtonDto) parcel.readParcelable(MarketCarouselItemDto.class.getClassLoader()), (PhotosPhotoDto) parcel.readParcelable(MarketCarouselItemDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MarketCarouselGroupInfoDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCarouselItemDto[] newArray(int i) {
            return new MarketCarouselItemDto[i];
        }
    }

    public MarketCarouselItemDto(String str, String str2, boolean z, String str3, BaseLinkButtonDto baseLinkButtonDto, String str4, MarketPriceDto marketPriceDto, String str5, String str6, String str7, Float f, Integer num, BaseLinkButtonDto baseLinkButtonDto2, PhotosPhotoDto photosPhotoDto, MarketCarouselGroupInfoDto marketCarouselGroupInfoDto, String str8) {
        this.id = str;
        this.title = str2;
        this.isFavorite = z;
        this.url = str3;
        this.detailsButton = baseLinkButtonDto;
        this.ownerId = str4;
        this.price = marketPriceDto;
        this.discountText = str5;
        this.deliveryDateText = str6;
        this.label = str7;
        this.rating = f;
        this.ordersCount = num;
        this.actionButton = baseLinkButtonDto2;
        this.photo = photosPhotoDto;
        this.groupInfo = marketCarouselGroupInfoDto;
        this.seoSlug = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCarouselItemDto)) {
            return false;
        }
        MarketCarouselItemDto marketCarouselItemDto = (MarketCarouselItemDto) obj;
        return epx.f(this.id, marketCarouselItemDto.id) && epx.f(this.title, marketCarouselItemDto.title) && this.isFavorite == marketCarouselItemDto.isFavorite && epx.f(this.url, marketCarouselItemDto.url) && epx.f(this.detailsButton, marketCarouselItemDto.detailsButton) && epx.f(this.ownerId, marketCarouselItemDto.ownerId) && epx.f(this.price, marketCarouselItemDto.price) && epx.f(this.discountText, marketCarouselItemDto.discountText) && epx.f(this.deliveryDateText, marketCarouselItemDto.deliveryDateText) && epx.f(this.label, marketCarouselItemDto.label) && epx.f(this.rating, marketCarouselItemDto.rating) && epx.f(this.ordersCount, marketCarouselItemDto.ordersCount) && epx.f(this.actionButton, marketCarouselItemDto.actionButton) && epx.f(this.photo, marketCarouselItemDto.photo) && epx.f(this.groupInfo, marketCarouselItemDto.groupInfo) && epx.f(this.seoSlug, marketCarouselItemDto.seoSlug);
    }

    public final int hashCode() {
        int hashCode = (this.detailsButton.hashCode() + urd0.a(qoy.b(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.isFavorite), 31, this.url)) * 31;
        String str = this.ownerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.price;
        int hashCode3 = (hashCode2 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        String str2 = this.discountText;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deliveryDateText;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.rating;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.ordersCount;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.actionButton;
        int hashCode9 = (hashCode8 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode10 = (hashCode9 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        MarketCarouselGroupInfoDto marketCarouselGroupInfoDto = this.groupInfo;
        int hashCode11 = (hashCode10 + (marketCarouselGroupInfoDto == null ? 0 : marketCarouselGroupInfoDto.hashCode())) * 31;
        String str5 = this.seoSlug;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCarouselItemDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", detailsButton=");
        sb.append(this.detailsButton);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", discountText=");
        sb.append(this.discountText);
        sb.append(", deliveryDateText=");
        sb.append(this.deliveryDateText);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", ordersCount=");
        sb.append(this.ordersCount);
        sb.append(", actionButton=");
        sb.append(this.actionButton);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", groupInfo=");
        sb.append(this.groupInfo);
        sb.append(", seoSlug=");
        return ho8.a(sb, this.seoSlug, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.detailsButton, i);
        parcel.writeString(this.ownerId);
        parcel.writeParcelable(this.price, i);
        parcel.writeString(this.discountText);
        parcel.writeString(this.deliveryDateText);
        parcel.writeString(this.label);
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Integer num = this.ordersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.actionButton, i);
        parcel.writeParcelable(this.photo, i);
        MarketCarouselGroupInfoDto marketCarouselGroupInfoDto = this.groupInfo;
        if (marketCarouselGroupInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCarouselGroupInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.seoSlug);
    }

    public /* synthetic */ MarketCarouselItemDto(String str, String str2, boolean z, String str3, BaseLinkButtonDto baseLinkButtonDto, String str4, MarketPriceDto marketPriceDto, String str5, String str6, String str7, Float f, Integer num, BaseLinkButtonDto baseLinkButtonDto2, PhotosPhotoDto photosPhotoDto, MarketCarouselGroupInfoDto marketCarouselGroupInfoDto, String str8, int i, zcl zclVar) {
        this(str, str2, z, str3, baseLinkButtonDto, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : marketPriceDto, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : baseLinkButtonDto2, (i & 8192) != 0 ? null : photosPhotoDto, (i & 16384) != 0 ? null : marketCarouselGroupInfoDto, (i & 32768) != 0 ? null : str8);
    }
}

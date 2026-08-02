package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MarketProfileInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketProfileInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketProfileInfoDto> CREATOR = new a();

    @pmi0("bookmarks_button")
    private final MarketProfileInfoSimpleButtonDto bookmarksButton;

    @pmi0("carts_button")
    private final MarketProfileInfoSimpleButtonDto cartsButton;

    @pmi0("classifieds_bookmarks_button")
    private final MarketProfileInfoSimpleButtonDto classifiedsBookmarksButton;

    @pmi0("classifieds_button")
    private final MarketProfileInfoSimpleButtonDto classifiedsButton;

    @pmi0("create_button")
    private final MarketProfileInfoCreateButtonDto createButton;

    @pmi0("item_rating")
    private final MarketMarketItemRatingDto itemRating;

    @pmi0("location")
    private final MarketProfileInfoLocationDto location;

    @pmi0("location_confirm_required")
    private final Boolean locationConfirmRequired;

    @pmi0("orders_button")
    private final MarketProfileInfoSimpleButtonDto ordersButton;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final MarketProfileInfoProfileDto profile;

    @pmi0("reviews_section")
    private final MarketProfileInfoSimpleButtonDto reviewsSection;

    @pmi0("settings_button")
    private final MarketProfileInfoSimpleButtonDto settingsButton;

    @pmi0("subscriptions_button")
    private final MarketProfileInfoSimpleButtonDto subscriptionsButton;

    @pmi0("wishlist_button")
    private final MarketProfileInfoSimpleButtonDto wishlistButton;

    /* compiled from: MarketProfileInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketProfileInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            MarketProfileInfoProfileDto createFromParcel = MarketProfileInfoProfileDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoCreateButtonDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketProfileInfoCreateButtonDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoSimpleButtonDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoSimpleButtonDto createFromParcel4 = parcel.readInt() == 0 ? null : MarketProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoSimpleButtonDto createFromParcel5 = parcel.readInt() == 0 ? null : MarketProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoSimpleButtonDto createFromParcel6 = parcel.readInt() == 0 ? null : MarketProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoSimpleButtonDto createFromParcel7 = parcel.readInt() == 0 ? null : MarketProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoSimpleButtonDto createFromParcel8 = parcel.readInt() == 0 ? null : MarketProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoSimpleButtonDto createFromParcel9 = parcel.readInt() == 0 ? null : MarketProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoSimpleButtonDto createFromParcel10 = parcel.readInt() == 0 ? null : MarketProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            MarketProfileInfoLocationDto createFromParcel11 = parcel.readInt() == 0 ? null : MarketProfileInfoLocationDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketProfileInfoDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, createFromParcel11, valueOf, (MarketMarketItemRatingDto) parcel.readParcelable(MarketProfileInfoDto.class.getClassLoader()), parcel.readInt() != 0 ? MarketProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoDto[] newArray(int i) {
            return new MarketProfileInfoDto[i];
        }
    }

    public MarketProfileInfoDto(MarketProfileInfoProfileDto marketProfileInfoProfileDto, MarketProfileInfoCreateButtonDto marketProfileInfoCreateButtonDto, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto2, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto3, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto4, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto5, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto6, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto7, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto8, MarketProfileInfoLocationDto marketProfileInfoLocationDto, Boolean bool, MarketMarketItemRatingDto marketMarketItemRatingDto, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto9) {
        this.profile = marketProfileInfoProfileDto;
        this.createButton = marketProfileInfoCreateButtonDto;
        this.bookmarksButton = marketProfileInfoSimpleButtonDto;
        this.ordersButton = marketProfileInfoSimpleButtonDto2;
        this.subscriptionsButton = marketProfileInfoSimpleButtonDto3;
        this.settingsButton = marketProfileInfoSimpleButtonDto4;
        this.classifiedsButton = marketProfileInfoSimpleButtonDto5;
        this.cartsButton = marketProfileInfoSimpleButtonDto6;
        this.wishlistButton = marketProfileInfoSimpleButtonDto7;
        this.classifiedsBookmarksButton = marketProfileInfoSimpleButtonDto8;
        this.location = marketProfileInfoLocationDto;
        this.locationConfirmRequired = bool;
        this.itemRating = marketMarketItemRatingDto;
        this.reviewsSection = marketProfileInfoSimpleButtonDto9;
    }

    public final MarketProfileInfoSimpleButtonDto d() {
        return this.bookmarksButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketProfileInfoSimpleButtonDto e() {
        return this.cartsButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProfileInfoDto)) {
            return false;
        }
        MarketProfileInfoDto marketProfileInfoDto = (MarketProfileInfoDto) obj;
        return epx.f(this.profile, marketProfileInfoDto.profile) && epx.f(this.createButton, marketProfileInfoDto.createButton) && epx.f(this.bookmarksButton, marketProfileInfoDto.bookmarksButton) && epx.f(this.ordersButton, marketProfileInfoDto.ordersButton) && epx.f(this.subscriptionsButton, marketProfileInfoDto.subscriptionsButton) && epx.f(this.settingsButton, marketProfileInfoDto.settingsButton) && epx.f(this.classifiedsButton, marketProfileInfoDto.classifiedsButton) && epx.f(this.cartsButton, marketProfileInfoDto.cartsButton) && epx.f(this.wishlistButton, marketProfileInfoDto.wishlistButton) && epx.f(this.classifiedsBookmarksButton, marketProfileInfoDto.classifiedsBookmarksButton) && epx.f(this.location, marketProfileInfoDto.location) && epx.f(this.locationConfirmRequired, marketProfileInfoDto.locationConfirmRequired) && epx.f(this.itemRating, marketProfileInfoDto.itemRating) && epx.f(this.reviewsSection, marketProfileInfoDto.reviewsSection);
    }

    public final MarketProfileInfoLocationDto f() {
        return this.location;
    }

    public final MarketProfileInfoSimpleButtonDto g() {
        return this.ordersButton;
    }

    public final int hashCode() {
        int hashCode = this.profile.hashCode() * 31;
        MarketProfileInfoCreateButtonDto marketProfileInfoCreateButtonDto = this.createButton;
        int hashCode2 = (hashCode + (marketProfileInfoCreateButtonDto == null ? 0 : marketProfileInfoCreateButtonDto.hashCode())) * 31;
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto = this.bookmarksButton;
        int hashCode3 = (hashCode2 + (marketProfileInfoSimpleButtonDto == null ? 0 : marketProfileInfoSimpleButtonDto.hashCode())) * 31;
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto2 = this.ordersButton;
        int hashCode4 = (hashCode3 + (marketProfileInfoSimpleButtonDto2 == null ? 0 : marketProfileInfoSimpleButtonDto2.hashCode())) * 31;
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto3 = this.subscriptionsButton;
        int hashCode5 = (hashCode4 + (marketProfileInfoSimpleButtonDto3 == null ? 0 : marketProfileInfoSimpleButtonDto3.hashCode())) * 31;
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto4 = this.settingsButton;
        int hashCode6 = (hashCode5 + (marketProfileInfoSimpleButtonDto4 == null ? 0 : marketProfileInfoSimpleButtonDto4.hashCode())) * 31;
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto5 = this.classifiedsButton;
        int hashCode7 = (hashCode6 + (marketProfileInfoSimpleButtonDto5 == null ? 0 : marketProfileInfoSimpleButtonDto5.hashCode())) * 31;
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto6 = this.cartsButton;
        int hashCode8 = (hashCode7 + (marketProfileInfoSimpleButtonDto6 == null ? 0 : marketProfileInfoSimpleButtonDto6.hashCode())) * 31;
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto7 = this.wishlistButton;
        int hashCode9 = (hashCode8 + (marketProfileInfoSimpleButtonDto7 == null ? 0 : marketProfileInfoSimpleButtonDto7.hashCode())) * 31;
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto8 = this.classifiedsBookmarksButton;
        int hashCode10 = (hashCode9 + (marketProfileInfoSimpleButtonDto8 == null ? 0 : marketProfileInfoSimpleButtonDto8.hashCode())) * 31;
        MarketProfileInfoLocationDto marketProfileInfoLocationDto = this.location;
        int hashCode11 = (hashCode10 + (marketProfileInfoLocationDto == null ? 0 : marketProfileInfoLocationDto.hashCode())) * 31;
        Boolean bool = this.locationConfirmRequired;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
        int hashCode13 = (hashCode12 + (marketMarketItemRatingDto == null ? 0 : marketMarketItemRatingDto.hashCode())) * 31;
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto9 = this.reviewsSection;
        return hashCode13 + (marketProfileInfoSimpleButtonDto9 != null ? marketProfileInfoSimpleButtonDto9.hashCode() : 0);
    }

    public final MarketProfileInfoProfileDto i() {
        return this.profile;
    }

    public final MarketProfileInfoSimpleButtonDto j() {
        return this.reviewsSection;
    }

    public final MarketProfileInfoSimpleButtonDto k() {
        return this.wishlistButton;
    }

    public final String toString() {
        return "MarketProfileInfoDto(profile=" + this.profile + ", createButton=" + this.createButton + ", bookmarksButton=" + this.bookmarksButton + ", ordersButton=" + this.ordersButton + ", subscriptionsButton=" + this.subscriptionsButton + ", settingsButton=" + this.settingsButton + ", classifiedsButton=" + this.classifiedsButton + ", cartsButton=" + this.cartsButton + ", wishlistButton=" + this.wishlistButton + ", classifiedsBookmarksButton=" + this.classifiedsBookmarksButton + ", location=" + this.location + ", locationConfirmRequired=" + this.locationConfirmRequired + ", itemRating=" + this.itemRating + ", reviewsSection=" + this.reviewsSection + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.profile.writeToParcel(parcel, i);
        MarketProfileInfoCreateButtonDto marketProfileInfoCreateButtonDto = this.createButton;
        if (marketProfileInfoCreateButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoCreateButtonDto.writeToParcel(parcel, i);
        }
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto = this.bookmarksButton;
        if (marketProfileInfoSimpleButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoSimpleButtonDto.writeToParcel(parcel, i);
        }
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto2 = this.ordersButton;
        if (marketProfileInfoSimpleButtonDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoSimpleButtonDto2.writeToParcel(parcel, i);
        }
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto3 = this.subscriptionsButton;
        if (marketProfileInfoSimpleButtonDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoSimpleButtonDto3.writeToParcel(parcel, i);
        }
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto4 = this.settingsButton;
        if (marketProfileInfoSimpleButtonDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoSimpleButtonDto4.writeToParcel(parcel, i);
        }
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto5 = this.classifiedsButton;
        if (marketProfileInfoSimpleButtonDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoSimpleButtonDto5.writeToParcel(parcel, i);
        }
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto6 = this.cartsButton;
        if (marketProfileInfoSimpleButtonDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoSimpleButtonDto6.writeToParcel(parcel, i);
        }
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto7 = this.wishlistButton;
        if (marketProfileInfoSimpleButtonDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoSimpleButtonDto7.writeToParcel(parcel, i);
        }
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto8 = this.classifiedsBookmarksButton;
        if (marketProfileInfoSimpleButtonDto8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoSimpleButtonDto8.writeToParcel(parcel, i);
        }
        MarketProfileInfoLocationDto marketProfileInfoLocationDto = this.location;
        if (marketProfileInfoLocationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoLocationDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.locationConfirmRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.itemRating, i);
        MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto9 = this.reviewsSection;
        if (marketProfileInfoSimpleButtonDto9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketProfileInfoSimpleButtonDto9.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketProfileInfoDto(MarketProfileInfoProfileDto marketProfileInfoProfileDto, MarketProfileInfoCreateButtonDto marketProfileInfoCreateButtonDto, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto2, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto3, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto4, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto5, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto6, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto7, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto8, MarketProfileInfoLocationDto marketProfileInfoLocationDto, Boolean bool, MarketMarketItemRatingDto marketMarketItemRatingDto, MarketProfileInfoSimpleButtonDto marketProfileInfoSimpleButtonDto9, int i, zcl zclVar) {
        this(marketProfileInfoProfileDto, (i & 2) != 0 ? null : marketProfileInfoCreateButtonDto, (i & 4) != 0 ? null : marketProfileInfoSimpleButtonDto, (i & 8) != 0 ? null : marketProfileInfoSimpleButtonDto2, (i & 16) != 0 ? null : marketProfileInfoSimpleButtonDto3, (i & 32) != 0 ? null : marketProfileInfoSimpleButtonDto4, (i & 64) != 0 ? null : marketProfileInfoSimpleButtonDto5, (i & 128) != 0 ? null : marketProfileInfoSimpleButtonDto6, (i & 256) != 0 ? null : marketProfileInfoSimpleButtonDto7, (i & 512) != 0 ? null : marketProfileInfoSimpleButtonDto8, (i & 1024) != 0 ? null : marketProfileInfoLocationDto, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : marketMarketItemRatingDto, (i & 8192) != 0 ? null : marketProfileInfoSimpleButtonDto9);
    }
}

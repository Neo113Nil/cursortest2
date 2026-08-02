package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ClassifiedsProfileInfoDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsProfileInfoDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsProfileInfoDto> CREATOR = new a();

    @pmi0("bookmarks_button")
    private final ClassifiedsProfileInfoSimpleButtonDto bookmarksButton;

    @pmi0("carts_button")
    private final ClassifiedsProfileInfoSimpleButtonDto cartsButton;

    @pmi0("classifieds_bookmarks_button")
    private final ClassifiedsProfileInfoSimpleButtonDto classifiedsBookmarksButton;

    @pmi0("classifieds_button")
    private final ClassifiedsProfileInfoSimpleButtonDto classifiedsButton;

    @pmi0("create_button")
    private final ClassifiedsProfileInfoCreateButtonDto createButton;

    @pmi0("item_rating")
    private final MarketMarketItemRatingDto itemRating;

    @pmi0("location")
    private final ClassifiedsProfileInfoLocationDto location;

    @pmi0("location_confirm_required")
    private final Boolean locationConfirmRequired;

    @pmi0("orders_button")
    private final ClassifiedsProfileInfoSimpleButtonDto ordersButton;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final ClassifiedsProfileInfoProfileDto profile;

    @pmi0("reviews_section")
    private final ClassifiedsProfileInfoSimpleButtonDto reviewsSection;

    @pmi0("settings_button")
    private final ClassifiedsProfileInfoSimpleButtonDto settingsButton;

    @pmi0("subscriptions_button")
    private final ClassifiedsProfileInfoSimpleButtonDto subscriptionsButton;

    @pmi0("wishlist_button")
    private final ClassifiedsProfileInfoSimpleButtonDto wishlistButton;

    /* compiled from: ClassifiedsProfileInfoDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsProfileInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ClassifiedsProfileInfoProfileDto createFromParcel = ClassifiedsProfileInfoProfileDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoCreateButtonDto createFromParcel2 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoCreateButtonDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoSimpleButtonDto createFromParcel3 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoSimpleButtonDto createFromParcel4 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoSimpleButtonDto createFromParcel5 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoSimpleButtonDto createFromParcel6 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoSimpleButtonDto createFromParcel7 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoSimpleButtonDto createFromParcel8 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoSimpleButtonDto createFromParcel9 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoSimpleButtonDto createFromParcel10 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel);
            ClassifiedsProfileInfoLocationDto createFromParcel11 = parcel.readInt() == 0 ? null : ClassifiedsProfileInfoLocationDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ClassifiedsProfileInfoDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, createFromParcel11, valueOf, (MarketMarketItemRatingDto) parcel.readParcelable(ClassifiedsProfileInfoDto.class.getClassLoader()), parcel.readInt() != 0 ? ClassifiedsProfileInfoSimpleButtonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoDto[] newArray(int i) {
            return new ClassifiedsProfileInfoDto[i];
        }
    }

    public ClassifiedsProfileInfoDto(ClassifiedsProfileInfoProfileDto classifiedsProfileInfoProfileDto, ClassifiedsProfileInfoCreateButtonDto classifiedsProfileInfoCreateButtonDto, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto2, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto3, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto4, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto5, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto6, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto7, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto8, ClassifiedsProfileInfoLocationDto classifiedsProfileInfoLocationDto, Boolean bool, MarketMarketItemRatingDto marketMarketItemRatingDto, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto9) {
        this.profile = classifiedsProfileInfoProfileDto;
        this.createButton = classifiedsProfileInfoCreateButtonDto;
        this.bookmarksButton = classifiedsProfileInfoSimpleButtonDto;
        this.ordersButton = classifiedsProfileInfoSimpleButtonDto2;
        this.subscriptionsButton = classifiedsProfileInfoSimpleButtonDto3;
        this.settingsButton = classifiedsProfileInfoSimpleButtonDto4;
        this.classifiedsButton = classifiedsProfileInfoSimpleButtonDto5;
        this.cartsButton = classifiedsProfileInfoSimpleButtonDto6;
        this.wishlistButton = classifiedsProfileInfoSimpleButtonDto7;
        this.classifiedsBookmarksButton = classifiedsProfileInfoSimpleButtonDto8;
        this.location = classifiedsProfileInfoLocationDto;
        this.locationConfirmRequired = bool;
        this.itemRating = marketMarketItemRatingDto;
        this.reviewsSection = classifiedsProfileInfoSimpleButtonDto9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsProfileInfoDto)) {
            return false;
        }
        ClassifiedsProfileInfoDto classifiedsProfileInfoDto = (ClassifiedsProfileInfoDto) obj;
        return epx.f(this.profile, classifiedsProfileInfoDto.profile) && epx.f(this.createButton, classifiedsProfileInfoDto.createButton) && epx.f(this.bookmarksButton, classifiedsProfileInfoDto.bookmarksButton) && epx.f(this.ordersButton, classifiedsProfileInfoDto.ordersButton) && epx.f(this.subscriptionsButton, classifiedsProfileInfoDto.subscriptionsButton) && epx.f(this.settingsButton, classifiedsProfileInfoDto.settingsButton) && epx.f(this.classifiedsButton, classifiedsProfileInfoDto.classifiedsButton) && epx.f(this.cartsButton, classifiedsProfileInfoDto.cartsButton) && epx.f(this.wishlistButton, classifiedsProfileInfoDto.wishlistButton) && epx.f(this.classifiedsBookmarksButton, classifiedsProfileInfoDto.classifiedsBookmarksButton) && epx.f(this.location, classifiedsProfileInfoDto.location) && epx.f(this.locationConfirmRequired, classifiedsProfileInfoDto.locationConfirmRequired) && epx.f(this.itemRating, classifiedsProfileInfoDto.itemRating) && epx.f(this.reviewsSection, classifiedsProfileInfoDto.reviewsSection);
    }

    public final int hashCode() {
        int hashCode = this.profile.hashCode() * 31;
        ClassifiedsProfileInfoCreateButtonDto classifiedsProfileInfoCreateButtonDto = this.createButton;
        int hashCode2 = (hashCode + (classifiedsProfileInfoCreateButtonDto == null ? 0 : classifiedsProfileInfoCreateButtonDto.hashCode())) * 31;
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto = this.bookmarksButton;
        int hashCode3 = (hashCode2 + (classifiedsProfileInfoSimpleButtonDto == null ? 0 : classifiedsProfileInfoSimpleButtonDto.hashCode())) * 31;
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto2 = this.ordersButton;
        int hashCode4 = (hashCode3 + (classifiedsProfileInfoSimpleButtonDto2 == null ? 0 : classifiedsProfileInfoSimpleButtonDto2.hashCode())) * 31;
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto3 = this.subscriptionsButton;
        int hashCode5 = (hashCode4 + (classifiedsProfileInfoSimpleButtonDto3 == null ? 0 : classifiedsProfileInfoSimpleButtonDto3.hashCode())) * 31;
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto4 = this.settingsButton;
        int hashCode6 = (hashCode5 + (classifiedsProfileInfoSimpleButtonDto4 == null ? 0 : classifiedsProfileInfoSimpleButtonDto4.hashCode())) * 31;
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto5 = this.classifiedsButton;
        int hashCode7 = (hashCode6 + (classifiedsProfileInfoSimpleButtonDto5 == null ? 0 : classifiedsProfileInfoSimpleButtonDto5.hashCode())) * 31;
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto6 = this.cartsButton;
        int hashCode8 = (hashCode7 + (classifiedsProfileInfoSimpleButtonDto6 == null ? 0 : classifiedsProfileInfoSimpleButtonDto6.hashCode())) * 31;
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto7 = this.wishlistButton;
        int hashCode9 = (hashCode8 + (classifiedsProfileInfoSimpleButtonDto7 == null ? 0 : classifiedsProfileInfoSimpleButtonDto7.hashCode())) * 31;
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto8 = this.classifiedsBookmarksButton;
        int hashCode10 = (hashCode9 + (classifiedsProfileInfoSimpleButtonDto8 == null ? 0 : classifiedsProfileInfoSimpleButtonDto8.hashCode())) * 31;
        ClassifiedsProfileInfoLocationDto classifiedsProfileInfoLocationDto = this.location;
        int hashCode11 = (hashCode10 + (classifiedsProfileInfoLocationDto == null ? 0 : classifiedsProfileInfoLocationDto.hashCode())) * 31;
        Boolean bool = this.locationConfirmRequired;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
        int hashCode13 = (hashCode12 + (marketMarketItemRatingDto == null ? 0 : marketMarketItemRatingDto.hashCode())) * 31;
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto9 = this.reviewsSection;
        return hashCode13 + (classifiedsProfileInfoSimpleButtonDto9 != null ? classifiedsProfileInfoSimpleButtonDto9.hashCode() : 0);
    }

    public final String toString() {
        return "ClassifiedsProfileInfoDto(profile=" + this.profile + ", createButton=" + this.createButton + ", bookmarksButton=" + this.bookmarksButton + ", ordersButton=" + this.ordersButton + ", subscriptionsButton=" + this.subscriptionsButton + ", settingsButton=" + this.settingsButton + ", classifiedsButton=" + this.classifiedsButton + ", cartsButton=" + this.cartsButton + ", wishlistButton=" + this.wishlistButton + ", classifiedsBookmarksButton=" + this.classifiedsBookmarksButton + ", location=" + this.location + ", locationConfirmRequired=" + this.locationConfirmRequired + ", itemRating=" + this.itemRating + ", reviewsSection=" + this.reviewsSection + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.profile.writeToParcel(parcel, i);
        ClassifiedsProfileInfoCreateButtonDto classifiedsProfileInfoCreateButtonDto = this.createButton;
        if (classifiedsProfileInfoCreateButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoCreateButtonDto.writeToParcel(parcel, i);
        }
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto = this.bookmarksButton;
        if (classifiedsProfileInfoSimpleButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoSimpleButtonDto.writeToParcel(parcel, i);
        }
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto2 = this.ordersButton;
        if (classifiedsProfileInfoSimpleButtonDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoSimpleButtonDto2.writeToParcel(parcel, i);
        }
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto3 = this.subscriptionsButton;
        if (classifiedsProfileInfoSimpleButtonDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoSimpleButtonDto3.writeToParcel(parcel, i);
        }
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto4 = this.settingsButton;
        if (classifiedsProfileInfoSimpleButtonDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoSimpleButtonDto4.writeToParcel(parcel, i);
        }
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto5 = this.classifiedsButton;
        if (classifiedsProfileInfoSimpleButtonDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoSimpleButtonDto5.writeToParcel(parcel, i);
        }
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto6 = this.cartsButton;
        if (classifiedsProfileInfoSimpleButtonDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoSimpleButtonDto6.writeToParcel(parcel, i);
        }
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto7 = this.wishlistButton;
        if (classifiedsProfileInfoSimpleButtonDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoSimpleButtonDto7.writeToParcel(parcel, i);
        }
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto8 = this.classifiedsBookmarksButton;
        if (classifiedsProfileInfoSimpleButtonDto8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoSimpleButtonDto8.writeToParcel(parcel, i);
        }
        ClassifiedsProfileInfoLocationDto classifiedsProfileInfoLocationDto = this.location;
        if (classifiedsProfileInfoLocationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoLocationDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.locationConfirmRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.itemRating, i);
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto9 = this.reviewsSection;
        if (classifiedsProfileInfoSimpleButtonDto9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsProfileInfoSimpleButtonDto9.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ClassifiedsProfileInfoDto(ClassifiedsProfileInfoProfileDto classifiedsProfileInfoProfileDto, ClassifiedsProfileInfoCreateButtonDto classifiedsProfileInfoCreateButtonDto, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto2, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto3, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto4, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto5, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto6, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto7, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto8, ClassifiedsProfileInfoLocationDto classifiedsProfileInfoLocationDto, Boolean bool, MarketMarketItemRatingDto marketMarketItemRatingDto, ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto9, int i, zcl zclVar) {
        this(classifiedsProfileInfoProfileDto, (i & 2) != 0 ? null : classifiedsProfileInfoCreateButtonDto, (i & 4) != 0 ? null : classifiedsProfileInfoSimpleButtonDto, (i & 8) != 0 ? null : classifiedsProfileInfoSimpleButtonDto2, (i & 16) != 0 ? null : classifiedsProfileInfoSimpleButtonDto3, (i & 32) != 0 ? null : classifiedsProfileInfoSimpleButtonDto4, (i & 64) != 0 ? null : classifiedsProfileInfoSimpleButtonDto5, (i & 128) != 0 ? null : classifiedsProfileInfoSimpleButtonDto6, (i & 256) != 0 ? null : classifiedsProfileInfoSimpleButtonDto7, (i & 512) != 0 ? null : classifiedsProfileInfoSimpleButtonDto8, (i & 1024) != 0 ? null : classifiedsProfileInfoLocationDto, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : marketMarketItemRatingDto, (i & 8192) != 0 ? null : classifiedsProfileInfoSimpleButtonDto9);
    }
}

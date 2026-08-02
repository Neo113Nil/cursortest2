package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;

/* compiled from: MarketOrderItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketOrderItemDto> CREATOR = new a();

    @pmi0("can_add_review")
    private final Boolean canAddReview;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final MarketMarketItemDto item;

    @pmi0("item_id")
    private final int itemId;

    @pmi0("item_seo_slug")
    private final String itemSeoSlug;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("quantity")
    private final int quantity;

    @pmi0("title")
    private final String title;

    @pmi0("variants")
    private final List<String> variants;

    /* compiled from: MarketOrderItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            UserId userId = (UserId) parcel.readParcelable(MarketOrderItemDto.class.getClassLoader());
            int readInt = parcel.readInt();
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MarketOrderItemDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) parcel.readParcelable(MarketOrderItemDto.class.getClassLoader());
            String readString = parcel.readString();
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(MarketOrderItemDto.class.getClassLoader());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketOrderItemDto(userId, readInt, marketPriceDto, readInt2, marketMarketItemDto, readString, photosPhotoDto, createStringArrayList, valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderItemDto[] newArray(int i) {
            return new MarketOrderItemDto[i];
        }
    }

    public MarketOrderItemDto(UserId userId, int i, MarketPriceDto marketPriceDto, int i2, MarketMarketItemDto marketMarketItemDto, String str, PhotosPhotoDto photosPhotoDto, List<String> list, Boolean bool, String str2) {
        this.ownerId = userId;
        this.itemId = i;
        this.price = marketPriceDto;
        this.quantity = i2;
        this.item = marketMarketItemDto;
        this.title = str;
        this.photo = photosPhotoDto;
        this.variants = list;
        this.canAddReview = bool;
        this.itemSeoSlug = str2;
    }

    public final Boolean d() {
        return this.canAddReview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketMarketItemDto e() {
        return this.item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderItemDto)) {
            return false;
        }
        MarketOrderItemDto marketOrderItemDto = (MarketOrderItemDto) obj;
        return epx.f(this.ownerId, marketOrderItemDto.ownerId) && this.itemId == marketOrderItemDto.itemId && epx.f(this.price, marketOrderItemDto.price) && this.quantity == marketOrderItemDto.quantity && epx.f(this.item, marketOrderItemDto.item) && epx.f(this.title, marketOrderItemDto.title) && epx.f(this.photo, marketOrderItemDto.photo) && epx.f(this.variants, marketOrderItemDto.variants) && epx.f(this.canAddReview, marketOrderItemDto.canAddReview) && epx.f(this.itemSeoSlug, marketOrderItemDto.itemSeoSlug);
    }

    public final int f() {
        return this.itemId;
    }

    public final PhotosPhotoDto g() {
        return this.photo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.item.hashCode() + shy.a(this.quantity, (this.price.hashCode() + shy.a(this.itemId, Long.hashCode(this.ownerId.b) * 31, 31)) * 31, 31)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode3 = (hashCode2 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<String> list = this.variants;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.canAddReview;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.itemSeoSlug;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final MarketPriceDto i() {
        return this.price;
    }

    public final int j() {
        return this.quantity;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketOrderItemDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", quantity=");
        sb.append(this.quantity);
        sb.append(", item=");
        sb.append(this.item);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", variants=");
        sb.append(this.variants);
        sb.append(", canAddReview=");
        sb.append(this.canAddReview);
        sb.append(", itemSeoSlug=");
        return ho8.a(sb, this.itemSeoSlug, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.itemId);
        parcel.writeParcelable(this.price, i);
        parcel.writeInt(this.quantity);
        parcel.writeParcelable(this.item, i);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.photo, i);
        parcel.writeStringList(this.variants);
        Boolean bool = this.canAddReview;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.itemSeoSlug);
    }

    public /* synthetic */ MarketOrderItemDto(UserId userId, int i, MarketPriceDto marketPriceDto, int i2, MarketMarketItemDto marketMarketItemDto, String str, PhotosPhotoDto photosPhotoDto, List list, Boolean bool, String str2, int i3, zcl zclVar) {
        this(userId, i, marketPriceDto, i2, marketMarketItemDto, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : photosPhotoDto, (i3 & 128) != 0 ? null : list, (i3 & 256) != 0 ? null : bool, (i3 & 512) != 0 ? null : str2);
    }
}

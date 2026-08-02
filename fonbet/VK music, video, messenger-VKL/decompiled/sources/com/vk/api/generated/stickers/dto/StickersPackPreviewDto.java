package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseStickerDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StickersPackPreviewDto.kt */
/* loaded from: classes15.dex */
public final class StickersPackPreviewDto implements Parcelable {
    public static final Parcelable.Creator<StickersPackPreviewDto> CREATOR = new a();

    @pmi0("author")
    private final String author;

    @pmi0("badge")
    private final StickersPackBadgeDto badge;

    @pmi0("can_gift")
    private final Boolean canGift;

    @pmi0("can_gift_to")
    private final Boolean canGiftTo;

    @pmi0("can_purchase")
    private final Boolean canPurchase;

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final StickersImageSetDto icon;

    @pmi0("id")
    private final int id;

    @pmi0("is_active")
    private final Boolean isActive;

    @pmi0("is_animated")
    private final Boolean isAnimated;

    @pmi0("is_popup")
    private final Boolean isPopup;

    @pmi0("is_purchased")
    private final Boolean isPurchased;

    @pmi0("is_style")
    private final Boolean isStyle;

    @pmi0("price")
    private final StickersOrderPriceDto price;

    @pmi0("stickers")
    private final List<BaseStickerDto> stickers;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("url")
    private final String url;

    @pmi0("wishlists_status")
    private final StickersWishlistsStatusDto wishlistsStatus;

    /* compiled from: StickersPackPreviewDto.kt */
    public static final class a implements Parcelable.Creator<StickersPackPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersPackPreviewDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            StickersImageSetDto createFromParcel = parcel.readInt() == 0 ? null : StickersImageSetDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(StickersPackPreviewDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            StickersOrderPriceDto createFromParcel2 = parcel.readInt() == 0 ? null : StickersOrderPriceDto.CREATOR.createFromParcel(parcel);
            StickersPackBadgeDto createFromParcel3 = parcel.readInt() == 0 ? null : StickersPackBadgeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z = false;
            ArrayList arrayList2 = arrayList;
            Boolean bool = valueOf;
            Boolean bool2 = valueOf2;
            Boolean bool3 = valueOf4;
            Boolean bool4 = valueOf5;
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf8 = Boolean.valueOf(z);
            }
            return new StickersPackPreviewDto(readInt, readString, readString2, readString3, readString4, createFromParcel, bool, bool2, arrayList2, valueOf3, bool3, createFromParcel2, createFromParcel3, bool4, valueOf6, valueOf7, readString5, valueOf8, parcel.readInt() == 0 ? null : StickersWishlistsStatusDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersPackPreviewDto[] newArray(int i) {
            return new StickersPackPreviewDto[i];
        }
    }

    public StickersPackPreviewDto(int i, String str, String str2, String str3, String str4, StickersImageSetDto stickersImageSetDto, Boolean bool, Boolean bool2, List<BaseStickerDto> list, Boolean bool3, Boolean bool4, StickersOrderPriceDto stickersOrderPriceDto, StickersPackBadgeDto stickersPackBadgeDto, Boolean bool5, Boolean bool6, Boolean bool7, String str5, Boolean bool8, StickersWishlistsStatusDto stickersWishlistsStatusDto) {
        this.id = i;
        this.title = str;
        this.url = str2;
        this.description = str3;
        this.author = str4;
        this.icon = stickersImageSetDto;
        this.isPurchased = bool;
        this.isActive = bool2;
        this.stickers = list;
        this.isAnimated = bool3;
        this.isStyle = bool4;
        this.price = stickersOrderPriceDto;
        this.badge = stickersPackBadgeDto;
        this.canPurchase = bool5;
        this.canGiftTo = bool6;
        this.canGift = bool7;
        this.trackCode = str5;
        this.isPopup = bool8;
        this.wishlistsStatus = stickersWishlistsStatusDto;
    }

    public final Boolean B() {
        return this.isStyle;
    }

    public final String d() {
        return this.author;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StickersPackBadgeDto e() {
        return this.badge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersPackPreviewDto)) {
            return false;
        }
        StickersPackPreviewDto stickersPackPreviewDto = (StickersPackPreviewDto) obj;
        return this.id == stickersPackPreviewDto.id && epx.f(this.title, stickersPackPreviewDto.title) && epx.f(this.url, stickersPackPreviewDto.url) && epx.f(this.description, stickersPackPreviewDto.description) && epx.f(this.author, stickersPackPreviewDto.author) && epx.f(this.icon, stickersPackPreviewDto.icon) && epx.f(this.isPurchased, stickersPackPreviewDto.isPurchased) && epx.f(this.isActive, stickersPackPreviewDto.isActive) && epx.f(this.stickers, stickersPackPreviewDto.stickers) && epx.f(this.isAnimated, stickersPackPreviewDto.isAnimated) && epx.f(this.isStyle, stickersPackPreviewDto.isStyle) && epx.f(this.price, stickersPackPreviewDto.price) && epx.f(this.badge, stickersPackPreviewDto.badge) && epx.f(this.canPurchase, stickersPackPreviewDto.canPurchase) && epx.f(this.canGiftTo, stickersPackPreviewDto.canGiftTo) && epx.f(this.canGift, stickersPackPreviewDto.canGift) && epx.f(this.trackCode, stickersPackPreviewDto.trackCode) && epx.f(this.isPopup, stickersPackPreviewDto.isPopup) && epx.f(this.wishlistsStatus, stickersPackPreviewDto.wishlistsStatus);
    }

    public final Boolean f() {
        return this.canGift;
    }

    public final Boolean g() {
        return this.canGiftTo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.url);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.author;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StickersImageSetDto stickersImageSetDto = this.icon;
        int hashCode3 = (hashCode2 + (stickersImageSetDto == null ? 0 : stickersImageSetDto.hashCode())) * 31;
        Boolean bool = this.isPurchased;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isActive;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<BaseStickerDto> list = this.stickers;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.isAnimated;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isStyle;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        StickersOrderPriceDto stickersOrderPriceDto = this.price;
        int hashCode9 = (hashCode8 + (stickersOrderPriceDto == null ? 0 : stickersOrderPriceDto.hashCode())) * 31;
        StickersPackBadgeDto stickersPackBadgeDto = this.badge;
        int hashCode10 = (hashCode9 + (stickersPackBadgeDto == null ? 0 : stickersPackBadgeDto.hashCode())) * 31;
        Boolean bool5 = this.canPurchase;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canGiftTo;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.canGift;
        int hashCode13 = (hashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str3 = this.trackCode;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool8 = this.isPopup;
        int hashCode15 = (hashCode14 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        StickersWishlistsStatusDto stickersWishlistsStatusDto = this.wishlistsStatus;
        return hashCode15 + (stickersWishlistsStatusDto != null ? stickersWishlistsStatusDto.hashCode() : 0);
    }

    public final Boolean i() {
        return this.canPurchase;
    }

    public final StickersImageSetDto j() {
        return this.icon;
    }

    public final StickersOrderPriceDto k() {
        return this.price;
    }

    public final List<BaseStickerDto> l() {
        return this.stickers;
    }

    public final Boolean n() {
        return this.isActive;
    }

    public final Boolean o() {
        return this.isAnimated;
    }

    public final Boolean p() {
        return this.isPopup;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "StickersPackPreviewDto(id=" + this.id + ", title=" + this.title + ", url=" + this.url + ", description=" + this.description + ", author=" + this.author + ", icon=" + this.icon + ", isPurchased=" + this.isPurchased + ", isActive=" + this.isActive + ", stickers=" + this.stickers + ", isAnimated=" + this.isAnimated + ", isStyle=" + this.isStyle + ", price=" + this.price + ", badge=" + this.badge + ", canPurchase=" + this.canPurchase + ", canGiftTo=" + this.canGiftTo + ", canGift=" + this.canGift + ", trackCode=" + this.trackCode + ", isPopup=" + this.isPopup + ", wishlistsStatus=" + this.wishlistsStatus + ')';
    }

    public final Boolean u() {
        return this.isPurchased;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.description);
        parcel.writeString(this.author);
        StickersImageSetDto stickersImageSetDto = this.icon;
        if (stickersImageSetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersImageSetDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isPurchased;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isActive;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<BaseStickerDto> list = this.stickers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool3 = this.isAnimated;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isStyle;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        StickersOrderPriceDto stickersOrderPriceDto = this.price;
        if (stickersOrderPriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersOrderPriceDto.writeToParcel(parcel, i);
        }
        StickersPackBadgeDto stickersPackBadgeDto = this.badge;
        if (stickersPackBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersPackBadgeDto.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.canPurchase;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.canGiftTo;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.canGift;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeString(this.trackCode);
        Boolean bool8 = this.isPopup;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        StickersWishlistsStatusDto stickersWishlistsStatusDto = this.wishlistsStatus;
        if (stickersWishlistsStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersWishlistsStatusDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StickersPackPreviewDto(int i, String str, String str2, String str3, String str4, StickersImageSetDto stickersImageSetDto, Boolean bool, Boolean bool2, List list, Boolean bool3, Boolean bool4, StickersOrderPriceDto stickersOrderPriceDto, StickersPackBadgeDto stickersPackBadgeDto, Boolean bool5, Boolean bool6, Boolean bool7, String str5, Boolean bool8, StickersWishlistsStatusDto stickersWishlistsStatusDto, int i2, zcl zclVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : stickersImageSetDto, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : list, (i2 & 512) != 0 ? null : bool3, (i2 & 1024) != 0 ? null : bool4, (i2 & 2048) != 0 ? null : stickersOrderPriceDto, (i2 & 4096) != 0 ? null : stickersPackBadgeDto, (i2 & 8192) != 0 ? null : bool5, (i2 & 16384) != 0 ? null : bool6, (32768 & i2) != 0 ? null : bool7, (65536 & i2) != 0 ? null : str5, (131072 & i2) != 0 ? null : bool8, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : stickersWishlistsStatusDto);
    }
}

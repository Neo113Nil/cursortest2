package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkProductStatusDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaItemDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaItemDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaItemDto> CREATOR = new a();

    @pmi0("author")
    private final ClassifiedsYoulaItemVkAuthorDto author;

    @pmi0("id")
    private final String id;

    @pmi0("is_antibaraholka_source")
    private final Boolean isAntibaraholkaSource;

    @pmi0("is_cringe")
    private final Boolean isCringe;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("on_click_options")
    private final ClassifiedsYoulaItemOnClickOptionsDto onClickOptions;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("status")
    private final BaseLinkProductStatusDto status;

    @pmi0("thumb")
    private final List<BaseImageDto> thumb;

    @pmi0("title")
    private final String title;

    @pmi0("youla_owner_name")
    private final String youlaOwnerName;

    @pmi0("youla_user_id")
    private final String youlaUserId;

    /* compiled from: ClassifiedsYoulaItemDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            Boolean valueOf2;
            Boolean valueOf3;
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(ClassifiedsYoulaItemDto.class.getClassLoader());
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(ClassifiedsYoulaItemDto.class.getClassLoader());
            ClassifiedsYoulaItemVkAuthorDto createFromParcel = parcel.readInt() == 0 ? null : ClassifiedsYoulaItemVkAuthorDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ClassifiedsYoulaItemOnClickOptionsDto createFromParcel2 = parcel.readInt() == 0 ? null : ClassifiedsYoulaItemOnClickOptionsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ClassifiedsYoulaItemDto.class, parcel, arrayList, i, 1);
                }
            }
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(ClassifiedsYoulaItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseLinkProductStatusDto baseLinkProductStatusDto = (BaseLinkProductStatusDto) parcel.readParcelable(ClassifiedsYoulaItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ClassifiedsYoulaItemDto(readString, userId, marketPriceDto, createFromParcel, readString2, readString3, readString4, createFromParcel2, valueOf, arrayList, photosPhotoDto, valueOf2, baseLinkProductStatusDto, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemDto[] newArray(int i) {
            return new ClassifiedsYoulaItemDto[i];
        }
    }

    public ClassifiedsYoulaItemDto(String str, UserId userId, MarketPriceDto marketPriceDto, ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto, String str2, String str3, String str4, ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto, Boolean bool, List<BaseImageDto> list, PhotosPhotoDto photosPhotoDto, Boolean bool2, BaseLinkProductStatusDto baseLinkProductStatusDto, Boolean bool3) {
        this.id = str;
        this.ownerId = userId;
        this.price = marketPriceDto;
        this.author = classifiedsYoulaItemVkAuthorDto;
        this.youlaOwnerName = str2;
        this.youlaUserId = str3;
        this.title = str4;
        this.onClickOptions = classifiedsYoulaItemOnClickOptionsDto;
        this.isFavorite = bool;
        this.thumb = list;
        this.photo = photosPhotoDto;
        this.isAntibaraholkaSource = bool2;
        this.status = baseLinkProductStatusDto;
        this.isCringe = bool3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemDto)) {
            return false;
        }
        ClassifiedsYoulaItemDto classifiedsYoulaItemDto = (ClassifiedsYoulaItemDto) obj;
        return epx.f(this.id, classifiedsYoulaItemDto.id) && epx.f(this.ownerId, classifiedsYoulaItemDto.ownerId) && epx.f(this.price, classifiedsYoulaItemDto.price) && epx.f(this.author, classifiedsYoulaItemDto.author) && epx.f(this.youlaOwnerName, classifiedsYoulaItemDto.youlaOwnerName) && epx.f(this.youlaUserId, classifiedsYoulaItemDto.youlaUserId) && epx.f(this.title, classifiedsYoulaItemDto.title) && epx.f(this.onClickOptions, classifiedsYoulaItemDto.onClickOptions) && epx.f(this.isFavorite, classifiedsYoulaItemDto.isFavorite) && epx.f(this.thumb, classifiedsYoulaItemDto.thumb) && epx.f(this.photo, classifiedsYoulaItemDto.photo) && epx.f(this.isAntibaraholkaSource, classifiedsYoulaItemDto.isAntibaraholkaSource) && this.status == classifiedsYoulaItemDto.status && epx.f(this.isCringe, classifiedsYoulaItemDto.isCringe);
    }

    public final int hashCode() {
        int hashCode = (this.price.hashCode() + bh10.a(this.id.hashCode() * 31, 31, this.ownerId.b)) * 31;
        ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto = this.author;
        int hashCode2 = (hashCode + (classifiedsYoulaItemVkAuthorDto == null ? 0 : classifiedsYoulaItemVkAuthorDto.hashCode())) * 31;
        String str = this.youlaOwnerName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.youlaUserId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto = this.onClickOptions;
        int hashCode6 = (hashCode5 + (classifiedsYoulaItemOnClickOptionsDto == null ? 0 : classifiedsYoulaItemOnClickOptionsDto.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BaseImageDto> list = this.thumb;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode9 = (hashCode8 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        Boolean bool2 = this.isAntibaraholkaSource;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BaseLinkProductStatusDto baseLinkProductStatusDto = this.status;
        int hashCode11 = (hashCode10 + (baseLinkProductStatusDto == null ? 0 : baseLinkProductStatusDto.hashCode())) * 31;
        Boolean bool3 = this.isCringe;
        return hashCode11 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", youlaOwnerName=");
        sb.append(this.youlaOwnerName);
        sb.append(", youlaUserId=");
        sb.append(this.youlaUserId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", onClickOptions=");
        sb.append(this.onClickOptions);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", thumb=");
        sb.append(this.thumb);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", isAntibaraholkaSource=");
        sb.append(this.isAntibaraholkaSource);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", isCringe=");
        return tn.a(sb, this.isCringe, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.price, i);
        ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto = this.author;
        if (classifiedsYoulaItemVkAuthorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsYoulaItemVkAuthorDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.youlaOwnerName);
        parcel.writeString(this.youlaUserId);
        parcel.writeString(this.title);
        ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto = this.onClickOptions;
        if (classifiedsYoulaItemOnClickOptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsYoulaItemOnClickOptionsDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<BaseImageDto> list = this.thumb;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.photo, i);
        Boolean bool2 = this.isAntibaraholkaSource;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.status, i);
        Boolean bool3 = this.isCringe;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ ClassifiedsYoulaItemDto(String str, UserId userId, MarketPriceDto marketPriceDto, ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto, String str2, String str3, String str4, ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto, Boolean bool, List list, PhotosPhotoDto photosPhotoDto, Boolean bool2, BaseLinkProductStatusDto baseLinkProductStatusDto, Boolean bool3, int i, zcl zclVar) {
        this(str, userId, marketPriceDto, (i & 8) != 0 ? null : classifiedsYoulaItemVkAuthorDto, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : classifiedsYoulaItemOnClickOptionsDto, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : photosPhotoDto, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : baseLinkProductStatusDto, (i & 8192) != 0 ? null : bool3);
    }
}

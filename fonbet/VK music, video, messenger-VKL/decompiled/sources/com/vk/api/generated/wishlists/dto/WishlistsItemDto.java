package com.vk.api.generated.wishlists.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WishlistsItemDto.kt */
/* loaded from: classes15.dex */
public final class WishlistsItemDto implements Parcelable {
    public static final Parcelable.Creator<WishlistsItemDto> CREATOR = new a();

    @pmi0("added_id")
    private final Integer addedId;

    @pmi0("collection_items_count")
    private final Integer collectionItemsCount;

    @pmi0("collection_photos")
    private final List<PhotosPhotoDto> collectionPhotos;

    @pmi0("comment")
    private final String comment;

    @pmi0("cover_photo")
    private final PhotosPhotoDto coverPhoto;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_participating")
    private final Boolean isParticipating;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0("object_id")
    private final Integer objectId;

    @pmi0("object_link")
    private final String objectLink;

    @pmi0("object_owner_id")
    private final Integer objectOwnerId;

    @pmi0("object_type")
    private final ObjectTypeDto objectType;

    @pmi0("participating_text")
    private final String participatingText;

    @pmi0("participating_users")
    private final List<WishlistsParticipatingUserDto> participatingUsers;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("title")
    private final String title;

    @pmi0("ugc_content_link")
    private final String ugcContentLink;

    @pmi0("user_id")
    private final UserId userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WishlistsItemDto.kt */
    public static final class ObjectTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectTypeDto[] $VALUES;

        @pmi0("collection")
        public static final ObjectTypeDto COLLECTION;
        public static final Parcelable.Creator<ObjectTypeDto> CREATOR;

        @pmi0("custom")
        public static final ObjectTypeDto CUSTOM;

        @pmi0("link")
        public static final ObjectTypeDto LINK;

        @pmi0("market")
        public static final ObjectTypeDto MARKET;

        @pmi0("stickers_pack")
        public static final ObjectTypeDto STICKERS_PACK;
        private final String value;

        /* compiled from: WishlistsItemDto.kt */
        public static final class a implements Parcelable.Creator<ObjectTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ObjectTypeDto createFromParcel(Parcel parcel) {
                return ObjectTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ObjectTypeDto[] newArray(int i) {
                return new ObjectTypeDto[i];
            }
        }

        static {
            ObjectTypeDto objectTypeDto = new ObjectTypeDto("LINK", 0, "link");
            LINK = objectTypeDto;
            ObjectTypeDto objectTypeDto2 = new ObjectTypeDto("COLLECTION", 1, "collection");
            COLLECTION = objectTypeDto2;
            ObjectTypeDto objectTypeDto3 = new ObjectTypeDto("MARKET", 2, "market");
            MARKET = objectTypeDto3;
            ObjectTypeDto objectTypeDto4 = new ObjectTypeDto("CUSTOM", 3, "custom");
            CUSTOM = objectTypeDto4;
            ObjectTypeDto objectTypeDto5 = new ObjectTypeDto("STICKERS_PACK", 4, "stickers_pack");
            STICKERS_PACK = objectTypeDto5;
            ObjectTypeDto[] objectTypeDtoArr = {objectTypeDto, objectTypeDto2, objectTypeDto3, objectTypeDto4, objectTypeDto5};
            $VALUES = objectTypeDtoArr;
            $ENTRIES = new asp(objectTypeDtoArr);
            CREATOR = new a();
        }

        private ObjectTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ObjectTypeDto valueOf(String str) {
            return (ObjectTypeDto) Enum.valueOf(ObjectTypeDto.class, str);
        }

        public static ObjectTypeDto[] values() {
            return (ObjectTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: WishlistsItemDto.kt */
    public static final class a implements Parcelable.Creator<WishlistsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final WishlistsItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean bool;
            ArrayList arrayList2;
            String str;
            ObjectTypeDto objectTypeDto;
            ObjectTypeDto createFromParcel = ObjectTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId = (UserId) parcel.readParcelable(WishlistsItemDto.class.getClassLoader());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            BaseLinkDto baseLinkDto = (BaseLinkDto) parcel.readParcelable(WishlistsItemDto.class.getClassLoader());
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(WishlistsItemDto.class.getClassLoader());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(WishlistsItemDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            String readString3 = parcel.readString();
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(WishlistsItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                bool = valueOf;
                arrayList2 = new ArrayList(readInt2);
                str = readString3;
                int i2 = 0;
                while (true) {
                    objectTypeDto = createFromParcel;
                    if (i2 == readInt2) {
                        break;
                    }
                    i2 = en.a(WishlistsParticipatingUserDto.CREATOR, parcel, arrayList2, i2, 1);
                    createFromParcel = objectTypeDto;
                    readString = readString;
                }
            } else {
                bool = valueOf;
                str = readString3;
                arrayList2 = null;
                objectTypeDto = createFromParcel;
            }
            return new WishlistsItemDto(objectTypeDto, readString, valueOf2, userId, valueOf3, valueOf4, readString2, baseLinkDto, photosPhotoDto, valueOf5, arrayList, str, marketPriceDto, bool, readString4, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final WishlistsItemDto[] newArray(int i) {
            return new WishlistsItemDto[i];
        }
    }

    public WishlistsItemDto(ObjectTypeDto objectTypeDto, String str, Integer num, UserId userId, Integer num2, Integer num3, String str2, BaseLinkDto baseLinkDto, PhotosPhotoDto photosPhotoDto, Integer num4, List<PhotosPhotoDto> list, String str3, MarketPriceDto marketPriceDto, Boolean bool, String str4, List<WishlistsParticipatingUserDto> list2, String str5, Integer num5) {
        this.objectType = objectTypeDto;
        this.title = str;
        this.id = num;
        this.userId = userId;
        this.objectId = num2;
        this.objectOwnerId = num3;
        this.objectLink = str2;
        this.link = baseLinkDto;
        this.coverPhoto = photosPhotoDto;
        this.collectionItemsCount = num4;
        this.collectionPhotos = list;
        this.comment = str3;
        this.price = marketPriceDto;
        this.isParticipating = bool;
        this.participatingText = str4;
        this.participatingUsers = list2;
        this.ugcContentLink = str5;
        this.addedId = num5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WishlistsItemDto)) {
            return false;
        }
        WishlistsItemDto wishlistsItemDto = (WishlistsItemDto) obj;
        return this.objectType == wishlistsItemDto.objectType && epx.f(this.title, wishlistsItemDto.title) && epx.f(this.id, wishlistsItemDto.id) && epx.f(this.userId, wishlistsItemDto.userId) && epx.f(this.objectId, wishlistsItemDto.objectId) && epx.f(this.objectOwnerId, wishlistsItemDto.objectOwnerId) && epx.f(this.objectLink, wishlistsItemDto.objectLink) && epx.f(this.link, wishlistsItemDto.link) && epx.f(this.coverPhoto, wishlistsItemDto.coverPhoto) && epx.f(this.collectionItemsCount, wishlistsItemDto.collectionItemsCount) && epx.f(this.collectionPhotos, wishlistsItemDto.collectionPhotos) && epx.f(this.comment, wishlistsItemDto.comment) && epx.f(this.price, wishlistsItemDto.price) && epx.f(this.isParticipating, wishlistsItemDto.isParticipating) && epx.f(this.participatingText, wishlistsItemDto.participatingText) && epx.f(this.participatingUsers, wishlistsItemDto.participatingUsers) && epx.f(this.ugcContentLink, wishlistsItemDto.ugcContentLink) && epx.f(this.addedId, wishlistsItemDto.addedId);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.objectType.hashCode() * 31, 31, this.title);
        Integer num = this.id;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num2 = this.objectId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.objectOwnerId;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.objectLink;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        int hashCode6 = (hashCode5 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.coverPhoto;
        int hashCode7 = (hashCode6 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        Integer num4 = this.collectionItemsCount;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<PhotosPhotoDto> list = this.collectionPhotos;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.comment;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.price;
        int hashCode11 = (hashCode10 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        Boolean bool = this.isParticipating;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.participatingText;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<WishlistsParticipatingUserDto> list2 = this.participatingUsers;
        int hashCode14 = (hashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.ugcContentLink;
        int hashCode15 = (hashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.addedId;
        return hashCode15 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WishlistsItemDto(objectType=");
        sb.append(this.objectType);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", objectId=");
        sb.append(this.objectId);
        sb.append(", objectOwnerId=");
        sb.append(this.objectOwnerId);
        sb.append(", objectLink=");
        sb.append(this.objectLink);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", coverPhoto=");
        sb.append(this.coverPhoto);
        sb.append(", collectionItemsCount=");
        sb.append(this.collectionItemsCount);
        sb.append(", collectionPhotos=");
        sb.append(this.collectionPhotos);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", isParticipating=");
        sb.append(this.isParticipating);
        sb.append(", participatingText=");
        sb.append(this.participatingText);
        sb.append(", participatingUsers=");
        sb.append(this.participatingUsers);
        sb.append(", ugcContentLink=");
        sb.append(this.ugcContentLink);
        sb.append(", addedId=");
        return uqi.b(sb, this.addedId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.objectType.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.userId, i);
        Integer num2 = this.objectId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.objectOwnerId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.objectLink);
        parcel.writeParcelable(this.link, i);
        parcel.writeParcelable(this.coverPhoto, i);
        Integer num4 = this.collectionItemsCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        List<PhotosPhotoDto> list = this.collectionPhotos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.comment);
        parcel.writeParcelable(this.price, i);
        Boolean bool = this.isParticipating;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.participatingText);
        List<WishlistsParticipatingUserDto> list2 = this.participatingUsers;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((WishlistsParticipatingUserDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.ugcContentLink);
        Integer num5 = this.addedId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
    }

    public /* synthetic */ WishlistsItemDto(ObjectTypeDto objectTypeDto, String str, Integer num, UserId userId, Integer num2, Integer num3, String str2, BaseLinkDto baseLinkDto, PhotosPhotoDto photosPhotoDto, Integer num4, List list, String str3, MarketPriceDto marketPriceDto, Boolean bool, String str4, List list2, String str5, Integer num5, int i, zcl zclVar) {
        this(objectTypeDto, str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : baseLinkDto, (i & 256) != 0 ? null : photosPhotoDto, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : marketPriceDto, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? null : str4, (32768 & i) != 0 ? null : list2, (65536 & i) != 0 ? null : str5, (i & 131072) != 0 ? null : num5);
    }
}

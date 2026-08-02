package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketMarketAlbumDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketAlbumDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketAlbumDto> CREATOR = new a();

    @pmi0("all_item_ids")
    private final List<Integer> allItemIds;

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final int id;

    @pmi0("is_blur_enabled")
    private final Boolean isBlurEnabled;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("is_main")
    private final Boolean isMain;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("updated_time")
    private final int updatedTime;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketMarketAlbumDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("0")
        public static final TypeDto MARKET;

        @pmi0("1")
        public static final TypeDto MARKET_SERVICES;
        private final int value;

        /* compiled from: MarketMarketAlbumDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("MARKET", 0, 0);
            MARKET = typeDto;
            TypeDto typeDto2 = new TypeDto("MARKET_SERVICES", 1, 1);
            MARKET_SERVICES = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MarketMarketAlbumDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketAlbumDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketAlbumDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(MarketMarketAlbumDto.class.getClassLoader());
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int i = 0;
            ArrayList arrayList = null;
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
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(MarketMarketAlbumDto.class.getClassLoader());
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketMarketAlbumDto(readInt, userId, readString, readInt2, readInt3, valueOf, valueOf2, photosPhotoDto, createFromParcel, valueOf3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketAlbumDto[] newArray(int i) {
            return new MarketMarketAlbumDto[i];
        }
    }

    public MarketMarketAlbumDto(int i, UserId userId, String str, int i2, int i3, Boolean bool, Boolean bool2, PhotosPhotoDto photosPhotoDto, TypeDto typeDto, Boolean bool3, List<Integer> list) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.count = i2;
        this.updatedTime = i3;
        this.isMain = bool;
        this.isHidden = bool2;
        this.photo = photosPhotoDto;
        this.type = typeDto;
        this.isBlurEnabled = bool3;
        this.allItemIds = list;
    }

    public final List<Integer> d() {
        return this.allItemIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PhotosPhotoDto e() {
        return this.photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketAlbumDto)) {
            return false;
        }
        MarketMarketAlbumDto marketMarketAlbumDto = (MarketMarketAlbumDto) obj;
        return this.id == marketMarketAlbumDto.id && epx.f(this.ownerId, marketMarketAlbumDto.ownerId) && epx.f(this.title, marketMarketAlbumDto.title) && this.count == marketMarketAlbumDto.count && this.updatedTime == marketMarketAlbumDto.updatedTime && epx.f(this.isMain, marketMarketAlbumDto.isMain) && epx.f(this.isHidden, marketMarketAlbumDto.isHidden) && epx.f(this.photo, marketMarketAlbumDto.photo) && this.type == marketMarketAlbumDto.type && epx.f(this.isBlurEnabled, marketMarketAlbumDto.isBlurEnabled) && epx.f(this.allItemIds, marketMarketAlbumDto.allItemIds);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int g() {
        return this.updatedTime;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.updatedTime, shy.a(this.count, urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title), 31), 31);
        Boolean bool = this.isMain;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isHidden;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode3 = (hashCode2 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode4 = (hashCode3 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        Boolean bool3 = this.isBlurEnabled;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<Integer> list = this.allItemIds;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isHidden;
    }

    public final Boolean j() {
        return this.isMain;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketAlbumDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", updatedTime=");
        sb.append(this.updatedTime);
        sb.append(", isMain=");
        sb.append(this.isMain);
        sb.append(", isHidden=");
        sb.append(this.isHidden);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", isBlurEnabled=");
        sb.append(this.isBlurEnabled);
        sb.append(", allItemIds=");
        return ms9.a(')', sb, this.allItemIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeInt(this.count);
        parcel.writeInt(this.updatedTime);
        Boolean bool = this.isMain;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.photo, i);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isBlurEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        List<Integer> list = this.allItemIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ MarketMarketAlbumDto(int i, UserId userId, String str, int i2, int i3, Boolean bool, Boolean bool2, PhotosPhotoDto photosPhotoDto, TypeDto typeDto, Boolean bool3, List list, int i4, zcl zclVar) {
        this(i, userId, str, i2, i3, (i4 & 32) != 0 ? null : bool, (i4 & 64) != 0 ? null : bool2, (i4 & 128) != 0 ? null : photosPhotoDto, (i4 & 256) != 0 ? null : typeDto, (i4 & 512) != 0 ? null : bool3, (i4 & 1024) != 0 ? null : list);
    }
}

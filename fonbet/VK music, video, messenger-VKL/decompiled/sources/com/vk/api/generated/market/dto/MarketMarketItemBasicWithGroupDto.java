package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
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
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketMarketItemBasicWithGroupDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketItemBasicWithGroupDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketItemBasicWithGroupDto> CREATOR = new a();

    @pmi0("csrf_hash")
    private final String csrfHash;

    @pmi0("group_link")
    private final String groupLink;

    @pmi0("group_name")
    private final String groupName;

    @pmi0("id")
    private final int id;

    @pmi0("is_adult")
    private final Boolean isAdult;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_group_verified")
    private final Boolean isGroupVerified;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("thumb")
    private final List<BaseImageDto> thumb;

    @pmi0("thumb_photo")
    private final String thumbPhoto;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketMarketItemBasicWithGroupDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketItemBasicWithGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemBasicWithGroupDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            Boolean valueOf4;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(MarketMarketItemBasicWithGroupDto.class.getClassLoader());
            String readString = parcel.readString();
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MarketMarketItemBasicWithGroupDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(MarketMarketItemBasicWithGroupDto.class, parcel, arrayList, i, 1);
                }
            }
            boolean z = false;
            String readString4 = parcel.readString();
            Boolean bool = valueOf2;
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf4 = Boolean.valueOf(z);
            }
            return new MarketMarketItemBasicWithGroupDto(readInt, userId, readString, marketPriceDto, valueOf, readString2, readString3, bool, valueOf3, arrayList, readString4, readString5, valueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemBasicWithGroupDto[] newArray(int i) {
            return new MarketMarketItemBasicWithGroupDto[i];
        }
    }

    public MarketMarketItemBasicWithGroupDto(int i, UserId userId, String str, MarketPriceDto marketPriceDto, Boolean bool, String str2, String str3, Boolean bool2, Boolean bool3, List<BaseImageDto> list, String str4, String str5, Boolean bool4) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.price = marketPriceDto;
        this.isGroupVerified = bool;
        this.groupName = str2;
        this.groupLink = str3;
        this.isOwner = bool2;
        this.isAdult = bool3;
        this.thumb = list;
        this.thumbPhoto = str4;
        this.csrfHash = str5;
        this.isFavorite = bool4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItemBasicWithGroupDto)) {
            return false;
        }
        MarketMarketItemBasicWithGroupDto marketMarketItemBasicWithGroupDto = (MarketMarketItemBasicWithGroupDto) obj;
        return this.id == marketMarketItemBasicWithGroupDto.id && epx.f(this.ownerId, marketMarketItemBasicWithGroupDto.ownerId) && epx.f(this.title, marketMarketItemBasicWithGroupDto.title) && epx.f(this.price, marketMarketItemBasicWithGroupDto.price) && epx.f(this.isGroupVerified, marketMarketItemBasicWithGroupDto.isGroupVerified) && epx.f(this.groupName, marketMarketItemBasicWithGroupDto.groupName) && epx.f(this.groupLink, marketMarketItemBasicWithGroupDto.groupLink) && epx.f(this.isOwner, marketMarketItemBasicWithGroupDto.isOwner) && epx.f(this.isAdult, marketMarketItemBasicWithGroupDto.isAdult) && epx.f(this.thumb, marketMarketItemBasicWithGroupDto.thumb) && epx.f(this.thumbPhoto, marketMarketItemBasicWithGroupDto.thumbPhoto) && epx.f(this.csrfHash, marketMarketItemBasicWithGroupDto.csrfHash) && epx.f(this.isFavorite, marketMarketItemBasicWithGroupDto.isFavorite);
    }

    public final int hashCode() {
        int hashCode = (this.price.hashCode() + urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title)) * 31;
        Boolean bool = this.isGroupVerified;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.groupName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupLink;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.isOwner;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAdult;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<BaseImageDto> list = this.thumb;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.thumbPhoto;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.csrfHash;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool4 = this.isFavorite;
        return hashCode9 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketItemBasicWithGroupDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", isGroupVerified=");
        sb.append(this.isGroupVerified);
        sb.append(", groupName=");
        sb.append(this.groupName);
        sb.append(", groupLink=");
        sb.append(this.groupLink);
        sb.append(", isOwner=");
        sb.append(this.isOwner);
        sb.append(", isAdult=");
        sb.append(this.isAdult);
        sb.append(", thumb=");
        sb.append(this.thumb);
        sb.append(", thumbPhoto=");
        sb.append(this.thumbPhoto);
        sb.append(", csrfHash=");
        sb.append(this.csrfHash);
        sb.append(", isFavorite=");
        return tn.a(sb, this.isFavorite, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.price, i);
        Boolean bool = this.isGroupVerified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.groupName);
        parcel.writeString(this.groupLink);
        Boolean bool2 = this.isOwner;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isAdult;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
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
        parcel.writeString(this.thumbPhoto);
        parcel.writeString(this.csrfHash);
        Boolean bool4 = this.isFavorite;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
    }

    public /* synthetic */ MarketMarketItemBasicWithGroupDto(int i, UserId userId, String str, MarketPriceDto marketPriceDto, Boolean bool, String str2, String str3, Boolean bool2, Boolean bool3, List list, String str4, String str5, Boolean bool4, int i2, zcl zclVar) {
        this(i, userId, str, marketPriceDto, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : bool3, (i2 & 512) != 0 ? null : list, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? null : bool4);
    }
}

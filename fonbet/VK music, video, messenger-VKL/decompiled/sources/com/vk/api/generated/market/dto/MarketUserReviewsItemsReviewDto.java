package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketUserReviewsItemsReviewDto.kt */
/* loaded from: classes15.dex */
public final class MarketUserReviewsItemsReviewDto implements Parcelable {
    public static final Parcelable.Creator<MarketUserReviewsItemsReviewDto> CREATOR = new a();

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_update")
    private final Boolean canUpdate;

    @pmi0("comment")
    private final String comment;

    @pmi0("cons")
    private final String cons;

    @pmi0("date")
    private final int date;

    @pmi0("id")
    private final int id;

    @pmi0("img")
    private final BaseImageDto img;

    @pmi0("item_id")
    private final int itemId;

    @pmi0("item_seo_slug")
    private final String itemSeoSlug;

    @pmi0("item_status")
    private final Integer itemStatus;

    @pmi0("name")
    private final String name;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("pros")
    private final String pros;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final int rating;

    @pmi0("status")
    private final int status;

    @pmi0("status_text")
    private final String statusText;

    @pmi0("thumb")
    private final List<List<BaseImageDto>> thumb;

    @pmi0("user")
    private final UsersUserDto user;

    /* compiled from: MarketUserReviewsItemsReviewDto.kt */
    public static final class a implements Parcelable.Creator<MarketUserReviewsItemsReviewDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsItemsReviewDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            int i;
            String str;
            ArrayList arrayList;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            UsersUserDto usersUserDto = (UsersUserDto) parcel.readParcelable(MarketUserReviewsItemsReviewDto.class.getClassLoader());
            UserId userId = (UserId) parcel.readParcelable(MarketUserReviewsItemsReviewDto.class.getClassLoader());
            BaseImageDto baseImageDto = (BaseImageDto) parcel.readParcelable(MarketUserReviewsItemsReviewDto.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
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
                i = readInt;
                str = readString2;
                arrayList = null;
            } else {
                int readInt6 = parcel.readInt();
                i = readInt;
                ArrayList arrayList2 = new ArrayList(readInt6);
                str = readString2;
                int i2 = 0;
                while (i2 != readInt6) {
                    int i3 = readInt6;
                    int readInt7 = parcel.readInt();
                    int i4 = i2;
                    ArrayList arrayList3 = new ArrayList(readInt7);
                    int i5 = readInt2;
                    int i6 = 0;
                    while (i6 != readInt7) {
                        i6 = bo.b(MarketUserReviewsItemsReviewDto.class, parcel, arrayList3, i6, 1);
                        readInt7 = readInt7;
                    }
                    arrayList2.add(arrayList3);
                    i2 = i4 + 1;
                    readInt6 = i3;
                    readInt2 = i5;
                }
                arrayList = arrayList2;
            }
            return new MarketUserReviewsItemsReviewDto(readString, i, str, readInt2, readInt3, readInt4, readInt5, usersUserDto, userId, baseImageDto, readString3, readString4, readString5, valueOf, valueOf2, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsItemsReviewDto[] newArray(int i) {
            return new MarketUserReviewsItemsReviewDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketUserReviewsItemsReviewDto(String str, int i, String str2, int i2, int i3, int i4, int i5, UsersUserDto usersUserDto, UserId userId, BaseImageDto baseImageDto, String str3, String str4, String str5, Boolean bool, Boolean bool2, List<? extends List<BaseImageDto>> list, Integer num, String str6) {
        this.name = str;
        this.status = i;
        this.statusText = str2;
        this.id = i2;
        this.itemId = i3;
        this.rating = i4;
        this.date = i5;
        this.user = usersUserDto;
        this.ownerId = userId;
        this.img = baseImageDto;
        this.pros = str3;
        this.cons = str4;
        this.comment = str5;
        this.canUpdate = bool;
        this.canDelete = bool2;
        this.thumb = list;
        this.itemStatus = num;
        this.itemSeoSlug = str6;
    }

    public final String B() {
        return this.statusText;
    }

    public final List<List<BaseImageDto>> C() {
        return this.thumb;
    }

    public final UsersUserDto D() {
        return this.user;
    }

    public final Boolean d() {
        return this.canDelete;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketUserReviewsItemsReviewDto)) {
            return false;
        }
        MarketUserReviewsItemsReviewDto marketUserReviewsItemsReviewDto = (MarketUserReviewsItemsReviewDto) obj;
        return epx.f(this.name, marketUserReviewsItemsReviewDto.name) && this.status == marketUserReviewsItemsReviewDto.status && epx.f(this.statusText, marketUserReviewsItemsReviewDto.statusText) && this.id == marketUserReviewsItemsReviewDto.id && this.itemId == marketUserReviewsItemsReviewDto.itemId && this.rating == marketUserReviewsItemsReviewDto.rating && this.date == marketUserReviewsItemsReviewDto.date && epx.f(this.user, marketUserReviewsItemsReviewDto.user) && epx.f(this.ownerId, marketUserReviewsItemsReviewDto.ownerId) && epx.f(this.img, marketUserReviewsItemsReviewDto.img) && epx.f(this.pros, marketUserReviewsItemsReviewDto.pros) && epx.f(this.cons, marketUserReviewsItemsReviewDto.cons) && epx.f(this.comment, marketUserReviewsItemsReviewDto.comment) && epx.f(this.canUpdate, marketUserReviewsItemsReviewDto.canUpdate) && epx.f(this.canDelete, marketUserReviewsItemsReviewDto.canDelete) && epx.f(this.thumb, marketUserReviewsItemsReviewDto.thumb) && epx.f(this.itemStatus, marketUserReviewsItemsReviewDto.itemStatus) && epx.f(this.itemSeoSlug, marketUserReviewsItemsReviewDto.itemSeoSlug);
    }

    public final String f() {
        return this.comment;
    }

    public final String g() {
        return this.cons;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.user.hashCode() + shy.a(this.date, shy.a(this.rating, shy.a(this.itemId, shy.a(this.id, urd0.a(shy.a(this.status, this.name.hashCode() * 31, 31), 31, this.statusText), 31), 31), 31), 31)) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        BaseImageDto baseImageDto = this.img;
        int hashCode3 = (hashCode2 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        String str = this.pros;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cons;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.comment;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canUpdate;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canDelete;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.thumb;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.itemStatus;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.itemSeoSlug;
        return hashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final int i() {
        return this.date;
    }

    public final BaseImageDto j() {
        return this.img;
    }

    public final int k() {
        return this.itemId;
    }

    public final Integer l() {
        return this.itemStatus;
    }

    public final String n() {
        return this.name;
    }

    public final String o() {
        return this.pros;
    }

    public final int p() {
        return this.rating;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketUserReviewsItemsReviewDto(name=");
        sb.append(this.name);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", statusText=");
        sb.append(this.statusText);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", img=");
        sb.append(this.img);
        sb.append(", pros=");
        sb.append(this.pros);
        sb.append(", cons=");
        sb.append(this.cons);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", canUpdate=");
        sb.append(this.canUpdate);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", thumb=");
        sb.append(this.thumb);
        sb.append(", itemStatus=");
        sb.append(this.itemStatus);
        sb.append(", itemSeoSlug=");
        return ho8.a(sb, this.itemSeoSlug, ')');
    }

    public final int u() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.status);
        parcel.writeString(this.statusText);
        parcel.writeInt(this.id);
        parcel.writeInt(this.itemId);
        parcel.writeInt(this.rating);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.user, i);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.img, i);
        parcel.writeString(this.pros);
        parcel.writeString(this.cons);
        parcel.writeString(this.comment);
        Boolean bool = this.canUpdate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canDelete;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<List<BaseImageDto>> list = this.thumb;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }
        Integer num = this.itemStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.itemSeoSlug);
    }

    public /* synthetic */ MarketUserReviewsItemsReviewDto(String str, int i, String str2, int i2, int i3, int i4, int i5, UsersUserDto usersUserDto, UserId userId, BaseImageDto baseImageDto, String str3, String str4, String str5, Boolean bool, Boolean bool2, List list, Integer num, String str6, int i6, zcl zclVar) {
        this(str, i, str2, i2, i3, i4, i5, usersUserDto, (i6 & 256) != 0 ? null : userId, (i6 & 512) != 0 ? null : baseImageDto, (i6 & 1024) != 0 ? null : str3, (i6 & 2048) != 0 ? null : str4, (i6 & 4096) != 0 ? null : str5, (i6 & 8192) != 0 ? null : bool, (i6 & 16384) != 0 ? null : bool2, (32768 & i6) != 0 ? null : list, (65536 & i6) != 0 ? null : num, (i6 & 131072) != 0 ? null : str6);
    }
}

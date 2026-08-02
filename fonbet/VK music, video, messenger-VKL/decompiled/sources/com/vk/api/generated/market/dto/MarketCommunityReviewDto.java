package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCommunityReviewDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityReviewDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityReviewDto> CREATOR = new a();

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_pin")
    private final Boolean canPin;

    @pmi0("can_update")
    private final Boolean canUpdate;

    @pmi0("comment")
    private final String comment;

    @pmi0("comments")
    private final MarketReviewCommentsDto comments;

    @pmi0("community_id")
    private final UserId communityId;

    @pmi0("date")
    private final int date;

    @pmi0("id")
    private final int id;

    @pmi0("img")
    private final BaseImageDto img;

    @pmi0("is_friend")
    private final Boolean isFriend;

    @pmi0("is_pinned")
    private final Boolean isPinned;

    @pmi0("likes")
    private final BaseLikesDto likes;

    @pmi0("mark")
    private final int mark;

    @pmi0("name")
    private final String name;

    @pmi0("source_type")
    private final Integer sourceType;

    @pmi0("status")
    private final int status;

    @pmi0("status_text")
    private final String statusText;

    @pmi0("thumb")
    private final List<List<BaseImageDto>> thumb;

    @pmi0("user")
    private final UsersUserDto user;

    /* compiled from: MarketCommunityReviewDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityReviewDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityReviewDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            int i;
            ArrayList arrayList;
            int i2;
            Boolean valueOf5;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(MarketCommunityReviewDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            UsersUserDto usersUserDto = (UsersUserDto) parcel.readParcelable(MarketCommunityReviewDto.class.getClassLoader());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
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
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseLikesDto baseLikesDto = (BaseLikesDto) parcel.readParcelable(MarketCommunityReviewDto.class.getClassLoader());
            BaseImageDto baseImageDto = (BaseImageDto) parcel.readParcelable(MarketCommunityReviewDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                i = readInt;
                i2 = readInt2;
                arrayList = null;
            } else {
                int readInt5 = parcel.readInt();
                i = readInt;
                arrayList = new ArrayList(readInt5);
                i2 = readInt2;
                int i3 = 0;
                while (i3 != readInt5) {
                    int i4 = i3;
                    int readInt6 = parcel.readInt();
                    String str = readString;
                    ArrayList arrayList2 = new ArrayList(readInt6);
                    int i5 = readInt3;
                    int i6 = 0;
                    while (i6 != readInt6) {
                        i6 = bo.b(MarketCommunityReviewDto.class, parcel, arrayList2, i6, 1);
                        readInt6 = readInt6;
                    }
                    arrayList.add(arrayList2);
                    i3 = i4 + 1;
                    readString = str;
                    readInt3 = i5;
                }
            }
            String str2 = readString;
            int i7 = readInt3;
            MarketReviewCommentsDto createFromParcel = parcel.readInt() == 0 ? null : MarketReviewCommentsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketCommunityReviewDto(i, userId, i2, str2, i7, readInt4, usersUserDto, valueOf6, readString2, readString3, valueOf, valueOf2, valueOf3, valueOf4, baseLikesDto, baseImageDto, arrayList, createFromParcel, valueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityReviewDto[] newArray(int i) {
            return new MarketCommunityReviewDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketCommunityReviewDto(int i, UserId userId, int i2, String str, int i3, int i4, UsersUserDto usersUserDto, Integer num, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, BaseLikesDto baseLikesDto, BaseImageDto baseImageDto, List<? extends List<BaseImageDto>> list, MarketReviewCommentsDto marketReviewCommentsDto, Boolean bool5) {
        this.id = i;
        this.communityId = userId;
        this.status = i2;
        this.statusText = str;
        this.mark = i3;
        this.date = i4;
        this.user = usersUserDto;
        this.sourceType = num;
        this.name = str2;
        this.comment = str3;
        this.canDelete = bool;
        this.isPinned = bool2;
        this.canPin = bool3;
        this.canUpdate = bool4;
        this.likes = baseLikesDto;
        this.img = baseImageDto;
        this.thumb = list;
        this.comments = marketReviewCommentsDto;
        this.isFriend = bool5;
    }

    public final Boolean Q() {
        return this.isPinned;
    }

    public final Boolean d() {
        return this.canDelete;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canPin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCommunityReviewDto)) {
            return false;
        }
        MarketCommunityReviewDto marketCommunityReviewDto = (MarketCommunityReviewDto) obj;
        return this.id == marketCommunityReviewDto.id && epx.f(this.communityId, marketCommunityReviewDto.communityId) && this.status == marketCommunityReviewDto.status && epx.f(this.statusText, marketCommunityReviewDto.statusText) && this.mark == marketCommunityReviewDto.mark && this.date == marketCommunityReviewDto.date && epx.f(this.user, marketCommunityReviewDto.user) && epx.f(this.sourceType, marketCommunityReviewDto.sourceType) && epx.f(this.name, marketCommunityReviewDto.name) && epx.f(this.comment, marketCommunityReviewDto.comment) && epx.f(this.canDelete, marketCommunityReviewDto.canDelete) && epx.f(this.isPinned, marketCommunityReviewDto.isPinned) && epx.f(this.canPin, marketCommunityReviewDto.canPin) && epx.f(this.canUpdate, marketCommunityReviewDto.canUpdate) && epx.f(this.likes, marketCommunityReviewDto.likes) && epx.f(this.img, marketCommunityReviewDto.img) && epx.f(this.thumb, marketCommunityReviewDto.thumb) && epx.f(this.comments, marketCommunityReviewDto.comments) && epx.f(this.isFriend, marketCommunityReviewDto.isFriend);
    }

    public final Boolean f() {
        return this.canUpdate;
    }

    public final String g() {
        return this.comment;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.user.hashCode() + shy.a(this.date, shy.a(this.mark, urd0.a(shy.a(this.status, bh10.a(Integer.hashCode(this.id) * 31, 31, this.communityId.b), 31), 31, this.statusText), 31), 31)) * 31;
        Integer num = this.sourceType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.comment;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.canDelete;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPinned;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canPin;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canUpdate;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        BaseLikesDto baseLikesDto = this.likes;
        int hashCode9 = (hashCode8 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
        BaseImageDto baseImageDto = this.img;
        int hashCode10 = (hashCode9 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.thumb;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        MarketReviewCommentsDto marketReviewCommentsDto = this.comments;
        int hashCode12 = (hashCode11 + (marketReviewCommentsDto == null ? 0 : marketReviewCommentsDto.hashCode())) * 31;
        Boolean bool5 = this.isFriend;
        return hashCode12 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final MarketReviewCommentsDto i() {
        return this.comments;
    }

    public final int j() {
        return this.date;
    }

    public final BaseLikesDto k() {
        return this.likes;
    }

    public final int l() {
        return this.mark;
    }

    public final Integer n() {
        return this.sourceType;
    }

    public final List<List<BaseImageDto>> o() {
        return this.thumb;
    }

    public final UsersUserDto p() {
        return this.user;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCommunityReviewDto(id=");
        sb.append(this.id);
        sb.append(", communityId=");
        sb.append(this.communityId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", statusText=");
        sb.append(this.statusText);
        sb.append(", mark=");
        sb.append(this.mark);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", sourceType=");
        sb.append(this.sourceType);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", isPinned=");
        sb.append(this.isPinned);
        sb.append(", canPin=");
        sb.append(this.canPin);
        sb.append(", canUpdate=");
        sb.append(this.canUpdate);
        sb.append(", likes=");
        sb.append(this.likes);
        sb.append(", img=");
        sb.append(this.img);
        sb.append(", thumb=");
        sb.append(this.thumb);
        sb.append(", comments=");
        sb.append(this.comments);
        sb.append(", isFriend=");
        return tn.a(sb, this.isFriend, ')');
    }

    public final Boolean u() {
        return this.isFriend;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.communityId, i);
        parcel.writeInt(this.status);
        parcel.writeString(this.statusText);
        parcel.writeInt(this.mark);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.user, i);
        Integer num = this.sourceType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.comment);
        Boolean bool = this.canDelete;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isPinned;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canPin;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canUpdate;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeParcelable(this.likes, i);
        parcel.writeParcelable(this.img, i);
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
        MarketReviewCommentsDto marketReviewCommentsDto = this.comments;
        if (marketReviewCommentsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketReviewCommentsDto.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.isFriend;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
    }

    public /* synthetic */ MarketCommunityReviewDto(int i, UserId userId, int i2, String str, int i3, int i4, UsersUserDto usersUserDto, Integer num, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, BaseLikesDto baseLikesDto, BaseImageDto baseImageDto, List list, MarketReviewCommentsDto marketReviewCommentsDto, Boolean bool5, int i5, zcl zclVar) {
        this(i, userId, i2, str, i3, i4, usersUserDto, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? null : str2, (i5 & 512) != 0 ? null : str3, (i5 & 1024) != 0 ? null : bool, (i5 & 2048) != 0 ? null : bool2, (i5 & 4096) != 0 ? null : bool3, (i5 & 8192) != 0 ? null : bool4, (i5 & 16384) != 0 ? null : baseLikesDto, (32768 & i5) != 0 ? null : baseImageDto, (65536 & i5) != 0 ? null : list, (131072 & i5) != 0 ? null : marketReviewCommentsDto, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool5);
    }
}

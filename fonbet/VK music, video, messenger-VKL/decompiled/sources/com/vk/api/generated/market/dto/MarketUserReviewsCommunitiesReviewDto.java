package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketUserReviewsCommunitiesReviewDto.kt */
/* loaded from: classes15.dex */
public final class MarketUserReviewsCommunitiesReviewDto implements Parcelable {
    public static final Parcelable.Creator<MarketUserReviewsCommunitiesReviewDto> CREATOR = new a();

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_update")
    private final Boolean canUpdate;

    @pmi0("comment")
    private final String comment;

    @pmi0("community_id")
    private final int communityId;

    @pmi0("date")
    private final int date;

    @pmi0("id")
    private final int id;

    @pmi0("img")
    private final BaseImageDto img;

    @pmi0("mark")
    private final int mark;

    @pmi0("name")
    private final String name;

    @pmi0("status")
    private final int status;

    @pmi0("status_text")
    private final String statusText;

    @pmi0("thumb")
    private final List<List<BaseImageDto>> thumb;

    @pmi0("user")
    private final UsersUserDto user;

    /* compiled from: MarketUserReviewsCommunitiesReviewDto.kt */
    public static final class a implements Parcelable.Creator<MarketUserReviewsCommunitiesReviewDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsCommunitiesReviewDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            int i;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            UsersUserDto usersUserDto = (UsersUserDto) parcel.readParcelable(MarketUserReviewsCommunitiesReviewDto.class.getClassLoader());
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
            BaseImageDto baseImageDto = (BaseImageDto) parcel.readParcelable(MarketUserReviewsCommunitiesReviewDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                i = readInt;
                arrayList = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt6);
                i = readInt;
                int i2 = 0;
                while (i2 != readInt6) {
                    int i3 = i2;
                    int readInt7 = parcel.readInt();
                    int i4 = readInt2;
                    ArrayList arrayList3 = new ArrayList(readInt7);
                    String str = readString;
                    int i5 = 0;
                    while (i5 != readInt7) {
                        i5 = bo.b(MarketUserReviewsCommunitiesReviewDto.class, parcel, arrayList3, i5, 1);
                        readInt7 = readInt7;
                    }
                    arrayList2.add(arrayList3);
                    i2 = i3 + 1;
                    readInt2 = i4;
                    readString = str;
                }
                arrayList = arrayList2;
            }
            return new MarketUserReviewsCommunitiesReviewDto(i, readInt2, readString, readInt3, readString2, readInt4, readInt5, usersUserDto, readString3, valueOf, valueOf2, baseImageDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsCommunitiesReviewDto[] newArray(int i) {
            return new MarketUserReviewsCommunitiesReviewDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketUserReviewsCommunitiesReviewDto(int i, int i2, String str, int i3, String str2, int i4, int i5, UsersUserDto usersUserDto, String str3, Boolean bool, Boolean bool2, BaseImageDto baseImageDto, List<? extends List<BaseImageDto>> list) {
        this.id = i;
        this.communityId = i2;
        this.name = str;
        this.status = i3;
        this.statusText = str2;
        this.mark = i4;
        this.date = i5;
        this.user = usersUserDto;
        this.comment = str3;
        this.canDelete = bool;
        this.canUpdate = bool2;
        this.img = baseImageDto;
        this.thumb = list;
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
        if (!(obj instanceof MarketUserReviewsCommunitiesReviewDto)) {
            return false;
        }
        MarketUserReviewsCommunitiesReviewDto marketUserReviewsCommunitiesReviewDto = (MarketUserReviewsCommunitiesReviewDto) obj;
        return this.id == marketUserReviewsCommunitiesReviewDto.id && this.communityId == marketUserReviewsCommunitiesReviewDto.communityId && epx.f(this.name, marketUserReviewsCommunitiesReviewDto.name) && this.status == marketUserReviewsCommunitiesReviewDto.status && epx.f(this.statusText, marketUserReviewsCommunitiesReviewDto.statusText) && this.mark == marketUserReviewsCommunitiesReviewDto.mark && this.date == marketUserReviewsCommunitiesReviewDto.date && epx.f(this.user, marketUserReviewsCommunitiesReviewDto.user) && epx.f(this.comment, marketUserReviewsCommunitiesReviewDto.comment) && epx.f(this.canDelete, marketUserReviewsCommunitiesReviewDto.canDelete) && epx.f(this.canUpdate, marketUserReviewsCommunitiesReviewDto.canUpdate) && epx.f(this.img, marketUserReviewsCommunitiesReviewDto.img) && epx.f(this.thumb, marketUserReviewsCommunitiesReviewDto.thumb);
    }

    public final String f() {
        return this.comment;
    }

    public final int g() {
        return this.communityId;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.user.hashCode() + shy.a(this.date, shy.a(this.mark, urd0.a(shy.a(this.status, urd0.a(shy.a(this.communityId, Integer.hashCode(this.id) * 31, 31), 31, this.name), 31), 31, this.statusText), 31), 31)) * 31;
        String str = this.comment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.canDelete;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canUpdate;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BaseImageDto baseImageDto = this.img;
        int hashCode5 = (hashCode4 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.thumb;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final int i() {
        return this.date;
    }

    public final BaseImageDto j() {
        return this.img;
    }

    public final int k() {
        return this.mark;
    }

    public final String l() {
        return this.name;
    }

    public final int n() {
        return this.status;
    }

    public final String o() {
        return this.statusText;
    }

    public final List<List<BaseImageDto>> p() {
        return this.thumb;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketUserReviewsCommunitiesReviewDto(id=");
        sb.append(this.id);
        sb.append(", communityId=");
        sb.append(this.communityId);
        sb.append(", name=");
        sb.append(this.name);
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
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", canUpdate=");
        sb.append(this.canUpdate);
        sb.append(", img=");
        sb.append(this.img);
        sb.append(", thumb=");
        return ms9.a(')', sb, this.thumb);
    }

    public final UsersUserDto u() {
        return this.user;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.communityId);
        parcel.writeString(this.name);
        parcel.writeInt(this.status);
        parcel.writeString(this.statusText);
        parcel.writeInt(this.mark);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.user, i);
        parcel.writeString(this.comment);
        Boolean bool = this.canDelete;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canUpdate;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.img, i);
        List<List<BaseImageDto>> list = this.thumb;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            Iterator a2 = ao.a(parcel, (List) f.next());
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    public /* synthetic */ MarketUserReviewsCommunitiesReviewDto(int i, int i2, String str, int i3, String str2, int i4, int i5, UsersUserDto usersUserDto, String str3, Boolean bool, Boolean bool2, BaseImageDto baseImageDto, List list, int i6, zcl zclVar) {
        this(i, i2, str, i3, str2, i4, i5, usersUserDto, (i6 & 256) != 0 ? null : str3, (i6 & 512) != 0 ? null : bool, (i6 & 1024) != 0 ? null : bool2, (i6 & 2048) != 0 ? null : baseImageDto, (i6 & 4096) != 0 ? null : list);
    }
}

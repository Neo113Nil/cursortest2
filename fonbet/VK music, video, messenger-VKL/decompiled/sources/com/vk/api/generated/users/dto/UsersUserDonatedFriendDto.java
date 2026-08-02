package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.eok;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: UsersUserDonatedFriendDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserDonatedFriendDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserDonatedFriendDto> CREATOR = new a();

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("friend_status")
    private final FriendsFriendStatusStatusDto friendStatus;

    @pmi0("hidden")
    private final Integer hidden;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_cached")
    private final Boolean isCached;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("last_name")
    private final String lastName;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    private final BaseBoolIntDto online;

    @pmi0("online_app")
    private final Integer onlineApp;

    @pmi0("online_mobile")
    private final BaseBoolIntDto onlineMobile;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("sex")
    private final BaseSexDto sex;

    @pmi0("trending")
    private final BaseBoolIntDto trending;

    @pmi0("verified")
    private final BaseBoolIntDto verified;

    /* compiled from: UsersUserDonatedFriendDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserDonatedFriendDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserDonatedFriendDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            UserId userId = (UserId) parcel.readParcelable(UsersUserDonatedFriendDto.class.getClassLoader());
            BaseSexDto createFromParcel = parcel.readInt() == 0 ? null : BaseSexDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            BaseBoolIntDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel3 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto createFromParcel4 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel5 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            FriendsFriendStatusStatusDto createFromParcel6 = parcel.readInt() == 0 ? null : FriendsFriendStatusStatusDto.CREATOR.createFromParcel(parcel);
            Boolean bool = null;
            Integer num = valueOf3;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UsersUserDonatedFriendDto(userId, createFromParcel, readString, readString2, readString3, readString4, readString5, createFromParcel2, createFromParcel3, num, createFromParcel4, createFromParcel5, createFromParcel6, readString6, readString7, valueOf4, readString8, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserDonatedFriendDto[] newArray(int i) {
            return new UsersUserDonatedFriendDto[i];
        }
    }

    public UsersUserDonatedFriendDto(UserId userId, BaseSexDto baseSexDto, String str, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, String str6, String str7, Integer num2, String str8, Boolean bool, Boolean bool2, Boolean bool3) {
        this.id = userId;
        this.sex = baseSexDto;
        this.screenName = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.photo200 = str4;
        this.photoBase = str5;
        this.online = baseBoolIntDto;
        this.onlineMobile = baseBoolIntDto2;
        this.onlineApp = num;
        this.verified = baseBoolIntDto3;
        this.trending = baseBoolIntDto4;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.deactivated = str6;
        this.firstName = str7;
        this.hidden = num2;
        this.lastName = str8;
        this.canAccessClosed = bool;
        this.isClosed = bool2;
        this.isCached = bool3;
    }

    public final BaseSexDto B() {
        return this.sex;
    }

    public final BaseBoolIntDto C() {
        return this.trending;
    }

    public final BaseBoolIntDto D() {
        return this.verified;
    }

    public final Boolean F() {
        return this.isClosed;
    }

    public final String d() {
        return this.deactivated;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.firstName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserDonatedFriendDto)) {
            return false;
        }
        UsersUserDonatedFriendDto usersUserDonatedFriendDto = (UsersUserDonatedFriendDto) obj;
        return epx.f(this.id, usersUserDonatedFriendDto.id) && this.sex == usersUserDonatedFriendDto.sex && epx.f(this.screenName, usersUserDonatedFriendDto.screenName) && epx.f(this.photo50, usersUserDonatedFriendDto.photo50) && epx.f(this.photo100, usersUserDonatedFriendDto.photo100) && epx.f(this.photo200, usersUserDonatedFriendDto.photo200) && epx.f(this.photoBase, usersUserDonatedFriendDto.photoBase) && this.online == usersUserDonatedFriendDto.online && this.onlineMobile == usersUserDonatedFriendDto.onlineMobile && epx.f(this.onlineApp, usersUserDonatedFriendDto.onlineApp) && this.verified == usersUserDonatedFriendDto.verified && this.trending == usersUserDonatedFriendDto.trending && this.friendStatus == usersUserDonatedFriendDto.friendStatus && epx.f(this.deactivated, usersUserDonatedFriendDto.deactivated) && epx.f(this.firstName, usersUserDonatedFriendDto.firstName) && epx.f(this.hidden, usersUserDonatedFriendDto.hidden) && epx.f(this.lastName, usersUserDonatedFriendDto.lastName) && epx.f(this.canAccessClosed, usersUserDonatedFriendDto.canAccessClosed) && epx.f(this.isClosed, usersUserDonatedFriendDto.isClosed) && epx.f(this.isCached, usersUserDonatedFriendDto.isCached);
    }

    public final FriendsFriendStatusStatusDto f() {
        return this.friendStatus;
    }

    public final UserId g() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode2 = (hashCode + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str = this.screenName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo50;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo100;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo200;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photoBase;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.online;
        int hashCode8 = (hashCode7 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.onlineMobile;
        int hashCode9 = (hashCode8 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        Integer num = this.onlineApp;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.verified;
        int hashCode11 = (hashCode10 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.trending;
        int hashCode12 = (hashCode11 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode13 = (hashCode12 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        String str6 = this.deactivated;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstName;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.hidden;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.lastName;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.canAccessClosed;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCached;
        return hashCode19 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String i() {
        return this.lastName;
    }

    public final BaseBoolIntDto j() {
        return this.online;
    }

    public final Integer k() {
        return this.onlineApp;
    }

    public final BaseBoolIntDto l() {
        return this.onlineMobile;
    }

    public final String n() {
        return this.photo100;
    }

    public final String o() {
        return this.photo200;
    }

    public final String p() {
        return this.photo50;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersUserDonatedFriendDto(id=");
        sb.append(this.id);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", online=");
        sb.append(this.online);
        sb.append(", onlineMobile=");
        sb.append(this.onlineMobile);
        sb.append(", onlineApp=");
        sb.append(this.onlineApp);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", trending=");
        sb.append(this.trending);
        sb.append(", friendStatus=");
        sb.append(this.friendStatus);
        sb.append(", deactivated=");
        sb.append(this.deactivated);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", canAccessClosed=");
        sb.append(this.canAccessClosed);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", isCached=");
        return tn.a(sb, this.isCached, ')');
    }

    public final String u() {
        return this.photoBase;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        BaseSexDto baseSexDto = this.sex;
        if (baseSexDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseSexDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.screenName);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoBase);
        BaseBoolIntDto baseBoolIntDto = this.online;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto2 = this.onlineMobile;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        Integer num = this.onlineApp;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        BaseBoolIntDto baseBoolIntDto3 = this.verified;
        if (baseBoolIntDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto3.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto4 = this.trending;
        if (baseBoolIntDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto4.writeToParcel(parcel, i);
        }
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        if (friendsFriendStatusStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsFriendStatusStatusDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.deactivated);
        parcel.writeString(this.firstName);
        Integer num2 = this.hidden;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.lastName);
        Boolean bool = this.canAccessClosed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isClosed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isCached;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ UsersUserDonatedFriendDto(UserId userId, BaseSexDto baseSexDto, String str, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, String str6, String str7, Integer num2, String str8, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : baseSexDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : baseBoolIntDto, (i & 256) != 0 ? null : baseBoolIntDto2, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : baseBoolIntDto3, (i & 2048) != 0 ? null : baseBoolIntDto4, (i & 4096) != 0 ? null : friendsFriendStatusStatusDto, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? null : num2, (i & 65536) != 0 ? null : str8, (i & 131072) != 0 ? null : bool, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool2, (i & 524288) != 0 ? null : bool3);
    }
}

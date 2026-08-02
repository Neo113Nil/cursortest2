package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.eok;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: UsersUserDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserDto> CREATOR = new a();

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

    @pmi0("mutual")
    private final FriendsRequestsMutualDto mutual;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    private final BaseBoolIntDto online;

    @pmi0("online_app")
    private final Integer onlineApp;

    @pmi0("online_info")
    private final UsersOnlineInfoDto onlineInfo;

    @pmi0("online_mobile")
    private final BaseBoolIntDto onlineMobile;

    @pmi0("photo_100")
    private final String photo100;

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

    /* compiled from: UsersUserDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            UserId userId = (UserId) parcel.readParcelable(UsersUserDto.class.getClassLoader());
            BaseSexDto createFromParcel = parcel.readInt() == 0 ? null : BaseSexDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            FriendsRequestsMutualDto friendsRequestsMutualDto = null;
            String readString4 = parcel.readString();
            UsersOnlineInfoDto createFromParcel2 = parcel.readInt() == 0 ? null : UsersOnlineInfoDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel3 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel4 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto createFromParcel5 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel6 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            FriendsFriendStatusStatusDto createFromParcel7 = parcel.readInt() == 0 ? null : FriendsFriendStatusStatusDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                friendsRequestsMutualDto = FriendsRequestsMutualDto.CREATOR.createFromParcel(parcel);
            }
            FriendsRequestsMutualDto friendsRequestsMutualDto2 = friendsRequestsMutualDto;
            String readString5 = parcel.readString();
            Boolean bool = null;
            String readString6 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString7 = parcel.readString();
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
            return new UsersUserDto(userId, createFromParcel, readString, readString2, readString3, readString4, createFromParcel2, createFromParcel3, createFromParcel4, valueOf3, createFromParcel5, createFromParcel6, createFromParcel7, friendsRequestsMutualDto2, readString5, readString6, valueOf4, readString7, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserDto[] newArray(int i) {
            return new UsersUserDto[i];
        }
    }

    public UsersUserDto(UserId userId, BaseSexDto baseSexDto, String str, String str2, String str3, String str4, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str5, String str6, Integer num2, String str7, Boolean bool, Boolean bool2, Boolean bool3) {
        this.id = userId;
        this.sex = baseSexDto;
        this.screenName = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.photoBase = str4;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = baseBoolIntDto;
        this.onlineMobile = baseBoolIntDto2;
        this.onlineApp = num;
        this.verified = baseBoolIntDto3;
        this.trending = baseBoolIntDto4;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.mutual = friendsRequestsMutualDto;
        this.deactivated = str5;
        this.firstName = str6;
        this.hidden = num2;
        this.lastName = str7;
        this.canAccessClosed = bool;
        this.isClosed = bool2;
        this.isCached = bool3;
    }

    public final String B() {
        return this.screenName;
    }

    public final BaseSexDto C() {
        return this.sex;
    }

    public final BaseBoolIntDto D() {
        return this.trending;
    }

    public final BaseBoolIntDto F() {
        return this.verified;
    }

    public final Boolean G() {
        return this.isClosed;
    }

    public final Boolean d() {
        return this.canAccessClosed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.deactivated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserDto)) {
            return false;
        }
        UsersUserDto usersUserDto = (UsersUserDto) obj;
        return epx.f(this.id, usersUserDto.id) && this.sex == usersUserDto.sex && epx.f(this.screenName, usersUserDto.screenName) && epx.f(this.photo50, usersUserDto.photo50) && epx.f(this.photo100, usersUserDto.photo100) && epx.f(this.photoBase, usersUserDto.photoBase) && epx.f(this.onlineInfo, usersUserDto.onlineInfo) && this.online == usersUserDto.online && this.onlineMobile == usersUserDto.onlineMobile && epx.f(this.onlineApp, usersUserDto.onlineApp) && this.verified == usersUserDto.verified && this.trending == usersUserDto.trending && this.friendStatus == usersUserDto.friendStatus && epx.f(this.mutual, usersUserDto.mutual) && epx.f(this.deactivated, usersUserDto.deactivated) && epx.f(this.firstName, usersUserDto.firstName) && epx.f(this.hidden, usersUserDto.hidden) && epx.f(this.lastName, usersUserDto.lastName) && epx.f(this.canAccessClosed, usersUserDto.canAccessClosed) && epx.f(this.isClosed, usersUserDto.isClosed) && epx.f(this.isCached, usersUserDto.isCached);
    }

    public final String f() {
        return this.firstName;
    }

    public final FriendsFriendStatusStatusDto g() {
        return this.friendStatus;
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
        String str4 = this.photoBase;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode7 = (hashCode6 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
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
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode14 = (hashCode13 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        String str5 = this.deactivated;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstName;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.hidden;
        int hashCode17 = (hashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.lastName;
        int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.canAccessClosed;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCached;
        return hashCode20 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Integer i() {
        return this.hidden;
    }

    public final UserId j() {
        return this.id;
    }

    public final String k() {
        return this.lastName;
    }

    public final FriendsRequestsMutualDto l() {
        return this.mutual;
    }

    public final UsersOnlineInfoDto n() {
        return this.onlineInfo;
    }

    public final String o() {
        return this.photo100;
    }

    public final String p() {
        return this.photo50;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersUserDto(id=");
        sb.append(this.id);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", onlineInfo=");
        sb.append(this.onlineInfo);
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
        sb.append(", mutual=");
        sb.append(this.mutual);
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
        parcel.writeString(this.photoBase);
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        if (usersOnlineInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersOnlineInfoDto.writeToParcel(parcel, i);
        }
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
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        if (friendsRequestsMutualDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsRequestsMutualDto.writeToParcel(parcel, i);
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

    public /* synthetic */ UsersUserDto(UserId userId, BaseSexDto baseSexDto, String str, String str2, String str3, String str4, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str5, String str6, Integer num2, String str7, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : baseSexDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : usersOnlineInfoDto, (i & 128) != 0 ? null : baseBoolIntDto, (i & 256) != 0 ? null : baseBoolIntDto2, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : baseBoolIntDto3, (i & 2048) != 0 ? null : baseBoolIntDto4, (i & 4096) != 0 ? null : friendsFriendStatusStatusDto, (i & 8192) != 0 ? null : friendsRequestsMutualDto, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? null : str6, (i & 65536) != 0 ? null : num2, (i & 131072) != 0 ? null : str7, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool, (i & 524288) != 0 ? null : bool2, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool3);
    }
}
